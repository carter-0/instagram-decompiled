package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Htx  reason: case insensitive filesystem */
public abstract class C56168Htx {
    public static final boolean A01(C52693Gb5 gb5, boolean z) {
        C268064ch A02;
        C52754Gc7 gc7 = gb5.A03;
        if (gc7 == null || (A02 = gc7.A02()) == null) {
            return false;
        }
        AnonymousClass5VN A00 = HRC.A00(A02);
        long A06 = gb5.A06(z);
        float f = A00.A01;
        float f2 = A00.A02;
        float A01 = C289295dM.A01(A06);
        if (f > A01 || A01 > f2) {
            return false;
        }
        float f3 = A00.A03;
        float f4 = A00.A00;
        float A022 = C289295dM.A02(A06);
        if (f3 > A022 || A022 > f4) {
            return false;
        }
        return true;
    }

    public static final void A00(C52693Gb5 gb5, C286575Wy r16, C52430GSi gSi, int i, boolean z) {
        int i2;
        C286575Wy r11 = r16;
        r11.ExV(-1344558920);
        int i3 = i;
        boolean z2 = z;
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r11, z2) | i;
        } else {
            i2 = i3;
        }
        C52430GSi gSi2 = gSi;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r11, gSi2);
        }
        C52693Gb5 gb52 = gb5;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r11, gb5);
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(104851275, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)");
            }
            int i4 = i2 & 14;
            boolean z3 = true;
            boolean A1Z = C51965G9l.A1Z(r11, gb5, AnonymousClass7TF.A1S(i4, 4));
            Object ECw = r11.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new IFW(gb5, z2);
                r11.FLL(ECw);
            }
            boolean AGw = r11.AGw(gb5);
            if (i4 != 4) {
                z3 = false;
            }
            boolean z4 = AGw | z3;
            Object ECw2 = r11.ECw();
            if (z4 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C56859IFg(gb5, z2);
                r11.FLL(ECw2);
            }
            JNV jnv = (JNV) ECw2;
            boolean A04 = C285965Tk.A04(C51968G9o.A0G(gb5.A0K));
            C285245Qk r7 = Modifier.A00;
            boolean AGw2 = r11.AGw(ECw);
            Object ECw3 = r11.ECw();
            if (AGw2 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new MH2(ECw, (AnonymousClass4D7) null, 18, 42);
                r11.FLL(ECw3);
            }
            Modifier A00 = C304916Fs.A00(r7, ECw, (0sL) ECw3);
            int i5 = i2 << 3;
            C56607I4g.A02(jnv, r11, A00, gSi2, (i5 & 112) | (i5 & 896), 16, 0, z2, A04);
            if (0fL.A02()) {
                0fL.A00(1931350457);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i3, 1, gb52, gSi2, z2);
        }
    }
}
