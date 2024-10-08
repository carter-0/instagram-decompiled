package X;

import android.os.SystemClock;
import java.io.IOException;

public final class WH6 implements C250813m6 {
    public long A00;
    public long A01;
    public long A02;
    public String A03;
    public boolean A04;
    public final /* synthetic */ W1V A05;

    public final void DFs(C257183wz r1, long j, long j2, long j3) {
    }

    public final void DFt(long j, long j2) {
    }

    public final void DtW() {
    }

    public final void Dtb(String str, Object obj) {
    }

    public final void Dtd(C257183wz r1, C257263x7 r2) {
    }

    public final void EUi(String str) {
    }

    public WH6(W1V w1v) {
        this.A05 = w1v;
        this.A03 = "";
    }

    public final void Czk(C257113ws r15, C257263x7 r16, int i, boolean z) {
        if (z && r15 != null && (r15 instanceof C257193x0)) {
            C257193x0 r152 = (C257193x0) r15;
            this.A03 = r152.A0L.A07;
            this.A04 = r152.A0P;
            this.A02 = r152.A02;
            long j = this.A00 + ((long) i);
            this.A00 = j;
            long j2 = this.A01;
            if (j2 > 0 && j >= 131072) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - j2;
                this.A01 = elapsedRealtime;
                for (AnonymousClass7QJ A002 : this.A05.A0A) {
                    A002.A00(this.A03, "", j3, this.A00, this.A02, this.A04);
                }
                this.A00 = 0;
            }
        }
    }

    public final void DtX(C257113ws r13, C257263x7 r14, boolean z) {
        if (z && r13 != null && (r13 instanceof C257193x0)) {
            C257193x0 r132 = (C257193x0) r13;
            this.A03 = r132.A0L.A07;
            this.A04 = r132.A0P;
            this.A02 = r132.A02;
            long j = this.A01;
            if (j > 0 && this.A00 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                for (AnonymousClass7QJ A002 : this.A05.A0A) {
                    A002.A00(this.A03, "", elapsedRealtime, this.A00, this.A02, this.A04);
                }
            }
        }
    }

    public final void DtY(IOException iOException) {
        for (AnonymousClass7QJ A002 : this.A05.A0A) {
            A002.A00(this.A03, String.valueOf(iOException), 0, 0, this.A02, this.A04);
        }
    }

    public final void Dtf(C257113ws r3, C257263x7 r4, boolean z, boolean z2) {
        if (z && r3 != null && (r3 instanceof C257193x0)) {
            C257193x0 r32 = (C257193x0) r3;
            this.A03 = r32.A0L.A07;
            this.A04 = r32.A0P;
            this.A02 = r32.A02;
            this.A01 = SystemClock.elapsedRealtime();
            this.A00 = 0;
        }
    }

    public WH6() {
    }
}
