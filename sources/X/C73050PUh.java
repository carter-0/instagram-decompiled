package X;

/* renamed from: X.PUh  reason: case insensitive filesystem */
public final class C73050PUh implements Runnable {
    public final /* synthetic */ C70827OMz A00;

    public C73050PUh(C70827OMz oMz) {
        this.A00 = oMz;
    }

    public final void run() {
        String str;
        C70827OMz oMz = this.A00;
        if (oMz.A01) {
            C263534Mj r1 = oMz.A02;
            C39894ADw aDw = oMz.A00;
            0qQ.A0A(aDw);
            int A002 = r1.A00(aDw);
            if (A002 != 1) {
                if (A002 == 2) {
                    str = "Delayed";
                } else {
                    str = "Failed";
                }
                27B.A01("AudioFocusManager", 002.A0R(str, " to abandon audio focus"), new Object[0]);
                oMz.A04.DER(A002);
            }
        }
        oMz.A00 = null;
        oMz.A01 = false;
        oMz.A0C = 0;
    }
}
