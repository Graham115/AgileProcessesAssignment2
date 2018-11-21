package AgileProject.Agile;

public class MathFunctions {

	public double squareNumber(double num){
        return num * num;
    }

    public int addIntegers(int... a){
        int sum = 0;
        for(int num : a){
            sum += num;
        }
        return sum;
    }
}
