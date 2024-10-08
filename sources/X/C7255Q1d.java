package X;

import com.instagram.common.session.UserSession;
import java.lang.Thread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Q1d  reason: case insensitive filesystem */
public final class C7255Q1d {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.Q1d, java.lang.Object] */
    public static C13778Tgt A00(C11261SHv sHv, UserSession userSession) {
        sHv.A01 = new Q1Q(userSession);
        sHv.A03 = new Object();
        return SRj.A00(sHv.A01());
    }

    public static final ThreadPoolExecutor A01(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, boolean z) {
        int i2 = i;
        int i3 = i;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i3, 30000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new Q1c(str, uncaughtExceptionHandler, z));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Thread$UncaughtExceptionHandler} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Thread$UncaughtExceptionHandler} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.ThreadPoolExecutor A03(java.lang.Integer r5, java.lang.Thread.UncaughtExceptionHandler r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0007
            X.TLF r6 = new X.TLF
            r6.<init>()
        L_0x0007:
            int r0 = r5.intValue()
            r3 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x001c;
                case 2: goto L_0x0010;
                case 3: goto L_0x0010;
                case 4: goto L_0x0010;
                case 5: goto L_0x0026;
                case 6: goto L_0x0026;
                case 7: goto L_0x001c;
                case 8: goto L_0x002f;
                case 9: goto L_0x002f;
                case 10: goto L_0x002f;
                case 11: goto L_0x002f;
                case 12: goto L_0x002f;
                case 13: goto L_0x0026;
                case 14: goto L_0x0010;
                case 15: goto L_0x0026;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.String r1 = "unknown type "
            java.lang.String r0 = X.C7256Q1e.A00(r5)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x001c:
            java.lang.String r1 = X.C7256Q1e.A00(r5)
            r0 = 2
            java.util.concurrent.ThreadPoolExecutor r0 = A01(r1, r6, r0, r2)
            return r0
        L_0x0026:
            java.lang.String r0 = X.C7256Q1e.A00(r5)
            java.util.concurrent.ThreadPoolExecutor r0 = A01(r0, r6, r3, r2)
            return r0
        L_0x002f:
            java.lang.String r1 = X.C7256Q1e.A00(r5)
            r0 = 4
            java.util.concurrent.ThreadPoolExecutor r0 = A01(r1, r6, r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7255Q1d.A03(java.lang.Integer, java.lang.Thread$UncaughtExceptionHandler):java.util.concurrent.ThreadPoolExecutor");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public final ThreadPoolExecutor A02(Integer num, int i) {
        return A01(C7256Q1e.A00(num), new Object(), i, false);
    }
}
