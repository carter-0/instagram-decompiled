package com.fasterxml.jackson.databind.ser.std;

import X.16L;
import X.17Z;
import X.C10798RyK;
import X.C13901TjO;
import X.C268894eF;
import X.C269504fE;
import X.C269714fZ;
import X.C8245Qkz;
import X.SIF;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public abstract class AsArraySerializerBase extends ContainerSerializer implements C269714fZ {
    public SIF A00;
    public final C13901TjO A01;
    public final C268894eF A02;
    public final JsonSerializer A03;
    public final SPK A04;
    public final Boolean A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(C268894eF r4, JsonSerializer jsonSerializer, SPK spk, Class cls, boolean z) {
        super(cls, false);
        boolean z2 = false;
        this.A02 = r4;
        if (z || (r4 != null && Modifier.isFinal(r4.A00.getModifiers()))) {
            z2 = true;
        }
        this.A06 = z2;
        this.A04 = spk;
        this.A01 = null;
        this.A03 = jsonSerializer;
        this.A00 = C8245Qkz.A00;
        this.A05 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r10, X.C269504fE r11) {
        /*
            r9 = this;
            r7 = r9
            X.SPK r6 = r9.A04
            r3 = r6
            r4 = r10
            if (r6 == 0) goto L_0x000b
            X.SPK r6 = r6.A06(r10)
        L_0x000b:
            r8 = 0
            if (r10 == 0) goto L_0x0061
            X.4et r0 = r11.A05
            X.4eA r0 = r0.A01()
            X.QkH r1 = r10.BRS()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r0 = r0.A0X(r1)
            if (r0 == 0) goto L_0x0061
            com.fasterxml.jackson.databind.JsonSerializer r2 = r11.A0M(r1, r0)
        L_0x0024:
            java.lang.Class r0 = r9.A00
            X.4ev r1 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r10, r11, r0)
            if (r1 == 0) goto L_0x0032
            X.RDC r0 = X.RDC.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r8 = r1.A01(r0)
        L_0x0032:
            if (r2 != 0) goto L_0x0036
            com.fasterxml.jackson.databind.JsonSerializer r2 = r9.A03
        L_0x0036:
            com.fasterxml.jackson.databind.JsonSerializer r5 = r9.A0C(r10, r2, r11)
            if (r5 != 0) goto L_0x004e
            X.4eF r2 = r9.A02
            if (r2 == 0) goto L_0x004e
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x004e
            java.lang.Class r1 = r2.A00
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L_0x004e
            com.fasterxml.jackson.databind.JsonSerializer r5 = r11.A0B(r10, r2)
        L_0x004e:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r9.A03
            if (r5 != r0) goto L_0x0063
            X.TjO r0 = r9.A01
            if (r10 != r0) goto L_0x0063
            if (r3 != r6) goto L_0x0063
            java.lang.Boolean r0 = r9.A05
            boolean r0 = X.2Ob.A00(r0, r8)
            if (r0 == 0) goto L_0x0063
            return r9
        L_0x0061:
            r2 = r8
            goto L_0x0024
        L_0x0063:
            boolean r0 = r9 instanceof com.fasterxml.jackson.databind.ser.std.IterableSerializer
            if (r0 == 0) goto L_0x006d
            com.fasterxml.jackson.databind.ser.std.IterableSerializer r3 = new com.fasterxml.jackson.databind.ser.std.IterableSerializer
            r3.<init>((X.C13901TjO) r4, (com.fasterxml.jackson.databind.JsonSerializer) r5, (X.SPK) r6, (com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase) r7, (java.lang.Boolean) r8)
            return r3
        L_0x006d:
            boolean r0 = r9 instanceof com.fasterxml.jackson.databind.ser.std.EnumSetSerializer
            if (r0 == 0) goto L_0x0077
            com.fasterxml.jackson.databind.ser.std.EnumSetSerializer r3 = new com.fasterxml.jackson.databind.ser.std.EnumSetSerializer
            r3.<init>((X.C13901TjO) r4, (com.fasterxml.jackson.databind.JsonSerializer) r5, (X.SPK) r6, (com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase) r7, (java.lang.Boolean) r8)
            return r3
        L_0x0077:
            boolean r0 = r9 instanceof com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            if (r0 == 0) goto L_0x0081
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r3 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            r3.<init>((X.C13901TjO) r4, (com.fasterxml.jackson.databind.JsonSerializer) r5, (X.SPK) r6, (com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase) r7, (java.lang.Boolean) r8)
            return r3
        L_0x0081:
            boolean r0 = r9 instanceof com.fasterxml.jackson.databind.ser.impl.IteratorSerializer
            if (r0 == 0) goto L_0x008b
            com.fasterxml.jackson.databind.ser.impl.IteratorSerializer r3 = new com.fasterxml.jackson.databind.ser.impl.IteratorSerializer
            r3.<init>((X.C13901TjO) r4, (com.fasterxml.jackson.databind.JsonSerializer) r5, (X.SPK) r6, (com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase) r7, (java.lang.Boolean) r8)
            return r3
        L_0x008b:
            com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer r3 = new com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer
            r3.<init>((X.C13901TjO) r4, (com.fasterxml.jackson.databind.JsonSerializer) r5, (X.SPK) r6, (com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase) r7, (java.lang.Boolean) r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final void A09(17Z r4, C269504fE r5, SPK spk, Object obj) {
        C10798RyK A002 = SPK.A00(r4, 16L.A0C, spk, obj);
        r4.A0F(obj);
        if (this instanceof IterableSerializer) {
            ((IterableSerializer) this).A0E(r4, r5, (Iterable) obj);
        } else if (this instanceof EnumSetSerializer) {
            ((EnumSetSerializer) this).A0E(r4, r5, (EnumSet) obj);
        } else if (this instanceof CollectionSerializer) {
            ((CollectionSerializer) this).A0E(r4, r5, (Collection) obj);
        } else if (this instanceof IteratorSerializer) {
            ((IteratorSerializer) this).A0E(r4, r5, (Iterator) obj);
        } else {
            ((IndexedListSerializer) this).A0E(r4, r5, (List) obj);
        }
        spk.A04(r4, A002);
    }

    public AsArraySerializerBase(C13901TjO tjO, JsonSerializer jsonSerializer, SPK spk, AsArraySerializerBase asArraySerializerBase, Boolean bool) {
        super(asArraySerializerBase.A00, false);
        this.A02 = asArraySerializerBase.A02;
        this.A06 = asArraySerializerBase.A06;
        this.A04 = spk;
        this.A01 = tjO;
        this.A03 = jsonSerializer;
        this.A00 = C8245Qkz.A00;
        this.A05 = bool;
    }
}
