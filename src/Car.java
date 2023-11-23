import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Car {
    public static Cars[] brandCars(int indexUser, Users[] users, Cars[] reservationCar){
        while (true){
            manuBrands();
            System.out.print("💲💲💲: ");
            String mychoice = new Scanner(System.in).nextLine();
            switch (mychoice.toLowerCase()){
                case "1", "ferrari" ->{
                    boolean reservationTrue = true;
                    for (int i = 0; i < users.length; i++) {
                        for (int j = 0; j < users[i].getReservationCar().length; j++) {
                            if(users[i].getReservationCar()[j].name().equalsIgnoreCase("ferrari")){
                                System.out.println("This car is reservation! ");
                                reservationTrue = false;
                            }
                        }
                    }
                    if(reservationTrue) {
                        reservationCar = Arrays.copyOf(users[indexUser].getReservationCar(), users[indexUser].getReservationCar().length + 1);
                        reservationCar[reservationCar.length - 1] = Cars.FERRARI;
                        users[indexUser].setReservationCar(reservationCar);
                        System.out.println("Successful reservation ✅");
                    }
                }
                case "2", "honda" -> {
                    boolean reservationTrue = true;
                    for (int i = 0; i < users.length; i++) {
                        for (int j = 0; j < users[i].getReservationCar().length; j++) {
                            if(users[i].getReservationCar()[j].name().equalsIgnoreCase("honda")){
                                System.out.println("This car is reservation! ");
                                reservationTrue = false;
                            }
                        }
                    }
                    if(reservationTrue) {
                        reservationCar = Arrays.copyOf(users[indexUser].getReservationCar(), users[indexUser].getReservationCar().length + 1);
                        reservationCar[reservationCar.length - 1] = Cars.HONDA;
                        users[indexUser].setReservationCar(reservationCar);
                        System.out.println("Successful reservation ✅");
                    }
                }
                case "3", "mercedes benz" ->{
                    boolean reservationTrue = true;
                    for (int i = 0; i < users.length; i++) {
                        for (int j = 0; j < users[i].getReservationCar().length; j++) {
                            if(users[i].getReservationCar()[j].name().equalsIgnoreCase("mercedes_benz")){
                                System.out.println("This car is reservation! ");
                                reservationTrue = false;
                            }
                        }
                    }
                    if(reservationTrue) {
                        reservationCar = Arrays.copyOf(users[indexUser].getReservationCar(), users[indexUser].getReservationCar().length + 1);
                        reservationCar[reservationCar.length - 1] = Cars.MERCEDES_BENZ;
                        users[indexUser].setReservationCar(reservationCar);
                        System.out.println("Successful reservation ✅");
                    }
                }
                case "4", "toyota" ->{
                    boolean reservationTrue = true;
                    for (int i = 0; i < users.length; i++) {
                        for (int j = 0; j < users[i].getReservationCar().length; j++) {
                            if(users[i].getReservationCar()[j].name().equalsIgnoreCase("toyota")){
                                System.out.println("This car is reservation! ");
                                reservationTrue = false;
                            }
                        }
                    }
                    if(reservationTrue) {
                        reservationCar = Arrays.copyOf(users[indexUser].getReservationCar(), users[indexUser].getReservationCar().length + 1);
                        reservationCar[reservationCar.length - 1] = Cars.TOYOTA;
                        users[indexUser].setReservationCar(reservationCar);
                        System.out.println("Successful reservation ✅");
                    }
                }
                case "5", "kia" ->{
                    boolean reservationTrue = true;
                    for (int i = 0; i < users.length; i++) {
                        for (int j = 0; j < users[i].getReservationCar().length; j++) {
                            if(users[i].getReservationCar()[j].name().equalsIgnoreCase("kia")){
                                System.out.println("This car is reservation! ");
                                reservationTrue = false;
                            }
                        }
                    }
                    if(reservationTrue) {
                        reservationCar = Arrays.copyOf(users[indexUser].getReservationCar(), users[indexUser].getReservationCar().length + 1);
                        reservationCar[reservationCar.length - 1] = Cars.KIA;
                        users[indexUser].setReservationCar(reservationCar);
                        System.out.println("Successful reservation ✅");
                    }
                }
                case "6", "audi" ->{
                    boolean reservationTrue = true;
                    for (int i = 0; i < users.length; i++) {
                        for (int j = 0; j < users[i].getReservationCar().length; j++) {
                            if(users[i].getReservationCar()[j].name().equalsIgnoreCase("audi")){
                                System.out.println("This car is reservation! ");
                                reservationTrue = false;
                            }
                        }
                    }
                    if(reservationTrue) {
                        reservationCar = Arrays.copyOf(users[indexUser].getReservationCar(), users[indexUser].getReservationCar().length + 1);
                        reservationCar[reservationCar.length - 1] = Cars.AUDI;
                        users[indexUser].setReservationCar(reservationCar);
                        System.out.println("Successful reservation ✅");
                    }
                }
                case "7", "bmw" ->{
                    boolean reservationTrue = true;
                    for (int i = 0; i < users.length; i++) {
                        for (int j = 0; j < users[i].getReservationCar().length; j++) {
                            if(users[i].getReservationCar()[j].name().equalsIgnoreCase("bmw")){
                                System.out.println("This car is reservation! ");
                                reservationTrue = false;
                            }
                        }
                    }
                    if(reservationTrue) {
                        reservationCar = Arrays.copyOf(users[indexUser].getReservationCar(), users[indexUser].getReservationCar().length + 1);
                        reservationCar[reservationCar.length - 1] = Cars.BMW;
                        users[indexUser].setReservationCar(reservationCar);
                        System.out.println("Successful reservation ✅");
                    }
                }
                case "0", "exit" -> {
                    System.out.println("You logout from your account: ");
                    return reservationCar;
                }
                default -> System.out.println("This car don't found from our cars! ");
            }
        }
    }

    public static void manuBrands(){
        System.out.println(STR."""
                   🟢 1. \{Cars.FERRARI}
                   🟢 2. \{Cars.HONDA}
                   🟢 3. \{Cars.MERCEDES_BENZ}
                   🟢 4. \{Cars.TOYOTA}
                   🟢 5. \{Cars.KIA}
                   🟢 6. \{Cars.AUDI}
                   🟢 7. \{Cars.BMW}""");
    }
}
