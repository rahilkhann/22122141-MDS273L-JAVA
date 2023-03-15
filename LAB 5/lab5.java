import java.util.*;
class Student{
    String register;
    String name;
    String email;
    String phone;
    String student_class;
    String department;

    public Student(){}

    public Student(String register, String name, String email, String phone, String student_class, String department){
        this.register = register;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.student_class = student_class;
        this.department = department;
     }
    
    public void getdetails(){
        System.out.println("____________________________");
        System.out.println("Register number: "+register);
        System.out.println("Name: "+name);
        System.out.println("Phone number: "+phone);
        System.out.println("E-mail ID: "+email);
        System.out.println("Class of Student: "+student_class);
        System.out.println("Department: "+department);
        System.out.println("____________________________");
    } 
    
}



public class lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] students = new Student[100];
        
        String cont;
        do{
            System.out.println("===============================");
        System.out.println("             MENU              ");
        System.out.println("===============================");
        System.out.println("1. Add a new Student");
        System.out.println("2. Search for a student");
        System.out.println("3. Show details of all students");
        System.out.println("===============================");
        int option = Integer.parseInt(scan.nextLine());

        switch(option){
            case 1:
            int count = 0;
            for(int i = 0; i<students.length; i++){
                if(students[i]!=null){
                    count++;
                }}
            System.out.println("Enter the register number of the Student: ");
            String register = scan.nextLine();
            System.out.println("Enter the name of the Student: ");
            String name = scan.nextLine();
            System.out.println("Enter the phone number of the Student: ");
            String phone = scan.nextLine();
            System.out.println("Enter the email id of the Student: ");
            String email = scan.nextLine();
            System.out.println("Enter the class of the Student: ");
            String student_class = scan.nextLine();
            System.out.println("Enter the department of the Student: ");
            String department = scan.nextLine();

            students[(count)] = new Student(register, name, phone, email, student_class, department );
            break;

            case 2:
            int notnull = 0;
            for(int k = 0; k<students.length; k++){
                if(students[k]!=null){
                    notnull++;
                }}
            System.out.print("Enter the name of the student you want the details of: ");
            String searchname = scan.nextLine();
            for(int j = 0; j<notnull;j++){
                if((students[j].name).equals(searchname)){
                    students[j].getdetails();
                }
                else{
                    System.out.println("No such name found!");
                }
            }
            break;

            case 3:
            int nonnull = 0;
            for(int k = 0; k<students.length; k++){
                if(students[k]!=null){
                    nonnull++;
                }}

            for(int c = 0; c<nonnull; c++){
                students[c].getdetails();
            }
            break;
        }
        System.out.print("Press 0 to end the program. Any other key to continue: ");
        cont = scan.nextLine(); 
        }while(cont != "0");
        }
    }


