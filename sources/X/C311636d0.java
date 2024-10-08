package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.6d0  reason: invalid class name and case insensitive filesystem */
public final class C311636d0 implements C317186mr {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C310016aI A02;
    public final C311646d1 A03;
    public final SearchContext A04;
    public final AnonymousClass2fS A05;
    public final String A06;
    public final String A07;

    public C311636d0(AnonymousClass0iw r2, UserSession userSession, C310016aI r4, SearchContext searchContext, String str, String str2) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = r4;
        this.A04 = searchContext;
        this.A05 = AnonymousClass2fR.A00(userSession);
        this.A03 = new C311646d1(userSession);
    }

    public final void DNS(C243363Yl r28, Reel reel, C255773uh r30) {
        String str;
        String str2;
        C243363Yl r9 = r28;
        0qQ.A0B(r9, 2);
        C255773uh r17 = r30;
        1Xj r8 = r17.A0b;
        r8.getClass();
        r8.A44(r9);
        UserSession userSession = this.A01;
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        String id = r8.getId();
        if (id != null) {
            A002.A00(new C317326n5(r9, id, false));
            AnonymousClass2fS r14 = this.A05;
            String id2 = r8.getId();
            if (id2 != null) {
                AnonymousClass0iw r15 = this.A00;
                String moduleName = r15.getModuleName();
                String A003 = C2606846q.A00(r8.A2L());
                Reel reel2 = reel;
                int A042 = (int) reel2.A04();
                String str3 = this.A06;
                String str4 = this.A07;
                0qQ.A0B(moduleName, 2);
                LE3 le3 = new LE3();
                le3.A04 = id2;
                C243363Yl r2 = C243363Yl.LIKED;
                if (r9 == r2) {
                    str = "send_story_like";
                } else {
                    str = "unsend_story_like";
                }
                le3.A01 = str;
                le3.A02 = moduleName;
                le3.A03 = A003;
                le3.A00 = A042;
                le3.A05 = str3;
                le3.A06 = str4;
                r14.A0D(id2, le3);
                String id3 = r8.getId();
                if (id3 != null) {
                    String moduleName2 = r15.getModuleName();
                    String A004 = C2606846q.A00(r8.A2L());
                    int A043 = (int) reel2.A04();
                    C55837HoK hoK = new C55837HoK(r9, r8, reel2, r17, this, le3);
                    SearchContext searchContext = this.A04;
                    0qQ.A0B(moduleName2, 3);
                    if (r9 == r2) {
                        str2 = "send_story_like";
                    } else {
                        str2 = "unsend_story_like";
                    }
                    1OC A005 = C55168HdK.A00(userSession, searchContext, id3, str2, moduleName2, A004, str3, str4, A043);
                    A005.A00 = new H4I(hoK);
                    1ES.A03(A005);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
