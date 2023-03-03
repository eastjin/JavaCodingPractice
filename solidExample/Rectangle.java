package solidExample;

class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getArea() { return width * height; }
}

class Square extends Rectangle {
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}

//class Square extends Rectangle {
//    public void setWidth(int width) {
//        super.setWidth(width);
//        super.setHeight(width);
//    }
//
//    public void setHeight(int height) {
//        super.setWidth(height);
//        super.setHeight(height);
//    }
//}


class MainSol{
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        int area = rectangle.getArea(); // 예상한 결과와 다른 결과가 나옴
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        System.out.println(area);

    }
}


