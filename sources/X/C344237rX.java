package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.7rX  reason: invalid class name and case insensitive filesystem */
public final class C344237rX {
    public static int A00 = 270;
    public static String A01 = "/sdcard/e2e/media/fineYoungGentleman.jpg";
    public static Boolean A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00() {
        /*
            java.lang.Class<X.7rX> r4 = X.C344237rX.class
            monitor-enter(r4)
            java.lang.Boolean r0 = A02     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0042
            r3 = 0
            java.lang.String r0 = "com.facebook.endtoend.EndToEnd"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.lang.String r1 = "isRunningEndToEndTest"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.lang.reflect.Method r2 = r2.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.booleanValue()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = A01     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.io.File r0 = new java.io.File     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            boolean r0 = r0.exists()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            goto L_0x0040
        L_0x0037:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x003c }
            goto L_0x0040
        L_0x003c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0048 }
        L_0x0040:
            A02 = r0     // Catch:{ all -> 0x0048 }
        L_0x0042:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            return r0
        L_0x0048:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344237rX.A00():boolean");
    }

    public static byte[] A01() {
        try {
            File file = new File(A01);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[((int) file.length())];
            fileInputStream.read(bArr);
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
