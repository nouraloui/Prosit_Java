package tn.esprit.entities;

public class Penguin extends Acquatic{

    private float swimmingdepth;

    public float getSwimmingdepth() {
        return swimmingdepth;
    }

    public void setSwimmingdepth(float swimmingdepth) {
        this.swimmingdepth = swimmingdepth;
    }


    public  Penguin (){


    }

    @Override
    public void swim() {
        System.out.println("Penguin is Swimming");
    }


    public Penguin(String name, String family, int age, boolean isMammal, String habitat, float swimmingdepth) {
        super(name, family, age, isMammal, habitat);
        this.swimmingdepth = swimmingdepth;
    }
}

