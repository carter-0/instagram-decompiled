package X;

/* renamed from: X.Uk9  reason: case insensitive filesystem */
public final class C15885Uk9 extends C230372pW {
    public final 0wc A00;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C263944Ny r5;
        C17930ViL viL = (C17930ViL) obj;
        0qQ.A0B(viL, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_shopping_mini_shop_storefront_profile_entry_point_impression");
        String str = viL.A01;
        Long l = null;
        if (str != null) {
            r5 = C263944Ny.A00(str);
        } else {
            r5 = null;
        }
        if (A0e.isSampled()) {
            0bb r4 = new 0bb();
            r4.A06("prior_module", viL.A02);
            r4.A06("submodule", viL.A08);
            r4.A06("prior_submodule", viL.A03);
            C13989Tnp.A1K(r4, "shopping_session_id", viL.A05);
            C13988Tno.A17(A0e, r4);
            0bb r42 = new 0bb();
            r42.A06("m_pk", viL.A06);
            r42.A06("tracking_token", viL.A07);
            A0e.AAK(r42, "feed_item_info");
            A0e.AAE(r5, "merchant_id");
            A0e.AAE(C263944Ny.A00(viL.A04), "ig_profile_user_id");
            A0e.AAE((AnonymousClass0Ah) null, "marketer_id");
            Integer num = viL.A00;
            if (num != null) {
                l = C51969G9p.A0r(num);
            }
            A0e.A9F("index", l);
            A0e.Cgf();
        }
    }

    public C15885Uk9(0wc r1, 1Bk r2, C229222n2 r3) {
        super(r2, r3);
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
