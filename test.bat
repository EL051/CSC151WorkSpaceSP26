@echo off
REM test.bat — run LedgerTest.java with JUnit  (Windows)
REM Usage: double-click or run from Command Prompt  (run compile.bat first)

java -cp "bin;junit-platform-console-standalone-1.9.3.jar" ^
     org.junit.platform.console.ConsoleLauncher ^
     --select-class test.java.LedgerTest
