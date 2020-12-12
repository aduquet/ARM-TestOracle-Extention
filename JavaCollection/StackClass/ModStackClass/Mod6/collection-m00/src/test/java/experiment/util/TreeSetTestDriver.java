package experiment.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



/**
 * Generated class that is intended to be used as test driver for class {@link TreeSet}.
 * 
 * @author generated code
 *
 */
public class TreeSetTestDriver {
 
    protected static final Logger logger = Logger.getLogger(TreeSetTestDriver.class.getName());
   
    private static Writer writer;
    static {
    	try {
    	    String seed = System.getProperty("seed", "0");
    		String limit = System.getProperty("limit", "0");
			writer = new FileWriter(String.format("TreeSetTestDriverData_seed%s_limit%s.csv", seed, limit));
			//write header line    
	    	writer.write("iterator,size,first,comparator,last,calledMethod,arguments"+"\n");
	    	writer.flush();
			
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e.getMessage());
		}
    }
    
    private experiment.util.TreeSet classUnderTest;
    

    public boolean add(java.lang.Object arg0) {
	    try {
          return getClassUnderTest().add(arg0);

		} finally {
			writeInternalState("add", new String[]{arg0.toString()});
		}
    }

    public boolean remove(java.lang.Object arg0) {
	    try {
          return getClassUnderTest().remove(arg0);

		} finally {
			writeInternalState("remove", new String[]{arg0.toString()});
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
	   		state.add(getClassUnderTest().iterator().toString());
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Integer.toString(getClassUnderTest().size()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getClassUnderTest().first().toString());
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getClassUnderTest().comparator().toString());
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getClassUnderTest().last().toString());
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
		state.add(methodName);
		if(parametersAsString.length==0) {
			state.add("NOPARAM");
		} else {
			state.add(String.join("_",parametersAsString));
		}
        return String.join(",", state) + "\n";
     }
	     
	     
    protected experiment.util.TreeSet getClassUnderTest() {
        if(classUnderTest == null) {
            classUnderTest = new experiment.util.TreeSet();
        }
        return classUnderTest;
    }

}
