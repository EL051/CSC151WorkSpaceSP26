#!/bin/bash
# test.sh — run LedgerTest.java with JUnit
# Usage: bash test.sh   (run compile.sh first)

java -cp "bin:junit-platform-console-standalone-1.9.3.jar" \
     org.junit.platform.console.ConsoleLauncher \
     --select-class test.java.LedgerTest
