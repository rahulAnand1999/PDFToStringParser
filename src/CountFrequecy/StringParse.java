package CountFrequecy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StringParse {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("React", "Java", "Angular");
        HashMap<String, Integer> map = new HashMap<>();
        for(String str: list) {
            int freq = countFrequency("ReactReactReact", str);
            map.put(str, freq);
            System.out.println(freq);
        }
    }
    static int countFrequency(String input, String text) {
        int s = 0, e = input.length() - 1;
        int s1 = 0;
        int freq = 0;
        while(s <= e) {
            char ch = input.charAt(s);
            char ch1 = text.charAt(s1);
            if(ch == ch1) s1++;
            else{
                s1 = 0;
            }
            if(s1 == text.length()) {
                freq++;
                s1 = 0;
            }
            s++;
        }
        return freq;
    }
}
