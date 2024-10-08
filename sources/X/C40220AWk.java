package X;

import java.security.GeneralSecurityException;

/* renamed from: X.AWk  reason: case insensitive filesystem */
public final class C40220AWk implements B1C {
    public final C375379Di A00;
    public final C375409Dl A01;

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        C375369Dh r0 = this.A00.A00;
        if (r0 != null) {
            try {
                return ((B1C) r0.A04).ASD(bArr, bArr2);
            } catch (GeneralSecurityException e) {
                throw e;
            }
        } else {
            throw AnonymousClass7TG.A0q("keyset without primary key");
        }
    }

    public C40220AWk(C375379Di r2) {
        this.A00 = r2;
        if (!r2.A01.A00.isEmpty()) {
            C375399Dk.A00(r2);
        }
        this.A01 = C375399Dk.A00;
    }
}
