public class PrintListThread implements Runnable
{
   public static Object key = new Object();
   String temp;

   public void run()
   {
      while(true)
      {
         synchronized (key)
         {temp = Jobs.getElement();}

         if(temp == null){break;}
         else{System.out.println(Thread.currentThread().getName() +  ": " + temp);}
      }
   }
}
