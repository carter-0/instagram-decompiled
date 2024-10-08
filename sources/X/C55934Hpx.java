package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hpx  reason: case insensitive filesystem */
public final class C55934Hpx {
    public final BBV A00;
    public final UserSession A01;

    public final void A00(String str, String str2) {
        27r A012 = 27p.A01(this.A01);
        String str3 = this.A00.A00;
        29R r3 = A012.A09;
        0qQ.A0B(str3, 0);
        1Ln A08 = 1Ln.A08(r3.A01);
        C279294yP A0J = r3.A0J();
        if (DbT.A1Y(A08) && A0J != null) {
            A08.A0t("IG_CAMERA_ENTITY_TAP");
            A08.A0r(str);
            29R.A00(A08, r3);
            A08.A0R("magicmod_session_id", str3);
            A08.A0R("genai_prompt", (String) null);
            A08.A0Q("prompt_pill_position", (Long) null);
            A08.A0M((AnonymousClass0Ac) null, "genai_generation_type");
            A08.A0R("genai_content_id", str2);
            A08.Cgf();
        }
    }

    public /* synthetic */ C55934Hpx(UserSession userSession) {
        BBV bbv = new BBV(C51972G9s.A0n(), 13);
        this.A01 = userSession;
        this.A00 = bbv;
    }
}
