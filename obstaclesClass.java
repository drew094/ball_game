class Obstacles extends JComponent{
	private float xCoord;
	private float yCoord;
	
	//create a timer or use a timer that stays up
	// for 5000(any amount of time) and then 
	//deletes the object
	private Timer timer;
	private TimerTask timerStart = new TimerTaskDraw();
	private TimerTask timerErase = new TimerTaskErase();
	
	void Obstacles() {
		//paintShape();
		//I think this is how we would get it to start the timer and after 5000(or whatever)
		//milliseconds it will paint a shape
		timer = new Timer(true);
		timer.scheduleAtFixedRate(timerStart, 5000, 5000)
	}
	//paint a shape at a random location
	void paintShape(){
		//set the X coordinate and Y coordinate at random
		this.setXcoord(Math.random() * 799);
		this.setYcoord(Math.random() * 799);
		
		//we can implement this if we want to add more shapes at random
		// //and we can also fix the random thing down there to make it more specific
		// //to the number of shapes we want
		/*switch((int)(Math.random() * 3)) {*/
			//make a rect then after 5 seconds erase it
			/*case 0:*/ this.drawRect(xCoord, yCoord, 30, 15);
						timer.schedule(timerErase, 5000);
						//break;
			//case 1: this.drawOval(xCoord,yCoord, getHeight()/20, getWidth()/20);
			//default: this.drawPolygon(...);
		//}
		
	}
	
	void setXcoord(float rando) {
		this.xCoord = rando;
	}
	
	void setYcoord(float rando) {
		this.yCoord = rando;
	}

	class TimerTaskDraw extends TimerTask{
		
		@Override
		public void run() {
			paintShape();
		}//run function
	}//timerTaskDraw
	
	class TimerTaskErase extends TimerTask{
		
		@Override
		public void run() {
			this.clearRect(xCoord, yCoord, 30, 15);
		}//run function
	}//timerTaskErase
}//obstacles class
