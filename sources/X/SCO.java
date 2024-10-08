package X;

import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;

public abstract class SCO {
    public static final C10496RtB A00;

    static {
        Field field;
        Field field2;
        try {
            field = MessageQueue.class.getDeclaredField("mMessages");
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            field = null;
        }
        try {
            field2 = Message.class.getDeclaredField("next");
            try {
                field2.setAccessible(true);
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            field2 = null;
        }
        C10496RtB rtB = null;
        if (!(field == null || field2 == null)) {
            rtB = new C10496RtB(field, field2);
        }
        A00 = rtB;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r3 == 100) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A00() {
        /*
            X.RtB r5 = A00
            r8 = 0
            if (r5 == 0) goto L_0x00ae
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.MessageQueue r4 = r0.getQueue()
            monitor-enter(r4)
            java.lang.reflect.Field r0 = r5.A00     // Catch:{ all -> 0x0017 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0017 }
            android.os.Message r0 = (android.os.Message) r0     // Catch:{ all -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r0 = r8
        L_0x0018:
            if (r0 == 0) goto L_0x00a8
            int r3 = r0.what     // Catch:{ all -> 0x00aa }
            r2 = 159(0x9f, float:2.23E-43)
            if (r3 == r2) goto L_0x0025
            r1 = 100
            r7 = 0
            if (r3 != r1) goto L_0x0026
        L_0x0025:
            r7 = 1
        L_0x0026:
            if (r3 != r2) goto L_0x0072
            java.lang.Object r3 = r0.obj     // Catch:{ all -> 0x00aa }
            boolean r1 = r3 instanceof android.app.servertransaction.ClientTransaction     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x0070
            java.lang.Class r2 = r3.getClass()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "mActivityCallbacks"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r1)     // Catch:{ all -> 0x003d }
            r1 = 1
            r2.setAccessible(r1)     // Catch:{ all -> 0x003e }
            goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            if (r2 == 0) goto L_0x0070
            java.lang.Object r6 = r2.get(r3)     // Catch:{ all -> 0x0093 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0093 }
            if (r6 == 0) goto L_0x0093
            boolean r1 = r6.isEmpty()     // Catch:{ all -> 0x0093 }
            if (r1 != 0) goto L_0x0093
            r3 = 0
            java.lang.Object r1 = r6.get(r3)     // Catch:{ all -> 0x0093 }
            java.lang.Class r2 = r1.getClass()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "mIntent"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r1)     // Catch:{ all -> 0x0062 }
            r1 = 1
            r2.setAccessible(r1)     // Catch:{ all -> 0x0063 }
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            if (r2 == 0) goto L_0x0093
            java.lang.Object r1 = r6.get(r3)     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0093 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ all -> 0x0093 }
            goto L_0x0094
        L_0x0070:
            r1 = r8
            goto L_0x0094
        L_0x0072:
            java.lang.Object r3 = r0.obj     // Catch:{ all -> 0x00aa }
            if (r3 != 0) goto L_0x0078
            r1 = r8
            goto L_0x0094
        L_0x0078:
            java.lang.Class r2 = r3.getClass()     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "intent"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r1)     // Catch:{ all -> 0x0087 }
            r1 = 1
            r2.setAccessible(r1)     // Catch:{ all -> 0x0088 }
            goto L_0x0088
        L_0x0087:
            r2 = 0
        L_0x0088:
            if (r2 == 0) goto L_0x0091
            java.lang.Object r1 = r2.get(r3)     // Catch:{ all -> 0x0091 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ all -> 0x0091 }
            goto L_0x0094
        L_0x0091:
            r1 = r8
            goto L_0x0094
        L_0x0093:
            r1 = r8
        L_0x0094:
            if (r1 == 0) goto L_0x0099
            if (r7 == 0) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            java.lang.reflect.Field r1 = r5.A01     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00a3 }
            android.os.Message r0 = (android.os.Message) r0     // Catch:{ all -> 0x00a3 }
            goto L_0x0018
        L_0x00a3:
            r0 = r8
            goto L_0x0018
        L_0x00a6:
            monitor-exit(r4)     // Catch:{ all -> 0x00aa }
            return r1
        L_0x00a8:
            monitor-exit(r4)     // Catch:{ all -> 0x00aa }
            goto L_0x00ad
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00aa }
            throw r0
        L_0x00ad:
            return r8
        L_0x00ae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SCO.A00():android.content.Intent");
    }
}
