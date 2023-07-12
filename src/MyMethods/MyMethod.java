package MyMethods;

import java.util.Random;

public class MyMethod {
    public static void myWaight (int time){
        try{
            Thread.sleep(time*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
    public static String generatePassword() {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()_-+=<>?";

        StringBuilder password = new StringBuilder();

        // Generate one character from each category
        password.append(getRandomChar(upperCase));
        password.append(getRandomChar(lowerCase));
        password.append(getRandomChar(numbers));
        password.append(getRandomChar(specialChars));

        // Generate remaining characters
        Random random = new Random();
        String allChars = upperCase + lowerCase + numbers + specialChars;
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }

    private static char getRandomChar(String charSet) {
        Random random = new Random();
        int index = random.nextInt(charSet.length());
        return charSet.charAt(index);
    }
}

