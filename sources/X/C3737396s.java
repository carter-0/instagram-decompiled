package X;

import java.security.KeyPair;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: X.96s  reason: invalid class name and case insensitive filesystem */
public final class C3737396s {
    public final long A00;
    public final KeyPair A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3737396s)) {
            return false;
        }
        C3737396s r7 = (C3737396s) obj;
        if (this.A00 != r7.A00) {
            return false;
        }
        KeyPair keyPair = this.A01;
        PublicKey publicKey = keyPair.getPublic();
        KeyPair keyPair2 = r7.A01;
        if (!publicKey.equals(keyPair2.getPublic()) || !keyPair.getPrivate().equals(keyPair2.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        KeyPair keyPair = this.A01;
        return Arrays.hashCode(new Object[]{keyPair.getPublic(), keyPair.getPrivate(), Long.valueOf(this.A00)});
    }

    public C3737396s(KeyPair keyPair, long j) {
        this.A01 = keyPair;
        this.A00 = j;
    }
}
