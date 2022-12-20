import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

import java.util.ArrayList;
import java.util.Collections;

public class alfredarbete {

        public static String ordet(String x) {
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add("space marine");
            mylist.add("chaos");
            mylist.add("planet");
            mylist.add("lasgun");
            mylist.add("bolter");
            mylist.add("emperor");
            mylist.add("nun");
            mylist.add("spacecraft");
            mylist.add("knight");
            mylist.add("necron");
            mylist.add("hive");
            mylist.add("ork");
            mylist.add("boyz");
            mylist.add("nobz");
            mylist.add("warboss");
            mylist.add("psyker");

            //mylist.add("");

            Collections.shuffle(mylist);

            return mylist.get(0);
    }

    public static String censoredOrdet(String x) {
        String str = x;
        str = str.replaceAll("[a-z]", "_");

        return(str);
    }

}
