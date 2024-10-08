package X;

import android.content.Context;
import android.os.StatFs;

/* renamed from: X.9vq  reason: invalid class name and case insensitive filesystem */
public abstract class C393069vq {
    public static boolean A00(Context context, C343967r6 r8) {
        long j;
        long j2;
        boolean z = r8 instanceof C343947r4;
        if (C342127o5.A00(context, true) < 0) {
            return false;
        }
        Runtime runtime = Runtime.getRuntime();
        int freeMemory = (int) ((runtime.freeMemory() + (runtime.maxMemory() - runtime.totalMemory())) >> 20);
        if (!z) {
            j = 0;
        } else if (AnonymousClass0Ke.A00(C60960kU.A00) >= 2016) {
            j = 500;
        } else {
            j = 50;
        }
        if (freeMemory < ((int) j)) {
            return false;
        }
        0qQ.A0B(context, 0);
        StatFs statFs = new StatFs(context.getCacheDir().getAbsolutePath());
        long availableBlocksLong = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) >> 20;
        if (z) {
            j2 = 2000;
        } else {
            j2 = 0;
        }
        if (availableBlocksLong >= ((long) ((int) j2))) {
            return r8.CTO(112);
        }
        return false;
    }
}
