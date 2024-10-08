package com.fasterxml.jackson.databind.ser.impl;

import X.17Z;
import X.C269504fE;
import X.Pxi;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.List;

@JacksonStdImpl
public final class IndexedListSerializer extends AsArraySerializerBase {
    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        Boolean bool;
        List list = (List) obj;
        int size = list.size();
        if (size != 1 || (((bool = this.A05) != null || !Pxi.A1U(r5)) && bool != Boolean.TRUE)) {
            r4.A0p(list, size);
            A0E(r4, r5, list);
            r4.A0Y();
            return;
        }
        A0E(r4, r5, list);
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return ((List) obj).isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r4 != r0) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ad, code lost:
        if (r4 != r0) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.17Z r9, X.C269504fE r10, java.util.List r11) {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.JsonSerializer r3 = r8.A03
            if (r3 == 0) goto L_0x0025
            int r2 = r11.size()
            if (r2 == 0) goto L_0x00d0
            X.SPK r1 = r8.A04
            r5 = 0
        L_0x000d:
            if (r5 >= r2) goto L_0x00d0
            java.lang.Object r0 = r11.get(r5)
            if (r0 != 0) goto L_0x0019
            r10.A0T(r9)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x0022
        L_0x0019:
            if (r1 != 0) goto L_0x001f
            r3.A0A(r9, r10, r0)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x0022
        L_0x001f:
            r3.A09(r9, r10, r1, r0)     // Catch:{ Exception -> 0x00c7 }
        L_0x0022:
            int r5 = r5 + 1
            goto L_0x000d
        L_0x0025:
            X.SPK r7 = r8.A04
            int r6 = r11.size()
            if (r7 == 0) goto L_0x007a
            if (r6 == 0) goto L_0x00d0
            r5 = 0
            X.SIF r4 = r8.A00     // Catch:{ Exception -> 0x00c7 }
        L_0x0032:
            if (r5 >= r6) goto L_0x00d0
            java.lang.Object r3 = r11.get(r5)     // Catch:{ Exception -> 0x00c7 }
            if (r3 != 0) goto L_0x003e
            r10.A0T(r9)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x0077
        L_0x003e:
            java.lang.Class r2 = r3.getClass()     // Catch:{ Exception -> 0x00c7 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.A00(r2)     // Catch:{ Exception -> 0x00c7 }
            if (r1 != 0) goto L_0x0066
            X.4eF r1 = r8.A02     // Catch:{ Exception -> 0x00c7 }
            boolean r0 = r1.A0J()     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x006a
            X.4eF r2 = r10.A0A(r1, r2)     // Catch:{ Exception -> 0x00c7 }
            X.TjO r0 = r8.A01     // Catch:{ Exception -> 0x00c7 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0B(r0, r2)     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class r0 = r2.A00     // Catch:{ Exception -> 0x00c7 }
            X.SIF r0 = r4.A01(r1, r0)     // Catch:{ Exception -> 0x00c7 }
            if (r4 == r0) goto L_0x0064
        L_0x0062:
            r8.A00 = r0     // Catch:{ Exception -> 0x00c7 }
        L_0x0064:
            X.SIF r4 = r8.A00     // Catch:{ Exception -> 0x00c7 }
        L_0x0066:
            r1.A09(r9, r10, r7, r3)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x0077
        L_0x006a:
            X.TjO r0 = r8.A01     // Catch:{ Exception -> 0x00c7 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)     // Catch:{ Exception -> 0x00c7 }
            X.SIF r0 = r4.A01(r1, r2)     // Catch:{ Exception -> 0x00c7 }
            if (r4 == r0) goto L_0x0064
            goto L_0x0062
        L_0x0077:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x007a:
            if (r6 == 0) goto L_0x00d0
            r5 = 0
            X.SIF r4 = r8.A00     // Catch:{ Exception -> 0x00c7 }
        L_0x007f:
            if (r5 >= r6) goto L_0x00d0
            java.lang.Object r3 = r11.get(r5)     // Catch:{ Exception -> 0x00c7 }
            if (r3 != 0) goto L_0x008b
            r10.A0T(r9)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00c4
        L_0x008b:
            java.lang.Class r2 = r3.getClass()     // Catch:{ Exception -> 0x00c7 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.A00(r2)     // Catch:{ Exception -> 0x00c7 }
            if (r1 != 0) goto L_0x00b3
            X.4eF r1 = r8.A02     // Catch:{ Exception -> 0x00c7 }
            boolean r0 = r1.A0J()     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00b7
            X.4eF r2 = r10.A0A(r1, r2)     // Catch:{ Exception -> 0x00c7 }
            X.TjO r0 = r8.A01     // Catch:{ Exception -> 0x00c7 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0B(r0, r2)     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class r0 = r2.A00     // Catch:{ Exception -> 0x00c7 }
            X.SIF r0 = r4.A01(r1, r0)     // Catch:{ Exception -> 0x00c7 }
            if (r4 == r0) goto L_0x00b1
        L_0x00af:
            r8.A00 = r0     // Catch:{ Exception -> 0x00c7 }
        L_0x00b1:
            X.SIF r4 = r8.A00     // Catch:{ Exception -> 0x00c7 }
        L_0x00b3:
            r1.A0A(r9, r10, r3)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00c4
        L_0x00b7:
            X.TjO r0 = r8.A01     // Catch:{ Exception -> 0x00c7 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)     // Catch:{ Exception -> 0x00c7 }
            X.SIF r0 = r4.A01(r1, r2)     // Catch:{ Exception -> 0x00c7 }
            if (r4 == r0) goto L_0x00b1
            goto L_0x00af
        L_0x00c4:
            int r5 = r5 + 1
            goto L_0x007f
        L_0x00c7:
            r0 = move-exception
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(r10, r11, r0, r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer.A0E(X.17Z, X.4fE, java.util.List):void");
    }
}
