# Day 1

* Done the [Build your first app](https://developer.android.com/training/basics/firstapp/index.html) training

* Struggled hard with the proxy
  * my laptop has global env variables WITH proxy to working with ui5 tools
  * this clashed with GIT
  * i first tried to now run android studio while being logged on to my working net BUT this clashed with gradle build that was not allowed to connect to something
  * solution: a batch file that resets the proxies and runs the studio

    ```
      set HTTP_PROXY=
      set HTTPS_PROXY=
      set NO_PROXY=
      start "path" "C:\Program Files\Android\Android Studio\bin\studio64.exe"
    ```

* Setup the [pp](https://github.com/ThomasMarz/pp) repository
  * create the project via the studio wizards
  * then enable git for the project
  * enable remotes via _VCS > GIT > Remotes ..._