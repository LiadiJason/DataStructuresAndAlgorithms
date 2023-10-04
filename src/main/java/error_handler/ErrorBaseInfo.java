package error_handler;

/**
 * @author LiadiJason
 * @version $Id: ErrorBaseInfo.java, 2023-08-9:26 AM LiadiJason
 */
public class ErrorBaseInfo {
    private String errorCode;

    private String errorMessage;

    /**
     * Getter method for property errorCode.
     *
     * @return property value of errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property errorCode.
     *
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property errorMessage.
     *
     * @return property value of errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Setter method for property errorMessage.
     *
     * @param errorMessage value to be assigned to property errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
