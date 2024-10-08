package X;

import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.4pO  reason: invalid class name and case insensitive filesystem */
public final class C274974pO {
    public static final C274974pO A04;
    public final Field A00;
    public final Field A01;
    public final Method A02;
    public final Method A03;

    public final int A01(MessageQueue messageQueue) {
        Message message;
        int i;
        Message message2;
        synchronized (messageQueue) {
            try {
                message = (Message) this.A00.get(messageQueue);
            } catch (Throwable unused) {
                message = null;
            }
            i = 0;
            while (message != null) {
                try {
                    message2 = (Message) this.A01.get(message);
                } catch (Throwable unused2) {
                    message2 = null;
                }
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|5|6|7|(4:9|10|11|12)|15|16|(2:17|18)|(1:29)(1:26)|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
    static {
        /*
            java.lang.Class<android.os.MessageQueue> r7 = android.os.MessageQueue.class
            java.lang.String r6 = "next"
            r2 = 0
            r5 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0010 }
            java.lang.reflect.Method r5 = r7.getDeclaredMethod(r6, r0)     // Catch:{ all -> 0x0010 }
            r0 = 1
            r5.setAccessible(r0)     // Catch:{ all -> 0x0010 }
        L_0x0010:
            java.lang.Class<android.os.Message> r4 = android.os.Message.class
            java.lang.String r1 = "recycleUnchecked"
            r3 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x001f }
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r1, r0)     // Catch:{ all -> 0x001f }
            r0 = 1
            r3.setAccessible(r0)     // Catch:{ all -> 0x001f }
        L_0x001f:
            java.lang.String r0 = "mMessages"
            java.lang.reflect.Field r2 = r7.getDeclaredField(r0)     // Catch:{ all -> 0x002a }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x002b }
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            java.lang.reflect.Field r1 = r4.getDeclaredField(r6)     // Catch:{ all -> 0x0034 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x0045
            if (r3 == 0) goto L_0x0045
            if (r2 == 0) goto L_0x0045
            if (r1 == 0) goto L_0x0045
            X.4pO r0 = new X.4pO
            r0.<init>(r2, r1, r5, r3)
        L_0x0042:
            A04 = r0
            return
        L_0x0045:
            r0 = 0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C274974pO.<clinit>():void");
    }

    public C274974pO(Field field, Field field2, Method method, Method method2) {
        this.A02 = method;
        this.A03 = method2;
        this.A00 = field;
        this.A01 = field2;
    }

    public final int A00(MessageQueue messageQueue) {
        Message message;
        int i;
        Message message2;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (messageQueue) {
            try {
                message = (Message) this.A00.get(messageQueue);
            } catch (Throwable unused) {
                message = null;
            }
            i = 0;
            while (message != null) {
                if (message.getWhen() <= uptimeMillis) {
                    try {
                        message2 = (Message) this.A01.get(message);
                    } catch (Throwable unused2) {
                        message2 = null;
                    }
                    i++;
                }
            }
        }
        return i;
    }
}
