package X;

import android.content.Context;
import android.util.BoostFramework;

/* renamed from: X.4EF  reason: invalid class name */
public final class AnonymousClass4EF {
    public static 15F A02;
    public static 15G A03 = 15F.A00(A02, new Class[]{Context.class}, true);
    public static 15H A04 = A02.A02("perfLockAcquire", new Class[]{Integer.TYPE, int[].class});
    public static 15H A05 = A02.A02("perfLockRelease", new Class[0]);
    public final BoostFramework A00;
    public final Object A01;

    static {
        15F r1 = new 15F("android.util.BoostFramework");
        A02 = r1;
        15F.A00(r1, new Class[0], false);
    }

    public static boolean A00() {
        if (A03.A00 != null) {
            return true;
        }
        return false;
    }

    public static boolean A01() {
        return A02.A05((ClassLoader) null);
    }

    public final int A02(int i, int... iArr) {
        BoostFramework boostFramework = this.A00;
        if (boostFramework != null) {
            return boostFramework.perfLockAcquire(i, iArr);
        }
        return A04.A00(new Object[]{Integer.valueOf(i), iArr}, this.A01);
    }

    public final void A03() {
        BoostFramework boostFramework = this.A00;
        if (boostFramework != null) {
            boostFramework.perfLockRelease();
            return;
        }
        A05.A00(new Object[0], this.A01);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4EF(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            X.15F r3 = A02
            boolean r1 = r3.A03
            X.15G r0 = A03
            if (r1 == 0) goto L_0x001b
            java.lang.reflect.Constructor r1 = r0.A00
            android.util.BoostFramework r0 = new android.util.BoostFramework
            if (r1 == 0) goto L_0x0017
            r0.<init>(r5)
        L_0x0014:
            r4.A00 = r0
            return
        L_0x0017:
            r0.<init>()
            goto L_0x0014
        L_0x001b:
            java.lang.reflect.Constructor r2 = r0.A00
            if (r2 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            r1 = 0
            java.lang.Object r1 = r2.newInstance(r0)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0032
        L_0x0029:
            java.lang.Class r0 = r3.A01
            r1 = 0
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r0.newInstance()     // Catch:{  }
        L_0x0032:
            r4.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4EF.<init>(android.content.Context):void");
    }
}
