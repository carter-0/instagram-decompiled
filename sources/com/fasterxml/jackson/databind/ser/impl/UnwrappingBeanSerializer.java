package com.fasterxml.jackson.databind.ser.impl;

import X.17Z;
import X.AnonymousClass00P;
import X.C10751RxV;
import X.C269424f6;
import X.C269504fE;
import X.C8244Qkx;
import X.Pxf;
import X.SGT;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import java.io.Serializable;
import java.util.Set;

public class UnwrappingBeanSerializer extends BeanSerializerBase implements Serializable {
    public final SGT A00;

    public final boolean A08() {
        return true;
    }

    public final JsonSerializer A07(SGT sgt) {
        return new UnwrappingBeanSerializer((BeanSerializerBase) this, sgt);
    }

    public final void A09(17Z r3, C269504fE r4, SPK spk, Object obj) {
        if (r4.A05.A0D(C269424f6.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            r4.A09("Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`", this.A00);
        } else {
            r3.A0F(obj);
            if (this.A01 != null) {
                A0G(r3, r4, spk, obj);
                return;
            }
            Object obj2 = this.A02;
            if (obj2 != null) {
                A0D(r4, obj2);
            } else {
                A0H(r3, r4, obj);
                return;
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final String toString() {
        return Pxf.A0e(this.A00, "UnwrappingBeanSerializer for ");
    }

    public UnwrappingBeanSerializer(C10751RxV rxV, UnwrappingBeanSerializer unwrappingBeanSerializer, Object obj) {
        super(rxV, (BeanSerializerBase) unwrappingBeanSerializer, obj);
        this.A00 = unwrappingBeanSerializer.A00;
    }

    public final void A0A(17Z r2, C269504fE r3, Object obj) {
        r2.A0F(obj);
        if (this.A01 != null) {
            A0I(r2, r3, obj, false);
            return;
        }
        Object obj2 = this.A02;
        if (obj2 != null) {
            A0D(r3, obj2);
            throw AnonymousClass00P.createAndThrow();
        } else {
            A0H(r2, r3, obj);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UnwrappingBeanSerializer(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r7, X.SGT r8) {
        /*
            r6 = this;
            X.Qkx[] r5 = r7.A04
            if (r5 == 0) goto L_0x001f
            int r3 = r5.length
            if (r3 == 0) goto L_0x001f
            if (r8 == 0) goto L_0x001f
            X.SGT r0 = X.SGT.A00
            if (r8 == r0) goto L_0x001f
            X.Qkx[] r2 = new X.C8244Qkx[r3]
            r1 = 0
        L_0x0010:
            r0 = r5[r1]
            if (r0 == 0) goto L_0x001a
            X.Qkx r0 = r0.A00(r8)
            r2[r1] = r0
        L_0x001a:
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x0010
            r5 = r2
        L_0x001f:
            X.Qkx[] r4 = r7.A03
            if (r4 == 0) goto L_0x003e
            int r3 = r4.length
            if (r3 == 0) goto L_0x003e
            if (r8 == 0) goto L_0x003e
            X.SGT r0 = X.SGT.A00
            if (r8 == r0) goto L_0x003e
            X.Qkx[] r2 = new X.C8244Qkx[r3]
            r1 = 0
        L_0x002f:
            r0 = r4[r1]
            if (r0 == 0) goto L_0x0039
            X.Qkx r0 = r0.A00(r8)
            r2[r1] = r0
        L_0x0039:
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x002f
            r4 = r2
        L_0x003e:
            r6.<init>((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase) r7, (X.C8244Qkx[]) r5, (X.C8244Qkx[]) r4)
            r6.A00 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer.<init>(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, X.SGT):void");
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set set, Set set2) {
        super((BeanSerializerBase) unwrappingBeanSerializer, set, set2);
        this.A00 = unwrappingBeanSerializer.A00;
    }

    public UnwrappingBeanSerializer(C10751RxV rxV, UnwrappingBeanSerializer unwrappingBeanSerializer) {
        super(rxV, (BeanSerializerBase) unwrappingBeanSerializer, unwrappingBeanSerializer.A02);
        this.A00 = unwrappingBeanSerializer.A00;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, C8244Qkx[] qkxArr, C8244Qkx[] qkxArr2) {
        super((BeanSerializerBase) unwrappingBeanSerializer, qkxArr, qkxArr2);
        this.A00 = unwrappingBeanSerializer.A00;
    }
}
