package X;

import android.graphics.Typeface;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.Gvj  reason: case insensitive filesystem */
public final class C53878Gvj extends C251343mx {
    public final SocialContextBubbleUiState A00;

    public final C251263mp A0X(AnonymousClass3Y5 r28) {
        AnonymousClass3Y5 r11 = r28;
        0qQ.A0B(r11, 0);
        AnonymousClass3XV r20 = 2WX.A02;
        C244413b9 r14 = C244413b9.ABSOLUTE;
        Integer num = AnonymousClass05K.A0Y;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, r14, 3));
        long A0D = C51970G9q.A0D();
        long A0K = C51970G9q.A0K();
        long A0B = C51969G9p.A0B();
        Integer num2 = AnonymousClass05K.A0C;
        2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0X, num2, 1, A0D), num, 1, A0K);
        Integer num3 = AnonymousClass05K.A0j;
        2WX A003 = AnonymousClass9JR.A00(A002, num3, 1, A0B);
        2Wb A0Q = C51972G9s.A0Q(r11);
        C243573Zh r17 = C243573Zh.FLEX_START;
        C243583Zi r16 = C243583Zi.FLEX_END;
        2WX A0E = C51974G9v.A0E(C51972G9s.A0R(C52112GFg.A01(r20, 0.8f), 0, A0D), C51965G9l.A0c(AnonymousClass05K.A1F, 0, A0K), 0, A0B);
        2Wb A0L = C51973G9u.A0L(A0Q);
        2WX A0Y = C51971G9r.A0Y((2WX) null, num, r14, 3);
        long doubleToRawLongBits = Double.doubleToRawLongBits(17.0d);
        2WX A004 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(AnonymousClass9JR.A00(C51972G9s.A0T(A0Y, 0, doubleToRawLongBits), AnonymousClass05K.A00, 0, doubleToRawLongBits), num2, 1, A0D), num3, 1, A0B);
        2Wb A0w = G9t.A0w(A0L);
        C51971G9r.A1C(new C249263jP(ImageView.ScaleType.CENTER_INSIDE, r20, (Integer) null, R.drawable.fv_bubble_tail, C51968G9o.A08(A0w.A00.A0C, A0w, R.attr.igds_color_creation_button)), A0w, A0L, A004);
        2V1 Aqq = A0L.Aqq();
        C52334GOc gOc = new C52334GOc(Aqq, new C52335GOd());
        C52335GOd gOd = gOc.A01;
        AnonymousClass2V4 r5 = gOc.A02;
        gOd.A00 = (float) r5.A00(16.0f);
        gOd.A01 = (float) r5.A00(0.0f);
        gOd.A02 = C51968G9o.A08(Aqq.A0C, A0L, R.attr.igds_color_creation_button);
        gOd.A0C = true;
        C52334GOc.A01(A00(A0L, (2WX) null, 0.0f), gOc);
        A0L.A00(gOd);
        A0Q.A00(C243563Zg.A07(A0L, A0Q, A0E, r17, r16));
        A0Q.A00(A00(A0Q, A003, 1.0f));
        return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0Q.A01, false);
    }

    private final 2WW A00(C70832Wc r14, 2WX r15, float f) {
        AnonymousClass3XV r0 = 2WX.A02;
        C243573Zh r02 = C243573Zh.FLEX_START;
        Integer num = AnonymousClass05K.A00;
        2WX A01 = C52112GFg.A01(AnonymousClass9JR.A00(AnonymousClass9JR.A00(C51965G9l.A0X((2WX) null, C51968G9o.A0d(num, r02)), AnonymousClass05K.A0Y, 0, Double.doubleToRawLongBits(34.0d)), AnonymousClass05K.A0j, 0, C51970G9q.A0C()), f);
        long A0D = C51970G9q.A0D();
        2WX A002 = C51973G9u.A0Q(A01, C51967G9n.A0S(0, A0D), 0, A0D).A00(r15);
        String str = this.A00.A07;
        2V1 Aqq = r14.Aqq();
        int A0C = C51971G9r.A0C(Aqq, r14);
        Integer num2 = AnonymousClass05K.A01;
        long A0G = C51972G9s.A0G(11.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = C51969G9p.A0D();
        C244103ae A13 = G9t.A13(Aqq, str, A0C);
        C51971G9r.A1J(A13, r14.Bnf(), 0, A0G);
        A13.A0S(typeface);
        A13.A0F();
        C51974G9v.A10(A13, r14, C51969G9p.A09(r14, A0D2), A0D2);
        A13.A0H((float) C51969G9p.A09(r14, A0D2));
        C51974G9v.A16(A13, num, num2);
        A13.A0M(2);
        A13.A0b(false);
        A13.A0Y(false);
        A13.A0Z(false);
        A13.A0D();
        return C51971G9r.A0c((AnonymousClass2VW) null, A002, A13);
    }

    public C53878Gvj(SocialContextBubbleUiState socialContextBubbleUiState) {
        this.A00 = socialContextBubbleUiState;
    }
}
