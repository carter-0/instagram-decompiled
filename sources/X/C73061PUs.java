package X;

/* renamed from: X.PUs  reason: case insensitive filesystem */
public final class C73061PUs implements Runnable {
    public final /* synthetic */ C72286Ozv A00;

    public C73061PUs(C72286Ozv ozv) {
        this.A00 = ozv;
    }

    public final void run() {
        C72286Ozv ozv = this.A00;
        if (ozv.A0F) {
            C68686NSs nSs = ozv.A0C;
            if (nSs.A01) {
                AnonymousClass2S0.A01.A05(10);
            } else {
                Object obj = ozv.A0D.A00.first;
                0qQ.A07(obj);
                if ((obj == AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY || obj == AnonymousClass80V.POST_CAPTURE_AR_EFFECT_TRAY) && nSs.A06(ozv.A00)) {
                    nSs.A04((String) null, false, true, ozv.A00);
                }
            }
            ozv.A0A.removeCallbacks(this);
        }
    }
}
