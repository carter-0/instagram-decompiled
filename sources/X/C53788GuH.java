package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;

/* renamed from: X.GuH  reason: case insensitive filesystem */
public final class C53788GuH extends C251343mx {
    public final String A00;
    public final C62320sa A01;
    public final 0sP A02;
    public final 0sP A03;
    public final int A04 = R.drawable.quick_replies_base_component;
    public final int A05;

    public final C251263mp A0X(AnonymousClass3Y5 r14) {
        0qQ.A0B(r14, 0);
        long A042 = C244013aV.A04(r14);
        2V1 r4 = r14.A05;
        Context context = r4.A0C;
        Integer num = AnonymousClass05K.A00;
        Typeface A032 = 0oh.A03(context, Typeface.DEFAULT, num);
        int i = this.A05;
        String str = this.A00;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r4, (2V5) null, str, 0);
        C51973G9u.A16(r14, A0b, i, A042);
        A0b.A0R(0);
        G9w.A11(A032, r14, A0b, A0D);
        C51974G9v.A19(A0b, num, false);
        A0b.A0M(1);
        A0b.A0b(false);
        G9t.A1N(A0b, false);
        2WW A0A = A0b.A0A();
        AnonymousClass3XV r0 = 2WX.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(36.0d);
        Integer num2 = AnonymousClass05K.A01;
        return C243563Zg.A0E(G9t.A0v(A0A, r4), r14, C51971G9r.A0Z(C51973G9u.A0Y(C51972G9s.A0V(C51971G9r.A0Y(C51974G9v.A0J(C51972G9s.A0U(C51973G9u.A0Q(AnonymousClass9JR.A00((2WX) null, num2, 0, doubleToRawLongBits), C51967G9n.A0S(0, C51970G9q.A0D()), 0, C51970G9q.A0J()), num2, 0), C51965G9l.A0b(AnonymousClass05K.A0C, 0.0f, 1), num), num, C244013aV.A0D(r14, this.A04), 4), new J6I(this, 9)), num2, true), AnonymousClass05K.A0Y, new C59101J6j(39, (Object) this, (Object) r14), (String) null));
    }

    public C53788GuH(String str, C62320sa r4, 0sP r5, 0sP r6, int i) {
        0qQ.A0B(r6, 7);
        this.A00 = str;
        this.A05 = i;
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = r6;
    }
}
