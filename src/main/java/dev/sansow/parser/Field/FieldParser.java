package dev.sansow.parser.Field;

import dev.sansow.exception.IllegalDataException;

import java.util.ArrayList;
import java.util.List;

public interface FieldParser {
    static List<Integer> parse(String expression,int minimum,int maximum) throws IllegalDataException {
        return new ArrayList<>();
    }
}
