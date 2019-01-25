# gradle-multi-app
A sample of releasing multiple applications from a single code base with gradle flavors.

## Overview
This is an example of usage multi dimensional flavors to share the code between multiple apps.

The project created to demonstrate the issue of AndroidStudio with the latest version of gradle with such project layout.

It hosts 3 different sample apps: `app1`, `app2`, `app3`
every app has a single flavor of app dimension it acts as a selector for component modules.
Also, the app has multiple dimensions of the `mode` flavor as every app might be released to different user rings and market and we might have a different configuration for some of those.

Every component might have sources/resources for any of the `app` flavors in the sake of effective code sharing between the apps - see `component.gradle`

## Building the apps
To build the app1 run `./gradlew installApp1DevDebug` command in command line.
You could build app2 or app3 by replacing the App1 with the corresponding name in the command above.

## The problem
Unfortunately, the Android Studio doesn't work correctly in the given model if gradle 5+ is used.
To reproduce the issue switch to the branch  `sergeyd/gradle-5-bug` branch and re-sync the project.
Android Studio will fail to build the project with following error:
```
Cause: org.jetbrains.plugins.gradle.tooling.util.ModuleComponentIdentifierImpl.getModuleIdentifier()Lorg/gradle/api/artifacts/ModuleIdentifier;
```

Also, Android Studio isn't able to build the project while it could be built from the command line.