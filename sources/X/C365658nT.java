package X;

import java.util.List;

/* renamed from: X.8nT  reason: invalid class name and case insensitive filesystem */
public final class C365658nT implements C365558nJ {
    public final /* synthetic */ 2JH A00;

    public C365658nT(2JH r1) {
        this.A00 = r1;
    }

    public final void D59(AnonymousClass9GD r4) {
        String A002;
        if (r4.A0E()) {
            Object A06 = r4.A06();
            A06.getClass();
            A002 = String.format("%d states", new Object[]{Integer.valueOf(((List) A06).size())});
        } else {
            A002 = 2JH.A00(r4);
        }
        2JH.A02(this.A00, "getSessionStates completed: %s ", new Object[]{A002});
    }
}
