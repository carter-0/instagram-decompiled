package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.session.UserSession;

public final class JHX extends 0Yg implements 0sK {
    public final /* synthetic */ LineType A00;
    public final /* synthetic */ C299665vd A01;
    public final /* synthetic */ C299575vQ A02;
    public final /* synthetic */ C299635va A03;
    public final /* synthetic */ C303846Ba A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHX(LineType lineType, C299665vd r3, C299575vQ r4, C299635va r5, C303846Ba r6, UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(3);
        this.A02 = r4;
        this.A05 = userSession;
        this.A01 = r3;
        this.A06 = str;
        this.A03 = r5;
        this.A07 = str2;
        this.A00 = lineType;
        this.A0A = z;
        this.A04 = r6;
        this.A09 = z2;
        this.A08 = z3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A002;
        C286565Wx r0;
        C286575Wy r4 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1613882474, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:497)");
            }
            0lg A0j = C51969G9p.A0j(r4);
            C303856Bb r6 = (C303856Bb) this.A02;
            boolean z = r6.A00.A01;
            Integer num = r6.A02;
            0sP r2 = null;
            if (num == null || num.intValue() <= 0) {
                num = null;
            }
            0qQ.A0B(A0j, 0);
            if (num != null) {
                A002 = num.intValue();
            } else {
                A002 = (int) 182.A00(0Tu.A05, A0j, 37163583215239461L);
            }
            int i = 16;
            if (z) {
                i = 0;
            }
            C304826Fj r11 = new C304826Fj(0.0f, 0.0f, 0.0f, (float) i);
            0Tu r9 = 0Tu.A05;
            C53273GlL glL = new C53273GlL(r11, A002, C51965G9l.A1a(r9, A0j, 36327838412126964L));
            AnonymousClass62P r19 = r6.A03;
            boolean z2 = r6.A05;
            boolean z3 = r6.A04;
            boolean z4 = r6.A07;
            UserSession userSession = this.A05;
            0qQ.A0B(userSession, 0);
            if (182.A06(r9, userSession, 36327696678206078L)) {
                r4.ExS(59649258);
                r4.ExS(-1660643214);
                C299665vd r62 = this.A01;
                boolean AGu = r4.AGu(r62);
                String str = this.A06;
                boolean A1Z = C51965G9l.A1Z(r4, str, AGu);
                Object ECw = r4.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = new C73943PmN(str, r62, 13);
                    r4.FLL(ECw);
                }
                r2 = (0sP) ECw;
                r0 = C51965G9l.A0H(r4, false);
            } else if (r6.A06) {
                r4.ExS(59820564);
                r4.ExS(-1660638290);
                C299635va r92 = this.A03;
                boolean AGu2 = r4.AGu(r92);
                String str2 = this.A06;
                boolean A1X = C51972G9s.A1X(r4, str2, (Object) null, AGu2);
                String str3 = this.A07;
                boolean A1Z2 = C51965G9l.A1Z(r4, str3, A1X);
                Object ECw2 = r4.ECw();
                if (A1Z2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C58753Ix0(r92, str2, str3, 1);
                    r4.FLL(ECw2);
                }
                r2 = (0sP) ECw2;
                r0 = (C286565Wx) r4;
                C286565Wx.A0L(r0, false);
            } else {
                r4.ExS(60183666);
                r0 = (C286565Wx) r4;
            }
            C286565Wx.A0L(r0, false);
            String str4 = this.A06;
            LineType lineType = this.A00;
            boolean z5 = this.A0A;
            C303846Ba r93 = this.A04;
            r4.ExS(-1660659406);
            C299665vd r15 = this.A01;
            boolean A1Z3 = C51965G9l.A1Z(r4, (Object) null, C51971G9r.A1U(r4, r15, str4));
            String str5 = this.A07;
            boolean A1Z4 = C51965G9l.A1Z(r4, str5, A1Z3);
            Object ECw3 = r4.ECw();
            if (A1Z4 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C59348JGa(r15, str4, str5);
                r4.FLL(ECw3);
            }
            0sK r1 = (0sK) ECw3;
            C286565Wx.A0L(r0, false);
            r4.ExS(-1660625361);
            C299635va r14 = this.A03;
            boolean AGu3 = r4.AGu(r14);
            Object ECw4 = r4.ECw();
            if (AGu3 || ECw4 == AnonymousClass5XT.A00) {
                ECw4 = C59099J6h.A00(r4, r14, 43);
            }
            C53273GlL glL2 = glL;
            C286575Wy r94 = r4;
            C56613I4o.A00(r94, (Modifier) null, lineType, glL2, r93, str4, r2, C51965G9l.A0z(r0, ECw4), (0sP) null, r1, r19, 0, 0, 83968, z5, z2, z3, this.A09, this.A08, false, z4);
            if (0fL.A02()) {
                0fL.A00(988295757);
            }
        } else {
            r4.Evl();
        }
        return C60340gF.A00;
    }
}
