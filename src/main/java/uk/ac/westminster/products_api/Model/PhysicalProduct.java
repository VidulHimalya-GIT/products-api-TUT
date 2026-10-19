// A PhysicalProduct IS-A Product because it extends Product
// Order


package uk.ac.westminster.products_api.Model;

public class PhysicalProduct extends Product{
    private double weightKg;
    private String dimensions;


    public PhysicalProduct(Long id, String name, double price,String dimensions,double weightKg) {
        super(id, name, price);
        this.dimensions = dimensions;
        this.weightKg = weightKg;
    }

    public PhysicalProduct() {}

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
