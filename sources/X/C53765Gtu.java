package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.BitSet;

/* renamed from: X.Gtu  reason: case insensitive filesystem */
public final class C53765Gtu extends C251343mx {
    public final int A00;
    public final 2V5 A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C53765Gtu(2V5 r2, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r2, 2);
        this.A04 = z;
        this.A01 = r2;
        this.A00 = i;
        this.A02 = z2;
        this.A03 = z3;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r21) {
        AnonymousClass9JR A0c;
        C251253mo r14;
        AnonymousClass3Y5 r6 = r21;
        0qQ.A0B(r6, 0);
        2V1 r0 = r6.A05;
        2V1 r19 = r0;
        Context context = r0.A0C;
        Drawable drawable = context.getDrawable(R.drawable.instagram_heart_pano_filled_24);
        if (drawable == null) {
            return null;
        }
        Drawable mutate = drawable.mutate();
        0qQ.A07(mutate);
        AnonymousClass7TE.A1R(mutate, r6.Bnf().A01(R.attr.feedLikeActiveColor));
        AnonymousClass3XV r02 = 2WX.A02;
        int A0A = C51972G9s.A0A(context, r6, R.attr.igds_color_transparent);
        Integer num = AnonymousClass05K.A00;
        2WX A10 = G9t.A10((2WX) null, num, C51965G9l.A0Y(A0A));
        C244413b9 r17 = C244413b9.ABSOLUTE;
        Integer num2 = AnonymousClass05K.A0Y;
        2WX A0Y = C51971G9r.A0Y(A10, num2, r17, 3);
        String A0E = C244013aV.A0E(r6, 2131964931);
        Integer num3 = AnonymousClass05K.A0N;
        2WX A0Y2 = C51971G9r.A0Y(A0Y, num3, A0E, 0);
        Integer num4 = AnonymousClass05K.A01;
        2WX A0U = C51972G9s.A0U(A0Y2, num4, 0);
        boolean z = this.A02;
        2WX r142 = null;
        if (z) {
            long doubleToRawLongBits = Double.doubleToRawLongBits(3.0d);
            r142 = AnonymousClass9JR.A00((2WX) null, num3, 1, Double.doubleToRawLongBits(-3.0d));
            A0c = C51965G9l.A0c(num2, 1, doubleToRawLongBits);
        } else {
            A0c = C51965G9l.A0c(num3, 1, Double.doubleToRawLongBits(-6.0d));
        }
        2WX A002 = A0U.A00(C51965G9l.A0X(r142, A0c));
        C243573Zh r13 = C243573Zh.CENTER;
        2Wb A0S = AnonymousClass7TG.A0S(r19);
        if (!this.A04) {
            2V1 r3 = A0S.A00;
            if (z) {
                Context A0B = C51965G9l.A0B(r3);
                C52786Gcd gcd = new C52786Gcd(A0B, this.A00, A0B.getColor(R.color.facepile_inner_stroke_color), this.A03);
                long A0K = C51970G9q.A0K();
                r14 = C51974G9v.A0P(gcd, r3, AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num, 0, A0K), num4, 0, A0K));
            } else {
                C53615GrU grU = new C53615GrU(new C53993Gxb(), r3);
                grU.A0A(20.0f);
                int i = this.A00;
                C53993Gxb gxb = grU.A00;
                gxb.A00 = i;
                BitSet bitSet = grU.A02;
                bitSet.set(0);
                C244113af.A00(bitSet, grU.A03, 2);
                grU.A02();
                0qQ.A0A(gxb);
                r14 = gxb;
            }
            A0S.A00(r14);
            2V5 r12 = this.A01;
            2WX A0A2 = C51974G9v.A0A(r12, (2WX) null, new AnonymousClass9JS(r12, AnonymousClass05K.A1F));
            long A0E2 = C51970G9q.A0E();
            C51974G9v.A0h(mutate, r3, A0S, C51973G9u.A0T(C51973G9u.A0T(AnonymousClass9JR.A00(A0A2, num, 0, A0E2), C51965G9l.A0c(num4, 0, A0E2), num, r13, 3), C51965G9l.A0c(num4, 1, Double.doubleToRawLongBits(3.0d)), num2, r17, 3));
        }
        return C243563Zg.A01(A0S, r6, A002);
    }
}
