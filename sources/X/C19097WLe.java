package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.WLe  reason: case insensitive filesystem */
public final class C19097WLe implements C20891X2x {
    public final VU8 A00;

    public static void A00(0Aj r2, VU8 vu8) {
        r2.A9F(AnonymousClass000.A00(2774), Long.valueOf((long) vu8.A00.C82().A00));
    }

    public final /* bridge */ /* synthetic */ void CtB(C20888X2s x2s, Object obj) {
        String str;
        V33 v33 = (V33) obj;
        if (v33 instanceof UVY) {
            VU8 vu8 = this.A00;
            UVY uvy = (UVY) v33;
            0Aj A0e = AnonymousClass7TE.A0e(vu8.A01, "ig_carrier_signal_v2_client_run");
            if (A0e.isSampled()) {
                A0e.A9F("count_all", Long.valueOf((long) uvy.A02));
                A0e.A9F("count_error", Long.valueOf((long) uvy.A00));
                A0e.A9F("count_success", Long.valueOf((long) uvy.A03));
                A0e.A7p("was_state_changed", AnonymousClass7TE.A0u());
                A0e.A9F("count_on_cooldown", Long.valueOf((long) uvy.A01));
                A00(A0e, vu8);
                if (uvy.A04.intValue() != 0) {
                    str = "SUCCESS";
                } else {
                    str = "CONFIG_FETCH_ERROR";
                }
                A0e.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str);
                A0e.Cgf();
            }
        }
        if (v33 instanceof UVZ) {
            VU8 vu82 = this.A00;
            UVZ uvz = (UVZ) v33;
            0Aj A0e2 = AnonymousClass7TE.A0e(vu82.A01, "ig_carrier_signal_v2_client_ping");
            if (A0e2.isSampled()) {
                A0e2.A7p("is_success", Boolean.valueOf(uvz.A04));
                A0e2.AAJ("key", uvz.A02);
                A0e2.AAJ("url", uvz.A03);
                A00(A0e2, vu82);
                A0e2.AAJ("error", uvz.A01);
                A0e2.A9F("http_response_code", Long.valueOf((long) uvz.A00));
                A0e2.A7p("was_state_changed", AnonymousClass7TE.A0u());
                A0e2.Cgf();
            }
        }
        if (v33 instanceof C15218UVv) {
            VU8 vu83 = this.A00;
            C15218UVv uVv = (C15218UVv) v33;
            0Aj A0e3 = AnonymousClass7TE.A0e(vu83.A01, "carrier_signal_ping_funnel_client_ping_start");
            if (A0e3.isSampled()) {
                A0e3.AAJ("ping_group_id", uVv.A02);
                A0e3.AAJ("ping_id", uVv.A03);
                A0e3.AAJ("carrier_signal_url", uVv.A01.A02);
                A00(A0e3, vu83);
                A0e3.Cgf();
            }
        }
        if (v33 instanceof UW3) {
            VU8 vu84 = this.A00;
            UW3 uw3 = (UW3) v33;
            C15218UVv uVv2 = (C15218UVv) uw3.A00;
            0Aj A0e4 = AnonymousClass7TE.A0e(vu84.A01, "carrier_signal_ping_funnel_client_ping_end");
            if (A0e4.isSampled()) {
                A0e4.AAJ("ping_group_id", uVv2.A02);
                A0e4.AAJ("ping_id", uVv2.A03);
                A0e4.AAJ("carrier_signal_url", uVv2.A01.A02);
                A00(A0e4, vu84);
                A0e4.A9F("ping_response_status", Long.valueOf((long) uw3.A00));
                A0e4.Cgf();
            }
        }
    }

    public C19097WLe(VU8 vu8) {
        this.A00 = vu8;
    }
}
