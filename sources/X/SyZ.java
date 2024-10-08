package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class SyZ implements C13648TeF, Serializable {
    public final int A00;
    public final MessageDigest A01;
    public final boolean A02;

    public SyZ() {
    }

    public final String toString() {
        return "Hashing.sha256()";
    }

    public SyZ(String str, String str2) {
        this();
        MessageDigest A002 = A00("SHA-256");
        this.A01 = A002;
        this.A00 = A002.getDigestLength();
        this.A02 = A01(A002);
    }

    public final C8560Qwy A02() {
        if (this.A02) {
            try {
                return new C8560Qwy((MessageDigest) this.A01.clone(), this.A00);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C8560Qwy(A00(this.A01.getAlgorithm()), this.A00);
    }

    public static MessageDigest A00(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw Pxe.A0e(e);
        }
    }

    public static boolean A01(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final C8561Qwz FOx(CharSequence charSequence) {
        int length = charSequence.length();
        int i = length + length;
        if (i >= 0) {
            C8560Qwy A022 = A02();
            int length2 = charSequence.length();
            for (int i2 = 0; i2 < length2; i2++) {
                A022.A02(charSequence.charAt(i2));
            }
            return A022.A01();
        }
        throw AnonymousClass7TE.A0w(C9719Rfc.A00("expectedInputSize must be >= 0 but was %s", AnonymousClass7TF.A1b(i)));
    }
}
