package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.Grz  reason: case insensitive filesystem */
public final class C53646Grz extends C251343mx {
    public final GNY A00;
    public final SocialContextBubbleUiState A01;

    public final C251263mp A0X(AnonymousClass3Y5 r27) {
        AnonymousClass3Y5 r25 = r27;
        0qQ.A0B(r25, 0);
        C243573Zh r18 = C243573Zh.FLEX_START;
        C243583Zi r17 = C243583Zi.FLEX_END;
        AnonymousClass3XV r21 = 2WX.A02;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(AnonymousClass05K.A15, -15.0f, 1));
        float f = this.A00.A00;
        long A06 = C51965G9l.A06(0.6f * f);
        Integer num = AnonymousClass05K.A0C;
        2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0X, num, 1, A06), AnonymousClass05K.A1F, 0, C51965G9l.A06(f));
        2Wb A0Q = C51972G9s.A0Q(r25);
        C244413b9 r1 = C244413b9.ABSOLUTE;
        Integer num2 = AnonymousClass05K.A0Y;
        2WX A0Y = C51971G9r.A0Y((2WX) null, num2, r1, 3);
        long A0D = C51969G9p.A0D();
        2WX A0N = C51974G9v.A0N(A0Y, num, 1, A0D);
        2V1 r8 = A0Q.A00;
        2Wb A0S = AnonymousClass7TG.A0S(r8);
        C51971G9r.A1C(new C249263jP(ImageView.ScaleType.CENTER_INSIDE, r21, (Integer) null, R.drawable.fv_bubble_tail, A0S.Bnf().A02(2Yu.A02(A0S.A00.A0C))), A0S, A0Q, A0N);
        C52334GOc gOc = new C52334GOc(r8, new C52335GOd());
        C52335GOd gOd = gOc.A01;
        AnonymousClass2V4 r13 = gOc.A02;
        gOd.A00 = (float) r13.A00(14.0f);
        gOd.A01 = (float) r13.A00(0.0f);
        Context context = r8.A0C;
        gOd.A02 = A0Q.Bnf().A02(2Yu.A02(context));
        gOd.A0C = true;
        2WX A003 = AnonymousClass9JR.A00(C51973G9u.A0X(C51973G9u.A0X(C51971G9r.A0Y((2WX) null, AnonymousClass05K.A00, C243573Zh.CENTER, 3), num2, 34.0d, 0), num, 40.0d, 0), AnonymousClass05K.A0N, 0, Double.doubleToRawLongBits(92.0d));
        long A0D2 = C51970G9q.A0D();
        2WX A0Q2 = C51973G9u.A0Q(A003, C51967G9n.A0S(0, A0D2), 0, A0D2);
        String str = this.A01.A07;
        int A062 = C51968G9o.A06(context, A0Q);
        Integer num3 = AnonymousClass05K.A01;
        long A0G = C51972G9s.A0G(11.0f);
        Typeface typeface = Typeface.DEFAULT;
        C244103ae A0b = C51971G9r.A0b(r8, (2V5) null, str, 0);
        C51973G9u.A17(A0Q, A0b, A062, A0G);
        A0b.A0R(0);
        G9w.A12(typeface, A0Q, A0b, A0D);
        C51974G9v.A16(A0b, num, num3);
        A0b.A0M(4);
        A0b.A0b(false);
        A0b.A0Y(false);
        A0b.A0Z(false);
        A0b.A0D();
        C52334GOc.A01(C51971G9r.A0c((AnonymousClass2VW) null, A0Q2, A0b), gOc);
        A0Q.A00(gOd);
        return C243563Zg.A07(A0Q, r25, A002, r18, r17);
    }

    public C53646Grz(GNY gny, SocialContextBubbleUiState socialContextBubbleUiState) {
        this.A01 = socialContextBubbleUiState;
        this.A00 = gny;
    }
}
