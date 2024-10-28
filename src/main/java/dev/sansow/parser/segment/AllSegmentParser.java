package dev.sansow.parser.segment;

import dev.sansow.exception.IllegalDataException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSegmentParser implements SegmentParser{
    private final int start;
    private final int end;
    public AllSegmentParser(String expression, int start, int end) {
        this.start = start;
        this.end =end;
    }

    @Override
    public List<Integer> parse() throws IllegalDataException {

        List<Integer> values = new ArrayList<>();
        for(int i=start;i<=end;i++){
            values.add(i);
        }
        return values;
    }
}
