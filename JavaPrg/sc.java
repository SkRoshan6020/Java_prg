import java.util.Scanner;
public class sc {
    
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);

        String name = S.nextLine();
        char gender = S.next().charAt(0);
        int age = S.nextInt();
        long mobileno = S.nextLong();
        double cgpa = S.nextDouble();


        System.out.println("NAME : "+name);
        System.out.println("GENDER : "+gender);
        System.out.println("AGE : "+age);
        System.out.println("MOBILE NO. : "+mobileno);
        System.out.println("CGPA : "+cgpa);
    }
}
