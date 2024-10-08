package X;

import android.os.Handler;

/* renamed from: X.Aqq  reason: case insensitive filesystem */
public final /* synthetic */ class C41254Aqq implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C386049jy A01;
    public final /* synthetic */ AZ5 A02;
    public final /* synthetic */ C365798nh A03;
    public final /* synthetic */ AnonymousClass8QZ A04;
    public final /* synthetic */ 1Xj A05;
    public final /* synthetic */ C310416b1 A06;

    public /* synthetic */ C41254Aqq(C386049jy r1, AZ5 az5, C365798nh r3, AnonymousClass8QZ r4, 1Xj r5, C310416b1 r6, int i) {
        this.A02 = az5;
        this.A01 = r1;
        this.A06 = r6;
        this.A03 = r3;
        this.A05 = r5;
        this.A00 = i;
        this.A04 = r4;
    }

    public final void run() {
        AZ5 az5 = this.A02;
        C386049jy r2 = this.A01;
        C310416b1 r1 = this.A06;
        C365798nh r8 = this.A03;
        1Xj r7 = this.A05;
        int i = this.A00;
        AnonymousClass8QZ r5 = this.A04;
        AnonymousClass8QN r4 = az5.A02;
        AnonymousClass8BA r0 = r4.A0N;
        r0.A0g(r2, r1);
        if (r0.A0q == 28D.A0Z) {
            C352218Cl A002 = C387519mL.A00(r4.A0A, r2.A01.A01, r4.A0P);
            if (A002 != null) {
                r8.A02 = A002;
            }
            AnonymousClass8QN.A05(r4, r7);
            if (i >= 0) {
                r4.DMM((AnonymousClass9SZ) null, i);
                new Handler().postDelayed(new C40994Ame(az5, r5), 150);
            }
        }
        r4.A07(r5);
    }
}
