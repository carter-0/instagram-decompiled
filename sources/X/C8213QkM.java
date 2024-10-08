package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.QkM  reason: case insensitive filesystem */
public final class C8213QkM extends SK8 implements Comparable {
    public static final C10433RsA A0B = new C10433RsA(AnonymousClass05K.A00, "");
    public S7Z A00;
    public S7Z A01;
    public S7Z A02;
    public S7Z A03;
    public final C268854eA A04;
    public final C269434f7 A05;
    public final C269434f7 A06;
    public final C269144ee A07;
    public final boolean A08;
    public transient C10433RsA A09;
    public transient T9n A0A;

    public static S7Z A03(C12445Suc suc, S7Z s7z, C8213QkM qkM) {
        C8206QkF qkF;
        S7Z s7z2 = s7z;
        C8208QkH qkH = (C8208QkH) s7z.A02;
        if (qkH instanceof C8206QkF) {
            C8206QkF qkF2 = (C8206QkF) qkH;
            qkF = new C8206QkF(suc, qkF2.A01, qkF2.A01, qkF2.A00);
        } else {
            boolean z = qkH instanceof C8204QkD;
            qkF = qkH;
            if (!z) {
                if (qkH instanceof C8202QkB) {
                    C8202QkB qkB = (C8202QkB) qkH;
                    C12445Suc suc2 = qkB.A00;
                    qkF = qkB;
                    if (suc != suc2) {
                        C8207QkG qkG = qkB.A02;
                        int i = qkB.A00;
                        qkG.A00[i] = suc;
                        qkF = qkG.A0H(i);
                    }
                } else if (qkH instanceof C8203QkC) {
                    C8203QkC qkC = (C8203QkC) qkH;
                    qkF = new C8203QkC(suc, qkC.A01, qkC.A00);
                } else {
                    C8205QkE qkE = (C8205QkE) qkH;
                    qkF = new C8205QkE(suc, qkE.A01, qkE.A00, qkE.A00);
                }
            }
        }
        S7Z s7z3 = s7z.A01;
        if (s7z3 != null) {
            s7z2 = s7z.A05(A03(suc, s7z3, qkM));
        }
        if (qkF == s7z2.A02) {
            return s7z2;
        }
        return new S7Z(s7z2.A00, s7z2.A01, qkF, s7z2.A04, s7z2.A05, s7z2.A03);
    }

    public static void A05(S7Z s7z, C8213QkM qkM, Collection collection, Map map) {
        String A082;
        for (S7Z s7z2 = s7z; s7z2 != null; s7z2 = s7z2.A01) {
            C269434f7 r5 = s7z2.A00;
            if (s7z2.A04 && r5 != null) {
                C8213QkM qkM2 = (C8213QkM) map.get(r5);
                if (qkM2 == null) {
                    C269144ee r6 = qkM.A07;
                    qkM2 = new C8213QkM(qkM.A04, qkM.A05, r5, r6, qkM.A08);
                    map.put(r5, qkM2);
                }
                if (s7z == qkM.A01) {
                    qkM2.A01 = s7z2.A05(qkM2.A01);
                } else if (s7z == qkM.A02) {
                    qkM2.A02 = s7z2.A05(qkM2.A02);
                } else if (s7z == qkM.A03) {
                    qkM2.A03 = s7z2.A05(qkM2.A03);
                } else if (s7z == qkM.A00) {
                    qkM2.A00 = s7z2.A05(qkM2.A00);
                } else {
                    throw C66582MXn.A0k(qkM, "Internal error: mismatched accessors, property: ", AnonymousClass7TE.A1A());
                }
            } else if (s7z2.A05) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Conflicting/ambiguous property name definitions (implicit name ");
                C269434f7 r2 = qkM.A06;
                Iterator it = C269574fL.A00;
                if (r2 == null) {
                    A082 = "[null]";
                } else {
                    A082 = C269574fL.A08(r2.A02);
                }
                A1A.append(A082);
                A1A.append("): found multiple explicit names: ");
                A1A.append(collection);
                throw C66582MXn.A0k(s7z2, ", but also implicit accessor: ", A1A);
            }
        }
    }

    public static final int A00(C8206QkF qkF) {
        String name = qkF.A01.getName();
        if (name.startsWith("get") && name.length() > 3) {
            return 1;
        }
        if (!name.startsWith("is") || name.length() <= 2) {
            return 3;
        }
        return 2;
    }

    private C12445Suc A01(S7Z s7z) {
        C12445Suc suc = ((C8208QkH) s7z.A02).A00;
        S7Z s7z2 = s7z.A01;
        if (s7z2 != null) {
            return C12445Suc.A00(suc, A01(s7z2));
        }
        return suc;
    }

    public static C12445Suc A02(C8213QkM qkM, S7Z[] s7zArr, int i) {
        C12445Suc A012 = qkM.A01(s7zArr[i]);
        do {
            i++;
            if (i >= s7zArr.length) {
                return A012;
            }
        } while (s7zArr[i] == null);
        return C12445Suc.A00(A012, A02(qkM, s7zArr, i));
    }

