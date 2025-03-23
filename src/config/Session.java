package config;

public class Session {
    
    private static Session instance;
    private int id;
    private String fname;
    private String email;
    private String address;
    private String username;
    private String type;
    
    private Session(){
        //Private cons.prevents instance
    }

    public static synchronized Session getInstance() {
        if (instance == null){
            instance = new Session();
        }
        return instance;
    }

    public static boolean isInstanceEmpty() {
        return instance == null;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        return id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
