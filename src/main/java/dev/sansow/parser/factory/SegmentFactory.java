package dev.sansow.parser.factory;

import dev.sansow.parser.segment.SegmentParser;

public interface SegmentFactory {
    SegmentParser segmentParser(String expression,int start,int end);
}
