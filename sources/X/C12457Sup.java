package X;

import java.security.GeneralSecurityException;
import java.security.Signature;

/* renamed from: X.Sup  reason: case insensitive filesystem */
public final class C12457Sup implements C13735Tg7 {
    public final /* synthetic */ C12497SvT A00;
    public final /* synthetic */ C11330SNj A01;
    public final /* synthetic */ S32 A02;
    public final /* synthetic */ byte[] A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, java.lang.String] */
    public final void Cx0(C10586Rug rug) {
        String e = 0;
        try {
            Signature signature = rug.A02;
            if (signature == null) {
                signature = SSZ.A02(((QDE) this.A00.A01).A08, this.A01.A02);
            }
            byte[] bArr = this.A03;
            0qQ.A0B(signature, 0);
            e = C11096S9x.A00(signature, bArr, true);
        } catch (GeneralSecurityException e2) {
        } finally {
            this.A02.A00(e2, e2);
        }
    }

    public C12457Sup(C12497SvT svT, C11330SNj sNj, S32 s32, byte[] bArr) {
        this.A00 = svT;
        this.A01 = sNj;
        this.A03 = bArr;
        this.A02 = s32;
    }

    public final void Cwz(Throwable th) {
        this.A02.A00((String) null, th);
    }
}
