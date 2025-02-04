package YaipExTp3;

public class Line {
	private Point beging;
	private Point end;
	
	Line(int xBeging, int yBeging, int xEnd,int yEnd){
		beging= new Point(xBeging, yBeging);
		end = new Point(xEnd, yEnd);
	}
	Line(Point beging, Point end){
		this.beging=beging;
		this.end=end;
	}
	public Point getBeging() {
		return beging;
	}
	public void setBeging(Point beging) {
		this.beging = beging;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	public int getBegingX() {
		return beging.getX();
	}
	public void setBegingX(int x) {
		this.beging.setX(x);
	}
	public int getEndX() {
		return end.getX();
	}
	public void setEndX(int x) {
		this.end.setX(x);;
	}
	
	public int getBegingY() {
		return beging.getY();
	}
	public void setBegingY(int Y) {
		this.beging.setY(Y);
	}
	public int getEndY() {
		return end.getY();
	}
	public void setEndY(int y) {
		this.end.setY(y);
	}

	public int getBegingXY() {
		return beging.getXY();
	}
	public void setBegingXY(int x, int y) {
		this.beging.setXY(x,y);
	}
	public int getEndXY() {
		return end.getXY();
	}
	public void setEndXY(int x, int y) {
		this.end.setXY(x, y);
	}
	@Override
	public String toString() {
		return "Line [beging=" + beging + ", end=" + end + "]";
	}
	
	public double length() {
		return beging.distance(end);
	}
	
	
	
	
}
