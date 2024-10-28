package dev.sansow.parserPrinter;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParserPrinterImpl implements ParserPrinter{

    public static void printParsedData(Map<String,List> keyValues) {
        for(String key:keys){
            int key_size = key.length();

            int remaining_size = 20-key_size;
            String spaces = " ".repeat(remaining_size);
            String value = (String) keyValues.get(key).stream().map(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(key+ spaces+value);
        }
    }
}
