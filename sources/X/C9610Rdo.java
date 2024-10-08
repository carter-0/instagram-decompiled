package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.Rdo  reason: case insensitive filesystem */
public abstract class C9610Rdo {
    public static final String A00(String str) {
        0qQ.A0B(str, 0);
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(C66582MXn.A1a(str));
            0qQ.A0A(digest);
            str = C266784aL.A04(digest);
        } catch (NoSuchAlgorithmException unused) {
        }
        int length = str.length();
        if (length > 12) {
            length = 12;
        }
        return C51967G9n.A0q(str, 0, length);
    }
}
