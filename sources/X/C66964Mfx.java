package X;

/* renamed from: X.Mfx  reason: case insensitive filesystem */
public final class C66964Mfx implements Runnable {
    public final /* synthetic */ C313416gP A00;
    public final /* synthetic */ String A01;

    public C66964Mfx(C313416gP r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        C313416gP r4 = this.A00;
        C255773uh r3 = r4.A0L;
        if (r3 != null && !r4.A0X) {
            String str = this.A01;
            if (str.equals(r3.A0j)) {
                if (r3.A17()) {
                    r4.A0u.EHC(C313416gP.A04(r4), r3);
                }
                r4.A0R = str;
            }
        }
        r4.A0g = false;
    }
}
