package demkin.sports.api.http;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Description of ru.demkin.sports.api.http
 *
 * @author evgen1000end
 * @since 22.05.2016
 */
public class HttpJerseyHelper {

    private String host;

    private Client client = ClientBuilder.newClient();

    private HttpJerseyHelper(String host) {
        this.host = host;
    }

    public static HttpJerseyHelper defaultHttp(String host) {
        return new HttpJerseyHelper(host);
    }


    private Form buildForm(Map<String, String> formMap){
        Form form = new Form();
        for (Map.Entry<String, String> entry : formMap.entrySet()) {
            form.param(entry.getKey(), entry.getValue());
        }

        return form;
    }

    private MultivaluedMap<String, Object> buildHeaders(Map<String, String> headers){
        return null;
    }

    public Response post(String path, Map<String, String> formMap) {
        WebTarget target = client.target(host).path(path);
        Form form = buildForm(formMap);
        return target.request().post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE), Response.class);
    }

    public Response post(String path, Map<String, String> formMap, MultivaluedMap<String, Object> headers) {
        WebTarget target = client.target(host).path(path);
        Form form = buildForm(formMap);
        return target.request().headers(headers).post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE), Response.class);
    }

    public Response post(String path, Map<String, String> formMap, String headerName, String headerValue) {
        WebTarget target = client.target(host).path(path);
        Form form = buildForm(formMap);
        return target.request().header(headerName, headerValue).post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE), Response.class);
    }


    public Response post(String path, Map<String, String> formMap, String headerName, String headerValue, Map<String, String> param) {
        WebTarget target = client.target(host).path(path);

        for (Map.Entry<String, String> entry : param.entrySet()) {
            target.queryParam(entry.getKey(), entry.getValue());
        }

        Form form = buildForm(formMap);
        return target.request().header(headerName, headerValue).post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE), Response.class);
    }


}
