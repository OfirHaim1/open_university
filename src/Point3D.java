public class Point3D {

    private double _duble_x;
    private double _duble_y;
    private double _duble_z;

    public Point3D() {
        this._duble_x = 0.0;
        this._duble_y = 0.0;
        this._duble_z = 0.0;
    }

    public Point3D(double _duble_x, double _duble_y, double _duble_z) {
        this._duble_x = _duble_x;
        this._duble_y = _duble_y;
        this._duble_z = _duble_z;
    }

    public Point3D(Point3D point) {
        this._duble_x = point.getX();
        this._duble_y = point.getY();
        this._duble_z = point.getZ();
    }

    public double getX() {
        return _duble_x;
    }

    public void setX(double num) {
        this._duble_x = num;
    }

    public double getY() {
        return _duble_y;
    }

    public void setY(double num) {
        this._duble_y = num;
    }

    public double getZ() {
        return _duble_z;
    }

    public void setZ(double num) {
        this._duble_z = num;
    }

    public String toString() {
        return "(" + this._duble_x +","+ this._duble_y +"," + this._duble_z + ")";
    }

    public boolean equals(Point3D other) {
        return this._duble_x == other.getX() && this._duble_y == other.getY() && this._duble_z == other.getZ();
    }

    public boolean isAbove(Point3D other) {
        return this._duble_z > other.getZ();
    }

    public boolean isUnder(Point3D other) {
        return !isAbove(other) && other.getZ() != this._duble_z;
    }

    public boolean isLeft(Point3D other) {
        return this._duble_y < other.getY();
    }

    public boolean isRight(Point3D other) {
        return !isLeft(other) && other.getY() != this._duble_y;
    }

    public boolean isBehind(Point3D other) {
        return this._duble_x < other.getX();
    }

    public boolean isInFrontOf(Point3D other) {
        return !isBehind(other) && other.getZ() != this._duble_z;
    }

    public void move(double dx, double dy, double dz) {
        this._duble_x += dx;
        this._duble_y += dy;
        this._duble_z += dz;
    }

    public double distance(Point3D p) {
        double px = p.getX();
        double py = p.getY();
        double pz = p.getZ();
        return  Math.sqrt(Math.pow(px - this._duble_x,2) + Math.pow(py - this._duble_y,2) + Math.pow(pz - this._duble_z,2));
    }
}
