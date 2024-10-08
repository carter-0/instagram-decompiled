package com.fasterxml.jackson.databind.deser;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C12829T9a;
import X.C267574bm;
import X.C268894eF;
import X.C269464fA;
import X.C269574fL;
import X.C269674fV;
import X.C273654mx;
import X.C8218QkR;
import X.Pxf;
import X.Pxi;
import X.SGT;
import X.SJZ;
import X.SQ7;
import X.TAR;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.Serializable;

public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    public transient Exception A00;
    public volatile transient SGT A01;

    public final void A1J(16F r4, C269674fV r5, Class cls, Object obj) {
        if (r4.A18(5)) {
            String A0Y = r4.A0Y();
            do {
                C8218QkR A012 = TAR.A01(r4, this, A0Y);
                if (A012 == null) {
                    A1C(r4, r5, obj, A0Y);
                } else if (!A012.A0R(cls)) {
                    r4.A0z();
                } else {
                    try {
                        A012.A0K(obj, r4, r5);
                    } catch (Exception e) {
                        A1E(r5, obj, A0Y, e);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                A0Y = r4.A1N();
            } while (A0Y != null);
        }
    }

    private final Object A00(16F r4, C269674fV r5) {
        Object A04 = this.A09.A04(r5);
        r4.A0t(A04);
        if (r4.A18(5)) {
            String A0Y = r4.A0Y();
            do {
                C8218QkR A012 = TAR.A01(r4, this, A0Y);
                if (A012 != null) {
                    try {
                        A012.A0K(A04, r4, r5);
                    } catch (Exception e) {
                        A1E(r5, A04, A0Y, e);
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    A1C(r4, r5, A04, A0Y);
                }
                A0Y = r4.A1N();
            } while (A0Y != null);
        }
        return A04;
    }

    public final JsonDeserializer A0A(SGT sgt) {
        boolean z = this instanceof ThrowableDeserializer;
        Class<?> cls = getClass();
        if (z) {
            if (cls != ThrowableDeserializer.class) {
                return this;
            }
            return new BeanDeserializerBase((BeanDeserializerBase) this, sgt);
        } else if (cls != BeanDeserializer.class || this.A01 == sgt) {
            return this;
        } else {
            this.A01 = sgt;
            try {
                return new BeanDeserializerBase((BeanDeserializerBase) this, sgt);
            } finally {
                this.A01 = null;
            }
        }
    }

    public final Object A0h(16F r15, C269674fV r16) {
        16L r10;
        C268894eF A0U;
        Object[] objArr;
        String str;
        JsonDeserializer jsonDeserializer = this.A00;
        16F r9 = r15;
        C269674fV r8 = r16;
        if (jsonDeserializer == null && (jsonDeserializer = this.A01) == null) {
            Integer A0N = r8.A0N(A0I(), AnonymousClass05K.A15);
            boolean A0j = r8.A0j(C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (A0j || A0N != AnonymousClass05K.A00) {
                16L A1J = r15.A1J();
                16L r5 = 16L.A08;
                if (A1J == r5) {
                    int intValue = A0N.intValue();
                    if (intValue == 3) {
                        return A0K(r8);
                    }
                    if (intValue == 2 || intValue == 1) {
                        return BWm(r8);
                    }
                    A0U = A0U(r8);
                    r10 = 16L.A0C;
                    str = null;
                    objArr = new Object[0];
                } else if (A0j) {
                    16L A1J2 = r15.A1J();
                    r10 = 16L.A0C;
                    if (A1J2 == r10) {
                        A0U = A0U(r8);
                        objArr = new Object[]{C269574fL.A04(A0U), C273654mx.A00(1231)};
                        str = "Cannot deserialize value of type %s from deeply-nested JSON Array: only single wrapper allowed with `%s`";
                    } else {
                        Object A0D = A0D(r15, r8);
                        if (r15.A1J() == r5) {
                            return A0D;
                        }
                        A0t(r8);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                r8.A0Q(r9, r10, A0U, str, objArr);
                throw AnonymousClass00P.createAndThrow();
            }
            Pxf.A1G(r15, r8, this);
            throw AnonymousClass00P.createAndThrow();
        }
        Object A08 = this.A09.A08(r8, jsonDeserializer.A0D(r15, r8));
        Pxi.A1E(r8, this);
        return A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cf, code lost:
        r11.A0V(r4, "Attempted to unwrap '%s' value", r13.A08.A00.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e2, code lost:
        r5.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ed, code lost:
        if (r2.getClass() == r13.A08.A00) goto L_0x04c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ef, code lost:
        r11.A0W(r6, "Cannot create polymorphic instances with unwrapped values", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r2 = r4.A02(r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0367, code lost:
        if (r0 != null) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0369, code lost:
        r0 = r3.A01;
        r15 = r0;
        r0 = r0.A00.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0370, code lost:
        if (r0 == null) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0376, code lost:
        if (r0.booleanValue() == false) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0378, code lost:
        r2 = r9.A00;
        r5 = r15.A06.A02;
        r1 = new java.lang.Object[]{r5, r6[r4].A03};
        r0 = "Missing property '%s' for external type id '%s'";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x038a, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0390, code lost:
        if (r11.A0j(X.C269464fA.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY) == false) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0446, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0447, code lost:
        A1F(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016f, code lost:
        r0 = r12.A1J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r2 = r4.A02(r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01bd, code lost:
        r12.A0t(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c0, code lost:
        if (r0 != r1) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c2, code lost:
        r5.A13(r12);
        r0 = r12.A1J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ca, code lost:
        r4 = X.16L.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01cd, code lost:
        if (r0 == r4) goto L_0x01e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A1G(X.16F r19, X.C269674fV r20) {
        /*
            r18 = this;
            r13 = r18
            boolean r0 = r13 instanceof com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer
            r11 = r20
            r12 = r19
            if (r0 == 0) goto L_0x0116
            X.SOB r0 = r13.A04
            if (r0 == 0) goto L_0x0013
            java.lang.Object r3 = r13.A12(r12, r11)
        L_0x0012:
            return r3
        L_0x0013:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r13.A01
            if (r0 == 0) goto L_0x0022
            X.SK6 r1 = r13.A09
            java.lang.Object r0 = r0.A0D(r12, r11)
            java.lang.Object r3 = r1.A09(r11, r0)
            return r3
        L_0x0022:
            X.4eF r1 = r13.A08
            boolean r0 = r1.A0L()
            r5 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.Class r2 = r1.A00
            X.SK6 r8 = r13.A09
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "abstract type (need to add/enable type information?)"
        L_0x0033:
            r11.A0Y(r8, r2, r0, r1)
            goto L_0x04a8
        L_0x0038:
            X.SK6 r8 = r13.A09
            boolean r10 = r8.A0J()
            boolean r0 = r8.A0L()
            if (r10 != 0) goto L_0x004d
            if (r0 != 0) goto L_0x004d
            java.lang.Class r2 = r1.A00
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator"
            goto L_0x0033
        L_0x004d:
            r1 = 0
            r3 = r1
            r7 = r1
            r4 = r1
            r6 = 0
        L_0x0052:
            X.16L r0 = X.16L.A09
            boolean r0 = r12.A19(r0)
            if (r0 != 0) goto L_0x00e7
            java.lang.String r2 = r12.A0Y()
            X.TAR r0 = r13.A0A
            X.QkR r9 = r0.A02(r2)
            r12.A1J()
            if (r9 == 0) goto L_0x0086
            if (r3 == 0) goto L_0x0072
            r9.A0K(r3, r12, r11)
        L_0x006e:
            r12.A1J()
            goto L_0x0052
        L_0x0072:
            if (r7 != 0) goto L_0x0079
            int r0 = r0.A01
            int r0 = r0 + r0
            java.lang.Object[] r7 = new java.lang.Object[r0]
        L_0x0079:
            int r2 = r6 + 1
            r7[r6] = r9
            int r6 = r2 + 1
            java.lang.Object r0 = r9.A0C(r12, r11)
            r7[r2] = r0
            goto L_0x006e
        L_0x0086:
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x009c
            if (r10 == 0) goto L_0x00cd
            java.lang.String r0 = r12.A1Q()
            java.lang.Object r3 = r8.A0A(r11, r0)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            goto L_0x006e
        L_0x009c:
            java.lang.String r0 = "suppressed"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00cd
            java.lang.Class<java.lang.Throwable[]> r2 = java.lang.Throwable[].class
            X.4f9 r0 = r11.A02
            X.4eS r0 = r0.A01
            X.4eE r0 = r0.A07
            X.4eF r2 = r0.A09(r2)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r11.A0E(r2)
            if (r0 != 0) goto L_0x00c6
            java.lang.String r1 = "Could not find JsonDeserializer for type "
            java.lang.String r0 = X.C269574fL.A04(r2)
            java.lang.String r0 = X.002.A0R(r1, r0)
            r11.A08(r2, r0)
            goto L_0x04a8
        L_0x00c6:
            java.lang.Object r4 = r0.A0D(r12, r11)
            java.lang.Throwable[] r4 = (java.lang.Throwable[]) r4
            goto L_0x006e
        L_0x00cd:
            java.util.Set r0 = r13.A0C
            if (r0 == 0) goto L_0x00db
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x00db
            r12.A0z()
            goto L_0x006e
        L_0x00db:
            X.T9a r0 = r13.A02
            if (r0 == 0) goto L_0x00e3
            r0.A01(r12, r11, r3, r2)
            goto L_0x006e
        L_0x00e3:
            r13.A0r(r12, r11, r3, r2)
            goto L_0x006e
        L_0x00e7:
            if (r3 != 0) goto L_0x00f1
            if (r10 == 0) goto L_0x0104
            java.lang.Object r3 = r8.A0A(r11, r1)
        L_0x00ef:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
        L_0x00f1:
            if (r7 == 0) goto L_0x0109
            r2 = 0
        L_0x00f4:
            if (r2 >= r6) goto L_0x0109
            r1 = r7[r2]
            X.QkR r1 = (X.C8218QkR) r1
            int r0 = r2 + 1
            r0 = r7[r0]
            r1.A0L(r3, r0)
            int r2 = r2 + 2
            goto L_0x00f4
        L_0x0104:
            java.lang.Object r3 = r8.A04(r11)
            goto L_0x00ef
        L_0x0109:
            if (r4 == 0) goto L_0x0012
            int r1 = r4.length
        L_0x010c:
            if (r5 >= r1) goto L_0x0012
            r0 = r4[r5]
            X.C9153RRe.A00(r3, r0)
            int r5 = r5 + 1
            goto L_0x010c
        L_0x0116:
            X.T9I r2 = r13.A0B
            r1 = 5
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x044b
            X.SGe r0 = r13.A05
            if (r0 == 0) goto L_0x0274
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r13.A01
            if (r0 == 0) goto L_0x0130
            X.SK6 r1 = r13.A09
        L_0x0127:
            java.lang.Object r0 = r0.A0D(r12, r11)
            java.lang.Object r2 = r1.A09(r11, r0)
        L_0x012f:
            return r2
        L_0x0130:
            X.SOB r4 = r13.A04
            if (r4 == 0) goto L_0x01fe
            int r0 = r4.A00
            X.S7L r3 = new X.S7L
            r3.<init>(r12, r11, r2, r0)
            X.4bm r5 = new X.4bm
            r5.<init>(r12, r11)
            r5.A0c()
            X.16L r0 = r12.A10()
        L_0x0147:
            X.16L r1 = X.16L.A0A
            if (r0 != r1) goto L_0x01f8
            java.lang.String r2 = r12.A0Y()
            r12.A1J()
            X.QkR r6 = X.SOB.A00(r4, r2)
            boolean r0 = r3.A04(r2)
            if (r0 == 0) goto L_0x0163
            if (r6 != 0) goto L_0x0163
        L_0x015e:
            X.16L r0 = r12.A1J()
            goto L_0x0147
        L_0x0163:
            if (r6 == 0) goto L_0x0174
            java.lang.Object r0 = r13.A1H(r12, r11, r6)
            boolean r0 = r3.A03(r6, r0)
            if (r0 == 0) goto L_0x015e
            X.16L r0 = r12.A1J()
            goto L_0x01b9
        L_0x0174:
            X.TAR r0 = r13.A0A
            X.QkR r1 = r0.A02(r2)
            if (r1 == 0) goto L_0x0184
            java.lang.Object r0 = r13.A1H(r12, r11, r1)
            r3.A02(r1, r0)
            goto L_0x015e
        L_0x0184:
            boolean r0 = X.SQ7.A01(r13, r2)
            if (r0 == 0) goto L_0x0192
            X.4eF r0 = r13.A08
            java.lang.Class r0 = r0.A00
            r13.A1B(r12, r11, r0, r2)
            goto L_0x015e
        L_0x0192:
            X.T9a r0 = r13.A02
            if (r0 != 0) goto L_0x019d
            r5.A0q(r2)
            r5.A13(r12)
            goto L_0x015e
        L_0x019d:
            X.4bm r0 = new X.4bm
            r0.<init>(r12, r11)
            r0.A13(r12)
            r5.A0q(r2)
            r5.A17(r0)
            X.T9a r1 = r13.A02     // Catch:{ Exception -> 0x0318 }
            X.Qhf r0 = X.Pxi.A0N(r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.Object r0 = r1.A00(r0, r11)     // Catch:{ Exception -> 0x0318 }
            r3.A01(r1, r0, r2)     // Catch:{ Exception -> 0x0318 }
            goto L_0x015e
        L_0x01b9:
            java.lang.Object r2 = r4.A02(r11, r3)     // Catch:{ Exception -> 0x0446 }
            r12.A0t(r2)
        L_0x01c0:
            if (r0 != r1) goto L_0x01ca
            r5.A13(r12)
            X.16L r0 = r12.A1J()
            goto L_0x01c0
        L_0x01ca:
            X.16L r4 = X.16L.A09
            r3 = 0
            if (r0 == r4) goto L_0x01e2
            X.4eF r0 = r13.A08
            java.lang.Class r0 = r0.A00
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Attempted to unwrap '%s' value"
            r11.A0V(r4, r0, r1)
            goto L_0x04a8
        L_0x01e2:
            r5.A0Z()
            java.lang.Class r1 = r2.getClass()
            X.4eF r0 = r13.A08
            java.lang.Class r0 = r0.A00
            if (r1 == r0) goto L_0x04c5
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "Cannot create polymorphic instances with unwrapped values"
            r11.A0W(r6, r0, r1)
            goto L_0x04a8
        L_0x01f8:
            java.lang.Object r2 = r4.A02(r11, r3)     // Catch:{ Exception -> 0x0446 }
            goto L_0x04c5
        L_0x01fe:
            X.4bm r5 = new X.4bm
            r5.<init>(r12, r11)
            r5.A0c()
            X.SK6 r0 = r13.A09
            java.lang.Object r2 = r0.A04(r11)
            r12.A0t(r2)
            X.Pxi.A1E(r11, r13)
            boolean r0 = r13.A0F
            r4 = 0
            if (r0 == 0) goto L_0x026c
            java.lang.Class r3 = r11.A05
        L_0x0219:
            boolean r0 = r12.A18(r1)
            if (r0 == 0) goto L_0x0223
            java.lang.String r4 = r12.A0Y()
        L_0x0223:
            if (r4 == 0) goto L_0x04c2
            X.QkR r1 = X.TAR.A01(r12, r13, r4)
            if (r1 == 0) goto L_0x023f
            if (r3 == 0) goto L_0x023b
            boolean r0 = r1.A0R(r3)
            if (r0 != 0) goto L_0x023b
            r12.A0z()
        L_0x0236:
            java.lang.String r4 = r12.A1N()
            goto L_0x0223
        L_0x023b:
            r1.A0K(r2, r12, r11)     // Catch:{ Exception -> 0x026e }
            goto L_0x0236
        L_0x023f:
            boolean r0 = X.SQ7.A01(r13, r4)
            if (r0 == 0) goto L_0x0249
            r13.A1B(r12, r11, r2, r4)
            goto L_0x0236
        L_0x0249:
            X.T9a r0 = r13.A02
            if (r0 != 0) goto L_0x0254
            r5.A0q(r4)
            r5.A13(r12)
            goto L_0x0236
        L_0x0254:
            X.4bm r0 = new X.4bm
            r0.<init>(r12, r11)
            r0.A13(r12)
            r5.A0q(r4)
            r5.A17(r0)
            X.T9a r1 = r13.A02     // Catch:{ Exception -> 0x026e }
            X.Qhf r0 = X.Pxi.A0N(r0)     // Catch:{ Exception -> 0x026e }
            r1.A01(r0, r11, r2, r4)     // Catch:{ Exception -> 0x026e }
            goto L_0x0236
        L_0x026c:
            r3 = r4
            goto L_0x0219
        L_0x026e:
            r0 = move-exception
            r13.A1E(r11, r2, r4, r0)
            goto L_0x04a8
        L_0x0274:
            X.SJZ r0 = r13.A03
            if (r0 == 0) goto L_0x04cb
            X.SOB r10 = r13.A04
            if (r10 == 0) goto L_0x04ad
            X.SJZ r9 = new X.SJZ
            r9.<init>(r0)
            int r0 = r10.A00
            X.S7L r8 = new X.S7L
            r8.<init>(r12, r11, r2, r0)
            boolean r0 = r13.A0F
            r7 = 0
            if (r0 == 0) goto L_0x030f
            java.lang.Class r3 = r11.A05
        L_0x028f:
            X.16L r1 = r12.A10()
        L_0x0293:
            X.16L r0 = X.16L.A0A
            if (r1 != r0) goto L_0x0322
            java.lang.String r2 = r12.A0Y()
            X.16L r4 = r12.A1J()
            X.QkR r1 = X.SOB.A00(r10, r2)
            boolean r0 = r8.A04(r2)
            if (r0 == 0) goto L_0x02b0
            if (r1 != 0) goto L_0x02b0
        L_0x02ab:
            X.16L r1 = r12.A1J()
            goto L_0x0293
        L_0x02b0:
            if (r1 == 0) goto L_0x02c6
            boolean r0 = r9.A03(r12, r11, r7, r2)
            if (r0 != 0) goto L_0x02ab
            java.lang.Object r0 = r13.A1H(r12, r11, r1)
            boolean r0 = r8.A03(r1, r0)
            if (r0 == 0) goto L_0x02ab
            r12.A1J()
            goto L_0x0312
        L_0x02c6:
            X.TAR r0 = r13.A0A
            X.QkR r1 = r0.A02(r2)
            if (r1 == 0) goto L_0x02e9
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x02d5
            r9.A00(r12, r11, r7, r2)
        L_0x02d5:
            if (r3 == 0) goto L_0x02e1
            boolean r0 = r1.A0R(r3)
            if (r0 != 0) goto L_0x02e1
            r12.A0z()
            goto L_0x02ab
        L_0x02e1:
            java.lang.Object r0 = r1.A0C(r12, r11)
            r8.A02(r1, r0)
            goto L_0x02ab
        L_0x02e9:
            boolean r0 = r9.A03(r12, r11, r7, r2)
            if (r0 != 0) goto L_0x02ab
            boolean r0 = X.SQ7.A01(r13, r2)
            if (r0 == 0) goto L_0x02fd
            X.4eF r0 = r13.A08
            java.lang.Class r0 = r0.A00
            r13.A1B(r12, r11, r0, r2)
            goto L_0x02ab
        L_0x02fd:
            X.T9a r1 = r13.A02
            if (r1 == 0) goto L_0x0309
            java.lang.Object r0 = r1.A00(r12, r11)
            r8.A01(r1, r0, r2)
            goto L_0x02ab
        L_0x0309:
            java.lang.Class r0 = r13.A00
            r13.A0r(r12, r11, r0, r2)
            goto L_0x02ab
        L_0x030f:
            r3 = r7
            goto L_0x028f
        L_0x0312:
            java.lang.Object r2 = r10.A02(r11, r8)     // Catch:{ Exception -> 0x0318 }
            goto L_0x0495
        L_0x0318:
            r1 = move-exception
            X.4eF r0 = r13.A08
            java.lang.Class r0 = r0.A00
            r13.A1E(r11, r0, r2, r1)
            goto L_0x04a8
        L_0x0322:
            X.RwY[] r6 = r9.A01     // Catch:{ Exception -> 0x0446 }
            int r0 = r6.length     // Catch:{ Exception -> 0x0446 }
            r17 = r0
            java.lang.Object[] r14 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0446 }
            r5 = 0
            r4 = 0
        L_0x032b:
            r0 = r17
            if (r4 >= r0) goto L_0x042c
            java.lang.String[] r0 = r9.A03     // Catch:{ Exception -> 0x0446 }
            r1 = r0[r4]     // Catch:{ Exception -> 0x0446 }
            r3 = r6[r4]     // Catch:{ Exception -> 0x0446 }
            X.4bm[] r2 = r9.A02     // Catch:{ Exception -> 0x0446 }
            r0 = r2[r4]     // Catch:{ Exception -> 0x0446 }
            if (r1 != 0) goto L_0x0367
            if (r0 == 0) goto L_0x0405
            X.SPE r0 = r0.A03     // Catch:{ Exception -> 0x0446 }
            long r0 = r0.A00     // Catch:{ Exception -> 0x0446 }
            int r15 = (int) r0     // Catch:{ Exception -> 0x0446 }
            r1 = r15 & 15
            X.16L[] r0 = X.SPE.A04     // Catch:{ Exception -> 0x0446 }
            r1 = r0[r1]     // Catch:{ Exception -> 0x0446 }
            X.16L r0 = X.16L.A0G     // Catch:{ Exception -> 0x0446 }
            if (r1 == r0) goto L_0x0405
            X.SJg r0 = r3.A02     // Catch:{ Exception -> 0x0446 }
            X.QkY r0 = (X.C8225QkY) r0     // Catch:{ Exception -> 0x0446 }
            X.4eF r0 = r0.A03     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x0409
            X.SJg r15 = r3.A02     // Catch:{ Exception -> 0x0446 }
            X.QkY r15 = (X.C8225QkY) r15     // Catch:{ Exception -> 0x0446 }
            X.4eF r1 = r15.A03     // Catch:{ Exception -> 0x0446 }
            java.util.Iterator r0 = X.C269574fL.A00     // Catch:{ Exception -> 0x0446 }
            if (r1 != 0) goto L_0x035f
            goto L_0x0362
        L_0x035f:
            java.lang.Class r1 = r1.A00     // Catch:{ Exception -> 0x0446 }
            goto L_0x0363
        L_0x0362:
            r1 = 0
        L_0x0363:
            if (r1 != 0) goto L_0x0393
            r1 = r7
            goto L_0x0399
        L_0x0367:
            if (r0 != 0) goto L_0x0399
            X.QkR r0 = r3.A01     // Catch:{ Exception -> 0x0446 }
            r15 = r0
            X.T9n r0 = r0.A00     // Catch:{ Exception -> 0x0446 }
            java.lang.Boolean r0 = r0.A02     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x038a
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x038a
        L_0x0378:
            X.4eF r2 = r9.A00     // Catch:{ Exception -> 0x0446 }
            X.4f7 r0 = r15.A06     // Catch:{ Exception -> 0x0446 }
            java.lang.String r5 = r0.A02     // Catch:{ Exception -> 0x0446 }
            r0 = r6[r4]     // Catch:{ Exception -> 0x0446 }
            java.lang.String r0 = r0.A03     // Catch:{ Exception -> 0x0446 }
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r0}     // Catch:{ Exception -> 0x0446 }
            java.lang.String r0 = "Missing property '%s' for external type id '%s'"
            goto L_0x0419
        L_0x038a:
            X.4fA r0 = X.C269464fA.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY     // Catch:{ Exception -> 0x0446 }
            boolean r0 = r11.A0j(r0)     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x0399
            goto L_0x0378
        L_0x0393:
            X.ThU r0 = r15.A04     // Catch:{ Exception -> 0x0446 }
            java.lang.String r1 = r0.CLy(r1, r7)     // Catch:{ Exception -> 0x0446 }
        L_0x0399:
            r0 = r2[r4]     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x03cf
            r0 = r2[r4]     // Catch:{ Exception -> 0x0446 }
            X.Qhf r15 = r0.A10(r12)     // Catch:{ Exception -> 0x0446 }
            X.16L r2 = r15.A1J()     // Catch:{ Exception -> 0x0446 }
            X.16L r0 = X.16L.A0G     // Catch:{ Exception -> 0x0446 }
            if (r2 != r0) goto L_0x03ad
            r0 = 0
            goto L_0x03cd
        L_0x03ad:
            X.4bm r2 = new X.4bm     // Catch:{ Exception -> 0x0446 }
            r2.<init>(r12, r11)     // Catch:{ Exception -> 0x0446 }
            r2.A0b()     // Catch:{ Exception -> 0x0446 }
            r2.A0t(r1)     // Catch:{ Exception -> 0x0446 }
            r2.A13(r15)     // Catch:{ Exception -> 0x0446 }
            r2.A0Y()     // Catch:{ Exception -> 0x0446 }
            X.Qhf r2 = r2.A10(r12)     // Catch:{ Exception -> 0x0446 }
            r2.A1J()     // Catch:{ Exception -> 0x0446 }
            r0 = r6[r4]     // Catch:{ Exception -> 0x0446 }
            X.QkR r0 = r0.A01     // Catch:{ Exception -> 0x0446 }
            java.lang.Object r0 = r0.A0C(r2, r11)     // Catch:{ Exception -> 0x0446 }
        L_0x03cd:
            r14[r4] = r0     // Catch:{ Exception -> 0x0446 }
        L_0x03cf:
            X.QkR r2 = r3.A01     // Catch:{ Exception -> 0x0446 }
            int r0 = r2.A02()     // Catch:{ Exception -> 0x0446 }
            if (r0 < 0) goto L_0x0405
            r0 = r14[r4]     // Catch:{ Exception -> 0x0446 }
            r8.A03(r2, r0)     // Catch:{ Exception -> 0x0446 }
            X.QkR r2 = r3.A00     // Catch:{ Exception -> 0x0446 }
            if (r2 == 0) goto L_0x0405
            int r0 = r2.A02()     // Catch:{ Exception -> 0x0446 }
            if (r0 < 0) goto L_0x0405
            X.4eF r0 = r2.A04     // Catch:{ Exception -> 0x0446 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class r0 = r0.A00     // Catch:{ Exception -> 0x0446 }
            if (r0 == r3) goto L_0x0402
            X.4bm r0 = new X.4bm     // Catch:{ Exception -> 0x0446 }
            r0.<init>(r12, r11)     // Catch:{ Exception -> 0x0446 }
            r0.A0t(r1)     // Catch:{ Exception -> 0x0446 }
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r2.A03()     // Catch:{ Exception -> 0x0446 }
            X.Qhf r0 = X.Pxi.A0N(r0)     // Catch:{ Exception -> 0x0446 }
            java.lang.Object r1 = r1.A0D(r0, r11)     // Catch:{ Exception -> 0x0446 }
        L_0x0402:
            r8.A03(r2, r1)     // Catch:{ Exception -> 0x0446 }
        L_0x0405:
            int r4 = r4 + 1
            goto L_0x032b
        L_0x0409:
            X.4eF r2 = r9.A00     // Catch:{ Exception -> 0x0446 }
            X.QkR r0 = r3.A01     // Catch:{ Exception -> 0x0446 }
            X.4f7 r0 = r0.A06     // Catch:{ Exception -> 0x0446 }
            java.lang.String r5 = r0.A02     // Catch:{ Exception -> 0x0446 }
            java.lang.String r0 = r3.A03     // Catch:{ Exception -> 0x0446 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x0446 }
            java.lang.String r0 = "Missing external type id property '%s'"
        L_0x0419:
            java.lang.Class r3 = r2.A00     // Catch:{ Exception -> 0x0446 }
            java.lang.String r2 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x0446 }
            X.16F r1 = r11.A07     // Catch:{ Exception -> 0x0446 }
            X.Qi2 r0 = new X.Qi2     // Catch:{ Exception -> 0x0446 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0446 }
            if (r5 == 0) goto L_0x042b
            r0.A08(r3, r5)     // Catch:{ Exception -> 0x0446 }
        L_0x042b:
            throw r0     // Catch:{ Exception -> 0x0446 }
        L_0x042c:
            java.lang.Object r2 = r10.A02(r11, r8)     // Catch:{ Exception -> 0x0446 }
        L_0x0430:
            r0 = r17
            if (r5 >= r0) goto L_0x012f
            r0 = r6[r5]     // Catch:{ Exception -> 0x0446 }
            X.QkR r1 = r0.A01     // Catch:{ Exception -> 0x0446 }
            int r0 = r1.A02()     // Catch:{ Exception -> 0x0446 }
            if (r0 >= 0) goto L_0x0443
            r0 = r14[r5]     // Catch:{ Exception -> 0x0446 }
            r1.A0L(r2, r0)     // Catch:{ Exception -> 0x0446 }
        L_0x0443:
            int r5 = r5 + 1
            goto L_0x0430
        L_0x0446:
            r0 = move-exception
            r13.A1F(r11, r0)
            goto L_0x04a8
        L_0x044b:
            X.SK6 r0 = r13.A09
            java.lang.Object r2 = r0.A04(r11)
            r12.A0t(r2)
            boolean r0 = r12.A0a()
            if (r0 == 0) goto L_0x0463
            java.lang.Object r0 = r12.A0W()
            if (r0 == 0) goto L_0x0463
            r13.A1A(r12, r11, r2, r0)
        L_0x0463:
            X.Pxi.A1E(r11, r13)
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x0472
            java.lang.Class r0 = r11.A05
            if (r0 == 0) goto L_0x0472
            r13.A1J(r12, r11, r0, r2)
            return r2
        L_0x0472:
            boolean r0 = r12.A18(r1)
            if (r0 == 0) goto L_0x012f
            java.lang.String r1 = r12.A0Y()
        L_0x047c:
            X.QkR r0 = X.TAR.A01(r12, r13, r1)
            if (r0 == 0) goto L_0x0486
            r0.A0K(r2, r12, r11)     // Catch:{ Exception -> 0x0490 }
            goto L_0x0489
        L_0x0486:
            r13.A1C(r12, r11, r2, r1)
        L_0x0489:
            java.lang.String r1 = r12.A1N()
            if (r1 != 0) goto L_0x047c
            return r2
        L_0x0490:
            r0 = move-exception
            r13.A1E(r11, r2, r1, r0)
            goto L_0x04a8
        L_0x0495:
            java.lang.Class r1 = r2.getClass()
            X.4eF r3 = r13.A08
            java.lang.Class r0 = r3.A00
            if (r1 == r0) goto L_0x04be
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            java.lang.String r0 = "Cannot create polymorphic instances with external type ids (%s -> %s)"
            X.Pxf.A1H(r11, r3, r0, r1)
        L_0x04a8:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04ad:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r13.A01
            X.SK6 r1 = r13.A09
            if (r0 != 0) goto L_0x0127
            java.lang.Object r2 = r1.A04(r11)
            X.SJZ r0 = r13.A03
            X.SJZ r9 = new X.SJZ
            r9.<init>(r0)
        L_0x04be:
            r13.A1I(r12, r11, r9, r2)
            return r2
        L_0x04c2:
            r5.A0Z()
        L_0x04c5:
            X.SGe r0 = r13.A05
            r0.A00(r11, r5, r2)
            return r2
        L_0x04cb:
            java.lang.Object r2 = r13.A17(r12, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializer.A1G(X.16F, X.4fV):java.lang.Object");
    }

    public final void A1I(16F r6, C269674fV r7, SJZ sjz, Object obj) {
        Class cls;
        if (this.A0F) {
            cls = r7.A05;
        } else {
            cls = null;
        }
        16L A10 = r6.A10();
        while (A10 == 16L.A0A) {
            String A0Y = r6.A0Y();
            16L A1J = r6.A1J();
            C8218QkR A02 = this.A0A.A02(A0Y);
            if (A02 != null) {
                if (A1J.A03) {
                    sjz.A00(r6, r7, obj, A0Y);
                }
                if (cls == null || A02.A0R(cls)) {
                    try {
                        A02.A0K(obj, r6, r7);
                    } catch (Exception e) {
                        A1E(r7, obj, A0Y, e);
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    r6.A0z();
                }
            } else if (SQ7.A01(this, A0Y)) {
                A1B(r6, r7, obj, A0Y);
            } else if (!sjz.A03(r6, r7, obj, A0Y)) {
                C12829T9a t9a = this.A02;
                if (t9a != null) {
                    t9a.A01(r6, r7, obj, A0Y);
                } else {
                    A0r(r6, r7, obj, A0Y);
                }
            }
            A10 = r6.A1J();
        }
        sjz.A02(obj, r6, r7);
    }

    public final Object A0C(16F r6, C269674fV r7, Object obj) {
        String str;
        Class cls;
        Class cls2;
        r6.A0t(obj);
        Pxi.A1E(r7, this);
        if (this.A05 != null) {
            16L A10 = r6.A10();
            if (A10 == 16L.A0D) {
                A10 = r6.A1J();
            }
            C267574bm r3 = new C267574bm(r6, r7);
            r3.A0c();
            if (this.A0F) {
                cls2 = r7.A05;
            } else {
                cls2 = null;
            }
            while (A10 == 16L.A0A) {
                str = r6.A0Y();
                C8218QkR A02 = this.A0A.A02(str);
                r6.A1J();
                if (A02 != null) {
                    if (cls2 == null || A02.A0R(cls2)) {
                        try {
                            A02.A0K(obj, r6, r7);
                        } catch (Exception e) {
                            A1E(r7, obj, str, e);
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else {
                        r6.A0z();
                    }
                } else if (SQ7.A01(this, str)) {
                    A1B(r6, r7, obj, str);
                } else if (this.A02 == null) {
                    r3.A0q(str);
                    r3.A13(r6);
                } else {
                    C267574bm r0 = new C267574bm(r6, r7);
                    r0.A13(r6);
                    r3.A0q(str);
                    r3.A17(r0);
                    this.A02.A01(Pxi.A0N(r0), r7, obj, str);
                }
                A10 = r6.A1J();
            }
            r3.A0Z();
            this.A05.A00(r7, r3, obj);
        } else {
            SJZ sjz = this.A03;
            if (sjz != null) {
                A1I(r6, r7, new SJZ(sjz), obj);
                return obj;
            }
            if (r6.A17()) {
                str = r6.A1N();
                if (str == null) {
                    return obj;
                }
            } else if (r6.A18(5)) {
                str = r6.A0Y();
            }
            if (!this.A0F || (cls = r7.A05) == null) {
                do {
                    C8218QkR A012 = TAR.A01(r6, this, str);
                    if (A012 != null) {
                        A012.A0K(obj, r6, r7);
                    } else {
                        A1C(r6, r7, obj, str);
                    }
                    str = r6.A1N();
                } while (str != null);
                return obj;
            }
            A1J(r6, r7, cls, obj);
            return obj;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        r1 = r4.A08;
        r0 = r3.getClass();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.16F r5, X.C269674fV r6) {
        /*
            r4 = this;
            boolean r0 = r5.A17()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x00b0
            r5.A1J()
            java.lang.Object r3 = r4.A00(r5, r6)
        L_0x0011:
            return r3
        L_0x0012:
            X.16L r0 = r5.A10()
            if (r0 == 0) goto L_0x001f
            int r0 = r0.ordinal()
            switch(r0) {
                case 2: goto L_0x00a7;
                case 3: goto L_0x00a2;
                case 4: goto L_0x001f;
                case 5: goto L_0x00a7;
                case 6: goto L_0x004d;
                case 7: goto L_0x008e;
                case 8: goto L_0x0093;
                case 9: goto L_0x0098;
                case 10: goto L_0x009d;
                case 11: goto L_0x009d;
                case 12: goto L_0x0027;
                default: goto L_0x001f;
            }
        L_0x001f:
            X.Pxf.A1G(r5, r6, r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0027:
            boolean r0 = r5.A0e()
            if (r0 == 0) goto L_0x001f
            X.4bm r0 = new X.4bm
            r0.<init>(r5, r6)
            r0.A0Z()
            X.Qhf r1 = r0.A10(r5)
            r1.A1J()
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0048
            java.lang.Object r3 = r4.A00(r1, r6)
        L_0x0044:
            r1.close()
            return r3
        L_0x0048:
            java.lang.Object r3 = r4.A1G(r1, r6)
            goto L_0x0044
        L_0x004d:
            X.T9I r0 = r4.A0B
            if (r0 == 0) goto L_0x0056
            java.lang.Object r3 = r4.A16(r5, r6)
            return r3
        L_0x0056:
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r4.A01
            if (r2 != 0) goto L_0x005e
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r4.A00
            if (r2 == 0) goto L_0x006b
        L_0x005e:
            X.SK6 r1 = r4.A09
            boolean r0 = r1.A0J()
            if (r0 != 0) goto L_0x006b
            java.lang.Object r3 = X.SK6.A02(r5, r6, r2, r4, r1)
            return r3
        L_0x006b:
            java.lang.Object r3 = r5.A0V()
            if (r3 == 0) goto L_0x0011
            X.4eF r1 = r4.A08
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r1 = r1.A00
            if (r1 == r0) goto L_0x0011
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 != 0) goto L_0x0011
            X.4f9 r0 = r6.A02
            X.RsG r0 = r0.A08
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = "handleWeirdNativeValue"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x008e:
            java.lang.Object r3 = r4.A18(r5, r6)
            return r3
        L_0x0093:
            java.lang.Object r3 = r4.A15(r5, r6)
            return r3
        L_0x0098:
            java.lang.Object r3 = r4.A14(r5, r6)
            return r3
        L_0x009d:
            java.lang.Object r3 = r4.A13(r5, r6)
            return r3
        L_0x00a2:
            java.lang.Object r3 = r4.A0h(r5, r6)
            return r3
        L_0x00a7:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r3 = r4.A00(r5, r6)
            return r3
        L_0x00b0:
            r5.A1J()
        L_0x00b3:
            java.lang.Object r3 = r4.A1G(r5, r6)
            return r3
        L_0x00b8:
            X.16F r2 = r6.A07
            java.lang.String r1 = X.C269574fL.A06(r1)
            java.lang.String r0 = X.C269574fL.A07(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.Qk1 r0 = new X.Qk1
            r0.<init>(r2, r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }

    public final Object A1H(16F r4, C269674fV r5, C8218QkR qkR) {
        try {
            return qkR.A0C(r4, r5);
        } catch (Exception e) {
            A1E(r5, this.A08.A00, qkR.A06.A02, e);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
