package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.AnonymousClass7TF;
import X.C13901TjO;
import X.C268894eF;
import X.C269504fE;
import X.C269714fZ;
import X.C8245Qkz;
import X.Pxi;
import X.SIF;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class ObjectArraySerializer extends ArraySerializerBase implements C269714fZ {
    public JsonSerializer A00;
    public SIF A01 = C8245Qkz.A00;
    public final C268894eF A02;
    public final SPK A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r3 != r0) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0081, code lost:
        r1 = r10.A0G(r8.A00, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.17Z r9, X.C269504fE r10, java.lang.Object[] r11) {
        /*
            r8 = this;
            int r6 = r11.length
            if (r6 == 0) goto L_0x00a0
            com.fasterxml.jackson.databind.JsonSerializer r1 = r8.A00
            if (r1 == 0) goto L_0x0021
            X.SPK r0 = r8.A03
            r5 = 0
            r4 = 0
        L_0x000b:
            r4 = r11[r5]     // Catch:{ Exception -> 0x0097 }
            if (r4 != 0) goto L_0x0013
            r10.A0T(r9)     // Catch:{ Exception -> 0x0097 }
            goto L_0x001c
        L_0x0013:
            if (r0 != 0) goto L_0x0019
            r1.A0A(r9, r10, r4)     // Catch:{ Exception -> 0x0097 }
            goto L_0x001c
        L_0x0019:
            r1.A09(r9, r10, r0, r4)     // Catch:{ Exception -> 0x0097 }
        L_0x001c:
            int r5 = r5 + 1
            if (r5 >= r6) goto L_0x00a0
            goto L_0x000b
        L_0x0021:
            X.SPK r7 = r8.A03
            r5 = 0
            r4 = 0
            if (r7 != 0) goto L_0x006d
            X.SIF r3 = r8.A01     // Catch:{ Exception -> 0x0097 }
        L_0x0029:
            r4 = r11[r5]     // Catch:{ Exception -> 0x0097 }
            if (r4 != 0) goto L_0x0031
            r10.A0T(r9)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0068
        L_0x0031:
            java.lang.Class r2 = r4.getClass()     // Catch:{ Exception -> 0x0097 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A00(r2)     // Catch:{ Exception -> 0x0097 }
            if (r1 != 0) goto L_0x0057
            X.4eF r1 = r8.A02     // Catch:{ Exception -> 0x0097 }
            boolean r0 = r1.A0J()     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x005b
            X.4eF r2 = r10.A0A(r1, r2)     // Catch:{ Exception -> 0x0097 }
            X.TjO r0 = r8.A00     // Catch:{ Exception -> 0x0097 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0B(r0, r2)     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r0 = r2.A00     // Catch:{ Exception -> 0x0097 }
            X.SIF r0 = r3.A01(r1, r0)     // Catch:{ Exception -> 0x0097 }
            if (r3 == r0) goto L_0x0057
        L_0x0055:
            r8.A01 = r0     // Catch:{ Exception -> 0x0097 }
        L_0x0057:
            r1.A0A(r9, r10, r4)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0068
        L_0x005b:
            X.TjO r0 = r8.A00     // Catch:{ Exception -> 0x0097 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)     // Catch:{ Exception -> 0x0097 }
            X.SIF r0 = r3.A01(r1, r2)     // Catch:{ Exception -> 0x0097 }
            if (r3 == r0) goto L_0x0057
            goto L_0x0055
        L_0x0068:
            int r5 = r5 + 1
            if (r5 >= r6) goto L_0x00a0
            goto L_0x0029
        L_0x006d:
            X.SIF r3 = r8.A01     // Catch:{ Exception -> 0x0097 }
        L_0x006f:
            r4 = r11[r5]     // Catch:{ Exception -> 0x0097 }
            if (r4 != 0) goto L_0x0077
            r10.A0T(r9)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0092
        L_0x0077:
            java.lang.Class r2 = r4.getClass()     // Catch:{ Exception -> 0x0097 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A00(r2)     // Catch:{ Exception -> 0x0097 }
            if (r1 != 0) goto L_0x008f
            X.TjO r0 = r8.A00     // Catch:{ Exception -> 0x0097 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)     // Catch:{ Exception -> 0x0097 }
            X.SIF r0 = r3.A01(r1, r2)     // Catch:{ Exception -> 0x0097 }
            if (r3 == r0) goto L_0x008f
            r8.A01 = r0     // Catch:{ Exception -> 0x0097 }
        L_0x008f:
            r1.A09(r9, r10, r7, r4)     // Catch:{ Exception -> 0x0097 }
        L_0x0092:
            int r5 = r5 + 1
            if (r5 >= r6) goto L_0x00a0
            goto L_0x006f
        L_0x0097:
            r0 = move-exception
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(r10, r4, r0, r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.A0E(X.17Z, X.4fE, java.lang.Object[]):void");
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        Boolean bool;
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 1 || (((bool = this.A01) != null || !Pxi.A1U(r5)) && bool != Boolean.TRUE)) {
            r4.A0p(objArr, length);
            A0E(r4, r5, objArr);
            r4.A0Y();
            return;
        }
        A0E(r4, r5, objArr);
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return AnonymousClass7TF.A1Q(((Object[]) obj).length);
    }

    public ObjectArraySerializer(C13901TjO tjO, JsonSerializer jsonSerializer, SPK spk, ObjectArraySerializer objectArraySerializer, Boolean bool) {
        super(tjO, objectArraySerializer, bool);
        this.A02 = objectArraySerializer.A02;
        this.A03 = spk;
        this.A04 = objectArraySerializer.A04;
        this.A00 = jsonSerializer;
    }

    public ObjectArraySerializer(C268894eF r2, JsonSerializer jsonSerializer, SPK spk, boolean z) {
        super(Object[].class);
        this.A02 = r2;
        this.A04 = z;
        this.A03 = spk;
        this.A00 = jsonSerializer;
    }
}
