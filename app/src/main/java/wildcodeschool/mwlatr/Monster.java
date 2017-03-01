package wildcodeschool.mwlatr;

import java.lang.reflect.Type;
import java.util.jar.Attributes;

/**
 * Created by mathieu on 01/03/17.
 */

public class Monster {

    private String Name;
    private String Element;


    public String getName(){
        return this.Name;
    }

    public String getElement() {
        return this.Element;
    }

    public Monster(String Name, String Element){
        this.Name= Name;
        this.Element= Element;

    }


}
