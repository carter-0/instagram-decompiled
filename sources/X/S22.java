package X;

import android.util.Log;
import java.util.Locale;

public final class S22 {
    public final String A00;
    public final String A01;
    public final C10268RpS A02;

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0015 A[LOOP:0: B:4:0x0015->B:7:0x0020, LOOP_START, PHI: r1 
      PHI: (r1v3 int) = (r1v2 int), (r1v4 int) binds: [B:3:0x0005, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S22(java.lang.String r5, java.lang.String... r6) {
        /*
            r4 = this;
            int r0 = r6.length
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = ""
        L_0x0005:
            r4.<init>()
            r4.A01 = r0
            r4.A00 = r5
            r1 = 0
            X.RpS r0 = new X.RpS
            r0.<init>(r5, r1)
            r4.A02 = r0
            r1 = 2
        L_0x0015:
            java.lang.String r0 = r4.A00
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 != 0) goto L_0x0045
            int r1 = r1 + 1
            r0 = 7
            if (r1 > r0) goto L_0x0045
            goto L_0x0015
        L_0x0023:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            r0 = 91
            r3.append(r0)
            r0 = 0
            r2 = r6[r0]
            int r1 = r3.length()
            r0 = 1
            if (r1 <= r0) goto L_0x003b
            java.lang.String r0 = ","
            r3.append(r0)
        L_0x003b:
            r3.append(r2)
            java.lang.String r0 = "] "
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r3)
            goto L_0x0005
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S22.<init>(java.lang.String, java.lang.String[]):void");
    }

    public final void A00(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        Log.w("Auth", this.A01.concat(str));
    }
}
