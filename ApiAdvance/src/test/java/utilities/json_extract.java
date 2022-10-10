package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class json_extract {
	
	public static void nested_array() throws FileNotFoundException, IOException, ParseException
	{
		JSONParser js = new JSONParser();
		       Object a1 = js.parse(new FileReader("./Resourses/TestData"));
		     JSONObject js1 = (JSONObject) a1;
		               
	}

}
