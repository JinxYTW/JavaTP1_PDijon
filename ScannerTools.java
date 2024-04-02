import java.util.Scanner;

public class ScannerTools {
    private Scanner scanner;

    ScannerTools() {
        this.scanner = new Scanner(System.in);
    }

    int nextInt() {
        return this.scanner.nextInt();
    }

    double nextDouble() {
        return this.scanner.nextDouble();
    }
}
