package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

public final class GDF {
    public final C340057kd A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final SearchContext A03;
    public final 0q2 A04;
    public final Long A05;
    public final String A06;

    public /* synthetic */ GDF(AnonymousClass0iw r4, UserSession userSession, SearchContext searchContext, Long l, String str) {
        C340057kd A002 = C340057kd.A00(userSession);
        0q2 A003 = 0q2.A00(userSession);
        DbW.A1O(searchContext, 3, A002);
        this.A02 = userSession;
        this.A01 = r4;
        this.A03 = searchContext;
        this.A05 = l;
        this.A06 = str;
        this.A00 = A002;
        this.A04 = A003;
    }
}
