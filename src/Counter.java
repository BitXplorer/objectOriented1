public class Counter {
    private int value;
    int maxLimit;

    public void setLimit(int maximum){

        this.maxLimit = maximum;
        System.out.println("Total limit set to: " + maxLimit);
    }
    public void count(){
        if (value<maxLimit) {
            value++;
            System.out.println("Value added. Total value: " + value);
        } else if(value >= maxLimit){
            System.out.println("Limit exceeded! Total value: " + value);
        }
    }

    public void remove(){
        if(value > 0)
        value--;
        System.out.println("Value removed. Total value: " + value);
    }



    public int getValue(){
        return value;
    }





}
