package X;

import android.content.Context;

/* renamed from: X.Oq9  reason: case insensitive filesystem */
public final class C71747Oq9 implements C74436Pur {
    public final Context A00;
    public final 1vo A01;
    public final 1vl A02;

    public final String BdN() {
        return "token_ack";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r0.longValue() != 52) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E4V(X.N31 r9) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            com.facebook.pushlite.model.PushInfraMetaData r0 = r9.A04     // Catch:{ all -> 0x002c }
            java.lang.String r7 = r0.A08     // Catch:{ all -> 0x002c }
            X.1vo r6 = r8.A01     // Catch:{ all -> 0x002c }
            if (r6 == 0) goto L_0x002c
            X.1vl r5 = r8.A02     // Catch:{ all -> 0x002c }
            if (r5 == 0) goto L_0x002c
            if (r7 == 0) goto L_0x002c
            java.lang.Long r0 = r0.A00     // Catch:{ all -> 0x002c }
            r3 = 52
            if (r0 == 0) goto L_0x0021
            long r1 = r0.longValue()     // Catch:{ all -> 0x002c }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            android.content.Context r1 = r8.A00     // Catch:{ all -> 0x002c }
            X.MZy r0 = new X.MZy     // Catch:{ all -> 0x002c }
            r0.<init>(r1, r6, r5)     // Catch:{ all -> 0x002c }
            r0.A00(r7, r2)     // Catch:{ all -> 0x002c }
        L_0x002c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71747Oq9.E4V(X.N31):java.lang.Object");
    }

    public final boolean Esm(N31 n31) {
        0qQ.A0B(n31, 0);
        if (this.A01 == null || this.A02 == null || n31.A04.A08 == null) {
            return false;
        }
        return true;
    }

    public C71747Oq9(Context context, 1vo r2, 1vl r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }
}
