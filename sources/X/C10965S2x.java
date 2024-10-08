package X;

import java.util.Arrays;

/* renamed from: X.S2x  reason: case insensitive filesystem */
public final class C10965S2x {
    public final int A00;
    public final int A01;
    public final SHB A02;
    public final short A03;
    public final short A04;
    public final byte[] A05;

    public C10965S2x(SHB shb, byte[] bArr, int i, int i2, short s, short s2) {
        this.A02 = shb;
        this.A04 = s;
        this.A03 = s2;
        this.A01 = i;
        this.A05 = bArr;
        this.A00 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DnsAnswer{mName=");
        A1A.append(this.A02);
        A1A.append(", mType=");
        A1A.append(this.A04);
        A1A.append(", mKlass=");
        A1A.append(this.A03);
        A1A.append(", mTtl=");
        A1A.append(this.A01);
        A1A.append(", mRdata=");
        A1A.append(Arrays.toString(this.A05));
        A1A.append(", mNumOfBytes=");
        A1A.append(this.A00);
        return Pxg.A0x(A1A);
    }
}
