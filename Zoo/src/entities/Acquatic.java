package tn.esprit.entities;

public abstract class Acquatic extends Animal{

    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Acquatic(){

     }

    public Acquatic(String name , String family, int age ,boolean isMammal ,String habitat){

        super(family, name, age, isMammal);
        this.habitat=habitat;

    }

    @Override
    public String toString() {
        return super.toString()+"Acquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

    public abstract void swim();


    @Override
    public boolean equals(Object obj) {
        //1
        if(this==obj)return true;
        //2
        if(obj==null)return false;
        //3
       // if(obj.getClass()==Acquatic.class){ -> return false getClass() => la classe au meme de l'execution

        if(obj instanceof Acquatic){

            Acquatic a = (Acquatic) obj;
            if(a.getHabitat()==this.getHabitat()&&a.getName()==this.getName()&&a.getAge()==this.getAge()){
                return true;
            }

        }
      return false;
    }
}
