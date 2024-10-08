package X;

import android.content.Context;

public final class T88 implements AnonymousClass5IX {
    public final Context A00;
    public final boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (1 != r0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E1z(X.AnonymousClass5IY r4) {
        /*
            r3 = this;
            android.content.Context r1 = r3.A00
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            r0 = 326(0x146, float:4.57E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            r2 = 1
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.isConnected()
            if (r0 != r2) goto L_0x0027
            int r0 = r1.getType()
            r1 = 1
            if (r2 == r0) goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            boolean r0 = r3.A01
            if (r0 == r1) goto L_0x002d
            r2 = 0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T88.E1z(X.5IY):boolean");
    }

    public T88(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }
}
