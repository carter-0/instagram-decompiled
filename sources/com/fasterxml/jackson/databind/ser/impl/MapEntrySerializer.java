package com.fasterxml.jackson.databind.ser.impl;

import X.16L;
import X.17Z;
import X.C10798RyK;
import X.C13901TjO;
import X.C268894eF;
import X.C269204ek;
import X.C269504fE;
import X.C269714fZ;
import X.C8245Qkz;
import X.SIF;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Map;

@JacksonStdImpl
public class MapEntrySerializer extends ContainerSerializer implements C269714fZ {
    public static final Object A0B = C269204ek.NON_EMPTY;
    public JsonSerializer A00;
    public JsonSerializer A01;
    public SIF A02;
    public final C13901TjO A03;
    public final C268894eF A04;
    public final SPK A05;
    public final Object A06;
    public final boolean A07;
    public final C268894eF A08;
    public final C268894eF A09;
    public final boolean A0A;

    public MapEntrySerializer(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, MapEntrySerializer mapEntrySerializer, Object obj, boolean z) {
        super(Map.class, false);
        this.A08 = mapEntrySerializer.A08;
        this.A09 = mapEntrySerializer.A09;
        this.A04 = mapEntrySerializer.A04;
        this.A0A = mapEntrySerializer.A0A;
        this.A05 = mapEntrySerializer.A05;
        this.A00 = jsonSerializer;
        this.A01 = jsonSerializer2;
        this.A02 = C8245Qkz.A00;
        this.A03 = mapEntrySerializer.A03;
        this.A06 = obj;
        this.A07 = z;
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        r2.A0F(entry);
        C10798RyK A002 = SPK.A00(r2, 16L.A0D, spk, entry);
        A0E(r2, r3, entry);
        spk.A04(r2, A002);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r1, C269504fE r2, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        r1.A0o(entry);
        A0E(r1, r2, entry);
        r1.A0Z();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r3 = r5.getClass();
        r2 = r6.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A0B(X.C269504fE r7, java.lang.Object r8) {
        /*
            r6 = this;
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r5 = r8.getValue()
            if (r5 != 0) goto L_0x000b
            boolean r0 = r6.A07
            return r0
        L_0x000b:
            java.lang.Object r4 = r6.A06
            if (r4 != 0) goto L_0x0011
            r0 = 0
            return r0
        L_0x0011:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r6.A01
            if (r1 != 0) goto L_0x0032
            java.lang.Class r3 = r5.getClass()
            X.SIF r2 = r6.A02
            com.fasterxml.jackson.databind.JsonSerializer r1 = r2.A00(r3)
            if (r1 != 0) goto L_0x0032
            X.TjO r0 = r6.A03     // Catch:{ 4iD -> 0x0030 }
            com.fasterxml.jackson.databind.JsonSerializer r1 = r7.A0G(r0, r3)     // Catch:{ 4iD -> 0x0030 }
            X.SIF r0 = r2.A01(r1, r3)     // Catch:{ 4iD -> 0x0030 }
            if (r2 == r0) goto L_0x0032
            r6.A02 = r0     // Catch:{ 4iD -> 0x0030 }
            goto L_0x0032
        L_0x0030:
            r0 = 0
            return r0
        L_0x0032:
            java.lang.Object r0 = A0B
            if (r4 != r0) goto L_0x003b
            boolean r0 = r1.A0B(r7, r5)
            return r0
        L_0x003b:
            boolean r0 = r4.equals(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.A0B(X.4fE, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r8 = r4.getClass();
        r7 = r9.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.17Z r10, X.C269504fE r11, java.util.Map.Entry r12) {
        /*
            r9 = this;
            X.SPK r6 = r9.A05
            java.lang.Object r3 = r12.getKey()
            if (r3 != 0) goto L_0x0069
            com.fasterxml.jackson.databind.JsonSerializer r5 = r11.A00
        L_0x000a:
            java.lang.Object r4 = r12.getValue()
            if (r4 != 0) goto L_0x001c
            boolean r0 = r9.A07
            if (r0 != 0) goto L_0x0088
            com.fasterxml.jackson.databind.JsonSerializer r2 = r11.A01
        L_0x0016:
            r5.A0A(r10, r11, r3)
            if (r6 != 0) goto L_0x0070
            goto L_0x006c
        L_0x001c:
            com.fasterxml.jackson.databind.JsonSerializer r2 = r9.A01
            if (r2 != 0) goto L_0x0048
            java.lang.Class r8 = r4.getClass()
            X.SIF r7 = r9.A02
            com.fasterxml.jackson.databind.JsonSerializer r2 = r7.A00(r8)
            if (r2 != 0) goto L_0x0048
            X.4eF r1 = r9.A04
            boolean r0 = r1.A0J()
            if (r0 == 0) goto L_0x0057
            X.4eF r1 = r11.A0A(r1, r8)
            X.TjO r0 = r9.A03
            com.fasterxml.jackson.databind.JsonSerializer r2 = r11.A0B(r0, r1)
            java.lang.Class r0 = r1.A00
            X.SIF r0 = r7.A01(r2, r0)
        L_0x0044:
            if (r7 == r0) goto L_0x0048
            r9.A02 = r0
        L_0x0048:
            java.lang.Object r1 = r9.A06
            if (r1 == 0) goto L_0x0016
            java.lang.Object r0 = A0B
            if (r1 != r0) goto L_0x0062
            boolean r0 = r2.A0B(r11, r4)
            if (r0 == 0) goto L_0x0062
            return
        L_0x0057:
            X.TjO r0 = r9.A03
            com.fasterxml.jackson.databind.JsonSerializer r2 = r11.A0G(r0, r8)
            X.SIF r0 = r7.A01(r2, r8)
            goto L_0x0044
        L_0x0062:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x0016
            return
        L_0x0069:
            com.fasterxml.jackson.databind.JsonSerializer r5 = r9.A00
            goto L_0x000a
        L_0x006c:
            r2.A0A(r10, r11, r4)     // Catch:{ Exception -> 0x0074 }
            return
        L_0x0070:
            r2.A09(r10, r11, r6, r4)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0087
        L_0x0074:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A01(r11, r12, r0, r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0087:
            return
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.A0E(X.17Z, X.4fE, java.util.Map$Entry):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r0 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        if (r1 == 1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008a, code lost:
        if (r10.A04.A02() != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r11, X.C269504fE r12) {
        /*
            r10 = this;
            X.4et r2 = r12.A05
            X.4eA r3 = r2.A01()
            r8 = 0
            r7 = r10
            if (r11 == 0) goto L_0x00a0
            X.QkH r1 = r11.BRS()
            if (r1 == 0) goto L_0x00a0
            if (r3 == 0) goto L_0x00a0
            java.lang.Object r0 = r3.A0c(r1)
            if (r0 == 0) goto L_0x009d
            com.fasterxml.jackson.databind.JsonSerializer r4 = r12.A0M(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r3.A0X(r1)
            if (r0 == 0) goto L_0x0028
            com.fasterxml.jackson.databind.JsonSerializer r0 = r12.A0M(r1, r0)
            if (r0 != 0) goto L_0x002a
        L_0x0028:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r10.A01
        L_0x002a:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r10.A0C(r11, r0, r12)
            if (r6 != 0) goto L_0x0040
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x0040
            X.4eF r3 = r10.A04
            java.lang.Class r1 = r3.A00
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L_0x0040
            com.fasterxml.jackson.databind.JsonSerializer r6 = r12.A0B(r11, r3)
        L_0x0040:
            if (r4 != 0) goto L_0x0098
            com.fasterxml.jackson.databind.JsonSerializer r4 = r10.A00
            if (r4 != 0) goto L_0x0098
            X.4eF r0 = r10.A09
            com.fasterxml.jackson.databind.JsonSerializer r5 = r12.A0C(r11, r0)
        L_0x004c:
            java.lang.Object r4 = r10.A06
            boolean r9 = r10.A07
            r3 = 4
            if (r11 == 0) goto L_0x0096
            X.4ej r2 = r11.AVP(r2, r8)
            X.4ek r1 = r2.A00
            X.4ek r0 = X.C269204ek.USE_DEFAULTS
            if (r1 == r0) goto L_0x0096
            int r1 = r1.ordinal()
            if (r1 == r3) goto L_0x008f
            r0 = 2
            if (r1 == r0) goto L_0x0084
            r0 = 3
            if (r1 == r0) goto L_0x008c
            r0 = 5
            if (r1 == r0) goto L_0x0077
            r0 = 1
            r9 = 0
            if (r1 != r0) goto L_0x0071
        L_0x0070:
            r9 = 1
        L_0x0071:
            com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer r4 = new com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0077:
            java.lang.Class r0 = r2.A02
            java.lang.Object r8 = r12.A0R(r0)
            if (r8 == 0) goto L_0x0070
            boolean r9 = r12.A0V(r8)
            goto L_0x0071
        L_0x0084:
            X.4eF r0 = r10.A04
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0070
        L_0x008c:
            java.lang.Object r8 = A0B
            goto L_0x0070
        L_0x008f:
            X.4eF r0 = r10.A04
            java.lang.Object r8 = X.SQ6.A00(r0)
            goto L_0x0070
        L_0x0096:
            r8 = r4
            goto L_0x0071
        L_0x0098:
            com.fasterxml.jackson.databind.JsonSerializer r5 = r12.A0F(r11, r4)
            goto L_0x004c
        L_0x009d:
            r4 = r8
            goto L_0x001c
        L_0x00a0:
            r4 = r8
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public MapEntrySerializer(C13901TjO tjO, C268894eF r3, C268894eF r4, C268894eF r5, SPK spk, boolean z) {
        super(r3);
        this.A08 = r3;
        this.A09 = r4;
        this.A04 = r5;
        this.A0A = z;
        this.A05 = spk;
        this.A03 = tjO;
        this.A02 = C8245Qkz.A00;
        this.A06 = null;
        this.A07 = false;
    }
}
