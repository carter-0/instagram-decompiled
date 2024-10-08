package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

/* renamed from: X.4fJ  reason: invalid class name and case insensitive filesystem */
public abstract class C269554fJ extends C269564fK implements Serializable {
    public final C269594fN A00;

    public static final T9m A03(C269454f9 r14, C8208QkH qkH, Class cls) {
        boolean z;
        boolean z2;
        Enum[] enumArr;
        HashMap hashMap;
        Enum enumR;
        C8208QkH qkH2 = qkH;
        Class cls2 = cls;
        if (qkH != null) {
            if (r14.A06()) {
                C269574fL.A0H(qkH.A0C(), r14.A08());
            }
            C268854eA A01 = r14.A01();
            z2 = r14.A09(C269354ez.ACCEPT_CASE_INSENSITIVE_ENUMS);
            enumArr = T9m.A01(cls2);
            hashMap = new HashMap();
            int length = enumArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                Enum enumR2 = enumArr[length];
                try {
                    Object A0A = qkH2.A0A(enumR2);
                    if (A0A != null) {
                        hashMap.put(A0A.toString(), enumR2);
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to access @JsonValue of Enum value ");
                    sb.append(enumR2);
                    sb.append(": ");
                    sb.append(e.getMessage());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (A01 != null) {
                enumR = A01.A0U(cls2);
            } else {
                enumR = null;
            }
            Class<Byte> A04 = qkH2.A04();
            if (A04.isPrimitive()) {
                A04 = C269574fL.A02(A04);
            }
            if (A04 == Long.class || A04 == Integer.class || A04 == Short.class || A04 == Byte.class) {
                z = true;
                return new T9m(cls2, enumR, hashMap, enumArr, z2, z);
            }
        } else {
            C268854eA A012 = r14.A01();
            z2 = r14.A09(C269354ez.ACCEPT_CASE_INSENSITIVE_ENUMS);
            enumArr = T9m.A01(cls2);
            int length2 = enumArr.length;
            String[] strArr = new String[length2];
            A012.A0m(cls2, enumArr, strArr);
            String[][] strArr2 = new String[length2][];
            A012.A0n(cls2, enumArr, strArr2);
            hashMap = new HashMap();
            for (int i = 0; i < length2; i++) {
                Enum enumR3 = enumArr[i];
                String str = strArr[i];
                if (str == null) {
                    str = enumR3.name();
                }
                hashMap.put(str, enumR3);
                String[] strArr3 = strArr2[i];
                if (strArr3 != null) {
                    for (String str2 : strArr3) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, enumR3);
                        }
                    }
                }
            }
            enumR = A012.A0U(cls2);
        }
        z = false;
        return new T9m(cls2, enumR, hashMap, enumArr, z2, z);
    }

    public static final void A04(SP7 sp7, C8207QkG qkG, boolean z, boolean z2) {
        Class<BigDecimal> A0I = qkG.A0I(0);
        int i = 1;
        if (A0I == String.class || A0I == CharSequence.class) {
            if (!z && !z2) {
                return;
            }
        } else if (A0I == Integer.TYPE || A0I == Integer.class) {
            if (z || z2) {
                i = 2;
            } else {
                return;
            }
        } else if (A0I == Long.TYPE || A0I == Long.class) {
            if (z || z2) {
                i = 3;
            } else {
                return;
            }
        } else if (A0I == Double.TYPE || A0I == Double.class) {
            if (z || z2) {
                i = 5;
            } else {
                return;
            }
        } else if (A0I != Boolean.TYPE && A0I != Boolean.class) {
            if (A0I == BigInteger.class && (z || z2)) {
                sp7.A03(qkG, 4, z);
            }
            if (A0I == BigDecimal.class) {
                if (z || z2) {
                    sp7.A03(qkG, 6, z);
                } else {
                    return;
                }
            }
            if (z) {
                sp7.A01(qkG, (C8218QkR[]) null, 0, z);
                return;
            }
            return;
        } else if (z || z2) {
            i = 7;
        } else {
            return;
        }
        sp7.A03(qkG, i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r0 = r5.A0L();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.C268854eA r3, X.C8207QkG r4, X.SK8 r5) {
        /*
            r2 = 1
            if (r5 == 0) goto L_0x0009
            boolean r0 = r5.A0T()
            if (r0 != 0) goto L_0x0028
        L_0x0009:
            r1 = 0
            X.QkB r0 = r4.A0H(r1)
            X.T9g r0 = r3.A02(r0)
            if (r0 != 0) goto L_0x0028
            if (r5 == 0) goto L_0x0029
            java.lang.String r0 = r5.A0L()
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0029
            boolean r0 = r5.A0O()
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            return r2
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269554fJ.A05(X.4eA, X.QkG, X.SK8):boolean");
    }

    static {
        C269434f7 r0 = C269434f7.A03;
        C269584fM[] r02 = C269574fL.A01;
    }

    public static final JsonDeserializer A02(C269674fV r1, C269064eW r2) {
        Object A0Z;
        C268854eA A01 = r1.A02.A01();
        if (A01 == null || (A0Z = A01.A0Z(r2)) == null) {
            return null;
        }
        return r1.A0F(A0Z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C268894eF A09(X.C269674fV r6, X.C268894eF r7, X.C8208QkH r8) {
        /*
            r5 = this;
            X.4f9 r3 = r6.A02
            X.4eA r2 = r3.A01()
            if (r2 != 0) goto L_0x0009
            return r7
        L_0x0009:
            boolean r0 = r7.A0O()
            if (r0 == 0) goto L_0x0025
            X.4eF r0 = r7.A04()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r2.A0b(r8)
            X.Rzp r0 = r6.A0H(r0)
            if (r0 == 0) goto L_0x0025
            X.Qly r7 = (X.Qly) r7
            X.Qly r7 = r7.A0T(r0)
        L_0x0025:
            boolean r0 = r7 instanceof X.C268934eJ
            if (r0 == 0) goto L_0x0030
            r0 = r7
            X.4eJ r0 = (X.C268934eJ) r0
            boolean r0 = r0 instanceof X.AnonymousClass4iM
            if (r0 == 0) goto L_0x0052
        L_0x0030:
            java.lang.Object r0 = r2.A0W(r8)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x003e
            X.4eF r7 = r7.A0D(r0)
        L_0x003e:
            X.Tg5 r4 = r2.A0J(r7, r3, r8)
            X.4eF r1 = r7.A03()
            if (r4 != 0) goto L_0x0072
            X.QkY r0 = r5.A08(r3, r1)
        L_0x004c:
            if (r0 == 0) goto L_0x0052
            X.4eF r7 = r7.A0C(r0)
        L_0x0052:
            boolean r0 = r2 instanceof X.C268844e9
            if (r0 == 0) goto L_0x0091
            r1 = r2
            X.4e9 r1 = (X.C268844e9) r1
            boolean r0 = r7.A0N()
            if (r0 != 0) goto L_0x0091
            boolean r0 = r7.A02()
            if (r0 != 0) goto L_0x0091
            X.Tg5 r1 = r1.A0s(r3, r8)
            if (r1 == 0) goto L_0x0091
            X.4ef r0 = r3.A03
            java.util.ArrayList r0 = r0.A02(r7, r3, r8)
            goto L_0x007d
        L_0x0072:
            X.4ef r0 = r3.A03
            java.util.ArrayList r0 = r0.A02(r1, r3, r8)
            X.QkY r0 = r4.AEd(r3, r1, r0)
            goto L_0x004c
        L_0x007d:
            X.QkY r0 = r1.AEd(r3, r7, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0082 }
            goto L_0x0095
        L_0x0082:
            r3 = move-exception
            r2 = 0
            java.lang.String r1 = X.C269574fL.A09(r3)
            X.Qi4 r0 = new X.Qi4
            r0.<init>((X.16F) r2, (X.C268894eF) r7, (java.lang.String) r1)
            r0.initCause(r3)
            throw r0
        L_0x0091:
            X.QkY r0 = r5.A08(r3, r7)
        L_0x0095:
            if (r0 == 0) goto L_0x009b
            X.4eF r7 = r7.A0E(r0)
        L_0x009b:
            X.4eF r0 = r2.A0B(r7, r3, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269554fJ.A09(X.4fV, X.4eF, X.QkH):X.4eF");
    }

    public final C8218QkR A0A(C12834T9g t9g, C269674fV r23, C269434f7 r24, C8202QkB qkB, C269134ed r26, int i) {
        T9n A002;
        C269674fV r4 = r23;
        C269454f9 r7 = r4.A02;
        C268854eA A01 = r7.A01();
        C8202QkB qkB2 = qkB;
        if (A01 == null) {
            A002 = T9n.A09;
        } else {
            A002 = T9n.A00(A01.A0S(qkB2), A01.A0V(qkB2), A01.A0i(qkB2), A01.A0h(qkB2));
        }
        C269224em r6 = null;
        C268894eF A09 = A09(r4, qkB2.A01, qkB2);
        C11287SJg sJg = (C11287SJg) A09.A01;
        if (sJg == null) {
            sJg = A08(r7, A09);
        }
        C269224em r14 = null;
        if (A01 != null) {
            C269214el A092 = A01.A09(qkB2);
            r14 = A092.A01;
            C269224em r0 = C269224em.DEFAULT;
            if (r14 == r0) {
                r14 = null;
            }
            r6 = A092.A00;
            if (r6 == r0) {
                r6 = null;
            }
        }
        C269214el r1 = r7.A01.A01;
        if (r14 == null && (r14 = r1.A01) == C269224em.DEFAULT) {
            r14 = null;
        }
        if (r6 == null && (r6 = r1.A00) == C269224em.DEFAULT) {
            r6 = null;
        }
        if (!(r14 == null && r6 == null)) {
            Boolean bool = A002.A02;
            String str = A002.A05;
            A002 = new T9n(r14, r6, A002.A06, bool, A002.A03, str, A002.A04);
        }
        C8174Qif qif = new C8174Qif(t9g, A09, A002, r24, qkB2, sJg, r26.A07.A04, i);
        JsonDeserializer A02 = A02(r4, qkB2);
        if (A02 == null && (A02 = (JsonDeserializer) A09.A02) == null) {
            return qif;
        }
        return qif.A04(r4.A0C(qif, A09, A02));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r1 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        if (r2.getClass() == r1) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.SK6 A0B(X.C269674fV r5, X.C269134ed r6) {
        /*
            r4 = this;
            X.4f9 r2 = r5.A02
            X.4eV r1 = r6.A07
            X.4eA r0 = r2.A01()
            boolean r0 = r0 instanceof X.C268844e9
            if (r0 == 0) goto L_0x003a
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonValueInstantiator> r0 = com.fasterxml.jackson.databind.annotation.JsonValueInstantiator.class
            java.lang.annotation.Annotation r0 = r1.A06(r0)
            com.fasterxml.jackson.databind.annotation.JsonValueInstantiator r0 = (com.fasterxml.jackson.databind.annotation.JsonValueInstantiator) r0
            if (r0 == 0) goto L_0x003a
            java.lang.Class r1 = r0.value()
            if (r1 == 0) goto L_0x003a
            boolean r0 = r1 instanceof X.SK6
            if (r0 != 0) goto L_0x0036
            boolean r0 = X.C269574fL.A0I(r1)
            if (r0 != 0) goto L_0x003a
            java.lang.Class<X.SK6> r0 = X.SK6.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r2.A06()
            java.lang.Object r1 = X.C269574fL.A03(r1, r0)
        L_0x0036:
            X.SK6 r1 = (X.SK6) r1
            if (r1 != 0) goto L_0x0047
        L_0x003a:
            X.4eF r0 = r6.A05
            java.lang.Class r1 = r0.A00
            java.lang.Class<X.T9j> r0 = X.C12837T9j.class
            if (r1 != r0) goto L_0x0064
            X.Qig r1 = new X.Qig
            r1.<init>()
        L_0x0047:
            X.4fN r0 = r4.A00
            X.4fR[] r3 = r0.A04
            int r0 = r3.length
            if (r0 <= 0) goto L_0x00a7
            X.5E8 r2 = new X.5E8
            r2.<init>(r3)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a7
            r2.next()
            java.lang.String r0 = "findValueInstantiator"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x0064:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x007e
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            if (r1 != r0) goto L_0x0073
            X.Qii r1 = X.C8177Qii.A00
            goto L_0x0047
        L_0x0073:
            java.util.Set r2 = java.util.Collections.EMPTY_SET
            java.lang.Class r0 = r2.getClass()
            if (r0 == r1) goto L_0x009c
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            goto L_0x0096
        L_0x007e:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x00a2
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            if (r1 != r0) goto L_0x008d
            X.Qik r1 = X.C8179Qik.A00
            goto L_0x0047
        L_0x008d:
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            if (r1 != r0) goto L_0x0094
            X.Qij r1 = X.C8178Qij.A00
            goto L_0x0047
        L_0x0094:
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
        L_0x0096:
            java.lang.Class r0 = r2.getClass()
            if (r0 != r1) goto L_0x00a2
        L_0x009c:
            X.Qih r1 = new X.Qih
            r1.<init>(r2)
            goto L_0x0047
        L_0x00a2:
            X.Qim r1 = r4.A0C(r5, r6)
            goto L_0x0047
        L_0x00a7:
            return r1
        L_0x00a8:
            java.lang.String r2 = "AnnotationIntrospector returned Class "
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "; expected Class<ValueInstantiator>"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269554fJ.A0B(X.4fV, X.4ed):X.SK6");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 379 */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x035f, code lost:
        if (r7 == null) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0447, code lost:
        if (r7 >= r10) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0449, code lost:
        r13 = r12.A0H(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x044d, code lost:
        if (r0 == null) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x044f, code lost:
        r25 = r0.A0D(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0453, code lost:
        if (r25 == null) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0459, code lost:
        if (r25.A02() != false) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x045f, code lost:
        if (r25.A02() != false) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0461, code lost:
        r8[r7] = A0A((X.C12834T9g) null, r4, r25, r13, r2, r13.A00);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0476, code lost:
        if (r11 != null) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0478, code lost:
        r11 = r12;
        r9 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x054f, code lost:
        if (r3.A0T() != false) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x056a, code lost:
        if (r0.A0L(r11) != null) goto L_0x056c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C8181Qim A0C(X.C269674fV r32, X.C269134ed r33) {
        /*
            r31 = this;
            r4 = r32
            X.4f9 r6 = r4.A02
            r2 = r33
            X.4eF r0 = r2.A05
            r29 = r0
            java.lang.Class r0 = r0.A00
            r28 = r0
            X.4eV r0 = r2.A07
            r18 = r0
            r1 = r0
            r0 = r28
            X.4eo r21 = r6.A04(r1, r0)
            X.Y1S r0 = r6.A06
            r17 = r0
            if (r0 != 0) goto L_0x0021
            X.Y1S r17 = X.Y1S.A01
        L_0x0021:
            X.SP7 r1 = new X.SP7
            r1.<init>(r6, r2)
            java.util.Map r5 = java.util.Collections.emptyMap()
            java.util.List r0 = r2.A03()
            java.util.Iterator r11 = r0.iterator()
        L_0x0032:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r10 = r11.next()
            X.SK8 r10 = (X.SK8) r10
            java.util.Iterator r9 = r10.A0M()
        L_0x0042:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r3 = r9.next()
            X.QkB r3 = (X.C8202QkB) r3
            X.QkG r8 = r3.A02
            java.lang.Object r0 = r5.get(r8)
            X.SK8[] r0 = (X.SK8[]) r0
            int r7 = r3.A00
            if (r0 != 0) goto L_0x0164
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0065
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
        L_0x0065:
            int r0 = r8.A0F()
            X.SK8[] r0 = new X.SK8[r0]
            r5.put(r8, r0)
        L_0x006e:
            r0[r7] = r10
            goto L_0x0042
        L_0x0071:
            r3 = 0
            r19 = 0
            r8 = 0
            r20 = 0
            X.4eA r0 = r6.A01()
            java.util.List r6 = r2.A04()
            java.util.Iterator r12 = r6.iterator()
        L_0x0083:
            boolean r6 = r12.hasNext()
            r30 = r31
            if (r6 == 0) goto L_0x0110
            java.lang.Object r10 = r12.next()
            X.QkG r10 = (X.C8207QkG) r10
            X.REE r11 = r0.A03(r10)
            int r9 = r10.A0F()
            r7 = 1
            if (r11 != 0) goto L_0x00bf
            if (r9 != r7) goto L_0x0083
            r6 = r21
            X.4en r6 = (X.C269234en) r6
            java.lang.reflect.Member r7 = r10.A0C()
            X.4ep r6 = r6.A00
            boolean r6 = r6.A00(r7)
            if (r6 == 0) goto L_0x0083
            X.SHN r7 = X.SHN.A00(r0, r10, r8)
            if (r20 != 0) goto L_0x00b9
            java.util.LinkedList r20 = new java.util.LinkedList
            r20.<init>()
        L_0x00b9:
            r6 = r20
            r6.add(r7)
            goto L_0x0083
        L_0x00bf:
            X.REE r6 = X.REE.DISABLED
            if (r11 == r6) goto L_0x0083
            if (r9 != 0) goto L_0x00d9
            X.QkG[] r9 = r1.A08
            boolean r6 = r1.A06
            if (r6 == 0) goto L_0x00d6
            java.lang.reflect.AnnotatedElement r7 = r10.A07()
            java.lang.reflect.Member r7 = (java.lang.reflect.Member) r7
            boolean r6 = r1.A07
            X.C269574fL.A0H(r7, r6)
        L_0x00d6:
            r9[r3] = r10
            goto L_0x0083
        L_0x00d9:
            int r9 = r11.ordinal()
            if (r9 == r7) goto L_0x0106
            r7 = 2
            java.lang.Object r6 = r5.get(r10)
            X.SK8[] r6 = (X.SK8[]) r6
            if (r9 == r7) goto L_0x00fc
            X.SHN r25 = X.SHN.A00(r0, r10, r6)
            X.Y1S r24 = X.Y1S.A01
            r22 = r30
            r23 = r4
            r26 = r1
            r27 = r2
            r22.A0D(r23, r24, r25, r26, r27)
        L_0x00f9:
            int r19 = r19 + 1
            goto L_0x0083
        L_0x00fc:
            X.SHN r7 = X.SHN.A00(r0, r10, r6)
            r6 = r30
            r6.A0F(r4, r7, r1, r2)
            goto L_0x00f9
        L_0x0106:
            X.SHN r7 = X.SHN.A00(r0, r10, r8)
            r6 = r30
            r6.A0E(r4, r7, r1, r2)
            goto L_0x00f9
        L_0x0110:
            r6 = r29
            boolean r6 = r6 instanceof X.AnonymousClass4iN
            if (r6 != 0) goto L_0x0124
            int r6 = r28.getModifiers()
            r6 = r6 & 1536(0x600, float:2.152E-42)
            if (r6 == 0) goto L_0x0124
            boolean r6 = r28.isPrimitive()
            if (r6 == 0) goto L_0x04ec
        L_0x0124:
            boolean r6 = r29.A0P()
            if (r6 == 0) goto L_0x01be
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.RuntimeException r6 = X.SHH.A04
            if (r6 != 0) goto L_0x0179
            X.SHH r13 = X.SHH.A03
            r6 = r28
            java.lang.Object[] r14 = r13.A00(r6)
            int r12 = r14.length
            X.Xa1[] r11 = new X.C21393Xa1[r12]
            r10 = 0
        L_0x013f:
            if (r10 >= r12) goto L_0x0283
            java.lang.reflect.Method r9 = r13.A00     // Catch:{ Exception -> 0x0197 }
            r7 = r14[r10]     // Catch:{ Exception -> 0x0197 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r9 = r9.invoke(r7, r6)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0197 }
            java.lang.reflect.Method r6 = r13.A01     // Catch:{ Exception -> 0x017a }
            r15 = r6
            r7 = r14[r10]     // Catch:{ Exception -> 0x017a }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x017a }
            java.lang.Object r7 = r15.invoke(r7, r6)     // Catch:{ Exception -> 0x017a }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ Exception -> 0x017a }
            X.Xa1 r6 = new X.Xa1
            r6.<init>(r7, r9)
            r11[r10] = r6
            int r10 = r10 + 1
            goto L_0x013f
        L_0x0164:
            r3 = r0[r7]
            if (r3 == 0) goto L_0x006e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r8, r3, r10}
            java.lang.String r0 = "Conflict: parameter #%d of %s bound to more than one property; %s vs %s"
            r4.A0a(r2, r0, r1)
            X.00P r6 = X.AnonymousClass00P.createAndThrow()
        L_0x0179:
            throw r6
        L_0x017a:
            r3 = move-exception
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = X.C269574fL.A06(r28)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "Failed to access type of field #%d (of %d) of Record type %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r3)
            throw r0
        L_0x0197:
            r3 = move-exception
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = X.C269574fL.A06(r28)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            r0 = 489(0x1e9, float:6.85E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r3)
            throw r0
        L_0x01b8:
            X.REE r6 = X.REE.DELEGATING
            if (r6 == r9) goto L_0x01be
            if (r10 == r7) goto L_0x0295
        L_0x01be:
            boolean r6 = r18.A09()
            if (r6 != 0) goto L_0x04ec
            r12 = 0
            boolean r6 = X.C269574fL.A0J(r28)
            if (r6 == 0) goto L_0x0280
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            r6 = r28
            boolean r6 = r7.isAssignableFrom(r6)
            if (r6 != 0) goto L_0x0280
        L_0x01d5:
            X.4eY r6 = X.C269054eV.A00(r18)
            X.QkE r10 = r6.A00
            if (r10 == 0) goto L_0x0200
            X.QkG[] r9 = r1.A08
            r6 = r9[r3]
            if (r6 == 0) goto L_0x01ef
            if (r0 == 0) goto L_0x0200
            X.REE r7 = r0.A03(r10)
            if (r7 == 0) goto L_0x0200
            X.REE r6 = X.REE.DISABLED
            if (r7 == r6) goto L_0x0200
        L_0x01ef:
            boolean r6 = r1.A06
            if (r6 == 0) goto L_0x01fe
            java.lang.reflect.AnnotatedElement r7 = r10.A07()
            java.lang.reflect.Member r7 = (java.lang.reflect.Member) r7
            boolean r6 = r1.A07
            X.C269574fL.A0H(r7, r6)
        L_0x01fe:
            r9[r3] = r10
        L_0x0200:
            X.4eY r6 = X.C269054eV.A00(r18)
            java.util.List r6 = r6.A01
            java.util.Iterator r11 = r6.iterator()
        L_0x020a:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0326
            java.lang.Object r10 = r11.next()
            X.QkG r10 = (X.C8207QkG) r10
            X.REE r7 = r0.A03(r10)
            X.REE r6 = X.REE.DISABLED
            if (r6 == r7) goto L_0x020a
            if (r7 != 0) goto L_0x0247
            if (r12 == 0) goto L_0x020a
            r6 = r21
            X.4en r6 = (X.C269234en) r6
            java.lang.reflect.Member r7 = r10.A0C()
            X.4ep r6 = r6.A00
            boolean r6 = r6.A00(r7)
            if (r6 == 0) goto L_0x020a
            java.lang.Object r6 = r5.get(r10)
            X.SK8[] r6 = (X.SK8[]) r6
            X.SHN r6 = X.SHN.A00(r0, r10, r6)
            if (r8 != 0) goto L_0x0243
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
        L_0x0243:
            r8.add(r6)
            goto L_0x020a
        L_0x0247:
            int r9 = r7.ordinal()
            r6 = 1
            if (r9 == r6) goto L_0x0275
            r7 = 2
            java.lang.Object r6 = r5.get(r10)
            X.SK8[] r6 = (X.SK8[]) r6
            if (r9 == r7) goto L_0x026b
            X.SHN r25 = X.SHN.A00(r0, r10, r6)
            r22 = r30
            r23 = r4
            r24 = r17
            r26 = r1
            r27 = r2
            r22.A0D(r23, r24, r25, r26, r27)
        L_0x0268:
            int r3 = r3 + 1
            goto L_0x020a
        L_0x026b:
            X.SHN r7 = X.SHN.A00(r0, r10, r6)
            r6 = r30
            r6.A0F(r4, r7, r1, r2)
            goto L_0x0268
        L_0x0275:
            r6 = 0
            X.SHN r7 = X.SHN.A00(r0, r10, r6)
            r6 = r30
            r6.A0E(r4, r7, r1, r2)
            goto L_0x0268
        L_0x0280:
            r12 = 1
            goto L_0x01d5
        L_0x0283:
            X.4eY r6 = X.C269054eV.A00(r18)
            if (r12 != 0) goto L_0x02ad
            X.QkE r7 = r6.A00
            java.util.List r13 = java.util.Collections.singletonList(r7)
            if (r7 == 0) goto L_0x04dc
        L_0x0291:
            java.util.Iterator r13 = r13.iterator()
        L_0x0295:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x02d9
            java.lang.Object r10 = r13.next()
            X.4eW r10 = (X.C269064eW) r10
            X.REE r9 = r0.A03(r10)
            if (r9 == 0) goto L_0x0295
            X.REE r6 = X.REE.DISABLED
            if (r6 == r9) goto L_0x0295
            goto L_0x01b8
        L_0x02ad:
            java.util.List r13 = r6.A01
            java.util.Iterator r14 = r13.iterator()
        L_0x02b3:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x04dc
            java.lang.Object r7 = r14.next()
            X.QkG r7 = (X.C8207QkG) r7
            int r6 = r7.A0F()
            if (r6 != r12) goto L_0x02b3
            r10 = 0
        L_0x02c6:
            java.lang.Class r9 = r7.A0I(r10)
            r6 = r11[r10]
            java.lang.Class r6 = r6.A00
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x02b3
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x0291
            goto L_0x02c6
        L_0x02d9:
            r10 = 0
        L_0x02da:
            if (r10 >= r12) goto L_0x02e8
            r6 = r11[r10]
            java.lang.String r9 = r6.A01
            r6 = r16
            r6.add(r9)
            int r10 = r10 + 1
            goto L_0x02da
        L_0x02e8:
            if (r7 == 0) goto L_0x01be
            int r10 = r7.A0F()
            X.QkR[] r9 = new X.C8218QkR[r10]
            r8 = 0
        L_0x02f1:
            if (r8 >= r10) goto L_0x058e
            X.QkB r6 = r7.A0H(r8)
            X.T9g r18 = r0.A02(r6)
            X.4f7 r20 = r0.A0D(r6)
            if (r20 == 0) goto L_0x0307
            boolean r5 = r20.A02()
            if (r5 == 0) goto L_0x0313
        L_0x0307:
            r5 = r16
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            X.4f7 r20 = X.C269434f7.A00(r5)
        L_0x0313:
            r17 = r30
            r19 = r4
            r21 = r6
            r22 = r2
            r23 = r8
            X.QkR r5 = r17.A0A(r18, r19, r20, r21, r22, r23)
            r9[r8] = r5
            int r8 = r8 + 1
            goto L_0x02f1
        L_0x0326:
            if (r8 == 0) goto L_0x04ec
            if (r3 > 0) goto L_0x04ec
            java.util.Iterator r18 = r8.iterator()
            r12 = 0
        L_0x032f:
            boolean r6 = r18.hasNext()
            if (r6 == 0) goto L_0x040a
            java.lang.Object r13 = r18.next()
            X.SHN r13 = (X.SHN) r13
            int r10 = r13.A00
            X.QkG r9 = r13.A01
            r6 = 1
            r8 = 0
            if (r10 != r6) goto L_0x0395
            X.Rub[] r7 = r13.A02
            r6 = r7[r8]
            X.SK8 r10 = r6.A02
            boolean r6 = A05(r0, r9, r10)
            if (r6 == 0) goto L_0x037c
            r10 = r7[r8]
            X.T9g r7 = r10.A00
            X.SK8 r6 = r10.A02
            if (r6 == 0) goto L_0x035d
            X.4f7 r25 = r6.A0C()
            if (r25 != 0) goto L_0x0362
        L_0x035d:
            r25 = 0
            if (r7 != 0) goto L_0x0362
            goto L_0x032f
        L_0x0362:
            X.QkB r6 = r10.A01
            r22 = r30
            r23 = r7
            r24 = r4
            r26 = r6
            r27 = r2
            r28 = r8
            X.QkR r6 = r22.A0A(r23, r24, r25, r26, r27, r28)
            X.QkR[] r6 = new X.C8218QkR[]{r6}
            r1.A02(r9, r6, r8)
            goto L_0x032f
        L_0x037c:
            r6 = r21
            X.4en r6 = (X.C269234en) r6
            java.lang.reflect.Member r7 = r9.A0C()
            X.4ep r6 = r6.A00
            boolean r6 = r6.A00(r7)
            A04(r1, r9, r8, r6)
            if (r10 == 0) goto L_0x032f
            X.QkM r10 = (X.C8213QkM) r10
            r6 = 0
            r10.A00 = r6
            goto L_0x032f
        L_0x0395:
            X.QkR[] r7 = new X.C8218QkR[r10]
            r6 = 0
            r17 = -1
            r16 = 0
            r15 = 0
        L_0x039d:
            if (r6 >= r10) goto L_0x03e0
            X.QkB r11 = r9.A0H(r6)
            X.Rub[] r14 = r13.A02
            r14 = r14[r6]
            X.SK8 r14 = r14.A02
            X.T9g r23 = r0.A02(r11)
            if (r14 != 0) goto L_0x03d3
            r25 = 0
        L_0x03b1:
            if (r23 == 0) goto L_0x03c8
            int r15 = r15 + 1
        L_0x03b5:
            r22 = r30
            r24 = r4
            r26 = r11
            r27 = r2
            r28 = r6
            X.QkR r11 = r22.A0A(r23, r24, r25, r26, r27, r28)
            r7[r6] = r11
        L_0x03c5:
            int r6 = r6 + 1
            goto L_0x039d
        L_0x03c8:
            X.SGT r14 = r0.A0L(r11)
            if (r14 != 0) goto L_0x056c
            if (r17 >= 0) goto L_0x03c5
            r17 = r6
            goto L_0x03c5
        L_0x03d3:
            X.4f7 r25 = r14.A0C()
            boolean r14 = r14.A0T()
            if (r14 == 0) goto L_0x03b1
            int r16 = r16 + 1
            goto L_0x03b5
        L_0x03e0:
            if (r16 > 0) goto L_0x03f6
            if (r15 > 0) goto L_0x03f6
            X.QkG[] r6 = r1.A08
            r6 = r6[r8]
            if (r6 != 0) goto L_0x032f
            if (r12 != 0) goto L_0x03f1
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
        L_0x03f1:
            r12.add(r9)
            goto L_0x032f
        L_0x03f6:
            int r6 = r16 + r15
            if (r6 != r10) goto L_0x03ff
            r1.A02(r9, r7, r8)
            goto L_0x032f
        L_0x03ff:
            if (r16 != 0) goto L_0x057c
            int r6 = r15 + 1
            if (r6 != r10) goto L_0x057c
            r1.A01(r9, r7, r8, r8)
            goto L_0x032f
        L_0x040a:
            if (r12 == 0) goto L_0x04ec
            X.QkG[] r7 = r1.A08
            r6 = 8
            r6 = r7[r6]
            if (r6 != 0) goto L_0x04ec
            r6 = 9
            r6 = r7[r6]
            if (r6 != 0) goto L_0x04ec
            java.util.Iterator r14 = r12.iterator()
            r23 = 0
            r11 = r23
            r9 = r11
        L_0x0423:
            boolean r6 = r14.hasNext()
            r10 = 0
            if (r6 == 0) goto L_0x047b
            java.lang.Object r12 = r14.next()
            X.QkG r12 = (X.C8207QkG) r12
            r6 = r21
            X.4en r6 = (X.C269234en) r6
            java.lang.reflect.Member r7 = r12.A0C()
            X.4ep r6 = r6.A00
            boolean r6 = r6.A00(r7)
            if (r6 == 0) goto L_0x0423
            int r10 = r12.A0F()
            X.QkR[] r8 = new X.C8218QkR[r10]
            r7 = 0
        L_0x0447:
            if (r7 >= r10) goto L_0x0476
            X.QkB r13 = r12.A0H(r7)
            if (r0 == 0) goto L_0x0423
            X.4f7 r25 = r0.A0D(r13)
            if (r25 == 0) goto L_0x0423
            boolean r6 = r25.A02()
            if (r6 != 0) goto L_0x0423
            boolean r6 = r25.A02()
            if (r6 != 0) goto L_0x0423
            int r6 = r13.A00
            r22 = r30
            r24 = r4
            r26 = r13
            r27 = r2
            r28 = r6
            X.QkR r6 = r22.A0A(r23, r24, r25, r26, r27, r28)
            r8[r7] = r6
            int r7 = r7 + 1
            goto L_0x0447
        L_0x0476:
            if (r11 != 0) goto L_0x04ec
            r11 = r12
            r9 = r8
            goto L_0x0423
        L_0x047b:
            if (r11 == 0) goto L_0x04ec
            r1.A02(r11, r9, r10)
            int r8 = r9.length
        L_0x0481:
            if (r10 >= r8) goto L_0x04ec
            r12 = r9[r10]
            X.4f7 r11 = r12.A06
            java.util.List r6 = r2.A03()
            java.util.Iterator r7 = r6.iterator()
        L_0x048f:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x04a4
            java.lang.Object r6 = r7.next()
            X.SK8 r6 = (X.SK8) r6
            boolean r6 = r6.A0V(r11)
            if (r6 == 0) goto L_0x048f
        L_0x04a1:
            int r10 = r10 + 1
            goto L_0x0481
        L_0x04a4:
            X.QkH r17 = r12.BRS()
            X.4ej r13 = X.SK8.A00
            X.QkL r7 = new X.QkL
            r12 = r7
            r14 = r0
            r15 = r23
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            X.4f7 r12 = r7.A0C()
            java.util.List r6 = r2.A03()
            java.util.Iterator r11 = r6.iterator()
        L_0x04c1:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x04d4
            java.lang.Object r6 = r11.next()
            X.SK8 r6 = (X.SK8) r6
            boolean r6 = r6.A0V(r12)
            if (r6 == 0) goto L_0x04c1
            goto L_0x04a1
        L_0x04d4:
            java.util.List r6 = r2.A03()
            r6.add(r7)
            goto L_0x04a1
        L_0x04dc:
            java.lang.String r1 = "Failed to find the canonical Record constructor of type "
            java.lang.String r0 = X.C269574fL.A04(r29)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04ec:
            if (r20 == 0) goto L_0x0591
            if (r19 > 0) goto L_0x0591
            if (r3 > 0) goto L_0x0591
            java.util.Iterator r12 = r20.iterator()
        L_0x04f6:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0591
            java.lang.Object r9 = r12.next()
            X.SHN r9 = (X.SHN) r9
            int r6 = r9.A00
            X.QkG r8 = r9.A01
            java.lang.Object r10 = r5.get(r8)
            X.SK8[] r10 = (X.SK8[]) r10
            r3 = 1
            if (r6 != r3) goto L_0x04f6
            r7 = 0
            X.Rub[] r3 = r9.A02
            r3 = r3[r7]
            X.SK8 r9 = r3.A02
            boolean r3 = A05(r0, r8, r9)
            if (r3 != 0) goto L_0x0535
            r3 = r21
            X.4en r3 = (X.C269234en) r3
            java.lang.reflect.Member r6 = r8.A0C()
            X.4ep r3 = r3.A00
            boolean r3 = r3.A00(r6)
            A04(r1, r8, r7, r3)
            if (r9 == 0) goto L_0x04f6
            X.QkM r9 = (X.C8213QkM) r9
            r3 = 0
            r9.A00 = r3
            goto L_0x04f6
        L_0x0535:
            X.QkR[] r6 = new X.C8218QkR[r6]
            r16 = 0
            X.QkB r11 = r8.A0H(r7)
            if (r10 != 0) goto L_0x0579
            r3 = r16
        L_0x0541:
            X.T9g r14 = r0.A02(r11)
            if (r3 == 0) goto L_0x0564
            X.4f7 r16 = r3.A0C()
            boolean r3 = r3.A0T()
            if (r3 == 0) goto L_0x0564
        L_0x0551:
            r13 = r30
            r15 = r4
            r17 = r11
            r18 = r2
            r19 = r7
            X.QkR r3 = r13.A0A(r14, r15, r16, r17, r18, r19)
            r6[r7] = r3
            r1.A02(r8, r6, r7)
            goto L_0x04f6
        L_0x0564:
            if (r14 != 0) goto L_0x0551
            X.SGT r3 = r0.A0L(r11)
            if (r3 == 0) goto L_0x04f6
        L_0x056c:
            int r0 = r11.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported"
            goto L_0x0586
        L_0x0579:
            r3 = r10[r7]
            goto L_0x0541
        L_0x057c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r9}
            java.lang.String r0 = "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
        L_0x0586:
            r4.A0a(r2, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x058e:
            r1.A02(r7, r9, r3)
        L_0x0591:
            X.QkG[] r3 = r1.A08
            r5 = 8
            r2 = r3[r5]
            X.QkR[] r0 = r1.A03
            X.4eF r9 = X.SP7.A00(r4, r1, r2, r0)
            r10 = 10
            r2 = r3[r10]
            X.QkR[] r0 = r1.A02
            X.4eF r8 = X.SP7.A00(r4, r1, r2, r0)
            X.4ed r0 = r1.A05
            X.4eF r0 = r0.A05
            X.Qim r2 = new X.Qim
            r2.<init>(r0)
            r0 = 0
            r7 = r3[r0]
            r6 = r3[r5]
            X.QkR[] r5 = r1.A03
            r0 = 9
            r4 = r3[r0]
            X.QkR[] r0 = r1.A04
            r2.A03 = r7
            r2.A04 = r6
            r2.A01 = r9
            r2.A0F = r5
            r2.A0C = r4
            r2.A0E = r0
            r4 = r3[r10]
            X.QkR[] r0 = r1.A02
            r2.A02 = r4
            r2.A00 = r8
            r2.A0D = r0
            r0 = 1
            r0 = r3[r0]
            r2.A0B = r0
            r0 = 2
            r0 = r3[r0]
            r2.A09 = r0
            r0 = 3
            r0 = r3[r0]
            r2.A0A = r0
            r0 = 4
            r0 = r3[r0]
            r2.A06 = r0
            r0 = 5
            r0 = r3[r0]
            r2.A08 = r0
            r0 = 6
            r0 = r3[r0]
            r2.A05 = r0
            r0 = 7
            r0 = r3[r0]
            r2.A07 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269554fJ.A0C(X.4fV, X.4ed):X.Qim");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (r10 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r5.A0O() == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if (r10 == null) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.C269674fV r15, X.Y1S r16, X.SHN r17, X.SP7 r18, X.C269134ed r19) {
        /*
            r14 = this;
            r4 = r17
            int r5 = r4.A00
            r2 = 1
            r13 = 0
            r7 = r14
            r9 = r15
            r3 = r18
            r12 = r19
            if (r2 == r5) goto L_0x0034
            r2 = 0
            r1 = -1
        L_0x0010:
            if (r2 >= r5) goto L_0x0020
            X.Rub[] r0 = r4.A02
            r0 = r0[r2]
            X.T9g r0 = r0.A00
            if (r0 != 0) goto L_0x001d
            if (r1 >= 0) goto L_0x00bb
            r1 = r2
        L_0x001d:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0020:
            if (r1 < 0) goto L_0x00bb
            X.Rub[] r0 = r4.A02
            r0 = r0[r1]
            X.SK8 r0 = r0.A02
            if (r0 == 0) goto L_0x0030
            X.4f7 r0 = r0.A0C()
            if (r0 != 0) goto L_0x00bb
        L_0x0030:
            r14.A0E(r15, r4, r3, r12)
            return
        L_0x0034:
            X.Rub[] r1 = r4.A02
            r6 = r1[r13]
            X.QkB r11 = r6.A01
            X.T9g r8 = r6.A00
            r0 = r16
            java.lang.Integer r0 = r0.A00
            int r5 = r0.intValue()
            if (r5 == r13) goto L_0x00aa
            if (r5 == r2) goto L_0x0081
            r0 = 3
            if (r5 == r0) goto L_0x009a
            X.SK8 r5 = r6.A02
            if (r5 == 0) goto L_0x007f
            boolean r0 = r5.A0T()
            if (r0 == 0) goto L_0x007f
            X.4f7 r10 = r5.A0C()
            if (r10 != 0) goto L_0x0071
        L_0x005b:
            if (r8 != 0) goto L_0x0071
            if (r5 == 0) goto L_0x00aa
            r0 = r1[r13]
            X.SK8 r0 = r0.A02
            if (r0 == 0) goto L_0x00aa
            X.4f7 r10 = r0.A0C()
            if (r10 == 0) goto L_0x00aa
            boolean r0 = r5.A0O()
            if (r0 == 0) goto L_0x00aa
        L_0x0071:
            X.QkR r0 = r7.A0A(r8, r9, r10, r11, r12, r13)
            X.QkR[] r1 = new X.C8218QkR[]{r0}
            X.QkG r0 = r4.A01
            r3.A02(r0, r1, r2)
            return
        L_0x007f:
            r10 = 0
            goto L_0x005b
        L_0x0081:
            X.SK8 r0 = r6.A02
            if (r0 == 0) goto L_0x0098
            X.4f7 r10 = r0.A0C()
            if (r10 != 0) goto L_0x0071
        L_0x008b:
            if (r8 != 0) goto L_0x0071
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r4}
            java.lang.String r0 = "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator"
            goto L_0x00a2
        L_0x0098:
            r10 = 0
            goto L_0x008b
        L_0x009a:
            X.QkG r0 = r4.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Single-argument constructor (%s) is annotated but no 'mode' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`"
        L_0x00a2:
            r15.A0a(r12, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00aa:
            X.QkG r0 = r4.A01
            A04(r3, r0, r2, r2)
            r0 = r1[r13]
            X.SK8 r1 = r0.A02
            if (r1 == 0) goto L_0x00be
            X.QkM r1 = (X.C8213QkM) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x00bb:
            r14.A0F(r15, r4, r3, r12)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269554fJ.A0D(X.4fV, X.Y1S, X.SHN, X.SP7, X.4ed):void");
    }

    public final void A0E(C269674fV r14, SHN shn, SP7 sp7, C269134ed r17) {
        C269134ed r11;
        Object[] objArr;
        String str;
        int i = shn.A00;
        C8218QkR[] qkRArr = new C8218QkR[i];
        int i2 = -1;
        int i3 = 0;
        while (true) {
            C269674fV r8 = r14;
            r11 = r17;
            if (i3 < i) {
                C10581Rub rub = shn.A02[i3];
                C8202QkB qkB = rub.A01;
                C12834T9g t9g = rub.A00;
                if (t9g == null) {
                    if (i2 >= 0) {
                        objArr = new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), shn};
                        str = "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed";
                        break;
                    }
                    i2 = i3;
                } else {
                    qkRArr[i3] = A0A(t9g, r8, (C269434f7) null, qkB, r11, i3);
                }
                i3++;
            } else if (i2 < 0) {
                objArr = new Object[]{shn};
                str = "No argument left as delegating for Creator %s: exactly one required";
            } else {
                C8207QkG qkG = shn.A01;
                SP7 sp72 = sp7;
                if (i == 1) {
                    A04(sp72, qkG, true, true);
                    SK8 sk8 = shn.A02[0].A02;
                    if (sk8 != null) {
                        ((C8213QkM) sk8).A00 = null;
                        return;
                    }
                    return;
                }
                sp72.A01(qkG, qkRArr, i2, true);
                return;
            }
        }
        r14.A0a(r11, str, objArr);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0F(C269674fV r11, SHN shn, SP7 sp7, C269134ed r14) {
        C269434f7 r6;
        Object[] objArr;
        String str;
        int i = shn.A00;
        C8218QkR[] qkRArr = new C8218QkR[i];
        for (int i2 = 0; i2 < i; i2++) {
            C10581Rub rub = shn.A02[i2];
            C12834T9g t9g = rub.A00;
            C8202QkB qkB = rub.A01;
            SK8 sk8 = rub.A02;
            C269674fV r5 = r11;
            C269134ed r8 = r14;
            if (sk8 == null || (r6 = sk8.A0C()) == null) {
                if (r11.A02.A01().A0L(qkB) != null) {
                    objArr = new Object[]{Integer.valueOf(qkB.A00)};
                    str = "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported";
                } else {
                    r6 = null;
                    if (t9g == null) {
                        objArr = new Object[]{Integer.valueOf(i2), shn};
                        str = "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator";
                    }
                }
                r11.A0a(r14, str, objArr);
                throw AnonymousClass00P.createAndThrow();
            }
            qkRArr[i2] = A0A(t9g, r5, r6, qkB, r8, i2);
        }
        sp7.A02(shn.A01, qkRArr, true);
    }

    public C269554fJ(C269594fN r1) {
        this.A00 = r1;
    }
}
