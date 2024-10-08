package X;

import java.util.Arrays;

/* renamed from: X.AWh  reason: case insensitive filesystem */
public final class C40217AWh implements AnonymousClass97H {
    public final AnonymousClass97H A00;
    public final AnonymousClass98D A01;
    public final byte[] A02;

    public final byte[] AOI(byte[] bArr, byte[] bArr2) {
        AnonymousClass97H r2;
        if (this.A01 == AnonymousClass98D.RAW) {
            r2 = this.A00;
        } else if (C3740397x.A02(this.A02, bArr)) {
            r2 = this.A00;
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
        } else {
            throw AnonymousClass7TG.A0q("wrong prefix");
        }
        return r2.AOI(bArr, bArr2);
    }

    public final byte[] ASE(byte[] bArr, byte[] bArr2) {
        if (this.A01 == AnonymousClass98D.RAW) {
            return this.A00.ASE(bArr, bArr2);
        }
        return C375459Dq.A01(this.A00.ASE(bArr, bArr2), this.A02);
    }

    public C40217AWh(AnonymousClass97H r1, AnonymousClass98D r2, byte[] bArr) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = bArr;
    }
}
