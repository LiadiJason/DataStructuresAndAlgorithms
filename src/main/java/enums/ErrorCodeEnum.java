package enums;

/**
 * @author LiadiJason
 * @version $Id: ErrorCodeEnum.java, 2023-08-9:16 AM LiadiJason
 */
public enum ErrorCodeEnum {
    INDEX_OUT_OF_BOUND("ER000001", "Index Out Of Bounds For Length");

    private final String errorCode;

    private final String errorMessage;

    ErrorCodeEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * Getter method for property errorCode.
     *
     * @return property value of errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Getter method for property errorMessage.
     *
     * @return property value of errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }
}
