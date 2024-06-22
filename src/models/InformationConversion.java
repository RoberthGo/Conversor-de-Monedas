package models;

import java.math.BigDecimal;

public class InformationConversion {
    private String baseCode;
    private String targetCode;
    private BigDecimal amount;
    private BigDecimal conversionResult;

    public InformationConversion(String baseCode, String targetCode, BigDecimal amount) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.amount = amount;
    }

    public InformationConversion(Coins conversion, BigDecimal amount) {
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

    public BigDecimal getConversionResult() {
        return conversionResult;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
