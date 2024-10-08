package com.fasterxml.jackson.databind.deser;

import X.002;
import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11226SGe;
import X.C11287SJg;
import X.C12436SuR;
import X.C12437SuS;
import X.C12829T9a;
import X.C12837T9j;
import X.C13452Taf;
import X.C13733Tg5;
import X.C267574bm;
import X.C268894eF;
import X.C269054eV;
import X.C269324ew;
import X.C269434f7;
import X.C269454f9;
import X.C269464fA;
import X.C269574fL;
import X.C269674fV;
import X.C269774ff;
import X.C269784fg;
import X.C8146Qhf;
import X.C8157Qhq;
import X.C8199Qk6;
import X.C8207QkG;
import X.C8218QkR;
import X.Pxe;
import X.Pxi;
import X.S6M;
import X.SJZ;
import X.SK6;
import X.SOB;
import X.SQ7;
import X.T9I;
import X.T9Z;
import X.T9n;
import X.TAF;
import X.TAR;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class BeanDeserializerBase extends StdDeserializer implements C269774ff, C269784fg, Serializable {
    public static final C269434f7 A0K = new C269434f7("#temporary-name", (String) null);
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public C12829T9a A02;
    public SJZ A03;
    public SOB A04;
    public C11226SGe A05;
    public boolean A06;
    public boolean A07;
    public final C268894eF A08;
    public final SK6 A09;
    public final TAR A0A;
    public final T9I A0B;
    public final Set A0C;
    public final Set A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final C8157Qhq[] A0G;
    public final C269324ew A0H;
    public final Map A0I;
    public transient HashMap A0J;

    public final boolean A0M() {
        return true;
    }

    public final Object A19(16F r6, C269674fV r7, C267574bm r8, Object obj) {
        JsonDeserializer jsonDeserializer;
        synchronized (this) {
            HashMap hashMap = this.A0J;
            if (hashMap == null) {
                jsonDeserializer = null;
            } else {
                jsonDeserializer = (JsonDeserializer) hashMap.get(new TAF(obj.getClass()));
            }
        }
        if (jsonDeserializer == null) {
            Class<?> cls = obj.getClass();
            jsonDeserializer = r7.A0E(r7.A0A(cls));
            if (jsonDeserializer != null) {
                synchronized (this) {
                    HashMap hashMap2 = this.A0J;
                    if (hashMap2 == null) {
                        hashMap2 = AnonymousClass7TE.A1E();
                        this.A0J = hashMap2;
                    }
                    hashMap2.put(new TAF(cls), jsonDeserializer);
                }
            }
        }
        if (jsonDeserializer != null) {
            if (r8 != null) {
                r8.A0Z();
                obj = jsonDeserializer.A0C(Pxi.A0N(r8), r7, obj);
            }
            if (r6 != null) {
                return jsonDeserializer.A0C(r6, r7, obj);
            }
            return obj;
        }
        if (r8 != null) {
            A1D(r7, r8, obj);
        }
        if (r6 != null) {
            return A0C(r6, r7, obj);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0188, code lost:
        if (r11.A01 != false) goto L_0x018a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x039c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x009f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x02c0 A[EDGE_INSN: B:218:0x02c0->B:136:0x02c0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EIS(X.C269674fV r23) {
        /*
            r22 = this;
            r6 = 0
            r1 = 0
            r17 = 0
            r5 = r22
            X.SK6 r4 = r5.A09
            boolean r0 = r4.A0I()
            r21 = 0
            r20 = 0
            r19 = 0
            r7 = r23
            if (r0 == 0) goto L_0x0044
            X.4f9 r0 = r7.A02
            X.QkR[] r3 = r4.A0O(r0)
            java.util.Set r10 = r5.A0C
            if (r10 != 0) goto L_0x0024
            java.util.Set r0 = r5.A0D
            if (r0 == 0) goto L_0x0045
        L_0x0024:
            int r9 = r3.length
            r8 = 0
        L_0x0026:
            if (r8 >= r9) goto L_0x0045
            r0 = r3[r8]
            X.4f7 r0 = r0.A06
            java.lang.String r2 = r0.A02
            java.util.Set r0 = r5.A0D
            boolean r0 = X.SQ7.A02(r2, r10, r0)
            if (r0 == 0) goto L_0x0041
            r2 = r3[r8]
            boolean r0 = r2 instanceof X.C8174Qif
            if (r0 == 0) goto L_0x0041
            X.Qif r2 = (X.C8174Qif) r2
            r0 = 1
            r2.A01 = r0
        L_0x0041:
            int r8 = r8 + 1
            goto L_0x0026
        L_0x0044:
            r3 = r6
        L_0x0045:
            X.TAR r2 = r5.A0A
            java.util.Iterator r12 = r2.iterator()
        L_0x004b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r10 = r12.next()
            X.QkR r10 = (X.C8218QkR) r10
            boolean r0 = r10.A0N()
            if (r0 != 0) goto L_0x004b
            X.4f9 r0 = r7.A02
            X.4eA r8 = r0.A01()
            if (r8 == 0) goto L_0x0090
            X.QkH r0 = r10.BRS()
            java.lang.Object r0 = r8.A0Y(r0)
            if (r0 == 0) goto L_0x0090
            X.Tgx r11 = r7.A06(r0)
            X.4eE r0 = r7.A05()
            X.4eF r9 = r11.BHa(r0)
            X.4fW r8 = r7.A03
            X.4fK r0 = r7.A04
            com.fasterxml.jackson.databind.JsonDeserializer r8 = r8.A01(r7, r9, r0)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r0.<init>(r9, r8, r11)
        L_0x0088:
            X.QkR r0 = r10.A04(r0)
            A02(r10, r0, r2, r3)
            goto L_0x004b
        L_0x0090:
            X.4eF r9 = r10.A04
            X.4fW r8 = r7.A03
            X.4fK r0 = r7.A04
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r8.A01(r7, r9, r0)
            goto L_0x0088
        L_0x009b:
            java.util.Iterator r18 = r2.iterator()
        L_0x009f:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x02fe
            java.lang.Object r13 = r18.next()
            X.QkR r13 = (X.C8218QkR) r13
            com.fasterxml.jackson.databind.JsonDeserializer r8 = r13.A03()
            X.4eF r0 = r13.A04
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.A0C(r13, r0, r8)
            X.QkR r12 = r13.A04(r0)
            java.lang.String r10 = r12.A0G()
            if (r10 == 0) goto L_0x010f
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r12.A03()
            X.QkR r9 = r0.A0E(r10)
            X.4eF r8 = r5.A08
            if (r9 != 0) goto L_0x00e3
            java.lang.String r1 = X.C269574fL.A08(r10)
            X.4eF r0 = r12.A04
            java.lang.String r0 = X.C269574fL.A04(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Cannot handle managed/back reference %s: no back reference property found from type %s"
        L_0x00db:
            X.Pxf.A1H(r7, r8, r0, r1)
        L_0x00de:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e3:
            X.4eF r0 = r9.A04
            r15 = r0
            X.4eF r0 = r12.A04
            boolean r11 = r0.A0N()
            java.lang.Class r14 = r15.A00
            java.lang.Class r0 = r8.A00
            boolean r14 = r14.isAssignableFrom(r0)
            if (r14 != 0) goto L_0x0109
            java.lang.String r2 = X.C269574fL.A08(r10)
            java.lang.String r1 = X.C269574fL.A04(r15)
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "Cannot handle managed/back reference %s: back reference type (%s) not compatible with managed type (%s)"
            goto L_0x00db
        L_0x0109:
            X.QiY r0 = new X.QiY
            r0.<init>(r12, r9, r10, r11)
            r12 = r0
        L_0x010f:
            boolean r0 = r12 instanceof X.C8167QiY
            if (r0 != 0) goto L_0x0122
            X.SHd r8 = r12.A08()
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r12.A03()
            if (r0 != 0) goto L_0x014f
            r0 = 0
        L_0x011e:
            if (r8 != 0) goto L_0x0148
            if (r0 != 0) goto L_0x0148
        L_0x0122:
            X.QkH r8 = r12.BRS()
            if (r8 == 0) goto L_0x0172
            X.4f9 r0 = r7.A02
            X.4eA r0 = r0.A01()
            X.SGT r9 = r0.A0L(r8)
            if (r9 == 0) goto L_0x0172
            boolean r0 = r12 instanceof X.C8174Qif
            if (r0 == 0) goto L_0x0154
            X.4eF r2 = r5.A08
            X.4f7 r0 = r12.A06
            java.lang.String r0 = r0.A02
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported"
            X.Pxf.A1H(r7, r2, r0, r1)
            goto L_0x00de
        L_0x0148:
            X.Qia r0 = new X.Qia
            r0.<init>((X.C8218QkR) r12, (X.C11243SHd) r8)
            r12 = r0
            goto L_0x0122
        L_0x014f:
            X.T9I r0 = r0.A0F()
            goto L_0x011e
        L_0x0154:
            com.fasterxml.jackson.databind.JsonDeserializer r8 = r12.A03()
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r8.A0A(r9)
            if (r0 == r8) goto L_0x0172
            if (r0 == 0) goto L_0x0172
            X.QkR r8 = r12.A04(r0)
            if (r6 != 0) goto L_0x016b
            X.SGe r6 = new X.SGe
            r6.<init>()
        L_0x016b:
            java.util.List r0 = r6.A00
            r0.add(r8)
            goto L_0x0234
        L_0x0172:
            X.T9n r9 = r12.BSh()
            X.RsB r11 = r9.A06
            if (r11 == 0) goto L_0x02e5
            com.fasterxml.jackson.databind.JsonDeserializer r8 = r12.A03()
            X.4f9 r10 = r7.A02
            java.lang.Boolean r0 = r8.A0G(r10)
            if (r0 != 0) goto L_0x02c3
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x02d2
        L_0x018a:
            com.fasterxml.jackson.databind.JsonDeserializer r8 = r12.A03()
            boolean r0 = r8 instanceof com.fasterxml.jackson.databind.deser.BeanDeserializerBase
            if (r0 == 0) goto L_0x02c0
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r8 = (com.fasterxml.jackson.databind.deser.BeanDeserializerBase) r8
            X.SK6 r0 = r8.A09
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x02c0
            X.4eF r0 = r12.A04
            java.lang.Class r8 = r0.A00
            java.lang.Class r15 = X.C269574fL.A00(r8)
            if (r15 == 0) goto L_0x02c0
            X.4eF r0 = r5.A08
            java.lang.Class r0 = r0.A00
            if (r15 != r0) goto L_0x02c0
            java.lang.reflect.Constructor[] r14 = r8.getConstructors()
            int r0 = r14.length
            r16 = r0
            r11 = 0
        L_0x01b4:
            r0 = r16
            if (r11 >= r0) goto L_0x02c0
            r10 = r14[r11]
            java.lang.Class[] r9 = r10.getParameterTypes()
            int r0 = r9.length
            r8 = r0
            r0 = 1
            if (r8 != r0) goto L_0x02bc
            r0 = r9[r19]
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x02bc
            X.4f9 r8 = r7.A02
            boolean r0 = r8.A06()
            if (r0 == 0) goto L_0x01da
            boolean r0 = r8.A08()
            X.C269574fL.A0H(r10, r0)
        L_0x01da:
            X.QiW r8 = new X.QiW
            r8.<init>(r12, r10)
        L_0x01df:
            if (r8 == r13) goto L_0x01e4
            A02(r13, r8, r2, r3)
        L_0x01e4:
            boolean r0 = r8.A0O()
            if (r0 == 0) goto L_0x009f
            X.SJg r10 = r8.A09()
            boolean r0 = r10 instanceof X.C8224QkX
            if (r0 == 0) goto L_0x02a3
            X.REQ r0 = X.REQ.WRAPPER_OBJECT
        L_0x01f4:
            X.REQ r9 = X.REQ.EXTERNAL_PROPERTY
            if (r0 != r9) goto L_0x009f
            if (r21 != 0) goto L_0x0208
            X.4eF r0 = r5.A08
            r20 = r0
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            r21 = 1
        L_0x0208:
            int r0 = r17.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            X.RwY r9 = new X.RwY
            r9.<init>(r8, r10)
            r0 = r17
            r0.add(r9)
            X.4f7 r0 = r8.A06
            java.lang.String r12 = r0.A02
            java.lang.Object r9 = r1.get(r12)
            if (r9 != 0) goto L_0x028b
            r1.put(r12, r11)
        L_0x0227:
            X.QkY r10 = (X.C8225QkY) r10
            java.lang.String r10 = r10.A05
            java.lang.Object r9 = r1.get(r10)
            if (r9 != 0) goto L_0x0273
            r1.put(r10, r11)
        L_0x0234:
            int r0 = r2.A01
            java.util.ArrayList r14 = X.DbS.A0v(r0)
            boolean r9 = r2.A07
            X.4f7 r0 = r8.A06
            java.lang.String r13 = r0.A02
            r15 = r13
            if (r9 == 0) goto L_0x0249
            java.util.Locale r0 = r2.A04
            java.lang.String r15 = r13.toLowerCase(r0)
        L_0x0249:
            java.lang.Object[] r12 = r2.A03
            int r11 = r12.length
            r10 = 1
            r16 = 0
        L_0x024f:
            if (r10 >= r11) goto L_0x02f7
            r8 = r12[r10]
            X.QkR r8 = (X.C8218QkR) r8
            if (r8 == 0) goto L_0x026c
            if (r16 != 0) goto L_0x026f
            int r0 = r10 + -1
            r0 = r12[r0]
            boolean r16 = r15.equals(r0)
            if (r16 == 0) goto L_0x026f
            X.QkR[] r9 = r2.A08
            int r8 = X.TAR.A00(r8, r2)
            r0 = 0
            r9[r8] = r0
        L_0x026c:
            int r10 = r10 + 2
            goto L_0x024f
        L_0x026f:
            r14.add(r8)
            goto L_0x026c
        L_0x0273:
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L_0x027d
            java.util.List r9 = (java.util.List) r9
            r9.add(r11)
            goto L_0x0234
        L_0x027d:
            java.util.LinkedList r0 = X.Pxe.A1A()
            r0.add(r9)
            r0.add(r11)
            r1.put(r10, r0)
            goto L_0x0234
        L_0x028b:
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L_0x0295
            java.util.List r9 = (java.util.List) r9
            r9.add(r11)
            goto L_0x0227
        L_0x0295:
            java.util.LinkedList r0 = X.Pxe.A1A()
            r0.add(r9)
            r0.add(r11)
            r1.put(r12, r0)
            goto L_0x0227
        L_0x02a3:
            r9 = r10
            X.QkW r9 = (X.C8223QkW) r9
            boolean r0 = r9 instanceof X.C8222QkV
            if (r0 == 0) goto L_0x02b0
            X.QkV r9 = (X.C8222QkV) r9
            X.REQ r0 = r9.A00
            goto L_0x01f4
        L_0x02b0:
            boolean r0 = r9 instanceof X.C8220QkT
            if (r0 == 0) goto L_0x02b8
            X.REQ r0 = X.REQ.EXTERNAL_PROPERTY
            goto L_0x01f4
        L_0x02b8:
            X.REQ r0 = X.REQ.WRAPPER_ARRAY
            goto L_0x01f4
        L_0x02bc:
            int r11 = r11 + 1
            goto L_0x01b4
        L_0x02c0:
            r8 = r12
            goto L_0x01df
        L_0x02c3:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x02d2
            boolean r0 = r11.A01
            if (r0 != 0) goto L_0x018a
            r7.A0X(r8)
            goto L_0x018a
        L_0x02d2:
            X.QkH r8 = r11.A00
            boolean r0 = r10.A08()
            r8.A0D(r0)
            boolean r0 = r12 instanceof X.C8171Qic
            if (r0 != 0) goto L_0x02e5
            X.QiX r0 = new X.QiX
            r0.<init>(r12, r8)
            r12 = r0
        L_0x02e5:
            X.4em r8 = r9.A01
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r12.A03()
            X.4fe r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A06(r8, r12, r7, r0)
            if (r0 == 0) goto L_0x018a
            X.QkR r12 = r12.A06(r0)
            goto L_0x018a
        L_0x02f7:
            if (r16 == 0) goto L_0x039c
            r2.A04(r14)
            goto L_0x009f
        L_0x02fe:
            X.T9a r9 = r5.A02
            if (r9 == 0) goto L_0x0320
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r9.A00
            if (r0 != 0) goto L_0x0320
            X.4eF r8 = r9.A02
            X.TjO r0 = r9.A01
            com.fasterxml.jackson.databind.JsonDeserializer r12 = r7.A0B(r0, r8)
            X.TjO r10 = r9.A01
            X.QkH r14 = r9.A04
            X.4eF r11 = r9.A02
            X.Rzp r13 = r9.A03
            X.SJg r0 = r9.A05
            X.T9a r9 = new X.T9a
            r15 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r5.A02 = r9
        L_0x0320:
            boolean r0 = r4.A0M()
            r8 = 1
            if (r0 == 0) goto L_0x033a
            boolean r0 = r4 instanceof X.C8181Qim
            if (r0 == 0) goto L_0x038a
            r0 = r4
            X.Qim r0 = (X.C8181Qim) r0
            X.4eF r9 = r0.A01
            if (r9 == 0) goto L_0x038a
            X.QkG r0 = r0.A04
            com.fasterxml.jackson.databind.JsonDeserializer r0 = A01(r7, r9, r0)
            r5.A01 = r0
        L_0x033a:
            boolean r0 = r4.A0K()
            if (r0 == 0) goto L_0x0353
            boolean r0 = r4 instanceof X.C8181Qim
            if (r0 == 0) goto L_0x0378
            r0 = r4
            X.Qim r0 = (X.C8181Qim) r0
            X.4eF r9 = r0.A00
            if (r9 == 0) goto L_0x0378
            X.QkG r0 = r0.A02
            com.fasterxml.jackson.databind.JsonDeserializer r0 = A01(r7, r9, r0)
            r5.A00 = r0
        L_0x0353:
            if (r3 == 0) goto L_0x03ba
            int r12 = r3.length
            X.QkR[] r10 = new X.C8218QkR[r12]
            r11 = 0
        L_0x0359:
            if (r11 >= r12) goto L_0x03aa
            r9 = r3[r11]
            boolean r0 = r9.A0N()
            if (r0 != 0) goto L_0x0373
            boolean r0 = r9.A0Q()
            if (r0 != 0) goto L_0x0373
            X.4eF r0 = r9.A04
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.A0B(r9, r0)
            X.QkR r9 = r9.A04(r0)
        L_0x0373:
            r10[r11] = r9
            int r11 = r11 + 1
            goto L_0x0359
        L_0x0378:
            X.4eF r8 = r5.A08
            java.lang.String r1 = X.C269574fL.A04(r8)
            java.lang.String r0 = X.C269574fL.A07(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            goto L_0x00db
        L_0x038a:
            X.4eF r8 = r5.A08
            java.lang.String r1 = X.C269574fL.A04(r8)
            java.lang.String r0 = X.C269574fL.A07(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            goto L_0x00db
        L_0x039c:
            java.lang.String r1 = "No entry '"
            java.lang.String r0 = "' found, can't remove"
            java.lang.String r1 = X.002.A0g(r1, r13, r0)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x03aa:
            boolean r3 = r2.A07
            X.SOB r0 = new X.SOB
            r11 = r0
            r12 = r7
            r13 = r4
            r14 = r10
            r15 = r3
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r5.A04 = r0
        L_0x03ba:
            if (r21 == 0) goto L_0x03e7
            int r9 = r17.size()
            X.RwY[] r7 = new X.C10694RwY[r9]
            r4 = 0
        L_0x03c3:
            if (r4 >= r9) goto L_0x03dc
            r0 = r17
            java.lang.Object r3 = r0.get(r4)
            X.RwY r3 = (X.C10694RwY) r3
            java.lang.String r0 = r3.A03
            X.QkR r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x03d7
            r3.A00 = r0
        L_0x03d7:
            r7[r4] = r3
            int r4 = r4 + 1
            goto L_0x03c3
        L_0x03dc:
            X.SJZ r2 = new X.SJZ
            r0 = r20
            r2.<init>(r0, r1, r7)
            r5.A03 = r2
            r5.A06 = r8
        L_0x03e7:
            r5.A05 = r6
            if (r6 == 0) goto L_0x03ed
            r5.A06 = r8
        L_0x03ed:
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x03f7
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x03f7
            r19 = 1
        L_0x03f7:
            r0 = r19
            r5.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.EIS(X.4fV):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r8, java.util.Set r9, java.util.Set r10) {
        /*
            r7 = this;
            X.4eF r0 = r8.A08
            r7.<init>((X.C268894eF) r0)
            r7.A08 = r0
            X.SK6 r0 = r8.A09
            r7.A09 = r0
            X.Pxj.A1H(r8, r7)
            java.util.Map r0 = r8.A0I
            r7.A0I = r0
            r7.A0C = r9
            boolean r0 = r8.A0E
            r7.A0E = r0
            r7.A0D = r10
            X.T9a r0 = r8.A02
            r7.A02 = r0
            X.Qhq[] r0 = r8.A0G
            r7.A0G = r0
            boolean r0 = r8.A06
            r7.A06 = r0
            X.SGe r0 = r8.A05
            r7.A05 = r0
            boolean r0 = r8.A0F
            r7.A0F = r0
            X.4ew r0 = r8.A0H
            r7.A0H = r0
            boolean r0 = r8.A07
            r7.A07 = r0
            X.T9I r0 = r8.A0B
            r7.A0B = r0
            X.TAR r6 = r8.A0A
            if (r9 == 0) goto L_0x0044
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0049
        L_0x0044:
            if (r10 != 0) goto L_0x0049
        L_0x0046:
            r7.A0A = r6
            return
        L_0x0049:
            X.QkR[] r5 = r6.A08
            int r4 = r5.length
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0051:
            if (r2 >= r4) goto L_0x0067
            r1 = r5[r2]
            if (r1 == 0) goto L_0x0064
            X.4f7 r0 = r1.A06
            java.lang.String r0 = r0.A02
            boolean r0 = X.SQ7.A02(r0, r9, r10)
            if (r0 != 0) goto L_0x0064
            r3.add(r1)
        L_0x0064:
            int r2 = r2 + 1
            goto L_0x0051
        L_0x0067:
            boolean r2 = r6.A07
            java.util.Map r1 = r6.A05
            java.util.Locale r0 = r6.A04
            X.TAR r6 = new X.TAR
            r6.<init>((java.util.Collection) r3, (java.util.Locale) r0, (java.util.Map) r1, (boolean) r2)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, java.util.Set, java.util.Set):void");
    }

    public static JsonDeserializer A01(C269674fV r7, C268894eF r8, C8207QkG qkG) {
        JsonDeserializer A0D2;
        C12437SuS suS = new C12437SuS(r8, T9n.A07, A0K, qkG);
        C11287SJg sJg = (C11287SJg) r8.A01;
        if (sJg == null) {
            C269454f9 r4 = r7.A02;
            C269054eV r3 = r4.A03(r8.A00).A07;
            C13733Tg5 A0K2 = r4.A01().A0K(r4, r3);
            ArrayList arrayList = null;
            if (A0K2 == null) {
                A0K2 = r4.A01.A06;
                if (A0K2 == null) {
                    sJg = null;
                }
            } else {
                arrayList = r4.A03.A03(r4, r3);
            }
            sJg = A0K2.AEd(r4, r8, arrayList);
        }
        JsonDeserializer jsonDeserializer = (JsonDeserializer) r8.A02;
        if (jsonDeserializer == null) {
            A0D2 = r7.A0B(suS, r8);
        } else {
            A0D2 = r7.A0D(suS, r8, jsonDeserializer);
        }
        if (sJg != null) {
            return new TypeWrappedDeserializer(A0D2, sJg.A02(suS));
        }
        return A0D2;
    }

    public static final void A02(C8218QkR qkR, C8218QkR qkR2, TAR tar, C8218QkR[] qkRArr) {
        Object[] objArr = tar.A03;
        int length = objArr.length;
        for (int i = 1; i < length; i += 2) {
            if (objArr[i] == qkR) {
                objArr[i] = qkR2;
                tar.A08[TAR.A00(qkR, tar)] = qkR2;
                if (qkRArr != null) {
                    int length2 = qkRArr.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (qkRArr[i2] == qkR) {
                            qkRArr[i2] = qkR2;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException(002.A0g("No entry '", qkR.A06.A02, "' found, can't replace"));
    }

    public final C8218QkR A0E(String str) {
        Map map = this.A0I;
        if (map == null) {
            return null;
        }
        return (C8218QkR) map.get(str);
    }

    public final T9I A0F() {
        return this.A0B;
    }

    public final Boolean A0G(C269454f9 r2) {
        if ((this instanceof BeanAsArrayBuilderDeserializer) || (this instanceof BuilderBasedDeserializer)) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public final Class A0H() {
        return this.A08.A00;
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0N;
    }

    public final Object A0J(16F r3, C269674fV r4, C11287SJg sJg) {
        Object A0W;
        if (this.A0B != null) {
            if (r3.A0a() && (A0W = r3.A0W()) != null) {
                return A1A(r3, r4, sJg.A05(r3, r4), A0W);
            }
            16L A10 = r3.A10();
            if (A10 != null) {
                if (A10.A03) {
                    return A16(r3, r4);
                }
                if (A10 == 16L.A0D) {
                    r3.A1J();
                }
            }
        }
        return sJg.A05(r3, r4);
    }

    public final Object A0K(C269674fV r2) {
        try {
            return this.A09.A04(r2);
        } catch (IOException e) {
            C269574fL.A0D(r2, e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final C268894eF A0T() {
        return this.A08;
    }

    public final SK6 A0W() {
        return this.A09;
    }

    public final void A0r(16F r2, C269674fV r3, Object obj, String str) {
        if (this.A0E) {
            r2.A0z();
            return;
        }
        if (SQ7.A01(this, str)) {
            A1B(r2, r3, obj, str);
        }
        super.A0r(r2, r3, obj, str);
    }

    public final BeanDeserializerBase A0y() {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer.A00.A0y(), beanAsArrayDeserializer.A01);
        } else if (this instanceof BeanAsArrayBuilderDeserializer) {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            BeanDeserializerBase A0y = beanAsArrayBuilderDeserializer.A01.A0y();
            return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer.A00, A0y, beanAsArrayBuilderDeserializer.A02, beanAsArrayBuilderDeserializer.A03);
        } else if (this instanceof BuilderBasedDeserializer) {
            return new BuilderBasedDeserializer((BuilderBasedDeserializer) this);
        } else {
            return new BeanDeserializerBase(this, true);
        }
    }

    public final BeanDeserializerBase A0z(TAR tar) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer.A00.A0z(tar), beanAsArrayDeserializer.A01);
        } else if (this instanceof BeanAsArrayBuilderDeserializer) {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            BeanDeserializerBase A0z = beanAsArrayBuilderDeserializer.A01.A0z(tar);
            return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer.A00, A0z, beanAsArrayBuilderDeserializer.A02, beanAsArrayBuilderDeserializer.A03);
        } else if (this instanceof BuilderBasedDeserializer) {
            return new BuilderBasedDeserializer((BuilderBasedDeserializer) this, tar);
        } else {
            return new BeanDeserializerBase(this, tar);
        }
    }

    public final BeanDeserializerBase A10(T9I t9i) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer.A00.A10(t9i), beanAsArrayDeserializer.A01);
        } else if (this instanceof BeanAsArrayBuilderDeserializer) {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            BeanDeserializerBase A10 = beanAsArrayBuilderDeserializer.A01.A10(t9i);
            return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer.A00, A10, beanAsArrayBuilderDeserializer.A02, beanAsArrayBuilderDeserializer.A03);
        } else if (this instanceof BuilderBasedDeserializer) {
            return new BuilderBasedDeserializer((BuilderBasedDeserializer) this, t9i);
        } else {
            return new BeanDeserializerBase(this, t9i);
        }
    }

    public final BeanDeserializerBase A11(Set set, Set set2) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer.A00.A11(set, set2), beanAsArrayDeserializer.A01);
        } else if (this instanceof BeanAsArrayBuilderDeserializer) {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            BeanDeserializerBase A11 = beanAsArrayBuilderDeserializer.A01.A11(set, set2);
            return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer.A00, A11, beanAsArrayBuilderDeserializer.A02, beanAsArrayBuilderDeserializer.A03);
        } else if (this instanceof BuilderBasedDeserializer) {
            return new BuilderBasedDeserializer((BuilderBasedDeserializer) this, set, set2);
        } else {
            return new BeanDeserializerBase(this, set, set2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.fasterxml.jackson.databind.deser.BeanDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.fasterxml.jackson.databind.deser.BeanDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.fasterxml.jackson.databind.deser.BeanDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: com.fasterxml.jackson.databind.deser.BeanDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.fasterxml.jackson.databind.deser.BeanDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.fasterxml.jackson.databind.deser.BeanDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: com.fasterxml.jackson.databind.deser.BeanDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.fasterxml.jackson.databind.deser.BeanDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: com.fasterxml.jackson.databind.deser.BeanDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0187, code lost:
        r14.A1J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c5, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r5 = r10.A02(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d1, code lost:
        if (r5.getClass() == r2.A08.A00) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01d7, code lost:
        return r2.A19(r14, r15, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d8, code lost:
        if (r4 == null) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01da, code lost:
        r2.A1D(r15, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01dd, code lost:
        X.Pxi.A1E(r15, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01e2, code lost:
        if (r2.A05 == null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ea, code lost:
        if (r14.A19(X.16L.A0D) == false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01ec, code lost:
        r14.A1J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01ef, code lost:
        r0 = new X.C267574bm(r14, r15);
        r0.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01fb, code lost:
        return r2.A1G(r14, r15, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01fe, code lost:
        if (r2.A03 == null) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0204, code lost:
        return r2.A1I(r14, r15, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0205, code lost:
        if (r6 == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0207, code lost:
        r0 = r15.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0209, code lost:
        if (r0 == null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x020f, code lost:
        return r2.A1H(r14, r15, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0210, code lost:
        r1 = r14.A10();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0216, code lost:
        if (r1 != X.16L.A0D) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0218, code lost:
        r1 = r14.A1J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x021c, code lost:
        if (r1 != r3) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x021e, code lost:
        r1 = r14.A0Y();
        r0 = X.TAR.A01(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0226, code lost:
        if (r0 == null) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r5 = r0.A0D(r14, r15, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x022d, code lost:
        r2.A1C(r14, r15, r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0231, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0232, code lost:
        r2.A1E(r15, r5, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r5 = r10.A02(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x023b, code lost:
        if (r4 == null) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0306, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0307, code lost:
        r2.A1E(r15, r2.A08.A00, r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0341, code lost:
        if (r5.getClass() == r2.A08.A00) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0347, code lost:
        return r2.A19((X.16F) null, r15, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0348, code lost:
        r2.A1D(r15, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x034b, code lost:
        return r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A12(X.16F r14, X.C269674fV r15) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer
            if (r0 == 0) goto L_0x00a0
            r4 = r13
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer r4 = (com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer) r4
            X.SOB r10 = r4.A04
            X.T9I r1 = r4.A0B
            int r0 = r10.A00
            X.S7L r9 = new X.S7L
            r9.<init>(r14, r15, r1, r0)
            X.QkR[] r8 = r4.A01
            int r7 = r8.length
            boolean r0 = r4.A0F
            r12 = 0
            if (r0 == 0) goto L_0x0097
            java.lang.Class r6 = r15.A05
        L_0x001c:
            r5 = r12
            r1 = 0
        L_0x001e:
            X.16L r2 = r14.A1J()
            X.16L r0 = X.16L.A08
            if (r2 == r0) goto L_0x0099
            if (r1 >= r7) goto L_0x0095
            r3 = r8[r1]
        L_0x002a:
            if (r3 != 0) goto L_0x0032
            r14.A0z()
        L_0x002f:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x0032:
            if (r6 == 0) goto L_0x003e
            boolean r0 = r3.A0R(r6)
            if (r0 != 0) goto L_0x003e
            r14.A0z()
            goto L_0x002f
        L_0x003e:
            if (r5 == 0) goto L_0x0044
            r3.A0K(r5, r14, r15)     // Catch:{ Exception -> 0x00e5 }
            goto L_0x002f
        L_0x0044:
            X.4f7 r0 = r3.A06
            java.lang.String r2 = r0.A02
            X.QkR r11 = X.SOB.A00(r10, r2)
            boolean r0 = r9.A04(r2)
            if (r0 == 0) goto L_0x0055
            if (r11 != 0) goto L_0x0055
            goto L_0x002f
        L_0x0055:
            if (r11 == 0) goto L_0x008d
            java.lang.Object r0 = r11.A0C(r14, r15)
            boolean r0 = r9.A03(r11, r0)
            if (r0 == 0) goto L_0x002f
            java.lang.Object r5 = r10.A02(r15, r9)     // Catch:{ Exception -> 0x0112 }
            r14.A0t(r5)
            java.lang.Class r3 = r5.getClass()
            X.4eF r2 = r4.A08
            java.lang.Class r0 = r2.A00
            if (r3 == r0) goto L_0x002f
            java.lang.String r1 = X.C269574fL.A04(r2)
            boolean r0 = r5 instanceof java.lang.Class
            if (r0 == 0) goto L_0x008b
            java.lang.Class r5 = (java.lang.Class) r5
        L_0x007c:
            java.lang.String r0 = X.C269574fL.A06(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s"
            X.Pxf.A1H(r15, r2, r0, r1)
            goto L_0x0334
        L_0x008b:
            r5 = r3
            goto L_0x007c
        L_0x008d:
            java.lang.Object r0 = r3.A0C(r14, r15)
            r9.A02(r3, r0)
            goto L_0x002f
        L_0x0095:
            r3 = r12
            goto L_0x002a
        L_0x0097:
            r6 = r12
            goto L_0x001c
        L_0x0099:
            if (r5 != 0) goto L_0x0393
            java.lang.Object r5 = r10.A02(r15, r9)     // Catch:{ Exception -> 0x012d }
            return r5
        L_0x00a0:
            boolean r0 = r13 instanceof com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer
            if (r0 == 0) goto L_0x0135
            r4 = r13
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer r4 = (com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer) r4
            X.SOB r10 = r4.A04
            X.T9I r1 = r4.A0B
            int r0 = r10.A00
            X.S7L r9 = new X.S7L
            r9.<init>(r14, r15, r1, r0)
            X.QkR[] r8 = r4.A03
            int r7 = r8.length
            boolean r0 = r4.A0F
            r12 = 0
            if (r0 == 0) goto L_0x0133
            java.lang.Class r6 = r15.A05
        L_0x00bc:
            r5 = r12
            r1 = 0
        L_0x00be:
            X.16L r2 = r14.A1J()
            X.16L r0 = X.16L.A08
            if (r2 == r0) goto L_0x0126
            if (r1 >= r7) goto L_0x0124
            r3 = r8[r1]
        L_0x00ca:
            if (r3 != 0) goto L_0x00d2
            r14.A0z()
        L_0x00cf:
            int r1 = r1 + 1
            goto L_0x00be
        L_0x00d2:
            if (r6 == 0) goto L_0x00de
            boolean r0 = r3.A0R(r6)
            if (r0 != 0) goto L_0x00de
            r14.A0z()
            goto L_0x00cf
        L_0x00de:
            if (r5 == 0) goto L_0x00ef
            java.lang.Object r5 = r3.A0D(r14, r15, r5)     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00cf
        L_0x00e5:
            r1 = move-exception
            X.4f7 r0 = r3.A06
            java.lang.String r0 = r0.A02
            r4.A1E(r15, r5, r0, r1)
            goto L_0x0334
        L_0x00ef:
            X.4f7 r0 = r3.A06
            java.lang.String r2 = r0.A02
            X.QkR r11 = X.SOB.A00(r10, r2)
            boolean r0 = r9.A04(r2)
            if (r0 == 0) goto L_0x0100
            if (r11 != 0) goto L_0x0100
            goto L_0x00cf
        L_0x0100:
            if (r11 == 0) goto L_0x011c
            java.lang.Object r0 = r11.A0C(r14, r15)
            boolean r0 = r9.A03(r11, r0)
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r5 = r10.A02(r15, r9)     // Catch:{ Exception -> 0x0112 }
            goto L_0x0319
        L_0x0112:
            r1 = move-exception
            X.4eF r0 = r4.A08
            java.lang.Class r0 = r0.A00
            r4.A1E(r15, r0, r2, r1)
            goto L_0x0334
        L_0x011c:
            java.lang.Object r0 = r3.A0C(r14, r15)
            r9.A02(r3, r0)
            goto L_0x00cf
        L_0x0124:
            r3 = r12
            goto L_0x00ca
        L_0x0126:
            if (r5 != 0) goto L_0x0393
            java.lang.Object r5 = r10.A02(r15, r9)     // Catch:{ Exception -> 0x012d }
            return r5
        L_0x012d:
            r0 = move-exception
            r4.A1F(r15, r0)
            goto L_0x0334
        L_0x0133:
            r6 = r12
            goto L_0x00bc
        L_0x0135:
            boolean r0 = r13 instanceof com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer
            if (r0 == 0) goto L_0x023f
            r2 = r13
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer r2 = (com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer) r2
            X.SOB r10 = r2.A04
            X.T9I r1 = r2.A0B
            int r0 = r10.A00
            X.S7L r9 = new X.S7L
            r9.<init>(r14, r15, r1, r0)
            boolean r6 = r2.A0F
            r7 = 0
            if (r6 == 0) goto L_0x01c3
            java.lang.Class r8 = r15.A05
        L_0x014e:
            X.16L r0 = r14.A10()
            r4 = r7
        L_0x0153:
            X.16L r3 = X.16L.A0A
            if (r0 != r3) goto L_0x0237
            java.lang.String r5 = r14.A0Y()
            r14.A1J()
            X.QkR r1 = X.SOB.A00(r10, r5)
            boolean r0 = r9.A04(r5)
            if (r0 == 0) goto L_0x016f
            if (r1 != 0) goto L_0x016f
        L_0x016a:
            X.16L r0 = r14.A1J()
            goto L_0x0153
        L_0x016f:
            if (r1 == 0) goto L_0x018b
            if (r8 == 0) goto L_0x017d
            boolean r0 = r1.A0R(r8)
            if (r0 != 0) goto L_0x017d
            r14.A0z()
            goto L_0x016a
        L_0x017d:
            java.lang.Object r0 = r1.A0C(r14, r15)
            boolean r0 = r9.A03(r1, r0)
            if (r0 == 0) goto L_0x016a
            r14.A1J()
            goto L_0x01c5
        L_0x018b:
            X.TAR r0 = r2.A0A
            X.QkR r1 = r0.A02(r5)
            if (r1 == 0) goto L_0x019b
            java.lang.Object r0 = r1.A0C(r14, r15)
            r9.A02(r1, r0)
            goto L_0x016a
        L_0x019b:
            boolean r0 = X.SQ7.A01(r2, r5)
            if (r0 == 0) goto L_0x01a9
            X.4eF r0 = r2.A08
            java.lang.Class r0 = r0.A00
            r2.A1B(r14, r15, r0, r5)
            goto L_0x016a
        L_0x01a9:
            X.T9a r1 = r2.A02
            if (r1 == 0) goto L_0x01b5
            java.lang.Object r0 = r1.A00(r14, r15)
            r9.A01(r1, r0, r5)
            goto L_0x016a
        L_0x01b5:
            if (r4 != 0) goto L_0x01bc
            X.4bm r4 = new X.4bm
            r4.<init>(r14, r15)
        L_0x01bc:
            r4.A0q(r5)
            r4.A13(r14)
            goto L_0x016a
        L_0x01c3:
            r8 = r7
            goto L_0x014e
        L_0x01c5:
            java.lang.Object r5 = r10.A02(r15, r9)     // Catch:{ Exception -> 0x0306 }
            java.lang.Class r1 = r5.getClass()
            X.4eF r0 = r2.A08
            java.lang.Class r0 = r0.A00
            if (r1 == r0) goto L_0x01d8
            java.lang.Object r5 = r2.A19(r14, r15, r4, r5)
            return r5
        L_0x01d8:
            if (r4 == 0) goto L_0x01dd
            r2.A1D(r15, r4, r5)
        L_0x01dd:
            X.Pxi.A1E(r15, r2)
            X.SGe r0 = r2.A05
            if (r0 == 0) goto L_0x01fc
            X.16L r0 = X.16L.A0D
            boolean r0 = r14.A19(r0)
            if (r0 == 0) goto L_0x01ef
            r14.A1J()
        L_0x01ef:
            X.4bm r0 = new X.4bm
            r0.<init>(r14, r15)
            r0.A0c()
            java.lang.Object r5 = r2.A1G(r14, r15, r0, r5)
            return r5
        L_0x01fc:
            X.SJZ r0 = r2.A03
            if (r0 == 0) goto L_0x0205
            java.lang.Object r5 = r2.A1I(r14, r15, r5)
            return r5
        L_0x0205:
            if (r6 == 0) goto L_0x0210
            java.lang.Class r0 = r15.A05
            if (r0 == 0) goto L_0x0210
            java.lang.Object r5 = r2.A1H(r14, r15, r0, r5)
            return r5
        L_0x0210:
            X.16L r1 = r14.A10()
            X.16L r0 = X.16L.A0D
            if (r1 != r0) goto L_0x021c
        L_0x0218:
            X.16L r1 = r14.A1J()
        L_0x021c:
            if (r1 != r3) goto L_0x0393
            java.lang.String r1 = r14.A0Y()
            X.QkR r0 = X.TAR.A01(r14, r2, r1)
            if (r0 == 0) goto L_0x022d
            java.lang.Object r5 = r0.A0D(r14, r15, r5)     // Catch:{ Exception -> 0x0231 }
            goto L_0x0218
        L_0x022d:
            r2.A1C(r14, r15, r5, r1)
            goto L_0x0218
        L_0x0231:
            r0 = move-exception
            r2.A1E(r15, r5, r1, r0)
            goto L_0x0334
        L_0x0237:
            java.lang.Object r5 = r10.A02(r15, r9)     // Catch:{ Exception -> 0x0314 }
            if (r4 == 0) goto L_0x0393
            goto L_0x0339
        L_0x023f:
            r2 = r13
            com.fasterxml.jackson.databind.deser.BeanDeserializer r2 = (com.fasterxml.jackson.databind.deser.BeanDeserializer) r2
            X.SOB r9 = r2.A04
            X.T9I r1 = r2.A0B
            int r0 = r9.A00
            X.S7L r8 = new X.S7L
            r8.<init>(r14, r15, r1, r0)
            boolean r0 = r2.A0F
            r4 = 0
            if (r0 == 0) goto L_0x02e9
            java.lang.Class r7 = r15.A05
        L_0x0254:
            X.16L r1 = r14.A10()
            r6 = r4
            r3 = r4
        L_0x025a:
            X.16L r0 = X.16L.A0A
            if (r1 != r0) goto L_0x030f
            java.lang.String r5 = r14.A0Y()
            r14.A1J()
            X.QkR r1 = X.SOB.A00(r9, r5)
            boolean r0 = r8.A04(r5)
            if (r0 == 0) goto L_0x0276
            if (r1 != 0) goto L_0x0276
        L_0x0271:
            X.16L r1 = r14.A1J()
            goto L_0x025a
        L_0x0276:
            if (r1 == 0) goto L_0x0292
            if (r7 == 0) goto L_0x0284
            boolean r0 = r1.A0R(r7)
            if (r0 != 0) goto L_0x0284
            r14.A0z()
            goto L_0x0271
        L_0x0284:
            java.lang.Object r0 = r2.A1H(r14, r15, r1)
            boolean r0 = r8.A03(r1, r0)
            if (r0 == 0) goto L_0x0271
            r14.A1J()
            goto L_0x02ec
        L_0x0292:
            X.TAR r0 = r2.A0A
            X.QkR r10 = r0.A02(r5)
            if (r10 == 0) goto L_0x02b9
            java.lang.Object r0 = r2.A1H(r14, r15, r10)     // Catch:{ Qi1 -> 0x02a2 }
            r8.A02(r10, r0)     // Catch:{ Qi1 -> 0x02a2 }
            goto L_0x0271
        L_0x02a2:
            r5 = move-exception
            X.4eF r0 = r10.A04
            X.Qis r1 = new X.Qis
            r1.<init>(r15, r0, r10, r5)
            X.S6M r0 = r5.A00
            r0.A00(r1)
            if (r6 != 0) goto L_0x02b5
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
        L_0x02b5:
            r6.add(r1)
            goto L_0x0271
        L_0x02b9:
            boolean r0 = X.SQ7.A01(r2, r5)
            if (r0 == 0) goto L_0x02c7
            X.4eF r0 = r2.A08
            java.lang.Class r0 = r0.A00
            r2.A1B(r14, r15, r0, r5)
            goto L_0x0271
        L_0x02c7:
            X.T9a r1 = r2.A02
            if (r1 == 0) goto L_0x02d3
            java.lang.Object r0 = r1.A00(r14, r15)     // Catch:{ Exception -> 0x0306 }
            r8.A01(r1, r0, r5)     // Catch:{ Exception -> 0x0306 }
            goto L_0x0271
        L_0x02d3:
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x02db
            r14.A0z()
            goto L_0x0271
        L_0x02db:
            if (r3 != 0) goto L_0x02e2
            X.4bm r3 = new X.4bm
            r3.<init>(r14, r15)
        L_0x02e2:
            r3.A0q(r5)
            r3.A13(r14)
            goto L_0x0271
        L_0x02e9:
            r7 = r4
            goto L_0x0254
        L_0x02ec:
            java.lang.Object r5 = r9.A02(r15, r8)     // Catch:{ Exception -> 0x0314 }
            if (r5 != 0) goto L_0x034c
            X.4eF r0 = r2.A08
            java.lang.Class r1 = r0.A00
            java.lang.Exception r0 = r2.A00
            if (r0 != 0) goto L_0x0302
            java.lang.String r0 = "JSON Creator returned null"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            r2.A00 = r0
        L_0x0302:
            r15.A0f(r1, r0)
            goto L_0x0334
        L_0x0306:
            r1 = move-exception
            X.4eF r0 = r2.A08
            java.lang.Class r0 = r0.A00
            r2.A1E(r15, r0, r5, r1)
            goto L_0x0334
        L_0x030f:
            java.lang.Object r5 = r9.A02(r15, r8)     // Catch:{ Exception -> 0x0314 }
            goto L_0x0367
        L_0x0314:
            r0 = move-exception
            r2.A1F(r15, r0)
            goto L_0x0334
        L_0x0319:
            java.lang.Class r3 = r5.getClass()
            X.4eF r2 = r4.A08
            java.lang.Class r0 = r2.A00
            if (r3 == r0) goto L_0x00cf
            java.lang.String r1 = X.C269574fL.A04(r2)
            java.lang.String r0 = r3.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s"
            X.Pxf.A1H(r15, r2, r0, r1)
        L_0x0334:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0339:
            java.lang.Class r1 = r5.getClass()
            X.4eF r0 = r2.A08
            java.lang.Class r0 = r0.A00
            if (r1 == r0) goto L_0x0348
            java.lang.Object r5 = r2.A19(r7, r15, r4, r5)
            return r5
        L_0x0348:
            r2.A1D(r15, r4, r5)
            return r5
        L_0x034c:
            r14.A0t(r5)
            java.lang.Class r1 = r5.getClass()
            X.4eF r0 = r2.A08
            java.lang.Class r0 = r0.A00
            if (r1 == r0) goto L_0x035e
            java.lang.Object r5 = r2.A19(r14, r15, r3, r5)
            return r5
        L_0x035e:
            if (r3 == 0) goto L_0x0363
            r2.A1D(r15, r3, r5)
        L_0x0363:
            r2.A0C(r14, r15, r5)
            return r5
        L_0x0367:
            X.Pxi.A1E(r15, r2)
            if (r6 == 0) goto L_0x037f
            java.util.Iterator r1 = r6.iterator()
        L_0x0370:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x037f
            java.lang.Object r0 = r1.next()
            X.Qis r0 = (X.C8187Qis) r0
            r0.A00 = r5
            goto L_0x0370
        L_0x037f:
            if (r3 == 0) goto L_0x0393
            java.lang.Class r1 = r5.getClass()
            X.4eF r0 = r2.A08
            java.lang.Class r0 = r0.A00
            if (r1 == r0) goto L_0x0390
            java.lang.Object r5 = r2.A19(r4, r15, r3, r5)
            return r5
        L_0x0390:
            r2.A1D(r15, r3, r5)
        L_0x0393:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A12(X.16F, X.4fV):java.lang.Object");
    }

    public final Object A13(16F r4, C269674fV r5) {
        JsonDeserializer jsonDeserializer = this.A01;
        if (!(jsonDeserializer == null && (jsonDeserializer = this.A00) == null)) {
            SK6 sk6 = this.A09;
            if (!sk6.A0F()) {
                return SK6.A02(r4, r5, jsonDeserializer, this, sk6);
            }
        }
        return this.A09.A0D(r5, AnonymousClass7TF.A1W(r4.A10(), 16L.A0K));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r2.A0G() == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r2.A0G() == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (X.AnonymousClass7TF.A1V(((X.C8181Qim) r1).A06) != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A15(X.16F r5, X.C269674fV r6) {
        /*
            r4 = this;
            X.T9I r0 = r4.A0B
            if (r0 == 0) goto L_0x0009
            java.lang.Object r0 = r4.A16(r5, r6)
            return r0
        L_0x0009:
            com.fasterxml.jackson.databind.JsonDeserializer r3 = r4.A01
            if (r3 != 0) goto L_0x000f
            com.fasterxml.jackson.databind.JsonDeserializer r3 = r4.A00
        L_0x000f:
            java.lang.Integer r1 = r5.A0n()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0026
            if (r3 == 0) goto L_0x004d
            X.SK6 r2 = r4.A09
            boolean r0 = r2.A0G()
            if (r0 != 0) goto L_0x004d
        L_0x0021:
            java.lang.Object r0 = X.SK6.A02(r5, r6, r3, r4, r2)
            return r0
        L_0x0026:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0035
            if (r3 == 0) goto L_0x0058
            X.SK6 r2 = r4.A09
            boolean r0 = r2.A0G()
            if (r0 != 0) goto L_0x0058
            goto L_0x0021
        L_0x0035:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x006e
            if (r3 == 0) goto L_0x0063
            X.SK6 r2 = r4.A09
            r1 = r2
            boolean r0 = r2 instanceof X.C8181Qim
            if (r0 == 0) goto L_0x0021
            X.Qim r1 = (X.C8181Qim) r1
            X.QkG r0 = r1.A06
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 != 0) goto L_0x0063
            goto L_0x0021
        L_0x004d:
            X.SK6 r1 = r4.A09
            int r0 = r5.A0i()
            java.lang.Object r0 = r1.A06(r6, r0)
            return r0
        L_0x0058:
            X.SK6 r2 = r4.A09
            long r0 = r5.A0j()
            java.lang.Object r0 = r2.A07(r6, r0)
            return r0
        L_0x0063:
            X.SK6 r1 = r4.A09
            java.math.BigInteger r0 = r5.A0s()
            java.lang.Object r0 = r1.A0C(r6, r0)
            return r0
        L_0x006e:
            X.4eF r0 = r4.A08
            java.lang.Class r3 = r0.A00
            X.SK6 r2 = r4.A09
            java.lang.Number r0 = r5.A0p()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "no suitable creator method found to deserialize from Number value (%s)"
            r6.A0Y(r2, r3, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A15(X.16F, X.4fV):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Throwable, X.1bF, X.4iD, java.io.IOException, X.Qi1] */
    public final Object A16(16F r6, C269674fV r7) {
        Object obj;
        T9I t9i = this.A0B;
        Object A0D2 = t9i.A03.A0D(r6, r7);
        S6M A0I2 = r7.A0I(t9i.A00, t9i.A01, A0D2);
        C13452Taf taf = A0I2.A00;
        T9Z t9z = A0I2.A03;
        Map map = ((C12436SuR) taf).A00;
        if (map == null) {
            obj = null;
        } else {
            obj = map.get(t9z);
        }
        A0I2.A01 = obj;
        if (obj != null) {
            return obj;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Could not resolve Object Id [");
        A1A.append(A0D2);
        A1A.append("] (for ");
        A1A.append(this.A08);
        String A0l = AnonymousClass7TF.A0l(").", A1A);
        C12837T9j A1H = r6.A1H();
        ? iOException = new IOException(A0l, (Throwable) null);
        iOException.A00 = A1H;
        iOException.A01 = r6;
        iOException.A00 = A0I2;
        throw iOException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3.getEnclosingClass() == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A17(X.16F r5, X.C269674fV r6) {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4.A01
            if (r1 != 0) goto L_0x004b
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4.A00
            if (r1 != 0) goto L_0x004b
            X.SOB r0 = r4.A04
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r4.A12(r5, r6)
            return r0
        L_0x0011:
            X.4eF r0 = r4.A08
            java.lang.Class r3 = r0.A00
            java.util.Iterator r0 = X.C269574fL.A00
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x0032
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r3 == r0) goto L_0x0032
            boolean r0 = r3.isPrimitive()
            if (r0 != 0) goto L_0x0032
            java.lang.Class r0 = r3.getEnclosingClass()
            r2 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            r1 = 0
            if (r2 == 0) goto L_0x0044
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = "non-static inner classes like this can only by instantiated using default, no-argument constructor"
        L_0x003c:
            r6.A0Y(r0, r3, r1, r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0044:
            X.SK6 r0 = r4.A09
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = "cannot deserialize from Object value (no delegate- or property-based Creator)"
            goto L_0x003c
        L_0x004b:
            X.SK6 r0 = r4.A09
            java.lang.Object r0 = X.SK6.A02(r5, r6, r1, r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A17(X.16F, X.4fV):java.lang.Object");
    }

    public final Object A18(16F r4, C269674fV r5) {
        if (this.A0B != null) {
            return A16(r4, r5);
        }
        JsonDeserializer jsonDeserializer = this.A01;
        if (!(jsonDeserializer == null && (jsonDeserializer = this.A00) == null)) {
            SK6 sk6 = this.A09;
            if (!sk6.A0J()) {
                return SK6.A02(r4, r5, jsonDeserializer, this, sk6);
            }
        }
        return A0i(r4, r5);
    }

    public final Object A1A(16F r6, C269674fV r7, Object obj, Object obj2) {
        T9I t9i = this.A0B;
        JsonDeserializer jsonDeserializer = t9i.A03;
        if (jsonDeserializer.A0H() != obj2.getClass()) {
            C267574bm r2 = new C267574bm(r6, r7);
            if (obj2 instanceof String) {
                r2.A0t((String) obj2);
            } else if (obj2 instanceof Long) {
                r2.A0h(AnonymousClass7TE.A0R(obj2));
            } else if (obj2 instanceof Integer) {
                r2.A0g(AnonymousClass7TE.A0M(obj2));
            } else {
                r2.A0J(obj2);
            }
            obj2 = jsonDeserializer.A0D(Pxi.A0N(r2), r7);
        }
        r7.A0I(t9i.A00, t9i.A01, obj2).A01(obj);
        C8218QkR qkR = t9i.A05;
        if (qkR != null) {
            return qkR.A0F(obj, obj2);
        }
        return obj;
    }

    public final void A1B(16F r5, C269674fV r6, Object obj, String str) {
        Class<?> cls;
        if (!r6.A0j(C269464fA.FAIL_ON_IGNORED_PROPERTIES)) {
            r5.A0z();
            return;
        }
        Collection A0L = A0L();
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        C8199Qk6 qk6 = new C8199Qk6(r5.A1H(), r5, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", new Object[]{str, cls.getName()}), A0L);
        qk6.A08(obj, str);
        throw qk6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if ((r6 instanceof X.C65181bG) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r3.A0j(X.C269464fA.WRAP_EXCEPTIONS) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1E(X.C269674fV r3, java.lang.Object r4, java.lang.String r5, java.lang.Throwable r6) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r6 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L_0x000f
            java.lang.Throwable r0 = r6.getCause()
            if (r0 == 0) goto L_0x000f
            java.lang.Throwable r6 = r6.getCause()
            goto L_0x0000
        L_0x000f:
            java.util.Iterator r0 = X.C269574fL.A00
            boolean r0 = r6 instanceof java.lang.Error
            if (r0 != 0) goto L_0x0036
            if (r3 == 0) goto L_0x0020
            X.4fA r0 = X.C269464fA.WRAP_EXCEPTIONS
            boolean r0 = r3.A0j(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r1 = 1
        L_0x0021:
            boolean r0 = r6 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x0036
            boolean r0 = r6 instanceof X.C65181bG
            if (r0 == 0) goto L_0x0036
        L_0x002b:
            X.4iD r0 = X.AnonymousClass4iD.A02(r4, r5, r6)
            throw r0
        L_0x0030:
            if (r1 != 0) goto L_0x002b
            X.C269574fL.A0F(r6)
            goto L_0x002b
        L_0x0036:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1E(X.4fV, java.lang.Object, java.lang.String, java.lang.Throwable):void");
    }

    public final void A1F(C269674fV r2, Throwable th) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        Iterator it = C269574fL.A00;
        if ((th instanceof Error) || (th instanceof IOException)) {
            throw th;
        } else if (r2 != null) {
            if (!r2.A0j(C269464fA.WRAP_EXCEPTIONS)) {
                C269574fL.A0F(th);
            }
            r2.A0f(this.A08.A00, th);
            throw AnonymousClass00P.createAndThrow();
        } else {
            throw Pxe.A0h(th.getMessage(), th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r11 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r2 == null) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0176 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonDeserializer ALh(X.C13901TjO r19, X.C269674fV r20) {
        /*
            r18 = this;
            r5 = r18
            X.T9I r11 = r5.A0B
            r8 = r11
            r10 = r20
            X.4f9 r6 = r10.A02
            X.4eA r2 = r6.A01()
            r7 = r19
            if (r19 == 0) goto L_0x0014
            r0 = 1
            if (r2 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r4 = 0
            if (r0 == 0) goto L_0x007b
            X.QkH r1 = r7.BRS()
            if (r1 == 0) goto L_0x007c
            X.SHd r0 = r2.A0H(r1)
            if (r0 == 0) goto L_0x007c
            X.SHd r9 = r2.A0I(r1, r0)
            java.lang.Class r12 = r9.A01
            java.lang.Class r3 = r9.A02
            X.4ee r0 = r10.A03()
            boolean r0 = r0.A06()
            java.lang.Object r13 = X.C269574fL.A03(r3, r0)
            X.Taf r13 = (X.C13452Taf) r13
            java.lang.Class<X.QhX> r0 = X.C8138QhX.class
            r11 = 0
            if (r12 != r0) goto L_0x0081
            X.4f7 r0 = r9.A00
            java.lang.String r11 = r0.A02
            X.TAR r0 = r5.A0A
            if (r0 == 0) goto L_0x004d
            X.QkR r3 = r0.A02(r11)
            if (r3 != 0) goto L_0x0071
        L_0x004d:
            X.SOB r0 = r5.A04
            if (r0 == 0) goto L_0x0057
            X.QkR r3 = X.SOB.A00(r0, r11)
            if (r3 != 0) goto L_0x0071
        L_0x0057:
            X.4eF r2 = r5.A08
            java.lang.Class r0 = r2.A00
            java.lang.String r1 = X.C269574fL.A06(r0)
            java.lang.String r0 = X.C269574fL.A08(r11)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Invalid Object Id definition for %s: cannot find property with name %s"
            X.Pxf.A1H(r10, r2, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0071:
            X.4eF r14 = r3.A04
            java.lang.Class r0 = r9.A03
            X.QhV r12 = new X.QhV
            r12.<init>(r0)
            goto L_0x0092
        L_0x007b:
            r1 = r4
        L_0x007c:
            if (r11 == 0) goto L_0x007f
            goto L_0x00a1
        L_0x007f:
            r8 = r5
            goto L_0x00a7
        L_0x0081:
            X.4eF r3 = r10.A0A(r12)
            java.lang.Class<X.T9X> r0 = X.T9X.class
            X.4eF[] r0 = X.AnonymousClass4eE.A03(r3, r0)
            r14 = r0[r11]
            X.T9X r12 = r10.A02(r9)
            r3 = r4
        L_0x0092:
            com.fasterxml.jackson.databind.JsonDeserializer r15 = r10.A0E(r14)
            X.4f7 r0 = r9.A00
            X.T9I r11 = new X.T9I
            r17 = r3
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x00a1:
            if (r11 == r8) goto L_0x007f
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r8 = r5.A10(r11)
        L_0x00a7:
            if (r1 == 0) goto L_0x00df
            X.T9o r3 = r2.A05(r1)
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r5.A0E
            if (r0 != 0) goto L_0x00b9
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r8 = r8.A0y()
        L_0x00b9:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0168
            java.util.Set r10 = java.util.Collections.emptySet()
        L_0x00c1:
            java.util.Set r9 = r8.A0C
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0156
            r10 = r9
        L_0x00ca:
            java.util.Set r11 = r8.A0D
            X.T9f r0 = r2.A07(r1)
            java.util.Set r0 = r0.A00
            if (r11 == 0) goto L_0x00d7
            if (r0 != 0) goto L_0x0138
            r0 = r11
        L_0x00d7:
            if (r10 != r9) goto L_0x00db
            if (r0 == r11) goto L_0x00df
        L_0x00db:
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r8 = r8.A11(r10, r0)
        L_0x00df:
            X.4eF r0 = r5.A08
            java.lang.Class r0 = r0.A00
            if (r19 == 0) goto L_0x0133
            X.4ev r0 = r7.AVO(r6, r0)
        L_0x00e9:
            X.4ew r2 = r0.A00
            X.4ew r1 = X.C269324ew.ANY
            if (r2 == r1) goto L_0x00f0
            r4 = r2
        L_0x00f0:
            X.RDC r1 = X.RDC.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            java.lang.Boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0109
            X.TAR r2 = r5.A0A
            boolean r1 = r0.booleanValue()
            boolean r0 = r2.A07
            if (r0 != r1) goto L_0x012d
            r0 = r2
        L_0x0103:
            if (r0 == r2) goto L_0x0109
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r8 = r8.A0z(r0)
        L_0x0109:
            if (r4 != 0) goto L_0x010d
            X.4ew r4 = r5.A0H
        L_0x010d:
            X.4ew r0 = X.C269324ew.ARRAY
            if (r4 != r0) goto L_0x0176
            boolean r0 = r8 instanceof com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer
            if (r0 != 0) goto L_0x0176
            boolean r0 = r8 instanceof com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer
            if (r0 != 0) goto L_0x0176
            boolean r0 = r8 instanceof com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer
            if (r0 == 0) goto L_0x016c
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer r8 = (com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer) r8
            X.TAR r0 = r8.A0A
            X.QkR[] r3 = r0.A08
            X.4eF r2 = r8.A00
            X.QkF r0 = r8.A01
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer r1 = new com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer
            r1.<init>(r2, r8, r0, r3)
            return r1
        L_0x012d:
            X.TAR r0 = new X.TAR
            r0.<init>(r2, r1)
            goto L_0x0103
        L_0x0133:
            X.4ev r0 = r6.A00()
            goto L_0x00e9
        L_0x0138:
            java.util.HashSet r3 = X.AnonymousClass7TE.A1F()
            java.util.Iterator r2 = r0.iterator()
        L_0x0140:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0154
            java.lang.Object r1 = r2.next()
            boolean r0 = r11.contains(r1)
            if (r0 == 0) goto L_0x0140
            r3.add(r1)
            goto L_0x0140
        L_0x0154:
            r0 = r3
            goto L_0x00d7
        L_0x0156:
            if (r9 == 0) goto L_0x00ca
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00ca
            java.util.HashSet r0 = X.C66580MXl.A12(r9)
            r0.addAll(r10)
            r10 = r0
            goto L_0x00ca
        L_0x0168:
            java.util.Set r10 = r3.A00
            goto L_0x00c1
        L_0x016c:
            X.TAR r0 = r8.A0A
            X.QkR[] r0 = r0.A08
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer r1 = new com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer
            r1.<init>(r8, r0)
            return r1
        L_0x0176:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.ALh(X.TjO, X.4fV):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public final Collection A0L() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            A1C.add(((C8218QkR) it.next()).A06.A02);
        }
        return A1C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (X.AnonymousClass7TF.A1V(((X.C8181Qim) r1).A05) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (X.AnonymousClass7TF.A1V(((X.C8181Qim) r1).A08) != false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A14(X.16F r5, X.C269674fV r6) {
        /*
            r4 = this;
            java.lang.Integer r1 = r5.A0n()
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x002e
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x002e
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x0053
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r4.A01
            if (r2 != 0) goto L_0x0018
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r4.A00
            if (r2 == 0) goto L_0x0048
        L_0x0018:
            X.SK6 r1 = r4.A09
            boolean r0 = r1 instanceof X.C8181Qim
            if (r0 == 0) goto L_0x0029
            r0 = r1
            X.Qim r0 = (X.C8181Qim) r0
            X.QkG r0 = r0.A05
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 != 0) goto L_0x0048
        L_0x0029:
            java.lang.Object r0 = X.SK6.A02(r5, r6, r2, r4, r1)
            return r0
        L_0x002e:
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r4.A01
            if (r2 != 0) goto L_0x0036
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r4.A00
            if (r2 == 0) goto L_0x006c
        L_0x0036:
            X.SK6 r1 = r4.A09
            boolean r0 = r1 instanceof X.C8181Qim
            if (r0 == 0) goto L_0x0029
            r0 = r1
            X.Qim r0 = (X.C8181Qim) r0
            X.QkG r0 = r0.A08
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 != 0) goto L_0x006c
            goto L_0x0029
        L_0x0048:
            X.SK6 r1 = r4.A09
            java.math.BigDecimal r0 = r5.A0r()
            java.lang.Object r0 = r1.A0B(r6, r0)
            return r0
        L_0x0053:
            X.4eF r0 = r4.A08
            java.lang.Class r3 = r0.A00
            X.SK6 r2 = r4.A09
            java.lang.Number r0 = r5.A0p()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "no suitable creator method found to deserialize from Number value (%s)"
            r6.A0Y(r2, r3, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006c:
            X.SK6 r2 = r4.A09
            double r0 = r5.A0g()
            java.lang.Object r0 = r2.A05(r6, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A14(X.16F, X.4fV):java.lang.Object");
    }

    public final void A1C(16F r2, C269674fV r3, Object obj, String str) {
        if (SQ7.A01(this, str)) {
            A1B(r2, r3, obj, str);
            return;
        }
        C12829T9a t9a = this.A02;
        if (t9a != null) {
            try {
                t9a.A01(r2, r3, obj, str);
            } catch (Exception e) {
                A1E(r3, obj, str, e);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            A0r(r2, r3, obj, str);
        }
    }

    public final void A1D(C269674fV r4, C267574bm r5, Object obj) {
        r5.A0Z();
        C8146Qhf A11 = r5.A11(r5.A01);
        while (A11.A1J() != 16L.A09) {
            String A0Y = A11.A0Y();
            A11.A1J();
            A0r(A11, r4, obj, A0Y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0081, code lost:
        r2 = r2.A07(r12.A00(r2.A06.A02));
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r11, X.SGT r12) {
        /*
            r10 = this;
            X.4eF r0 = r11.A08
            r10.<init>((X.C268894eF) r0)
            r10.A08 = r0
            X.SK6 r0 = r11.A09
            r10.A09 = r0
            X.Pxj.A1H(r11, r10)
            java.util.Map r0 = r11.A0I
            r10.A0I = r0
            java.util.Set r0 = r11.A0C
            r10.A0C = r0
            r6 = 0
            r0 = 1
            r10.A0E = r0
            java.util.Set r0 = r11.A0D
            r10.A0D = r0
            X.T9a r0 = r11.A02
            r10.A02 = r0
            X.Qhq[] r0 = r11.A0G
            r10.A0G = r0
            X.T9I r0 = r11.A0B
            r10.A0B = r0
            boolean r0 = r11.A06
            r10.A06 = r0
            X.SGe r5 = r11.A05
            if (r5 == 0) goto L_0x006d
            java.util.List r0 = r5.A00
            java.util.ArrayList r4 = X.C51970G9q.A0m(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x003c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r1 = r3.next()
            X.QkR r1 = (X.C8218QkR) r1
            X.4f7 r0 = r1.A06
            java.lang.String r0 = r0.A02
            java.lang.String r0 = r12.A00(r0)
            X.QkR r2 = r1.A07(r0)
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r2.A03()
            if (r1 == 0) goto L_0x0064
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r1.A0A(r12)
            if (r0 == r1) goto L_0x0064
            X.QkR r2 = r2.A04(r0)
        L_0x0064:
            r4.add(r2)
            goto L_0x003c
        L_0x0068:
            X.SGe r5 = new X.SGe
            r5.<init>(r4)
        L_0x006d:
            X.TAR r4 = r11.A0A
            X.SGT r0 = X.SGT.A00
            if (r12 == r0) goto L_0x00ae
            X.QkR[] r9 = r4.A08
            int r8 = r9.length
            java.util.ArrayList r3 = X.DbS.A0v(r8)
            r7 = 0
        L_0x007b:
            if (r7 >= r8) goto L_0x00a3
            r2 = r9[r7]
            if (r2 == 0) goto L_0x009d
            X.4f7 r0 = r2.A06
            java.lang.String r0 = r0.A02
            java.lang.String r0 = r12.A00(r0)
            X.QkR r2 = r2.A07(r0)
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r2.A03()
            if (r1 == 0) goto L_0x009d
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r1.A0A(r12)
            if (r0 == r1) goto L_0x009d
            X.QkR r2 = r2.A04(r0)
        L_0x009d:
            r3.add(r2)
            int r7 = r7 + 1
            goto L_0x007b
        L_0x00a3:
            boolean r2 = r4.A07
            java.util.Map r1 = r4.A05
            java.util.Locale r0 = r4.A04
            X.TAR r4 = new X.TAR
            r4.<init>((java.util.Collection) r3, (java.util.Locale) r0, (java.util.Map) r1, (boolean) r2)
        L_0x00ae:
            r10.A0A = r4
            r10.A05 = r5
            boolean r0 = r11.A0F
            r10.A0F = r0
            X.4ew r0 = r11.A0H
            r10.A0H = r0
            r10.A07 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, X.SGT):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        if (r1.A0L() == false) goto L_0x0054;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeanDeserializerBase(X.S7U r6, X.TAR r7, X.C269134ed r8, java.util.Map r9, java.util.Set r10, java.util.Set r11, boolean r12, boolean r13) {
        /*
            r5 = this;
            X.4eF r0 = r8.A05
            r5.<init>((X.C268894eF) r0)
            r5.A08 = r0
            X.SK6 r1 = r6.A02
            r5.A09 = r1
            r2 = 0
            r5.A01 = r2
            r5.A00 = r2
            r5.A04 = r2
            r5.A0A = r7
            r5.A0I = r9
            r5.A0C = r10
            r5.A0E = r12
            r5.A0D = r11
            X.T9a r0 = r6.A01
            r5.A02 = r0
            java.util.List r3 = r6.A08
            if (r3 == 0) goto L_0x0036
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0036
            int r0 = r3.size()
            X.Qhq[] r0 = new X.C8157Qhq[r0]
            java.lang.Object[] r2 = r3.toArray(r0)
            X.Qhq[] r2 = (X.C8157Qhq[]) r2
        L_0x0036:
            r5.A0G = r2
            X.T9I r4 = r6.A03
            r5.A0B = r4
            X.SGe r0 = r5.A05
            r3 = 0
            if (r0 != 0) goto L_0x0054
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L_0x0054
            boolean r0 = r1.A0I()
            if (r0 != 0) goto L_0x0054
            boolean r1 = r1.A0L()
            r0 = 0
            if (r1 != 0) goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            r5.A06 = r0
            X.4ev r0 = r8.A00()
            X.4ew r0 = r0.A00
            r5.A0H = r0
            r5.A0F = r13
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x006c
            if (r2 != 0) goto L_0x006c
            if (r13 != 0) goto L_0x006c
            if (r4 != 0) goto L_0x006c
            r3 = 1
        L_0x006c:
            r5.A07 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(X.S7U, X.TAR, X.4ed, java.util.Map, java.util.Set, java.util.Set, boolean, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r3, X.T9I r4) {
        /*
            r2 = this;
            X.4eF r0 = r3.A08
            r2.<init>((X.C268894eF) r0)
            r2.A08 = r0
            X.SK6 r0 = r3.A09
            r2.A09 = r0
            X.Pxj.A1H(r3, r2)
            java.util.Map r0 = r3.A0I
            r2.A0I = r0
            java.util.Set r0 = r3.A0C
            r2.A0C = r0
            boolean r0 = r3.A0E
            r2.A0E = r0
            java.util.Set r0 = r3.A0D
            r2.A0D = r0
            X.T9a r0 = r3.A02
            r2.A02 = r0
            X.Qhq[] r0 = r3.A0G
            r2.A0G = r0
            boolean r0 = r3.A06
            r2.A06 = r0
            X.SGe r0 = r3.A05
            r2.A05 = r0
            boolean r0 = r3.A0F
            r2.A0F = r0
            X.4ew r0 = r3.A0H
            r2.A0H = r0
            r2.A0B = r4
            X.T9n r0 = X.T9n.A08
            X.Qib r1 = new X.Qib
            r1.<init>((X.T9n) r0, (X.T9I) r4)
            X.TAR r0 = r3.A0A
            X.TAR r0 = r0.A03(r1)
            r2.A0A = r0
            r0 = 0
            r2.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, X.T9I):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r2, X.TAR r3) {
        /*
            r1 = this;
            X.4eF r0 = r2.A08
            r1.<init>((X.C268894eF) r0)
            r1.A08 = r0
            X.SK6 r0 = r2.A09
            r1.A09 = r0
            X.Pxj.A1H(r2, r1)
            r1.A0A = r3
            java.util.Map r0 = r2.A0I
            r1.A0I = r0
            java.util.Set r0 = r2.A0C
            r1.A0C = r0
            boolean r0 = r2.A0E
            r1.A0E = r0
            java.util.Set r0 = r2.A0D
            r1.A0D = r0
            X.T9a r0 = r2.A02
            r1.A02 = r0
            X.Qhq[] r0 = r2.A0G
            r1.A0G = r0
            X.T9I r0 = r2.A0B
            r1.A0B = r0
            boolean r0 = r2.A06
            r1.A06 = r0
            X.SGe r0 = r2.A05
            r1.A05 = r0
            boolean r0 = r2.A0F
            r1.A0F = r0
            X.4ew r0 = r2.A0H
            r1.A0H = r0
            boolean r0 = r2.A07
            r1.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, X.TAR):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r2, boolean r3) {
        /*
            r1 = this;
            X.4eF r0 = r2.A08
            r1.<init>((X.C268894eF) r0)
            r1.A08 = r0
            X.SK6 r0 = r2.A09
            r1.A09 = r0
            X.Pxj.A1H(r2, r1)
            X.TAR r0 = r2.A0A
            r1.A0A = r0
            java.util.Map r0 = r2.A0I
            r1.A0I = r0
            java.util.Set r0 = r2.A0C
            r1.A0C = r0
            r1.A0E = r3
            java.util.Set r0 = r2.A0D
            r1.A0D = r0
            X.T9a r0 = r2.A02
            r1.A02 = r0
            X.Qhq[] r0 = r2.A0G
            r1.A0G = r0
            X.T9I r0 = r2.A0B
            r1.A0B = r0
            boolean r0 = r2.A06
            r1.A06 = r0
            X.SGe r0 = r2.A05
            r1.A05 = r0
            boolean r0 = r2.A0F
            r1.A0F = r0
            X.4ew r0 = r2.A0H
            r1.A0H = r0
            boolean r0 = r2.A07
            r1.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, boolean):void");
    }
}
