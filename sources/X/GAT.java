package X;

public final class GAT implements AnonymousClass36F {
    public final /* synthetic */ C227232is A00;
    public final /* synthetic */ boolean A01;

    public final boolean AJb(1Xj r4) {
        0qQ.A0B(r4, 0);
        if (this.A01) {
            GD6 gd6 = this.A00.A0C;
            if (gd6 == null) {
                0qQ.A0F("viewerAdapter");
                throw AnonymousClass00P.createAndThrow();
            } else if (gd6.A0A.A0C(r4) > -1) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public final void DQv(1Xj r4) {
        0qQ.A0B(r4, 0);
        boolean z = this.A01;
        GD6 gd6 = this.A00.A0C;
        if (z) {
            if (gd6 != null) {
                gd6.Cs9(r4);
                return;
            }
        } else if (gd6 != null) {
            return;
        }
        0qQ.A0F("viewerAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public GAT(C227232is r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }
}
