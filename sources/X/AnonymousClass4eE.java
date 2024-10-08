package X;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.4eE  reason: invalid class name */
public final class AnonymousClass4eE implements Serializable {
    public static final C268934eJ A04 = new C268934eJ(Class.class);
    public static final C268934eJ A05 = new C268934eJ(Comparable.class);
    public static final C268934eJ A06 = new C268934eJ(Enum.class);
    public static final C268934eJ A07 = new C268934eJ(Object.class);
    public static final C268934eJ A08 = new C268934eJ(String.class);
    public static final C268924eI A09 = C268924eI.A04;
    public static final AnonymousClass4eE A0A = new AnonymousClass4eE((C268884eD) null);
    public static final C268894eF[] A0B = new C268894eF[0];
    public static final Class A0C;
    public static final Class A0D;
    public static final Class A0E;
    public static final C268934eJ A0F;
    public static final C268934eJ A0G;
    public static final C268934eJ A0H = new C268934eJ(C252503pD.class);
    public static final C268934eJ A0I;
    public final C268914eH A00;
    public final C268884eD A01;
    public final ClassLoader A02;
    public final AnonymousClass4i9[] A03;

    static {
        Class cls = Boolean.TYPE;
        A0C = cls;
        Class cls2 = Integer.TYPE;
        A0D = cls2;
        Class cls3 = Long.TYPE;
        A0E = cls3;
        A0F = new C268934eJ(cls);
        A0G = new C268934eJ(cls2);
        A0I = new C268934eJ(cls3);
    }

    public final Qlu A0B(C268894eF r8, C268894eF r9, Class cls) {
        C268924eI r1;
        int length;
        C268894eF[] r5 = {r8, r9};
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || (length = typeParameters.length) == 0) {
            r1 = C268924eI.A04;
        } else {
            String[] strArr = new String[length];
            int i = 0;
            do {
                strArr[i] = typeParameters[i].getName();
                i++;
            } while (i < length);
            if (length != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot create TypeBindings for class ");
                sb.append(cls.getName());
                sb.append(" with ");
                sb.append(2);
                sb.append(" type parameter");
                sb.append("s");
                sb.append(": class expects ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            r1 = new C268924eI(r5, strArr, (String[]) null);
        }
        Qlu qlu = (Qlu) A06((C269754fd) null, r1, cls);
        if (r1.A01.length == 0) {
            C268894eF A0B2 = qlu.A0B(Map.class);
            C268894eF A042 = A0B2.A04();
            if (A042.equals(r8)) {
                C268894eF A032 = A0B2.A03();
                if (!A032.equals(r9)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", new Object[]{C269574fL.A06(cls), r9, A032}));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", new Object[]{C269574fL.A06(cls), r8, A042}));
            }
        }
        return qlu;
    }

    public static final C268894eF A00(C268894eF r3, Class cls) {
        Class cls2 = r3.A00;
        if (cls2 == cls) {
            return r3;
        }
        C268894eF A0B2 = r3.A0B(cls);
        if (A0B2 != null) {
            return A0B2;
        }
        boolean isAssignableFrom = cls.isAssignableFrom(cls2);
        Object[] objArr = {cls.getName(), r3};
        if (!isAssignableFrom) {
            throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", objArr));
        }
        throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", objArr));
    }

