import java.util.*;

public class Main
{

   public static void main(String[] args)
   {
      //Fills array
      Jobs job = new Jobs();
      for(int i = 0; i < 1000; i++)
      {job.addElement("Index at " + i);      }

      ArrayList<Thread> threads = new ArrayList<Thread>();
      for (int i = 0; i < 8; i++)
      {
         threads.add(new Thread(new PrintListThread()));
         threads.get(i).start();
      }

      try
      {
         threads.get(0).join();
         System.out.println("Ende");
      } catch (InterruptedException e)
      {
         e.printStackTrace();
      }
   }
}
