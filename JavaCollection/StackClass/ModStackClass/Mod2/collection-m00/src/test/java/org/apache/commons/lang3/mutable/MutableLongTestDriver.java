package org.apache.commons.lang3.mutable;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



/**
 * Generated class that is intended to be used as test driver for class {@link MutableLong}.
 * 
 * @author generated code
 *
 */
public class MutableLongTestDriver {
 
    protected static final Logger logger = Logger.getLogger(MutableLongTestDriver.class.getName());
   
    private static Writer writer;
    static {
    	try {
    	    String seed = System.getProperty("seed", "0");
    		String limit = System.getProperty("limit", "0");
			writer = new FileWriter(String.format("MutableLongTestDriverData_seed%s_limit%s.csv", seed, limit));
			//write header line    
	    	writer.write("toString,hashCode,intValue,longValue,floatValue,doubleValue,getValue,getAndDecrement,getAndIncrement,toLong,calledMethod,arguments"+"\n");
	    	writer.flush();
			
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e.getMessage());
		}
    }
    
    private org.apache.commons.lang3.mutable.MutableLong classUnderTest;
    

    public void add(long arg0) {
	    try {
          getClassUnderTest().add(arg0);

		} finally {
			writeInternalState("add", new String[]{java.lang.Long.toString(arg0)});
		}
    }

    public void add(java.lang.Number arg0) {
	    try {
          getClassUnderTest().add(arg0);

		} finally {
			writeInternalState("add", new String[]{arg0.toString()});
		}
    }

    public void increment() {
	    try {
          getClassUnderTest().increment();

		} finally {
			writeInternalState("increment", new String[]{});
		}
    }

    public void setValue(long arg0) {
	    try {
          getClassUnderTest().setValue(arg0);

		} finally {
			writeInternalState("setValue", new String[]{java.lang.Long.toString(arg0)});
		}
    }

    public void setValue(java.lang.Number arg0) {
	    try {
          getClassUnderTest().setValue(arg0);

		} finally {
			writeInternalState("setValue", new String[]{arg0.toString()});
		}
    }

    public long getAndAdd(long arg0) {
	    try {
          return getClassUnderTest().getAndAdd(arg0);

		} finally {
			writeInternalState("getAndAdd", new String[]{java.lang.Long.toString(arg0)});
		}
    }

    public long getAndAdd(java.lang.Number arg0) {
	    try {
          return getClassUnderTest().getAndAdd(arg0);

		} finally {
			writeInternalState("getAndAdd", new String[]{arg0.toString()});
		}
    }

    public long decrementAndGet() {
	    try {
          return getClassUnderTest().decrementAndGet();

		} finally {
			writeInternalState("decrementAndGet", new String[]{});
		}
    }

    public long incrementAndGet() {
	    try {
          return getClassUnderTest().incrementAndGet();

		} finally {
			writeInternalState("incrementAndGet", new String[]{});
		}
    }

    public void decrement() {
	    try {
          getClassUnderTest().decrement();

		} finally {
			writeInternalState("decrement", new String[]{});
		}
    }

    public void subtract(java.lang.Number arg0) {
	    try {
          getClassUnderTest().subtract(arg0);

		} finally {
			writeInternalState("subtract", new String[]{arg0.toString()});
		}
    }

    public void subtract(long arg0) {
	    try {
          getClassUnderTest().subtract(arg0);

		} finally {
			writeInternalState("subtract", new String[]{java.lang.Long.toString(arg0)});
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
	   		state.add(java.lang.Integer.toString(getClassUnderTest().hashCode()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Integer.toString(getClassUnderTest().intValue()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Long.toString(getClassUnderTest().longValue()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Float.toString(getClassUnderTest().floatValue()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Double.toString(getClassUnderTest().doubleValue()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getClassUnderTest().getValue().toString());
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Long.toString(getClassUnderTest().getAndDecrement()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(java.lang.Long.toString(getClassUnderTest().getAndIncrement()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getClassUnderTest().toLong().toString());
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
	     
	     
    protected org.apache.commons.lang3.mutable.MutableLong getClassUnderTest() {
        if(classUnderTest == null) {
            classUnderTest = new org.apache.commons.lang3.mutable.MutableLong();
        }
        return classUnderTest;
    }

}
