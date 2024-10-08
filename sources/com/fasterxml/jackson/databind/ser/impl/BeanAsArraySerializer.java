package com.fasterxml.jackson.databind.ser.impl;

import X.16L;
import X.17Z;
import X.AnonymousClass00P;
import X.AnonymousClass4iD;
import X.C10751RxV;
import X.C10798RyK;
import X.C269504fE;
import X.C8244Qkx;
import X.Pxf;
import X.Pxi;
import X.SGT;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Set;

public class BeanAsArraySerializer extends BeanSerializerBase {
    public final BeanSerializerBase A00;

    public final JsonSerializer A07(SGT sgt) {
        return this.A00.A07(sgt);
    }

    public final void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
        if (this.A01 != null) {
            A0G(r2, r3, spk, obj);
            return;
        }
        C10798RyK A0E = A0E(16L.A0C, spk, obj);
        spk.A03(r2, A0E);
        r2.A0F(obj);
        A0J(r2, r3, obj);
        spk.A04(r2, A0E);
    }

    public final void A0J(17Z r6, C269504fE r7, Object obj) {
        C8244Qkx[] qkxArr = this.A03;
        if (qkxArr == null || r7.A07 == null) {
            qkxArr = this.A04;
        }
        try {
            for (C8244Qkx qkx : qkxArr) {
                if (qkx == null) {
                    r6.A0a();
                } else {
                    qkx.A01(r6, r7, obj);
                }
            }
        } catch (Exception e) {
            StdSerializer.A01(r7, obj, qkxArr[0].A04.A03, e);
            throw AnonymousClass00P.createAndThrow();
        } catch (StackOverflowError e2) {
            AnonymousClass4iD r1 = new AnonymousClass4iD(r6, "Infinite recursion (StackOverflowError)", e2);
            r1.A08(obj, qkxArr[0].A04.A03);
            throw r1;
        }
    }

    public final String toString() {
        return Pxf.A0e(this.A00, "BeanAsArraySerializer for ");
    }

    public BeanAsArraySerializer(C10751RxV rxV, BeanSerializerBase beanSerializerBase, Object obj) {
        super(rxV, beanSerializerBase, obj);
        this.A00 = beanSerializerBase;
    }

    public final void A0A(17Z r3, C269504fE r4, Object obj) {
        if (Pxi.A1U(r4)) {
            C8244Qkx[] qkxArr = this.A03;
            if (qkxArr == null || r4.A07 == null) {
                qkxArr = this.A04;
            }
            if (qkxArr.length == 1) {
                A0J(r3, r4, obj);
                return;
            }
        }
        r3.A0n(obj);
        A0J(r3, r4, obj);
        r3.A0Y();
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super((C10751RxV) null, beanSerializerBase, beanSerializerBase.A02);
        this.A00 = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set set, Set set2) {
        super(beanSerializerBase, set, set2);
        this.A00 = beanSerializerBase;
    }
}
