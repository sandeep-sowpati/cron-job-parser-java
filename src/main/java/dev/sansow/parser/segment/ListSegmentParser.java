package dev.sansow.parser.segment;

import java.util.ArrayList;
import java.util.List;

public class ListSegmentParser implements SegmentParser{
    private final String expression;

    public ListSegmentParser(String expression, int start, int end) {
        this.expression = expression;
    }

    @Override
    public List<Integer> parse() {
        String[] valueStrings = expression.split(",");
        List<Integer> values = new ArrayList<>();
        for (String num:valueStrings){
            values.add(Integer.parseInt(num));
        }
        return  values;
    }
}
