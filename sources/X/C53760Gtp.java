package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;

/* renamed from: X.Gtp  reason: case insensitive filesystem */
public final class C53760Gtp extends C251343mx {
    public final GC5 A00;
    public final Integer A01;
    public final String A02;
    public final C267324bN A03;

    public C53760Gtp(C267324bN r2, GC5 gc5, Integer num, String str) {
        0qQ.A0B(gc5, 2);
        this.A03 = r2;
        this.A00 = gc5;
        this.A01 = num;
        this.A02 = str;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r28) {
        AnonymousClass3Y5 r7 = r28;
        0qQ.A0B(r7, 0);
        2V1 r6 = r7.A05;
        int A09 = C51972G9s.A09(r6.A0C, r7);
        int A08 = C51969G9p.A08(r7, R.color.track_background_color);
        C267334bO r1 = this.A03.A0G;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.clips.model.QPMidcardImpressionItem");
        AnonymousClass4UC r19 = ((C57029ILv) r1).A00;
        int A082 = C51969G9p.A08(r7, R.color.primary_text_disabled_material_dark);
        C59717JVb jVb = new C59717JVb(GradientDrawable.Orientation.TOP_BOTTOM);
        jVb.setCornerRadius(16.0f);
        jVb.setColor(A082);
        2V5 A002 = C247343gB.A00(r7, jVb);
        C243673Zt A003 = C243633Zp.A00(r7, C58645IvG.A00);
        Drawable A0D = C244013aV.A0D(r7, R.drawable.sponsored_viewer_full_width_overlay_cta_foreground);
        A0D.setTint(C51969G9p.A08(r7, R.color.fds_transparent));
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A004 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0B, 0, C244013aV.A0C(r7, R.dimen.action_bar_item_spacing_left));
        String str = this.A02;
        long A04 = C244013aV.A04(r7);
        Integer num = AnonymousClass05K.A0C;
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = C51969G9p.A0D();
        Integer num2 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r6, (2V5) null, str, 0);
        C51973G9u.A16(r7, A0b, A09, A04);
        A0b.A0R(1);
        G9w.A11(typeface, r7, A0b, A0D2);
        A0b.A0W(num);
        C51974G9v.A12(A0b, num2);
        A0b.A0E();
        C51973G9u.A19(A004, A0b, false);
        2WW A0A = A0b.A0A();
        long A07 = C51967G9n.A07(r7);
        Integer num3 = AnonymousClass05K.A01;
        2WX A0X = C51971G9r.A0X(AnonymousClass9JR.A00((2WX) null, num3, 0, A07), num2, 91.0f, 0);
        Integer num4 = AnonymousClass05K.A15;
        2WX A0Z = C51971G9r.A0Z(C51971G9r.A0V(r6, C51971G9r.A0W(A002, C51971G9r.A0Y(A0X, num4, A0D, 4), num), C243533Zd.LOCAL, "cta"), num2, new C58768IxF(43, A003, this, r7, A002), (String) null);
        if (str != null) {
            A0Z = C51971G9r.A0Y(A0Z, AnonymousClass05K.A0N, str, 0);
        }
        return C243563Zg.A0E(G9t.A0v(A0A, r6), r7, C51974G9v.A0J(C51971G9r.A0Y(C51971G9r.A0Y(C51972G9s.A0U(C51971G9r.A0Y(A0Z, num3, true, 4), num3, 0), num4, J6J.A00(this, 43), 0), AnonymousClass05K.A0u, true, 4), C51965G9l.A0d(AnonymousClass05K.A04, new C58787IxY(A0D, r7, this, r19, A08, 8), 4), num2));
    }
}
