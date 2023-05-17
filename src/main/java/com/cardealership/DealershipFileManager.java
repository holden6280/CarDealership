package com.cardealership;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {
    public Dealership getDealership() {
        Dealership dealership = new Dealership("Esserman International", "10455 NW 12th St, Doral, FL 33172", "(305) 477-6666");

        try{
            FileReader fileReader = new FileReader("EssermanInternational.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);


        }
    }

    public Dealership saveDealership() {
        return null;
    }
}
