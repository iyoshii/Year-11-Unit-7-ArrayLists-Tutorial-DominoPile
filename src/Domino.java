public class Domino {
    private int top;
    private int bottom;

    public Domino(){
        top = 0;
        bottom = 0;
    }

    public Domino(int t, int b){
        this.top = t;
        this.bottom = b;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString(){
        return top + "/" + bottom;
    }

    public void flip(){
        int a = top;
        top = bottom;
        bottom = a;
    }

    public void settle(){
        if(top > bottom){
            flip();
        }
    }

    public int compareTo(Domino other){
        if(this.bottom < other.bottom){
            return -1;
        }
        else if(this.bottom > other.bottom){
            return 1;
        }
        else{
            if(this.top < other.top){
                return -1;
            }
            else if(this.top > other.top){
                return 1;
            }
            else{
                return 0;
            }
        }
    }

    public int compareToWeight(Domino other){
        int thisWeight = top + bottom;
        int otherWeight = other.top + other.bottom;

        if(thisWeight < otherWeight) {
            return -1;
        }
        else if (thisWeight > otherWeight) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public boolean canConnect(Domino other) {
        return (top == other.top || top == other.bottom || bottom == other.top || bottom == other.bottom);
    }
}
