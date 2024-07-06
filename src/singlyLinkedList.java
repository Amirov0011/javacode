import java.util.Scanner;

public class singlyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            String s = sc.nextLine();
            if (s.equals("next")){
                System.out.println("nobeti sehfeye kecid edildi.");
            } else if (s.equals("back")) {
                System.out.printf("evvelki sehfeye kecid yoxdur");

            } else{
                System.out.println("emri duzgun daxil edin");
            }
        }


    }
}
