package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gt5  reason: case insensitive filesystem */
public final class C53714Gt5 extends C251343mx {
    public final UserSession A00;
    public final C52058GDe A01;
    public final JTB A02;

    public C53714Gt5(C52058GDe gDe, UserSession userSession, JTB jtb) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = gDe;
        this.A02 = jtb;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r30) {
        AnonymousClass0eM r0;
        AnonymousClass3Y5 r4 = r30;
        0qQ.A0B(r4, 0);
        UserSession userSession = this.A00;
        if ((!182.A06(C51968G9o.A0b(userSession), userSession, 36322916380125860L) || !this.A01.A0a) && (!182.A06(C51968G9o.A0b(userSession), userSession, 36322916380322470L) || !this.A01.A0e)) {
            return null;
        }
        String A0E = C244013aV.A0E(r4, 2131955353);
        Integer num = AnonymousClass05K.A01;
        2V1 Aqq = r4.Aqq();
        Context A0B = C51965G9l.A0B(Aqq);
        int A09 = C51972G9s.A09(A0B, r4);
        long A08 = C244013aV.A08(r4);
        Integer num2 = AnonymousClass05K.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        0qQ.A08(typeface);
        Typeface A03 = 0oh.A03(A0B, typeface, num2);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(Aqq, (2V5) null, A0E, 0);
        C51973G9u.A16(r4, A0b, A09, A08);
        A0b.A0R(0);
        G9w.A11(A03, r4, A0b, A0D);
        C51970G9q.A1K(A0b, num2, num);
        C51970G9q.A1I(A0b, 1.0f, false);
        A0b.A0M(1);
        A0b.A0b(false);
        G9t.A1N(A0b, false);
        2WW A0A = A0b.A0A();
        C55996Hr2 Arh = this.A02.Arh();
        2Wa A002 = C58705IwE.A00(r4, Arh, 13);
        C243773a4.A00(r4, C58697Iw6.A00(A002, Arh, C51965G9l.A11(), 36), new Object[]{Arh});
        AnonymousClass3XV r02 = 2WX.A02;
        2WX A0Z = C51971G9r.A0Z(C51971G9r.A0Z(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A04, 0, C244013aV.A03(r4)), num2, J6E.A00(Arh, 17), (String) null), num, J6E.A00(Arh, 18), (String) null);
        2Wb A0Q = C51972G9s.A0Q(r4);
        C53616GrV A003 = C54000Gxi.A00(A0Q.Aqq());
        C54000Gxi gxi = A003.A01;
        AnonymousClass2V4 r1 = A003.A02;
        gxi.A00 = r1.A01(R.attr.igds_color_progress_bar_on_media);
        A003.A02.set(0);
        A003.A00.A0Z().A0F(r1.A00(1.0f));
        A003.A03();
        A0Q.A00(A003.A0A());
        long A0B2 = C244013aV.A0B(A0Q);
        2WX A0E2 = C51974G9v.A0E((2WX) null, C51967G9n.A0V(A0B2), 0, C244013aV.A0C(A0Q, R.dimen.ai_agent_share_profile_sticker_padding));
        Integer num3 = AnonymousClass05K.A0D;
        2WX A0X = C51965G9l.A0X(A0E2, C51965G9l.A0d(num3, "clips_delayed_skip_ads_snack_bar_styled_timer", 4));
        2Wb A0w = G9t.A0w(A0Q);
        String valueOf = String.valueOf(AnonymousClass7TE.A0M(A002.A03));
        if (182.A06(C51968G9o.A0b(userSession), userSession, 36322916380125860L) || !182.A06(C51968G9o.A0b(userSession), userSession, 36322916380322470L)) {
            r0 = AnonymousClass3Mk.A0C;
        } else {
            r0 = AnonymousClass3Mk.A0F;
        }
        long A0K = C51970G9q.A0K();
        2WX A0Y = C51971G9r.A0Y(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, A0K), num, 0, A0K), num3, "clips_snack_bar_delayed_skip_ads_timer_progress_ring", 4);
        C244403b8 r26 = C244403b8.STATE_ACTIVE;
        Float valueOf2 = Float.valueOf(5.0f);
        C244423bA r23 = new C244423bA(A0Y, (RingSpec) r0.getValue(), r26, valueOf2, valueOf2);
        2WX A0B3 = C51974G9v.A0B((2WX) null);
        2V1 Aqq2 = A0w.Aqq();
        Context A0B4 = C51965G9l.A0B(Aqq2);
        int A05 = C51968G9o.A05(A0B4, A0w);
        long A082 = C244013aV.A08(A0w);
        Typeface A032 = 0oh.A03(A0B4, typeface, num2);
        C244103ae A0b2 = C51971G9r.A0b(Aqq2, (2V5) null, valueOf, 0);
        C51973G9u.A17(A0w, A0b2, A05, A082);
        A0b2.A0R(0);
        G9w.A12(A032, A0w, A0b2, A0D);
        A0b2.A0W(num2);
        C51974G9v.A13(A0b2, num, 1.0f);
        2WW A0c = C51971G9r.A0c((AnonymousClass2VW) null, A0B3, A0b2);
        C51967G9n.A1C(C51973G9u.A0J(A0c, r23, Aqq2), A0w, AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0E, 0, C51970G9q.A0D()));
        C51971G9r.A1C(A0A, A0w, A0Q, A0X);
        return C243563Zg.A03(A0Q, r4, A0Z);
    }
}
