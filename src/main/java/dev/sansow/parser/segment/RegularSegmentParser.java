package dev.sansow.parser.segment;

import java.util.Collections;
import java.util.List;

public class RegularSegmentParser implements SegmentParser{
    private final String expression;

    public RegularSegmentParser(String expression,int minimum,int maximum) {
        this.expression = expression;
    }

    @Override
    public List<Integer> parse() {
        return List.of(Integer.parseInt(expression));
    }
}
