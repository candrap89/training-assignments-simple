package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

   // private static final Nationality DUTCH = null;
	private static final Nationality GERMAN = null;
	private static final Nationality BELGIAN = null;
	private static final Nationality FRENCH = null;
	private static final Nationality ITALIAN = null;
	private static final Nationality DUTCH = null;
	
    
    private static Map<Nationality, List<Color>> FLAG = new HashMap<Nationality, List<Color>>();

    static {
    	FLAG.put(DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
    	FLAG.put(GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
    	FLAG.put(BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
    	FLAG.put(FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
    	FLAG.put(ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
    }
    
    public List<Color> getFlagColors(Nationality nationality){
    	List<Color> colors = FLAG.get(nationality);
    	return colors != null ? colors : Arrays.asList(Color.GRAY);
    }
    
    

}