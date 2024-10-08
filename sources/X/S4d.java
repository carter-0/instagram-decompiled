package X;

import android.content.Context;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;

public final class S4d {
    public Context A00;
    public ILoadedInstanceCreator A01;
    public final C11012S5j A02;

    public S4d(C11012S5j s5j) {
        this.A02 = s5j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.Context A00(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.A00     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0017
            X.S5j r0 = r2.A02     // Catch:{ NameNotFoundException -> 0x0011 }
            java.lang.String r1 = r0.A00     // Catch:{ NameNotFoundException -> 0x0011 }
            r0 = 3
            android.content.Context r0 = r3.createPackageContext(r1, r0)     // Catch:{ NameNotFoundException -> 0x0011 }
            r2.A00 = r0     // Catch:{ NameNotFoundException -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            X.RKX r0 = new X.RKX     // Catch:{ all -> 0x0019 }
            r0.<init>()     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r2)
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S4d.A00(android.content.Context):android.content.Context");
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [com.google.ar.core.dependencies.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.vr.dynamite.client.ILoadedInstanceCreator A01(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.vr.dynamite.client.ILoadedInstanceCreator r2 = r4.A01     // Catch:{ all -> 0x007d }
            if (r2 != 0) goto L_0x007b
            android.content.Context r0 = r4.A00(r5)     // Catch:{ all -> 0x007d }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ all -> 0x007d }
            java.lang.String r2 = "com.google.vr.dynamite.LoadedInstanceCreator"
            java.lang.Class r0 = r0.loadClass(r2)     // Catch:{ NoSuchMethodException -> 0x0063, InvocationTargetException -> 0x0057, ClassNotFoundException -> 0x004b, InstantiationException -> 0x006f, IllegalAccessException -> 0x003f }
            java.lang.Object r3 = X.Pxg.A0i(r0)     // Catch:{ NoSuchMethodException -> 0x0063, InvocationTargetException -> 0x0057, ClassNotFoundException -> 0x004b, InstantiationException -> 0x006f, IllegalAccessException -> 0x003f }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ NoSuchMethodException -> 0x0063, InvocationTargetException -> 0x0057, ClassNotFoundException -> 0x004b, InstantiationException -> 0x006f, IllegalAccessException -> 0x003f }
            if (r3 != 0) goto L_0x001d
            r2 = 0
            goto L_0x0029
        L_0x001d:
            java.lang.String r1 = "com.google.vr.dynamite.client.ILoadedInstanceCreator"
            android.os.IInterface r2 = r3.queryLocalInterface(r1)     // Catch:{ all -> 0x007d }
            boolean r0 = r2 instanceof com.google.vr.dynamite.client.ILoadedInstanceCreator     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x002c
            com.google.vr.dynamite.client.ILoadedInstanceCreator r2 = (com.google.vr.dynamite.client.ILoadedInstanceCreator) r2     // Catch:{ all -> 0x007d }
        L_0x0029:
            r4.A01 = r2     // Catch:{ all -> 0x007d }
            goto L_0x007b
        L_0x002c:
            com.google.vr.dynamite.client.a r2 = new com.google.vr.dynamite.client.a     // Catch:{ all -> 0x007d }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x007d }
            r0 = 578768120(0x227f4cf8, float:3.4599691E-18)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ all -> 0x007d }
            r0 = 1993359244(0x76d03f8c, float:2.111888E33)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ all -> 0x007d }
            goto L_0x0029
        L_0x003f:
            r1 = move-exception
            java.lang.String r0 = "Unable to call the default constructor of "
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x007d }
            java.lang.IllegalStateException r0 = X.Pxe.A0j(r0, r1)     // Catch:{ all -> 0x007d }
            goto L_0x007a
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = "Unable to find dynamic class "
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x007d }
            java.lang.IllegalStateException r0 = X.Pxe.A0j(r0, r1)     // Catch:{ all -> 0x007d }
            goto L_0x007a
        L_0x0057:
            r1 = move-exception
            java.lang.String r0 = "Unable to invoke constructor of dynamic class "
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x007d }
            java.lang.IllegalStateException r0 = X.Pxe.A0j(r0, r1)     // Catch:{ all -> 0x007d }
            goto L_0x007a
        L_0x0063:
            r1 = move-exception
            java.lang.String r0 = "No constructor for dynamic class "
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x007d }
            java.lang.IllegalStateException r0 = X.Pxe.A0j(r0, r1)     // Catch:{ all -> 0x007d }
            goto L_0x007a
        L_0x006f:
            r1 = move-exception
            java.lang.String r0 = "Unable to instantiate the remote class "
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x007d }
            java.lang.IllegalStateException r0 = X.Pxe.A0j(r0, r1)     // Catch:{ all -> 0x007d }
        L_0x007a:
            throw r0     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r4)
            return r2
        L_0x007d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S4d.A01(android.content.Context):com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }
}
