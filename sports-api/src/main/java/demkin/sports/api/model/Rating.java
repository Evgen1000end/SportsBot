package demkin.sports.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Description of ru.demkin.sports.api.model
 *
 * @author evgen1000end
 * @since 22.05.2016
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rating {

    private int plus;
    private int minus;

    private String current_user_vote;

    public Rating() {
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }

    public int getMinus() {
        return minus;
    }

    public void setMinus(int minus) {
        this.minus = minus;
    }

    public String getCurrent_user_vote() {
        return current_user_vote;
    }

    public void setCurrent_user_vote(String current_user_vote) {
        this.current_user_vote = current_user_vote;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "plus=" + plus +
                ", minus=" + minus +
                ", current_user_vote='" + current_user_vote + '\'' +
                '}';
    }
}
