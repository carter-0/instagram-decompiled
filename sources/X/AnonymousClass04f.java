package X;

import android.os.Build;

/* renamed from: X.04f  reason: invalid class name */
public final class AnonymousClass04f {
    public final AnonymousClass04g A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.0kv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.0kv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.0kv} */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.04g, X.0uQ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass04f(X.04k r3) {
        /*
            r2 = this;
            r2.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x0011
            X.0kv r1 = new X.0kv
            r1.<init>(r3)
        L_0x000e:
            r2.A00 = r1
            return
        L_0x0011:
            r0 = 29
            if (r1 < r0) goto L_0x001b
            X.0uO r1 = new X.0uO
            r1.<init>(r3)
            goto L_0x000e
        L_0x001b:
            X.0uQ r1 = new X.0uQ
            r1.<init>(r3)
            android.view.WindowInsets r0 = r3.A03()
            r1.A00 = r0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04f.<init>(X.04k):void");
    }

    public AnonymousClass04f() {
        AnonymousClass04g r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new C61070kv();
        } else if (i >= 29) {
            r0 = new C62610uO();
        } else {
            r0 = new AnonymousClass0uQ();
        }
        this.A00 = r0;
    }
}
