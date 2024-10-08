package X;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.4eV  reason: invalid class name and case insensitive filesystem */
public final class C269054eV extends C269064eW implements C269074eX {
    public static final C269084eY A0D = new C269084eY((C8205QkE) null, Collections.emptyList(), Collections.emptyList());
    public C269084eY A00;
    public TAJ A01;
    public List A02;
    public final C268894eF A03;
    public final C269114eb A04;
    public final Class A05;
    public final C268854eA A06;
    public final C269124ec A07;
    public final C268924eI A08;
    public final AnonymousClass4eE A09;
    public final List A0A;
    public final boolean A0B;
    public transient Boolean A0C;

    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            C269584fM[] r0 = C269574fL.A01;
            if (!(obj != null && obj.getClass() == cls && ((C269054eV) obj).A05 == this.A05)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: X.4eX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v12, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: X.SuZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r19v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        if (r1 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C269084eY A00(X.C269054eV r26) {
        /*
            r3 = r26
            X.4eY r0 = r3.A00
            if (r0 != 0) goto L_0x0010
            X.4eF r0 = r3.A03
            r22 = r0
            if (r0 != 0) goto L_0x0011
            X.4eY r0 = A0D
        L_0x000e:
            r3.A00 = r0
        L_0x0010:
            return r0
        L_0x0011:
            X.4eA r1 = r3.A06
            X.4eE r0 = r3.A09
            r26 = r0
            boolean r0 = r3.A0B
            X.QkP r2 = new X.QkP
            r2.<init>(r1, r3, r0)
            r0 = r22
            java.lang.Class r0 = r0.A00
            r25 = r0
            X.4fM[] r0 = X.C269574fL.A01
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            r0 = r25
            boolean r0 = r1.isAssignableFrom(r0)
            r10 = 0
            r6 = 0
            if (r0 != 0) goto L_0x00a0
            boolean r0 = r25.isInterface()
            if (r0 != 0) goto L_0x005a
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0 = r25
            if (r0 == r1) goto L_0x005a
            boolean r0 = r25.isPrimitive()
            if (r0 != 0) goto L_0x005a
            java.lang.reflect.Constructor[] r7 = r25.getDeclaredConstructors()
            int r5 = r7.length
            X.4fM[] r8 = new X.C269584fM[r5]
            r4 = 0
        L_0x004c:
            if (r4 >= r5) goto L_0x005c
            r1 = r7[r4]
            X.4fM r0 = new X.4fM
            r0.<init>(r1)
            r8[r4] = r0
            int r4 = r4 + 1
            goto L_0x004c
        L_0x005a:
            X.4fM[] r8 = X.C269574fL.A01
        L_0x005c:
            int r7 = r8.length
            r1 = r6
            r11 = r6
            r5 = 0
        L_0x0060:
            if (r5 >= r7) goto L_0x008c
            r4 = r8[r5]
            java.lang.reflect.Constructor r0 = r4.A01
            boolean r0 = r0.isSynthetic()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007e
            int r0 = r4.A00
            if (r0 >= 0) goto L_0x007b
            java.lang.reflect.Constructor r0 = r4.A01
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r4.A00 = r0
        L_0x007b:
            if (r0 != 0) goto L_0x0081
            r1 = r4
        L_0x007e:
            int r5 = r5 + 1
            goto L_0x0060
        L_0x0081:
            if (r11 != 0) goto L_0x0088
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x0088:
            r11.add(r4)
            goto L_0x007e
        L_0x008c:
            if (r11 == 0) goto L_0x00a2
            int r9 = r11.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r9)
            r0 = 0
        L_0x0098:
            if (r0 >= r9) goto L_0x00aa
            r5.add(r6)
            int r0 = r0 + 1
            goto L_0x0098
        L_0x00a0:
            r1 = r6
            r11 = r6
        L_0x00a2:
            java.util.List r5 = java.util.Collections.emptyList()
            if (r1 == 0) goto L_0x00d5
            r9 = 0
            goto L_0x00ac
        L_0x00aa:
            if (r1 == 0) goto L_0x00bd
        L_0x00ac:
            X.4eX r8 = r2.A01
            java.lang.reflect.Constructor r7 = r1.A01
            X.Suc r4 = X.C8216QkP.A00(r2, r1)
            X.Suc[] r1 = X.SIL.A01
            X.QkE r0 = new X.QkE
            r0.<init>(r4, r8, r7, r1)
            r2.A00 = r0
        L_0x00bd:
            if (r10 >= r9) goto L_0x00d5
            java.lang.Object r0 = r5.get(r10)
            if (r0 != 0) goto L_0x00d2
            java.lang.Object r0 = r11.get(r10)
            X.4fM r0 = (X.C269584fM) r0
            X.QkE r0 = r2.A04(r0)
            r5.set(r10, r0)
        L_0x00d2:
            int r10 = r10 + 1
            goto L_0x00bd
        L_0x00d5:
            java.lang.reflect.Method[] r9 = X.C269574fL.A0M(r25)
            int r8 = r9.length
            r21 = 0
            r7 = 0
            r4 = 0
        L_0x00de:
            if (r4 >= r8) goto L_0x00ff
            r1 = r9[r4]
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r1.isSynthetic()
            if (r0 != 0) goto L_0x00fc
            if (r6 != 0) goto L_0x00f9
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x00f9:
            r6.add(r1)
        L_0x00fc:
            int r4 = r4 + 1
            goto L_0x00de
        L_0x00ff:
            if (r6 != 0) goto L_0x0133
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0105:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x027a
            X.QkE r1 = r2.A00
            if (r1 == 0) goto L_0x0119
            X.4eA r0 = r2.A00
            boolean r0 = r0.A0o(r1)
            if (r0 == 0) goto L_0x0119
            r0 = r21
            r2.A00 = r0
        L_0x0119:
            int r6 = r5.size()
        L_0x011d:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x0260
            X.4eA r1 = r2.A00
            java.lang.Object r0 = r5.get(r6)
            X.QkH r0 = (X.C8208QkH) r0
            boolean r0 = r1.A0o(r0)
            if (r0 == 0) goto L_0x011d
            r5.remove(r6)
            goto L_0x011d
        L_0x0133:
            X.4eX r0 = r2.A01
            r24 = r0
            int r20 = r6.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = r20
            r4.<init>(r0)
            r1 = 0
        L_0x0143:
            r0 = r20
            if (r1 >= r0) goto L_0x014f
            r0 = r21
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x0143
        L_0x014f:
            r0 = r20
            if (r7 >= r0) goto L_0x0105
            java.lang.Object r0 = r4.get(r7)
            if (r0 != 0) goto L_0x0249
            java.lang.Object r8 = r6.get(r7)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            r19 = r24
            java.lang.reflect.TypeVariable[] r18 = r8.getTypeParameters()
            r0 = r18
            int r11 = r0.length
            if (r11 == 0) goto L_0x0240
            X.4eI r0 = r22.A0G()
            X.4eF[] r0 = r0.A01
            int r0 = r0.length
            if (r0 == 0) goto L_0x0240
            java.lang.reflect.Type r9 = r8.getGenericReturnType()
            boolean r0 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0240
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            java.lang.reflect.Type r1 = r9.getRawType()
            r0 = r25
            boolean r0 = X.2Ob.A00(r0, r1)
            if (r0 == 0) goto L_0x0240
            java.lang.reflect.Type[] r17 = r9.getActualTypeArguments()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r11)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r11)
            r9 = 0
        L_0x0198:
            r0 = r17
            int r0 = r0.length
            if (r9 >= r0) goto L_0x01e7
            r0 = r17[r9]
            java.lang.reflect.TypeVariable r0 = X.SQ5.A01(r0)
            if (r0 == 0) goto L_0x025c
            java.lang.String r14 = r0.getName()
            if (r14 == 0) goto L_0x0240
            X.4eI r0 = r22.A0G()
            if (r9 < 0) goto L_0x0240
            X.4eF[] r1 = r0.A01
            int r0 = r1.length
            if (r9 >= r0) goto L_0x0240
            r1 = r1[r9]
            if (r1 == 0) goto L_0x0240
            r13 = 0
        L_0x01bb:
            r15 = r18[r13]
            java.lang.String r0 = r15.getName()
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x01e2
            java.lang.reflect.Type[] r16 = r15.getBounds()
            r0 = r16
            int r0 = r0.length
            r23 = r0
            r15 = 0
        L_0x01d1:
            r0 = r23
            if (r15 >= r0) goto L_0x021d
            r0 = r16[r15]
            r13 = r24
            boolean r0 = X.SQ5.A02(r1, r13, r0)
            if (r0 == 0) goto L_0x025c
            int r15 = r15 + 1
            goto L_0x01d1
        L_0x01e2:
            int r13 = r13 + 1
            if (r13 >= r11) goto L_0x0240
            goto L_0x01bb
        L_0x01e7:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0240
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x021a
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x021a
            java.lang.String[] r0 = X.C268924eI.A06
            java.lang.Object[] r9 = r12.toArray(r0)
            java.lang.String[] r9 = (java.lang.String[]) r9
            X.4eF[] r0 = X.C268924eI.A05
            java.lang.Object[] r1 = r10.toArray(r0)
            X.4eF[] r1 = (X.C268894eF[]) r1
            X.4eI r10 = new X.4eI
            r0 = r21
            r10.<init>(r1, r9, r0)
        L_0x0210:
            X.SuZ r19 = new X.SuZ
            r1 = r19
            r0 = r26
            r1.<init>(r10, r0)
            goto L_0x0240
        L_0x021a:
            X.4eI r10 = X.C268924eI.A04
            goto L_0x0210
        L_0x021d:
            int r13 = r12.indexOf(r14)
            r0 = -1
            if (r13 == r0) goto L_0x024d
            java.lang.Object r14 = r10.get(r13)
            X.4eF r14 = (X.C268894eF) r14
            boolean r0 = r1.equals(r14)
            if (r0 != 0) goto L_0x025c
            java.lang.Class r0 = r1.A00
            boolean r15 = r14.A0Q(r0)
            java.lang.Class r0 = r14.A00
            boolean r0 = r1.A0Q(r0)
            if (r15 != 0) goto L_0x0254
            if (r0 != 0) goto L_0x0254
        L_0x0240:
            r0 = r19
            X.QkF r0 = r2.A05(r0, r8)
            r4.set(r7, r0)
        L_0x0249:
            int r7 = r7 + 1
            goto L_0x014f
        L_0x024d:
            r12.add(r14)
            r10.add(r1)
            goto L_0x025c
        L_0x0254:
            r15 = r15 ^ r0
            if (r15 == 0) goto L_0x025c
            if (r0 == 0) goto L_0x025c
            r10.set(r13, r1)
        L_0x025c:
            int r9 = r9 + 1
            goto L_0x0198
        L_0x0260:
            int r6 = r4.size()
        L_0x0264:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x027a
            X.4eA r1 = r2.A00
            java.lang.Object r0 = r4.get(r6)
            X.QkH r0 = (X.C8208QkH) r0
            boolean r0 = r1.A0o(r0)
            if (r0 == 0) goto L_0x0264
            r4.remove(r6)
            goto L_0x0264
        L_0x027a:
            X.QkE r1 = r2.A00
            X.4eY r0 = new X.4eY
            r0.<init>(r1, r5, r4)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269054eV.A00(X.4eV):X.4eY");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.TAJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: X.TAJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.TAJ} */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.TAJ, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.TAJ A01(X.C269054eV r8) {
        /*
            X.TAJ r0 = r8.A01
            if (r0 != 0) goto L_0x0092
            X.4eF r7 = r8.A03
            if (r7 == 0) goto L_0x0083
            X.4eA r3 = r8.A06
            X.4ec r2 = r8.A07
            X.4eE r6 = r8.A09
            java.util.List r1 = r8.A0A
            boolean r0 = r8.A0B
            X.QkN r5 = new X.QkN
            r5.<init>(r3, r2, r0)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.Class r0 = r7.A00
            X.C8214QkN.A00(r5, r8, r0, r4)
            java.util.Iterator r3 = r1.iterator()
        L_0x0025:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r2 = r3.next()
            X.4eF r2 = (X.C268894eF) r2
            X.4eI r0 = r2.A0G()
            X.SuZ r1 = new X.SuZ
            r1.<init>(r0, r6)
            java.lang.Class r0 = r2.A00
            X.C8214QkN.A00(r5, r1, r0, r4)
            goto L_0x0025
        L_0x0040:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0083
            int r0 = r4.size()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r0)
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x0057:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r5 = r6.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getValue()
            X.RQd r0 = (X.C9129RQd) r0
            java.lang.reflect.Method r4 = r0.A02
            r3 = 0
            if (r4 == 0) goto L_0x0057
            X.4eX r2 = r0.A01
            X.4eZ r0 = r0.A00
            X.Suc r0 = r0.A01()
            X.QkF r1 = new X.QkF
            r1.<init>(r0, r2, r4, r3)
            java.lang.Object r0 = r5.getKey()
            r7.put(r0, r1)
            goto L_0x0057
        L_0x0083:
            X.TAJ r0 = new X.TAJ
            r0.<init>()
            goto L_0x0090
        L_0x0089:
            X.TAJ r0 = new X.TAJ
            r0.<init>()
            r0.A00 = r7
        L_0x0090:
            r8.A01 = r0
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269054eV.A01(X.4eV):X.TAJ");
    }

    public static final List A02(C269054eV r6) {
        ArrayList arrayList;
        Map A002;
        List list = r6.A02;
        List list2 = list;
        if (list == null) {
            C268894eF r5 = r6.A03;
            if (r5 == null || (A002 = C8215QkO.A00(r5, new C8215QkO(r6.A06, r6.A07, r6.A09, r6.A0B), r6)) == null) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList(A002.size());
                for (C10584Rue rue : A002.values()) {
                    arrayList2.add(new C8203QkC(rue.A00.A01(), rue.A01, rue.A02));
                }
                arrayList = arrayList2;
            }
            r6.A02 = arrayList;
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 == null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x002a
            java.lang.Class r1 = r2.A05
            X.4fM[] r0 = X.C269574fL.A01
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x0023
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L_0x0023
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L_0x0023
            java.lang.Class r0 = r1.getEnclosingClass()
            r1 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A0C = r0
        L_0x002a:
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269054eV.A09():boolean");
    }

    public final C268894eF EIi(Type type) {
        return this.A09.A07((C269754fd) null, this.A08, type);
    }

    public final int hashCode() {
        return this.A05.getName().hashCode();
    }

    public final String toString() {
        return 002.A0g("[AnnotedClass ", this.A05.getName(), "]");
    }

    public C269054eV(Class cls) {
        this.A03 = null;
        this.A05 = cls;
        this.A0A = Collections.emptyList();
        this.A04 = C269094eZ.A01;
        this.A08 = C268924eI.A04;
        this.A06 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0B = false;
    }

    public C269054eV(C268854eA r1, C268894eF r2, C269124ec r3, C268924eI r4, AnonymousClass4eE r5, C269114eb r6, Class cls, List list, boolean z) {
        this.A03 = r2;
        this.A05 = cls;
        this.A0A = list;
        this.A04 = r6;
        this.A08 = r4;
        this.A06 = r1;
        this.A07 = r3;
        this.A09 = r5;
        this.A0B = z;
    }
}
