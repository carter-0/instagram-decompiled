package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;

/* renamed from: X.Qkn  reason: case insensitive filesystem */
public final class C8240Qkn extends C8244Qkx implements Serializable {
    public final C8244Qkx A00;
    public final Class[] A01;

    public C8240Qkn(C8244Qkx qkx, Class[] clsArr) {
        super(qkx.A04, qkx);
        this.A00 = qkx;
        this.A01 = clsArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.17Z r6, X.C269504fE r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.Class r4 = r7.A07
            if (r4 == 0) goto L_0x0015
            java.lang.Class[] r3 = r5.A01
            int r2 = r3.length
            r1 = 0
        L_0x0008:
            if (r1 >= r2) goto L_0x0017
            r0 = r3[r1]
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 != 0) goto L_0x0015
            int r1 = r1 + 1
            goto L_0x0008
        L_0x0015:
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            X.Qkx r0 = r5.A00
            if (r1 == 0) goto L_0x0020
            r0.A02(r6, r7, r8)
            return
        L_0x0020:
            X.16H r0 = X.17Z.A01
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8240Qkn.A02(X.17Z, X.4fE, java.lang.Object):void");
    }

    public final void A04(JsonSerializer jsonSerializer) {
        this.A00.A04(jsonSerializer);
    }
}
