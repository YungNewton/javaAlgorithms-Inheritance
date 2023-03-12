public class Point {
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        double i = (this.x*y) - (this.x*x);
        double fi = i * i;
        double g = (this.y*y) - (this.y*x);
        double ge = g * g;
        double  distance = Math.sqrt(fi + ge);
        return distance;
    }
    public double distance(int x, int y){
        int f = this.x-x;
        int j = this.y-y;
        double i = (f*j)-(f*f);
        double g = (j*j)-(j*f);
        double distance = Math.sqrt((i*i)+(g*g));

        return distance;
    }
    public double distance(Point another){
        //Point point = new Point()
        return distance(another.x,another.y);
    }
}
