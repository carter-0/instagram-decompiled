package com.facebook.models;

import X.C363128j9;
import com.google.common.util.concurrent.ListenableFuture;

public class VoltronModuleLoaderProxy {
    public final C363128j9 mVoltronModuleLoader;

    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.1K2] */
    public ListenableFuture loadModule() {
        C363128j9 r0 = this.mVoltronModuleLoader;
        if (r0 != null) {
            return r0.loadModule();
        }
        ? obj = new Object();
        obj.set(new VoltronLoadingResult(true, true));
        return obj;
    }

    public boolean requireLoad() {
        C363128j9 r0 = this.mVoltronModuleLoader;
        if (r0 == null) {
            return false;
        }
        return r0.requireLoad();
    }

    public VoltronModuleLoaderProxy(C363128j9 r1) {
        this.mVoltronModuleLoader = r1;
    }
}
