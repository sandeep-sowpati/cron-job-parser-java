package dev.sansow;

import dev.sansow.exception.IllegalDataException;
import dev.sansow.parser.Field.FieldParser;
import dev.sansow.parser.Field.FieldParserImpl;

import java.util.List;
import java.util.Map;

import static dev.sansow.parser.Constant.*;
import static dev.sansow.parser.SimpleExpressionParserImpl.parse;
import static dev.sansow.parserPrinter.ParserPrinterImpl.printParsedData;

public class Main {
    public static void main(String[] args) throws IllegalDataException {

        String expression = "*/15 0 1,15 * 1-5 /usr/bin/find";
        Map<String,List> keys = parse(expression);
//        System.out.println(keys);
        printParsedData(keys);
    }
}