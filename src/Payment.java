public class Payment {
    private String colletarals;


    public Payment(String colletarals) {
        this.colletarals = colletarals;
    }

    public String getColletarals() {
        return colletarals;
    }

    public void setColletarals(String colletarals) {
        this.colletarals = colletarals;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "colletarals='" + colletarals + '\'' +
                '}';
    }

    public void update(){

    }

    public void add(){

    }
}
