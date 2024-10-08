package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hrk  reason: case insensitive filesystem */
public final class C56037Hrk {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new C51764G0g(this, 43));
    public final 1QJ A03;
    public final String A04;

    public final void A00(1Xj r4, String str) {
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A02.getValue(), "ig_remind_me_about_this_ad");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            C51965G9l.A1I(A0e, r4.A0C.getPk());
            A0e.AAJ("prior_module", this.A04);
            C51965G9l.A1L(A0e, r4.C9L());
            C51965G9l.A1D(A0e, DbZ.A0d(C231122qu.A07(this.A01, r4)));
            C51965G9l.A1K(A0e, String.valueOf(this.A03.A02.A00));
            C51965G9l.A1J(A0e, r4.getId());
            A0e.Cgf();
        }
    }

    public final void A01(String str, String str2, long j) {
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A02.getValue(), "ig_remind_me_about_this_ad");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            C51965G9l.A1I(A0e, "");
            A0e.AAJ("prior_module", this.A04);
            C51965G9l.A1L(A0e, "");
            C51970G9q.A17(A0e, j);
            C51965G9l.A1K(A0e, String.valueOf(this.A03.A02.A00));
            C51965G9l.A1J(A0e, str2);
            A0e.Cgf();
        }
    }

    public C56037Hrk(AnonymousClass0iw r4, UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A01 = userSession;
        this.A04 = str;
        this.A00 = r4;
        1QJ r0 = AnonymousClass1QI.A00;
        0qQ.A07(r0);
        this.A03 = r0;
    }
}
