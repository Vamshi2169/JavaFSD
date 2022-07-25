public class q01_01Thread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		q01_01Thread mt = new  q01_01Thread();
  		mt.start();
 	}
}