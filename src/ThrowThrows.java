import java.io.IOException;

class CustomException extends Exception {
    public CustomException(String message) {
//        super(message);
    }
}

public class ThrowThrows {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom exception occurred");
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }

        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    public static void readFile() throws IOException {
        throw new IOException("IOException occurred");
    }
}
