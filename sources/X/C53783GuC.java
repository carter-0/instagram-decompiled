package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GuC  reason: case insensitive filesystem */
public final class C53783GuC extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final JR6 A02;
    public final UserSession A03;
    public final boolean A04;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        0qQ.A0B(r13, 0);
        WGU A002 = WGU.A00(this.A03);
        C16678UzE uzE = C16678UzE.BOOST_REEL_PILL;
        A002.A01 = "boost_reel_pill";
        A002.A0H(uzE, "boost_reel_pill");
        JR6 jr6 = this.A02;
        C267324bN r9 = this.A00;
        jr6.Dz5(r9, this.A01, false);
        AnonymousClass3XV r0 = 2WX.A02;
        boolean z = this.A04;
        int i = R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size;
        if (z) {
            i = R.dimen.challenge_sticker_v2_2_winner2_mention_bottom_margin;
        }
        long A0C = C244013aV.A0C(r13, i);
        Integer num = AnonymousClass05K.A01;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num, 0, A0C);
        C243573Zh r4 = C243573Zh.CENTER;
        Integer num2 = AnonymousClass05K.A00;
        2WX A0X = C51971G9r.A0X(C51971G9r.A0Y(A003, num2, r4, 3), num2, 100.0f, 0);
        C243583Zi r7 = C243583Zi.FLEX_START;
        2Wb A0Q = C51972G9s.A0Q(r13);
        2WX A0O = C51974G9v.A0O(C51971G9r.A0Y((2WX) null, num2, r4, 3), num2, num, 100.0f, 0);
        C243583Zi r42 = C243583Zi.SPACE_EVENLY;
        2Wb A0L = C51973G9u.A0L(A0Q);
        A0L.A00(new C53677GsU(C244013aV.A0E(A0L, 2131976633), C58715IwO.A01(this, 7)));
        C51971G9r.A1G(new C53677GsU(C305796Jo.A01(AnonymousClass7TF.A0A(A0L.A00.A0C), r9.A02), C58715IwO.A01(this, 8)), A0L, A0Q, A0O, r42);
        return C243563Zg.A08(A0Q, r13, A0X, r7);
    }

    public C53783GuC(C267324bN r1, C52058GDe gDe, UserSession userSession, JR6 jr6, boolean z) {
        C51974G9v.A1P(userSession, r1, gDe, jr6);
        this.A03 = userSession;
        this.A00 = r1;
        this.A01 = gDe;
        this.A02 = jr6;
        this.A04 = z;
    }
}
