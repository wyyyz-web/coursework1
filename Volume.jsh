// Volume.jsh
// Method to compute the volume of a sphere given its diameter
double sphere(double d) {
    // Calculate the radius
    double r = d / 2.0;
    // Calculate and return the volume using the formula V = (4/3) * π * r^3
    return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
}
