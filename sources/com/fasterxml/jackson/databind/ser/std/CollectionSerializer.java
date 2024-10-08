package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C269504fE;
import X.Pxi;
import java.util.Collection;

public class CollectionSerializer extends AsArraySerializerBase {
    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        Boolean bool;
        Collection collection = (Collection) obj;
        int size = collection.size();
        if (size != 1 || (((bool = this.A05) != null || !Pxi.A1U(r5)) && bool != Boolean.TRUE)) {
            r4.A0p(collection, size);
            A0E(r4, r5, collection);
            r4.A0Y();
            return;
        }
        A0E(r4, r5, collection);
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return ((Collection) obj).isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r6 != r0) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.17Z r9, X.C269504fE r10, java.util.Collection r11) {
        /*
            r8 = this;
            r9.A0F(r11)
            com.fasterxml.jackson.databind.JsonSerializer r3 = r8.A03
            if (r3 == 0) goto L_0x0028
            java.util.Iterator r2 = r11.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0040
            X.SPK r1 = r8.A04
            r5 = 0
        L_0x0014:
            java.lang.Object r0 = r2.next()
            if (r0 != 0) goto L_0x001e
            r10.A0T(r9)     // Catch:{ Exception -> 0x0094 }
            goto L_0x0038
        L_0x001e:
            if (r1 != 0) goto L_0x0024
            r3.A0A(r9, r10, r0)     // Catch:{ Exception -> 0x0094 }
            goto L_0x0038
        L_0x0024:
            r3.A09(r9, r10, r1, r0)     // Catch:{ Exception -> 0x0094 }
            goto L_0x0038
        L_0x0028:
            java.util.Iterator r7 = r11.iterator()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0040
            X.SIF r6 = r8.A00
            X.SPK r4 = r8.A04
            r5 = 0
            goto L_0x0041
        L_0x0038:
            int r5 = r5 + 1
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L_0x0014
        L_0x0040:
            return
        L_0x0041:
            java.lang.Object r3 = r7.next()     // Catch:{ Exception -> 0x0094 }
            if (r3 != 0) goto L_0x0053
            r10.A0T(r9)     // Catch:{ Exception -> 0x0094 }
        L_0x004a:
            int r5 = r5 + 1
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x0094 }
            if (r0 != 0) goto L_0x0041
            goto L_0x0093
        L_0x0053:
            java.lang.Class r2 = r3.getClass()     // Catch:{ Exception -> 0x0094 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r6.A00(r2)     // Catch:{ Exception -> 0x0094 }
            if (r1 != 0) goto L_0x0089
            X.4eF r1 = r8.A02     // Catch:{ Exception -> 0x0094 }
            boolean r0 = r1.A0J()     // Catch:{ Exception -> 0x0094 }
            if (r0 == 0) goto L_0x007c
            X.4eF r2 = r10.A0A(r1, r2)     // Catch:{ Exception -> 0x0094 }
            X.TjO r0 = r8.A01     // Catch:{ Exception -> 0x0094 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0B(r0, r2)     // Catch:{ Exception -> 0x0094 }
            java.lang.Class r0 = r2.A00     // Catch:{ Exception -> 0x0094 }
            X.SIF r0 = r6.A01(r1, r0)     // Catch:{ Exception -> 0x0094 }
            if (r6 == r0) goto L_0x0079
        L_0x0077:
            r8.A00 = r0     // Catch:{ Exception -> 0x0094 }
        L_0x0079:
            X.SIF r6 = r8.A00     // Catch:{ Exception -> 0x0094 }
            goto L_0x0089
        L_0x007c:
            X.TjO r0 = r8.A01     // Catch:{ Exception -> 0x0094 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)     // Catch:{ Exception -> 0x0094 }
            X.SIF r0 = r6.A01(r1, r2)     // Catch:{ Exception -> 0x0094 }
            if (r6 == r0) goto L_0x0079
            goto L_0x0077
        L_0x0089:
            if (r4 != 0) goto L_0x008f
            r1.A0A(r9, r10, r3)     // Catch:{ Exception -> 0x0094 }
            goto L_0x004a
        L_0x008f:
            r1.A09(r9, r10, r4, r3)     // Catch:{ Exception -> 0x0094 }
            goto L_0x004a
        L_0x0093:
            return
        L_0x0094:
            r0 = move-exception
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(r10, r11, r0, r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.CollectionSerializer.A0E(X.17Z, X.4fE, java.util.Collection):void");
    }
}
