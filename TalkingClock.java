
package talkingclock;

import java.util.Scanner;


public class TalkingClock {

    public static String leftSide(String str)  {
        
        switch (str) {
            case "00":
                return "twelve";
            case "01":
                return "one";
            case "02":
                return "two";
            case "03":
                return "three";
            case "04":
                return "four";
            case "05":
                return "five";
            case "06":
                return "six";
            case "07":
                return "seven";
            case "08":
                return "eight";
            case "09":
                return "nine";
            case "10":
                return "ten";
            case "11":
                return "eleven";
            case "12": 
                return "twelve";
            case "13": 
                return "one"; 
            case "14":
                return "two";
            case "15": 
                return "three"; 
            case "16": 
                return "four"; 
            case "17": 
                return "five"; 
            case "18": 
                return "six"; 
            case "19": 
                return "seven"; 
            case "20": 
                return "eight";
            case "21": 
                return "nine"; 
            case "22": 
                return "ten";
            case "23": 
                return "eleven";           
            default:
                return "oh";       
        }
        
    }
    
    public static String tens(char r)    {
        
        switch (r)  {
            case '0':
                return "oh";
            
            case '2': 
                return "twenty";
            case '3': 
                return "thirty"; 
            case '4': 
                return "forty";
            case '5': 
                return "fifty";
            default: 
                return "";
                
        }
        
    }
        
    
     public static String ones(char r2)    {
        
        switch (r2)  {
            case '0':
                return "";
            case '1':
                return "one";
            case '2': 
                return "two";
            case '3': 
                return "three"; 
            case '4': 
                return "four";
            case '5': 
                return "five";
            case '6':
                return "six"; 
            case '7': 
                return "seven"; 
            case '8': 
                return "eight"; 
            case '9': 
                return "nine";
            default: 
                return "";
                
        }
        
    }
     
     public static String specialCases(String sc)   {
        
           switch (sc) {
            case "11":
                return "eleven";
            case "12":
                return "twelve";
            case "00":
                return "";
            case "13":
                return "thirteen";
            case "14": 
                return "forteen";
            case "15": 
                return "fiftteen";
            case "16": 
                return "sixteen";
            case "17":
                return "seventeen"; 
            case "18": 
                return "eighteen"; 
            case "19": 
                return "nineteen";
            case "10":
                return "ten";
            default:
                return "";
        }
         
     }
    
    
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter a time in 00 : 00 format: ");
        String left = input.next(); 
        String colon = input.next();
        String right = input.next();
        char right1 = right.charAt(0);
        char right2 = right.charAt(1);
        //System.out.println(right1);
        //System.out.println(right2);
        System.out.println(left +  colon + right1 + right2 );
       
        
        if ( right.equals("11") || right.equals("12") || right.equals("00") || right.equals("13") || right.equals("14") || right.equals("15") || right.equals("16") || right.equals("17") || right.equals("18") || right.equals("19") || right.equals("10") ) {
            System.out.print("It's " + leftSide(left) + " " + specialCases(right));
        }   else    {
            System.out.print("It's " + leftSide(left) + " " + tens(right1) + " " + ones(right2) + " "  );
        }
       
        if ( Integer.parseInt(left) < 12 || Integer.parseInt(left) == 00 )  {
            System.out.print("am.");
        }   else    {
            System.out.print("pm.");
        }
        
        System.out.println("");
        
       // System.out.println("It's " + leftSide(left) + "-" + tens(right1) + "-" + ones(right2)  );
        
    }
    
}
