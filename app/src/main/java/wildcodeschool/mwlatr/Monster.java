package wildcodeschool.mwlatr;




class Monster {

    public String toString(){
        return this.MonsterName+ " " + this.ElementImage;
    }

    private String MonsterName;
    private int ElementImage;


    Monster(String Name, int ElementImage){


        this.MonsterName= Name;
        this.ElementImage= ElementImage;}


        public String getMonsterName(){
            return this.MonsterName;}

        public int getElementImage(){
            return this.ElementImage;}


    }
