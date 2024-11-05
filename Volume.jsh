public class Volume {
    // Method to calculate the volume of a sphere given its diameter
    public static double sphere(double d) {
        double radius = d / 2;  // The radius is half of the diameter
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);  // Volume formula: (4/3) * π * r^3
    }
}
