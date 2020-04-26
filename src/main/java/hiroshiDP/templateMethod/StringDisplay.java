package hiroshiDP.templateMethod;

import com.google.common.base.Utf8;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringDisplay extends AbsatractDisplay {
    private String string;
    private int width;
    public StringDisplay(String string) {
        this.string = string;
//        this.width = string.length();
        this.width = string.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
