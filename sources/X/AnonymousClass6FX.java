package X;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.6FX  reason: invalid class name */
public final class AnonymousClass6FX implements AnonymousClass6FY {
    public static final AnonymousClass6FX A00 = new Object();

    public final Modifier FNR(Modifier modifier, float f, boolean z) {
        if (((double) f) > 0.0d) {
            if (f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            return modifier.Ezh(new LayoutWeightElement(z, f));
        }
        throw new IllegalArgumentException(002.A0Z("invalid weight ", "; must be greater than zero", f));
    }

    public final Modifier A00(Modifier modifier) {
        return FNR(modifier, 1.0f, true);
    }

    public final Modifier AB1(C287245Zp r2, Modifier modifier) {
        return modifier.Ezh(new VerticalAlignElement(r2));
    }
}
