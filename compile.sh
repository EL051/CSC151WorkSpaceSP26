#!/bin/bash
# compile.sh — compile all source files into bin/
# Usage: bash compile.sh

javac -cp junit-platform-console-standalone-1.9.3.jar \
      -d bin \
      src/main/java/*.java src/test/java/LedgerTest.java

if [ $? -eq 0 ]; then
    echo ""
    echo "Compile successful. Run your tests with:  bash test.sh"
    echo "Run the program with:                     bash run.sh"
else
    echo ""
    echo "Compile failed. Fix the errors above and try again."
fi
