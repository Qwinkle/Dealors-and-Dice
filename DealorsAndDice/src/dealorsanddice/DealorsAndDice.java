package dealorsanddice;
import java.util.Random;
public class DealorsAndDice {
    
    public static void main(String[] args) {
        
        Die d4 = new Die(4);                //Creates variables
        Die d6 = new Die(6);
        Die d8 = new Die(8);
        Die d10 = new Die(10);
        Die d12 = new Die(12);
        Die d20 = new Die(20);
        Die d100 = new Die(100);
        
        
        Random r = new Random();            //Creates a random
        
        
        Die[] dieBag = {d4, d6, d8, d10, d12, d20, d100};       //Creates array
        
        
        
        for(int roll = 0; roll < 5; roll++) {
            Die temp = dieBag[r.nextInt(7)];        
            temp.roll();
            System.out.print(temp.tostring());
        }          
    } 
}
