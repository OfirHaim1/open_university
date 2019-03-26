public class Box3d {

    private Point3D _base;
    private int _length;
    private int _width;
    private int _height;


    public Box3d() {
        this._base = new Point3D(0.0, 0.0, 0.0);
        this._length = 1;
        this._width = 1;
        this._height = 1;
    }

    public Box3d(Point3D _base, int _length, int _width, int _height) {
        this._base = _base;
        this._length = _length > 0 ? _length : 1;
        this._width = _width > 0 ? _width : 1;
        this._height = _height > 0 ? _height : 1;
    }

    public Box3d(Box3d box3d) {
        this._base = box3d._base;
        this._width = box3d._width;
        this._height = box3d._height;
        this._length = box3d._length;
    }

    public Point3D getBase() {
        return _base;
    }

    public int getLength() {
        return _length;
    }

    public int getWidth() {
        return _width;
    }

    public int getHeight() {
        return _height;
    }

    public void setBase(Point3D _base) {
        this._base = _base;
    }

    public void setLength(int _length) {
        if (_length > 0) {
            this._length = _length;
        }
    }

    public void setWidth(int _width) {
        this._width = _width;
    }

    public void setHeight(int _height) {
        this._height = _height;
    }


}



