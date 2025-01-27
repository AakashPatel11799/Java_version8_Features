package in.aakash.stream.practise;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NshronEngineClass {

	public static void main(String[] args) throws Exception {

		ScriptEngine scriptEng = new ScriptEngineManager().getEngineByName("Nashorn");
		scriptEng.eval(new FileReader("src/in/aakash/stream/practise/one.js"));

	}
}
