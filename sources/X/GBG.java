package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GBG {
    public final C270694h9 A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final JU5 A03;
    public final SearchContext A04;
    public final AnonymousClass93U A05;
    public final C55684Hlh A06;
    public final GF2 A07;

    public GBG(C270694h9 r2, UserSession userSession, AnonymousClass4DU r4, JU5 ju5, SearchContext searchContext, AnonymousClass93U r7, C55684Hlh hlh, GF2 gf2) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A1S(r4, searchContext, r7, gf2, ju5);
        AnonymousClass7TF.A1F(hlh, 7, r2);
        this.A01 = userSession;
        this.A02 = r4;
        this.A04 = searchContext;
        this.A05 = r7;
        this.A07 = gf2;
        this.A03 = ju5;
        this.A06 = hlh;
        this.A00 = r2;
    }

    public final void A00(C267324bN r7) {
        C254523sc A012;
        AnonymousClass4DU r5 = this.A02;
        UserSession userSession = this.A01;
        String str = this.A06.A00;
        SearchContext searchContext = this.A04;
        if (r7.A02 != null && (A012 = C52086GEg.A01(r7, userSession, r5, "number_of_comments")) != null) {
            A012.A6L = str;
            A012.A6r = searchContext.A05;
            A012.A6Y = searchContext.A03;
            A012.A6W = searchContext.A02;
            C233822wX.A0I(userSession, A012, r5, AnonymousClass05K.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.Hhy] */
    public final void A01(C267324bN r18, C52058GDe gDe) {
        C254523sc A012;
        String str;
        1Xj A0T;
        C267324bN r4 = r18;
        1Xj r12 = r4.A02;
        if (r12 != null) {
            AnonymousClass4DU r10 = this.A02;
            UserSession userSession = this.A01;
            C55684Hlh hlh = this.A06;
            String str2 = hlh.A00;
            SearchContext searchContext = this.A04;
            AnonymousClass93U r13 = this.A05;
            GF2 gf2 = this.A07;
            Double d = gf2.A01.A00(r12).A0B;
            C52058GDe gDe2 = gDe;
            if (!(r4.A02 == null || (A012 = C52086GEg.A01(r4, userSession, r10, "comment_button")) == null)) {
                A012.A6L = str2;
                A012.A6r = searchContext.A05;
                A012.A6Y = searchContext.A03;
                A012.A6W = searchContext.A02;
                A012.A2Q = d;
                A012.A09(gDe2.A09());
                A012.A6a = r13.CFD();
                A012.A4g = r13.AmZ();
                AnonymousClass3W1 r0 = gDe2.A0E;
                if (r0 != null) {
                    int i = r0.A03;
                    AtomicBoolean atomicBoolean = 1Xj.A0i;
                    List list = r4.A0R;
                    if (1Xv.A09(i, list)) {
                        A012.A08(i);
                        if (list == null || (A0T = DbZ.A0T(list, i)) == null) {
                            str = null;
                        } else {
                            str = A0T.getId();
                        }
                        A012.A4f = 1Xv.A05(str);
                    }
                }
                C233822wX.A0I(userSession, A012, r10, AnonymousClass05K.A00);
            }
            C51966G9m.A1O(this.A00, C233162v9.COMMENT_BUTTON_CLICK, r4, gDe2);
            C52086GEg.A0A(AnonymousClass5OC.COMMENT_BUTTON, r10, userSession, r12, r13, hlh.A00, (long) gDe2.A09());
            1Xj r1 = r4.A02;
            if (r1 != null) {
                C243993aT A002 = gf2.A01.A00(r1);
                ? obj = new Object();
                obj.A00 = true;
                A002.A03 = obj;
            }
            JU5 ju5 = this.A03;
            C51971G9r.A1P(ju5, ju5.A0N, 4);
        }
    }
}
