import java.util.Random;
public class NoGarbage {
    public static void main(String[] args) {
        int fileSize = 100000;
        byte[] inputBytes = new byte[fileSize];
        new Random().nextBytes(inputBytes);
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(fileSize);
        for (byte b : inputBytes) {
            sb.append((char) b);
        }
        String outputString = sb.toString();
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));

    }
}