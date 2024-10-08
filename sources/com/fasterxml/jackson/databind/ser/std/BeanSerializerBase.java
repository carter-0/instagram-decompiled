package com.fasterxml.jackson.databind.ser.std;

import X.16L;
import X.17Z;
import X.AnonymousClass00P;
import X.AnonymousClass5EG;
import X.AnonymousClass7TF;
import X.C10695RwZ;
import X.C10751RxV;
import X.C10798RyK;
import X.C13782Tgx;
import X.C13901TjO;
import X.C268854eA;
import X.C268894eF;
import X.C268944eK;
import X.C269134ed;
import X.C269324ew;
import X.C269434f7;
import X.C269504fE;
import X.C269574fL;
import X.C269714fZ;
import X.C8208QkH;
import X.C8244Qkx;
import X.DbS;
import X.S4W;
import X.SPK;
import X.SQ7;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer;
import com.fasterxml.jackson.datatype.guava.ser.TableSerializer;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public abstract class BeanSerializerBase extends StdSerializer implements C269714fZ, AnonymousClass5EG {
    public static final C8244Qkx[] A08 = new C8244Qkx[0];
    public final C10695RwZ A00;
    public final C10751RxV A01;
    public final Object A02;
    public final C8244Qkx[] A03;
    public final C8244Qkx[] A04;
    public final C269324ew A05;
    public final C268894eF A06;
    public final C8208QkH A07;

    public BeanSerializerBase(C268894eF r2, C8208QkH qkH, C269134ed r4, C10695RwZ rwZ, C10751RxV rxV, Object obj, C8244Qkx[] qkxArr, C8244Qkx[] qkxArr2) {
        super(r2);
        this.A06 = r2;
        this.A04 = qkxArr;
        this.A03 = qkxArr2;
        this.A07 = qkH;
        this.A00 = rwZ;
        this.A02 = obj;
        this.A01 = rxV;
        this.A05 = r4.A00().A00;
    }

    static {
        C269434f7 r0 = C269434f7.A03;
        Iterator it = C269574fL.A00;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set set, Set set2) {
        super(beanSerializerBase.A00);
        ArrayList A0v;
        this.A06 = beanSerializerBase.A06;
        C8244Qkx[] qkxArr = beanSerializerBase.A04;
        C8244Qkx[] qkxArr2 = beanSerializerBase.A03;
        int length = qkxArr.length;
        ArrayList A0v2 = DbS.A0v(length);
        C8244Qkx[] qkxArr3 = null;
        if (qkxArr2 == null) {
            A0v = null;
        } else {
            A0v = DbS.A0v(length);
        }
        for (int i = 0; i < length; i++) {
            C8244Qkx qkx = qkxArr[i];
            if (!SQ7.A02(qkx.A04.A03, set, set2)) {
                A0v2.add(qkx);
                if (qkxArr2 != null) {
                    A0v.add(qkxArr2[i]);
                }
            }
        }
        this.A04 = (C8244Qkx[]) A0v2.toArray(new C8244Qkx[A0v2.size()]);
        this.A03 = A0v != null ? (C8244Qkx[]) A0v.toArray(new C8244Qkx[A0v.size()]) : qkxArr3;
        this.A07 = beanSerializerBase.A07;
        this.A00 = beanSerializerBase.A00;
        this.A01 = beanSerializerBase.A01;
        this.A02 = beanSerializerBase.A02;
        this.A05 = beanSerializerBase.A05;
    }

    public final boolean A06() {
        return AnonymousClass7TF.A1V(this.A01);
    }

    public void A09(17Z r3, C269504fE r4, SPK spk, Object obj) {
        if (this.A01 != null) {
            A0G(r3, r4, spk, obj);
            return;
        }
        C10798RyK A0E = A0E(16L.A0D, spk, obj);
        spk.A03(r3, A0E);
        r3.A0F(obj);
        Object obj2 = this.A02;
        if (obj2 != null) {
            A0D(r4, obj2);
            throw AnonymousClass00P.createAndThrow();
        }
        A0H(r3, r4, obj);
        spk.A04(r3, A0E);
    }

    public final C10798RyK A0E(16L r3, SPK spk, Object obj) {
        C8208QkH qkH = this.A07;
        if (qkH == null) {
            return spk.A05(r3, obj);
        }
        Object A0A = qkH.A0A(obj);
        if (A0A == null) {
            A0A = "";
        }
        C10798RyK A052 = spk.A05(r3, obj);
        A052.A04 = A0A;
        return A052;
    }

    public final BeanSerializerBase A0F(C10751RxV rxV) {
        if (this instanceof UnwrappingBeanSerializer) {
            return new UnwrappingBeanSerializer(rxV, (UnwrappingBeanSerializer) this);
        }
        if (this instanceof BeanAsArraySerializer) {
            return ((BeanAsArraySerializer) this).A00.A0F(rxV);
        }
        return new BeanSerializerBase(rxV, this, this.A02);
    }

    public final void A0G(17Z r5, C269504fE r6, SPK spk, Object obj) {
        C10751RxV rxV = this.A01;
        S4W A0Q = r6.A0Q(rxV.A00, obj);
        if (!A0Q.A01(r5, r6, rxV)) {
            Object obj2 = A0Q.A00;
            if (obj2 == null) {
                obj2 = A0Q.A02.A01(obj);
                A0Q.A00 = obj2;
            }
            if (rxV.A04) {
                rxV.A03.A0A(r5, r6, obj2);
                return;
            }
            C10798RyK A0E = A0E(16L.A0D, spk, obj);
            spk.A03(r5, A0E);
            r5.A0F(obj);
            A0Q.A00(r5, r6, rxV);
            Object obj3 = this.A02;
            if (obj3 != null) {
                A0D(r6, obj3);
                throw AnonymousClass00P.createAndThrow();
            }
            A0H(r5, r6, obj);
            spk.A04(r5, A0E);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        r1 = r3.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(X.17Z r8, X.C269504fE r9, java.lang.Object r10) {
        /*
            r7 = this;
            java.lang.String r2 = "[anySetter]"
            X.Qkx[] r5 = r7.A03
            if (r5 == 0) goto L_0x000c
            java.lang.Class r0 = r9.A07
            if (r0 == 0) goto L_0x000c
        L_0x000a:
            r4 = 0
            goto L_0x000f
        L_0x000c:
            X.Qkx[] r5 = r7.A04
            goto L_0x000a
        L_0x000f:
            int r1 = r5.length     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
        L_0x0010:
            if (r4 >= r1) goto L_0x001c
            r0 = r5[r4]     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            if (r0 == 0) goto L_0x0019
            r0.A02(r8, r9, r10)     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
        L_0x0019:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x001c:
            X.RwZ r3 = r7.A00     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            if (r3 == 0) goto L_0x0057
            X.QkH r1 = r3.A03     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            java.lang.Object r6 = r1.A0A(r10)     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            if (r6 == 0) goto L_0x0057
            boolean r0 = r6 instanceof java.util.Map     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            if (r0 != 0) goto L_0x0048
            X.TjO r0 = r3.A02     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            X.4eF r3 = r0.CAJ()     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            java.lang.String r1 = r1.A05()     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            java.lang.String r0 = X.C66581MXm.A0y(r6)     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            java.lang.String r0 = "Value returned by 'any-getter' %s() not java.util.Map but %s"
            X.Pxf.A1H(r9, r3, r0, r1)     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            throw r0     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
        L_0x0048:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r0 = r3.A01     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            if (r0 == 0) goto L_0x0052
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            r0.A0F(r8, r9, r6)     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            return
        L_0x0052:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r3.A00     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
            r0.A0A(r8, r9, r6)     // Catch:{ Exception -> 0x006d, StackOverflowError -> 0x0058 }
        L_0x0057:
            return
        L_0x0058:
            r3 = move-exception
            java.lang.String r0 = "Infinite recursion (StackOverflowError)"
            X.4iD r1 = new X.4iD
            r1.<init>(r8, r0, r3)
            int r0 = r5.length
            if (r4 == r0) goto L_0x0069
            r0 = r5[r4]
            X.15y r0 = r0.A04
            java.lang.String r2 = r0.A03
        L_0x0069:
            r1.A08(r10, r2)
            throw r1
        L_0x006d:
            r1 = move-exception
            int r0 = r5.length
            if (r4 == r0) goto L_0x0077
            r0 = r5[r4]
            X.15y r0 = r0.A04
            java.lang.String r2 = r0.A03
        L_0x0077:
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A01(r9, r10, r2, r1)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.A0H(X.17Z, X.4fE, java.lang.Object):void");
    }

    public final void A0I(17Z r5, C269504fE r6, Object obj, boolean z) {
        C10751RxV rxV = this.A01;
        S4W A0Q = r6.A0Q(rxV.A00, obj);
        if (!A0Q.A01(r5, r6, rxV)) {
            Object obj2 = A0Q.A00;
            if (obj2 == null) {
                obj2 = A0Q.A02.A01(obj);
                A0Q.A00 = obj2;
            }
            if (rxV.A04) {
                rxV.A03.A0A(r5, r6, obj2);
                return;
            }
            if (z) {
                r5.A0o(obj);
            }
            A0Q.A00(r5, r6, rxV);
            Object obj3 = this.A02;
            if (obj3 != null) {
                A0D(r6, obj3);
                throw AnonymousClass00P.createAndThrow();
            }
            A0H(r5, r6, obj);
            if (z) {
                r5.A0Z();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v23, types: [com.fasterxml.jackson.databind.ser.std.EnumSerializer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r25, X.C269504fE r26) {
        /*
            r24 = this;
            r7 = r26
            X.4et r14 = r7.A05
            X.4eA r12 = r14.A01()
            r16 = 0
            r8 = r25
            if (r25 == 0) goto L_0x0248
            if (r12 == 0) goto L_0x0248
            X.QkH r11 = r8.BRS()
        L_0x0014:
            r9 = r24
            java.lang.Class r13 = r9.A00
            X.4ev r4 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r8, r7, r13)
            r15 = 5
            r5 = 8
            r10 = 0
            if (r4 == 0) goto L_0x0244
            X.4ew r6 = r4.A00
            X.4ew r0 = X.C269324ew.ANY
            if (r6 == r0) goto L_0x0244
            X.4ew r0 = r9.A05
            if (r6 == r0) goto L_0x0045
            X.4eF r2 = r9.A06
            java.lang.Class r3 = r2.A00
            java.util.Iterator r0 = X.C269574fL.A00
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L_0x020f
            int r1 = r6.ordinal()
            if (r1 == r5) goto L_0x024f
            if (r1 == r15) goto L_0x024f
            r0 = 7
            if (r1 == r0) goto L_0x024f
        L_0x0045:
            X.RxV r1 = r9.A01
            r23 = r1
            if (r11 == 0) goto L_0x0208
            X.T9o r2 = r12.A05(r11)
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0204
            java.util.Set r5 = java.util.Collections.emptySet()
        L_0x0057:
            X.T9f r0 = r12.A07(r11)
            java.util.Set r4 = r0.A00
            X.SHd r0 = r12.A0H(r11)
            if (r0 != 0) goto L_0x0169
            if (r1 == 0) goto L_0x008c
            r0 = r16
            X.SHd r0 = r12.A0I(r11, r0)
            if (r0 == 0) goto L_0x008c
            boolean r14 = r0.A04
            boolean r0 = r1.A04
            if (r14 == r0) goto L_0x008c
            X.4eF r13 = r1.A02
            X.15z r3 = r1.A01
            X.T9X r2 = r1.A00
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A03
            X.RxV r1 = new X.RxV
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r13
            r21 = r0
            r22 = r14
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x008c:
            r2 = r16
        L_0x008e:
            r14 = 0
        L_0x008f:
            java.lang.Object r3 = r12.A0a(r11)
            if (r3 == 0) goto L_0x0166
            java.lang.Object r0 = r9.A02
            if (r0 == 0) goto L_0x009f
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0166
        L_0x009f:
            if (r14 <= 0) goto L_0x020c
            X.Qkx[] r11 = r9.A04
            int r0 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)
            X.Qkx[] r11 = (X.C8244Qkx[]) r11
            r0 = r11[r14]
            r13 = 1
            java.lang.System.arraycopy(r11, r10, r11, r13, r14)
            r11[r10] = r0
            X.Qkx[] r12 = r9.A03
            if (r12 == 0) goto L_0x00c4
            int r0 = r12.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r12, r0)
            X.Qkx[] r2 = (X.C8244Qkx[]) r2
            r0 = r2[r14]
            java.lang.System.arraycopy(r2, r10, r2, r13, r14)
            r2[r10] = r0
        L_0x00c4:
            r12 = r9
            boolean r0 = r9 instanceof com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
            if (r0 == 0) goto L_0x015b
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer r12 = (com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer) r12
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer r10 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
            r10.<init>((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer) r12, (X.C8244Qkx[]) r11, (X.C8244Qkx[]) r2)
        L_0x00d0:
            if (r1 == 0) goto L_0x00ef
            X.4eF r11 = r1.A02
            com.fasterxml.jackson.databind.JsonSerializer r16 = r7.A0E(r8, r11)
            X.15z r2 = r1.A01
            X.T9X r13 = r1.A00
            boolean r0 = r1.A04
            X.RxV r12 = new X.RxV
            r14 = r2
            r15 = r11
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r0 = r23
            if (r12 == r0) goto L_0x00ef
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r10 = r10.A0F(r12)
        L_0x00ef:
            if (r5 == 0) goto L_0x00f7
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00f9
        L_0x00f7:
            if (r4 == 0) goto L_0x0105
        L_0x00f9:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
            if (r0 == 0) goto L_0x014b
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer r10 = (com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer) r10
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer r0 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
            r0.<init>((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer) r10, (java.util.Set) r5, (java.util.Set) r4)
        L_0x0104:
            r10 = r0
        L_0x0105:
            if (r3 == 0) goto L_0x0115
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
            if (r0 == 0) goto L_0x0137
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer r10 = (com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer) r10
            X.RxV r0 = r10.A01
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer r1 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
            r1.<init>((X.C10751RxV) r0, (com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer) r10, (java.lang.Object) r3)
        L_0x0114:
            r10 = r1
        L_0x0115:
            if (r6 != 0) goto L_0x0119
            X.4ew r6 = r9.A05
        L_0x0119:
            X.4ew r0 = X.C269324ew.ARRAY
            if (r6 != r0) goto L_0x024e
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
            if (r0 != 0) goto L_0x024d
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer
            if (r0 != 0) goto L_0x024d
            X.RxV r0 = r10.A01
            if (r0 != 0) goto L_0x024c
            X.RwZ r0 = r10.A00
            if (r0 != 0) goto L_0x024c
            java.lang.Object r0 = r10.A02
            if (r0 != 0) goto L_0x024c
            com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer r0 = new com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer
            r0.<init>(r10)
            return r0
        L_0x0137:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer
            if (r0 == 0) goto L_0x0143
            X.RxV r0 = r10.A01
            com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer r1 = new com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer
            r1.<init>((X.C10751RxV) r0, (com.fasterxml.jackson.databind.ser.std.BeanSerializerBase) r10, (java.lang.Object) r3)
            goto L_0x0114
        L_0x0143:
            X.RxV r0 = r10.A01
            com.fasterxml.jackson.databind.ser.BeanSerializer r1 = new com.fasterxml.jackson.databind.ser.BeanSerializer
            r1.<init>((X.C10751RxV) r0, (com.fasterxml.jackson.databind.ser.std.BeanSerializerBase) r10, (java.lang.Object) r3)
            goto L_0x0114
        L_0x014b:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer
            if (r0 == 0) goto L_0x0155
            com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer r0 = new com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer
            r0.<init>((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase) r10, (java.util.Set) r5, (java.util.Set) r4)
            goto L_0x0104
        L_0x0155:
            com.fasterxml.jackson.databind.ser.BeanSerializer r0 = new com.fasterxml.jackson.databind.ser.BeanSerializer
            r0.<init>((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase) r10, (java.util.Set) r5, (java.util.Set) r4)
            goto L_0x0104
        L_0x015b:
            boolean r0 = r9 instanceof com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer
            if (r0 != 0) goto L_0x020c
            com.fasterxml.jackson.databind.ser.BeanSerializer r10 = new com.fasterxml.jackson.databind.ser.BeanSerializer
            r10.<init>((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase) r9, (X.C8244Qkx[]) r11, (X.C8244Qkx[]) r2)
            goto L_0x00d0
        L_0x0166:
            r3 = r2
            goto L_0x009f
        L_0x0169:
            X.SHd r3 = r12.A0I(r11, r0)
            java.lang.Class r1 = r3.A01
            if (r1 != 0) goto L_0x01d7
            r2 = 0
        L_0x0172:
            java.lang.Class<X.T9X> r0 = X.T9X.class
            X.4eF[] r0 = X.AnonymousClass4eE.A03(r2, r0)
            r20 = r0[r10]
            java.lang.Class<X.QhX> r0 = X.C8138QhX.class
            if (r1 != r0) goto L_0x01e0
            X.4f7 r0 = r3.A00
            java.lang.String r15 = r0.A02
            X.Qkx[] r2 = r9.A04
            int r0 = r2.length
            r17 = r0
            r14 = 0
        L_0x0188:
            r0 = r17
            if (r14 != r0) goto L_0x01a9
            X.4eF r2 = r9.A06
            java.lang.String r1 = X.C269574fL.A06(r13)
            if (r15 != 0) goto L_0x01a4
            java.lang.String r0 = "[null]"
        L_0x0196:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Invalid Object Id definition for %s: cannot find property with name %s"
            X.Pxf.A1H(r7, r2, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01a4:
            java.lang.String r0 = X.C269574fL.A08(r15)
            goto L_0x0196
        L_0x01a9:
            r1 = r2[r14]
            X.15y r0 = r1.A04
            java.lang.String r0 = r0.A03
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x01d4
            X.4eF r13 = r1.A06
            java.lang.Class r2 = r3.A03
            X.QhW r0 = new X.QhW
            r0.<init>(r1, r2)
            r2 = 0
            boolean r3 = r3.A04
            X.RxV r1 = new X.RxV
            r17 = r1
            r18 = r0
            r19 = r2
            r20 = r13
            r21 = r2
            r22 = r3
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x008f
        L_0x01d4:
            int r14 = r14 + 1
            goto L_0x0188
        L_0x01d7:
            X.4eE r0 = r7.A05()
            X.4eF r2 = r0.A09(r1)
            goto L_0x0172
        L_0x01e0:
            r2 = 0
            X.T9X r18 = r7.A02(r3)
            X.4f7 r0 = r3.A00
            boolean r13 = r3.A04
            r3 = 0
            if (r0 == 0) goto L_0x01f5
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x01f5
            X.15y r3 = new X.15y
            r3.<init>(r0)
        L_0x01f5:
            X.RxV r1 = new X.RxV
            r17 = r1
            r19 = r3
            r21 = r2
            r22 = r13
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x008e
        L_0x0204:
            java.util.Set r5 = r2.A00
            goto L_0x0057
        L_0x0208:
            r3 = r16
            r4 = r3
            r5 = r3
        L_0x020c:
            r10 = r9
            goto L_0x00d0
        L_0x020f:
            X.4ew r0 = X.C269324ew.NATURAL
            if (r6 != r0) goto L_0x0045
            boolean r0 = r2.A0O()
            if (r0 == 0) goto L_0x0223
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r13)
            if (r0 == 0) goto L_0x0223
            goto L_0x0045
        L_0x0223:
            java.lang.Class<java.util.Map$Entry> r1 = java.util.Map.Entry.class
            boolean r0 = r1.isAssignableFrom(r13)
            if (r0 == 0) goto L_0x0045
            X.4eF r1 = r2.A0B(r1)
            X.4eF r12 = X.Pxi.A0L(r1, r10)
            r0 = 1
            X.4eF r13 = X.Pxi.A0L(r1, r0)
            com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer r1 = new com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer
            r14 = r16
            r15 = r10
            r9 = r1
            r10 = r8
            r11 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x0262
        L_0x0244:
            r6 = r16
            goto L_0x0045
        L_0x0248:
            r11 = r16
            goto L_0x0014
        L_0x024c:
            return r10
        L_0x024d:
            return r10
        L_0x024e:
            return r10
        L_0x024f:
            r14.A02(r2)
            X.T9d r2 = X.C12831T9d.A00(r14, r3)
            r1 = 1
            r0 = r16
            java.lang.Boolean r0 = com.fasterxml.jackson.databind.ser.std.EnumSerializer.A03(r4, r0, r3, r1)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer r1 = new com.fasterxml.jackson.databind.ser.std.EnumSerializer
            r1.<init>(r2, r0)
        L_0x0262:
            boolean r0 = r1 instanceof X.C269714fZ
            com.fasterxml.jackson.databind.JsonSerializer r10 = X.Pxi.A0M(r8, r1, r7, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final void EIT(C269504fE r22) {
        int length;
        C269504fE r10;
        JsonSerializer A0E;
        SPK spk;
        MapSerializer mapSerializer;
        ContainerSerializer containerSerializer;
        C8244Qkx qkx;
        C8208QkH qkH;
        Object A0d;
        JsonSerializer jsonSerializer;
        C8244Qkx qkx2;
        C8244Qkx[] qkxArr = this.A03;
        int i = 0;
        if (qkxArr == null) {
            length = 0;
        } else {
            length = qkxArr.length;
        }
        C8244Qkx[] qkxArr2 = this.A04;
        int length2 = qkxArr2.length;
        while (true) {
            r10 = r22;
            if (i >= length2) {
                break;
            }
            C8244Qkx qkx3 = qkxArr2[i];
            if (!qkx3.A0A && qkx3.A01 == null && (jsonSerializer = r10.A01) != null) {
                qkx3.A03(jsonSerializer);
                if (i < length && (qkx2 = qkxArr[i]) != null) {
                    qkx2.A03(jsonSerializer);
                }
            }
            if (qkx3.A02 == null) {
                C268854eA A012 = r10.A05.A01();
                JsonSerializer jsonSerializer2 = null;
                if (A012 == null || (qkH = qkx3.A08) == null || (A0d = A012.A0d(qkH)) == null) {
                    C268894eF r1 = qkx3.A05;
                    if (r1 == null) {
                        r1 = qkx3.A06;
                        C268894eF r2 = r1;
                        if (!Modifier.isFinal(r1.A00.getModifiers())) {
                            if (r1.A0N() || ((C268944eK) r2).A01.A01.length > 0) {
                                qkx3.A00 = r1;
                            }
                        }
                    }
                    A0E = r10.A0E(qkx3, r1);
                    if (r1.A0N() && (spk = (SPK) r1.A03().A01) != null && (A0E instanceof ContainerSerializer)) {
                        ContainerSerializer containerSerializer2 = (ContainerSerializer) A0E;
                        if (containerSerializer2 instanceof TableSerializer) {
                            containerSerializer = new TableSerializer(spk, (TableSerializer) containerSerializer2);
                        } else if (containerSerializer2 instanceof MultimapSerializer) {
                            MultimapSerializer multimapSerializer = (MultimapSerializer) containerSerializer2;
                            C13901TjO tjO = multimapSerializer.A01;
                            JsonSerializer jsonSerializer3 = multimapSerializer.A02;
                            JsonSerializer jsonSerializer4 = multimapSerializer.A03;
                            Set set = multimapSerializer.A05;
                            SPK spk2 = spk;
                            containerSerializer = new MultimapSerializer(tjO, jsonSerializer3, jsonSerializer4, spk2, multimapSerializer, multimapSerializer.A04, set, multimapSerializer.A06);
                        } else {
                            if (containerSerializer2 instanceof MapSerializer) {
                                MapSerializer mapSerializer2 = (MapSerializer) containerSerializer2;
                                SPK spk3 = mapSerializer2.A05;
                                mapSerializer = mapSerializer2;
                                if (spk3 != spk) {
                                    C269574fL.A0E(MapSerializer.class, mapSerializer2, "_withValueTypeSerializer");
                                    containerSerializer = new MapSerializer(spk, mapSerializer2, mapSerializer2.A08, mapSerializer2.A0A);
                                }
                            } else {
                                boolean z = containerSerializer2 instanceof StdArraySerializers$TypedPrimitiveArraySerializer;
                                mapSerializer = containerSerializer2;
                                if (!z) {
                                    boolean z2 = containerSerializer2 instanceof StdArraySerializers$IntArraySerializer;
                                    mapSerializer = containerSerializer2;
                                    if (!z2) {
                                        boolean z3 = containerSerializer2 instanceof StdArraySerializers$DoubleArraySerializer;
                                        mapSerializer = containerSerializer2;
                                        if (!z3) {
                                            boolean z4 = containerSerializer2 instanceof StdArraySerializers$BooleanArraySerializer;
                                            mapSerializer = containerSerializer2;
                                            if (!z4) {
                                                if (containerSerializer2 instanceof ObjectArraySerializer) {
                                                    ObjectArraySerializer objectArraySerializer = (ObjectArraySerializer) containerSerializer2;
                                                    containerSerializer = new ObjectArraySerializer(objectArraySerializer.A02, objectArraySerializer.A00, spk, objectArraySerializer.A04);
                                                } else {
                                                    boolean z5 = containerSerializer2 instanceof StringArraySerializer;
                                                    mapSerializer = containerSerializer2;
                                                    if (!z5) {
                                                        if (containerSerializer2 instanceof MapEntrySerializer) {
                                                            MapEntrySerializer mapEntrySerializer = (MapEntrySerializer) containerSerializer2;
                                                            containerSerializer = new MapEntrySerializer(mapEntrySerializer.A00, mapEntrySerializer.A01, mapEntrySerializer, mapEntrySerializer.A06, mapEntrySerializer.A07);
                                                        } else if (containerSerializer2 instanceof IterableSerializer) {
                                                            AsArraySerializerBase asArraySerializerBase = (AsArraySerializerBase) containerSerializer2;
                                                            containerSerializer = new AsArraySerializerBase(asArraySerializerBase.A01, asArraySerializerBase.A03, spk, asArraySerializerBase, asArraySerializerBase.A05);
                                                        } else {
                                                            boolean z6 = containerSerializer2 instanceof EnumSetSerializer;
                                                            mapSerializer = containerSerializer2;
                                                            if (!z6) {
                                                                if (containerSerializer2 instanceof CollectionSerializer) {
                                                                    AsArraySerializerBase asArraySerializerBase2 = (AsArraySerializerBase) containerSerializer2;
                                                                    containerSerializer = new AsArraySerializerBase(asArraySerializerBase2.A01, asArraySerializerBase2.A03, spk, asArraySerializerBase2, asArraySerializerBase2.A05);
                                                                } else {
                                                                    boolean z7 = containerSerializer2 instanceof IteratorSerializer;
                                                                    AsArraySerializerBase asArraySerializerBase3 = (AsArraySerializerBase) containerSerializer2;
                                                                    C13901TjO tjO2 = asArraySerializerBase3.A01;
                                                                    JsonSerializer jsonSerializer5 = asArraySerializerBase3.A03;
                                                                    Boolean bool = asArraySerializerBase3.A05;
                                                                    if (z7) {
                                                                        containerSerializer = new AsArraySerializerBase(tjO2, jsonSerializer5, spk, asArraySerializerBase3, bool);
                                                                    } else {
                                                                        containerSerializer = new AsArraySerializerBase(tjO2, jsonSerializer5, spk, asArraySerializerBase3, bool);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            containerSerializer = mapSerializer;
                        }
                        A0E = containerSerializer;
                    }
                } else {
                    C13782Tgx A062 = r10.A06(A0d);
                    C268894eF BZZ = A062.BZZ(r10.A05());
                    if (BZZ.A00 != Object.class) {
                        jsonSerializer2 = r10.A0E(qkx3, BZZ);
                    }
                    A0E = new StdDelegatingSerializer(BZZ, jsonSerializer2, A062);
                }
                if (i >= length || (qkx = qkxArr[i]) == null) {
                    qkx3.A04(A0E);
                } else {
                    qkx.A04(A0E);
                }
            }
            i++;
        }
        C10695RwZ rwZ = this.A00;
        if (rwZ != null) {
            JsonSerializer jsonSerializer6 = rwZ.A00;
            if (jsonSerializer6 instanceof C269714fZ) {
                C13901TjO tjO3 = rwZ.A02;
                if (jsonSerializer6 != null) {
                    jsonSerializer6 = ((C269714fZ) jsonSerializer6).ALi(tjO3, r10);
                }
                rwZ.A00 = jsonSerializer6;
                if (jsonSerializer6 instanceof MapSerializer) {
                    rwZ.A01 = (MapSerializer) jsonSerializer6;
                }
            }
        }
    }

    public BeanSerializerBase(C10751RxV rxV, BeanSerializerBase beanSerializerBase, Object obj) {
        super(beanSerializerBase.A00);
        this.A06 = beanSerializerBase.A06;
        this.A04 = beanSerializerBase.A04;
        this.A03 = beanSerializerBase.A03;
        this.A07 = beanSerializerBase.A07;
        this.A00 = beanSerializerBase.A00;
        this.A01 = rxV;
        this.A02 = obj;
        this.A05 = beanSerializerBase.A05;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, C8244Qkx[] qkxArr, C8244Qkx[] qkxArr2) {
        super(beanSerializerBase.A00);
        this.A06 = beanSerializerBase.A06;
        this.A04 = qkxArr;
        this.A03 = qkxArr2;
        this.A07 = beanSerializerBase.A07;
        this.A00 = beanSerializerBase.A00;
        this.A01 = beanSerializerBase.A01;
        this.A02 = beanSerializerBase.A02;
        this.A05 = beanSerializerBase.A05;
    }
}
