package tn.esprit.entities;

public class Dolphin extends Acquatic{
    private int swimmingSpeed;

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(String name, String family, int age, boolean isMammal, String habitat, int swimmingSpeed) {
        super(name, family, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(){

    }

    @Override
    public String toString() {
        return super.toString() +" SwimmingSpeed "+this.swimmingSpeed;
    }

    public void swim(){
        System.out.println("Dolphin is swimming");
    }
}
