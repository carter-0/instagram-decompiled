package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;

/* renamed from: X.Grk  reason: case insensitive filesystem */
public final class C53631Grk extends C251343mx {
    public final C336627ev A00;

    public C53631Grk(C336627ev r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r19) {
        AnonymousClass3Y5 r17 = r19;
        boolean A1Z = C51966G9m.A1Z(r17);
        long A0F = C51969G9p.A0F();
        long A0I = C51970G9q.A0I();
        2WX A002 = AnonymousClass9JR.A00(C51972G9s.A0R(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A05, A1Z ? 1 : 0, A0I), A1Z, A0F), AnonymousClass05K.A1F, A1Z, A0I);
        2Wb A0Q = C51972G9s.A0Q(r17);
        Integer num = AnonymousClass05K.A00;
        2WX A0y = G9t.A0y((2WX) null, num, A1Z);
        2Wb A0L = C51973G9u.A0L(A0Q);
        int i = 2131956367;
        if (this.A00.A00.ordinal() != A1Z) {
            i = 2131956368;
        }
        String A0E = C244013aV.A0E(A0L, i);
        long A08 = C244013aV.A08(A0L);
        2V1 r8 = A0L.A00;
        Context context = r8.A0C;
        int A07 = C51968G9o.A07(context, A0L);
        Typeface A0N = AnonymousClass7TG.A0N(C243803a8.A00(A0L));
        Integer num2 = AnonymousClass05K.A0N;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r8, (2V5) null, A0E, A1Z);
        C51973G9u.A17(A0L, A0b, A07, A08);
        A0b.A0R(A1Z);
        G9w.A12(A0N, A0L, A0b, A0D);
        A0b.A0W(num2);
        C51974G9v.A18(A0b, num, A1Z);
        A0b.A0E();
        C51974G9v.A0y(A0L, A0b, A1Z);
        long doubleToRawLongBits = Double.doubleToRawLongBits(1.0d);
        Integer num3 = AnonymousClass05K.A01;
        2WX A0J = C51974G9v.A0J(C51971G9r.A0X(AnonymousClass9JR.A00((2WX) null, num3, A1Z, doubleToRawLongBits), num3, 1.0f, 1), C51967G9n.A0U(A1Z, C51970G9q.A0D()), num);
        int A082 = C51968G9o.A08(context, A0L, R.attr.igds_color_separator);
        C53616GrV A003 = C54000Gxi.A00(r8);
        A003.A0B(A082);
        C244123ag.A00(A003, A0J);
        C51971G9r.A1C(A003.A0A(), A0L, A0Q, A0y);
        return C243563Zg.A03(A0Q, r17, A002);
    }
}
