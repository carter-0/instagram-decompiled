package X;

import java.util.Set;

public final class IZO implements AnonymousClass3P0 {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass3W1 A01;
    public final /* synthetic */ Set A02;

    public final void DEC(float f) {
    }

    public IZO(1Xj r1, AnonymousClass3W1 r2, Set set) {
        this.A02 = set;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DEA() {
        this.A01.A0r = null;
    }

    public final void DEB() {
        boolean contains = this.A02.contains(this.A00.getId());
        AnonymousClass3W1 r1 = this.A01;
        if (!contains) {
            C256113vF r0 = r1.A0r;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        r1.A3E = true;
    }
}
