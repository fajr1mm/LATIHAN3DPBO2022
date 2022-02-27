import java.util.*;

public class main{
    public static void main(String[] args){
        int n = 0;
        Scanner scan = new Scanner(System.in);
        try{
            n = scan.nextInt();
        }catch(Exception e){}

        //pc class
        String name;
        pro
        int i = 0, j = 0;
        club[] arr = new club[n];
        for(i=0; i<n; i++){
            try{
                System.out.print("Input Club : ");
                name = scan.next();
                System.out.print("Input Country : ");
                country = scan.next();
                System.out.print("Input Year : ");
                year = scan.next();
                System.out.print("Input Player : ");
                player = scan.next();
                System.out.print("Input Coach : ");
                coach = scan.next();
            }catch(Exception e){}

            arr[i] = new club(name,country,year,player,coach);

        }

        for(i=0; i<n; i++){
            System.out.println(" ");
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getCountry());
            System.out.println(arr[i].getYear());
            System.out.println(arr[i].getPlayer());
            System.out.println(arr[i].getCoach());
        }
    }
}
