public class IllegalTriangleException extends Exception {
    private String messange;

    public IllegalTriangleException (String messange){
        super(messange);
        this.messange = messange;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
