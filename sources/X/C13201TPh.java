package X;

import java.io.OutputStream;

/* renamed from: X.TPh  reason: case insensitive filesystem */
public final class C13201TPh implements C13972Tma {
    public final /* synthetic */ OutputStream A00;
    public final /* synthetic */ C11291SJy A01;

    public final void FNi(C13198TPe tPe, long j) {
        long j2 = j;
        SCP.A00(tPe.A00, 0, j2);
        while (j2 > 0) {
            this.A01.A06();
            SRX srx = tPe.A01;
            int i = srx.A00;
            int i2 = srx.A01;
            int min = (int) Math.min(j2, (long) (i - i2));
            this.A00.write(srx.A06, i2, min);
            int i3 = srx.A01 + min;
            srx.A01 = i3;
            long j3 = (long) min;
            j2 -= j3;
            tPe.A00 -= j3;
            if (i3 == srx.A00) {
                SRX.A01(tPe, srx);
            }
        }
    }

    public C13201TPh(OutputStream outputStream, C11291SJy sJy) {
        this.A01 = sJy;
        this.A00 = outputStream;
    }

    public final C11291SJy Ezn() {
        return this.A01;
    }

    public final void close() {
        this.A00.close();
    }

    public final void flush() {
        this.A00.flush();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("sink(");
        return Pxg.A0q(this.A00, A1A);
    }
}
