package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4fI  reason: invalid class name and case insensitive filesystem */
public final class C269544fI extends C269554fJ implements Serializable {
    public static final C269544fI A00 = new C269554fJ(new C269594fN());
    public static final Class[] A01 = {Throwable.class};

    public final C8218QkR A0G(C269674fV r10, C268894eF r11, C269134ed r12, SK8 sk8) {
        C8218QkR qid;
        SK8 sk82 = sk8;
        C8208QkH A0H = sk8.A0H();
        if (A0H == null && (A0H = sk8.A0E()) == null) {
            r10.A0Z(r12, sk8, "No non-constructor mutator available", new Object[0]);
            throw AnonymousClass00P.createAndThrow();
        }
        C268894eF A09 = A09(r10, r11, A0H);
        C11287SJg sJg = (C11287SJg) A09.A01;
        boolean z = A0H instanceof C8206QkF;
        C269114eb r8 = r12.A07.A04;
        if (z) {
            qid = new C8173Qie(A09, (C8206QkF) A0H, sk82, sJg, r8);
        } else {
            qid = new C8172Qid(A09, (C8203QkC) A0H, sk82, sJg, r8);
        }
        JsonDeserializer A02 = C269554fJ.A02(r10, A0H);
        if (!(A02 == null && (A02 = (JsonDeserializer) A09.A02) == null)) {
            qid = qid.A04(r10.A0C(qid, A09, A02));
        }
        C10433RsA A092 = sk8.A09();
        if (A092 != null && A092.A00 == AnonymousClass05K.A00) {
            qid.A01 = A092.A01;
        }
        C11243SHd A0J = sk8.A0J();
        if (A0J != null) {
            qid.A00 = A0J;
        }
        return qid;
    }

    public static final void A00(C269674fV r10, S7U s7u, C269134ed r12) {
        C268894eF r6;
        C8218QkR qkR;
        T9X A02;
        C11243SHd sHd = r12.A00;
        if (sHd != null) {
            Class<C8138QhX> cls = sHd.A01;
            C13452Taf taf = (C13452Taf) C269574fL.A03(sHd.A02, r10.A03().A06());
            if (cls == C8138QhX.class) {
                C269434f7 r1 = sHd.A00;
                Map map = s7u.A0D;
                String str = r1.A02;
                qkR = (C8218QkR) map.get(str);
                if (qkR != null) {
                    r6 = qkR.A04;
                    A02 = new C8139QhY(sHd.A03);
                } else {
                    throw new IllegalArgumentException(String.format(Pxd.A00(153), new Object[]{C269574fL.A04(r12.A05), C269574fL.A08(str)}));
                }
            } else {
                r6 = AnonymousClass4eE.A03(r10.A0A(cls), T9X.class)[0];
                qkR = null;
                A02 = r10.A02(sHd);
            }
            s7u.A03 = new T9I(A02, taf, r6, r10.A0E(r6), sHd.A00, qkR);
        }
    }

