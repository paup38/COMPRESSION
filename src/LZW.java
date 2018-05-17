import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LZW {

    public static void compress(InputStream is, OutputStream os) throws Exception {


        List<Token> list = new ArrayList<>();


        int current;
        int index = 0;

        while ((current = is.read()) != -1) {
            int ind = search(list, (byte) current, index);

            if (ind == -1){
                list.add(new Token(index, (byte) current));
                index = 0;
            }else {
                index = ind;
            }
        }


    }

    private static int search(List<Token> list, byte symbol, int index) {
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).getValor() == symbol && list.get(j).getIndex() == index) {
                return j+1;
            }
        }

        return -1;



        /*for (int j = 1; j < tokens.length; j++) {
            if (i == tokens[j].getValor() && tokens.length == 0){
                index = j;
                return index;
            }else {
                return -1;
            }
        }*/

    }


    public static void decompress(InputStream is, OutputStream os) throws Exception {

    }
}
