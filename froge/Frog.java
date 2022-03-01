import java.util.Scanner;

public class Frog {
    int jump = 0;
    float second = 0.000f;

    public void jump(){

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter The Distance ?");
            int distance = Integer.parseInt(scanner.nextLine());

            while(distance >=5){
                jump= jump+1;
                second= second+1;
                distance= distance-5;

                if(distance >=3){
                    jump= jump+1;
                    second= second+2;
                    distance= distance-3;

                    if(distance>=1){
                        jump= jump+1;
                        second= second+3.500f;
                        distance= distance-1;
                    }
                }
            }
            System.out.println("Total jump = " +jump );
            System.out.println("Total time = " +second);
            System.out.println("Remaining distance = " +distance);
            }
        catch (ArithmeticException exception){

            }

        }
        
}