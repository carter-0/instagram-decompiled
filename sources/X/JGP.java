package X;

import androidx.compose.foundation.ScrollSemanticsElement;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.ui.Modifier;

public final class JGP extends 0Yg implements 0sK {
    public final /* synthetic */ C56838IEj A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGP(C56838IEj iEj, boolean z) {
        super(3);
        this.A00 = iEj;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass6Gj r5;
        C286575Wy A0R = C51966G9m.A0R(obj2, obj3);
        if (C51967G9n.A1U(A0R, 1478351300)) {
            0fL.A01(1094602294, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
        }
        C56838IEj iEj = this.A00;
        boolean z = this.A01;
        ScrollSemanticsElement scrollSemanticsElement = new ScrollSemanticsElement(iEj, z);
        if (z) {
            r5 = AnonymousClass6Gj.Vertical;
        } else {
            r5 = AnonymousClass6Gj.Horizontal;
        }
        Modifier Ezh = C305346Hn.A00((JS2) null, (AnonymousClass6HS) null, r5, iEj, iEj.A02, A0R, scrollSemanticsElement, 64, true, false).Ezh(new ScrollingLayoutElement(iEj, z));
        if (0fL.A02()) {
            0fL.A00(-2072512475);
        }
        C51965G9l.A1V(A0R);
        return Ezh;
    }
}
