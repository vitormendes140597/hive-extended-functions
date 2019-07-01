package com.br.hive.arrays;

import org.apache.hadoop.hive.ql.exec.UDF;
import java.util.ArrayList;


public class Slice extends UDF {

    public ArrayList<String> evaluate(ArrayList<String> elementsArray, int firstIndex, int lastIndex) {

        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < elementsArray.size(); i++) {
            if(i >= firstIndex && i <= lastIndex) {
                result.add(elementsArray.get(i));
            }
        }

        return result;

    }

    public ArrayList<String> evaluate(ArrayList<String> elementsArray, int firstIndex) {

        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < elementsArray.size(); i++) {
            if(i >= firstIndex) {
                result.add(elementsArray.get(i));
            }
        }

        return result;
    }

}
