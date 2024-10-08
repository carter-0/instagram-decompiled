package X;

import androidx.compose.ui.Modifier;

public final class GQZ extends 0Yg implements 0sK {
    public final /* synthetic */ C287625aV A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ C62320sa A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GQZ(C287625aV r2, C62320sa r3, C62320sa r4) {
        super(3);
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C287605aT r4;
        C286565Wx r13;
        boolean z;
        C286575Wy r132 = (C286575Wy) obj2;
        ((Number) obj3).intValue();
        r132.ExS(1969174843);
        if (0fL.A02()) {
            0fL.A01(-235592561, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
        }
        C287095Yz r3 = (C287095Yz) r132.AJO(AnonymousClass5ZU.A00);
        if (r3 instanceof C287085Yy) {
            r132.ExS(-1726989699);
            r13 = (C286565Wx) r132;
            z = false;
            C286565Wx.A0L(r13, false);
            r4 = null;
        } else {
            r132.ExS(-1726881726);
            Object ECw = r132.ECw();
            if (ECw == AnonymousClass5XT.A00) {
                ECw = new AnonymousClass5aS();
                r132.FLL(ECw);
            }
            r4 = (C287605aT) ECw;
            r13 = (C286565Wx) r132;
            z = false;
            C286565Wx.A0I(r13);
        }
        Modifier A012 = C287635aW.A01(r3, r4, Modifier.A00, this.A00, this.A02, (C62320sa) null, this.A01, true);
        if (0fL.A02()) {
            0fL.A00(-111290593);
        }
        C286565Wx.A0L(r13, z);
        return A012;
    }
}
