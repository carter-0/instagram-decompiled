package X;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: X.3nB  reason: invalid class name and case insensitive filesystem */
public final class C251483nB {
    public final Context A00;
    public final SparseArray A01 = new SparseArray(2);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.3nG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.3nG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.3nG} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(X.C251493nC r9, X.C251513nE r10, X.C251483nB r11) {
        /*
            monitor-enter(r11)
            r8 = r9
            int r3 = r9.A00     // Catch:{ all -> 0x0081 }
            X.3nH r9 = new X.3nH     // Catch:{ all -> 0x0081 }
            r9.<init>(r10, r11, r3)     // Catch:{ all -> 0x0081 }
            android.content.Context r6 = r11.A00     // Catch:{ all -> 0x007f }
            X.1ss r2 = X.1ss.A00(r6)     // Catch:{ all -> 0x007f }
            X.1uw r1 = r8.A01     // Catch:{ all -> 0x007f }
            java.lang.String r0 = r1.A09     // Catch:{ all -> 0x007f }
            X.1qQ r5 = r2.A04(r0)     // Catch:{ all -> 0x007f }
            android.util.SparseArray r4 = r11.A01     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r4.get(r3)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r4.get(r3)     // Catch:{ all -> 0x007a }
            X.3nG r0 = (X.C251533nG) r0     // Catch:{ all -> 0x007a }
            X.3nJ r0 = r0.A00     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = "Trying to create a new handler when one already exists for jobId: "
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x007a }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x007a }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007a }
            r0.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r0     // Catch:{ all -> 0x007a }
        L_0x0039:
            java.lang.Integer r2 = r1.A03     // Catch:{ all -> 0x007a }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x007a }
            r1 = 19
            if (r2 != r0) goto L_0x0043
            r1 = 18
        L_0x0043:
            java.lang.String r0 = "UploadJobHandlerManager-"
            java.lang.String r0 = X.002.A0O(r0, r3)     // Catch:{ all -> 0x007a }
            android.os.HandlerThread r7 = r5.ALR(r0, r1)     // Catch:{ all -> 0x007a }
            boolean r10 = r5.E62()     // Catch:{ all -> 0x007a }
            X.3nJ r5 = new X.3nJ     // Catch:{ all -> 0x007a }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r4.get(r3)     // Catch:{ all -> 0x007a }
            X.3nG r0 = (X.C251533nG) r0     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0066
            X.3nG r0 = new X.3nG     // Catch:{ all -> 0x007a }
            r0.<init>()     // Catch:{ all -> 0x007a }
            r4.put(r3, r0)     // Catch:{ all -> 0x007a }
        L_0x0066:
            r0.A00 = r5     // Catch:{ all -> 0x007a }
            monitor-enter(r5)     // Catch:{ all -> 0x007f }
            boolean r0 = r5.A04     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0077
            r0 = 1
            r5.A04 = r0     // Catch:{ all -> 0x007c }
            android.os.Message r0 = r5.obtainMessage(r0)     // Catch:{ all -> 0x007c }
            r5.sendMessage(r0)     // Catch:{ all -> 0x007c }
        L_0x0077:
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            monitor-exit(r11)
            return
        L_0x007a:
            r0 = move-exception
            goto L_0x007e
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
        L_0x007e:
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251483nB.A00(X.3nC, X.3nE, X.3nB):void");
    }

    public C251483nB(Context context) {
        this.A00 = context;
    }
}
