package ie.atu.Week5;

public class Counter {
    private int countValue;

    public Counter() {
        countValue = 0;
    }

    public Counter(int startingValue) {
        if (startingValue > 5) {
            countValue = startingValue;
        } else {
            throw new IllegalArgumentException("This is not a valid number");
        }
    }
//increment method
        public int increment()
        {
            countValue++;
            return countValue;
        }

}
