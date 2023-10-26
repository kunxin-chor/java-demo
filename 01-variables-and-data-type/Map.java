import java.util.HashMap;
import java.util.Map;

class MapDemo {
    public static void main(String[] args) {
        // Map
        Map<String, Integer> months = new HashMap<String, Integer>();
        months.put("jan", 31);
        months.put("feb", 28);
        months.put("mar", 30);
        System.out.println("Jan: " + months.get("jan"));
        System.out.println("Feb: " + months.get("feb"));
        System.out.println("Mar: " + months.get("mar"));
      }
}