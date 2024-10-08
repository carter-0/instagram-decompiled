package X;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class SS5 {
    public static final Object A00;
    public static final Method A01;
    public static final Method A02;
    public static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A[ExcHandler: ThreadDeath (r0v1 'e' java.lang.ThreadDeath A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    static {
        /*
            r6 = 0
            java.lang.String r0 = "sun.misc.SharedSecrets"
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r3, r6)     // Catch:{ ThreadDeath -> 0x0064, all -> 0x0017 }
            java.lang.String r1 = "getJavaLangAccess"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ ThreadDeath -> 0x0064, all -> 0x0017 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch:{ ThreadDeath -> 0x0064, all -> 0x0017 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ThreadDeath -> 0x0064, all -> 0x0017 }
            java.lang.Object r6 = r1.invoke(r6, r0)     // Catch:{ ThreadDeath -> 0x0064, all -> 0x0017 }
        L_0x0017:
            A00 = r6
            r5 = 0
            if (r6 != 0) goto L_0x0022
            r2 = r5
        L_0x001d:
            A02 = r2
            if (r6 == 0) goto L_0x0061
            goto L_0x003a
        L_0x0022:
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class[] r4 = new java.lang.Class[]{r1, r0}
            java.lang.String r3 = "getStackTraceElement"
            r2 = 0
            java.lang.String r1 = "sun.misc.JavaLangAccess"
            r0 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r0, r5)     // Catch:{ ThreadDeath -> 0x0064, all -> 0x001d }
            java.lang.reflect.Method r2 = r0.getMethod(r3, r4)     // Catch:{ ThreadDeath -> 0x0064, all -> 0x001d }
            goto L_0x001d
        L_0x003a:
            java.lang.String r4 = "getStackTraceDepth"
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r3 = 0
            java.lang.Class[] r2 = new java.lang.Class[]{r0}     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0061 }
            r1 = 0
            java.lang.String r0 = "sun.misc.JavaLangAccess"
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r5)     // Catch:{ ThreadDeath -> 0x005e, all -> 0x004f }
            java.lang.reflect.Method r1 = r0.getMethod(r4, r2)     // Catch:{ ThreadDeath -> 0x005e, all -> 0x004f }
        L_0x004f:
            if (r1 == 0) goto L_0x0061
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0061 }
            r0.<init>()     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0061 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0061 }
            r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0061 }
            goto L_0x0060
        L_0x005e:
            r0 = move-exception
            throw r0     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0061 }
        L_0x0060:
            r5 = r1
        L_0x0061:
            A01 = r5
            return
        L_0x0064:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SS5.<clinit>():void");
    }

    public static Throwable A00(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            if (cause != th2) {
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
                th = cause;
            } else {
                throw Pxe.A0h("Loop in causal chain detected.", cause);
            }
        }
    }

    public static List A01(Throwable th) {
        ArrayList A0v = DbS.A0v(4);
        A0v.add(th);
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(A0v);
            }
            A0v.add(th);
            if (th != th2) {
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
            } else {
                throw Pxe.A0h("Loop in causal chain detected.", th);
            }
        }
    }

    @Deprecated
    public static void A03(Throwable th) {
        Class<IOException> cls = IOException.class;
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        } else if ((th instanceof RuntimeException) || (th instanceof Error)) {
            throw th;
        }
    }

    @Deprecated
    public static void A02(Throwable th) {
        th.getClass();
        if ((th instanceof RuntimeException) || (th instanceof Error)) {
            throw th;
        }
        throw C41845B3m.A0j(th);
    }
}
