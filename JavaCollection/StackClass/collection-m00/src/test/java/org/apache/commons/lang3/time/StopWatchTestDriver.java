package org.apache.commons.lang3.time;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



/**
 * Generated class that is intended to be used as test driver for class {@link StopWatch}.
 * 
 * @author generated code
 *
 */
public class StopWatchTestDriver {
 
    protected static final Logger logger = Logger.getLogger(StopWatchTestDriver.class.getName());
   
    private static Writer writer;
    static {
    	try {
    	    String seed = System.getProperty("seed", "0");
    		String limit = System.getProperty("limit", "0");
			writer = new FileWriter(String.format("StopWatchTestDriverData_seed%s_limit%s.csv", seed, limit));
			//write header line    
	    	writer.write("toString,getTime,getSplitTime,isStarted,getStartTime,toSplitString,isStopped,getNanoTime,getSplitNanoTime,isSuspended,calledMethod,arguments"+"\n");
	    	writer.flush();
			
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e.getMessage());
		}
    }
    
    private org.apache.commons.lang3.time.StopWatch classUnderTest;
    

    public void split() {
	    try {
          getClassUnderTest().split();

		} finally {
			writeInternalState("split", new String[]{});
		}
    }

    public void start() {
	    try {
          getClassUnderTest().start();

		} finally {
			writeInternalState("start", new String[]{});
		}
    }

    public void resume() {
	    try {
          getClassUnderTest().resume();

		} finally {
			writeInternalState("resume", new String[]{});
		}
    }

    public void stop() {
	    try {
          getClassUnderTest().stop();

		} finally {
			writeInternalState("stop", new String[]{});
		}
    }

    public void suspend() {
	    try {
          getClassUnderTest().suspend();

		} finally {
			writeInternalState("suspend", new String[]{});
		}
    }

    public void reset() {
	    try {
          getClassUnderTest().reset();

		} finally {
			writeInternalState("reset", new String[]{});
		}
    }

    public void unsplit() {
	    try {
          getClassUnderTest().unsplit();

		} finally {
			writeInternalState("unsplit", new String[]{});
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
	   		state.add(getClassUnderTest().toString());
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Long.toString(getClassUnderTest().getTime()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Long.toString(getClassUnderTest().getSplitTime()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Boolean.toString(getClassUnderTest().isStarted()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Long.toString(getClassUnderTest().getStartTime()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getClassUnderTest().toSplitString().toString());
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Boolean.toString(getClassUnderTest().isStopped()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Long.toString(getClassUnderTest().getNanoTime()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Long.toString(getClassUnderTest().getSplitNanoTime()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Boolean.toString(getClassUnderTest().isSuspended()));
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
	     
	     
    protected org.apache.commons.lang3.time.StopWatch getClassUnderTest() {
        if(classUnderTest == null) {
            classUnderTest = new org.apache.commons.lang3.time.StopWatch();
        }
        return classUnderTest;
    }

}
