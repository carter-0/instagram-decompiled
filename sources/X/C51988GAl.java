package X;

import android.content.Context;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.GAl  reason: case insensitive filesystem */
public final class C51988GAl {
    public final C250603lj A00;
    public final C250603lj A01;
    public final 1Ua A02;
    public final AnonymousClass2pP A03;

    public C51988GAl(Context context, PlaylistContext playlistContext, UserSession userSession, AnonymousClass4DU r13, SearchContext searchContext, C249763kK r15) {
        UserSession userSession2 = userSession;
        AnonymousClass2pP r1 = new AnonymousClass2pP(C60510iO.A00(userSession), true);
        this.A03 = r1;
        1Ua A002 = 1UX.A00(context, userSession);
        0qQ.A07(A002);
        this.A02 = A002;
        String str = "instagram_organic_vpvd_imp";
        AnonymousClass4DU r4 = r13;
        C249763kK r6 = r15;
        AnonymousClass2z2 r2 = new AnonymousClass2z2(userSession2, r4, (C228182kv) null, r6, A002, str);
        r2.A01 = searchContext;
        r2.A00 = playlistContext;
        this.A00 = new C51989GAm(r2, r1);
        this.A01 = new C51989GAm(new AnonymousClass2z2(userSession2, r4, (C228182kv) null, r6, A002, r13.isSponsoredEligible() ? "instagram_ad_vpvd_imp" : str), r1);
    }
}
