package Assingments;

public class Q_10 {
	
    static int sumOfSeries(int n)
    {
        return (int) (0.6172 * 
                     (Math.pow(10, n) - 1) -
                                0.55 * n);
    }
      
    public static void main(String []args)
    {
        int n = 2;
        System.out.println(sumOfSeries(n));
    }


}
