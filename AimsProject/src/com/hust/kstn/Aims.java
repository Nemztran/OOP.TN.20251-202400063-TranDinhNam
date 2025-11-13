
import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        int query = 0;
        while (query != 5) {
            System.out.println("1. Add new item");
            System.out.println("2. Remove item");
            System.out.println("3. Print current cart");
            System.out.println("4. View current total cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            query = scanner.nextInt();
            scanner.nextLine();

            if (query == 1 || query == 2) {
                String[] infoDVD = {};
                do {
                    System.out.println("Enter DVD info(title|category|director|length|cost): ");
                    infoDVD = scanner.nextLine().split("\\|");
                    if (infoDVD.length < 5) {
                        System.out.println("Invalid input. Please enter all 5 fields again !");
                    }
                } while (infoDVD.length < 5);
                DigitalVideoDisc newDisc = new DigitalVideoDisc(infoDVD[0], infoDVD[1], infoDVD[2], Integer.parseInt(infoDVD[3]), Double.parseDouble(infoDVD[4]));
                if (query == 1) {
                    cart.addDVD(newDisc);
                } else {
                    cart.removeDVD(newDisc);
                }
            } else if (query == 3) {
                cart.print();
            } else if (query == 4) {
                System.out.println("Current total cost in cart: " + cart.calculateTotalCost());
            }
            System.out.println("====================================");
        }
        scanner.close();
    }
}
