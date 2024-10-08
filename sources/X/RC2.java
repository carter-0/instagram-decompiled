package X;

import android.content.SharedPreferences;
import java.io.ByteArrayOutputStream;

public final class RC2 extends ByteArrayOutputStream {
    public final SharedPreferences A00;
    public final String A01;

    public RC2(SharedPreferences sharedPreferences, String str) {
        this.A00 = sharedPreferences;
        this.A01 = str;
    }

    public final void close() {
        super.close();
        SharedPreferences.Editor edit = this.A00.edit();
        String str = this.A01;
        StringBuilder A14 = Pxe.A14(r4 * 2);
        for (byte b : toByteArray()) {
            byte b2 = b & 255;
            if (b2 < 16) {
                A14.append('0');
            }
            A14.append(Integer.toHexString(b2));
        }
        Pxf.A13(edit, str, A14.toString().toUpperCase());
    }
}
