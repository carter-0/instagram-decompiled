package X;

import com.instagram.common.session.UserSession;

public final class Dda extends C46329Dbx {
    public C2366634p A00;
    public C2366634p A01;
    public String A02;
    public final C2366634p A03;
    public final C2366634p A04;
    public final C2366634p A05;
    public final C2366634p A06;
    public final C2366634p A07;
    public final C2366634p A08;
    public final C46466DfU A09 = new C46466DfU();
    public final Dc1 A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public final void A05() {
        A0K("is_self", this.A0D);
        A0J("trigger", this.A0C);
        String str = this.A02;
        if (str != null) {
            A0J("content_source", str);
        }
        String str2 = this.A0B;
        A0J("destination", str2);
        Dc1 dc1 = this.A0A;
        0qQ.A0B(str2, 1);
        dc1.A00.A0J("profile_destination", str2);
        dc1.A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dda(UserSession userSession, String str, String str2, boolean z) {
        super(userSession, "profile", 31784979);
        AnonymousClass7TG.A1P(userSession, str);
        this.A0D = z;
        this.A0C = str;
        this.A0B = str2 == null ? "profile_media_grid" : str2;
        this.A0A = GAH.A00(userSession);
        this.A05 = A02("media_load");
        this.A04 = A02("fetch_user");
        this.A07 = A02("story_highlights");
        this.A03 = A02("bio");
        this.A08 = A02("user_metric");
        this.A06 = A02("profile_picture");
    }

    public final void A0A(long j, short s) {
        super.A0A(j, s);
        C46466DfU dfU = this.A09;
        for (C47795EHg eHg : dfU.A00) {
            if (eHg.A00 || s == 2) {
                dfU.A01.ATE(eHg);
            }
        }
    }
}
