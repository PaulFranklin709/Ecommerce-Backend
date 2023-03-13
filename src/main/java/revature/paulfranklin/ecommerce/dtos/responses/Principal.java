package revature.paulfranklin.ecommerce.dtos.responses;

public class Principal {
    private String userId;
    private String username;
    private String token;

    public Principal() {
        super();
    }

    public Principal(String userId, String username, String email, String registered, boolean active, String role) {
        this.userId = userId;
        this.username = username;
        this.token = null;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
