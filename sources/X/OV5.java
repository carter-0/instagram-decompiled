package X;

import android.util.LruCache;

public final class OV5 {
    public static final long A01 = AnonymousClass30K.A03(AnonymousClass30J.HOURS, 4);
    public final LruCache A00 = new LruCache(20);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r13.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebookpay.offsite.models.message.OffsiteData A00(java.lang.String r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0009
            int r0 = r13.length()
            r1 = 0
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            r1 = 1
        L_0x000a:
            r0 = 0
            if (r1 != 0) goto L_0x0032
            X.ONC r11 = new X.ONC
            r11.<init>(r13)
            android.util.LruCache r10 = r12.A00
            java.lang.Object r9 = r10.get(r11)
            X.ONO r9 = (X.ONO) r9
            if (r9 == 0) goto L_0x0032
            long r3 = r9.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = A01
            X.30J r1 = X.AnonymousClass30J.MILLISECONDS
            long r1 = X.AnonymousClass30M.A06(r1, r5)
            long r7 = r7 - r1
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0033
            r10.remove(r11)
        L_0x0032:
            return r0
        L_0x0033:
            com.facebookpay.offsite.models.message.OffsiteData r0 = r9.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OV5.A00(java.lang.String):com.facebookpay.offsite.models.message.OffsiteData");
    }
}
