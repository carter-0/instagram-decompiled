package com.fasterxml.jackson.databind.deser.impl;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass4iD;
import X.AnonymousClass7TF;
import X.C268894eF;
import X.C269434f7;
import X.C269464fA;
import X.C269674fV;
import X.C8206QkF;
import X.C8218QkR;
import X.Pxi;
import X.SGT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;

public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase {
    public final C268894eF A00;
    public final BeanDeserializerBase A01;
    public final C8206QkF A02;
    public final C8218QkR[] A03;

    public final Object A0D(16F r14, C269674fV r15) {
        Object obj;
        C269434f7 r0;
        Class cls;
        16F r8 = r14;
        C269674fV r7 = r15;
        if (!r14.A16()) {
            C268894eF A0U = A0U(r15);
            16L A10 = r14.A10();
            r7.A0Q(r8, A10, A0U, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.A08.A00.getName(), A10);
        } else {
            if (this.A07) {
                obj = this.A09.A04(r15);
                C8218QkR[] qkRArr = this.A03;
                int length = qkRArr.length;
                int i = 0;
                while (true) {
                    16L A1J = r14.A1J();
                    16L r1 = 16L.A08;
                    if (A1J != r1) {
                        if (i != length) {
                            C8218QkR qkR = qkRArr[i];
                            if (qkR != null) {
                                try {
                                    obj = qkR.A0D(r14, r15, obj);
                                } catch (Exception e) {
                                    e = e;
                                    r0 = qkR.A06;
                                }
                            } else {
                                r14.A0z();
                            }
                            i++;
                        } else if (this.A0E || !r15.A0j(C269464fA.FAIL_ON_UNKNOWN_PROPERTIES)) {
                            while (r14.A1J() != r1) {
                                r14.A0z();
                            }
                        } else {
                            throw new AnonymousClass4iD(r15.A07, String.format("Unexpected JSON values; expected at most %d properties (in JSON Array)", AnonymousClass7TF.A1b(length)));
                        }
                    }
                }
            } else if (this.A06) {
                obj = A17(r14, r15);
            } else {
                obj = this.A09.A04(r15);
                Pxi.A1E(r15, this);
                if (this.A0F) {
                    cls = r15.A05;
                } else {
                    cls = null;
                }
                C8218QkR[] qkRArr2 = this.A03;
                int length2 = qkRArr2.length;
                int i2 = 0;
                while (true) {
                    16L A1J2 = r14.A1J();
                    16L r3 = 16L.A08;
                    if (A1J2 != r3) {
                        if (i2 != length2) {
                            C8218QkR qkR2 = qkRArr2[i2];
                            i2++;
                            if (qkR2 == null || (cls != null && !qkR2.A0R(cls))) {
                                r14.A0z();
                            } else {
                                try {
                                    qkR2.A0D(r14, r15, obj);
                                } catch (Exception e2) {
                                    e = e2;
                                    r0 = qkR2.A06;
                                }
                            }
                        } else if (this.A0E || !r15.A0j(C269464fA.FAIL_ON_UNKNOWN_PROPERTIES)) {
                            while (r14.A1J() != r3) {
                                r14.A0z();
                            }
                        } else {
                            r15.A0V(r3, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", AnonymousClass7TF.A1b(length2));
                        }
                    }
                }
            }
            try {
                return this.A02.A01.invoke(obj, (Object[]) null);
            } catch (Exception e3) {
                A1F(r15, e3);
            }
        }
        throw AnonymousClass00P.createAndThrow();
        A1E(r15, obj, r0.A02, e);
        throw AnonymousClass00P.createAndThrow();
    }

    public BeanAsArrayBuilderDeserializer(C268894eF r2, BeanDeserializerBase beanDeserializerBase, C8206QkF qkF, C8218QkR[] qkRArr) {
        super(beanDeserializerBase, beanDeserializerBase.A0E);
        this.A01 = beanDeserializerBase;
        this.A00 = r2;
        this.A03 = qkRArr;
        this.A02 = qkF;
    }

    public final JsonDeserializer A0A(SGT sgt) {
        return this.A01.A0A(sgt);
    }

    public final Object A0C(16F r2, C269674fV r3, Object obj) {
        return this.A01.A0C(r2, r3, obj);
    }
}
