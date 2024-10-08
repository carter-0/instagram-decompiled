package X;

import com.facebook.hyperthrift.HyperThriftBase$Builder;
import com.facebook.logginginfra.falco.AppScopedIdentity;
import com.facebook.logginginfra.falco.Identity;

public final class XIn extends HyperThriftBase$Builder {
    public XIn() {
        super(2);
    }

    public final void A01(AppScopedIdentity appScopedIdentity) {
        this.A01[1] = appScopedIdentity;
        this.A00 = 2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.hyperthrift.HyperThriftBase, com.facebook.logginginfra.falco.Identity, java.lang.Object] */
    public final Identity A00() {
        Object[] A01 = HyperThriftBase$Builder.A01(this.A01);
        ? obj = new Object();
        obj.A02("com.facebook.logginginfra.falco.Identity", A01);
        obj.A01();
        return obj;
    }
}
