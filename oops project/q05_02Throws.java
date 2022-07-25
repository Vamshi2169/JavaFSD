public class q05_02Throws
    {
        void Division() throws ArithmeticException
        {
            int a=45,b=0,rs;
            rs = a / b;
            System.out.print("\n\tThe result is : " + rs);
        }
         public static void main(String[] args)
        {
        	 q05_02Throws T = new q05_02Throws();
             try
            {
                T.Division();
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            System.out.print("\n\tEnd of program.");
        }
    }
