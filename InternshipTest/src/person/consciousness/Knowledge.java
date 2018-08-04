package person.consciousness;

public class Knowledge {
	public int level;
	
    public Knowledge(int level) {
        //TODO: Implementation is needed
        if (level > 100)
        	this.level = 99;
        else if (level < 0)
        	this.level = 1;
        else
        	this.level = level;
    }
}
