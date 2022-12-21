package by.task.backendtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerReceiptPrinter {

    public static void main(String[] args) {
        readArgs(args, new InputArgsForReceipt());
        SpringApplication.run(RunnerReceiptPrinter.class, args);
    }

    public static void readArgs(String[] args, InputArgsForReceipt inputArgsForReceipt) {
        for (String argument : args) {
            if (argument.matches("\\d+-\\d+")) {
                inputArgsForReceipt.setProductAmountMap(argument);
            } else if (argument.matches("[Cc]ard-\\d+")) {
                inputArgsForReceipt.setDiscountCardId(argument);
            } else /*if (argument.matches("[A-Za-zА-Яа-я\\d\\-_]+.txt"))*/ {

            }
        }
    }
}
