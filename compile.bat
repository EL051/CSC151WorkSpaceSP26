@echo off
REM compile.bat — compile all source files into bin\  (Windows)
REM Usage: double-click or run from Command Prompt

javac -cp junit-platform-console-standalone-1.9.3.jar ^
      -d bin ^
      src\main\java\*.java src\test\java\LedgerTest.java

IF %ERRORLEVEL% EQU 0 (
    echo.
    echo Compile successful. Run your tests with:  test.bat
    echo Run the program with:                     run.bat
) ELSE (
    echo.
    echo Compile failed. Fix the errors above and try again.
)
