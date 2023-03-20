public class Transaction {
    private int id;
    private int number;
    private String date;


    public Transaction(int id, int number, String date) {
        this.id = id;
        this.number = number;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", number=" + number +
                ", date='" + date + '\'' +
                '}';
    }

    public void processDebit(){

    }
}
