public class Rooms {
    private int id;
    private String details;
    private String date;

    public Rooms(int id, String details, String date) {
        this.id = id;
        this.details = details;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public void update(){

    }
}
