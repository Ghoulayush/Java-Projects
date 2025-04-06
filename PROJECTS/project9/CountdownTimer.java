import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class CountdownTimer {
    public static void main(String[] args) {
        // Java COUNTDOWN TIMER PROGRAM
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter # of seconds to countdown from: ");
        int response = scanner.nextInt();
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            // This is the task that will be run every second
            int count = response;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count < 0){

                    System.out.println("HAPPY NEW YEAR!");

                    timer.cancel();

                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); // .(task, delay, period)
        scanner.close();
    }
}