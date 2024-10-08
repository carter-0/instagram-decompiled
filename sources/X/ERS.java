package X;

import java.io.UnsupportedEncodingException;
import java.text.Normalizer;
import java.util.Locale;

public class ERS extends C71271OhC {
    public final boolean A03(char c) {
        if (c < '0') {
            return c == '.';
        }
        if (c > '9') {
            return c >= 'a' ? c <= 'z' : c == '_';
        }
        return true;
    }

    public final String A00() {
        return this.A00.getString(2131964475);
    }

    public final String A01(char c) {
        String str;
        try {
            str = new String(Normalizer.normalize(String.valueOf(c), Normalizer.Form.NFD).replace("Œ", "OE").replace("œ", "oe").replace("Æ", "AE").replace("æ", "ae").getBytes("ascii"), "ascii");
        } catch (UnsupportedEncodingException unused) {
            str = String.valueOf(c);
        }
        return str.toLowerCase(Locale.ENGLISH).replace(" ", "_").replaceAll("[^a-z0-9_.]", "");
    }
}
