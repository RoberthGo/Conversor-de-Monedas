package models;

public class InformationConversion {
    private String baseCode;
    private String targetCode;
    private double amount;
    private double conversionResult;

    public InformationConversion(String baseCode, String targetCode, double amount) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.amount = amount;
    }

    public InformationConversion(Coins conversion, double amount) {
        this.baseCode = conversion.base_code();
        this.targetCode = conversion.target_code();
        this.conversionResult = conversion.conversion_result();
        this.amount = amount;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public double getConversionResult() {
        return conversionResult;
    }

    public double getAmount() {
        return amount;
    }
}
