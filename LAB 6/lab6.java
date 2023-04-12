import java.io.*;
import java.util.*;
public class lab6{

    static int[] vowelcount(String word){
        
        int counta = 0;
        int counte = 0;
        int counti = 0;
        int counto = 0;
        int countu = 0;
        int[] vowels = new int[5];
        word = word.toLowerCase();
        for(int i = 0; i<word.length(); i++){
           char a = word.charAt(i);
            switch (a){
                case 'a':
                    counta++;
                    break;
                case 'e':
                    counte++;
                    break;
                case 'i':
                    counti++;
                    break;
                case 'o':
                    counto++;
                    break;
                case 'u':
                    countu++;
                    break;
            }
        }
        vowels[0] = counta;
        vowels[1] = counte;
        vowels[2] = counti;
        vowels[3] = counto;
        vowels[4] = countu;
        return vowels;
    }


    static int[] numbercount(String word){
        
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int[] digits = new int[10];
        word = word.toLowerCase();
        for(int i = 0; i<word.length(); i++){
           char a = word.charAt(i);
            switch (a){
                case '0':
                    count0++;
                    break;
                case '1':
                    count1++;
                    break;
                case '2':
                    count2++;
                    break;
                case '3':
                    count3++;
                    break;
                case '4':
                    count4++;
                    break;
                case '5':
                    count5++;
                    break;
                    case '6':
                    count6++;
                    break;
                    case '7':
                    count7++;
                    break;
                    case '8':
                    count8++;
                    break;
                    case '9':
                    count9++;
                    break;
            }
        }
        digits[0] = count0;
        digits[1] = count1;
        digits[2] = count2;
        digits[3] = count3;
        digits[4] = count4;
        digits[5] = count5;
        digits[6] = count6;
        digits[7] = count7;
        digits[8] = count8;
        digits[9] = count9;
        return digits;
    }

    static String[] topfivewords(String[] alltext){
        String[] words = new String[5];
        int compare = 0;
        int temp = 0;
        for(int i = 0; i<alltext.length;i++){
            if(alltext[i].equals(alltext[i+1])){
                compare+=1;
                if(compare>temp){
                    
                }

            }
        

        }
        return words;
    }




    public static void main(String[] args) {
        try{
            File file = new File("sampletext.txt");
            Scanner scan = new Scanner(file);
            String alltext = scan.nextLine();  
            int[] vowels = new int[5];
            vowels = vowelcount(alltext);
            System.out.print("The number of each vowels present are as follows: [");
            for(int i=0; i<vowels.length;i++){
                System.out.print(vowels[i]+",");
            }
            System.out.print("]");
            System.out.println();

            int[] digits = new int[10];
            digits = numbercount(alltext);
            System.out.print("The number of count of each digit is: [");
            for(int i = 0; i<10; i++){
                System.out.print(digits[i]+", ");
            }
            System.out.print("]");            


        }catch(Exception exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}