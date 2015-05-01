public class SpaceExploration{
    public static void main (String[] args){
        int year = (int)(Math.random()*11)+2000;
        System.out.println("Here is a timeline of space exploration from "+year+" to 2000:");
        switch(year){
            case 2010: System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back"); year--; 
            case 2009: System.out.println(year+": N/A"); year--;
            case 2008: System.out.println("2008: Kepler launched to study deep space"); year--;
            case 2007: System.out.println(year+": N/A"); year--;
            case 2006: System.out.println("2006: Spacecraft returns with collections from a comet"); year--;
            case 2005: System.out.println("2005: Spacecraft collides with comet"); year--;
            case 2004: System.out.println(year+": N/A"); year--;
            case 2003: System.out.println("2003: Largest infrared telescope released"); year--;
            case 2002: System.out.println(year+": N/A"); year--;
            case 2001: System.out.println("2001: First spacecraft lands on asteroid"); year--;
            case 2000: System.out.println("2000: First spacecraft orbits an asteroid"); break;
            default: System.out.println(year+": N/A"); year--;
        }//End Switch Statement
    }
}//End Class