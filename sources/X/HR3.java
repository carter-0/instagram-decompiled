package X;

import androidx.compose.foundation.selection.SelectableElement;
import androidx.compose.ui.Modifier;

public abstract class HR3 {
    public static final Modifier A00(C287095Yz r13, C287605aT r14, Modifier modifier, C287625aV r16, C62320sa r17, boolean z, boolean z2) {
        Modifier A02;
        C287085Yy r2;
        C287095Yz r22 = r13;
        C287605aT r3 = r14;
        C287625aV r4 = r16;
        C62320sa r5 = r17;
        boolean z3 = z;
        boolean z4 = z2;
        if (r13 instanceof C287085Yy) {
            r2 = (C287085Yy) r22;
        } else if (r13 == null) {
            r2 = null;
        } else {
            if (r14 != null) {
                A02 = AnonymousClass5ZU.A00(r13, r14, Modifier.A00).Ezh(new SelectableElement((C287085Yy) null, r3, r4, r5, z3, z4));
            } else {
                A02 = C287435a8.A02(Modifier.A00, C287655aY.A00, new JH5(0, r13, r4, r5, z3, z4));
            }
            return modifier.Ezh(A02);
        }
        A02 = new SelectableElement(r2, r3, r4, r5, z3, z4);
        return modifier.Ezh(A02);
    }
}
