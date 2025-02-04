package YaipExTp3;

public class Point {
	private int x;
	private int y;
	
	Point() {
		x=65;
		y=25;
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public int getXY() {
		return x+y;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distance(int x, int y) {
		if((x+y)>(this.x+this.y))
			x=(x+y)-(this.x+this.y);
		else
			x=(this.x+this.y)-(x+y);
		return x;
	}
	public double distance(Point oui) {
		if((oui.getX()+oui.getY())>(this.x+this.y))
			x=(oui.getX()+oui.getY())-(this.x+this.y);
		else
			x=(this.x+this.y)-(oui.getX()+oui.getY());
		return x;
	}
	public double distance() {
		return x+y;
	}
}
