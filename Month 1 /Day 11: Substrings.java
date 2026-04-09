import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Substring() = A method used to extract a portion of a string
        //               .substring(start, end)
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.println("Enter your email: ");

        email = scanner.nextLine();
        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Your username "+ username);
            System.out.println("Your domain "+ domain);

        }
        else{
            System.out.println("Emails must contain @ !");
        }

        scanner.close();

    }

}