    public static Set A04(S7Z s7z, Set set) {
        while (s7z != null) {
            if (s7z.A04 && s7z.A00 != null) {
                if (set == null) {
                    set = AnonymousClass7TE.A1F();
                }
                set.add(s7z.A00);
            }
            s7z = s7z.A01;
        }
        return set;
    }

    public static boolean A06(S7Z s7z) {
        while (s7z != null) {
            if (s7z.A00 != null && s7z.A04) {
                return true;
            }
            s7z = s7z.A01;
        }
        return false;
    }

    public static boolean A07(S7Z s7z) {
        while (s7z != null) {
            if (s7z.A00 != null && (!s7z.A00.A02.isEmpty())) {
                return true;
            }
            s7z = s7z.A01;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r1.length() <= 3) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r1.length() <= 3) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1.isAssignableFrom(r3) != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C8206QkF A0X(X.C8206QkF r6, X.C8206QkF r7) {
        /*
            r5 = this;
            java.lang.reflect.Method r4 = r6.A01
            java.lang.Class r3 = r4.getDeclaringClass()
            java.lang.reflect.Method r2 = r7.A01
            java.lang.Class r1 = r2.getDeclaringClass()
            if (r3 == r1) goto L_0x001b
            boolean r0 = r3.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1.isAssignableFrom(r3)
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            return r6
        L_0x001b:
            java.lang.String r1 = r2.getName()
            java.lang.String r2 = "set"
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L_0x0030
            int r1 = r1.length()
            r0 = 3
            r3 = 1
            if (r1 > r0) goto L_0x0031
        L_0x0030:
            r3 = 2
        L_0x0031:
            java.lang.String r1 = r4.getName()
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L_0x0043
            int r2 = r1.length()
            r1 = 3
            r0 = 1
            if (r2 > r1) goto L_0x0044
        L_0x0043:
            r0 = 2
        L_0x0044:
            if (r3 == r0) goto L_0x004a
            if (r3 >= r0) goto L_0x001a
            return r7
        L_0x0049:
            return r7
        L_0x004a:
            X.4eA r0 = r5.A04
            if (r0 != 0) goto L_0x0050
            r6 = 0
            return r6
        L_0x0050:
            X.QkF r6 = r0.A0G(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8213QkM.A0X(X.QkF, X.QkF):X.QkF");
    }

    public final void A0Y(C8213QkM qkM) {
        S7Z s7z = this.A01;
        S7Z s7z2 = qkM.A01;
        if (s7z != null) {
            if (s7z2 != null) {
                s7z = s7z.A04(s7z2);
            }
            s7z2 = s7z;
        }
        this.A01 = s7z2;
        S7Z s7z3 = this.A00;
        S7Z s7z4 = qkM.A00;
        if (s7z3 != null) {
            if (s7z4 != null) {
                s7z3 = s7z3.A04(s7z4);
            }
            s7z4 = s7z3;
        }
        this.A00 = s7z4;
        S7Z s7z5 = this.A02;
        S7Z s7z6 = qkM.A02;
        if (s7z5 != null) {
            if (s7z6 != null) {
                s7z5 = s7z5.A04(s7z6);
            }
            s7z6 = s7z5;
        }
        this.A02 = s7z6;
        S7Z s7z7 = this.A03;
        S7Z s7z8 = qkM.A03;
        if (s7z7 != null) {
            if (s7z8 != null) {
                s7z7 = s7z7.A04(s7z8);
            }
            s7z8 = s7z7;
        }
        this.A03 = s7z8;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C8213QkM qkM = (C8213QkM) obj;
        S7Z s7z = this.A00;
        S7Z s7z2 = qkM.A00;
        if (s7z != null) {
            if (s7z2 == null) {
                return -1;
            }
        } else if (s7z2 != null) {
            return 1;
        }
        return A0L().compareTo(qkM.A0L());
    }

    public C8213QkM(C269434f7 r2, C8213QkM qkM) {
        this.A07 = qkM.A07;
        this.A04 = qkM.A04;
        this.A05 = qkM.A05;
        this.A06 = r2;
        this.A01 = qkM.A01;
        this.A00 = qkM.A00;
        this.A02 = qkM.A02;
        this.A03 = qkM.A03;
        this.A08 = qkM.A08;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[Property '");
        A1A.append(this.A06);
        A1A.append("'; ctors: ");
        A1A.append(this.A00);
        A1A.append(", field(s): ");
        A1A.append(this.A01);
        A1A.append(", getter(s): ");
        A1A.append(this.A02);
        A1A.append(", setter(s): ");
        return Pxg.A0r(this.A03, A1A);
    }

    public C8213QkM(C268854eA r1, C269434f7 r2, C269434f7 r3, C269144ee r4, boolean z) {
        this.A07 = r4;
        this.A04 = r1;
        this.A05 = r2;
        this.A06 = r3;
        this.A08 = z;
    }
}
