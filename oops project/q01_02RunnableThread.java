public class q01_02RunnableThread implements Runnable{
 
    public static int myCount = 0;
    public q01_02RunnableThread(){
         
    }
    public void run() {
        while(q01_02RunnableThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++q01_02RunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        q01_02RunnableThread mrt = new q01_02RunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        while(q01_02RunnableThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++q01_02RunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
