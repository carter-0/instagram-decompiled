package X;

/* renamed from: X.HrV  reason: case insensitive filesystem */
public final class C56023HrV {
    public final /* synthetic */ C15286UZq A00;

    public final void A01(String str, Integer num) {
        String str2;
        0qQ.A0B(str, 0);
        C55868Hop hop = this.A00.A0C;
        if (hop == null) {
            0qQ.A0F("serpMetaAiHcmLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        0Aj A0e = AnonymousClass7TE.A0e(hop.A01, "ig_search_meta_ai_hcm_third_party_source_tap");
        if (A0e.isSampled()) {
            C51969G9p.A1A(A0e, hop.A00);
            C51976G9y.A0Y(A0e, hop, DbY.A0a());
            A0e.AAJ(C66579MXk.A00(1162), str);
            if (num.intValue() != 0) {
                str2 = "sources";
            } else {
                str2 = "card";
            }
            A0e.AAJ(C273654mx.A00(989), str2);
            A0e.Cgf();
        }
    }

    public C56023HrV(C15286UZq uZq) {
        this.A00 = uZq;
    }

    public final void A00(Integer num) {
        String str;
        C15286UZq uZq = this.A00;
        C55868Hop hop = uZq.A0C;
        if (hop == null) {
            0qQ.A0F("serpMetaAiHcmLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        String A04 = uZq.A07().A04();
        0Aj A0e = AnonymousClass7TE.A0e(hop.A01, "ig_search_meta_ai_hcm_text_tap");
        if (A0e.isSampled()) {
            C51969G9p.A1A(A0e, hop.A00);
            C51965G9l.A1K(A0e, DbY.A0a());
            A0e.AAJ("search_session_id", hop.A05);
            A0e.AAJ("serp_session_id", hop.A06);
            A0e.AAJ("rank_token", A04);
            A0e.AAJ("query_text", hop.A04);
            A0e.AAJ("text_response_id", hop.A03.A00());
            switch (num.intValue()) {
                case 0:
                    str = "shrink";
                    break;
                case 1:
                    str = "expand";
                    break;
                default:
                    str = "open_thread";
                    break;
            }
            A0e.AAJ("tap_behavior", str);
            A0e.Cgf();
        }
    }
}
