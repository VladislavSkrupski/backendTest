package by.task.backendtest.store.receipt;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Receipt {
    private List<Item> items = new ArrayList<>();
    private boolean hasDiscount = false;
    private GregorianCalendar date;
    private double totalCost;
    private double totalCostWithDiscount;
    private int storeId;
    private String storeAddress;
    private String CashierID;
}
