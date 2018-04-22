import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class ReadBin {
    public static void main(String[] args) throws IOException {
        short number;
        String numBin = "";
        int num4 = 0;
        int num5 = 0;
        int num1 = 0;
        int num2 = 0;
        int num8 = 0;
        boolean endOfFile = false;
        int power;
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type Filename Here: \n");
        String file = keyboard.next();
        // String file = "Numbers.dat";
        FileInputStream fstream = new FileInputStream(file);
        DataInputStream inputFile = new DataInputStream(fstream);
        
        // System.out.println();
        System.out.println("  Reading numbers from the file:");
        System.out.println("  16-bit Binary       4-digit hex   5-bit unsigned    1-bit      2-bit unsigned      8-bit unsigned");
        while (!endOfFile) {
            try {
                number = inputFile.readShort();//short is 16 bit
                numBin = Integer.toBinaryString(0xFFFF & number);
                
                while(numBin.length() != 16) {
                    numBin = "0" + numBin;
                }
                
                power = 7;   //
                for (int i = 8; i <= 15; i++) {  //
                    if (numBin.charAt(i) == '1') {
                        num8 = num8 + (int)Math.pow(2, power);
                    }
                    power--;
                }
                
                power = 4; // add the leading zeroes so that they're the same thing.
                for (int i=0; i<=4; i++) {
                    if(numBin.charAt(i)=='1') {
                        num5 = num5 + (int)Math.pow(2, power);
                    }
                    power--;
                }
                
                power = 1;   //
                for (int i = 5; i <= 5; i++) {  //
                    if (numBin.charAt(i) == '1') {
                        num1 = num1 + (int)Math.pow(2, power);
                    }
                    power--;
                }
                
                power = 2;   //
                for (int i = 6; i <= 7; i++) {  //
                    if (numBin.charAt(i) == '1') {
                        num2 = num2 + (int)Math.pow(2, power);
                    }
                    power--;
                }
                
                
                System.out.printf(numBin+"\t"+"%04x \t\t"+num5+"\t\t"+num1+"\t\t"+num2+"\t\t"+num8+"\n",number);
                num5 = 0;
                num1 = 0;
                num2 = 0;
                num8 = 0;
                
                
            } catch (Exception ex) {
                System.out.println("");
                endOfFile = true;
            }
        }
        inputFile.close();
        
    }
}


