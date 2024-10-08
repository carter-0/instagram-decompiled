package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.S1p  reason: case insensitive filesystem */
public final class C10936S1p {
    public final Context A00;
    public final AnonymousClass3RB A01 = AnonymousClass3RB.A02;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.T9D A00(java.lang.Class r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = 0
            r1 = 0
        L_0x0002:
            int r2 = r1 + 1
            r0 = 3
            if (r1 >= r0) goto L_0x0028
            java.util.concurrent.ConcurrentHashMap r1 = r4.A02
            java.lang.Object r3 = r1.get(r5)
            if (r3 != 0) goto L_0x0024
            android.content.Context r0 = r4.A00
            java.lang.Object r3 = r0.getSystemService(r6)     // Catch:{ Exception -> 0x001e }
            if (r3 == 0) goto L_0x001e
            boolean r0 = r5.isInstance(r3)     // Catch:{ Exception -> 0x001e }
            if (r0 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 == 0) goto L_0x0024
            r1.putIfAbsent(r5, r3)
        L_0x0024:
            r1 = r2
            if (r3 != 0) goto L_0x0037
            goto L_0x0002
        L_0x0028:
            java.lang.String r0 = r5.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "SystemServiceManager"
            java.lang.String r0 = "Cannot get system service after MAX_RETRIES: %s"
            X.0KC.A0P(r1, r0, r2)
        L_0x0037:
            if (r3 != 0) goto L_0x003c
            X.Qbk r0 = X.C7860Qbk.A00
            return r0
        L_0x003c:
            X.Qbl r0 = new X.Qbl
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10936S1p.A00(java.lang.Class, java.lang.String):X.T9D");
    }

    public C10936S1p(Context context) {
        this.A00 = context;
    }
}
