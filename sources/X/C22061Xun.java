package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Xun  reason: case insensitive filesystem */
public final class C22061Xun implements C22520Y7r {
    public static final List A01 = new ArrayList(50);
    public final Handler A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.Xq5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.Xq5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.Xq5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C21997Xq5 A00() {
        /*
            java.util.List r1 = A01
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0010
            X.Xq5 r0 = new X.Xq5     // Catch:{ all -> 0x001e }
            r0.<init>()     // Catch:{ all -> 0x001e }
        L_0x000e:
            monitor-exit(r1)     // Catch:{ all -> 0x001e }
            goto L_0x001d
        L_0x0010:
            int r0 = r1.size()     // Catch:{ all -> 0x001e }
            int r0 = r0 + -1
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x001e }
            X.Xq5 r0 = (X.C21997Xq5) r0     // Catch:{ all -> 0x001e }
            goto L_0x000e
        L_0x001d:
            return r0
        L_0x001e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22061Xun.A00():X.Xq5");
    }

    public C22061Xun(Handler handler) {
        this.A00 = handler;
    }
}
