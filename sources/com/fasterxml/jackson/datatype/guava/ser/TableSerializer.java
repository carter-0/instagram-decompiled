package com.fasterxml.jackson.datatype.guava.ser;

import X.16L;
import X.17Z;
import X.AnonymousClass7TE;
import X.C13901TjO;
import X.C268894eF;
import X.C269504fE;
import X.C269714fZ;
import X.Pxi;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.lang.reflect.Modifier;

public class TableSerializer extends ContainerSerializer implements C269714fZ {
    public final C13901TjO A00;
    public final C268894eF A01;
    public final JsonSerializer A02;
    public final JsonSerializer A03;
    public final JsonSerializer A04;
    public final SPK A05;
    public final MapSerializer A06;

    public final /* bridge */ /* synthetic */ void A09(17Z r3, C269504fE r4, SPK spk, Object obj) {
        r3.A0F((Object) null);
        spk.A03(r3, spk.A05(16L.A0D, (Object) null));
        throw AnonymousClass7TE.A11("rowMap");
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r2, C269504fE r3, Object obj) {
        r2.A0o((Object) null);
        throw AnonymousClass7TE.A11("isEmpty");
    }

    public TableSerializer(SPK spk, TableSerializer tableSerializer) {
        super(tableSerializer.A00, false);
        this.A01 = tableSerializer.A01;
        this.A00 = tableSerializer.A00;
        this.A03 = tableSerializer.A03;
        this.A02 = tableSerializer.A02;
        this.A05 = spk;
        this.A04 = tableSerializer.A04;
        this.A06 = tableSerializer.A06;
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        throw AnonymousClass7TE.A11("isEmpty");
    }

    public final JsonSerializer ALi(C13901TjO tjO, C269504fE r10) {
        JsonSerializer A0M;
        JsonSerializer A0M2;
        JsonSerializer jsonSerializer = this.A04;
        C13901TjO tjO2 = tjO;
        if (jsonSerializer == null) {
            C268894eF A0L = Pxi.A0L(this.A01, 2);
            if (Modifier.isFinal(A0L.A00.getModifiers())) {
                jsonSerializer = r10.A0E(tjO, A0L);
            }
        } else {
            jsonSerializer = Pxi.A0M(tjO, jsonSerializer, r10, jsonSerializer instanceof C269714fZ ? 1 : 0);
        }
        JsonSerializer jsonSerializer2 = this.A03;
        if (jsonSerializer2 == null) {
            A0M = r10.A0C(tjO, Pxi.A0L(this.A01, 0));
        } else {
            A0M = Pxi.A0M(tjO, jsonSerializer2, r10, jsonSerializer2 instanceof C269714fZ ? 1 : 0);
        }
        JsonSerializer jsonSerializer3 = this.A02;
        if (jsonSerializer3 == null) {
            A0M2 = r10.A0C(tjO, Pxi.A0L(this.A01, 1));
        } else {
            A0M2 = Pxi.A0M(tjO, jsonSerializer3, r10, jsonSerializer3 instanceof C269714fZ ? 1 : 0);
        }
        SPK spk = this.A05;
        if (spk != null) {
            spk = spk.A06(tjO);
        }
        return new TableSerializer(tjO2, A0M, A0M2, jsonSerializer, spk, r10.A05(), this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TableSerializer(X.C13901TjO r23, com.fasterxml.jackson.databind.JsonSerializer r24, com.fasterxml.jackson.databind.JsonSerializer r25, com.fasterxml.jackson.databind.JsonSerializer r26, X.SPK r27, X.AnonymousClass4eE r28, com.fasterxml.jackson.datatype.guava.ser.TableSerializer r29) {
        /*
            r22 = this;
            r1 = r29
            java.lang.Class r0 = r1.A00
            r13 = 0
            r2 = r22
            r2.<init>(r0, r13)
            X.4eF r4 = r1.A01
            r2.A01 = r4
            r0 = r23
            r2.A00 = r0
            r15 = r24
            r2.A03 = r15
            r7 = r25
            r2.A02 = r7
            r9 = r27
            r2.A05 = r9
            r8 = r26
            r2.A04 = r8
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            r0 = 1
            X.4eF r1 = X.Pxi.A0L(r4, r0)
            r0 = 2
            X.4eF r0 = X.Pxi.A0L(r4, r0)
            r5 = r28
            X.Qlu r6 = r5.A0B(r1, r0, r3)
            r10 = 0
            r11 = r10
            r12 = r10
            com.fasterxml.jackson.databind.ser.std.MapSerializer r16 = com.fasterxml.jackson.databind.ser.std.MapSerializer.A04(r6, r7, r8, r9, r10, r11, r12, r13)
            X.4eF r0 = X.Pxi.A0L(r4, r13)
            X.Qlu r14 = r5.A0B(r0, r6, r3)
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r13
            com.fasterxml.jackson.databind.ser.std.MapSerializer r0 = com.fasterxml.jackson.databind.ser.std.MapSerializer.A04(r14, r15, r16, r17, r18, r19, r20, r21)
            r2.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.ser.TableSerializer.<init>(X.TjO, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.JsonSerializer, X.SPK, X.4eE, com.fasterxml.jackson.datatype.guava.ser.TableSerializer):void");
    }

    public TableSerializer(C268894eF r2) {
        super(r2);
        this.A01 = r2;
        this.A00 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
    }
}
