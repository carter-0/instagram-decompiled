package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.5Zk  reason: invalid class name and case insensitive filesystem */
public abstract class C287205Zk {
    public static final FillElement A00;
    public static final FillElement A01;
    public static final FillElement A02;
    public static final WrapContentElement A03;
    public static final WrapContentElement A04;
    public static final WrapContentElement A05;
    public static final WrapContentElement A06;
    public static final WrapContentElement A07;
    public static final WrapContentElement A08;

    static {
        Integer num = AnonymousClass05K.A01;
        A02 = new FillElement(num, 1.0f);
        Integer num2 = AnonymousClass05K.A00;
        A00 = new FillElement(num2, 1.0f);
        Integer num3 = AnonymousClass05K.A0C;
        A01 = new FillElement(num3, 1.0f);
        C287265Zr r2 = C287215Zl.A00;
        A07 = new WrapContentElement(num, r2, new C59344JFw(r2, 6));
        C287265Zr r22 = C287215Zl.A02;
        A08 = new WrapContentElement(num, r22, new C59344JFw(r22, 6));
        C287245Zp r23 = C287215Zl.A04;
        A03 = new WrapContentElement(num2, r23, new C59344JFw(r23, 4));
        C287245Zp r24 = C287215Zl.A05;
        A04 = new WrapContentElement(num2, r24, new C59344JFw(r24, 4));
        Alignment alignment = C287215Zl.A09;
        A05 = new WrapContentElement(num3, alignment, new C59344JFw(alignment, 5));
        Alignment alignment2 = C287215Zl.A0E;
        A06 = new WrapContentElement(num3, alignment2, new C59344JFw(alignment2, 5));
    }

    public static final Modifier A00(C287265Zr r3, Modifier modifier) {
        WrapContentElement wrapContentElement;
        if (0qQ.A0K(r3, C287215Zl.A00)) {
            wrapContentElement = A07;
        } else if (0qQ.A0K(r3, C287215Zl.A02)) {
            wrapContentElement = A08;
        } else {
            wrapContentElement = new WrapContentElement(AnonymousClass05K.A01, r3, new C59344JFw(r3, 6));
        }
        return modifier.Ezh(wrapContentElement);
    }

    public static final Modifier A01(C287245Zp r3, Modifier modifier) {
        WrapContentElement wrapContentElement;
        if (0qQ.A0K(r3, C287215Zl.A04)) {
            wrapContentElement = A03;
        } else if (0qQ.A0K(r3, C287215Zl.A05)) {
            wrapContentElement = A04;
        } else {
            wrapContentElement = new WrapContentElement(AnonymousClass05K.A00, r3, new C59344JFw(r3, 4));
        }
        return modifier.Ezh(wrapContentElement);
    }

    public static final Modifier A02(Alignment alignment, Modifier modifier) {
        WrapContentElement wrapContentElement;
        if (0qQ.A0K(alignment, C287215Zl.A09)) {
            wrapContentElement = A05;
        } else if (0qQ.A0K(alignment, C287215Zl.A0E)) {
            wrapContentElement = A06;
        } else {
            wrapContentElement = new WrapContentElement(AnonymousClass05K.A0C, alignment, new C59344JFw(alignment, 5));
        }
        return modifier.Ezh(wrapContentElement);
    }

    public static final Modifier A03(Modifier modifier) {
        return A0C(modifier, 16.0f);
    }

    public static final Modifier A04(Modifier modifier) {
        return A0C(modifier, 24.0f);
    }

    public static final Modifier A05(Modifier modifier, float f) {
        return A0E(modifier, Float.NaN, f);
    }

    public static final Modifier A06(Modifier modifier, float f) {
        FillElement fillElement;
        if (f == 1.0f) {
            fillElement = A00;
        } else {
            fillElement = new FillElement(AnonymousClass05K.A00, f);
        }
        return modifier.Ezh(fillElement);
    }

    public static final Modifier A07(Modifier modifier, float f) {
        FillElement fillElement;
        if (f == 1.0f) {
            fillElement = A02;
        } else {
            fillElement = new FillElement(AnonymousClass05K.A01, f);
        }
        return modifier.Ezh(fillElement);
    }

    public static final Modifier A08(Modifier modifier, float f) {
        return modifier.Ezh(new SizeElement(C287655aY.A00, Float.NaN, f, Float.NaN, f, true));
    }

    public static final Modifier A09(Modifier modifier, float f) {
        return A0F(modifier, f, Float.NaN);
    }

    public static final Modifier A0A(Modifier modifier, float f) {
        return modifier.Ezh(new SizeElement(C287655aY.A00, Float.NaN, f, Float.NaN, f, false));
    }

    public static final Modifier A0B(Modifier modifier, float f) {
        return modifier.Ezh(new SizeElement(C287655aY.A00, f, f, f, f, false));
    }

    public static final Modifier A0C(Modifier modifier, float f) {
        return modifier.Ezh(new SizeElement(C287655aY.A00, f, f, f, f, true));
    }

    public static final Modifier A0D(Modifier modifier, float f) {
        return modifier.Ezh(new SizeElement(C287655aY.A00, f, Float.NaN, f, Float.NaN, true));
    }

    public static final Modifier A0E(Modifier modifier, float f, float f2) {
        return modifier.Ezh(new UnspecifiedConstraintsElement(f, f2));
    }

    public static final Modifier A0F(Modifier modifier, float f, float f2) {
        return modifier.Ezh(new SizeElement(C287655aY.A00, Float.NaN, f, Float.NaN, f2, true));
    }

    public static final Modifier A0G(Modifier modifier, float f, float f2) {
        return modifier.Ezh(new SizeElement(C287655aY.A00, f, f2, f, f2, true));
    }

    public static final Modifier A0H(Modifier modifier, float f, float f2) {
        return modifier.Ezh(new SizeElement(C287655aY.A00, f, Float.NaN, f2, Float.NaN, true));
    }

    public static final Modifier A0I(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.Ezh(new SizeElement(C287655aY.A00, f, f2, f3, f4, true));
    }
}
