package X;

import java.util.Map;

/* renamed from: X.Tx7  reason: case insensitive filesystem */
public final class C14485Tx7 implements X5C {
    public final /* synthetic */ C14137TqX A00;
    public final /* synthetic */ Map A01;

    public C14485Tx7(C14137TqX tqX, Map map) {
        this.A00 = tqX;
        this.A01 = map;
    }

    public final void DJU(CharSequence charSequence) {
        String str;
        C67389Mn6 mn6;
        if (charSequence != null) {
            C14137TqX tqX = this.A00;
            C14444TwS twS = (C14444TwS) tqX.A0g.getValue();
            if (twS.A06.add(charSequence) && (mn6 = (C67389Mn6) twS.A05.get(charSequence)) != null) {
                twS.A02.add(mn6.A00);
                twS.A03.add(mn6.A01);
                twS.A04.add(mn6.A02);
                0Aj A0e = AnonymousClass7TE.A0e(twS.A00, "instagram_search_recommendation_impression");
                if (A0e.isSampled()) {
                    A0e.AAJ("search_session_id", twS.A01);
                    A0e.AAe("recommendations_shown_entity_ids", AnonymousClass7TE.A1I(mn6.A00));
                    A0e.AAe("recommendations_shown_entity_names", AnonymousClass7TE.A1I(mn6.A01));
                    A0e.AAe("recommendations_shown_entity_types", AnonymousClass7TE.A1I(mn6.A02));
                    DbY.A1C(A0e);
                    A0e.Cgf();
                }
            }
            C67389Mn6 mn62 = (C67389Mn6) this.A01.get(charSequence.toString());
            if (mn62 != null) {
                str = mn62.A01;
            } else {
                str = null;
            }
            tqX.A08 = str;
        }
    }
}
