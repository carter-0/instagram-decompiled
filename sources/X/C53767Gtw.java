package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.Gtw  reason: case insensitive filesystem */
public final class C53767Gtw extends C251343mx {
    public final C60314JjH A00;
    public final AnonymousClass7L2 A01;
    public final C334067ac A02;
    public final C70804OLz A03;
    public final AnonymousClass4DU A04;

    public final C251263mp A0X(AnonymousClass3Y5 r30) {
        2WX A0X;
        2Wb A0K;
        AnonymousClass3Y5 r28 = r30;
        0qQ.A0B(r28, 0);
        C334067ac r4 = this.A02;
        if (r4 instanceof C334057ab) {
            return null;
        }
        if (r4 instanceof C335407cu) {
            String str = this.A03.A05;
            if (str == null) {
                return null;
            }
            AnonymousClass3XV r0 = 2WX.A02;
            Integer num = AnonymousClass05K.A00;
            A0X = C51971G9r.A0X((2WX) null, num, 100.0f, 0);
            A0K = C51973G9u.A0K(r28);
            A0K.A00(C243563Zg.A0L(A0K, G9t.A10(C51973G9u.A0S((2WX) null, C51965G9l.A0c(AnonymousClass05K.A01, 0, 9221401712017801217L), num, 100.0f, 0), num, C51965G9l.A0Y(C244013aV.A01(A0K, R.attr.dividerColor)))));
            int A022 = A0K.Bnf().A02(R.color.igds_secondary_text);
            long A08 = C244013aV.A08(A0K);
            Typeface typeface = Typeface.SANS_SERIF;
            2WX A0S = C51973G9u.A0S((2WX) null, C51965G9l.A0d(AnonymousClass05K.A0N, str, 0), num, 100.0f, 0);
            long A032 = C244013aV.A03(A0K);
            2WX A0Q = C51973G9u.A0Q(A0S, C51967G9n.A0S(0, A032), 0, C244013aV.A06(A0K));
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(A0K.A00, (2V5) null, str, 0);
            C51973G9u.A17(A0K, A0b, A022, A08);
            A0b.A0R(0);
            G9w.A12(typeface, A0K, A0b, A0D);
            A0b.A0B();
            C51974G9v.A18(A0b, num, false);
            A0b.A0E();
            C51973G9u.A19(A0Q, A0b, false);
            C51967G9n.A1G(A0K, A0b);
        } else if (r4 instanceof C335417cv) {
            C335417cv r42 = (C335417cv) r4;
            C335377cr r12 = r42.A00;
            AnonymousClass3XV r02 = 2WX.A02;
            Integer num2 = AnonymousClass05K.A01;
            2WX A002 = AnonymousClass9JR.A00((2WX) null, num2, 0, 9221401712017801217L);
            Integer num3 = AnonymousClass05K.A00;
            2Tp A0L = C243563Zg.A0L(r28, C51971G9r.A0Y(C51971G9r.A0X(A002, num3, 100.0f, 0), num3, C51965G9l.A0Y(r28.Bnf().A01(R.attr.dividerColor)), 4));
            A0X = C51971G9r.A0X((2WX) null, num3, 100.0f, 0);
            A0K = C51973G9u.A0K(r28);
            C335397ct r03 = r42.A01;
            if (r03 != null) {
                A0K.A00(A0L);
                String A0E = C244013aV.A0E(A0K, r03.A00);
                2V1 r6 = A0K.A00;
                int A07 = C51968G9o.A07(r6.A0C, A0K);
                long A082 = C244013aV.A08(A0K);
                long A0I = C51970G9q.A0I();
                2WX A0Q2 = C51973G9u.A0Q((2WX) null, C51965G9l.A0c(AnonymousClass05K.A0E, 0, A0I), 0, A0I);
                Typeface typeface2 = Typeface.DEFAULT;
                long A0D2 = C51969G9p.A0D();
                C244103ae A0b2 = C51971G9r.A0b(r6, (2V5) null, A0E, 0);
                C51973G9u.A17(A0K, A0b2, A07, A082);
                A0b2.A0R(0);
                G9w.A12(typeface2, A0K, A0b2, A0D2);
                A0b2.A0B();
                C51974G9v.A18(A0b2, num3, false);
                A0b2.A0E();
                C51973G9u.A19(A0Q2, A0b2, false);
                C51967G9n.A1G(A0K, A0b2);
            }
            if (r12 != null) {
                A0K.A00(A0L);
                User user = r12.A00;
                String str2 = r12.A03;
                int i = this.A01.A04.A07;
                C73657PhW phW = new C73657PhW(this, 39);
                2WX A0Y = C51971G9r.A0Y(AnonymousClass9JR.A00(C51971G9r.A0X((2WX) null, num3, 100.0f, 0), AnonymousClass05K.A0Y, 0, C51970G9q.A0C()), num3, C51965G9l.A0Y(i), 4);
                2Wb A0L2 = C51973G9u.A0L(A0K);
                String A0F = C244013aV.A0F(A0L2, user.getUsername(), 2131972170);
                2WX A0X2 = C51971G9r.A0X((2WX) null, num3, 100.0f, 0);
                long A0F2 = C51969G9p.A0F();
                long A0F3 = C51970G9q.A0F();
                2WX A0R = C51972G9s.A0R(A0X2, 0, A0F2);
                Integer num4 = AnonymousClass05K.A1F;
                2WX A003 = AnonymousClass9JR.A00(A0R, num4, 0, A0F3);
                2Wb A0w = G9t.A0w(A0L2);
                2V1 r122 = A0w.A00;
                Context context = r122.A0C;
                int A072 = C51968G9o.A07(context, A0w);
                long A083 = C244013aV.A08(A0w);
                2WX A0X3 = C51971G9r.A0X((2WX) null, num2, 1.0f, 1);
                Typeface typeface3 = Typeface.DEFAULT;
                long A0D3 = C51969G9p.A0D();
                C244103ae A0b3 = C51971G9r.A0b(r122, (2V5) null, A0F, 0);
                C51973G9u.A17(A0w, A0b3, A072, A083);
                A0b3.A0R(0);
                G9w.A12(typeface3, A0w, A0b3, A0D3);
                A0b3.A0W(num3);
                C51973G9u.A1A(A0b3, num3, 1.0f, false);
                A0b3.A0M(1);
                C51974G9v.A0z(A0X3, A0b3, false);
                C51967G9n.A1G(A0w, A0b3);
                if (str2 != null) {
                    int A06 = C51968G9o.A06(context, A0w);
                    long A084 = C244013aV.A08(A0w);
                    2WX A0X4 = C51971G9r.A0X((2WX) null, num2, 1.0f, 1);
                    C244103ae A0b4 = C51971G9r.A0b(r122, (2V5) null, str2, 0);
                    C51973G9u.A17(A0w, A0b4, A06, A084);
                    A0b4.A0R(0);
                    G9w.A12(typeface3, A0w, A0b4, A0D3);
                    A0b4.A0W(num3);
                    C51974G9v.A13(A0b4, num3, 1.0f);
                    A0b4.A0D();
                    G9t.A1M(A0w, A0X4, A0b4);
                }
                C51967G9n.A1F(A0w, A0L2, A003);
                long doubleToRawLongBits = Double.doubleToRawLongBits(40.0d);
                2WX A004 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, doubleToRawLongBits), num3, 0, doubleToRawLongBits);
                long A0B = C51969G9p.A0B();
                2WX A0Y2 = C51971G9r.A0Y(C51973G9u.A0R(C51972G9s.A0S(A004, 0, A0B), C51966G9m.A0k(0, A0B), 0, A0B), num4, new C74193PqZ(phW, 20), 4);
                2Wb A0L3 = C51973G9u.A0L(A0L2);
                Drawable A0D4 = C244013aV.A0D(A0L3, R.drawable.instagram_x_pano_outline_16);
                2V1 r3 = A0L3.A00;
                A0D4.setTint(A0L3.Bnf().A02(2Yu.A09(r3.A0C)));
                C51974G9v.A0h(A0D4, r3, A0L3, C51974G9v.A0C((2WX) null, C51972G9s.A0W(A0L3, 2131972168, 0), 0.0f));
                A0K.A00(C51967G9n.A0P(C243563Zg.A0G(A0L3, A0L2, A0Y2), A0L2, A0K, A0Y));
            }
        } else if ((r4 instanceof C53497GpT) || (r4 instanceof C381889ck)) {
            return null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return C243563Zg.A03(A0K, r28, A0X);
    }

    public C53767Gtw(C334067ac r1, C70804OLz oLz, C60314JjH jjH, AnonymousClass7L2 r4, AnonymousClass4DU r5) {
        AnonymousClass7TG.A1P(r1, r4);
        this.A02 = r1;
        this.A03 = oLz;
        this.A01 = r4;
        this.A00 = jjH;
        this.A04 = r5;
    }
}
