import java.util.*;
public class Jobs {
   public static List<String> list = new ArrayList<String>();

   public static String getElement() {
      if(list != null && !list.isEmpty()) {
         return list.remove(0);
      }
      return null;
   }

   public static void addElement(String s){
      list.add(s);
   }
}
