public class Shaverma {
    public String meat;

    public String pita;
    private boolean hasFreshVegetables = false;

    public void setHasFreshVegetables(boolean hasFreshVegetables) {
        this.hasFreshVegetables = hasFreshVegetables;
    }

    private final int firstNum = 0;
    private final int lastNum = 10;

    public Shaverma(String meat, String pita) {
        this.meat = meat;
        this.pita = pita;
    }

    public boolean isHasFreshVegetables() {
        return hasFreshVegetables;
    }

    public void checkVegetables() {
        int randomNumber = firstNum + (int) (Math.random() * lastNum);

        if(randomNumber >= 5){
            hasFreshVegetables = true;
        } else {
            hasFreshVegetables = false;
        }
    }
    public void makeShaverma(){
        checkVegetables();

        if(hasFreshVegetables) {
            System.out.println("Ваша шаверма с " + meat + " и "  + pita + " готова!");
        }
        else {
            System.out.println("закончились свежие овощи");
        }
    }
}
