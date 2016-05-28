package demkin.sports.api.exceptions;

/**
 * Description of ru.demkin.sports.api.exceptions
 *
 * @author evgen1000end
 * @since 22.05.2016
 */
public class BadAuthException extends RuntimeException {

    public BadAuthException(String message) {
        super(message);
    }
}
