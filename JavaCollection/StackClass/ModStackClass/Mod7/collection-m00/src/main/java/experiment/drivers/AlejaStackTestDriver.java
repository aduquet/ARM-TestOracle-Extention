package experiment.drivers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AlejaStackTestDriver {

    protected static final Logger logger = Logger.getLogger(AlejaStackTestDriver.class.getName());
    private static Writer writer;
    static {
        try {
            String seed = System.getProperty("seed", "0");
            String limit = System.getProperty("limit", "0");
            writer = new FileWriter(String.format("Mod7_StackTestDriver_seed%s_limit%s.csv", seed, limit));
            writer.write("testId,instanceId,size,isEmpty,peek,peek_obj_type,calledMethod,arguments"+"\n");
            writer.flush();
        } catch (IOException e) {
                throw new ExceptionInInitializerError(e.getMessage());
            }
        }

    private experiment.util.Stack classUnderTest;
    private String instanceId;
    private String testId;

    public AlejaStackTestDriver() {
        this.classUnderTest = new experiment.util.Stack();
        this.instanceId = String.valueOf(java.time.Instant.now().toEpochMilli()+":"+java.util.UUID.randomUUID().toString());
        this.testId = System.getProperty("testId", "unknown");
        writeInternalState("CTOR", new String[0]);
    }

    public void clear() {
        try {
            getClassUnderTest().clear();
        } finally {
            writeInternalState("clear", new String[]{});
        }
    }

    public java.lang.Object pop() {
        try {
            return getClassUnderTest().pop();
        } finally {
            writeInternalState("pop", new String[]{});
        }
    }
    public java.lang.Object push(java.lang.Object arg0) {
        try {
            return getClassUnderTest().push(arg0);
        } finally {
            writeInternalState("push", new String[]{arg0.toString()});
        }
    }
    private void writeInternalState(String methodName, String[] parametersAsString)  {
        String internalState =  getInternalState(methodName, parametersAsString);
        if(writer == null) return;
        try {
            writer.write(internalState);
            writer.append("\r\n");
            writer.flush();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private String getInternalState(String methodName, String[] parametersAsString) {
        List<String> state = new ArrayList<>();
        //todo add test identifier
        state.add(testId);
        state.add(instanceId);
        state.add(java.lang.Integer.toString(getClassUnderTest().size()));
        state.add(java.lang.Boolean.toString(getClassUnderTest().isEmpty()));
        Object myStackHead = "EmptyObject";

        try {
            myStackHead = getClassUnderTest().peek();
        } catch (experiment.util.EmptyStackException e) {
            //e.printStackTrace();
        }
        state.add(myStackHead.toString());
        state.add(myStackHead.getClass().toString());
        state.add(methodName);

        return String.join(",", state);
    }
    protected experiment.util.Stack getClassUnderTest() {
        if(classUnderTest == null) {
            classUnderTest = new experiment.util.Stack();
        }
        return classUnderTest;
    }
}
