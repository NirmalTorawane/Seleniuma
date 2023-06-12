import java.util.ArrayList;
import java.util.Iterator;

public class Mainapp4 {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        a1.add("ANIKET");
        a1.add("AKSHAY");
        a1.add("MANNISH");

        System.out.println(a1);
     //   for(String data:a1) {
     //       if (a1.contains("AKSHAY")) {
       //         a1.remove("AKSHAY");
      //          System.out.println(a1);
        //    }
        //}

        Iterator<String> itr=a1.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals("AKSHAY")) {
                itr.remove();
            }
        }
        System.out.println(a1);
    }



}
