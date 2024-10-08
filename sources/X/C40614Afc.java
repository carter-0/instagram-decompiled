package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Afc  reason: case insensitive filesystem */
public final class C40614Afc implements X59 {
    public final /* synthetic */ C353438Hq A00;

    public C40614Afc(C353438Hq r1) {
        this.A00 = r1;
    }

    public final void Dba(C18078Vl7 vl7) {
        0qQ.A0B(vl7, 0);
        C353438Hq r1 = this.A00;
        vl7.A06(C391639tP.TOGGLE_TO_SG_PRE_LIVE);
        if (!r1.A09.A0Y()) {
            vl7.A06(C391639tP.PROMPT_PREVIEWING_FROM_GLASSES);
            UserSession userSession = r1.A08;
            1Av A002 = 1Au.A00(userSession);
            0s0 r0 = A002.A22;
            AnonymousClass0YZ[] r4 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(A002, r0, r4, 343)) {
                vl7.A06(C391639tP.PROMPT_VIDEO_CAPTURE_USER_ED);
                1Av A003 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A003, A003.A22, r4, 343, true);
            }
        }
    }
}
