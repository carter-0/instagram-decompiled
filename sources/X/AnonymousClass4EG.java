package X;

import android.content.Context;
import dalvik.system.PathClassLoader;
import java.io.File;

/* renamed from: X.4EG  reason: invalid class name */
public final class AnonymousClass4EG {
    public static 15H A01 = A03.A02("perfLockAcquire", new Class[]{Integer.TYPE, int[].class});
    public static 15H A02 = A03.A02("perfLockRelease", new Class[0]);
    public static 15F A03;
    public static 15G A04 = 15F.A00(A03, new Class[]{Context.class}, true);
    public final Object A00;

    static {
        15F r1 = new 15F("com.qualcomm.qti.Performance");
        A03 = r1;
        15F.A00(r1, new Class[0], false);
    }

    public static boolean A00() {
        if (A04.A00 != null) {
            return true;
        }
        return false;
    }

    public static boolean A01() {
        if (!new File("/system/framework/QPerformance.jar").exists()) {
            return false;
        }
        return A03.A05(new PathClassLoader("/system/framework/QPerformance.jar", ClassLoader.getSystemClassLoader()));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4EG(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            X.15G r0 = A04
            java.lang.reflect.Constructor r2 = r0.A00
            if (r2 == 0) goto L_0x0013
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            r1 = 0
            java.lang.Object r1 = r2.newInstance(r0)     // Catch:{ Exception -> 0x001e }
            goto L_0x001e
        L_0x0013:
            X.15F r0 = A03
            java.lang.Class r0 = r0.A01
            r1 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r0.newInstance()     // Catch:{  }
        L_0x001e:
            r3.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4EG.<init>(android.content.Context):void");
    }
}
