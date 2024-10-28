package dev.sansow.parser.segment;

import dev.sansow.exception.IllegalDataException;

import java.util.List;

public interface SegmentParser {
    List<Integer> parse() throws IllegalDataException;
}
