package dev.sansow.parser.factory;

import dev.sansow.parser.segment.*;

public class SegmentFactoryImpl implements SegmentFactory{
    @Override
    public SegmentParser segmentParser(String expression,int start,int end) {
        if (expression.contains("/"))  return new SlashSegmentParser(expression,start,end);
        if (expression.contains("*")) return new AllSegmentParser(expression,start,end);
        if (expression.contains("-")) return new RangeSegmentParser(expression,start,end);
        if (expression.contains(",")) return new ListSegmentParser(expression, start, end);
        return new RegularSegmentParser(expression,start,end);
    }
}
