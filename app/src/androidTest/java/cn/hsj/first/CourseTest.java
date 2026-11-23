package cn.hsj.first;

import static org.junit.Assert.*;

import android.content.*;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.*;
import org.junit.Test;

public class CourseTest {
  UiDevice d;

  UiObject2 obj(String text) {
    UiObject2 item = d.wait(Until.findObject(By.text(text)), 5000);
    assertNotNull("未找到：" + text, item);
    return item;
  }

  void has(String text) {
    obj(text);
  }

  void hasPart(String part) {
    assertTrue(part, d.wait(Until.hasObject(By.textContains(part)), 5000));
  }

  void click(String s) {
    obj(s).click();
    d.waitForIdle();
  }

  void back() {
    d.pressBack();
    d.waitForIdle();
  }

  void input(int i, String s) {
    d.findObjects(By.clazz("android.widget.EditText")).get(i).setText(s);
    d.waitForIdle();
  }

  @Test
  public void acceptance() throws Exception {
    d = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    Context ctx = InstrumentationRegistry.getInstrumentation().getTargetContext();
    Intent launch = ctx.getPackageManager().getLaunchIntentForPackage(ctx.getPackageName());
    assertNotNull(launch);
    launch.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
    ctx.startActivity(launch);
    d.waitForIdle();
    click("运行检查");
    has("第一个 Android 工程运行成功");
  }
}
