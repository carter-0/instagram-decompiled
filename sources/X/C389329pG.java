package X;

/* renamed from: X.9pG  reason: invalid class name and case insensitive filesystem */
public final class C389329pG extends AnonymousClass2xK {
    public final /* synthetic */ C52971GgO A00;
    public final /* synthetic */ 1Xj A01;

    public C389329pG(C52971GgO ggO, 1Xj r2) {
        this.A01 = r2;
        this.A00 = ggO;
    }

    public final void DsC(AnonymousClass5Gv r6) {
        C52971GgO ggO = this.A00;
        ggO.A03 = false;
        C333777a7 r3 = (C333777a7) ggO.A0B.A03.getValue();
        if (r3 != null) {
            C333717a0 r4 = ggO.A0C;
            0Aj A0e = AnonymousClass7TE.A0e(r4.A01, "instagram_clips_privacy_sheet_exit");
            A0e.A8M(C52236GKd.A1W, "action");
            A0e.A8M(AnonymousClass5OC.COMMENT_BAR, "action_source");
            A0e.AAJ("containermodule", r4.A03.getModuleName());
            A0e.AAJ(AnonymousClass000.A00(3560), r3.A0I);
            A0e.A9F(AnonymousClass000.A00(322), 0L);
            A0e.AAJ("viewer_session_id", r4.A04.getSessionId());
            A0e.AAJ(AnonymousClass000.A00(392), (String) null);
            A0e.AAJ("mezql_token", r3.A0J);
            A0e.AAJ("ranking_info_token", r3.A0L);
            A0e.Cgf();
        }
    }

    public final void DsH(AnonymousClass5Gv r6) {
        1Av A002;
        boolean z;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        1Xj r12 = this.A01;
        if (r12.A5G()) {
            A002 = 1Au.A00(this.A00.A0E);
            z = true;
            r2 = A002.A7M;
            r1 = 1Av.A8a;
            i = 277;
        } else if (r12.A5U()) {
            A002 = 1Au.A00(this.A00.A0E);
            z = true;
            r2 = A002.A7S;
            r1 = 1Av.A8a;
            i = 281;
        } else {
            return;
        }
        AnonymousClass7TF.A1J(A002, r2, r1, i, z);
    }
}
