package X;

import androidx.compose.foundation.IndicationModifierElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.5ZU  reason: invalid class name */
public abstract class AnonymousClass5ZU {
    public static final C267314bM A00 = new C267304bL(AnonymousClass5ZV.A00);

    public static final Modifier A00(C287095Yz r3, C287615aU r4, Modifier modifier) {
        if (r3 == null) {
            return modifier;
        }
        if (r3 instanceof C287085Yy) {
            return modifier.Ezh(new IndicationModifierElement((C287085Yy) r3, r4));
        }
        return C287435a8.A02(modifier, C287655aY.A00, new JJU(1, r3, r4));
    }
}
