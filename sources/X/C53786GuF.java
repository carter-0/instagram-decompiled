package X;

import android.graphics.Typeface;
import com.instagram.android.R;

/* renamed from: X.GuF  reason: case insensitive filesystem */
public final class C53786GuF extends C251343mx {
    public final int A00;
    public final int A01;
    public final 2WX A02;
    public final AnonymousClass0iw A03;
    public final JND A04;

    public C53786GuF(2WX r2, AnonymousClass0iw r3, JND jnd, int i, int i2) {
        0qQ.A0B(r3, 1);
        this.A03 = r3;
        this.A04 = jnd;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r19) {
        AnonymousClass3Y5 r17 = r19;
        0qQ.A0B(r17, 0);
        JND jnd = this.A04;
        if ((jnd instanceof C57667IeW) || !(jnd instanceof C53590Gr5)) {
            return null;
        }
        C243573Zh r16 = C243573Zh.FLEX_START;
        2WX r9 = this.A02;
        2Wb A0Q = C51972G9s.A0Q(r17);
        AnonymousClass0iw r12 = this.A03;
        C53590Gr5 gr5 = (C53590Gr5) jnd;
        JNE jne = gr5.A00;
        AnonymousClass3XV r0 = 2WX.A02;
        A0Q.A00(new C53787GuG(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A1I, 0, C244013aV.A05(A0Q)), r12, jne, this.A00, this.A01));
        String str = gr5.A01;
        2V1 r10 = A0Q.A00;
        int A0C = C51971G9r.A0C(r10, A0Q);
        long A06 = C244013aV.A06(A0Q);
        int A022 = A0Q.Bnf().A02(R.color.black_30_transparent);
        long A0C2 = C244013aV.A0C(A0Q, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r10, (2V5) null, str, 0);
        C51973G9u.A17(A0Q, A0b, A0C, A06);
        G9w.A1F(A0Q, A0b, 2Wd.A00(G9t.A15(typeface, A0Q, A0b, 0, A022), A0C2), A0D);
        C51974G9v.A19(A0b, num, false);
        A0b.A0M(2);
        C51974G9v.A0y(A0Q, A0b, false);
        return C243563Zg.A07(A0Q, r17, r9, r16, (C243583Zi) null);
    }
}
