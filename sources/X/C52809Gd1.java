package X;

import android.os.CountDownTimer;

/* renamed from: X.Gd1  reason: case insensitive filesystem */
public final class C52809Gd1 extends CountDownTimer {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52809Gd1(C62320sa r3, 0sP r4, long j) {
        super(j, 100);
        this.A02 = r4;
        this.A01 = r3;
    }

    public final void onFinish() {
        switch (this.A00) {
            case 0:
                WYL wyl = (WYL) this.A01;
                wyl.A01 = new C59721JVf(wyl.A00(false), AnonymousClass05K.A01);
                wyl.A00 = 0;
                wyl.A01();
                215 r1 = (215) this.A02;
                AnonymousClass41T r0 = wyl.A02;
                215.A04(r1, r0.A05, r0.A08, "Auto opened after snack bar timed out", (String) null, r0.A07);
                215.A03(r0, r1);
                return;
            case 1:
                DbS.A1U(this.A01);
                return;
            default:
                GE5.A03((C267324bN) this.A01, (GE5) this.A02);
                return;
        }
    }

    public final void onTick(long j) {
        switch (this.A00) {
            case 0:
                WYL wyl = (WYL) this.A01;
                wyl.A00 = j;
                wyl.A01 = new C59721JVf(wyl.A00(false), AnonymousClass05K.A00);
                wyl.A01();
                return;
            case 1:
                ((0sP) this.A02).invoke(Long.valueOf(j));
                return;
            default:
                GE5 ge5 = (GE5) this.A02;
                ge5.A05 = j;
                int A012 = AnonymousClass1GB.A01(((float) j) / 1000.0f);
                GE5.A04((C267324bN) this.A01, ge5, j);
                ge5.A0T.A00(A012);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52809Gd1(C267324bN r3, GE5 ge5, long j) {
        super(j, 1000);
        this.A02 = ge5;
        this.A01 = r3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52809Gd1(WYL wyl, 215 r4, long j) {
        super(j, 10);
        this.A01 = wyl;
        this.A02 = r4;
    }
}
