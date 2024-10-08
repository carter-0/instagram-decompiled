package X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: X.JYb  reason: case insensitive filesystem */
public abstract class C59782JYb {
    public static final String A00(Uri uri) {
        try {
            C7232Q0d AU7 = new C7233Q0e(C9955RkA.A00).AU7(uri);
            0qQ.A07(AU7);
            return AU7.A0C;
        } catch (IOException e) {
            0KC.A0F("MediaMetadataUtils", "exception occurred when reading video metadata", e);
            return null;
        }
    }
}
