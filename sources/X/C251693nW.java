package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3nW  reason: invalid class name and case insensitive filesystem */
public abstract class C251693nW {
    public static final Iterator A01 = new ArrayList(0).iterator();
    public final File A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.File[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.File[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.File[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.File[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.File[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.File[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Iterator A00() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C251683nV
            if (r0 == 0) goto L_0x0034
            r3 = r4
            X.3nV r3 = (X.C251683nV) r3
            java.io.File r2 = r3.A00
            java.io.FileFilter r0 = r3.A00
            java.util.Comparator r1 = r3.A01
            if (r0 == 0) goto L_0x001b
            java.io.File[] r2 = r2.listFiles(r0)
        L_0x0013:
            if (r2 == 0) goto L_0x0024
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            goto L_0x0020
        L_0x001b:
            java.io.File[] r2 = r2.listFiles()
            goto L_0x0013
        L_0x0020:
            java.util.Arrays.sort(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0029 }
            goto L_0x0028
        L_0x0024:
            r0 = 0
            java.io.File[] r2 = new java.io.File[r0]
            goto L_0x0029
        L_0x0028:
            r2 = r0
        L_0x0029:
            X.3nX r1 = new X.3nX
            r1.<init>(r2)
            X.3nY r0 = new X.3nY
            r0.<init>(r3, r1)
            return r0
        L_0x0034:
            java.util.Iterator r0 = A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251693nW.A00():java.util.Iterator");
    }

    public C251693nW(File file) {
        this.A00 = file;
    }
}
