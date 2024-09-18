public class TestRectangle {
    

    public static void main(String [] args) {
        Rectangle r1 = new Rectangle(3,7);

        Rectangle r2 = new Rectangle(4,5);

        System.out.println("Rectangle 1 Area: " + r1.getArea());
        System.out.println("Rectangle 2 Area: " + r2.getArea());
        System.out.println("Rectangle 1 Permieter: " + r1.getPerimeter());
        System.out.println("Rectangle 2 Permieter: " + r2.getPerimeter());
    }
}
