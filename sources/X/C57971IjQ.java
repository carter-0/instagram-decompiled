package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IjQ  reason: case insensitive filesystem */
public final class C57971IjQ implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass3W1 A01;
    public final /* synthetic */ AnonymousClass47O A02;
    public final /* synthetic */ C247083fk A03;
    public final /* synthetic */ AnonymousClass3VD A04;

    public C57971IjQ(UserSession userSession, AnonymousClass3W1 r2, AnonymousClass47O r3, C247083fk r4, AnonymousClass3VD r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = userSession;
        this.A02 = r3;
    }

    public final void run() {
        long j;
        AnonymousClass3W1 r6 = this.A01;
        if (!r6.A20) {
            r6.A0k(true);
            AnonymousClass3VD r5 = this.A04;
            C247083fk r4 = this.A03;
            r5.A02(this.A00, r4, true);
            C247063fi r2 = r4.A05;
            Runnable runnable = r5.A02;
            if (runnable != null) {
                r5.A07.removeCallbacks(runnable);
                r5.A02 = null;
            }
            if (r2.A08) {
                j = 6000;
            } else {
                j = 4000;
            }
            C57864Ihh ihh = new C57864Ihh(r6, r5);
            r5.A07.postDelayed(ihh, j);
            r5.A02 = ihh;
            ((0sP) r4.A02.A03).invoke(this.A02);
        }
        AnonymousClass3VD r22 = this.A04;
        Runnable runnable2 = r22.A03;
        if (runnable2 != null) {
            r22.A07.removeCallbacks(runnable2);
            r22.A03 = null;
        }
    }
}
