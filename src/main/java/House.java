import java.math.BigDecimal;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public BigDecimal getValue() {
        BigDecimal d = BigDecimal.ZERO;

        switch (this.condition) {
            case 1 -> {
                return d = new BigDecimal((180 * this.squareFoot) + .25 * this.lotSize);
            }
            case 2 -> {
                return d = new BigDecimal((130 * this.squareFoot) + .25 * this.lotSize);
            }
            case 3 -> {
                return d = new BigDecimal((90 * this.squareFoot) + .25 * this.lotSize);
            }
            case 4 -> {
                return d = new BigDecimal((80 * this.squareFoot) + .25 * this.lotSize);
            }
            default -> {
                throw new RuntimeException("Condition expected to be a value 1-4");
            }
        }
    }

    public BigDecimal getOriginalValue() {
        return super.getValue();
    }
}