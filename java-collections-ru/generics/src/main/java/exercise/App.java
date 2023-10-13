package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN

public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books,
                                                      Map<String, String> booksToSearch) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {
            boolean test = false;
            for (Map.Entry<String, String> bookToSearch : booksToSearch.entrySet()) {
                if (book.containsKey(bookToSearch.getKey())) {
                    if (book.containsValue(bookToSearch.getValue())) {
                        test = true;
                    } else {
                        test = false;
                        break;
                    }
                }
            }
            if (test) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
