# Read Bin File Project

### Description

This Program:

1. Reads the name of a file containing 16-bit integers from the keyboard. 
2. Open the file as a binary file.
3. Read a 16-bit number from the file 
4. Display the number on one line as:
   1. A 16-bit binary number (16 bits must be printed-- i.e., include all the leading zeros)
   2.  A 4-digit hexadecimal number  (all 4digitsmust be printed -- include leading zeros)
   3. The 5-bit unsigned base-10 integer extracted from bits 15-11 of the number
   4. The 1-bit value extracted from bit 10 of thenumber
   5. The 2-bit unsigned base-10 integer extracted from bits 9-8 of the number
   6. The 8-bit unsigned base-10 integer extracted from bits 7-0 of the number
5. Repeat from step 3 until the end-of-file has been reached
6. Close the input file

### To Run

Using terminal on Mac:

```
$ cd Read-Bin-File
$ javac ReadBin.java
$ java ReadBin
```

### Output

After reading the Numbers.dat file the output loos like this, 

![output](https://github.com/azamzow/Read-Bin-File/blob/master/output.png?raw=true)