    private boolean A02(C268894eF r9, C268894eF r10) {
        if (r10 instanceof Qlx) {
            ((Qlx) r10).A00 = r9;
        } else {
            if (r9.A00 == r10.A00) {
                List A032 = r9.A0G().A03();
                List A033 = r10.A0G().A03();
                int size = A032.size();
                int i = 0;
                while (i < size) {
                    if (A02((C268894eF) A032.get(i), (C268894eF) A033.get(i))) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C268894eF A04(C268894eF r6) {
        C268894eF r0;
        AnonymousClass4i9[] r02 = this.A03;
        if (r02 != null) {
            int length = r02.length;
            for (int i = 0; i < length; i++) {
                if (!r6.A02() && !r6.A0N()) {
                    Class<C257443xP> cls = r6.A00;
                    if (cls == C257513xW.class) {
                        C268894eF A072 = r6.A07(0);
                        if (A072 == null) {
                            A072 = A07;
                        }
                        C268894eF A073 = r6.A07(1);
                        if (A073 == null) {
                            A073 = A07;
                        }
                        if (r6 instanceof C268944eK) {
                            r0 = new Qly(A072, A073, (C268944eK) r6);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cannot upgrade from an instance of ");
                            sb.append(r6.getClass());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else if (cls != C257443xP.class) {
                        continue;
                    } else {
                        C268894eF A074 = r6.A07(0);
                        if (A074 == null) {
                            A074 = A07;
                        }
                        if (r6 instanceof C268944eK) {
                            r0 = new AnonymousClass4iM(A074, (C268944eK) r6);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cannot upgrade from an instance of ");
                            sb2.append(r6.getClass());
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                    r6 = r0;
                }
            }
        }
        return r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e3, code lost:
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f3, code lost:
        r5 = java.lang.String.format("Type parameter #%d/%d differs; can not specialize %s with %s", new java.lang.Object[]{java.lang.Integer.valueOf(r4 + 1), java.lang.Integer.valueOf(r5), ((X.C268944eK) r3).A0R(), ((X.C268944eK) r2).A0R()});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0113, code lost:
        if (r5 == null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0115, code lost:
        if (r20 != false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0130, code lost:
        throw new java.lang.IllegalArgumentException(X.002.A13("Failed to specialize base type ", ((X.C268944eK) r12).A0R(), " as ", r10.getName(), ", problem: ", r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C268894eF A05(X.C268894eF r18, java.lang.Class r19, boolean r20) {
        /*
            r17 = this;
            r12 = r18
            java.lang.Class r2 = r12.A00
            r10 = r19
            if (r2 == r10) goto L_0x0045
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            r11 = 0
            r13 = r17
            if (r2 == r14) goto L_0x0147
            boolean r0 = r2.isAssignableFrom(r10)
            if (r0 == 0) goto L_0x0163
            boolean r0 = r12.A0N()
            if (r0 == 0) goto L_0x006a
            boolean r0 = r12.A0O()
            if (r0 == 0) goto L_0x0046
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            if (r10 == r0) goto L_0x0031
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            if (r10 == r0) goto L_0x0031
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r10 == r0) goto L_0x0031
            java.lang.Class<java.util.TreeMap> r0 = java.util.TreeMap.class
            if (r10 != r0) goto L_0x006a
        L_0x0031:
            X.4eF r1 = r12.A04()
            X.4eF r0 = r12.A03()
            X.4eI r0 = X.C268924eI.A00(r1, r0, r10)
        L_0x003d:
            X.4eF r0 = r13.A06(r11, r0, r10)
            X.4eF r12 = r0.A09(r12)
        L_0x0045:
            return r12
        L_0x0046:
            boolean r0 = r12.A0M()
            if (r0 == 0) goto L_0x006a
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            if (r10 == r0) goto L_0x0061
            java.lang.Class<java.util.LinkedList> r0 = java.util.LinkedList.class
            if (r10 == r0) goto L_0x0061
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            if (r10 == r0) goto L_0x0061
            java.lang.Class<java.util.TreeSet> r0 = java.util.TreeSet.class
            if (r10 == r0) goto L_0x0061
            java.lang.Class<java.util.EnumSet> r0 = java.util.EnumSet.class
            if (r2 != r0) goto L_0x006a
            return r12
        L_0x0061:
            X.4eF r0 = r12.A03()
            X.4eI r0 = X.C268924eI.A01(r0, r10)
            goto L_0x003d
        L_0x006a:
            X.4eI r0 = r12.A0G()
            X.4eF[] r0 = r0.A01
            int r0 = r0.length
            if (r0 == 0) goto L_0x0147
            java.lang.reflect.TypeVariable[] r0 = r10.getTypeParameters()
            int r9 = r0.length
            if (r9 == 0) goto L_0x0147
            X.Qlx[] r8 = new X.Qlx[r9]
            r7 = 0
            r1 = 0
        L_0x007e:
            X.Qlx r0 = new X.Qlx
            r0.<init>(r1)
            r8[r1] = r0
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x007e
            X.4eI r0 = X.C268924eI.A02(r10, r8)
            X.4eF r0 = r13.A06(r11, r0, r10)
            X.4eF r1 = r0.A0B(r2)
            if (r1 == 0) goto L_0x014b
            X.4eI r0 = r12.A0G()
            java.util.List r16 = r0.A03()
            X.4eI r0 = r1.A0G()
            java.util.List r15 = r0.A03()
            int r6 = r15.size()
            int r5 = r16.size()
            r4 = 0
        L_0x00b0:
            if (r4 >= r5) goto L_0x0131
            r0 = r16
            java.lang.Object r3 = r0.get(r4)
            X.4eF r3 = (X.C268894eF) r3
            if (r4 >= r6) goto L_0x00f0
            java.lang.Object r2 = r15.get(r4)
            X.4eF r2 = (X.C268894eF) r2
        L_0x00c2:
            boolean r0 = r13.A02(r3, r2)
            if (r0 != 0) goto L_0x00d8
            java.lang.Class r0 = r3.A00
            if (r0 == r14) goto L_0x00d8
            if (r4 != 0) goto L_0x00db
            boolean r0 = r12.A0O()
            if (r0 == 0) goto L_0x00db
            java.lang.Class r0 = r2.A00
            if (r0 != r14) goto L_0x00db
        L_0x00d8:
            int r4 = r4 + 1
            goto L_0x00b0
        L_0x00db:
            java.lang.Class r0 = r3.A00
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L_0x00f3
            java.lang.Class r1 = r2.A00
            java.lang.Class r0 = r3.A00
            if (r0 == r1) goto L_0x00d8
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x00f3
            goto L_0x00d8
        L_0x00f0:
            X.4eJ r2 = A07
            goto L_0x00c2
        L_0x00f3:
            int r0 = r4 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            X.4eK r3 = (X.C268944eK) r3
            java.lang.String r1 = r3.A0R()
            X.4eK r2 = (X.C268944eK) r2
            java.lang.String r0 = r2.A0R()
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r4, r1, r0}
            java.lang.String r0 = "Type parameter #%d/%d differs; can not specialize %s with %s"
            java.lang.String r5 = java.lang.String.format(r0, r1)
            if (r5 == 0) goto L_0x0131
            if (r20 != 0) goto L_0x0131
            java.lang.String r0 = "Failed to specialize base type "
            X.4eK r12 = (X.C268944eK) r12
            java.lang.String r1 = r12.A0R()
            java.lang.String r2 = " as "
            java.lang.String r3 = r10.getName()
            java.lang.String r4 = ", problem: "
            java.lang.String r1 = X.002.A13(r0, r1, r2, r3, r4, r5)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0131:
            X.4eF[] r1 = new X.C268894eF[r9]
        L_0x0133:
            r0 = r8[r7]
            X.4eF r0 = r0.A00
            if (r0 != 0) goto L_0x013b
            X.4eJ r0 = A07
        L_0x013b:
            r1[r7] = r0
            int r7 = r7 + 1
            if (r7 < r9) goto L_0x0133
            X.4eI r0 = X.C268924eI.A02(r10, r1)
            goto L_0x003d
        L_0x0147:
            X.4eI r0 = A09
            goto L_0x003d
        L_0x014b:
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = r10.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Internal error: unable to locate supertype (%s) from resolved subtype %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0163:
            java.lang.String r1 = X.C269574fL.A06(r10)
            java.lang.String r0 = X.C269574fL.A04(r12)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Class %s not subtype of %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4eE.A05(X.4eF, java.lang.Class, boolean):X.4eF");
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [X.4eF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v8, types: [X.4eK] */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r15v4, types: [X.Qlw] */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r11v9, types: [X.4iN] */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
        if (r9 == null) goto L_0x00da;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0241 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C268894eF A06(X.C269754fd r25, X.C268924eI r26, java.lang.Class r27) {
        /*
            r24 = this;
            r14 = r27
            r4 = r25
            X.4eJ r0 = A01(r14)
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            r13 = r26
            if (r26 == 0) goto L_0x01f1
            X.4eF[] r1 = r13.A01
            int r0 = r1.length
            if (r0 == 0) goto L_0x01f1
            int r0 = r13.A00
            X.S69 r2 = new X.S69
            r2.<init>(r14, r1, r0)
        L_0x001b:
            r7 = r24
            X.4eD r3 = r7.A01
            r0 = r3
            X.4eC r0 = (X.C268874eC) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r11 = r0.get(r2)
            X.4eF r11 = (X.C268894eF) r11
            if (r11 != 0) goto L_0x0241
            if (r25 != 0) goto L_0x01ba
            r0 = 0
            X.4fd r1 = new X.4fd
            r1.<init>(r0, r14)
        L_0x0034:
            boolean r0 = r14.isArray()
            if (r0 == 0) goto L_0x0070
            java.lang.Class r0 = r14.getComponentType()
            X.4eF r5 = r7.A07(r1, r13, r0)
            r15 = 0
            java.lang.Class r4 = r5.A00
            r0 = 0
            java.lang.Object r14 = java.lang.reflect.Array.newInstance(r4, r0)
            X.4iN r9 = new X.4iN
            r11 = r9
            r12 = r5
            r16 = r15
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x0055:
            java.util.ArrayList r0 = r1.A00
            if (r0 == 0) goto L_0x0213
            java.util.Iterator r1 = r0.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0213
            java.lang.Object r0 = r1.next()
            X.Qlv r0 = (X.Qlv) r0
            X.4eF r4 = r0.A00
            if (r4 != 0) goto L_0x01f4
            r0.A00 = r9
            goto L_0x005d
        L_0x0070:
            boolean r0 = r14.isInterface()
            if (r0 == 0) goto L_0x0095
            r10 = 0
            X.4fM[] r0 = X.C269574fL.A01
            java.lang.reflect.Type[] r8 = r14.getGenericInterfaces()
            if (r8 == 0) goto L_0x0092
            int r6 = r8.length
            if (r6 == 0) goto L_0x0092
            X.4eF[] r0 = new X.C268894eF[r6]
            r5 = 0
        L_0x0085:
            r4 = r8[r5]
            X.4eF r4 = r7.A07(r1, r13, r4)
            r0[r5] = r4
            int r5 = r5 + 1
            if (r5 >= r6) goto L_0x00be
            goto L_0x0085
        L_0x0092:
            X.4eF[] r0 = A0B
            goto L_0x00be
        L_0x0095:
            X.4fM[] r0 = X.C269574fL.A01
            java.lang.reflect.Type r0 = r14.getGenericSuperclass()
            if (r0 != 0) goto L_0x00b7
            r10 = 0
        L_0x009e:
            java.lang.reflect.Type[] r8 = r14.getGenericInterfaces()
            if (r8 == 0) goto L_0x00bc
            int r6 = r8.length
            if (r6 == 0) goto L_0x00bc
            X.4eF[] r0 = new X.C268894eF[r6]
            r5 = 0
        L_0x00aa:
            r4 = r8[r5]
            X.4eF r4 = r7.A07(r1, r13, r4)
            r0[r5] = r4
            int r5 = r5 + 1
            if (r5 >= r6) goto L_0x00be
            goto L_0x00aa
        L_0x00b7:
            X.4eF r10 = r7.A07(r1, r13, r0)
            goto L_0x009e
        L_0x00bc:
            X.4eF[] r0 = A0B
        L_0x00be:
            java.lang.Class<java.util.Properties> r4 = java.util.Properties.class
            if (r14 != r4) goto L_0x00d2
            X.4eJ r11 = A08
            r15 = 0
            r18 = 0
            X.Qlu r9 = new X.Qlu
            r12 = r11
            r16 = r15
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0055
        L_0x00d2:
            if (r10 == 0) goto L_0x00da
            X.4eF r9 = r10.A0A(r10, r13, r14, r0)
            if (r9 != 0) goto L_0x0055
        L_0x00da:
            r5 = r13
            if (r26 != 0) goto L_0x00df
            X.4eI r5 = A09
        L_0x00df:
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            if (r14 != r4) goto L_0x0132
            java.util.List r9 = r5.A03()
            int r8 = r9.size()
            if (r8 == 0) goto L_0x011e
            r7 = 0
            r6 = 2
            r4 = 1
            if (r8 == r6) goto L_0x0111
            java.lang.String r2 = X.C269574fL.A06(r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            if (r8 != r4) goto L_0x010e
            java.lang.String r0 = ""
        L_0x00fe:
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0, r5}
            java.lang.String r0 = "Strange Map type %s with %d type parameter%s (%s), can not resolve"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x010e:
            java.lang.String r0 = "s"
            goto L_0x00fe
        L_0x0111:
            java.lang.Object r6 = r9.get(r7)
            X.4eF r6 = (X.C268894eF) r6
            java.lang.Object r4 = r9.get(r4)
            X.4eF r4 = (X.C268894eF) r4
            goto L_0x0121
        L_0x011e:
            X.4eJ r6 = A07
            r4 = r6
        L_0x0121:
            r15 = 0
            r18 = 0
            X.Qlu r9 = new X.Qlu
            r11 = r6
            r12 = r4
            r13 = r5
            r16 = r15
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0055
        L_0x0132:
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            if (r14 != r4) goto L_0x0169
            java.util.List r7 = r5.A03()
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x015a
            X.4eJ r4 = A07
        L_0x0142:
            r20 = 0
            r23 = 0
            X.Qlt r9 = new X.Qlt
            r15 = r9
            r16 = r10
            r17 = r4
            r18 = r5
            r19 = r14
            r21 = r20
            r22 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0055
        L_0x015a:
            int r6 = r7.size()
            r4 = 1
            if (r6 != r4) goto L_0x021d
            r4 = 0
            java.lang.Object r4 = r7.get(r4)
            X.4eF r4 = (X.C268894eF) r4
            goto L_0x0142
        L_0x0169:
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r4 = java.util.concurrent.atomic.AtomicReference.class
            if (r14 != r4) goto L_0x0199
            java.util.List r7 = r5.A03()
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x018a
            X.4eJ r4 = A07
        L_0x0179:
            r12 = 0
            r18 = 0
            X.4iM r9 = new X.4iM
            r11 = r4
            r13 = r5
            r15 = r12
            r16 = r12
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0055
        L_0x018a:
            int r6 = r7.size()
            r4 = 1
            if (r6 != r4) goto L_0x022f
            r4 = 0
            java.lang.Object r4 = r7.get(r4)
            X.4eF r4 = (X.C268894eF) r4
            goto L_0x0179
        L_0x0199:
            int r6 = r0.length
            r5 = 0
        L_0x019b:
            if (r5 >= r6) goto L_0x01a8
            r4 = r0[r5]
            X.4eF r9 = r4.A0A(r10, r13, r14, r0)
            if (r9 != 0) goto L_0x0055
            int r5 = r5 + 1
            goto L_0x019b
        L_0x01a8:
            r15 = 0
            r18 = 0
            X.4eJ r9 = new X.4eJ
            r11 = r9
            r12 = r10
            r16 = r15
            r17 = r0
            r19 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0055
        L_0x01ba:
            java.lang.Class r0 = r4.A02
            if (r0 == r14) goto L_0x01c7
            X.4fd r1 = r4.A01
        L_0x01c0:
            if (r1 == 0) goto L_0x01ea
            java.lang.Class r0 = r1.A02
            if (r0 != r14) goto L_0x01e7
            r4 = r1
        L_0x01c7:
            X.4eI r13 = A09
            r12 = 0
            r18 = 0
            X.Qlv r11 = new X.Qlv
            r15 = r12
            r16 = r12
            r17 = r12
            r19 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.ArrayList r0 = r4.A00
            if (r0 != 0) goto L_0x01e3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A00 = r0
        L_0x01e3:
            r0.add(r11)
            return r11
        L_0x01e7:
            X.4fd r1 = r1.A01
            goto L_0x01c0
        L_0x01ea:
            X.4fd r1 = new X.4fd
            r1.<init>(r4, r14)
            goto L_0x0034
        L_0x01f1:
            r2 = r14
            goto L_0x001b
        L_0x01f4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Trying to re-set self reference; old value = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", new = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0213:
            boolean r0 = r9.A0K()
            if (r0 != 0) goto L_0x021c
            r3.putIfAbsent(r2, r9)
        L_0x021c:
            return r9
        L_0x021d:
            java.lang.String r2 = "Strange Collection type "
            java.lang.String r1 = r14.getName()
            java.lang.String r0 = ": cannot determine type parameters"
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x022f:
            java.lang.String r2 = "Strange Reference type "
            java.lang.String r1 = r14.getName()
            java.lang.String r0 = ": cannot determine type parameters"
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0241:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4eE.A06(X.4fd, X.4eI, java.lang.Class):X.4eF");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final X.C268894eF A07(X.C269754fd r13, X.C268924eI r14, java.lang.reflect.Type r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0011
            java.lang.Class r15 = (java.lang.Class) r15
            X.4eI r0 = A09
            X.4eF r5 = r12.A06(r13, r0, r15)
        L_0x000c:
            X.4eF r15 = r12.A04(r5)
            return r15
        L_0x0011:
            boolean r0 = r15 instanceof java.lang.reflect.ParameterizedType
            r7 = r14
            if (r0 == 0) goto L_0x0057
            java.lang.reflect.ParameterizedType r15 = (java.lang.reflect.ParameterizedType) r15
            java.lang.reflect.Type r5 = r15.getRawType()
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            if (r5 != r0) goto L_0x0025
            X.4eJ r5 = A06
            goto L_0x000c
        L_0x0025:
            java.lang.Class<java.lang.Comparable> r0 = java.lang.Comparable.class
            if (r5 != r0) goto L_0x002c
            X.4eJ r5 = A05
            goto L_0x000c
        L_0x002c:
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            if (r5 != r0) goto L_0x0033
            X.4eJ r5 = A04
            goto L_0x000c
        L_0x0033:
            java.lang.reflect.Type[] r4 = r15.getActualTypeArguments()
            r3 = 0
            if (r4 == 0) goto L_0x0054
            int r2 = r4.length
            if (r2 == 0) goto L_0x0054
            X.4eF[] r1 = new X.C268894eF[r2]
        L_0x003f:
            r0 = r4[r3]
            X.4eF r0 = r12.A07(r13, r14, r0)
            r1[r3] = r0
            int r3 = r3 + 1
            if (r3 < r2) goto L_0x003f
            X.4eI r0 = X.C268924eI.A02(r5, r1)
        L_0x004f:
            X.4eF r5 = r12.A06(r13, r0, r5)
            goto L_0x000c
        L_0x0054:
            X.4eI r0 = A09
            goto L_0x004f
        L_0x0057:
            boolean r0 = r15 instanceof X.C268894eF
            if (r0 == 0) goto L_0x005e
            X.4eF r15 = (X.C268894eF) r15
            return r15
        L_0x005e:
            boolean r0 = r15 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x007b
            java.lang.reflect.GenericArrayType r15 = (java.lang.reflect.GenericArrayType) r15
            java.lang.reflect.Type r0 = r15.getGenericComponentType()
            X.4eF r6 = r12.A07(r13, r14, r0)
            r9 = 0
            java.lang.Class r0 = r6.A00
            r11 = 0
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r0, r11)
            X.4iN r5 = new X.4iN
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x000c
        L_0x007b:
            boolean r0 = r15 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x00e9
            java.lang.reflect.TypeVariable r15 = (java.lang.reflect.TypeVariable) r15
            java.lang.String r4 = r15.getName()
            if (r14 == 0) goto L_0x00ff
            java.lang.String[] r3 = r14.A02
            int r2 = r3.length
            r1 = 0
        L_0x008b:
            if (r1 >= r2) goto L_0x00ac
            r0 = r3[r1]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a9
            X.4eF[] r0 = r14.A01
            r5 = r0[r1]
            boolean r0 = r5 instanceof X.Qlv
            if (r0 == 0) goto L_0x00a5
            r0 = r5
            X.Qlv r0 = (X.Qlv) r0
            X.4eF r0 = r0.A00
            if (r0 == 0) goto L_0x00a5
            r5 = r0
        L_0x00a5:
            if (r5 == 0) goto L_0x00ac
            goto L_0x000c
        L_0x00a9:
            int r1 = r1 + 1
            goto L_0x008b
        L_0x00ac:
            java.lang.String[] r5 = r14.A03
            if (r5 == 0) goto L_0x00c2
            int r2 = r5.length
            r1 = r2
        L_0x00b2:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x00c7
            r0 = r5[r2]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b2
            X.4eJ r5 = A07
            goto L_0x000c
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            goto L_0x00d1
        L_0x00c7:
            if (r1 == 0) goto L_0x00c3
            int r0 = r1 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x00d1:
            r0[r1] = r4
            X.4eF[] r1 = r14.A01
            X.4eI r2 = new X.4eI
            r2.<init>(r1, r3, r0)
            monitor-enter(r15)
            java.lang.reflect.Type[] r1 = r15.getBounds()     // Catch:{ all -> 0x00fc }
            monitor-exit(r15)     // Catch:{ all -> 0x00fc }
            r0 = 0
            r0 = r1[r0]
            X.4eF r5 = r12.A07(r13, r2, r0)
            goto L_0x000c
        L_0x00e9:
            boolean r0 = r15 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x010d
            java.lang.reflect.WildcardType r15 = (java.lang.reflect.WildcardType) r15
            java.lang.reflect.Type[] r1 = r15.getUpperBounds()
            r0 = 0
            r0 = r1[r0]
            X.4eF r5 = r12.A07(r13, r14, r0)
            goto L_0x000c
        L_0x00fc:
            r1 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00fc }
            throw r1
        L_0x00ff:
            java.lang.String r1 = "Null `bindings` passed (type variable \""
            java.lang.String r0 = "\")"
            java.lang.String r0 = X.002.A0g(r1, r4, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x010d:
            java.lang.String r1 = "Unrecognized Type: "
            if (r15 != 0) goto L_0x011d
            java.lang.String r0 = "[null]"
        L_0x0113:
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x011d:
            java.lang.String r0 = r15.toString()
            goto L_0x0113
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4eE.A07(X.4fd, X.4eI, java.lang.reflect.Type):X.4eF");
    }

    public final C268894eF A08(String str) {
        C268914eH r1 = this.A00;
        C51639FxX fxX = new C51639FxX(str.trim());
        C268894eF A012 = r1.A01(fxX);
        if (!fxX.hasMoreTokens()) {
            return A012;
        }
        throw C268914eH.A00(fxX, "Unexpected tokens after complete type");
    }

    public final C268894eF A09(Type type) {
        return A07((C269754fd) null, A09, type);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.4eK, X.4eJ] */
    @Deprecated
    public final C268934eJ A0C(Class cls) {
        C268934eJ A012;
        C268924eI r2 = A09;
        Class cls2 = cls;
        if (r2.A01.length != 0 || (A012 = A01(cls)) == null) {
            return new C268944eK((C268894eF) null, r2, cls2, (Object) null, (Object) null, (C268894eF[]) null, 0, false);
        }
        return A012;
    }

    public final Class A0D(String str) {
        Class cls;
        if (str.indexOf(46) < 0) {
            if ("int".equals(str)) {
                cls = Integer.TYPE;
            } else if ("long".equals(str)) {
                cls = Long.TYPE;
            } else if ("float".equals(str)) {
                cls = Float.TYPE;
            } else if ("double".equals(str)) {
                cls = Double.TYPE;
            } else if ("boolean".equals(str)) {
                cls = Boolean.TYPE;
            } else if ("byte".equals(str)) {
                cls = Byte.TYPE;
            } else if ("char".equals(str)) {
                cls = Character.TYPE;
            } else if ("short".equals(str)) {
                cls = Short.TYPE;
            } else if ("void".equals(str)) {
                cls = Void.TYPE;
            } else {
                cls = null;
            }
            if (cls != null) {
                return cls;
            }
        }
        e = null;
        ClassLoader classLoader = this.A02;
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return Class.forName(str, true, classLoader);
            } catch (Exception e) {
                e = e;
                C269584fM[] r0 = C269574fL.A01;
                while (e.getCause() != null) {
                    e = e.getCause();
                }
            }
        }
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            e = e2;
            if (e == null) {
                C269584fM[] r02 = C269574fL.A01;
                while (e.getCause() != null) {
                    e = e.getCause();
                }
                e = e;
            }
            C269574fL.A0F(e);
            throw new ClassNotFoundException(e.getMessage(), e);
        }
    }

    public AnonymousClass4eE(C268914eH r3, C268884eD r4, ClassLoader classLoader, AnonymousClass4i9[] r6) {
        this.A01 = r4 == null ? new C268874eC(16, 200) : r4;
        this.A00 = this != r3.A00 ? new C268914eH(this) : r3;
        this.A03 = r6;
        this.A02 = classLoader;
    }

    public static final C268934eJ A01(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == A0C) {
                return A0F;
            }
            if (cls == A0D) {
                return A0G;
            }
            if (cls == A0E) {
                return A0I;
            }
            return null;
        } else if (cls == String.class) {
            return A08;
        } else {
            if (cls == Object.class) {
                return A07;
            }
            if (cls == C252503pD.class) {
                return A0H;
            }
            return null;
        }
    }

    public static final C268894eF[] A03(C268894eF r0, Class cls) {
        C268894eF A0B2 = r0.A0B(cls);
        if (A0B2 == null) {
            return A0B;
        }
        return A0B2.A0G().A01;
    }

    public final Qlt A0A(C268894eF r5, Class cls) {
        C268924eI r3;
        int length;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || (length = typeParameters.length) == 0) {
            r3 = C268924eI.A04;
        } else if (length == 1) {
            r3 = new C268924eI(new C268894eF[]{r5}, new String[]{typeParameters[0].getName()}, (String[]) null);
        } else {
            throw new IllegalArgumentException(002.A07(length, "Cannot create TypeBindings for class ", cls.getName(), " with 1 type parameter: class expects "));
        }
        Qlt qlt = (Qlt) A06((C269754fd) null, r3, cls);
        if (r3.A01.length == 0 && r5 != null) {
            C268894eF A032 = qlt.A0B(Collection.class).A03();
            if (!A032.equals(r5)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", new Object[]{C269574fL.A06(cls), r5, A032}));
            }
        }
        return qlt;
    }

    public AnonymousClass4eE(C268884eD r4) {
        this.A01 = new C268874eC(16, 200);
        this.A00 = new C268914eH(this);
        this.A03 = null;
        this.A02 = null;
    }

    public AnonymousClass4eE() {
        this((C268884eD) null);
    }
}
