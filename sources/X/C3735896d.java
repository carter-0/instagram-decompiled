package X;

import android.util.Base64;

/* renamed from: X.96d  reason: invalid class name and case insensitive filesystem */
public abstract class C3735896d {
    public static String A00(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
