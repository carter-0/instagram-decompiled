package com.fasterxml.jackson.datatype.guava.ser;

import X.16L;
import X.17Z;
import X.AnonymousClass00P;
import X.C10798RyK;
import X.C13901TjO;
import X.C257513xW;
import X.C269504fE;
import X.C269714fZ;
import X.C8245Qkz;
import X.Qly;
import X.SIF;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Set;

public class MultimapSerializer extends ContainerSerializer implements C269714fZ {
    public SIF A00;
    public final C13901TjO A01;
    public final JsonSerializer A02;
    public final JsonSerializer A03;
    public final Object A04;
    public final Set A05;
    public final boolean A06;
    public final SPK A07;
    public final Qly A08;

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r16, X.C269504fE r17) {
        /*
            r15 = this;
            r11 = r15
            com.fasterxml.jackson.databind.JsonSerializer r6 = r15.A03
            r8 = r6
            r7 = r16
            r2 = r17
            if (r6 != 0) goto L_0x00b8
            X.Qly r0 = r15.A08
            X.4eF r1 = r0.A01
            java.lang.Class r0 = r1.A00
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 == 0) goto L_0x001e
            com.fasterxml.jackson.databind.JsonSerializer r6 = r2.A0E(r7, r1)
        L_0x001e:
            X.4et r0 = r2.A05
            X.4eA r4 = r0.A01()
            r5 = 0
            if (r16 != 0) goto L_0x00b2
            r3 = r5
        L_0x0028:
            java.lang.Object r12 = r15.A04
            if (r3 == 0) goto L_0x0046
            if (r4 == 0) goto L_0x0046
            java.lang.Object r0 = r4.A0c(r3)
            if (r0 == 0) goto L_0x0038
            com.fasterxml.jackson.databind.JsonSerializer r5 = r2.A0M(r3, r0)
        L_0x0038:
            java.lang.Object r0 = r4.A0X(r3)
            if (r0 == 0) goto L_0x0042
            com.fasterxml.jackson.databind.JsonSerializer r6 = r2.A0M(r3, r0)
        L_0x0042:
            java.lang.Object r12 = r4.A0a(r3)
        L_0x0046:
            if (r6 != 0) goto L_0x0049
            r6 = r8
        L_0x0049:
            com.fasterxml.jackson.databind.JsonSerializer r9 = r15.A0C(r7, r6, r2)
            if (r9 != 0) goto L_0x00ad
            X.Qly r0 = r15.A08
            X.4eF r1 = r0.A01
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x005b
            com.fasterxml.jackson.databind.JsonSerializer r9 = r2.A0E(r7, r1)
        L_0x005b:
            if (r5 != 0) goto L_0x00a8
            com.fasterxml.jackson.databind.JsonSerializer r5 = r15.A02
            if (r5 != 0) goto L_0x00a8
            X.Qly r0 = r15.A08
            X.4eF r0 = r0.A00
            com.fasterxml.jackson.databind.JsonSerializer r8 = r2.A0C(r7, r0)
        L_0x0069:
            X.SPK r10 = r15.A07
            if (r10 == 0) goto L_0x0071
            X.SPK r10 = r10.A06(r7)
        L_0x0071:
            java.util.Set r13 = r15.A05
            r14 = 0
            if (r4 == 0) goto L_0x00cd
            if (r3 == 0) goto L_0x00cd
            X.T9o r1 = r4.A05(r3)
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x00a5
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0084:
            if (r1 == 0) goto L_0x00c0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00c0
            if (r13 != 0) goto L_0x00a0
            java.util.HashSet r13 = X.AnonymousClass7TE.A1F()
        L_0x0092:
            java.util.Iterator r1 = r1.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c0
            X.JTT.A1U(r13, r1)
            goto L_0x0096
        L_0x00a0:
            java.util.HashSet r13 = X.C66580MXl.A12(r13)
            goto L_0x0092
        L_0x00a5:
            java.util.Set r1 = r1.A00
            goto L_0x0084
        L_0x00a8:
            com.fasterxml.jackson.databind.JsonSerializer r8 = r2.A0F(r7, r5)
            goto L_0x0069
        L_0x00ad:
            com.fasterxml.jackson.databind.JsonSerializer r9 = r2.A0F(r7, r9)
            goto L_0x005b
        L_0x00b2:
            X.QkH r3 = r7.BRS()
            goto L_0x0028
        L_0x00b8:
            boolean r0 = r6 instanceof X.C269714fZ
            com.fasterxml.jackson.databind.JsonSerializer r6 = X.Pxi.A0M(r7, r6, r2, r0)
            goto L_0x001e
        L_0x00c0:
            java.lang.Boolean r0 = r4.A0N(r3)
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00cd
            r14 = 1
        L_0x00cd:
            java.lang.Class r0 = r15.A00
            X.4ev r1 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r7, r2, r0)
            if (r1 == 0) goto L_0x00e1
            X.RDC r0 = X.RDC.WRITE_SORTED_MAP_ENTRIES
            java.lang.Boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x00e1
            boolean r14 = r0.booleanValue()
        L_0x00e1:
            com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer r6 = new com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public MultimapSerializer(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, SPK spk, Qly qly, Object obj, Set set) {
        super(qly.A00, false);
        this.A08 = qly;
        this.A01 = null;
        this.A02 = jsonSerializer;
        this.A07 = spk;
        this.A03 = jsonSerializer2;
        this.A05 = set;
        this.A04 = obj;
        this.A06 = false;
        this.A00 = C8245Qkz.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r2 = r3.getClass();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(X.17Z r9, X.C269504fE r10, X.C257513xW r11) {
        /*
            r8 = this;
            java.util.Set r6 = r8.A05
            X.SIF r5 = r8.A00
            java.util.Map r0 = r11.ACX()
            java.util.Iterator r7 = X.AnonymousClass7TF.A0u(r0)
        L_0x000c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0074
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r7)
            java.lang.Object r1 = r2.getKey()
            if (r6 == 0) goto L_0x0023
            boolean r0 = r6.contains(r1)
            if (r0 == 0) goto L_0x0023
            goto L_0x000c
        L_0x0023:
            if (r1 != 0) goto L_0x006a
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A00
            r0 = 0
            r1.A0A(r9, r10, r0)
        L_0x002b:
            r9.A0b()
            java.util.Collection r0 = X.Pxe.A18(r2)
            java.util.Iterator r4 = r0.iterator()
        L_0x0036:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r3 = r4.next()
            if (r3 != 0) goto L_0x0046
            r10.A0T(r9)
            goto L_0x0036
        L_0x0046:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r8.A03
            if (r1 != 0) goto L_0x0064
            java.lang.Class r2 = r3.getClass()
            com.fasterxml.jackson.databind.JsonSerializer r1 = r5.A00(r2)
            if (r1 != 0) goto L_0x0064
            X.TjO r0 = r8.A01
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)
            X.SIF r0 = r5.A01(r1, r2)
            if (r5 == r0) goto L_0x0062
            r8.A00 = r0
        L_0x0062:
            X.SIF r5 = r8.A00
        L_0x0064:
            X.SPK r0 = r8.A07
            X.Pxi.A1D(r9, r1, r10, r0, r3)
            goto L_0x0036
        L_0x006a:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r8.A02
            r0.A0A(r9, r10, r1)
            goto L_0x002b
        L_0x0070:
            r9.A0Y()
            goto L_0x000c
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer.A03(X.17Z, X.4fE, X.3xW):void");
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r3, C269504fE r4, SPK spk, Object obj) {
        C257513xW r6 = (C257513xW) obj;
        r3.A0F(r6);
        C10798RyK A002 = SPK.A00(r3, 16L.A0D, spk, r6);
        if (!r6.isEmpty()) {
            Object obj2 = this.A04;
            if (obj2 != null) {
                A0D(r4, obj2);
                throw AnonymousClass00P.createAndThrow();
            }
            A03(r3, r4, r6);
        }
        spk.A04(r3, A002);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r2, C269504fE r3, Object obj) {
        C257513xW r4 = (C257513xW) obj;
        r2.A0c();
        r2.A0F(r4);
        if (!r4.isEmpty()) {
            Object obj2 = this.A04;
            if (obj2 != null) {
                A0D(r3, obj2);
                throw AnonymousClass00P.createAndThrow();
            }
            A03(r2, r3, r4);
        }
        r2.A0Z();
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return ((C257513xW) obj).isEmpty();
    }

    public MultimapSerializer(C13901TjO tjO, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, SPK spk, MultimapSerializer multimapSerializer, Object obj, Set set, boolean z) {
        super(multimapSerializer.A00, false);
        this.A08 = multimapSerializer.A08;
        this.A01 = tjO;
        this.A02 = jsonSerializer;
        this.A07 = spk;
        this.A03 = jsonSerializer2;
        this.A00 = multimapSerializer.A00;
        this.A05 = set;
        this.A04 = obj;
        this.A06 = z;
    }
}
