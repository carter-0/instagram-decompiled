package X;

import android.graphics.Typeface;
import com.instagram.android.R;

/* renamed from: X.GsW  reason: case insensitive filesystem */
public final class C53679GsW extends C251343mx {
    public final GC5 A00;
    public final C267324bN A01;

    public C53679GsW(C267324bN r2, GC5 gc5) {
        0qQ.A0B(gc5, 2);
        this.A01 = r2;
        this.A00 = gc5;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r14) {
        0qQ.A0B(r14, 0);
        C267334bO r1 = this.A01.A0G;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.clips.model.QPMidcardImpressionItem");
        AnonymousClass4UC r3 = ((C57029ILv) r1).A00;
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A01;
        2WX A0V = C51972G9s.A0V(C51971G9r.A0Y(AnonymousClass9JR.A00(AnonymousClass9JR.A00(C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, "android.widget.Button", 0)), AnonymousClass05K.A06, 0, C244013aV.A06(r14)), AnonymousClass05K.A0E, 0, C244013aV.A03(r14)), num, true, 4), J6Q.A00(r3, this, 12));
        2V1 r8 = r14.A05;
        int A0A = C51972G9s.A0A(r8.A0C, r14, R.attr.igds_color_secondary_text_on_media);
        long A0C = C244013aV.A0C(r14, R.dimen.button_text_size);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num2 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r8, (2V5) null, "Hide", 0);
        C51973G9u.A16(r14, A0b, A0A, A0C);
        A0b.A0R(1);
        G9w.A11(typeface, r14, A0b, A0D);
        A0b.A0B();
        C51974G9v.A1A(A0b, num2, false, true);
        2WW A0R = C51967G9n.A0R(A0V, A0b);
        return C243563Zg.A0E(G9t.A0v(A0R, r8), r14, C51974G9v.A0J((2WX) null, C51965G9l.A0b(num2, 91.0f, 0), num2));
    }
}
