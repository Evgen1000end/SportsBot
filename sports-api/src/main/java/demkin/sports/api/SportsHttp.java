package demkin.sports.api;

import demkin.sports.api.http.HttpJerseyHelper;

/**
 * Description of ru.demkin.sports.api
 *
 * @author evgen1000end
 * @since 22.05.2016
 */
public class SportsHttp {

    protected AuthData authData;

    protected HttpJerseyHelper invoker;

    public SportsHttp() {
        invoker = HttpJerseyHelper.defaultHttp(Constants.DEFAULT_HOST);
    }

    public HttpJerseyHelper getInvoker() {
        return invoker;
    }

    public AuthData getAuthData() {
        return authData;
    }

    public void setAuthData(AuthData authData) {
        this.authData = authData;
    }

    public SportsHttp(AuthData authData) {
        this();
        this.authData = authData;
    }
}
