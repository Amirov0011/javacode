import java.util.Scanner;

public class circularDoublyLInked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int a = 0; a < 5; a++){
            String s = sc.nextLine();

            if (s.equals("nobeti")){
                System.out.println("nobeti sehfeye kecid edildi");

            } else if (s.equals("geri")) {
                System.out.println("geri sehfeye kecib edildi");

            }else{
                System.out.println("emri duzgun daxil edin");
            }

        }



    }
}
