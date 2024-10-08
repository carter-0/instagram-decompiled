package X;

import com.facebook.models.VoltronLoadingResult;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.8j8  reason: invalid class name and case insensitive filesystem */
public final class C363118j8 implements C363128j9 {
    public boolean requireLoad() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.1K2] */
    public ListenableFuture loadModule() {
        ? obj = new Object();
        obj.set(new VoltronLoadingResult(true, true));
        return obj;
    }
}
