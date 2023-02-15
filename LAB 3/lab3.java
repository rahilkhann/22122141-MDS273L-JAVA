import java.util.*;
public class lab3 {
    //USER DEFINED FUNCTION OF FINDING THE MEAN OF ELEMENTS IN AN ARRAY
    static float meanfunction(int[] numbers){
        int sum = 0;
        float mean;
        float size = numbers.length;
        for(int i = 0; i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        mean = sum/size;
        return mean;
    }
    //USER DEFINED FUNCTION OF FINDING THE MEDIAN OF ELEMENTS IN AN ARRAY
    static float medianfunction(int[] numbers){
        float median = 0;
        // First FOR loop, for sorting the list in ascending order
        // Iterating through the indices of the list
        for(int i = 0; i<numbers.length; i++){
            //Another loop that iterates through every next elelment
            for(int j = i+1; j<numbers.length; j++){
                //A temporary value is initialized
                int temp = 0;

                //if the prior number is greater than the later one, then their positions are swapped
                if(numbers[i]>numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
        //Second FOR loop for finding the mean
        for(int count = 0; count<numbers.length; count++){

            //If the number of elements in the array are even, then, the formula of median is given by:
            // median = (n/2 th element + n/2+1 th element)/2
            if(numbers.length%2==0){
                median = (numbers[(count/2)] + numbers[(count/2)+1])/2;
            }
            //If the number of elements in the array are odd, then, the formula of median is given by:
            //median = (n+1)/2 th element
            else{
                median = numbers[(count+1)/2];
            }
        }
        return median;
        }

    static int modefunction(int[] numbers){
        // First FOR loop, for sorting the list in ascending order
        // Iterating through the indices of the list
        for(int i = 0; i<numbers.length; i++){
            //Another loop that iterates through every next elelment
            for(int j = i+1; j<numbers.length; j++){
                //A temporary value is initialized
                int temp = 0;

                //if the prior number is greater than the later one, then their positions are swapped
                if(numbers[i]>numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }

        //Now, we initialize some variables
		int mode=0, count=0, maxCount=0;
		//We shall first iterate through all the values
		for(int i=0;i<numbers.length;i++) {
			count = 0;
            //Now, for each value, we shall check values corresponding to it
			for(int j=0;j<numbers.length;j++) {
				if(numbers[i] == numbers[j]) {
                    //The count increases each time we find a value equal to the i value currently
					count++;
				}
			}

            //We then change the value of maximum count to COUNT if it is greater than the last value
			if (count > maxCount) {
	                    maxCount = count;
	                    mode = numbers[i];
	               }

		}
        if (maxCount == 1){
            System.out.println("The mode does not exist for this data!");
        }

        return mode;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("+===========================================================+");
        System.out.println("|                 MEAN MEDIAN MODE CALCULATOR               |");
        System.out.println("+===========================================================+");
        System.out.print("||Enter the number of values you want to find the mean of: ");
        int arraylength = scan.nextInt();
        int[] numbers = new int[arraylength];
        for(int i = 0; i<arraylength; i++){
            System.out.print("||Enter the "+(i+1)+" th value of the array: ");
            System.out.print(" ");
            numbers[i] = scan.nextInt(); 
        }



        float mean = meanfunction(numbers);
        System.out.println("+==============================+");
        System.out.println("||The mean of the values is: "+mean);

        float median = medianfunction(numbers);
        System.out.println("||The median of the values is : "+median);
        System.out.println("+==============================+");
        float mode = modefunction(numbers);
        System.out.println("||The mode of the values is : "+mode);
        System.out.println("+==============================+");
    }
}