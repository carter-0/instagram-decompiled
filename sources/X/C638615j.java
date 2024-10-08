package X;

import android.os.SystemClock;

/* renamed from: X.15j  reason: invalid class name and case insensitive filesystem */
public final class C638615j implements C61110lV {
    public final /* synthetic */ C638515i A00;

    public C638615j(C638515i r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-1419744922);
        C638515i r3 = this.A00;
        15k r2 = r3.A01;
        r2.A04 = true;
        r2.A02 = -1;
        C638515i.A01(r3);
        AnonymousClass0fD.A0A(-1300922442, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(582367679);
        C638515i r3 = this.A00;
        15k r2 = r3.A01;
        r2.A04 = false;
        r2.A02 = SystemClock.uptimeMillis();
        C638515i.A01(r3);
        AnonymousClass0fD.A0A(-1441552418, A03);
    }
}
