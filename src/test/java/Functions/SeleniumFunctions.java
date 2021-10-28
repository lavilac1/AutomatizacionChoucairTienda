package Functions;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SeleniumFunctions {

    public static String PagesFilePath= "src/test/resources/Pages/";
    public static String  FileName= "";
    /** Inicializo el log **/
    private static Logger log = Logger.getLogger(SeleniumFunctions.class);


/**Leer el json, y retorna todo el jspon **/
    public static  Object readJson() throws Exception {
        FileReader reader=new FileReader(PagesFilePath + FileName);

        try {
            if (reader!=null){
                JSONParser jsonParser=new JSONParser();
                return jsonParser.parse(reader);
            }else {
                return null;
            }

        }catch (FileNotFoundException|NullPointerException e){ /*Capturar el error si no encuentra el archivo*/
            log.error("ReadEntity: No existe el archivo" + FileName);
            throw new IllegalStateException ("ReadEntity: No existe el archivo" + FileName, e);
        }

    }
/**Acceder a las entidades del json **/
    public static JSONObject ReadEnttity (String element) throws Exception{
        JSONObject Entity= null;
        JSONObject jsonObject = (JSONObject)readJson();
        Entity=(JSONObject) jsonObject.get(element);
        log.info(Entity.toJSONString());
        return Entity;




    }
}
