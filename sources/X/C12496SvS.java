package X;

import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.SvS  reason: case insensitive filesystem */
public final class C12496SvS implements C13620Tdm {
    public final int A00;
    public final Object A01;

    public C12496SvS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, java.lang.String] */
    public final void Eva(C11330SNj sNj, S32 s32, byte[] bArr) {
        if (this.A00 != 0) {
            AnonymousClass7TG.A1N(sNj, bArr);
            String e = 0;
            try {
                e = ((SSZ) this.A01).A08(sNj, bArr);
            } catch (Exception e2) {
            } finally {
                s32.A00(e2, e2);
            }
        } else {
            String e3 = 0;
            try {
                Signature signature = ((C10586Rug) this.A01).A02;
                signature.getClass();
                e3 = C11096S9x.A00(signature, bArr, true);
            } catch (SignatureException e32) {
            } finally {
                s32.A00(e32, e32);
            }
        }
    }
}
