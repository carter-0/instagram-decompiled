package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wdn  reason: case insensitive filesystem */
public final class C19685Wdn implements C273414mX {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ AnonymousClass3BQ A01;
    public final /* synthetic */ C315656kI A02;

    public final void Cyf() {
    }

    public C19685Wdn(C255773uh r1, AnonymousClass3BQ r2, C315656kI r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Cyc() {
        C14164Tr2 tr2 = C14164Tr2.A00;
        C315656kI r5 = this.A02;
        UserSession userSession = r5.A01;
        String str = this.A00.A0k;
        str.getClass();
        AnonymousClass3BQ r3 = this.A01;
        DbY.A1S(userSession, r3);
        0wc A012 = AnonymousClass0kN.A01(tr2, userSession);
        String A0j = AnonymousClass7TG.A0j();
        0Aj A0e = AnonymousClass7TE.A0e(A012, "ig_story_standouts_eligible_bottom_sheet_dismiss");
        if (A0e.isSampled()) {
            C51965G9l.A1L(A0e, A0j);
            A0e.AAJ("reel_id_type", C273654mx.A00(192));
            A0e.AAJ("reel_id", str);
            DbV.A1J(A0e, C14164Tr2.A00(r3).name());
        }
        r5.A00 = false;
        AnonymousClass6a7 r0 = r5.A01;
        if (r0 != null) {
            r0.A00();
        }
    }
}
