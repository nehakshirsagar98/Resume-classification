package com.pdf;



import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

import com.constant.ServerConstants;

public class PythonCaller {

	public static void main(String[] args) throws ScriptException, IOException {
	//	String fileName = "ResumeClassify.py";

	    StringWriter writer = new StringWriter(); //ouput will be stored here

	    ScriptEngineManager manager = new ScriptEngineManager();
	    ScriptContext context = new SimpleScriptContext();

	    context.setWriter(writer); //configures output redirection
	    ScriptEngine engine = manager.getEngineByName("python");
	    engine.eval(new FileReader(ServerConstants.RESUME_PY), context);
	    System.out.println("Output>>"+writer.toString()); 
	}
}