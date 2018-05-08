import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class RLE {

    public static void compress(InputStream is, OutputStream os) throws Exception {

        int current;
        int last = -1;
        int count = 1;


        while ((current = is.read()) != -1) {

            if (count == 257){
                os.write(count - 2);
                count = 1;
                os.write(current);
                continue;
            }

            if (count == 1) {
                os.write(current);
            }

            if (last == current){
                count++;
            }

            if (last != current && count > 1){
                os.write(count - 2);
                os.write(current);

                count = 1;
            }
            last = current;
        }

        if (count != 1 ){
            os.write(count - 2);
        }

        os.flush();
        os.close();

    }

    public static void decompress(InputStream is, OutputStream os) throws Exception {

        int current;
        int last = -1;
        int count = 1;


        while ((current = is.read()) != -1) {



        os.flush();
        os.close();

    }
}
}
