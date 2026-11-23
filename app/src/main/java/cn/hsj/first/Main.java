package cn.hsj.first;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class Main extends Activity {
  @Override
  public void onCreate(Bundle state) {
    super.onCreate(state);
    LinearLayout box = new LinearLayout(this);
    box.setOrientation(1);
    box.setGravity(17);
    setContentView(box);
    TextView greeting = new TextView(this);
    greeting.setTextSize(24);
    greeting.setText("Hello, Android!");
    box.addView(greeting);
    Button button = new Button(this);
    button.setText("运行检查");
    box.addView(button);
    button.setOnClickListener(v -> greeting.setText("第一个 Android 工程运行成功"));
  }
}
