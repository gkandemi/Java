package Operations;

import javax.swing.JLabel;

public class Word extends JLabel{
	
	private String text;
	private int point;
	private int velocity;
	private int x_position;
	private int y_position;
	
	public Word(String text, int point, int velocity, int x_position, int y_position) {
		
		super();
		this.text = text;
		this.point = point;
		this.velocity = velocity;
		this.x_position  = x_position;
		this.y_position  = y_position;
		
		/*********** Label Tanimlamasi **************/
		this.setText(text);
		
		
	}
	
	public Word() {
		super();
	}
	
	
//********************** getter ve setter *************************//	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public int getX_position() {
		return x_position;
	}
	public void setX_position(int x_position) {
		this.x_position = x_position;
	}
	public int getY_position() {
		return y_position;
	}
	public void setY_position(int y_position) {
		this.y_position = y_position;
	}
//*******************************************************************//

}
