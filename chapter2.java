import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class chap1{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        try {
             System.out.println("Enter you file path: ");
             String file = input.nextLine();

             Scanner filePath = new Scanner(new File(file));

             double count =0;
             double total = 0, avg ;
             while(filePath.hasNext()){
                String num = filePath.nextLine();
                count++;
                total += Double.parseDouble(num);
             }
             avg = total / count;
             System.out.println("Total: "+total);
             System.out.println("Average: "+avg);
             filePath.close();
             
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the path and try again.");
        } catch (NumberFormatException e){
                System.out.println("There's an error in your file");
        } finally {
            input.close();
        }
    }
}