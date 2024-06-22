package models;
import java.math.BigDecimal;

public record Coins(String base_code, String target_code, BigDecimal conversion_result) {
}
