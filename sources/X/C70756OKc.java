package X;

/* renamed from: X.OKc  reason: case insensitive filesystem */
public final class C70756OKc {
    public final 0fA A00;
    public final C58840Ae A01;
    public final boolean A02;

    public C70756OKc(C58840Ae r2, 0fA r3, boolean z) {
        0qQ.A0B(r3, 1);
        this.A00 = r3;
        this.A01 = r2;
        this.A02 = z;
    }

    public final void A00(String str, String str2, boolean z) {
        if (this.A02) {
            0Aj A0d = C51969G9p.A0d(this.A01, "android_privacy_xapp_outgoing_intent_logging");
            if (A0d.isSampled()) {
                A0d.AAJ("uri_scheme", str2);
                A0d.A7p("has_detected_uii", JTP.A0g(A0d, "uri_authority", str, z));
                A0d.Cgf();
            }
        }
    }
}
