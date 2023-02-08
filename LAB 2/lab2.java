import java.util.*;
public class lab2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[1024];
        int continueloop;
        int i = 0;

        do{
            System.out.println("=====================");
            System.out.println("   NAMES DATA MENU   ");
            System.out.println("=====================");
            System.out.println("1. Enter a name");
            System.out.println("2. Search a name");
            System.out.println("3. Remove a name");
            System.out.println("4. Show all names");
            int menu = scan.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Enter a name to add to the list: ");
                    String entername = scan.next();
                    for(i =0;i<names.length;i++){
                        if(names[i] == null){
                            names[i] = entername;
                            break;
                        }
                        if(names[i].equals(entername)){
                            System.out.println("This name already exists in the list!!");
                            break;
                        }
                    
                    }
                    
                    break;
                case 2:
                    String searchname = scan.next();
                    for(int j = 0; j<names.length; j++){
                        if(names[j] == null) break;
                        if(names[j].equals(searchname)){
                            System.out.println("The name exists in this list!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter a name to remove: ");
                    String removename = scan.next();

                    int num = 0;
                    for(int k = 0; k<names.length; k++){
                        if(names[k] == null) break;
                        if(names[k].equals(removename)){
                            System.out.println("removed");
                            num = 1;
                        }
                        names[k] = names[k+num];
                    }
                    
                    break;
                case 4:
                    for(int j =0; j<names.length; j++){
                        if(names[j] == null) break;
                        System.out.print(" "+names[j]+", ");
                        System.out.println();

                    }
                    break;
            }
            System.out.println("Enter 0 to continue and any other number to stop.");
            continueloop = Integer.parseInt(scan.next());

            
        }while(continueloop==0);
        }
    }