package X;

import com.instagram.common.session.UserSession;

public final class LCv {
    public final UserSession A00;
    public final 1vn A01;
    public final String A02;

    public LCv(UserSession userSession, 1vn r3, String str) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = str;
    }

    public final AnonymousClass0r6 A00() {
        UserSession userSession = this.A00;
        String str = this.A02;
        1NY A0M = DbU.A0M(userSession);
        A0M.A05();
        String A0g = 002.A0g("creators/", "content_appreciation/", "async_get_content_appreciation_settings/");
        0qQ.A07(A0g);
        A0M.A0E = A0g;
        A0M.A0Q(C47298DuR.class, F4B.class);
        1OC A0T = DbT.A0T(A0M, Dbg.A00(), str);
        0qQ.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ContentAppreciationSettingsResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ContentAppreciationSettingsResponse>>");
        return JUM.A04(new C59677JTi(this, (AnonymousClass4D7) null, 34), JUM.A01(new JVD(2, (AnonymousClass4D7) null), JVD.A00(A0T.A03(909209444), 1)));
    }
}
