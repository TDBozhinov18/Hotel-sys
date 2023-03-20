public class Hotel_admin {
    private int id;
    private String name;
    private String contactNum;
    private String username;
    private String password;

    public Hotel_admin() {
        this.id = id;
        this.name = name;
        this.contactNum = contactNum;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Hotel_admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNum='" + contactNum + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void create(){

    }

    public void update(){

    }
}
