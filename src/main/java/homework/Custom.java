package homework;

import java.util.Scanner;

public class Custom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length:");
        float length = scanner.nextFloat();
        System.out.println("Please enter object's width:");
        float width = scanner.nextFloat();
        System.out.println("Please enter object's height:");
        int height = scanner.nextInt();
        System.out.println("使用哪一種郵箱:");
        String s =  scanner.next();
        if(s.equals("Box3")){
            Box box = new Box3();
            box.volidate(length,width,height);
        } else if (s.equals("Box5")) {
            Box box = new Box5();
            box.volidate(length,width,height);
        }
        else{
            System.out.println("郵局並無此尺寸郵箱，請確認後重新輸入");
        }
    }
}