    public static final void A01(S7U s7u, C269134ed r8) {
        Map emptyMap;
        SJu sJu = r8.A08;
        if (sJu != null) {
            if (!sJu.A0A) {
                sJu.A02();
            }
            emptyMap = sJu.A01;
        } else {
            emptyMap = Collections.emptyMap();
        }
        if (emptyMap != null) {
            for (Map.Entry entry : emptyMap.entrySet()) {
                C8208QkH qkH = (C8208QkH) entry.getValue();
                C269434f7 A002 = C269434f7.A00(qkH.A05());
                C268894eF A03 = qkH.A03();
                Object key = entry.getKey();
                if (s7u.A08 == null) {
                    s7u.A08 = new ArrayList();
                }
                C269454f9 r1 = s7u.A0A;
                if (r1.A06()) {
                    try {
                        qkH.A0D(r1.A08());
                    } catch (IllegalArgumentException e) {
                        s7u.A03(e);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                s7u.A08.add(new C8157Qhq(A03, A002, qkH, key));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: X.QkF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: X.QkF} */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.QkR] */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.QkR] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0251, code lost:
        if (r0 != null) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x032f, code lost:
        if (X.SQ7.A02(r2.A0L(), r7.A06, r7.A07) != false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0340, code lost:
        if (r2.A0B().A06 != null) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0342, code lost:
        r11 = r2.A0G();
        r10 = A09(r8, r11.A03(), r11);
        r20 = new X.C8171Qic(r10, r11, r2, (X.C11287SJg) r10.A01, r27.A04);
        r0 = X.C269554fJ.A02(r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x036b, code lost:
        if (r0 != null) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x036d, code lost:
        r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r10.A02;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0371, code lost:
        if (r0 == null) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0373, code lost:
        r1 = r20.A04(r8.A0C(r20, r10, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x037d, code lost:
        r3 = new java.util.ArrayList();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0383, code lost:
        if (r1 >= r11) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0385, code lost:
        r3.add(r5[r1].A06.A02);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0391, code lost:
        r0 = X.C269574fL.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0393, code lost:
        if (r10 != null) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0395, code lost:
        r0 = "[null]";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0397, code lost:
        r8.A0Z(r6, r2, "Could not find creator property with name %s (known Creator properties: %s)", r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03a2, code lost:
        r0 = X.C269574fL.A08(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01af, code lost:
        if (r0 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01dd, code lost:
        if (r3.A09(X.C269354ez.AUTO_DETECT_GETTERS) == false) goto L_0x01df;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.C269674fV r29, X.S7U r30, X.C269134ed r31) {
        /*
            r28 = this;
            r6 = r31
            X.4eF r1 = r6.A05
            boolean r0 = r1.A0L()
            r11 = 1
            r0 = r0 ^ 1
            r8 = r29
            r7 = r30
            if (r0 == 0) goto L_0x0051
            X.SK6 r2 = r7.A02
            X.4f9 r0 = r8.A02
            X.QkR[] r5 = r2.A0O(r0)
        L_0x0019:
            r4 = 0
            r19 = 0
            if (r5 == 0) goto L_0x0020
            r19 = 1
        L_0x0020:
            X.4f9 r3 = r8.A02
            X.4eV r0 = r6.A07
            r27 = r0
            X.T9o r2 = r3.A0A(r0)
            if (r2 == 0) goto L_0x0053
            boolean r0 = r2.A03
            r7.A09 = r0
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x004c
            java.util.Set r18 = java.util.Collections.emptySet()
        L_0x0038:
            java.util.Iterator r2 = r18.iterator()
        L_0x003c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            r7.A04(r0)
            goto L_0x003c
        L_0x004c:
            java.util.Set r0 = r2.A00
            r18 = r0
            goto L_0x0038
        L_0x0051:
            r5 = 0
            goto L_0x0019
        L_0x0053:
            java.util.Set r18 = java.util.Collections.emptySet()
        L_0x0057:
            X.4eA r10 = r3.A01()
            if (r10 != 0) goto L_0x03a7
            r2 = 0
        L_0x005e:
            X.SJu r12 = r6.A08
            r9 = r28
            if (r12 == 0) goto L_0x01b1
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x006b
            r12.A02()
        L_0x006b:
            java.util.LinkedList r13 = r12.A06
            if (r13 == 0) goto L_0x00b9
            int r0 = r13.size()
            if (r0 <= r11) goto L_0x008b
            java.lang.Object r1 = r13.get(r4)
            java.lang.Object r0 = r13.get(r11)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Multiple 'any-setter' methods defined (%s vs %s)"
        L_0x0083:
            r12.A06(r0, r1)
        L_0x0086:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008b:
            java.lang.Object r13 = r13.getFirst()
            X.QkF r13 = (X.C8206QkF) r13
            if (r13 == 0) goto L_0x00b9
            java.lang.Class r12 = r13.A0I(r4)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r12 == r0) goto L_0x0101
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r12 == r0) goto L_0x0101
            java.lang.reflect.Method r0 = r13.A01
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = r12.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00b9:
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x00c0
            r12.A02()
        L_0x00c0:
            java.util.LinkedList r13 = r12.A05
            if (r13 == 0) goto L_0x01ad
            int r0 = r13.size()
            if (r0 <= r11) goto L_0x00d9
            java.lang.Object r1 = r13.get(r4)
            java.lang.Object r0 = r13.get(r11)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Multiple 'any-setter' fields defined (%s vs %s)"
            goto L_0x0083
        L_0x00d9:
            java.lang.Object r13 = r13.getFirst()
            X.QkH r13 = (X.C8208QkH) r13
            if (r13 == 0) goto L_0x01ad
            java.lang.Class r12 = r13.A04()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r12)
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = r13.A05()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0101:
            boolean r0 = r13 instanceof X.C8206QkF
            if (r0 == 0) goto L_0x0176
            r0 = r13
            X.QkG r0 = (X.C8207QkG) r0
            X.4eF r14 = r0.A0G(r4)
            X.4eF r0 = r0.A0G(r11)
            X.4eF r15 = r9.A09(r8, r0, r13)
            java.lang.String r0 = r13.A05()
            X.4f7 r1 = X.C269434f7.A00(r0)
            X.T9n r0 = X.T9n.A07
            X.SuS r12 = new X.SuS
            r12.<init>(r15, r0, r1, r13)
        L_0x0123:
            if (r10 == 0) goto L_0x0131
            java.lang.Object r0 = r10.A0b(r13)
            if (r0 == 0) goto L_0x0131
            X.Rzp r11 = r8.A0H(r0)
            if (r11 != 0) goto L_0x013b
        L_0x0131:
            java.lang.Object r11 = r14.A02
            X.Rzp r11 = (X.C10889Rzp) r11
            if (r11 != 0) goto L_0x013b
            X.Rzp r11 = r8.A0G(r14)
        L_0x013b:
            if (r10 == 0) goto L_0x0149
            java.lang.Object r0 = r10.A0W(r13)
            if (r0 == 0) goto L_0x0149
            com.fasterxml.jackson.databind.JsonDeserializer r14 = r8.A0F(r0)
            if (r14 != 0) goto L_0x014f
        L_0x0149:
            java.lang.Object r14 = r15.A02
            com.fasterxml.jackson.databind.JsonDeserializer r14 = (com.fasterxml.jackson.databind.JsonDeserializer) r14
            if (r14 == 0) goto L_0x0153
        L_0x014f:
            com.fasterxml.jackson.databind.JsonDeserializer r14 = r8.A0C(r12, r15, r14)
        L_0x0153:
            java.lang.Object r0 = r15.A01
            X.SJg r0 = (X.C11287SJg) r0
            X.T9a r1 = new X.T9a
            r20 = r1
            r21 = r12
            r22 = r15
            r23 = r14
            r24 = r11
            r25 = r13
            r26 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)
            X.T9a r0 = r7.A01
            if (r0 == 0) goto L_0x01cb
            java.lang.String r1 = "_anySetter already set to non-null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0176:
            boolean r0 = r13 instanceof X.C8203QkC
            if (r0 == 0) goto L_0x019a
            X.4eF r0 = r13.A03()
            X.4eF r11 = r9.A09(r8, r0, r13)
            X.4eF r14 = r11.A04()
            X.4eF r15 = r11.A03()
            java.lang.String r0 = r13.A05()
            X.4f7 r1 = X.C269434f7.A00(r0)
            X.T9n r0 = X.T9n.A07
            X.SuS r12 = new X.SuS
            r12.<init>(r11, r0, r1, r13)
            goto L_0x0123
        L_0x019a:
            java.lang.Class r0 = r13.getClass()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Unrecognized mutator type for any setter: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r8.A08(r1, r0)
            goto L_0x0086
        L_0x01ad:
            java.util.HashSet r0 = r12.A00
            if (r0 != 0) goto L_0x01b5
        L_0x01b1:
            java.util.Set r0 = java.util.Collections.emptySet()
        L_0x01b5:
            if (r0 == 0) goto L_0x01cd
            java.util.Iterator r1 = r0.iterator()
        L_0x01bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            r7.A04(r0)
            goto L_0x01bb
        L_0x01cb:
            r7.A01 = r1
        L_0x01cd:
            X.4ez r0 = X.C269354ez.USE_GETTERS_AS_SETTERS
            boolean r0 = r3.A09(r0)
            if (r0 == 0) goto L_0x01df
            X.4ez r0 = X.C269354ez.AUTO_DETECT_GETTERS
            boolean r0 = r3.A09(r0)
            r17 = 1
            if (r0 != 0) goto L_0x01e1
        L_0x01df:
            r17 = 0
        L_0x01e1:
            java.util.List r11 = r6.A03()
            int r1 = r11.size()
            r0 = 4
            int r1 = java.lang.Math.max(r0, r1)
            java.util.ArrayList r16 = new java.util.ArrayList
            r0 = r16
            r0.<init>(r1)
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.Iterator r15 = r11.iterator()
        L_0x01fe:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0268
            java.lang.Object r11 = r15.next()
            X.SK8 r11 = (X.SK8) r11
            java.lang.String r13 = r11.A0L()
            r0 = r18
            boolean r0 = X.SQ7.A02(r13, r0, r2)
            if (r0 != 0) goto L_0x01fe
            boolean r0 = r11.A0P()
            if (r0 != 0) goto L_0x0262
            java.lang.Class r14 = r11.A0K()
            if (r14 == 0) goto L_0x0262
            java.lang.Object r0 = r12.get(r14)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L_0x0258
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r14 == r0) goto L_0x0253
            boolean r0 = r14.isPrimitive()
            if (r0 != 0) goto L_0x0253
            X.4ed r0 = r3.A03(r14)
            X.4eV r0 = r0.A07
            r1 = r0
            boolean r0 = r10 instanceof X.C268844e9
            if (r0 == 0) goto L_0x0253
            java.lang.Class<com.fasterxml.jackson.annotation.JsonIgnoreType> r0 = com.fasterxml.jackson.annotation.JsonIgnoreType.class
            java.lang.annotation.Annotation r0 = r1.A06(r0)
            com.fasterxml.jackson.annotation.JsonIgnoreType r0 = (com.fasterxml.jackson.annotation.JsonIgnoreType) r0
            if (r0 == 0) goto L_0x0253
            boolean r0 = r0.value()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x0255
        L_0x0253:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0255:
            r12.put(r14, r0)
        L_0x0258:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0262
            r7.A04(r13)
            goto L_0x01fe
        L_0x0262:
            r0 = r16
            r0.add(r11)
            goto L_0x01fe
        L_0x0268:
            X.4fN r0 = r9.A00
            X.4fP[] r2 = r0.A01
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0285
            X.5E8 r1 = new X.5E8
            r1.<init>(r2)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0285
            r1.next()
            java.lang.String r1 = "updateProperties"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0285:
            java.util.Iterator r13 = r16.iterator()
        L_0x0289:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x03ce
            java.lang.Object r2 = r13.next()
            X.SK8 r2 = (X.SK8) r2
            boolean r0 = r2.A0R()
            if (r0 == 0) goto L_0x02f6
            X.QkF r0 = r2.A0H()
            X.4eF r0 = r0.A0G(r4)
        L_0x02a3:
            X.QkR r1 = r9.A0G(r8, r0, r6, r2)
        L_0x02a7:
            if (r19 == 0) goto L_0x02e3
            boolean r0 = r2.A0P()
            if (r0 == 0) goto L_0x02e3
            java.lang.String r10 = r2.A0L()
            int r11 = r5.length
            r12 = 0
        L_0x02b5:
            if (r12 >= r11) goto L_0x037d
            r3 = r5[r12]
            X.4f7 r0 = r3.A06
            java.lang.String r0 = r0.A02
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x02e0
            boolean r0 = r3 instanceof X.C8174Qif
            if (r0 == 0) goto L_0x02e0
            X.Qif r3 = (X.C8174Qif) r3
            if (r3 == 0) goto L_0x037d
            if (r1 == 0) goto L_0x02cf
            r3.A00 = r1
        L_0x02cf:
            java.lang.Class[] r0 = r2.A0W()
            if (r0 != 0) goto L_0x02d9
            java.lang.Class[] r0 = r6.A05()
        L_0x02d9:
            r3.A0M(r0)
            r7.A02(r3)
            goto L_0x0289
        L_0x02e0:
            int r12 = r12 + 1
            goto L_0x02b5
        L_0x02e3:
            if (r1 == 0) goto L_0x0289
            java.lang.Class[] r0 = r2.A0W()
            if (r0 != 0) goto L_0x02ef
            java.lang.Class[] r0 = r6.A05()
        L_0x02ef:
            r1.A0M(r0)
            r7.A02(r1)
            goto L_0x0289
        L_0x02f6:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0305
            X.QkC r0 = r2.A0E()
            X.4eF r0 = r0.A03()
            goto L_0x02a3
        L_0x0305:
            X.QkF r0 = r2.A0G()
            if (r0 == 0) goto L_0x0331
            if (r17 == 0) goto L_0x0334
            java.lang.reflect.Method r0 = r0.A01
            java.lang.Class r1 = r0.getReturnType()
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x0323
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0334
        L_0x0323:
            java.lang.String r3 = r2.A0L()
            java.util.HashSet r1 = r7.A06
            java.util.HashSet r0 = r7.A07
            boolean r0 = X.SQ7.A02(r3, r1, r0)
            if (r0 == 0) goto L_0x0342
        L_0x0331:
            r1 = 0
            goto L_0x02a7
        L_0x0334:
            boolean r0 = r2.A0P()
            if (r0 != 0) goto L_0x0331
            X.T9n r0 = r2.A0B()
            X.RsB r0 = r0.A06
            if (r0 == 0) goto L_0x0331
        L_0x0342:
            X.QkF r11 = r2.A0G()
            X.4eF r0 = r11.A03()
            X.4eF r10 = r9.A09(r8, r0, r11)
            java.lang.Object r3 = r10.A01
            X.SJg r3 = (X.C11287SJg) r3
            r0 = r27
            X.4eb r0 = r0.A04
            X.Qic r1 = new X.Qic
            r20 = r1
            r21 = r10
            r22 = r11
            r23 = r2
            r24 = r3
            r25 = r0
            r20.<init>(r21, r22, r23, r24, r25)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = X.C269554fJ.A02(r8, r11)
            if (r0 != 0) goto L_0x0373
            java.lang.Object r0 = r10.A02
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0
            if (r0 == 0) goto L_0x02a7
        L_0x0373:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r8.A0C(r1, r10, r0)
            X.QkR r1 = r1.A04(r0)
            goto L_0x02a7
        L_0x037d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1 = 0
        L_0x0383:
            if (r1 >= r11) goto L_0x0391
            r0 = r5[r1]
            X.4f7 r0 = r0.A06
            java.lang.String r0 = r0.A02
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x0383
        L_0x0391:
            X.4fM[] r0 = X.C269574fL.A01
            if (r10 != 0) goto L_0x03a2
            java.lang.String r0 = "[null]"
        L_0x0397:
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r3}
            java.lang.String r0 = "Could not find creator property with name %s (known Creator properties: %s)"
            r8.A0Z(r6, r2, r0, r1)
            goto L_0x0086
        L_0x03a2:
            java.lang.String r0 = X.C269574fL.A08(r10)
            goto L_0x0397
        L_0x03a7:
            r0 = r27
            X.T9f r0 = r10.A07(r0)
            java.util.Set r2 = r0.A00
            if (r2 == 0) goto L_0x005e
            java.util.Iterator r12 = r2.iterator()
        L_0x03b5:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r9 = r12.next()
            java.util.HashSet r0 = r7.A07
            if (r0 != 0) goto L_0x03ca
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r7.A07 = r0
        L_0x03ca:
            r0.add(r9)
            goto L_0x03b5
        L_0x03ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269544fI.A0I(X.4fV, X.S7U, X.4ed):void");
    }

    public final void A0H(C269674fV r8, S7U s7u, C269134ed r10) {
        String str;
        String A08;
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (SK8 sk8 : r10.A03()) {
            C10433RsA A09 = sk8.A09();
            if (A09 != null && A09.A00 == AnonymousClass05K.A01) {
                String str2 = A09.A01;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(str2);
                } else if (!hashSet.add(str2)) {
                    C269584fM[] r0 = C269574fL.A01;
                    if (str2 == null) {
                        A08 = "[null]";
                    } else {
                        A08 = C269574fL.A08(str2);
                    }
                    throw new IllegalArgumentException(002.A0R("Multiple back-reference properties with name ", A08));
                }
                arrayList.add(sk8);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SK8 sk82 = (SK8) it.next();
                C10433RsA A092 = sk82.A09();
                if (A092 == null) {
                    str = null;
                } else {
                    str = A092.A01;
                }
                C8218QkR A0G = A0G(r8, sk82.A0A(), r10, sk82);
                if (s7u.A05 == null) {
                    s7u.A05 = new HashMap(4);
                }
                C269454f9 r2 = s7u.A0A;
                if (r2.A06()) {
                    try {
                        A0G.A0J(r2);
                    } catch (IllegalArgumentException e) {
                        s7u.A03(e);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                s7u.A05.put(str, A0G);
            }
        }
    }
}
