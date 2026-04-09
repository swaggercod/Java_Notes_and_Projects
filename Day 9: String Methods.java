public class main {
    public static void main(String[] args){

        String name = "PASSWORD";

        int length = name.length();
        char letter = name.charAt(1);
        int index = name.indexOf("s");
        int lastIndex = name.lastIndexOf("r");
        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("u","a");

        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello "+ name);
        }
        if(name.contains(" ")){
            System.out.println("Your name contain space");
        }
        else{
            System.out.println("Your name doesnt contain any spaces! ");
        }
      */

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name cant be password");
        }
        else{
            System.out.println("Hello "+ name );
        }
        
    }

}
