package X;

import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.model.keyword.Keyword;

public final class WWA implements X44 {
    public final /* synthetic */ C15358UbA A00;

    public WWA(C15358UbA ubA) {
        this.A00 = ubA;
    }

    public final void Ck2(Refinement refinement, int i) {
        String str;
        C15358UbA ubA = this.A00;
        C14379Tv8 tv8 = ubA.A09;
        if (tv8 == null) {
            0qQ.A0F("keywordRefinementItemLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        String str2 = ubA.A0E;
        if (str2 == null) {
            str2 = "";
        }
        0Aj A0e = AnonymousClass7TE.A0e(tv8.A00, "instagram_refinement_item_click");
        if (A0e.isSampled()) {
            A0e.A9F("position", Long.valueOf((long) i));
            A0e.AAJ(C46325Dbt.A00(9, 10, 79), tv8.A02);
            A0e.AAJ("search_session_id", tv8.A03);
            Keyword keyword = tv8.A01;
            String str3 = null;
            if (keyword != null) {
                str = keyword.A03;
            } else {
                str = null;
            }
            A0e.AAJ("entity_page_id", str);
            if (keyword != null) {
                str3 = keyword.A04;
            }
            A0e.AAJ("entity_page_name", str3);
            A0e.AAJ("entity_page_type", "keyword");
            A0e.AAJ("entity_id", refinement.A00());
            A0e.AAJ("entity_name", refinement.A01);
            A0e.AAJ("entity_type", refinement.A00.A01.toString());
            A0e.AAJ("entity_unit", "title_bar");
            A0e.AAJ("entity_unit_style", "hscroll");
            A0e.AAJ("entity_unit_source", "refinement");
            C51973G9u.A14(A0e, "rank_token", str2);
            A0e.Cgf();
        }
    }
}
