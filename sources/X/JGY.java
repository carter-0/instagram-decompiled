package X;

import androidx.compose.ui.Modifier;

public final class JGY extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass5Z4 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGY(AnonymousClass5Z4 r2, int i, int i2) {
        super(3);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Integer valueOf;
        float f;
        float f2;
        Object A0F;
        int i;
        int i2;
        int i3;
        C286575Wy A0R = C51966G9m.A0R(obj2, obj3);
        if (C51967G9n.A1U(A0R, 408240218)) {
            0fL.A01(1506546821, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
        }
        int i4 = this.A01;
        int i5 = this.A00;
        C291535hT.A00(i4, i5);
        if (i4 == 1 && i5 == Integer.MAX_VALUE) {
            A0F = Modifier.A00;
            if (0fL.A02()) {
                i = 1951954748;
            }
            C51965G9l.A1V(A0R);
            return A0F;
        }
        C268024cd A0Y = C51968G9o.A0Y(A0R);
        C286305Uu r9 = (C286305Uu) A0R.AJO(AnonymousClass5YA.A03);
        AnonymousClass5Q8 r12 = (AnonymousClass5Q8) C51966G9m.A15(A0R);
        AnonymousClass5Z4 r1 = this.A02;
        boolean A1U = C51971G9r.A1U(A0R, r1, r12);
        Object ECw = A0R.ECw();
        if (A1U || ECw == AnonymousClass5XT.A00) {
            ECw = C291695hj.A00(r1, r12);
            A0R.FLL(ECw);
        }
        AnonymousClass5Z4 r3 = (AnonymousClass5Z4) ECw;
        boolean A1U2 = C51971G9r.A1U(A0R, r9, r3);
        Object ECw2 = A0R.ECw();
        if (A1U2 || ECw2 == AnonymousClass5XT.A00) {
            AnonymousClass5ZB r14 = r3.A02;
            C268454dQ r13 = r14.A05;
            AnonymousClass5ZD r11 = r14.A08;
            if (r11 == null) {
                r11 = AnonymousClass5ZD.A04;
            }
            C291715hl r0 = r14.A06;
            if (r0 != null) {
                i2 = r0.A00;
            } else {
                i2 = 0;
            }
            C291725hm r02 = r14.A07;
            if (r02 != null) {
                i3 = r02.A00;
            } else {
                i3 = 1;
            }
            ECw2 = r9.EIX(r13, r11, i2, i3);
            A0R.FLL(ECw2);
        }
        C270284gU r132 = (C270284gU) ECw2;
        boolean AGu = A0R.AGu(r132.getValue()) | C51965G9l.A1Z(A0R, r12, C51972G9s.A1X(A0R, r9, r1, A0R.AGu(A0Y)));
        Object ECw3 = A0R.ECw();
        if (AGu || ECw3 == AnonymousClass5XT.A00) {
            ECw3 = Integer.valueOf(C289005cr.A00(C56386Hxf.A00(r3, r9, A0Y, C56386Hxf.A00, 1)));
            A0R.FLL(ECw3);
        }
        int A0M = AnonymousClass7TE.A0M(ECw3);
        boolean A1U3 = C51968G9o.A1U(A0R, r132.getValue(), A0R.AGu(r12), C51972G9s.A1X(A0R, r9, r1, A0R.AGu(A0Y)));
        Object ECw4 = A0R.ECw();
        if (A1U3 || ECw4 == AnonymousClass5XT.A00) {
            String str = C56386Hxf.A00;
            ECw4 = Integer.valueOf(C289005cr.A00(C56386Hxf.A00(r3, r9, A0Y, 002.A0T(str, str, 10), 2)));
            A0R.FLL(ECw4);
        }
        int A0M2 = AnonymousClass7TE.A0M(ECw4) - A0M;
        Integer num = null;
        if (i4 == 1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((i4 - 1) * A0M2) + A0M);
        }
        if (i5 != Integer.MAX_VALUE) {
            num = Integer.valueOf(A0M + (A0M2 * (i5 - 1)));
        }
        C285245Qk r2 = Modifier.A00;
        if (valueOf != null) {
            f = A0Y.Ezw(valueOf.intValue());
        } else {
            f = Float.NaN;
        }
        if (num != null) {
            f2 = A0Y.Ezw(num.intValue());
        } else {
            f2 = Float.NaN;
        }
        A0F = C287205Zk.A0F(r2, f, f2);
        if (0fL.A02()) {
            i = 1944257450;
        }
        C51965G9l.A1V(A0R);
        return A0F;
        0fL.A00(i);
        C51965G9l.A1V(A0R);
        return A0F;
    }
}
