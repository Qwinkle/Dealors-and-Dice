package dealorsanddice;
import java.util.Random;
public class Die {

    
    int NumFaces;               //var for number of faces
    int FaceValue;              //
    
    
    int roll() {                //
        
        Random r = new Random();
        FaceValue = r.nextInt(NumFaces);
        
        return FaceValue;
    }
    
    private int getFaceValue(){
        return FaceValue;
    }
    
    private int getnumFaces() {
        return NumFaces;
    }
    
    public Die(int numFaces){                             //Constructor created
        NumFaces = numFaces;
    }
    
    String tostring(){
        return "d" + NumFaces + " = " + FaceValue + ", ";
    }
    
}