package book;

import java.util.Scanner;

public class MainBookVersion2 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of author : ");
        int n = inp.nextInt();
        Author aother[] = new Author[n];

        for (int i = 0 ; i < aother.length; i++) {
            aother[i] = new Author();
            System.out.println("Enter name : ");
            String str = inp.next();
            inp.nextLine();
            aother[i].setName(str);
            System.out.println("Enter sex : ");
            String sex = inp.next();
            char ch = sex.charAt(0);
            aother[i].setGenerate(ch);
            System.out.println("Enter Email : ");
            String eml = inp.next();
            aother[i].setEmail(eml);
        }

        
        System.out.println("Enter book name : ");
        String book = inp.next();
        System.out.println("Enter price of book : ");
        double price = inp.nextDouble();
        System.out.println("Enter quality of book : ");
        int Quality = inp.nextInt();
        
        BookVersion2 book2 = new BookVersion2(book,aother, price, Quality);
         String namee = book2.getAutherNames();
         System.out.println("authors name : " + namee);
        System.out.println(book2);
      
  
    }

}
