package dev.sansow.parser;

import java.util.List;

public abstract interface Constant {
    List<Character> SPECIAL_CHARACTERS = List.of('*','/','-',',');

    int HOUR_MINIMUM = 0;
    int HOUR_MAXIMUM = 23;

    int MIN_MINIMUM = 0;
    int MIN_MAXIMUM = 59;

    int DAY_MINIMUM = 1;

    int DAY_MAXIMUM = 31;

    int WEEK_MINIMUM = 1;

    int WEEK_MAXIMUM = 7;

    int MONTH_MINIMUM = 1;
    int MONTH_MAXIMUM = 12;

    int YEAR_MINIMUM = 1970;
    int YEAR_MAXIMUM = 2076;
}
