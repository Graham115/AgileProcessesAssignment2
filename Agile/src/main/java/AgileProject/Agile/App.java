package AgileProject.Agile;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args){
        MathFunctions mathFunctions = new MathFunctions();
        double num = mathFunctions.squareNumber(10);
        System.out.println(num);
        System.out.println(mathFunctions.addIntegers(1,2,3,4,5,6,7,8,9));
    }
}