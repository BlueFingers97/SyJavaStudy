package my.study;

public class Collection3_1 {

    int won;
    String flavor;

    public Collection3_1 (int won, String flavor) {
        this.won = won;
        this.flavor = flavor;
    }

    @Override
    public boolean equals(Object obj) {

        Collection3_1 order = (Collection3_1) obj;

        if(order.won == this.won) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

    }

}
