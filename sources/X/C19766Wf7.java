package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Wf7  reason: case insensitive filesystem */
public final class C19766Wf7 implements X5H {
    public final /* synthetic */ C15272UZa A00;
    public final /* synthetic */ SearchEditText A01;

    public C19766Wf7(C15272UZa uZa, SearchEditText searchEditText) {
        this.A00 = uZa;
        this.A01 = searchEditText;
    }

    public final void DRy() {
        String str;
        C15272UZa uZa = this.A00;
        0wc r4 = (0wc) uZa.A0a.getValue();
        String A0k = DbS.A0k();
        String str2 = "";
        if (A0k == null) {
            A0k = str2;
        }
        String A04 = uZa.A04();
        SearchEditText searchEditText = this.A01;
        String searchString = searchEditText.getSearchString();
        String str3 = uZa.A0L;
        if (str3 != null) {
            C14428Tvx.A01(r4, A0k, A04, searchString, str3);
            C14437TwL A02 = uZa.A02();
            AnonymousClass0eM r5 = uZa.A0Z;
            0lg A0X = DbT.A0X(r5);
            0qQ.A0B(A0X, 0);
            0Tu r3 = 0Tu.A05;
            if (182.A06(r3, A0X, 36328044571278226L)) {
                str2 = searchEditText.getSearchString();
            }
            if (182.A06(r3, AnonymousClass7TF.A0L(r5, 0), 36328044571278226L)) {
                str = searchEditText.getSearchString();
            } else {
                str = null;
            }
            A02.A0A("core_search_serp_meta_ai_icon", str2, str, (String) null);
            return;
        }
        0qQ.A0F("serpSessionId");
        throw AnonymousClass00P.createAndThrow();
    }
}
