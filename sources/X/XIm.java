package X;

import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.hyperthrift.HyperThriftBase$Builder;
import com.facebook.logginginfra.falco.AppScopedIdentity;

public final class XIm extends HyperThriftBase$Builder {
    public XIm() {
        super(4);
    }

    public final void A01(Long l) {
        Object[] objArr = this.A01;
        Object obj = l;
        if (l == null) {
            obj = HyperThriftBase.A02;
        }
        objArr[0] = obj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.logginginfra.falco.AppScopedIdentity, com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    public final AppScopedIdentity A00() {
        Object[] A01 = HyperThriftBase$Builder.A01(this.A01);
        HyperThriftBase$Builder.A00(A01, 1);
        ? obj = new Object();
        obj.A02("com.facebook.logginginfra.falco.AppScopedIdentity", A01);
        return obj;
    }
}
