package experiment.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



/**
 * Generated class that is intended to be used as test driver for class {@link LinkedList}.
 * 
 * @author generated code
 *
 */
public class LinkedListTestDriver {
 
    protected static final Logger logger = Logger.getLogger(LinkedListTestDriver.class.getName());
   
    private static Writer writer;
    static {
    	try {
    	    String seed = System.getProperty("seed", "0");
    		String limit = System.getProperty("limit", "0");
			writer = new FileWriter(String.format("LinkedListTestDriverData_seed%s_limit%s.csv", seed, limit));
			//write header line    
	    	writer.write("size,getFirst,getLast,calledMethod,arguments"+"\n");
	    	writer.flush();
			
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e.getMessage());
		}
    }
    
    private experiment.util.LinkedList classUnderTest;
    

    public boolean add(java.lang.Object arg0) {
	    try {
          return getClassUnderTest().add(arg0);

		} finally {
			writeInternalState("add", new String[]{arg0.toString()});
		}
    }

    public void add(int arg0, java.lang.Object arg1) {
	    try {
          getClassUnderTest().add(arg0,arg1);

		} finally {
			writeInternalState("add", new String[]{java.lang.Integer.toString(arg0),arg1.toString()});
		}
    }

    public boolean remove(java.lang.Object arg0) {
	    try {
          return getClassUnderTest().remove(arg0);

		} finally {
			writeInternalState("remove", new String[]{arg0.toString()});
		}
    }

    public java.lang.Object remove(int arg0) {
	    try {
          return getClassUnderTest().remove(arg0);

		} finally {
			writeInternalState("remove", new String[]{java.lang.Integer.toString(arg0)});
		}
    }

    public void clear() {
	    try {
          getClassUnderTest().clear();

		} finally {
			writeInternalState("clear", new String[]{});
		}
    }

    public java.lang.Object set(int arg0, java.lang.Object arg1) {
	    try {
          return getClassUnderTest().set(arg0,arg1);

		} finally {
			writeInternalState("set", new String[]{java.lang.Integer.toString(arg0),arg1.toString()});
		}
    }

    public void addFirst(java.lang.Object arg0) {
	    try {
          getClassUnderTest().addFirst(arg0);

		} finally {
			writeInternalState("addFirst", new String[]{arg0.toString()});
		}
    }

    public void addLast(java.lang.Object arg0) {
	    try {
          getClassUnderTest().addLast(arg0);

		} finally {
			writeInternalState("addLast", new String[]{arg0.toString()});
		}
    }

    public java.lang.Object removeFirst() {
	    try {
          return getClassUnderTest().removeFirst();

		} finally {
			writeInternalState("removeFirst", new String[]{});
		}
    }

    public java.lang.Object removeLast() {
	    try {
          return getClassUnderTest().removeLast();

		} finally {
			writeInternalState("removeLast", new String[]{});
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
	   		state.add(java.lang.Integer.toString(getClassUnderTest().size()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getClassUnderTest().getFirst().toString());
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getClassUnderTest().getLast().toString());
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
	     
	     
    protected experiment.util.LinkedList getClassUnderTest() {
        if(classUnderTest == null) {
            classUnderTest = new experiment.util.LinkedList();
        }
        return classUnderTest;
    }

}
