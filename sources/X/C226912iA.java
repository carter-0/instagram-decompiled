package X;

import java.util.concurrent.Executor;

/* renamed from: X.2iA  reason: invalid class name and case insensitive filesystem */
public final class C226912iA implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C226742hm A01;
    public final /* synthetic */ C226732hl A02;
    public final /* synthetic */ 1Tp A03;
    public final /* synthetic */ Object A04;

    public C226912iA(C226742hm r1, C226732hl r2, 1Tp r3, Object obj, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = obj;
    }

    public final void run() {
        long j = this.A00;
        C226752hn r7 = (C226752hn) this.A01;
        if (j == r7.A00) {
            1Tp r4 = this.A03;
            1TY A012 = r4.A02.A01(this.A02, this.A04);
            0sK r9 = r4.A06;
            C270244gQ r6 = r4.A00;
            Executor executor = r4.A05;
            C226992iK r5 = new C226992iK(r6, r7, executor, r9, j);
            if (r4.A03.A01) {
                executor = r4.A04;
            }
            A012.A06(r5, executor);
            r7.A0F.Epx(r7, A012, C226752hn.A0O[0]);
        }
    }
}
