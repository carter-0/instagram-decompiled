package X;

import android.os.Debug;

/* renamed from: X.XwM  reason: case insensitive filesystem */
public final class C22157XwM implements Y9E {
    public Debug.MemoryInfo A00;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.XIV, X.XSz, java.lang.Object] */
    public final /* bridge */ /* synthetic */ C21292XSz BSt() {
        ? obj = new Object();
        Debug.MemoryInfo memoryInfo = this.A00;
        if (memoryInfo == null) {
            memoryInfo = new Debug.MemoryInfo();
            this.A00 = memoryInfo;
        }
        Debug.getMemoryInfo(memoryInfo);
        Debug.MemoryInfo memoryInfo2 = this.A00;
        obj.A03 = Integer.valueOf(memoryInfo2.getTotalPrivateDirty());
        obj.A04 = Integer.valueOf(memoryInfo2.getTotalPss());
        memoryInfo2.getTotalSharedDirty();
        obj.A00 = Integer.valueOf(memoryInfo2.dalvikPss);
        obj.A01 = Integer.valueOf(memoryInfo2.nativePss);
        obj.A02 = Integer.valueOf(memoryInfo2.getTotalPrivateClean());
        memoryInfo2.getTotalSharedClean();
        memoryInfo2.getTotalSwappablePss();
        return obj;
    }
}
