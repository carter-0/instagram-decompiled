package X;

import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.5Zj  reason: invalid class name and case insensitive filesystem */
public abstract class C287195Zj {
    public static final Modifier A06(Modifier modifier) {
        return A0B(modifier, 0.0f, 8.0f, 0.0f, 0.0f);
    }

    public static final Modifier A07(Modifier modifier, float f) {
        return modifier.Ezh(new PaddingElement(new C377019Kf(f, 0), f, f, f, f));
    }

    public static final Modifier A09(Modifier modifier, float f, float f2) {
        return modifier.Ezh(new PaddingElement(new C377029Kg(0, f, f2), f, f2, f, f2));
    }

    public static final Modifier A00(C304836Fk r2, Modifier modifier) {
        return modifier.Ezh(new PaddingValuesElement(r2, new AnonymousClass9L6(r2, 13)));
    }

    public static final Modifier A01(Modifier modifier) {
        return A07(modifier, 16.0f);
    }

    public static final Modifier A02(Modifier modifier) {
        return A07(modifier, 8.0f);
    }

    public static final Modifier A03(Modifier modifier) {
        return A09(modifier, 16.0f, 12.0f);
    }

    public static final Modifier A04(Modifier modifier) {
        return A09(modifier, 16.0f, 0.0f);
    }

    public static final Modifier A05(Modifier modifier) {
        return A09(modifier, 12.0f, 0.0f);
    }

    public static final Modifier A08(Modifier modifier, float f) {
        return A09(modifier, 16.0f, f);
    }

    public static final Modifier A0A(Modifier modifier, float f, float f2, float f3) {
        return A0B(modifier, f, f2, f3, 8.0f);
    }

    public static final Modifier A0B(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.Ezh(new PaddingElement(new C288065bJ(), f, f2, f3, f4));
    }
}
