package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Olb  reason: case insensitive filesystem */
public final class C71486Olb implements C288935cj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ODI A01;
    public final /* synthetic */ C52969GgM A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C71486Olb(ODI odi, C52969GgM ggM, UserSession userSession, AnonymousClass4DU r4, String str, int i, boolean z) {
        this.A03 = userSession;
        this.A04 = r4;
        this.A02 = ggM;
        this.A05 = str;
        this.A01 = odi;
        this.A06 = z;
        this.A00 = i;
    }

    public final void dispose() {
        String str;
        UserSession userSession = this.A03;
        AnonymousClass4DU r7 = this.A04;
        C52969GgM ggM = this.A02;
        long j = ggM.A02;
        long currentTimeMillis = System.currentTimeMillis() - ggM.A00;
        String str2 = ggM.A09;
        1Xj A022 = 1E7.A00(userSession).A02(this.A05);
        if (A022 != null) {
            str = A022.A0C.getLoggingInfoToken();
        } else {
            str = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "barcelona_media_viewer_exit");
        if (A0e.isSampled()) {
            DbW.A15(A0e, r7);
            String A0k = DbS.A0k();
            if (A0k == null) {
                A0k = "";
            }
            C51965G9l.A1K(A0e, A0k);
            C51970G9q.A18(A0e, j);
            A0e.A9F("duration_ms", Long.valueOf(currentTimeMillis));
            A0e.AAJ("viewer_session_id", str2);
            A0e.AAJ("ranking_info_token", str);
            A0e.Cgf();
        }
        ODI odi = this.A01;
        boolean z = this.A06;
        C586704n r2 = odi.A00;
        if (r2 != null) {
            04l r1 = r2.A00;
            r1.A05(z);
            r1.A04(z);
            r1.A03(1);
        }
        int i = this.A00;
        if (r2 != null) {
            r2.A00.A02(i);
        }
    }
}
