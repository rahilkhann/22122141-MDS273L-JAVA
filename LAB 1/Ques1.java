import java.util.Scanner;

class Ques1{
    public static void main(String[] args) {

        Scanner dd = new Scanner(System.in);
        System.out.println("Enter your name: \n");
        String name = dd.nextLine();
        System.out.println("Enter your gender(m or f): \n");
        String gender = dd.nextLine();
        System.out.print("Enter your state: \n");
        String state = dd.nextLine();
        System.out.println("Enter your age: \n");
        int age = Integer.parseInt(dd.nextLine());


        if(gender.equals("m")){
            System.out.print("MALE\n");
        }
        else if(gender.equals("f")){
            System.out.print("FEMALE\n");
        }

        switch(state){
            case "Delhi":
            case "Haryana":
            case "Jammu and Kashmir":
            case "Himachal Pradesh":
            case "Uttar Pradesh":
            case "Punjab":
            case "Uttarakhand":
            case "Rajasthan":
            case "Ladakh":
            case "Chandigarh":
                System.out.print("The user belongs to North India");
                break;
            case "Goa":
            case "Maharashtra":
            case "Gujarat":
            case "Daman and Diu":
            case "Dadra and Nagar Haveli":
                System.out.print("The user belongs to West India");
                break;
            case "Andhra Pradesh":
            case "Karnataka":
            case "Kerala":
            case "Tamil Nadu":
            case "Telangana":
            case "Lakshwadeep":
            case "Puducherry":
                System.out.print("The user belongs to South India");
                break;
            case "Bihar":
            case "Jharkhand":
            case "Odisha":
            case "West Bengal":
            case "Andaman and Nicobar Islands":
            case "Arunachal Pradesh":
            case "Assam":
            case "Manipur":
            case "Tripura":
            case "Nagaland":
            case "Mizoram":
            case "Meghalaya":
            case "Sikkim":
                System.out.print("The user belongs to East India");
                break;
            default:
                System.out.println("Please enter an Indian State");
                break;

            

        }

        
    }
}

