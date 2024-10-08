package X;

import java.util.Set;

/* renamed from: X.50d  reason: invalid class name and case insensitive filesystem */
public final class C2801150d implements AnonymousClass3P0 {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass3W1 A01;
    public final /* synthetic */ Set A02;

    public final void DEC(float f) {
    }

    public C2801150d(1Xj r1, AnonymousClass3W1 r2, Set set) {
        this.A02 = set;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DEA() {
        this.A01.A0q = null;
    }

    public final void DEB() {
        Set set = this.A02;
        1Xj r1 = this.A00;
        if (set.contains(r1.getId()) && !r1.A4c()) {
            AnonymousClass3W1 r12 = this.A01;
            if (!r12.A2D && !r12.A2C) {
                r12.A3D = true;
                return;
            }
        }
        C256113vF r0 = this.A01.A0q;
        if (r0 != null) {
            r0.A00();
        }
    }
}
