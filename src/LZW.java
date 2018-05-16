import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;

public class LZW {

    public static void compress(InputStream is, OutputStream os) throws Exception {

        Token[] tk = new Token[255];


        int current;
        int index = -1;

        while ((current = is.read()) != -1) {
            int ind = search(tk, current, index);





        }
    }

    private static int search(Token[] tokens, int i, int index) {
        for (int j = 0; j < tokens.length; j++) {

        }

    }


    public static void decompress(InputStream is, OutputStream os) throws Exception {

    }
}
