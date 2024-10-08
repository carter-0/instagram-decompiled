package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.GsX  reason: case insensitive filesystem */
public final class C53680GsX extends C251343mx {
    public final C59616JQk A00;
    public final C53581Gqw A01;

    public final C251263mp A0X(AnonymousClass3Y5 r17) {
        AnonymousClass3Y5 r13 = r17;
        0qQ.A0B(r13, 0);
        2Wa A002 = C58703IwC.A00(r13, this, 3);
        C243533Zd r3 = C243533Zd.LOCAL;
        AnonymousClass4Ey A003 = 2Vi.A00(r3, "fan_club_badge");
        C51966G9m.A1M(A003, 300);
        C246053du r0 = C246033ds.A03;
        A003.A03(r0);
        A003.A02(0.0f);
        AnonymousClass4Ey A004 = 2Vi.A00(r3, "fan_club_text");
        C51966G9m.A1M(A004, 300);
        A004.A03(r0);
        A004.A02(0.0f);
        A004.A03(C246033ds.A00);
        A004.A02(0.0f);
        A004.A03(C246033ds.A02);
        A004.A02(0.0f);
        AnonymousClass4F7.A00(r13, new 2Vm(new AnonymousClass4Ey[]{A003, A004}));
        AnonymousClass3XV r02 = 2WX.A02;
        Drawable drawable = C243803a8.A00(r13).getDrawable(R.drawable.fan_club_badge_background);
        Integer num = AnonymousClass05K.A00;
        2WX A0V = C51972G9s.A0V(C51971G9r.A0Z(C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, drawable, 4)), AnonymousClass05K.A0Y, J6Q.A00(A002, this, 20), (String) null), J6P.A00(this, 7));
        2V1 r03 = r13.A05;
        2WX A0V2 = C51971G9r.A0V(r03, A0V, r3, "fan_club_badge");
        2Wb A0S = AnonymousClass7TG.A0S(r03);
        Drawable A0K = C51968G9o.A0K(A0S, R.drawable.instagram_crown_pano_filled_12);
        C51972G9s.A0w(A0K, A0S, R.color.canvas_bottom_sheet_description_text_color);
        2V1 r7 = A0S.A00;
        C247393gG A0a = C51971G9r.A0a(A0K, r7);
        A0a.A0C();
        A0S.A00(A0a.A0A());
        if (C51969G9p.A1V(A002)) {
            2WX A0V3 = C51971G9r.A0V(r7, C51972G9s.A0R((2WX) null, 0, C244013aV.A09(A0S)), r3, "fan_club_text");
            Typeface typeface = Typeface.DEFAULT_BOLD;
            String A0E = C244013aV.A0E(A0S, 2131961950);
            long A0G = C51972G9s.A0G(12.0f);
            int A0C = C51971G9r.A0C(r7, A0S);
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r7, (2V5) null, A0E, 0);
            C51973G9u.A17(A0S, A0b, A0C, A0G);
            A0b.A0R(0);
            G9w.A12(typeface, A0S, A0b, A0D);
            A0b.A0W(num);
            C51974G9v.A1A(A0b, num, false, true);
            C244123ag.A00(A0b, A0V3);
            C51967G9n.A1G(A0S, A0b);
        }
        return C243563Zg.A0B(A0S, r13, A0V2);
    }

    public C53680GsX(C59616JQk jQk, C53581Gqw gqw) {
        AnonymousClass7TG.A1O(gqw, jQk);
        this.A01 = gqw;
        this.A00 = jQk;
    }
}
