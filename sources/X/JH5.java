package X;

import androidx.compose.foundation.selection.SelectableElement;
import androidx.compose.foundation.selection.ToggleableElement;
import androidx.compose.ui.Modifier;

public final class JH5 extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JH5(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj2, obj3);
        boolean A1U = C51967G9n.A1U(A0R, -1525724089);
        if (i != 0) {
            if (A1U) {
                0fL.A01(-1466288466, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            C287605aT r4 = (C287605aT) C51972G9s.A0l(A0R, A0R.ECw(), AnonymousClass5XT.A00);
            Modifier Ezh = AnonymousClass5ZU.A00((C287095Yz) this.A01, r4, Modifier.A00).Ezh(new ToggleableElement((C287085Yy) null, r4, (C287625aV) this.A03, (0sP) this.A02, this.A05, this.A04));
            if (0fL.A02()) {
                0fL.A00(-1765575152);
            }
            C51965G9l.A1V(A0R);
            return Ezh;
        }
        if (A1U) {
            0fL.A01(-1123764373, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
        }
        C287605aT r42 = (C287605aT) C51972G9s.A0l(A0R, A0R.ECw(), AnonymousClass5XT.A00);
        Modifier Ezh2 = AnonymousClass5ZU.A00((C287095Yz) this.A01, r42, Modifier.A00).Ezh(new SelectableElement((C287085Yy) null, r42, (C287625aV) this.A03, (C62320sa) this.A02, this.A05, this.A04));
        if (0fL.A02()) {
            0fL.A00(-1412070675);
        }
        C51965G9l.A1V(A0R);
        return Ezh2;
    }
}
