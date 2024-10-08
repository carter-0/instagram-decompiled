package X;

/* renamed from: X.70U  reason: invalid class name */
public final class AnonymousClass70U implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "TransparencyLogger";
    public 0wc A00;

    public final String getModuleName() {
        return AnonymousClass9NE.A01(19, 12, 22);
    }

    public final void A00(C8956RIv rIv, String str, String str2, String str3, boolean z) {
        RIn rIn;
        if (z) {
            rIn = RIn.OPENED_BOTTOMSHEET;
        } else {
            rIn = RIn.VIEWED;
        }
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_authenticity_consumer");
        A002.A8M(rIn, "action");
        A002.A8M(rIv, "screen");
        A002.A9F("target_user_id", Long.valueOf(Long.parseLong(str)));
        if (str2 != null) {
            A002.AAJ("product", str2);
        }
        if (str3 != null) {
            A002.A9F("post_id", Long.valueOf(Long.parseLong(str3)));
        }
        A002.Cgf();
    }

    public AnonymousClass70U(0lg r2) {
        this.A00 = AnonymousClass0kN.A01(this, r2);
    }
}
