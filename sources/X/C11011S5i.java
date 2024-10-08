package X;

import java.util.Arrays;

/* renamed from: X.S5i  reason: case insensitive filesystem */
public final class C11011S5i {
    public final S5K A00;
    public final byte[] A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11011S5i) {
            C11011S5i s5i = (C11011S5i) obj;
            if (this.A00.equals(s5i.A00)) {
                return Arrays.equals(this.A01, s5i.A01);
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.A01);
    }

    public C11011S5i(S5K s5k, byte[] bArr) {
        if (bArr != null) {
            this.A00 = s5k;
            this.A01 = bArr;
            return;
        }
        throw AnonymousClass7TE.A11("bytes is null");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EncodedPayload{encoding=");
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l(", bytes=[...]}", A1A);
    }
}
