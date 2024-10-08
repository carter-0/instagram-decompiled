package X;

/* renamed from: X.Sl5  reason: case insensitive filesystem */
public final class C12043Sl5 implements 0CA {
    public 0xI A00;
    public volatile C60640iu A01;

    public final void A7e(String str, double d) {
        0xI r1 = this.A00;
        if (r1 != null) {
            r1.A0A(str, Double.valueOf(d));
        }
    }

    public final void A7f(String str, int i) {
        0xI r1 = this.A00;
        if (r1 != null) {
            r1.A08(Integer.valueOf(i), str);
        }
    }

    public final void A7g(String str, long j) {
        0xI r1 = this.A00;
        if (r1 != null) {
            r1.A0B(str, Long.valueOf(j));
        }
    }

    public final void A7h(String str, String str2) {
        0xI r0 = this.A00;
        if (r0 != null) {
            r0.A0C(str, str2);
        }
    }

    public final void ChA() {
        0xI r1 = this.A00;
        if (r1 != null) {
            this.A01.EFq(r1);
            this.A00 = null;
        }
    }

    public final boolean isSampled() {
        return AnonymousClass7TF.A1V(this.A00);
    }

    public final void A7E(String str, String str2) {
        "mobile_power_stats".getClass();
        this.A00 = 0xI.A01("mobile_power_stats", (String) null);
    }
}
