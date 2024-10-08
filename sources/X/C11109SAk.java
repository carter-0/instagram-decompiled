package X;

/* renamed from: X.SAk  reason: case insensitive filesystem */
public abstract class C11109SAk {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.2Og.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d8, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d9, code lost:
        X.1zE.A00(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(java.lang.ClassLoader r8) {
        /*
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r5 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            java.lang.String r0 = "META-INF/services/"
            java.lang.String r0 = X.Pxf.A0e(r5, r0)     // Catch:{ all -> 0x00e4 }
            java.util.Enumeration r0 = r8.getResources(r0)     // Catch:{ all -> 0x00e4 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ all -> 0x00e4 }
            java.util.ArrayList r4 = X.DbV.A15(r0)     // Catch:{ all -> 0x00e4 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00e4 }
        L_0x0018:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x0092
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x00e4 }
            java.net.URL r1 = (java.net.URL) r1     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "jar"
            r6 = 0
            boolean r0 = X.00p.A0k(r3, r0, r6)     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "jar:file:"
            java.lang.String r1 = X.00l.A0K(r3, r0, r3)     // Catch:{ all -> 0x00e4 }
            r0 = 33
            java.lang.String r2 = X.00l.A0J(r1, r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "!/"
            java.lang.String r1 = X.00l.A0K(r3, r0, r3)     // Catch:{ all -> 0x00e4 }
            java.util.jar.JarFile r3 = new java.util.jar.JarFile     // Catch:{ all -> 0x00e4 }
            r3.<init>(r2, r6)     // Catch:{ all -> 0x00e4 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0084 }
            r0.<init>(r1)     // Catch:{ all -> 0x0084 }
            java.io.InputStream r2 = r3.getInputStream(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "UTF-8"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0084 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0084 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0084 }
            r2.<init>(r0)     // Catch:{ all -> 0x0084 }
            java.util.List r0 = A00(r2)     // Catch:{ all -> 0x007d }
            r2.close()     // Catch:{ all -> 0x0084 }
            r3.close()     // Catch:{ all -> 0x007b }
            goto L_0x0077
        L_0x0068:
            java.io.InputStream r0 = r1.openStream()     // Catch:{ all -> 0x00e4 }
            java.io.BufferedReader r2 = X.Pxg.A0X(r0)     // Catch:{ all -> 0x00e4 }
            java.util.List r0 = A00(r2)     // Catch:{ all -> 0x0090 }
            r2.close()     // Catch:{ all -> 0x00e4 }
        L_0x0077:
            X.018.A16(r0, r4)     // Catch:{ all -> 0x00e4 }
            goto L_0x0018
        L_0x007b:
            r1 = move-exception
            goto L_0x00dc
        L_0x007d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x008b }
            goto L_0x00e3
        L_0x008b:
            r0 = move-exception
            X.2Og.A01(r1, r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x00dc
        L_0x0090:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x0092:
            java.util.Set r1 = X.00k.A0k(r4)     // Catch:{ all -> 0x00e4 }
            boolean r0 = X.C66580MXl.A1b(r1)     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00dd
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r1)     // Catch:{ all -> 0x00e4 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x00e4 }
        L_0x00a4:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00ec
            java.lang.String r1 = X.AnonymousClass7TE.A18(r3)     // Catch:{ all -> 0x00e4 }
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r1, r0, r8)     // Catch:{ all -> 0x00e4 }
            boolean r0 = r5.isAssignableFrom(r2)     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r0 = X.Pxg.A0i(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ all -> 0x00e4 }
            r4.add(r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x00a4
        L_0x00c5:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "Expected service of class "
            r1.append(r0)     // Catch:{ all -> 0x00e4 }
            r1.append(r5)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = ", but found "
            java.lang.IllegalArgumentException r1 = X.C51973G9u.A0g(r2, r0, r1)     // Catch:{ all -> 0x00e4 }
            goto L_0x00dc
        L_0x00d8:
            r1 = move-exception
            X.1zE.A00(r2, r0)     // Catch:{ all -> 0x00e4 }
        L_0x00dc:
            throw r1     // Catch:{ all -> 0x00e4 }
        L_0x00dd:
            java.lang.String r0 = "No providers were loaded with FastServiceLoader"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x00e4 }
        L_0x00e3:
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r5, r8)
            java.util.List r4 = X.00k.A0a(r0)
        L_0x00ec:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11109SAk.A01(java.lang.ClassLoader):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r0 <= 0) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r4.add(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(java.io.BufferedReader r5) {
        /*
            java.util.LinkedHashSet r4 = X.DbS.A0y()
        L_0x0004:
            java.lang.String r1 = r5.readLine()
            if (r1 != 0) goto L_0x000f
            java.util.List r0 = X.00k.A0a(r4)
            return r0
        L_0x000f:
            java.lang.String r0 = "#"
            java.lang.String r0 = X.00l.A0L(r1, r0, r1)
            java.lang.String r3 = X.DbV.A12(r0)
            r2 = 0
        L_0x001a:
            int r0 = r3.length()
            if (r2 >= r0) goto L_0x0038
            char r1 = r3.charAt(r2)
            r0 = 46
            if (r1 == r0) goto L_0x0035
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "Illegal service provider class name: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r3)
            throw r0
        L_0x0035:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x0038:
            if (r0 <= 0) goto L_0x0004
            r4.add(r3)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11109SAk.A00(java.io.BufferedReader):java.util.List");
    }
}
