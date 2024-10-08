package X;

import java.io.Closeable;

/* renamed from: X.RUl  reason: case insensitive filesystem */
public abstract class C9234RUl {
    public static void A00(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                0KC.A0F("AssetFileUtil", "unable to close stream", e);
            }
        }
    }
}
