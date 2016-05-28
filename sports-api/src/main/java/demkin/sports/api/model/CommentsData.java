package demkin.sports.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Description of ru.demkin.sports.api.model
 *
 * @author evgen1000end
 * @since 22.05.2016
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentsData {

    private List<Comment> comments;

    public CommentsData() {
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "CommentsData{" +
                "comments=" + comments +
                '}';
    }
}
