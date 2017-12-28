# 28.12.2017

* Done the [Build your first app](https://developer.android.com/training/basics/firstapp/index.html) training

* Struggled hard with the proxy
  * my laptop has global env variables WITH proxy to working with ui5 tools ... this clashed with GIT
  * i first tried to now run android studio while being logged on to my work net BUT this clashed with gradle build that was not allowed to connect to something
  * solution: a batch file that resets the proxies and runs the studio
    ```text
      set HTTP_PROXY=
      set HTTPS_PROXY=
      set NO_PROXY=
      start "path" "C:\Program Files\Android\Android Studio\bin\studio64.exe"
    ```

* Setup the [pp](https://github.com/ThomasMarz/pp) repository
  * create the project via the studio wizards
  * then enable git for the project via _VCS > Import Into Version Control > Create GIT Repository_
  * enable remotes via _VCS > GIT > Remotes ..._

* Done the [App Bar Training](https://developer.android.com/training/appbar/index.html)
  * ActionBar is the native app but for compat. reason you work with the toolbar of the v7 support lib

* Done the [Snackbar Training]()
  * First encounter with the [Support Library Packages](https://developer.android.com/topic/libraries/support-library/packages.html#design)
  * The designer tools showed only blank screen after switching to the CoordinatorLayout => solution: switch to Pixel XL device (WTF?)