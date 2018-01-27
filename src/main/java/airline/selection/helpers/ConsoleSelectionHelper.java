package airline.selection.helpers;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import airline.selection.SelectionHelper;
import airline.selection.options.MainOption;

public class ConsoleSelectionHelper implements SelectionHelper {

    private Scanner in;
    private PrintStream out;

    public ConsoleSelectionHelper(InputStream in, PrintStream out) {
        this.in = new Scanner(in);
        this.out = out;
    }

    @Override
    public MainOption performMainOptionSelection() {
        displayHeader();
        displayMainOptions();
        int ordinal = performNumberInput(MainOption.values().length - 1);
        return MainOption.values()[ordinal];
    }

    private void displayMainOptions() {
        for(MainOption option: MainOption.values()) {
            int ordinal = option.ordinal();
            String description = option.getDescription();
            String representation = String.format("%d - %s", ordinal, description);
            out.println(representation + "\n");
        }
    }

    private void displayHeader() {
        System.out.println("\nMenu\n");
    }

    private int performNumberInput(int range) {
        out.print("Please, enter number from 0 to " + range + ": ");
        
        int number = 0;
        try {
            number = in.nextInt();
            if (number < 0 || number > range) throw new InputMismatchException();
        } catch(Exception e) {
            out.println("Sorry, something went wrong... Please, try again.");
        }
        return number;
    }
}