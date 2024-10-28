package dev.sansow.parser.segment;

import dev.sansow.exception.IllegalDataException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeSegmentParser implements SegmentParser{
    private final String expression;
    private final int maximum;

    public RangeSegmentParser(String expression, int minimum, int maximum) {
        this.expression = expression;
        this.maximum = maximum;
    }

    @Override
    public List<Integer> parse() throws IllegalDataException {
        String[] valueStrings = expression.split("-");
        List<Integer> values = new ArrayList<>();
        if(valueStrings.length != 2){
            throw new IllegalDataException("Illegal Range Provided");
        }
        int start = Integer.parseInt(valueStrings[0].trim());
        int end = Integer.parseInt(valueStrings[1].trim());
        if(end<start){
            end += maximum;
        }
        for(int i=start;i<=end;i++){
            int temp = i;
            if (temp>maximum){
                temp %= maximum;
            }
            values.add(temp);
        }
        return values;
    }
}
