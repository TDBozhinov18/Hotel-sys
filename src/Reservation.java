public class Reservation {
    private int id;
    private String amount;
    private String data;
    private String receipt;


    public Reservation(int id, String amount, String data, String receipt) {
        this.id = id;
        this.amount = amount;
        this.data = data;
        this.receipt = receipt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", amount='" + amount + '\'' +
                ", data='" + data + '\'' +
                ", receipt='" + receipt + '\'' +
                '}';
    }

    public void update(){

    }
}
