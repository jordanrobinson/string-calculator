package com.codurance.stringcalculator;

public class Calculator {
//    private OutputWriterInterface outputWriter;
//
//    public Calculator(OutputWriterInterface outputWriter)
//    {
//    	outputWriter = outputWriter;
//    }

    public int add(String numbers) {
        int sum = 0;

        if (numbers.equals("")) {
            //outputWriter.Write(sum);
            return sum;
        }

        String[] splitNumbers = numbers.split(",");

        for (String number : splitNumbers) {
            int integerNumber = Integer.parseInt(number);
                sum += integerNumber;
        }

        //outputWriter.Write(sum);
        return sum;
    }
}
