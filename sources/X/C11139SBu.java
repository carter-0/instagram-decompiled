package X;

import android.util.Base64;
import java.security.SecureRandom;

/* renamed from: X.SBu  reason: case insensitive filesystem */
public abstract class C11139SBu {
    public static final SecureRandom A00 = new SecureRandom();

    public static String A00() {
        byte[] bArr = new byte[16];
        A00.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
