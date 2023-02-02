package dsaplacement;
// collection framework
// it is the set of predefined classes and interfaces which is used to the store multiple data store.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class collectionclass1 {
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add(12);
        al.add("pradeep");
        al.add('d');
        System.out.println(al);
        HashSet hs=new HashSet();
        hs.add(23);
        hs.add("maiya");
        hs.add('w');
        System.out.println(hs);
        HashMap hm=new HashMap();
        hm.put(12,"mohit");
        hm.put(322,"jai bheem");
        hm.put(321,4);
        System.out.println(hm);

    }
}
