package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class SyG implements C13478Tb5, Serializable {
    public final int A00;
    public final MessageDigest A01;
    public final boolean A02;

    public SyG() {
    }

    public final String toString() {
        return "Hashing.sha256()";
    }

    public SyG(String str, String str2) {
        boolean z;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            this.A01 = instance;
            this.A00 = instance.getDigestLength();
            try {
                instance.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.A02 = z;
        } catch (NoSuchAlgorithmException e) {
            throw Pxe.A0e(e);
        }
    }
}
