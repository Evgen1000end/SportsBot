package demkin.sports.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import demkin.sports.api.model.Comments;

import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * Description of ru.demkin.sports.api
 *
 * @author evgen1000end
 * @since 22.05.2016
 */
public class MessageAPI extends SportsHttp {


    private final static String ADD_MESSAGE_ENDPOINT = "api/comment/add.json";
    private final static String ALL_COMMENT_ENDPOINT = "api/comment/get/message.json";


    ObjectMapper mapper = new ObjectMapper();

    public MessageAPI(AuthData authData) {
        super(authData);
    }

    public void addMessage(String newsId,String message){

        Map<String, String> map = new HashMap<>();

        map.put("parent_comment_id", "");
        map.put("message_class", "Sports::News");
        map.put("message_id",newsId);
        map.put("body",message);
        map.put("new_time","1");
        map.put("style","newjs");

        Response response = invoker.post(ADD_MESSAGE_ENDPOINT,map, "Cookie", authData.getAuthCookie());

        System.out.println(response.readEntity(String.class));
    }


    public Comments findAllMessage(String newsId) throws Exception{

        Map<String, String> map = new HashMap<>();

        map.put("order_type", "top10");
        map.put("message_class", "Sports::News");
        map.put("message_id",newsId);
        map.put("limit","100");

        map.put("new_time","1");
        map.put("style","newjs");

        Response response = invoker.post(ALL_COMMENT_ENDPOINT,map, "Cookie", authData.getAuthCookie());

        Comments comments =  mapper.readValue(response.readEntity(String.class), Comments.class);

      //  System.out.println(comments);

        return comments;

    }

}
