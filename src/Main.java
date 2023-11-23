import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Users[] users = new Users[0];
        Scanner forManu = new Scanner(System.in);
        while(true){
            manu();
            System.out.print("♾️️️️♾️️️️♾️️️️: ");
            String myChoice = forManu.nextLine();
            switch(myChoice.toLowerCase()){
                case "1", "registration" ->{
                    users = Users.registerAccount(users);
                }
                case "2", "login" ->{
                    Users.sign_in(users);
                }
                case "3", "exit" ->{}
            }


        }
    }
    public static void manu(){
        System.out.print("""
                🔹1. Registration
                🔹2. Login
                🔹3. Exit
                             """);
    }
}