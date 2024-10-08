package X;

import java.util.Set;

public final class SGs {
    public final Set A00;
    public final boolean A01;

    public SGs(Set set, boolean z) {
        this.A00 = set;
        this.A01 = z;
    }

    public SGs() {
        this.A00 = C8452Qux.A05;
        this.A01 = false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.Tb4] */
    public final SyC A00(boolean z) {
        return new SyC(new C10605Ruz(Sy9.A00, new Object(), this.A00), Boolean.valueOf(z));
    }
}
