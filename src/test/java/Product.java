public class Product {
    String name;
    String productionDate;
    String manufacturer;
    String countyOfOrigin;
    String price;
    String reservationStatus;

    public Product(String name, String productionDate, String manufacturer, String countyOfOrigin, String price, String reservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countyOfOrigin = countyOfOrigin;
        this.price = price;
        this.reservationStatus = reservationStatus;
    }

    @Override
    public  String toString() {
        return "Product: " +
                "name='" + name + '\'' +
                ", productionDate='" + productionDate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", countyOfOrigin='" + countyOfOrigin + '\'' +
                ", price='" + price + '\'' +
                ", reservationStatus='" + reservationStatus + '\'';
    }
}

