import java.util.Scanner;

class CheckList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[100]; 

        int i = 0; 
        int l=1;
        String inputString; 

        while (true) {
            
            System.out.println(l + ":");
            inputString = scanner.nextLine();
            array[i] = inputString;
            i++; 
            l++;

            if (inputString.equals("end.")) {
                System.out.println("Ο κατάλογός σας είναι:");
                for (int j = 0; j < i; j++) {
                    System.out.println((j + 1) + ". " + array[j]); 
                }
                break; 
            }

    }

        // Κλείσιμο του Scanner
        scanner.close();
    }
}
