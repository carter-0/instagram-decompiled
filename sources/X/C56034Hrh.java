package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.Hrh  reason: case insensitive filesystem */
public final class C56034Hrh {
    public final Uri A00;
    public final 1U1 A01;
    public final Object A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r1.equals(r0) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0046
            r2 = 0
            if (r5 == 0) goto L_0x0022
            boolean r0 = r5 instanceof X.C56034Hrh
            if (r0 == 0) goto L_0x0022
            X.Hrh r5 = (X.C56034Hrh) r5
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r4.A02
            java.lang.Object r0 = r5.A02
            if (r1 == 0) goto L_0x0023
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0026
        L_0x0022:
            return r2
        L_0x0023:
            if (r0 == 0) goto L_0x0026
            return r2
        L_0x0026:
            android.net.Uri r1 = r4.A00
            android.net.Uri r0 = r5.A00
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0036
            return r2
        L_0x0033:
            if (r0 == 0) goto L_0x0036
            return r2
        L_0x0036:
            X.1U1 r1 = r4.A01
            X.1U1 r0 = r5.A01
            if (r1 == 0) goto L_0x0043
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0046
            return r2
        L_0x0043:
            if (r0 == 0) goto L_0x0046
            return r2
        L_0x0046:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56034Hrh.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, null, this.A00, null, this.A01, null, getClass()});
    }

    public C56034Hrh(Uri uri, 1U1 r2, Object obj, String str) {
        this.A03 = str;
        this.A02 = obj;
        this.A00 = uri;
        this.A01 = r2;
    }
}
