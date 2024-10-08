package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.common.session.UserSession;

/* renamed from: X.GTp  reason: case insensitive filesystem */
public final class C52463GTp extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final UserSession A02;
    public final JTB A03;

    public C52463GTp(C267324bN r2, C52058GDe gDe, UserSession userSession, JTB jtb) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = gDe;
        this.A03 = jtb;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r17) {
        JTB jtb;
        C55996Hr2 Arh;
        AnonymousClass3Y5 r5 = r17;
        0qQ.A0B(r5, 0);
        if (!this.A01.A0c || (((jtb = this.A03) != null && (!jtb.CRt(this.A00, false))) || !C52368GPp.A00(this.A02) || jtb == null || (Arh = jtb.Arh()) == null)) {
            return null;
        }
        2Wa A002 = C58705IwE.A00(r5, Arh, 14);
        C58693Iw2.A00(r5, Arh, A002, new Object[]{Arh}, 22);
        String A0F = C244013aV.A0F(r5, A002.A03, 2131957530);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0j, 0, C244013aV.A03(r5));
        Integer num = AnonymousClass05K.A01;
        2WX A0U = C51972G9s.A0U(A003, num, 0);
        2V1 Aqq = r5.Aqq();
        Context A0B = C51965G9l.A0B(Aqq);
        int A09 = C51972G9s.A09(A0B, r5);
        long A08 = C244013aV.A08(r5);
        Integer num2 = AnonymousClass05K.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        0qQ.A08(typeface);
        Typeface A032 = 0oh.A03(A0B, typeface, num2);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(Aqq, (2V5) null, A0F, 0);
        C51973G9u.A16(r5, A0b, A09, A08);
        A0b.A0R(0);
        G9w.A11(A032, r5, A0b, A0D);
        A0b.A0W(num2);
        C51974G9v.A12(A0b, num);
        A0b.A0M(1);
        A0b.A0b(false);
        G9t.A1N(A0b, false);
        2WW A0R = C51967G9n.A0R(A0U, A0b);
        return C243563Zg.A0B(G9t.A0v(A0R, r5.A05), r5, C51971G9r.A0Y(C51971G9r.A0Z(C51971G9r.A0Z(C51971G9r.A0X((2WX) null, num, 1.0f, 1), num2, J6E.A00(Arh, 20), (String) null), num, J6E.A00(Arh, 21), (String) null), AnonymousClass05K.A0D, "clips_delayed_skip_ads_skip_in_timer", 4));
    }
}
