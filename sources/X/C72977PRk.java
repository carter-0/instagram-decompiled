package X;

/* renamed from: X.PRk  reason: case insensitive filesystem */
public final class C72977PRk implements C256223vQ {
    public final int A00;
    public final Object A01;

    public C72977PRk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void Dxo() {
    }

    public final void Dxp(boolean z) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C17925ViG viG = (C17925ViG) this.A01;
                viG.A08.remove(this);
                viG.A00();
                return;
            default:
                C21044XAx xAx = (C21044XAx) this.A01;
                if (xAx != null) {
                    xAx.CiJ(002.A1D("audio prefetch canceled; foundAndRemoved = ", z));
                    return;
                }
                return;
        }
    }

    public final void Dxq(boolean z) {
        switch (this.A00) {
            case 0:
                C67087Mi3 mi3 = (C67087Mi3) this.A01;
                if (equals(mi3.A02)) {
                    mi3.A00 = null;
                    C74454Pv9 pv9 = mi3.A01;
                    if (z) {
                        if (pv9 != null) {
                            pv9.DQX();
                        }
                    } else if (pv9 != null) {
                        pv9.DQ2();
                    }
                    mi3.A02 = null;
                    return;
                }
                return;
            case 1:
                C17925ViG viG = (C17925ViG) this.A01;
                viG.A08.remove(this);
                viG.A00();
                return;
            default:
                C21044XAx xAx = (C21044XAx) this.A01;
                if (z) {
                    if (xAx != null) {
                        xAx.CiL();
                        return;
                    }
                    return;
                } else if (xAx != null) {
                    xAx.CiJ("audio prefetch failure");
                    return;
                } else {
                    return;
                }
        }
    }
}
