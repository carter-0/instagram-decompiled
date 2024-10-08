package X;

import android.app.Activity;
import android.os.Handler;

/* renamed from: X.Aqw  reason: case insensitive filesystem */
public final /* synthetic */ class C41260Aqw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9X8 A01;
    public final /* synthetic */ AnonymousClass8QN A02;
    public final /* synthetic */ C365798nh A03;
    public final /* synthetic */ AnonymousClass8QZ A04;
    public final /* synthetic */ 1Xj A05;
    public final /* synthetic */ C310416b1 A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ C41260Aqw(AnonymousClass9X8 r1, AnonymousClass8QN r2, C365798nh r3, AnonymousClass8QZ r4, 1Xj r5, C310416b1 r6, int i, boolean z) {
        this.A02 = r2;
        this.A07 = z;
        this.A01 = r1;
        this.A06 = r6;
        this.A03 = r3;
        this.A05 = r5;
        this.A00 = i;
        this.A04 = r4;
    }

    public final void run() {
        AnonymousClass8QN r5 = this.A02;
        boolean z = this.A07;
        AnonymousClass9X8 r10 = this.A01;
        C310416b1 r0 = this.A06;
        C365798nh r6 = this.A03;
        1Xj r3 = this.A05;
        int i = this.A00;
        AnonymousClass8QZ r4 = this.A04;
        if (!z) {
            AnonymousClass8BA r7 = r5.A0N;
            r7.A0g(r10, r0);
            C3510387i r8 = r7.A0x;
            Activity activity = r5.A0A;
            float f = r0.A04;
            0qQ.A0B(activity, 0);
            0qQ.A0B(r10, 1);
            r8.A0A(activity, r10, f, 0.0f, 15000);
            if (r7.A0q == 28D.A0Z) {
                C352218Cl A002 = C387519mL.A00(activity, r10.A00(0), r5.A0P);
                if (A002 != null) {
                    r6.A02 = A002;
                }
                AnonymousClass8QN.A05(r5, r3);
                if (i >= 0) {
                    r5.DMM((AnonymousClass9SZ) null, i);
                    new Handler().postDelayed(new C40993Amd(r5, r4), 150);
                }
            }
            r5.A07(r4);
        }
    }
}
