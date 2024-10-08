package X;

import java.io.File;
import java.util.Arrays;

public final class SKL {
    public static final void A01(File file, int... iArr) {
        int[] copyOf = Arrays.copyOf(iArr, 2);
        0qQ.A0B(copyOf, 2);
        0sC A00 = 0pe.A00(file.listFiles());
        while (A00.hasNext()) {
            File file2 = (File) A00.next();
            if (file2.isDirectory()) {
                try {
                    String name = file2.getName();
                    0qQ.A07(name);
                    int parseInt = Integer.parseInt(name);
                    boolean z = true;
                    for (int i : copyOf) {
                        if (parseInt == i) {
                            z = false;
                        }
                    }
                    if (z) {
                        A00(file2);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r3.listFiles().length == 0) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A00(java.io.File r3) {
        /*
            java.lang.Class<X.SKL> r2 = X.SKL.class
            monitor-enter(r2)
            r0 = 0
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x003a }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0038
            boolean r0 = r3.isDirectory()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0035
            java.io.File[] r0 = r3.listFiles()     // Catch:{ all -> 0x003a }
            X.0sC r1 = X.0pe.A00(r0)     // Catch:{ all -> 0x003a }
        L_0x001b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x003a }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x003a }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x003a }
            A00(r0)     // Catch:{ all -> 0x003a }
            goto L_0x001b
        L_0x002e:
            java.io.File[] r0 = r3.listFiles()     // Catch:{ all -> 0x003a }
            int r0 = r0.length     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0035:
            r3.delete()     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SKL.A00(java.io.File):void");
    }
}
