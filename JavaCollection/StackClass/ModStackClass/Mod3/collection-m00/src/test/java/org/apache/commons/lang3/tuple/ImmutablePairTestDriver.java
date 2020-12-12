package org.apache.commons.lang3.tuple;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



/**
 * Generated class that is intended to be used as test driver for class {@link ImmutablePair}.
 * 
 * @author generated code
 *
 */
public class ImmutablePairTestDriver {
 
    protected static final Logger logger = Logger.getLogger(ImmutablePairTestDriver.class.getName());
   
    private static Writer writer;
    static {
    	try {
    	    String seed = System.getProperty("seed", "0");
    		String limit = System.getProperty("limit", "0");
			writer = new FileWriter(String.format("ImmutablePairTestDriverData_seed%s_limit%s.csv", seed, limit));
			//write header line    
	    	writer.write("getLeft,getRight,calledMethod,arguments"+"\n");
	    	writer.flush();
			
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e.getMessage());
		}
    }
    
    private org.apache.commons.lang3.tuple.ImmutablePair<String, String> classUnderTest;
    

    public String setValue(String arg0) {
	    try {
          return getClassUnderTest().setValue(arg0);

		} finally {
			writeInternalState("setValue", new String[]{arg0.toString()});
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
	   		state.add(getClassUnderTest().getLeft().toString());
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getClassUnderTest().getRight().toString());
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
	     
	     
    protected org.apache.commons.lang3.tuple.ImmutablePair<String, String> getClassUnderTest() {
        if(classUnderTest == null) {
            classUnderTest = new org.apache.commons.lang3.tuple.ImmutablePair(null, null);
        }
        return classUnderTest;
    }

}
