package X;

import java.io.OutputStream;

/* renamed from: X.RCy  reason: case insensitive filesystem */
public final class C8857RCy extends OutputStream {
    public final AnonymousClass2RQ A00;

    public final void write(byte[] bArr, int i, int i2) {
        17k.A03(i, i + i2, bArr.length);
        this.A00.A02(bArr, i, i2);
    }

    public C8857RCy(AnonymousClass2RQ r1) {
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Funnels.asOutputStream(");
        return Pxg.A0q(this.A00, A1A);
    }

    public final void write(byte[] bArr) {
        bArr.getClass();
        this.A00.A01(bArr);
    }

    public final void write(int i) {
        this.A00.A00((byte) i);
    }
}
