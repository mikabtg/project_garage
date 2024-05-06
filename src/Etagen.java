import java.util.ArrayList;

public class Etagen {
//Attribute
    public ArrayList<Integer> levelArraylist = new ArrayList<>();


//Konstruktor
    Etagen(ArrayList<Integer> level){
        this.levelArraylist = level;
    }

//Getter & Setter
    public ArrayList<Integer> getLevelArraylist(){
       return levelArraylist;
    }


    public void setLevelArraylist(ArrayList<Integer> levelArraylist) {
        this.levelArraylist = levelArraylist;
    }


}
