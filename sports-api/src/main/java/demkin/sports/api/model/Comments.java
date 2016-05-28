package demkin.sports.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Description of ru.demkin.sports.api.model
 *
 * @author evgen1000end
 * @since 22.05.2016
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comments {

    private String status;




    @Override
    public String toString() {
        return "Comments{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }

    private CommentsData data;


    public Comments() {
            }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CommentsData getData() {
        return data;
    }

    public void setData(CommentsData data) {
        this.data = data;
    }

}
