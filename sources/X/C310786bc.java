package X;

import android.os.SystemClock;

/* renamed from: X.6bc  reason: invalid class name and case insensitive filesystem */
public final class C310786bc implements C250603lj {
    public final C230332pS A00;
    public final AnonymousClass2pP A01;

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        AnonymousClass2pP r4 = this.A01;
        Object obj = r7.A03;
        C254213s7 A002 = r4.A00(((C255773uh) obj).A0j);
        int intValue = r8.CEk(r7).intValue();
        if (intValue == 0) {
            ((AnonymousClass6YY) r7.A04).A02.A0Q = SystemClock.uptimeMillis();
        } else if (intValue != 1) {
            A002.A04(r8);
            r4.A01(this.A00, A002, obj, r7.A04);
            return;
        }
        A002.A03(r7, r8);
    }

    public C310786bc(C230332pS r1, AnonymousClass2pP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
