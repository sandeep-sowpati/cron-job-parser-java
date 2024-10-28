package dev.sansow.parser.segment;

import dev.sansow.exception.IllegalDataException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlashSegmentParser implements SegmentParser{

    private final String expression;

    private final int start;
    private final int end;
    public SlashSegmentParser(String expression, int start, int end) {
        this.expression = expression;
        this.start = start;
        this.end =end;
    }
    @Override
    public List<Integer> parse() throws IllegalDataException {
        String[] valueStrings = expression.split("/");
        String ch = valueStrings[0].trim();
        int step = Integer.parseInt(valueStrings[1].trim());
        if (valueStrings.length!=2 | !ch.equals("*")){
            throw new IllegalDataException("Given Data is Invalid Please correct and try again");
        }
        List<Integer> values = new ArrayList<>();
        for(int i=start;i<=end;i+=step){
            values.add(i);
        }
        return values;
    }
}
