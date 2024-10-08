package com.fasterxml.jackson.databind.deser;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C12829T9a;
import X.C267574bm;
import X.C268894eF;
import X.C269134ed;
import X.C269464fA;
import X.C269674fV;
import X.C8206QkF;
import X.C8218QkR;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxi;
import X.S7U;
import X.SGT;
import X.SJZ;
import X.SQ7;
import X.T9I;
import X.TAR;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Map;
import java.util.Set;

public class BuilderBasedDeserializer extends BeanDeserializerBase {
    public final C268894eF A00;
    public final C8206QkF A01;

    public final JsonDeserializer A0A(SGT sgt) {
        return new BuilderBasedDeserializer(this, sgt);
    }

    public final Object A0C(16F r5, C269674fV r6, Object obj) {
        Object[] objArr;
        String str;
        C268894eF r3 = this.A00;
        Class cls = this.A08.A00;
        Class<?> cls2 = obj.getClass();
        if (cls.isAssignableFrom(cls2)) {
            objArr = new Object[]{r3, cls.getName()};
            str = "Deserialization of %s by passing existing Builder (%s) instance not supported";
        } else {
            objArr = new Object[]{r3, cls2.getName()};
            str = "Deserialization of %s by passing existing instance (of %s) not supported";
        }
        Pxf.A1H(r6, r3, str, objArr);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Object A0h(16F r11, C269674fV r12) {
        JsonDeserializer jsonDeserializer = this.A00;
        16F r5 = r11;
        C269674fV r4 = r12;
        if (jsonDeserializer == null && (jsonDeserializer = this.A01) == null) {
            Integer A0N = r12.A0N(A0I(), AnonymousClass05K.A15);
            boolean A0j = r12.A0j(C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (A0j || A0N != AnonymousClass05K.A00) {
                16L A1J = r11.A1J();
                16L r2 = 16L.A08;
                if (A1J == r2) {
                    int intValue = A0N.intValue();
                    if (intValue == 3) {
                        return A0K(r12);
                    }
                    if (intValue == 2 || intValue == 1) {
                        return BWm(r12);
                    }
                    r4.A0Q(r5, 16L.A0C, A0U(r12), (String) null, Pxe.A1b());
                } else if (A0j) {
                    Object A0D = A0D(r11, r12);
                    if (r11.A1J() == r2) {
                        return A0D;
                    }
                    A0t(r12);
                }
                throw AnonymousClass00P.createAndThrow();
            }
            Pxf.A1G(r11, r12, this);
            throw AnonymousClass00P.createAndThrow();
        }
        Object A08 = this.A09.A08(r12, jsonDeserializer.A0D(r11, r12));
        Pxi.A1E(r12, this);
        C8206QkF qkF = this.A01;
        if (qkF == null) {
            return A08;
        }
        try {
            return qkF.A01.invoke(A08, (Object[]) null);
        } catch (Exception e) {
            A1F(r12, e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A1G(16F r5, C269674fV r6, C267574bm r7, Object obj) {
        Class cls;
        if (this.A0F) {
            cls = r6.A05;
        } else {
            cls = null;
        }
        16L A10 = r5.A10();
        while (A10 == 16L.A0A) {
            String A0Y = r5.A0Y();
            C8218QkR A02 = this.A0A.A02(A0Y);
            r5.A1J();
            if (A02 != null) {
                if (cls == null || A02.A0R(cls)) {
                    try {
                        obj = A02.A0D(r5, r6, obj);
                    } catch (Exception e) {
                        A1E(r6, obj, A0Y, e);
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    r5.A0z();
                }
            } else if (SQ7.A01(this, A0Y)) {
                A1B(r5, r6, obj, A0Y);
            } else {
                r7.A0q(A0Y);
                r7.A13(r5);
                C12829T9a t9a = this.A02;
                if (t9a != null) {
                    t9a.A01(r5, r6, obj, A0Y);
                }
            }
            A10 = r5.A1J();
        }
        r7.A0Z();
        this.A05.A00(r6, r7, obj);
        return obj;
    }

    public final Object A1I(16F r7, C269674fV r8, Object obj) {
        Class cls;
        if (this.A0F) {
            cls = r8.A05;
        } else {
            cls = null;
        }
        SJZ sjz = new SJZ(this.A03);
        16L A10 = r7.A10();
        while (A10 == 16L.A0A) {
            String A0Y = r7.A0Y();
            16L A1J = r7.A1J();
            C8218QkR A02 = this.A0A.A02(A0Y);
            if (A02 != null) {
                if (A1J.A03) {
                    sjz.A00(r7, r8, obj, A0Y);
                }
                if (cls == null || A02.A0R(cls)) {
                    try {
                        obj = A02.A0D(r7, r8, obj);
                    } catch (Exception e) {
                        A1E(r8, obj, A0Y, e);
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    r7.A0z();
                }
            } else if (SQ7.A01(this, A0Y)) {
                A1B(r7, r8, obj, A0Y);
            } else if (!sjz.A03(r7, r8, obj, A0Y)) {
                C12829T9a t9a = this.A02;
                if (t9a != null) {
                    t9a.A01(r7, r8, obj, A0Y);
                } else {
                    A0r(r7, r8, obj, A0Y);
                }
            }
            A10 = r7.A1J();
        }
        sjz.A02(obj, r7, r8);
        return obj;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set set, Set set2) {
        super(builderBasedDeserializer, set, set2);
        this.A01 = builderBasedDeserializer.A01;
        this.A00 = builderBasedDeserializer.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01db A[SYNTHETIC, Splitter:B:112:0x01db] */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x018a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.16F r7, X.C269674fV r8) {
        /*
            r6 = this;
            boolean r0 = r7.A17()
            if (r0 == 0) goto L_0x0031
            r7.A1J()
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0040
            X.SK6 r0 = r6.A09
            java.lang.Object r2 = r0.A04(r8)
        L_0x0013:
            X.16L r1 = r7.A10()
            X.16L r0 = X.16L.A0A
            if (r1 != r0) goto L_0x01d7
            java.lang.String r1 = r7.A0Y()
            X.QkR r0 = X.TAR.A01(r7, r6, r1)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r2 = r0.A0D(r7, r8, r2)     // Catch:{ Exception -> 0x01be }
            goto L_0x002d
        L_0x002a:
            r6.A1C(r7, r8, r2, r1)
        L_0x002d:
            r7.A1J()
            goto L_0x0013
        L_0x0031:
            int r0 = r7.A0x()
            switch(r0) {
                case 2: goto L_0x0040;
                case 3: goto L_0x01e9;
                case 4: goto L_0x0038;
                case 5: goto L_0x0040;
                case 6: goto L_0x01c4;
                case 7: goto L_0x01c9;
                case 8: goto L_0x01ce;
                case 9: goto L_0x01d3;
                case 10: goto L_0x01d3;
                case 11: goto L_0x0038;
                case 12: goto L_0x01ee;
                default: goto L_0x0038;
            }
        L_0x0038:
            X.Pxf.A1G(r7, r8, r6)
        L_0x003b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0040:
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x018a
            X.SGe r0 = r6.A05
            if (r0 == 0) goto L_0x0165
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r6.A01
            if (r0 == 0) goto L_0x0058
            X.SK6 r1 = r6.A09
            java.lang.Object r0 = r0.A0D(r7, r8)
            java.lang.Object r2 = r1.A09(r8, r0)
            goto L_0x01d7
        L_0x0058:
            X.SOB r5 = r6.A04
            if (r5 == 0) goto L_0x00ff
            X.T9I r1 = r6.A0B
            int r0 = r5.A00
            X.S7L r4 = new X.S7L
            r4.<init>(r7, r8, r1, r0)
            X.4bm r3 = new X.4bm
            r3.<init>(r7, r8)
            r3.A0c()
            X.16L r1 = r7.A10()
        L_0x0071:
            X.16L r0 = X.16L.A0A
            if (r1 != r0) goto L_0x00f1
            java.lang.String r2 = r7.A0Y()
            r7.A1J()
            X.QkR r1 = X.SOB.A00(r5, r2)
            boolean r0 = r4.A04(r2)
            if (r0 == 0) goto L_0x008d
            if (r1 != 0) goto L_0x008d
        L_0x0088:
            X.16L r1 = r7.A1J()
            goto L_0x0071
        L_0x008d:
            if (r1 == 0) goto L_0x009d
            java.lang.Object r0 = r1.A0C(r7, r8)
            boolean r0 = r4.A03(r1, r0)
            if (r0 == 0) goto L_0x0088
            r7.A1J()
            goto L_0x00cd
        L_0x009d:
            X.TAR r0 = r6.A0A
            X.QkR r1 = r0.A02(r2)
            if (r1 == 0) goto L_0x00ad
            java.lang.Object r0 = r1.A0C(r7, r8)
            r4.A02(r1, r0)
            goto L_0x0088
        L_0x00ad:
            boolean r0 = X.SQ7.A01(r6, r2)
            if (r0 == 0) goto L_0x00bb
            X.4eF r0 = r6.A08
            java.lang.Class r0 = r0.A00
            r6.A1B(r7, r8, r0, r2)
            goto L_0x0088
        L_0x00bb:
            r3.A0q(r2)
            r3.A13(r7)
            X.T9a r1 = r6.A02
            if (r1 == 0) goto L_0x0088
            java.lang.Object r0 = r1.A00(r7, r8)
            r4.A01(r1, r0, r2)
            goto L_0x0088
        L_0x00cd:
            java.lang.Object r2 = r5.A02(r8, r4)     // Catch:{ Exception -> 0x00e7 }
            java.lang.Class r1 = r2.getClass()
            X.4eF r0 = r6.A08
            java.lang.Class r0 = r0.A00
            if (r1 == r0) goto L_0x00e1
            java.lang.Object r2 = r6.A19(r7, r8, r3, r2)
            goto L_0x01d7
        L_0x00e1:
            java.lang.Object r2 = r6.A1G(r7, r8, r3, r2)
            goto L_0x01d7
        L_0x00e7:
            r1 = move-exception
            X.4eF r0 = r6.A08
            java.lang.Class r0 = r0.A00
            r6.A1E(r8, r0, r2, r1)
            goto L_0x003b
        L_0x00f1:
            r3.A0Z()
            java.lang.Object r2 = r5.A02(r8, r4)     // Catch:{ Exception -> 0x01e3 }
            X.SGe r0 = r6.A05
            r0.A00(r8, r3, r2)
            goto L_0x01d7
        L_0x00ff:
            X.4bm r5 = new X.4bm
            r5.<init>(r7, r8)
            r5.A0c()
            X.SK6 r0 = r6.A09
            java.lang.Object r2 = r0.A04(r8)
            X.Pxi.A1E(r8, r6)
            boolean r0 = r6.A0F
            if (r0 == 0) goto L_0x0154
            java.lang.Class r4 = r8.A05
        L_0x0116:
            X.16L r1 = r7.A10()
            X.16L r0 = X.16L.A0A
            if (r1 != r0) goto L_0x015c
            java.lang.String r3 = r7.A0Y()
            X.QkR r1 = X.TAR.A01(r7, r6, r3)
            if (r1 == 0) goto L_0x013c
            if (r4 == 0) goto L_0x0137
            boolean r0 = r1.A0R(r4)
            if (r0 != 0) goto L_0x0137
            r7.A0z()
        L_0x0133:
            r7.A1J()
            goto L_0x0116
        L_0x0137:
            java.lang.Object r2 = r1.A0D(r7, r8, r2)     // Catch:{ Exception -> 0x0156 }
            goto L_0x0133
        L_0x013c:
            boolean r0 = X.SQ7.A01(r6, r3)
            if (r0 == 0) goto L_0x0146
            r6.A1B(r7, r8, r2, r3)
            goto L_0x0133
        L_0x0146:
            r5.A0q(r3)
            r5.A13(r7)
            X.T9a r0 = r6.A02
            if (r0 == 0) goto L_0x0133
            r0.A01(r7, r8, r2, r3)     // Catch:{ Exception -> 0x0156 }
            goto L_0x0133
        L_0x0154:
            r4 = 0
            goto L_0x0116
        L_0x0156:
            r0 = move-exception
            r6.A1E(r8, r2, r3, r0)
            goto L_0x003b
        L_0x015c:
            r5.A0Z()
            X.SGe r0 = r6.A05
            r0.A00(r8, r5, r2)
            goto L_0x01d7
        L_0x0165:
            X.SJZ r0 = r6.A03
            if (r0 == 0) goto L_0x0185
            X.SOB r0 = r6.A04
            if (r0 == 0) goto L_0x017a
            X.4eF r2 = r6.A00
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented"
            X.Pxf.A1H(r8, r2, r0, r1)
            goto L_0x003b
        L_0x017a:
            X.SK6 r0 = r6.A09
            java.lang.Object r0 = r0.A04(r8)
            java.lang.Object r2 = r6.A1I(r7, r8, r0)
            goto L_0x01d7
        L_0x0185:
            java.lang.Object r2 = r6.A17(r7, r8)
            goto L_0x01d7
        L_0x018a:
            X.SK6 r0 = r6.A09
            java.lang.Object r2 = r0.A04(r8)
            X.Pxi.A1E(r8, r6)
            boolean r0 = r6.A0F
            if (r0 == 0) goto L_0x01a0
            java.lang.Class r0 = r8.A05
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r2 = r6.A1H(r7, r8, r0, r2)
            goto L_0x01d7
        L_0x01a0:
            X.16L r1 = r7.A10()
            X.16L r0 = X.16L.A0A
            if (r1 != r0) goto L_0x01d7
            java.lang.String r1 = r7.A0Y()
            X.QkR r0 = X.TAR.A01(r7, r6, r1)
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r2 = r0.A0D(r7, r8, r2)     // Catch:{ Exception -> 0x01be }
            goto L_0x01ba
        L_0x01b7:
            r6.A1C(r7, r8, r2, r1)
        L_0x01ba:
            r7.A1J()
            goto L_0x01a0
        L_0x01be:
            r0 = move-exception
            r6.A1E(r8, r2, r1, r0)
            goto L_0x003b
        L_0x01c4:
            java.lang.Object r2 = r6.A18(r7, r8)
            goto L_0x01d7
        L_0x01c9:
            java.lang.Object r2 = r6.A15(r7, r8)
            goto L_0x01d7
        L_0x01ce:
            java.lang.Object r2 = r6.A14(r7, r8)
            goto L_0x01d7
        L_0x01d3:
            java.lang.Object r2 = r6.A13(r7, r8)
        L_0x01d7:
            X.QkF r0 = r6.A01
            if (r0 == 0) goto L_0x01f2
            java.lang.reflect.Method r1 = r0.A01     // Catch:{ Exception -> 0x01e3 }
            r0 = 0
            java.lang.Object r2 = r1.invoke(r2, r0)     // Catch:{ Exception -> 0x01e3 }
            return r2
        L_0x01e3:
            r0 = move-exception
            r6.A1F(r8, r0)
            goto L_0x003b
        L_0x01e9:
            java.lang.Object r2 = r6.A0h(r7, r8)
            return r2
        L_0x01ee:
            java.lang.Object r2 = r7.A0V()
        L_0x01f2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }

    public final Object A1H(16F r4, C269674fV r5, Class cls, Object obj) {
        16L A10 = r4.A10();
        while (A10 == 16L.A0A) {
            String A0Y = r4.A0Y();
            C8218QkR A012 = TAR.A01(r4, this, A0Y);
            if (A012 == null) {
                A1C(r4, r5, obj, A0Y);
            } else if (!A012.A0R(cls)) {
                r4.A0z();
            } else {
                try {
                    obj = A012.A0D(r4, r5, obj);
                } catch (Exception e) {
                    A1E(r5, obj, A0Y, e);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            A10 = r4.A1J();
        }
        return obj;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, SGT sgt) {
        super((BeanDeserializerBase) builderBasedDeserializer, sgt);
        this.A01 = builderBasedDeserializer.A01;
        this.A00 = builderBasedDeserializer.A00;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer) {
        super((BeanDeserializerBase) builderBasedDeserializer, true);
        this.A01 = builderBasedDeserializer.A01;
        this.A00 = builderBasedDeserializer.A00;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, T9I t9i) {
        super((BeanDeserializerBase) builderBasedDeserializer, t9i);
        this.A01 = builderBasedDeserializer.A01;
        this.A00 = builderBasedDeserializer.A00;
    }

    public BuilderBasedDeserializer(C268894eF r11, S7U s7u, TAR tar, C269134ed r14, Map map, Set set, Set set2, boolean z, boolean z2) {
        super(s7u, tar, r14, map, set, set2, z, z2);
        this.A00 = r11;
        this.A01 = s7u.A04;
        if (this.A0B != null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Cannot use Object Id with Builder-based deserialization (type ");
            throw AnonymousClass7TE.A0w(Pxg.A0q(r14.A05, A1A));
        }
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, TAR tar) {
        super((BeanDeserializerBase) builderBasedDeserializer, tar);
        this.A01 = builderBasedDeserializer.A01;
        this.A00 = builderBasedDeserializer.A00;
    }
}
