package Geekbrains.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainLogic {

    private final char CHAR_MULT    = '*';
    private final char CHAR_ADD     = '+';
    private final char CHAR_DiV     = '/';
    private final char CHAR_REDUCE  = '-';
    private final char CHAR_PERCENT = '%';

    private static List<String> listOperand;

    public MainLogic() {
        listOperand = new ArrayList<>();
    }

    public static List<String> getListOperand() {
        return listOperand;
    }
}
