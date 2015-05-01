import java.util.Random;
public class Methods{
    public static void main (String []args){
        Random r = new Random();
        int choose = r.nextInt(10);
        String word1 = Adjectives(choose);
        int choose1 = r.nextInt(10);
        String word2 = Adjectives(choose1);
        int choose2 = r.nextInt(10);
        String word3 = Subject(choose2);
        int choose3 = r.nextInt(10);
        String word4 = Verb(choose3);
        int choose4 = r.nextInt(10);
        String word5 = Adjectives(choose4);
        int choose5 = r.nextInt(10);
        String word6 = Objects(choose5);
        System.out.println("The "+word1+" "+word2+" "+word3+" "+word4+" the "+word5+" "+word6+".");
    }//End Main Method
    public static String Adjectives(int a ){
        String adj = "";
        switch(a){
            case 0: adj = "new";break;
            case 1: adj = "good";break;
            case 2: adj = "high";break;
            case 3: adj = "other";break;
            case 4: adj = "American";break;
            case 5: adj = "black";break;
            case 6: adj = "brown";break;
            case 7: adj = "white";break;
            case 8: adj = "great";break;
            case 9: adj = "small";break;
        }
        return adj;
    }//End Adjectives Method
    public static String Subject(int a){
        String sub = "";
        switch(a){
            case 0: sub = "fox";break;
            case 1: sub = "dog";break;
            case 2: sub = "narwhal";break;
            case 3: sub = "seal";break;
            case 4: sub = "cat";break;
            case 5: sub = "rabbit";break;
            case 6: sub = "whale";break;
            case 7: sub = "giraffe";break;
            case 8: sub = "lion";break;
            case 9: sub = "jaguar";break;
        }
        return sub;
    }//End Subject Noun Method
    public static String Verb(int a){
        String verb = "";
        switch(a){
            case 0: verb = "passed";break;
            case 1: verb = "kicked";break;
            case 2: verb = "thanked";break;
            case 3: verb = "hit";break;
            case 4: verb = "listened to";break;
            case 5: verb = "jumped over";break;
            case 6: verb = "ran past";break;
            case 7: verb = "swam past";break;
            case 8: verb = "greeted";break;
            case 9: verb = "wrestled with";break;
        }
        return verb;
    }//End Verb Method
    public static String Objects(int a ){
        String obj = "";
        switch(a){
            case 0: obj = "fox";break;
            case 1: obj = "dog";break;
            case 2: obj = "jaguar";break;
            case 3: obj = "deer";break;
            case 4: obj = "hyena";break;
            case 5: obj = "zebra";break;
            case 6: obj = "crocodile";break;
            case 7: obj = "wolf";break;
            case 8: obj = "tiger";break;
            case 9: obj = "snake";break;
        }
        return obj;
    }//End Object Noun Method
}//End Class