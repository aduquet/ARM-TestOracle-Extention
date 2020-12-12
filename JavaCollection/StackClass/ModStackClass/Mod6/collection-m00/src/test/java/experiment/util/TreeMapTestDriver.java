package experiment.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



/**
 * Generated class that is intended to be used as test driver for class {@link TreeMap}.
 * 
 * @author generated code
 *
 */
public class TreeMapTestDriver {
 
    protected static final Logger logger = Logger.getLogger(TreeMapTestDriver.class.getName());
   
    private static Writer writer;
    static {
    	try {
    	    String seed = System.getProperty("seed", "0");
    		String limit = System.getProperty("limit", "0");
			writer = new FileWriter(String.format("TreeMapTestDriverData_seed%s_limit%s.csv", seed, limit));
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e.getMessage());
		}
    }
    
    private experiment.util.TreeMap classUnderTest;
    

    public java.lang.Object remove(java.lang.Object arg0) {
	    try {
          return getClassUnderTest().remove(arg0);

		} finally {
			writeInternalState("remove", new String[]{arg0.toString()});
		}
    }

    public java.lang.Object put(java.lang.Object arg0, java.lang.Object arg1) {
	    try {
          return getClassUnderTest().put(arg0,arg1);

		} finally {
			writeInternalState("put", new String[]{arg0.toString(),arg1.toString()});
		}
    }

    public void clear() {
	    try {
          getClassUnderTest().clear();

		} finally {
			writeInternalState("clear", new String[]{});
		}
    }


	private void writeInternalState(String methodName, String[] parametersAsString)  {
		String internalState =  getInternalState(methodName, parametersAsString);
		if(writer == null) return;
		try {
			writer.write(internalState);
			writer.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

    private String getInternalState(String methodName, String[] parametersAsString) {
   		List<String> state = new ArrayList<>();
    	try {
	   		state.add(java.lang.Boolean.toString(getClassUnderTest().isEmpty()));
	   		state.add(java.lang.Integer.toString(getClassUnderTest().size()));
        } catch (Exception e) {
        	//e.printStackTrace();
        }
		state.add(methodName);
		state.add(String.join("_",parametersAsString));
        return String.join(",", state) + "\n";
     }
	     
	     
    protected experiment.util.TreeMap getClassUnderTest() {
        if(classUnderTest == null) {
            classUnderTest = new experiment.util.TreeMap();
        }
        return classUnderTest;
    }

}

