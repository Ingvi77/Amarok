package is.ru.tictactoe;
import java.util.*;

public class HumanPlayer extends Player {

    // private Scanner reader = new Scanner(System.in); 
    private static Scanner scanner = new Scanner(System.in);
    
    @Override 
    public Point nextMove(){

	String coordinate;
	System.out.print("Enter the coordinate: ");
	coordinate = scanner.next(); 
	System.out.println();

	Point ptn;
	switch(coordinate){
	case "a1":
	    ptn = new Point(0, 0);
	    break;
	case "a2":
	    ptn = new Point(0, 1);
	    break;
	case "a3":
	    ptn = new Point(0, 2);
	    break;
	    
	case "b1":
	    ptn = new Point(1, 0);
	    break;
	case "b2":
	    ptn = new Point(1, 1);
	    break;
	case "b3":
	    ptn = new Point(1, 2);
	    break;
	    
	case "c1":
	    ptn = new Point(2, 0);
	    break;
	case "c2":
	    ptn = new Point(2, 1);
	    break;
	case "c3":
	    ptn = new Point(2, 2);
	    break;
	default:
	    //todo throw an error message if invalid option is spevified
	    ptn = new Point(1, 1); //just to have it initialized. ANY IDEAS HOW TO MAKE THIS BETTER!?
	    break;
	    
	}
	
	return ptn;
	
    }

}
