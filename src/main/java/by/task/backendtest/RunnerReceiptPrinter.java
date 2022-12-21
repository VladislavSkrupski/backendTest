package by.task.backendtest;

import by.task.backendtest.controllers.ReceiptConsoleController;
import by.task.backendtest.store.receipt.Receipt;
import by.task.backendtest.store.receipt.ReceiptDirector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RunnerReceiptPrinter {

    public static void main(String[] args) {
        SpringApplication.run(RunnerReceiptPrinter.class, args);
//        ConsoleWorker consoleWorker = new ConsoleWorker(readArgs(args, new InputArgsForReceipt()));
//        consoleWorker.printToConsole();

    }


    public static InputArgsForReceipt readArgs(String[] args, InputArgsForReceipt inputArgsForReceipt) {
        for (String argument : args) {
            if (argument.matches("\\d+-\\d+")) {
                inputArgsForReceipt.setProductAmountMap(argument);
            } else if (argument.matches("[Cc]ard-\\d+")) {
                inputArgsForReceipt.setDiscountCardId(argument);
            } else /*if (argument.matches("[A-Za-zА-Яа-я\\d\\-_]+.txt"))*/ {

            }
        }
        return inputArgsForReceipt;
    }
}
