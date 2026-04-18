# Assignment 3 — The Ledger

Read **A3_CollectionsAndTesting.pdf** before opening any Java file.

---

## Quick start

### Eclipse (recommended)

1. **File → Open Projects from File System…**
2. Click **Directory**, select this folder, click **Finish**.
3. Eclipse will detect the `.project` and `.classpath` files automatically —
   JUnit is already configured, no manual build path setup needed.
4. Copy your `Account.java` from Assignment 2 into `src/main/java/`.
5. Right-click `LedgerTest.java` → **Run As → JUnit Test** to run your tests.
6. Right-click `Main.java` → **Run As → Java Application** to run the program.

### Command line (Mac / Linux)

```
bash compile.sh   # compile everything
bash test.sh      # run LedgerTest
bash run.sh       # run Main
```

### Command line (Windows)

```
compile.bat
test.bat
run.bat
```

---

## File structure

```
assignment3-jdoe/
├── src/
│   ├── main/java/
│   │   ├── Account.java     ← PASTE your Assignment 2 code here
│   │   ├── Ledger.java      ← YOU implement this
│   │   └── Main.java        ← YOU implement this
│   └── test/java/
│       └── LedgerTest.java  ← YOU write the 4 required tests
│
├── junit-platform-console-standalone-1.9.3.jar   ← already here
├── A3_CollectionsAndTesting.pdf                  ← assignment spec
├── compile.sh / compile.bat
├── test.sh    / test.bat
└── run.sh     / run.bat
```

---

## Submission

Submit a **zip of this entire folder** to Blackboard.
Git push is for backup only — it does not count as your submission.
