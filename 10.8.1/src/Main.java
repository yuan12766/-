public class Main {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("圆 c1 的面积: " + c1.getArea());
        System.out.println("圆 c1 的周长: " + c1.getPerimeter());
        System.out.println("c1 包含点 (3, 3): " + c1.contains(3, 3));
        System.out.println("c1 包含圆 (4, 5, 10.5): " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1 与圆 (3, 5, 2.3) 重叠: " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
