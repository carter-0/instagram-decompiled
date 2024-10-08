package X;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: X.9Dj  reason: invalid class name and case insensitive filesystem */
public final class C375389Dj implements AnonymousClass97H {
    public final C375409Dl A00;
    public final C375409Dl A01;
    public final C375379Di A02;

    public final byte[] AOI(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (C375369Dh r0 : this.A02.A01(Arrays.copyOf(bArr, 5))) {
                try {
                    return ((AnonymousClass97H) r0.A04).AOI(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (C375369Dh r02 : this.A02.A01(C375359Dg.A00)) {
            try {
                return ((AnonymousClass97H) r02.A04).AOI(bArr, bArr2);
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    public final byte[] ASE(byte[] bArr, byte[] bArr2) {
        try {
            return ((AnonymousClass97H) this.A02.A00.A04).ASE(bArr, bArr2);
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }

    public C375389Dj(C375379Di r2) {
        this.A02 = r2;
        if (!r2.A01.A00.isEmpty()) {
            C375399Dk.A00(r2);
        }
        C375409Dl r0 = C375399Dk.A00;
        this.A01 = r0;
        this.A00 = r0;
    }
}
