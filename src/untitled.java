import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
        String[] students = {"Chính", "Thanh", "Linh", "Thường", "Hiệp", "Hiệu"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's studen: ");
        String input_name = sc.nextLine();
        boolean isExist=false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the studens in the list :" + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }

        }
        if (!isExist) {
            System.out.println("Not found :" + input_name + "in the list");
        }
    }
}
