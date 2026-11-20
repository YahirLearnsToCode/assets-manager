import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        BigDecimal housePrice = new BigDecimal(100000);
        BigDecimal mopedPrice = new BigDecimal(10000);

        assets.add(new House("Big House", "11-17-2026", housePrice, "85 Broad St", 4, 10, 1));
        assets.add(new Vehicle("Small Car", "11-17-2026", mopedPrice, "Moped thingy", 4, 1000));

        Asset test = new House("Big House", "11-17-2026", housePrice, "85 Broad St", 4, 10, 1);
        System.out.println(((House) test).getAddress());


        for (Asset a : assets) {
            System.out.println(a.getDescription());
            System.out.println(a.getDateAcquired());
            System.out.println(a.getValue());
            System.out.println();

            String message = "";

            if (a instanceof House) {
                House house = (House) a;
                message = "House at " + house.getAddress();
            } else if (a instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) a;
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
            }

            System.out.println(message);
            System.out.println();
        }
    }
}
