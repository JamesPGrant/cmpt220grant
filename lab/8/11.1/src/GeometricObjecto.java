import java.util.Date;

public class GeometricObjecto {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObjecto() {
		dateCreated = new Date();
	}
	
	public GeometricObjecto(String color, boolean filled) {
		super();
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "Object created on " + this.dateCreated;
	}
	
}
