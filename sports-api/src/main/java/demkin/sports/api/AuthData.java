package demkin.sports.api;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Description of ru.demkin.sports.api
 *
 * @author evgen1000end
 * @since 22.05.2016
 */
public class AuthData {

    private String avatar_url;

    private String auth_token;

    private String nick;

    private String auth_domain;

    private String id;

    private String result;


    @JsonIgnore
    private String authCookie;


    public AuthData() {
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getAuth_domain() {
        return auth_domain;
    }

    public void setAuth_domain(String auth_domain) {
        this.auth_domain = auth_domain;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getAuthCookie() {
        return authCookie;
    }

    public void setAuthCookie(String authCookie) {
        this.authCookie = authCookie;
    }
}
