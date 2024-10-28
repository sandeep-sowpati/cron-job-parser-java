package dev.sansow.parser.Field;

import dev.sansow.exception.IllegalDataException;
import dev.sansow.parser.factory.SegmentFactory;
import dev.sansow.parser.factory.SegmentFactoryImpl;
import dev.sansow.parser.segment.SegmentParser;

import java.util.List;

import static dev.sansow.parser.Constant.*;

public class FieldParserImpl implements FieldParser{

    public static List<Integer> parse(String expression,int minimum,int maximum) throws IllegalDataException {
        SegmentFactory segmentFactory = new SegmentFactoryImpl();
        SegmentParser segmentParser = segmentFactory.segmentParser(expression,minimum,maximum);
        return segmentParser.parse();
    }
}
