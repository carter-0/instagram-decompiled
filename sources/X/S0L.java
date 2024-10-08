package X;

import com.google.common.util.concurrent.SettableFuture;

public final class S0L {
    public final C10387RrO A00;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture, X.1K2] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture A00() {
        C10387RrO rrO = this.A00;
        1RH A002 = 1RH.A00();
        1US r2 = rrO.A01;
        if (A002.A06(r2) || (1RH.A00().A05(r2) && 1RH.A00().A07(r2))) {
            ? obj = new Object();
            obj.set(true);
            return obj;
        }
        ? obj2 = new Object();
        PyC pyC = new PyC(r2);
        pyC.A03 = AnonymousClass05K.A01;
        pyC.A02 = new T82(obj2, 1);
        1RH.A00().A03(rrO.A00, new PyB(pyC));
        return obj2;
    }

    public S0L(C10387RrO rrO) {
        this.A00 = rrO;
    }
}
