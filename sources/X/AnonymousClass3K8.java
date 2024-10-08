package X;

/* renamed from: X.3K8  reason: invalid class name */
public final class AnonymousClass3K8 {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final 0lg A04;

    public AnonymousClass3K8(0lg r2) {
        0qQ.A0B(r2, 1);
        this.A04 = r2;
    }

    public final void A00(AnonymousClass0iw r4) {
        String str;
        if (!(this.A00 == null || this.A01 == null || !0qQ.A0K(r4.getModuleName(), this.A01))) {
            0wc A012 = AnonymousClass0kN.A01(r4, this.A04);
            0Aj A002 = A012.A00(A012.A00, "app_switch_dest");
            A002.AAJ("dest_module", this.A01);
            A002.AAJ(AnonymousClass000.A00(1117), this.A00);
            if (this.A03) {
                str = "warm";
            } else {
                str = "cold";
            }
            A002.AAJ("dest_state", str);
            A002.Cgf();
            this.A00 = null;
            this.A01 = null;
        }
        this.A02 = true;
    }
}
