public class Main {
    public static void main(String[] args) {
            try {
                Triangle a = new Triangle(2, 4, 3);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
    }

