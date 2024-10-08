package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.Gvv  reason: case insensitive filesystem */
public final class C53890Gvv extends C251343mx {
    public final C62320sa A00;
    public final C62320sa A01;
    public final boolean A02;

    public final C251263mp A0X(AnonymousClass3Y5 r26) {
        String str;
        AnonymousClass3Y5 r9 = r26;
        0qQ.A0B(r9, 0);
        int A002 = I61.A00(r9, HNO.A0A);
        Object A003 = AnonymousClass3Zw.A00(r9, C58677Ivm.A00(r9, 45), new Object[0]);
        AnonymousClass3XV r0 = 2WX.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(250.0d);
        Integer num = AnonymousClass05K.A0N;
        2WX A004 = AnonymousClass9JR.A00((2WX) null, num, 0, doubleToRawLongBits);
        long A0F = C51969G9p.A0F();
        long A0K = C51970G9q.A0K();
        Integer num2 = AnonymousClass05K.A04;
        2WX A005 = AnonymousClass9JR.A00(A004, num2, 0, A0K);
        Integer num3 = AnonymousClass05K.A05;
        2WX A0X = C51971G9r.A0X(AnonymousClass9JR.A00(A005, num3, 0, A0F), AnonymousClass05K.A0C, 0.0f, 1);
        2WX A0Y = C51973G9u.A0Y(C51971G9r.A0Y((2WX) null, num3, A003, 4), num, true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(12.0f);
        gradientDrawable.setColor(A002);
        gradientDrawable.setStroke(C51972G9s.A0B(r9, 1.0d), 0);
        Integer num4 = AnonymousClass05K.A00;
        2WX A0z = G9t.A0z(AnonymousClass9JR.A00(C51971G9r.A0Y(A0Y, num4, gradientDrawable, 4), AnonymousClass05K.A0G, 0, C51970G9q.A0D()), num4, C243573Zh.FLEX_START);
        2Wb A0Q = C51972G9s.A0Q(r9);
        boolean z = this.A02;
        if (!z) {
            str = C244013aV.A0E(A0Q, 2131966386);
        } else {
            str = null;
            A0Q.A00(new C53907GwD(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, A0K), num3, 0, A0F), (AnonymousClass90N) null, HNO.A0h, C244013aV.A0E(A0Q, 2131966386), AnonymousClass05K.A15, 0, 120));
        }
        A0Q.A00(new C53800GuT(A00(A0Q, HNN.A0M, C244013aV.A0E(A0Q, 2131966389)), (C251263mp) null, A0X, C244013aV.A0E(A0Q, 2131966387), str, C58677Ivm.A00(this, 43)));
        if (z) {
            A0Q.A00(new C53800GuT(A00(A0Q, HNN.A0e, C244013aV.A0E(A0Q, 2131966285)), (C251263mp) null, A0X, C244013aV.A0E(A0Q, 2131966388), (String) null, C58677Ivm.A00(this, 44)));
        }
        return C243563Zg.A03(A0Q, r9, A0z);
    }

    public static final C53854GvL A00(C70832Wc r11, HNN hnn, String str) {
        int A002 = I61.A00(r11, HNO.A0W);
        AnonymousClass3XV r0 = 2WX.A02;
        return new C53854GvL(C51974G9v.A0M((2WX) null, AnonymousClass05K.A00, 0, C51970G9q.A0G()), hnn, (HNN) null, (Integer) null, Integer.valueOf(A002), str, (C62320sa) null, 12, true);
    }

    public C53890Gvv(C62320sa r1, C62320sa r2, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = r2;
    }
}
