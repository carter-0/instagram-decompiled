package X;

import android.app.PendingIntent;

/* renamed from: X.9EV  reason: invalid class name */
public final class AnonymousClass9EV implements C61110lV {
    public final /* synthetic */ AnonymousClass9EU A00;

    public AnonymousClass9EV(AnonymousClass9EU r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(960751612);
        AnonymousClass9EU r3 = this.A00;
        EBE ebe = new EBE(r3, new AnonymousClass9LU(r3, 3));
        1OC A002 = F7X.A00(r3.A03, AnonymousClass000.A00(3756));
        A002.A00 = ebe;
        1ES.A03(A002);
        AnonymousClass0fD.A0A(-186478108, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(-587697691);
        AnonymousClass9EU r0 = this.A00;
        PendingIntent A002 = AnonymousClass9EU.A00(r0);
        if (A002 != null) {
            r0.A01.cancel(A002);
        }
        AnonymousClass0fD.A0A(2017332168, A03);
    }
}
