package demkin.sports.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Description of ru.demkin.sports.api.model
 *
 * @author evgen1000end
 * @since 22.05.2016
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String id;

    private String name;
    private String img;

    private int stars;

    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", stars=" + stars +
                ", rating=" + rating +
                '}';
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
