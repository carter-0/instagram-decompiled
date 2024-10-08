package X;

import android.util.Base64;

/* renamed from: X.NtG  reason: case insensitive filesystem */
public abstract class C69852NtG {
    public static final String A00(String str) {
        byte[] decode = Base64.decode(str, 2);
        0qQ.A07(decode);
        String encodeToString = Base64.encodeToString(decode, 11);
        0qQ.A07(encodeToString);
        return encodeToString;
    }
}
