import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Users {
    private String fullName;
    private String gender;
    private String email;
    private String password;
    private BigDecimal bankAccount;
//    private long idUser;
    int countUser = 0;
    private Cars[] reservationCar = new Cars[0];

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BigDecimal bankAccount) {
        this.bankAccount = bankAccount;
    }
    //    public long getIdUser() {
//        return idUser;
//    }
//
//    public void setIdUser(long idUser) {
//        this.idUser = idUser;
//    }

    public int getCountUser() {
        return countUser;
    }

    public void setCountUser(int countUser) {
        this.countUser = countUser;
    }

    public Cars[] getReservationCar() {
        return reservationCar;
    }

    public void setReservationCar(Cars[] reservationCar) {
        this.reservationCar = reservationCar;
    }

    //🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘
    public static Users[] registerAccount(Users[] users) {
        Scanner sr = new Scanner(System.in);
        Users user = new Users();
        boolean fullNameTrue = true;
        while(fullNameTrue) {
            System.out.print("Enter your full name: ");
            String fullName = sr.nextLine();
            if(!fullName.isBlank()) {
                user.fullName = fullName;
                fullNameTrue = false;
            }
        }
        boolean isTrue3 = true;
        while (isTrue3) {
            System.out.print("Enter your gender: ");
            String gender = sr.nextLine();
            if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("female")) {
                user.gender = gender;
                isTrue3 = false;
            } else System.out.println("Please choice male or female!");
        }   // for "gender"
        boolean isTrue2 = true;
        while (isTrue2) {
            System.out.print("Enter your email name: ");
            String gmail = sr.nextLine();
            if (!gmail.isBlank() && gmail.contains("@gmail.com") && gmail.length() > 10) {
                boolean A = true;
                if (users.length != 0) {
                    for (int i = 0; i < users.length; i++) {
                        if (gmail.equals(users[i].email)) {
                            A = false;
                        }
                    }
                }
                if (A) {
                    user.email = gmail;
                    isTrue2 = false;
                }else System.err.println("This login is not free! ");
            } else {
                System.err.println("❌❌❌ -> <<" + gmail + ">>");
                System.out.println("Please don't forget to add '@gmail.com'!");
            }
        }   // for "@gmail.com"
        boolean isTrue = true;
        while (isTrue) {
            System.out.print("Enter your password name: ");
            String password1 = sr.nextLine();
            System.out.print("Enter your password again: ");
            String password2 = sr.nextLine();
            if (password1.equals(password2) && password2.length() > 3) {
                user.password = password1;
                isTrue = false;
            } else System.out.println("❌❌❌ Password doesn't match" + "\nPlease enter your password again!");
        }   // for "Password"
//        user.idUser = getIdForAccount();
        users = Arrays.copyOf(users, users.length+1);
        users[users.length-1] = user;
        System.out.println("✅ Registration successful ✅");
        return users;
    }       // Great Account

    //🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘
    public static void sign_in(Users[] users){
        Scanner scanner = new Scanner(System.in);
        int intdexUser = 0;
        boolean whileTrue = true;
        while(whileTrue) {
            System.out.print("\nEnter your login: ");
            String login = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            for (int i = 0; i < users.length; i++) {
                boolean x = true;
                if(users[i].email.equals(login)){
                    if(users[i].password.equals(password)){
                        whileTrue = false;  x = false;
                        System.out.println("✅ Successful login ✅ Welcome 🙌 ✅");
                        if("male".equalsIgnoreCase(users[i].gender)) {
                            System.out.println("🧔🏻‍♂️ Profile ➡️ " + login);
                        }else System.out.println("👱🏻‍♀️ ♂️ Profile ➡️ " + login);
                        System.out.println("🟩 Full Name 🔘 " + users[i].fullName);
                        intdexUser = i;

                        i = users.length;
                    }
                }
                if(x && i == users.length-1) {System.out.println("Invalid login or password ! ❌");}
            }
            if(0 == users.length) {System.err.println("You don't have account! ❌"); whileTrue = false;}
        }
        Car.brandCars(intdexUser, users, users[intdexUser].getReservationCar());
        for (Cars cars : users[intdexUser].getReservationCar()) {
            System.out.println(cars);
            System.out.println();
        }
//        System.out.println(users[intdexUser].getReservationCar().length);

    }                     // Great Product

    //🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘🔘

//    public static long getIdForAccount(){
//
//        return ++idUser;
//    }
}
