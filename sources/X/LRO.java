package X;

public final class LRO {
    public final 2M7 A00 = 2M7.A09;
    public final C2818559v A01 = C2818559v.ANDROID;
    public final 0wc A02;

    public static void A01(C60775Jr6 jr6, LRN lrn) {
        lrn.A01.A02(jr6, lrn.A00.A03);
    }

    public LRO(0wc r2) {
        this.A02 = r2;
    }

    public static C2818559v A00(0Aj r2, LRO lro, String str, String str2) {
        r2.AAJ(str, str2);
        r2.A8M(lro.A00, "product_type");
        return lro.A01;
    }

    public final void A02(C60775Jr6 jr6, String str) {
        AnonymousClass7TG.A1N(str, jr6);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "user_click_appreciationfeed_atomic");
        if (A0e.isSampled()) {
            JTU.A0t(A00(A0e, this, Dbg.A00(), str), A0e, jr6);
            A0e.Cgf();
        }
    }

    public final void A03(C60775Jr6 jr6, String str) {
        AnonymousClass7TG.A1N(str, jr6);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "client_load_appreciationfeed_display");
        if (A0e.isSampled()) {
            JTU.A0t(A00(A0e, this, Dbg.A00(), str), A0e, jr6);
            A0e.Cgf();
        }
    }
}
