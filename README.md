# 实验 1 · Android 开发基础

本实验是一个最小的原生 Android 应用。进入首页显示 Hello, Android!，点“运行检查”后文案变为“第一个 Android 工程运行成功”。

## 运行

在 Android Studio 中打开本仓库根目录，使用 JDK 17、Android SDK Platform 35 和 Build Tools 34.0.0。选择 API 26 或更高版本的设备，等待 Gradle 同步后运行 app。Windows 命令行也可在仓库根目录执行：

```powershell
.\gradlew.bat assembleDebug
.\gradlew.bat installDebug
```

第一条只构建，第二条需要已连接且获授权的设备或启动的模拟器。仓库只跟踪源码、资源与构建配置，不提交本机 SDK、缓存、密钥或 APK。

## 工程与同步

- 入口：`app/src/main/java/cn/hsj/first/Main.java`；启动注册见 `app/src/main/AndroidManifest.xml`。
- 在 Android Studio 的 Git 菜单检查当前账号，选择分享项目到个人 GitHub 仓库。发布后，从浏览器打开仓库并确认能看到 app、gradle 和 README，而不只是空仓库。
- 参考：[Android 开发基础](https://developer.android.google.cn/guide/components/fundamentals.html)、[课程开发环境说明](https://blog.csdn.net/fjnu_se/article/details/53734874)。
