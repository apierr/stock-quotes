package com.example.antonio.stockquote;

/**
 * Created by antonio on 13/02/15.
 */
public class StockInfo  {

    // XML Data to Retrieve
    private String name = "";
    private String yearLow = "";
    private String yearHigh = "";
    private String daysLow = "";
    private String daysHigh = "";
    private String lastTradePriceOnly = "";
    private String change = "";
    private String daysRange = "";

    public StockInfo(String name, String yearLow, String yearHigh,
                     String daysLow, String daysHigh, String lastTradePriceOnly,
                     String change, String daysRange) {
        this.name = name;
        this.yearLow = yearLow;
        this.yearHigh = yearHigh;
        this.daysLow = daysLow;
        this.daysHigh = daysHigh;
        this.lastTradePriceOnly = lastTradePriceOnly;
        this.change = change;
        this.daysRange = daysRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearLow() {
        return yearLow;
    }

    public void setYearLow(String yearLow) {
        this.yearLow = yearLow;
    }

    public String getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(String yearHigh) {
        this.yearHigh = yearHigh;
    }

    public String getDaysLow() {
        return daysLow;
    }

    public void setDaysLow(String daysLow) {
        this.daysLow = daysLow;
    }

    public String getDaysHigh() {
        return daysHigh;
    }

    public void setDaysHigh(String daysHigh) {
        this.daysHigh = daysHigh;
    }

    public String getLastTradePriceOnly() {
        return lastTradePriceOnly;
    }

    public void setLastTradePriceOnly(String lastTradePriceOnly) {
        this.lastTradePriceOnly = lastTradePriceOnly;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getDaysRange() {
        return daysRange;
    }

    public void setDaysRange(String daysRange) {
        this.daysRange = daysRange;
    }
}
