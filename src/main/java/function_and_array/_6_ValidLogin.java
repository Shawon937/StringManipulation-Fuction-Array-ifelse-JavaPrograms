//Suppose a software system excepts valid credentials from user to logged in to the system.
// if the user inputs wrong password for 3 times, system will say that
// "Your user has been temporary locked". Let the username: admin, password: admin@123

package function_and_array;


import java.util.HashMap;
import java.util.*;

public class _6_ValidLogin {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "admin@123");

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.print("Username: ");
            String user = sc.next();
            System.out.print("Password: ");
            String pass = sc.next();

            if (map.get("username").equals(user) && map.get("username").equals(user)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Invalid Username or Password");
                System.out.println(3 - 1 - i + " Attenpts Left");
            }

        }

    }


}
