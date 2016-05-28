package demkin.sports.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Description of ru.demkin.sports.api.model
 *
 * @author evgen1000end
 * @since 22.05.2016
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {


    private String id;

    private Rating rating;

    private boolean voteable;

    private String text;



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean isVoteable() {
        return voteable;
    }

    private boolean editable;

    public void setVoteable(boolean voteable) {
        this.voteable = voteable;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", rating=" + rating +
                ", voteable=" + voteable +
                ", text='" + text + '\'' +
                ", editable=" + editable +
                ", user=" + user +
                '}';
    }
}
