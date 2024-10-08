package X;

import android.os.Debug;

/* renamed from: X.XwJ  reason: case insensitive filesystem */
public final class C22154XwJ implements Y9E {
    /* JADX WARNING: type inference failed for: r6v0, types: [X.XIU, X.XSz, java.lang.Object] */
    public final /* bridge */ /* synthetic */ C21292XSz BSt() {
        Runtime runtime = Runtime.getRuntime();
        ? obj = new Object();
        obj.A01 = runtime.maxMemory() / 1024;
        obj.A00 = (runtime.totalMemory() - runtime.freeMemory()) / 1024;
        obj.A03 = Debug.getNativeHeapSize() / 1024;
        obj.A02 = Debug.getNativeHeapAllocatedSize() / 1024;
        return obj;
    }
}
