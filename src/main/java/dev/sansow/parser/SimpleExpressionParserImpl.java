package dev.sansow.parser;

import dev.sansow.exception.IllegalDataException;
import dev.sansow.parser.Field.FieldParserImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static dev.sansow.parser.Constant.*;



public class SimpleExpressionParserImpl implements ExpressionParser{

    public static Map<String, List> parse(String expression) throws IllegalDataException {
        Map<String, List> keys = new HashMap<>();
        String[] parsedData = expression.split(" ");
        if (parsedData.length < 6) throw new IllegalDataException("The Data Provided is invalid ");
        String minutesExpression = parsedData[0].trim();
        String hourExpression = parsedData[1].trim();
        String dayOfMonthExpression = parsedData[2].trim();
        String monthExpression = parsedData[3].trim();
        String dayOfWeekExpression = parsedData[4].trim();
        StringBuilder commandLine = new StringBuilder();
            // can be multiple values
        for (int i = 5; i < parsedData.length; i++) {
            commandLine.append(parsedData[i]).append(" ");
        }
        List<String> command = new ArrayList<>();
        command.add(commandLine.toString().trim());
            //PRINTING_FIELDS  = ['minute','hour','day of month','month','day of week','command']
        keys.put("minute", FieldParserImpl.parse(minutesExpression, MIN_MINIMUM, MIN_MAXIMUM));
        keys.put("hour", FieldParserImpl.parse(hourExpression, HOUR_MINIMUM, HOUR_MAXIMUM));
        keys.put("day of month", FieldParserImpl.parse(dayOfMonthExpression, DAY_MINIMUM, DAY_MAXIMUM));
        keys.put("month", FieldParserImpl.parse(monthExpression, MONTH_MINIMUM, MONTH_MAXIMUM));
        keys.put("day of week", FieldParserImpl.parse(dayOfWeekExpression, WEEK_MINIMUM, WEEK_MAXIMUM));
        keys.put("command", command);
        return keys;
    }
}
