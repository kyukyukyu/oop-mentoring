class Rectangle {
    protected int width;
    protected int height;

    public int getArea() {
        return this.width * this.height;
    }
}

class Square extends Rectangle {
    @Override
    public int getArea() {
        return this.width * this.width;
    }
}
