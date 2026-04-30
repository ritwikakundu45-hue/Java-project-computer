interface Mango {
    void taste();
}

class Winter implements Mango {
    public void taste() {
        System.out.println("Mango is not available in Winter.");
    }
}


class Summer implements Mango {
    public void taste() {
        System.out.println("Mango tastes sweet and delicious in Summer!");
    }
}

public class MangoTest {
    public static void main(String[] args) {
        Mango m1 = new Winter();
        Mango m2 = new Summer();

        m1.taste();
        m2.taste();
    }
}