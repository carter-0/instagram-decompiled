package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;

/* renamed from: X.Gt3  reason: case insensitive filesystem */
public final class C53712Gt3 extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final JTB A02;

    public final C251263mp A0X(AnonymousClass3Y5 r20) {
        JTB jtb;
        C55996Hr2 Arh;
        AnonymousClass3Y5 r8 = r20;
        0qQ.A0B(r8, 0);
        C52058GDe gDe = this.A01;
        C52058GDe gDe2 = gDe;
        if (!gDe.A0b || (jtb = this.A02) == null || (Arh = jtb.Arh()) == null) {
            return null;
        }
        2Wa A002 = C58705IwE.A00(r8, Arh, 10);
        C58693Iw2.A00(r8, Arh, A002, new Object[]{Arh}, 14);
        String A0F = C244013aV.A0F(r8, A002.A03, 2131955352);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0j, 0, C244013aV.A03(r8));
        Integer num = AnonymousClass05K.A01;
        2WX A0U = C51972G9s.A0U(A003, num, 0);
        2V1 Aqq = r8.Aqq();
        Context A0B = C51965G9l.A0B(Aqq);
        int A09 = C51972G9s.A09(A0B, r8);
        long A08 = C244013aV.A08(r8);
        Integer num2 = AnonymousClass05K.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        0qQ.A08(typeface);
        Typeface A03 = 0oh.A03(A0B, typeface, num2);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(Aqq, (2V5) null, A0F, 0);
        C51973G9u.A16(r8, A0b, A09, A08);
        A0b.A0R(0);
        G9w.A11(A03, r8, A0b, A0D);
        A0b.A0W(num2);
        C51974G9v.A12(A0b, num);
        A0b.A0M(1);
        A0b.A0b(false);
        G9t.A1N(A0b, false);
        2WW A0R = C51967G9n.A0R(A0U, A0b);
        2V5 A0Z = C51968G9o.A0Z(r8, 0.0f);
        C243773a4.A00(r8, C58697Iw6.A00(A0Z, C243633Zp.A00(r8, C58590IuN.A00), this, 35), new Object[]{gDe2});
        2WX A0W = C51971G9r.A0W(A0Z, (2WX) null, AnonymousClass05K.A03);
        2Wb A0Q = C51972G9s.A0Q(r8);
        long A0C = C244013aV.A0C(A0Q, R.dimen.afi_margin_top);
        return C51967G9n.A0Q(C243563Zg.A0B(G9t.A0v(A0R, A0Q.A00), A0Q, C51971G9r.A0Y(C51971G9r.A0Z(C51971G9r.A0Z(C51973G9u.A0W(C51971G9r.A0Y(AnonymousClass9JR.A00(C51973G9u.A0Q((2WX) null, C51967G9n.A0S(0, A0C), 0, C244013aV.A0C(A0Q, R.dimen.accent_edge_thickness)), AnonymousClass05K.A0A, 0, C244013aV.A06(A0Q)), num2, C244013aV.A0D(A0Q, R.drawable.clips_viewer_pill_background_attribute_pill_system), 4), A0Q, num, R.dimen.asset_picker_section_title_horizontal_padding, 0), num2, J6E.A00(Arh, 10), (String) null), num, J6E.A00(Arh, 11), (String) null), AnonymousClass05K.A0D, "clips_delayed_skip_ads_iteration_1_timer", 4)), A0Q, r8, A0W);
    }

    public C53712Gt3(C267324bN r1, C52058GDe gDe, JTB jtb) {
        AnonymousClass7TG.A1O(r1, gDe);
        this.A00 = r1;
        this.A01 = gDe;
        this.A02 = jtb;
    }
}
