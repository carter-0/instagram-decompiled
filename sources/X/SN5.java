package X;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

public final class SN5 {
    public static Boolean A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;
    public static final Method A06;
    public static final Method A07;
    public static final Method A08;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Process.myUid();
        Method method8 = null;
        try {
            method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        A01 = method;
        try {
            method2 = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
        } catch (Exception unused2) {
            method2 = null;
        }
        A02 = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        A03 = method3;
        try {
            method4 = WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
            method4 = null;
        }
        A05 = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
            method5 = null;
        }
        A04 = method5;
        try {
            method6 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
        } catch (Exception e) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            method6 = null;
        }
        A06 = method6;
        try {
            method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
        } catch (Exception e2) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            method7 = null;
        }
        A07 = method7;
        try {
            method8 = WorkSource.class.getMethod("isEmpty", new Class[0]);
            method8.setAccessible(true);
        } catch (Exception unused6) {
        }
        A08 = method8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A00(android.content.Context r3) {
        /*
            java.lang.Class<X.SN5> r2 = X.SN5.class
            monitor-enter(r2)
            java.lang.Boolean r0 = A00     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0026 }
            goto L_0x0024
        L_0x000c:
            r1 = 0
            if (r3 != 0) goto L_0x0011
            monitor-exit(r2)
            return r1
        L_0x0011:
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = X.02K.A00(r3, r0)     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0026 }
            A00 = r0     // Catch:{ all -> 0x0026 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r2)
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SN5.A00(android.content.Context):boolean");
    }
}
