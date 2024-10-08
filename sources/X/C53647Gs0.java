package X;

import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;

/* renamed from: X.Gs0  reason: case insensitive filesystem */
public final class C53647Gs0 extends C251343mx {
    public final C55886Hp7 A00;
    public final C55844HoR A01;

    public C53647Gs0(C55886Hp7 hp7, C55844HoR hoR) {
        0qQ.A0B(hoR, 2);
        this.A00 = hp7;
        this.A01 = hoR;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r30) {
        AnonymousClass3Y5 r28 = r30;
        char A1Z = C51966G9m.A1Z(r28);
        C55886Hp7 hp7 = this.A00;
        long A07 = C51965G9l.A07(hp7.A08);
        long A072 = C51965G9l.A07(hp7.A04);
        int i = hp7.A06;
        long A073 = C51965G9l.A07(i);
        2WX A0F = C51974G9v.A0F(C51974G9v.A0H((2WX) null, C51965G9l.A0c(AnonymousClass05K.A07, A1Z, A07), A1Z, A073), C51967G9n.A0T(A1Z, A072), A1Z, C51965G9l.A07(hp7.A05));
        int i2 = this.A01.A05;
        int i3 = i2;
        2Wb A0Q = C51972G9s.A0Q(r28);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        if (i > 0) {
            float A06 = (float) C51973G9u.A06(A0Q);
            float[] fArr = new float[8];
            fArr[A1Z] = A06;
            fArr[1] = A06;
            fArr[2] = A06;
            fArr[3] = A06;
            fArr[4] = 0.0f;
            C51975G9x.A1L(fArr, 0.0f);
            gradientDrawable.setCornerRadii(fArr);
        }
        long A0J = C51970G9q.A0J();
        Integer num = AnonymousClass05K.A00;
        2WX A10 = G9t.A10(AnonymousClass9JR.A00((2WX) null, num, A1Z, A0J), num, gradientDrawable);
        Integer num2 = AnonymousClass05K.A01;
        2WX A0C = C51974G9v.A0C(A10, C51965G9l.A0b(num2, 1.0f, 1), 1.0f);
        float f = hp7.A00;
        A0Q.A00(C243563Zg.A0L(A0Q, C52112GFg.A01(A0C, f)));
        if (hp7.A09) {
            long A074 = C51965G9l.A07(hp7.A01 + 12);
            long A0F2 = C51969G9p.A0F();
            float A09 = (float) C51968G9o.A09(A0Q, A0J);
            float A0C2 = (float) C51972G9s.A0C(A0Q, (double) hp7.A03);
            float A0C3 = (float) C51972G9s.A0C(A0Q, (double) hp7.A07);
            float A0C4 = (float) C51972G9s.A0C(A0Q, (double) hp7.A02);
            float A0C5 = (float) C51972G9s.A0C(A0Q, 10.0d);
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (hp7.A0B) {
                A1C.add(new C53409Go1(C56192HuL.A00(A0C2, 0.0f), 1));
                A1C.add(new C53409Go1(C56192HuL.A00(A0C2, (float) C51969G9p.A09(A0Q, A074)), A1Z));
            }
            A1C.add(new C53409Go1(C56192HuL.A00(A0C2, 0.0f), 1));
            A1C.add(new C53412Go4(C56192HuL.A00(A0C2, A0C5), C56192HuL.A00(A0C3, A0C5), 1));
            A1C.add(new C53409Go1(C56192HuL.A00(A0C4, A0C5), A1Z));
            C53418GoA goA = new C53418GoA(A1Z, A1C);
            2WX A012 = C52112GFg.A01(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num, A1Z, A0F2), num2, A1Z, A074), f);
            C51971G9r.A1C(new C53945Gwp((2WX) null, new C52405GRf(goA, A09, i3, 1)), C51973G9u.A0L(A0Q), A0Q, A012);
        }
        return C243563Zg.A03(A0Q, r28, A0F);
    }
}
