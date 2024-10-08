package X;

import java.security.NoSuchAlgorithmException;

/* renamed from: X.RiC  reason: case insensitive filesystem */
public abstract class C9840RiC {
    public static final String A00(String str) {
        0qQ.A0B(str, 0);
        try {
            C10391RrS A01 = new C11420SSw(AnonymousClass7TE.A0t(str), "").A01("MD5", 256);
            if (A01 != null) {
                return SKN.A01(A01.A01);
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            0KC.A0F("MediaPDQReporter", "Failed to generate hash for file", e);
            return null;
        }
    }
}
