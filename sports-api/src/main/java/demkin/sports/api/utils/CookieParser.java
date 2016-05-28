package demkin.sports.api.utils;

import javax.ws.rs.core.MultivaluedMap;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description of ru.demkin
 *
 * @author evgen1000end
 * @since 22.05.2016
 */
public class CookieParser {

        //TODO - sports сбивает куки, может быть это моя проблема?
        public static Map<String, Object> parseMailformedCookieResponse(MultivaluedMap<String, Object> headers){

            Map<String, Object> cookies = new HashMap<>();

            List<Object> objects = headers.get("Set-Cookie");

           // HttpCookie suid =  HttpCookie.parse((String) objects.get(0));


            //String setCookies = headers.get("Set-Cookie");

            List<HttpCookie> suid = HttpCookie.parse((String) objects.get(1));
            List<HttpCookie> sid = HttpCookie.parse((String) objects.get(3));
            List<HttpCookie> rm_sid = HttpCookie.parse((String) objects.get(5));
            List<HttpCookie> rm_suida = HttpCookie.parse((String) objects.get(0));

            cookies.put(suid.get(0).getName(), suid.get(0).getValue());
            cookies.put(sid.get(0).getName(), sid.get(0).getValue());
            cookies.put(rm_sid.get(0).getName(), rm_sid.get(0).getValue());
            cookies.put(rm_suida.get(0).getName(), rm_suida.get(0).getValue());
            return cookies;
        }


        public static String cookieString(Map<String, Object> cookies){

            String res="";

            for (Map.Entry<String, Object> entry:cookies.entrySet()
                 ) {
                res+=entry.getKey()+"="+(String)entry.getValue()+"; ";
            }

            return res;
        }

}
