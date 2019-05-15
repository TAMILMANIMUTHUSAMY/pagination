package com.hm.pagination.domain;

import java.util.Arrays;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 16-05-2019 00:58
 */
public enum Continent {

        Asia("Asia"),
        Europe("Europe"),
        NORTH_AMERICA("North America"),
        Africa("Africa"),
        Oceania("Oceania"),
        Antarctica("Antarctica"),
        SOUTH_AMERICA("South America");

        private String value;

        Continent(String value) {
            this.value = value;
        }

        public static Continent fromValue(String value) {
            for (Continent continent: values()) {
                System.out.println("-----+"+ value);
                if (continent.value.equalsIgnoreCase(value))
                    return continent;
            }
            throw new IllegalArgumentException(
                    "Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
        }
}
