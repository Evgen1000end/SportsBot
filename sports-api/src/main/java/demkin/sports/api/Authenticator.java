package demkin.sports.api;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.core.Response;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description of ru.demkin.sports.api
 *
 * @author evgen1000end
 * @since 22.05.2016
 */
public class Authenticator extends SportsHttp {

    private final static String AUTH_ENDPOINT = "ajax/user/site_authorization.html";

    ObjectMapper mapper = new ObjectMapper();

    private String login;
    private String password;


    private String buildCookies(Response response){
        List<Object> objects = response.getHeaders().get("Set-Cookie");

        String cookie = "";

        List<HttpCookie> suid = HttpCookie.parse((String) objects.get(1));
        List<HttpCookie> sid = HttpCookie.parse((String) objects.get(3));
        List<HttpCookie> rm_sid = HttpCookie.parse((String) objects.get(5));
        List<HttpCookie> rm_suida = HttpCookie.parse((String) objects.get(0));

        cookie+=suid.get(0).getName()+"="+suid.get(0).getValue()+"; ";
        cookie+=sid.get(0).getName()+"="+sid.get(0).getValue()+"; ";
        cookie+=rm_sid.get(0).getName()+"="+rm_sid.get(0).getValue()+"; ";
        cookie+=rm_suida.get(0).getName()+"="+rm_suida.get(0).getValue()+"; ";

        return cookie;
    }


    public Authenticator(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public AuthData auth() throws Exception{
        Map<String, String> map = new HashMap<>();
        map.put("login", login);
        map.put("password", password);
        map.put("remember_me","on");
        map.put("back_url","/logon.html");
        map.put("join","1");

        Response response = invoker.post(AUTH_ENDPOINT,map);
        authData =  mapper.readValue(response.readEntity(String.class), AuthData.class);

        authData.setAuthCookie(buildCookies(response));
        return authData;
    }



}
