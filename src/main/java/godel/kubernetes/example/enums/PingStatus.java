package godel.kubernetes.example.enums;

/**
 * @author Andrey
 */
public enum  PingStatus {
    OK("200 OK");



    private String code;

    PingStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
