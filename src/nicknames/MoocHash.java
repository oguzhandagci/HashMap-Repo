package nicknames;

import java.util.HashMap;

public class MoocHash {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();

            hashmap.put("Matthew", "Matt");
            hashmap.put("Michael", "Mix" );
            hashmap.put("Arthur", "Artie");

        System.out.println(hashmap.get("Michael"));
    }

}