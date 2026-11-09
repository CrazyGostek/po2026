package agh.po.lab3_2;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public static Map<String, String> mapAB4(Map<String, String> map) {
        map = new HashMap<>(map);
        if ((map.containsKey("a") && map.containsKey("b"))) {
            if (map.get("a").length() == map.get("b").length()) {
                map.replace("a", "");
                map.replace("b", "");

            } else {
                String longerString = map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b");
                map.put("c", longerString);
            }
        }
        return map;
    }

//    public Map<String, String> pairs(String[] strings) {
//        Map<String, String> letters = new HashMap<>();
//        for (String string : strings) {
//            String firstLetter = Character.toString(string.charAt(0));
//            String lastLetter = Character.toString(string.charAt(string.length() - 1));
//            if (!(letters.containsKey(string.charAt(0)) && letters.get(string.charAt(0)) == lastLetter))
//                letters.put(firstLetter, lastLetter);
//        }
//        return letters;
//    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> lengths = new HashMap<>();
        for (String string : strings) {
            if (!lengths.containsKey(string))
                lengths.put(string, string.length());
        }
        return lengths;
    }

    public static void printMap(Map<String, ?> map) {
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            System.out.println(String.format("K: \"%s\", V: %s", entry.getKey(), entry.getValue()));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printMap(wordLen(new String[]{"a", "bb", "a", "bb"}));
        printMap(wordLen(new String[]{"this", "and", "that", "and"}));
        printMap(wordLen(new String[]{"code", "code", "code", "bug"}));
        printMap(mapAB4(Map.of("a", "aaa", "b", "bb", "c", "cake")));
        printMap(mapAB4(Map.of("a", "aa", "b", "bbb", "c", "cake")));
        printMap(mapAB4(Map.of("a", "aa", "b", "bbb", "c", "cake")));
    }
}
