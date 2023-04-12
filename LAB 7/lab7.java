import java.util.Arrays;
import java.util.*;
import java.io.*;
public class lab7{

    public static float mean(float[] data){
        float sum = 0;
        for(int i = 0; i<data.length; i++){
            sum = sum+data[i];
        }
        float mean = sum/(data.length);
        return mean;
    }

    public static float median(float[] data){
        float[] newdata = data;
        Arrays.sort(newdata);
        float num1 = newdata[data.length/2];
        float num2 = newdata[(data.length/2)+1];
        float median = (num1 + num2)/2 ;
        return median;
    }

    static float mode(float data[]) {
        float maxValue = 0;
        int maxCount = 0, i, j;
  
        for (i = 0; i < data.length; ++i) {
           int count = 0;
           for (j = 0; j < data.length; ++j) {
              if (data[j] == data[i])
              ++count;
           }
  
           if (count > maxCount) {
              maxCount = count;
              maxValue = data[i];
           }
        }
        return maxValue;
     }


    static float maximum(float[] data){
        float max = 0;
        for(int i = 0; i<data.length;i++){
            if(data[i]>max){
                max = data[i];
            }
        }
        return max;
    }

    static float minimum(float[] data){
        float min = mean(data);
        for(int i = 0; i<data.length; i++){
            if(data[i]<min){
                min = data[i];
            }
        }
        return min;
    }


    public static void main(String[] args){
        float[] sepallength = new float[150];
        float[] sepalwidth = new float[150];
        float[] petallength = new float[150];
        float[] petalwidth = new float[150];

        try{
            File file = new File("Iris.csv");
            Scanner scan = new Scanner(file);
            int i = 0;
            while(scan.hasNextLine()){
                String temp = scan.nextLine();
                String[] arr = temp.split(",");
                sepallength[i] =Float.parseFloat(arr[1]);
                sepalwidth[i] =Float.parseFloat(arr[2]);
                petallength[i] =Float.parseFloat(arr[3]);
                petalwidth[i] =Float.parseFloat(arr[4]);
                i++;
            }
            System.out.println("======================================================================");
            System.out.println("                       FIVE NUMBER SUMMARY                         ");
            System.out.println("======================================================================");
            System.out.println("NAME            MEAN       MEDIAN       MODE      MINIMUM      MAXIMUM  ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+mean(sepallength)+"      "+median(sepallength)+"        "+mode(sepallength)+"         "+minimum(sepallength)+"           "+maximum(sepallength));
            System.out.println("Sepal Width   "+mean(sepalwidth)+"          "+median(sepalwidth)+"        "+mode(sepalwidth)+"         "+minimum(sepalwidth)+"           "+maximum(sepalwidth));
            System.out.println("Petal Length  "+mean(petallength)+"      "+median(petallength)+"        "+mode(petallength)+"         "+minimum(petallength)+"           "+maximum(petallength));
            System.out.println("Petal Width   "+mean(petalwidth)+"      "+median(petalwidth)+"        "+mode(petalwidth)+"         "+minimum(petalwidth)+"           "+maximum(petalwidth));

            float[] setosa_s_length = new float[50];
            float[] setosa_s_width = new float[50];
            float[] setosa_p_length = new float[50];
            float[] setosa_p_width = new float[50];

            for(int k = 0;i<50;i++){
                setosa_s_length[k] = sepallength[k];
                setosa_s_width[k] = sepalwidth[k];
                setosa_p_length[k] = petallength[k];
                setosa_p_width[k] = petalwidth[k]; 
            }

            System.out.println("======================================================================");
            System.out.println("                       FIVE NUMBER SUMMARY(SETOSA)                         ");
            System.out.println("======================================================================");
            System.out.println("NAME            MEAN       MEDIAN       MODE      MINIMUM      MAXIMUM  ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+mean(setosa_s_length)+"      "+median(setosa_s_length)+"        "+mode(setosa_s_length)+"         "+minimum(setosa_s_length)+"           "+maximum(setosa_s_length));
            System.out.println("Sepal Width   "+mean(setosa_s_width)+"          "+median(setosa_s_width)+"        "+mode(setosa_s_width)+"         "+minimum(setosa_s_width)+"           "+maximum(setosa_s_width));
            System.out.println("Petal Length  "+mean(setosa_p_length)+"      "+median(setosa_p_length)+"        "+mode(setosa_p_length)+"         "+minimum(setosa_p_length)+"           "+maximum(setosa_p_length));
            System.out.println("Petal Width   "+mean(setosa_p_width)+"      "+median(setosa_p_width)+"        "+mode(setosa_p_width)+"         "+minimum(setosa_p_width)+"           "+maximum(setosa_p_width));


            float[] versi_s_length = new float[50];
            float[] versi_s_width = new float[50];
            float[] versi_p_length = new float[50];
            float[] versi_p_width = new float[50];

            for(int k = 0;i<50;i++){
                versi_s_length[k] = sepallength[k+50];
                versi_s_width[k] = sepalwidth[k+50];
                versi_p_length[k] = petallength[k+50];
                versi_p_width[k] = petalwidth[k+50]; 
            }

            float[] virgi_s_length = new float[50];
            float[] virgi_s_width = new float[50];
            float[] virgi_p_length = new float[50];
            float[] virgi_p_width = new float[50];

            for(int k = 0;i<50;i++){
                virgi_s_length[k] = sepallength[k+100];
                virgi_s_width[k] = sepalwidth[k+100];
                virgi_p_length[k] = petallength[k+100];
                virgi_p_width[k] = petalwidth[k+100]; 
            }

        }catch(Exception exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
