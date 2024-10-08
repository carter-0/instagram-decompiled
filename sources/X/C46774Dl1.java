package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dl1  reason: case insensitive filesystem */
public final class C46774Dl1 extends 2YL {
    public EQA A00;
    public boolean A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final AnonymousClass0eM A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;

    public final void A00() {
        05G r5 = this.A07;
        r5.Epw(C50689Fgo.A00);
        UserSession userSession = this.A02;
        User A022 = 17h.A00(userSession).A02(this.A05);
        if (A022 != null) {
            this.A00 = new EQA(userSession, A022, this.A04, this.A03);
            r5.Epw(new C50687Fgm(A022));
            return;
        }
        AnonymousClass7TE.A1Z(new C66160MFx(this, (AnonymousClass4D7) null, 0), C318116oQ.A00(this));
    }

    public C46774Dl1(UserSession userSession, C46461DfP dfP, String str, String str2, String str3) {
        this.A02 = userSession;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = AnonymousClass0eN.A01(new MJ4(41, dfP, new AnonymousClass8ZA(dfP.A00)));
        02z A012 = 106.A01(C50689Fgo.A00);
        this.A07 = A012;
        this.A08 = A012;
        DbX.A1X(this, C318116oQ.A00(this), 8);
    }
}
