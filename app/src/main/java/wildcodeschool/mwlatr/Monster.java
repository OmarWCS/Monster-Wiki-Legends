package wildcodeschool.mwlatr;



/**
 * Created by mathieu on 01/03/17.
 */

public class Monster {

    private String Name;
    private int Element;


    public String getMonsterName(){
        return this.Name;
    }

    public int getMonsterElement() {
        return this.Element;
    }

    public Monster(String Name, int Element){
        this.Name= Name;
        this.Element= Element;

    }




}
