package X;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.6Fi  reason: invalid class name and case insensitive filesystem */
public abstract class C304816Fi {
    public static final long A00(float f, long j) {
        long j2 = AnonymousClass6GS.A00;
        return AnonymousClass6GR.A00(Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f), Math.max(0.0f, AnonymousClass6GS.A00(j) - f));
    }

    public static final Modifier A01(C304806Fh r2, Modifier modifier, AnonymousClass5S2 r4) {
        return A02(modifier, r2.A01, r4, r2.A00);
    }

    public static final Modifier A02(Modifier modifier, C304786Ff r2, AnonymousClass5S2 r3, float f) {
        return modifier.Ezh(new BorderModifierNodeElement(r2, r3, f));
    }

    public static final Modifier A03(Modifier modifier, AnonymousClass5S2 r2, float f, long j) {
        return A02(modifier, new C304776Fe(j), r2, f);
    }
}
