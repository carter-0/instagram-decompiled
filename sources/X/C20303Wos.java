package X;

import java.util.List;

/* renamed from: X.Wos  reason: case insensitive filesystem */
public final class C20303Wos implements Runnable {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ C278754xT A01;
    public final /* synthetic */ C273664mz A02;

    public C20303Wos(AnonymousClass540 r1, C278754xT r2, C273664mz r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void run() {
        C278754xT r2 = this.A01;
        1Gd.A00(1P1.A00(r2.A03).A00);
        r2.A05.remove(C3727792j.GRAPHQL_PROFILE_FEED);
        if (r2.A0A) {
            List list = this.A02.A06;
            0qQ.A07(list);
            C278754xT.A03(this.A00, r2, list);
            return;
        }
        C278754xT.A02(this.A00, r2);
    }
}
