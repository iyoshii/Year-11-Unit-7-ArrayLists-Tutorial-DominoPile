import java.util.ArrayList;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile(){
        return pile;
    }

    public void newStack6() {
        pile.clear();
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }

    public void shuffle() {
        int size = pile.size();
        for (int i = 0; i < size; i++) {
            int randomIndex = (int) (Math.random() * size);
            Domino temp = pile.get(i);
            pile.set(i, pile.get(randomIndex));
            pile.set(randomIndex, temp);
        }
    }

}