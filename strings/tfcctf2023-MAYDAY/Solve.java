import java.util.HashMap;

public class Solve {
    public static void main(String[] args) throws Exception {
        String call = "Whiskey Hotel Four Tango Dash Alpha Romeo Three Dash Yankee Oscar Uniform Dash Sierra One November Kilo India November Golf Dash Four Bravo Zero Uniform Seven";

        HashMap<String, Character> specials = new HashMap<>();
        specials.put("Zero", '0');
        specials.put("One", '1');
        specials.put("Two", '2');
        specials.put("Three", '3');
        specials.put("Four", '4');
        specials.put("Five", '5');
        specials.put("Six", '6');
        specials.put("Seven", '7');
        specials.put("Eight", '8');
        specials.put("Nine", '9');
        specials.put("Dash", '-');

        String[] words = call.split(" ");
        for(int i = 0; i < words.length; i++) {
            if(specials.containsKey(words[i])) {
                System.out.print(specials.get(words[i]));
            }
            else {
                System.out.print(words[i].charAt(0));
            }
        }
    }
}
