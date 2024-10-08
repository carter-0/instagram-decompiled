package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;

/* renamed from: X.Tv8  reason: case insensitive filesystem */
public final class C14379Tv8 {
    public final 0wc A00;
    public final Keyword A01;
    public final String A02;
    public final String A03;

    public final void A00(C298795u2 r6) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_refinement_item_click");
        if (A0e.isSampled()) {
            A0e.A9F("position", C51971G9r.A0m());
            A0e.AAJ(C46325Dbt.A00(9, 10, 79), this.A02);
            A0e.AAJ("search_session_id", this.A03);
            Keyword keyword = this.A01;
            String str2 = null;
            if (keyword != null) {
                str = keyword.A03;
            } else {
                str = null;
            }
            A0e.AAJ("entity_page_id", str);
            if (keyword != null) {
                str2 = keyword.A04;
            }
            A0e.AAJ("entity_page_name", str2);
            A0e.AAJ("entity_page_type", "keyword");
            A0e.AAJ("entity_id", r6.A00().A03);
            A0e.AAJ("entity_name", r6.A00().A04);
            A0e.AAJ("entity_type", "KEYWORD");
            A0e.AAJ("entity_unit", r6.A04);
            C51973G9u.A14(A0e, "entity_unit_style", VBV.A00(r6.A02));
            A0e.Cgf();
        }
    }

    public /* synthetic */ C14379Tv8(AnonymousClass0iw r3, UserSession userSession, Keyword keyword, String str, String str2) {
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        0qQ.A0B(A012, 6);
        this.A01 = keyword;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = A012;
    }
}
