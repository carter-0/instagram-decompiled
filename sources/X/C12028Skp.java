package X;

import android.os.Debug;

/* renamed from: X.Skp  reason: case insensitive filesystem */
public final class C12028Skp implements C274924pJ {
    public final String getName() {
        return "memory";
    }

    public final void update() {
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        s3x.A09 = memoryInfo;
    }
}
