
package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class replaceValues {
    public static void main(String[] args){
        File file = new File("src/fileio/pricelist.txt");
        File outputFile = new File("src/fileio/pricelist-new.txt");
        try{
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(outputFile);
        //ArrayList<Double> prices = new ArrayList<>();
        
        while(input.hasNext()){
            output.printf("%.2f\n",input.nextDouble() * 1.25);
            
            //prices.add(input.nextDouble() * 1.25);
        }
        
        input.close();
        output.close();
        
        }catch(FileNotFoundException ex){
            System.out.println("File not Found.");
        }
    }
}
