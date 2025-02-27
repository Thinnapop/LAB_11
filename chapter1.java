import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class chap2 {
    public static void main(String[] args) {
        try {
            File createdFile = new File("RWdata.txt");
            if(createdFile.createNewFile()){
                FileWriter writer = new FileWriter("RWdata.txt");

                Random rand = new Random();
                for(int i = 0; i < 100; i++){
                    writer.write(rand.nextInt(100)+" ");
                }
                writer.close();
            }
            try {
                File f = new File("RWdata.txt");
                Scanner read = new Scanner(f);
                ArrayList<Integer> numList = new ArrayList<>();
                while(read.hasNext()){
                    numList.add(read.nextInt());
                }
                bubbleSort(numList);
                System.out.println(numList);
            } catch (IOException e) {
                System.out.println("File not found");
            }
        } catch (IOException e){
            System.out.println("There's some error");
        }
    }
            

    
    public static void bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        boolean swapped;

        for(int i = 0; i < n-1; i++){
            swapped = false;
            for (int j = 0; j < n-1-i; j++) {
                if(arr.get(j) > arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
}

