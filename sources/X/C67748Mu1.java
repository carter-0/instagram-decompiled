package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mu1  reason: case insensitive filesystem */
public final class C67748Mu1 extends 2YL {
    public final 2Fk A00;
    public final 2Fk A01;
    public final UserSession A02;
    public final L71 A03;
    public final C18611Vv4 A04;
    public final C71108Ocm A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final AnonymousClass0r6 A09;

    public C67748Mu1(UserSession userSession, L71 l71, C18611Vv4 vv4, C71108Ocm ocm, String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        C51974G9v.A1S(str2, str3, ocm, l71, userSession);
        0qQ.A0B(vv4, 7);
        this.A07 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A05 = ocm;
        this.A03 = l71;
        this.A02 = userSession;
        this.A04 = vv4;
        05G A022 = C71108Ocm.A02(ocm, str, str2);
        0qQ.A0B(A022, 0);
        C73521Pe6 pe6 = new C73521Pe6(A022, 8);
        this.A09 = pe6;
        19B r3 = 19B.A00;
        this.A00 = C226292g8.A00(r3, pe6);
        this.A01 = C226292g8.A00(r3, new C73521Pe6(C71108Ocm.A02(this.A05, this.A07, this.A08), 14));
    }

    public static final String A00(C67748Mu1 mu1) {
        C71108Ocm ocm = mu1.A05;
        String str = mu1.A07;
        String str2 = mu1.A08;
        if (!(((N4N) C71108Ocm.A00(ocm, str, str2)).A0A instanceof C69173Nfw)) {
            return null;
        }
        C69628NpA npA = ((N4N) C71108Ocm.A00(ocm, str, str2)).A0A;
        0qQ.A0C(npA, "null cannot be cast to non-null type com.instagram.search.surface.repository.SerpFeed.PaginationState.Incomplete");
        return ((C69173Nfw) npA).A00;
    }
}
