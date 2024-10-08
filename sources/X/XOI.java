package X;

import java.io.IOException;

public final class XOI extends AnonymousClass4Y1 {
    public long A00;
    public boolean A01;
    public final int A02;
    public final C256683wB A03;

    public final void AGO() {
    }

    /* JADX INFO: finally extract failed */
    public final void Cg1() {
        C266074Xl r10 = this.A00;
        C256703wD.A01(r10);
        for (C265984Xc r4 : r10.A00) {
            if (r4.A07 != 0) {
                r4.A07 = 0;
                r4.A0H = true;
            }
        }
        int i = 0;
        C265994Xd FHW = r10.FHW(0, this.A02);
        FHW.AWP(this.A03);
        try {
            C257263x7 r9 = this.A06;
            long j = this.A00;
            long j2 = r9.A03;
            long j3 = -1;
            if (j2 != -1) {
                j3 = j2 - j;
            }
            C257263x7 A002 = r9.A00(j, j3);
            C266214Xz r2 = this.A07;
            long open = r2.open(A002);
            if (open != -1) {
                open += this.A00;
            }
            AnonymousClass4Y6 r11 = new AnonymousClass4Y6(r2, this.A00, open);
            do {
                this.A00 += (long) i;
                i = FHW.EJl(r11, Integer.MAX_VALUE, 0, true);
            } while (i != -1);
            FHW.EJn((C266034Xh) null, 1, (int) this.A00, 0, this.A04);
            try {
                r2.close();
            } catch (IOException unused) {
            }
            this.A01 = true;
        } catch (Throwable th) {
            try {
                this.A07.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public final boolean A01() {
        return this.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XOI(C256683wB r20, C256683wB r21, C257113ws r22, C257263x7 r23, Object obj, int i, int i2, long j, long j2, long j3, long j4) {
        super(r20, r22, r23, obj, i, j, j2, -9223372036854775807L, -9223372036854775807L, j3, j4);
        this.A02 = i2;
        this.A03 = r21;
    }
}
