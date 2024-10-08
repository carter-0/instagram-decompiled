package X;

import java.util.ArrayList;
import java.util.List;

public final class CMU extends 17P implements C46244DRz {
    public List A00;

    public final C46244DRz E7h(1E9 r4) {
        List<YCC> list = this.A00;
        if (list == null) {
            list = A0o(-1854476977, CHo.class);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (YCC ycc : list) {
            ycc.E71(r4);
            A0r.add(ycc);
        }
        this.A00 = A0r;
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CMU] */
    public final C42050BFd F6T(1E9 r5) {
        List<YCC> list = this.A00;
        if (list == null) {
            list = A0o(-1854476977, CHo.class);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (YCC F0D : list) {
            A0r.add(F0D.F0D(r5));
        }
        return new C42050BFd(A0r, getIntValueByHashCode(-346560081), A0h(1296666401));
    }
}
