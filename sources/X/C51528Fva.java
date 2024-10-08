package X;

import java.util.Map;

/* renamed from: X.Fva  reason: case insensitive filesystem */
public final class C51528Fva implements Runnable {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ AnonymousClass3BQ A01;
    public final /* synthetic */ C2365334c A02;
    public final /* synthetic */ AnonymousClass3K2 A03;

    public C51528Fva(AnonymousClass0iw r1, AnonymousClass3BQ r2, C2365334c r3, AnonymousClass3K2 r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3N2 r2;
        AnonymousClass3K2 r3 = this.A03;
        C2365334c r1 = this.A02;
        Map map = AnonymousClass3K2.A13;
        if (r1.A00(r3.A0E) instanceof AnonymousClass3N2) {
            r2 = (AnonymousClass3N2) r1.A00(r3.A0E);
        } else {
            r2 = null;
        }
        AnonymousClass3K2.A0P(this.A00, r3.A0I, r3, r2);
    }
}
