package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public abstract class SK8 {
    public static final C269194ej A00 = C269194ej.A04;

    public final C269194ej A08() {
        if (this instanceof C8212QkL) {
            return ((C8212QkL) this).A00;
        }
        C8213QkM qkM = (C8213QkM) this;
        C269064eW A0G = qkM.A0G();
        if (A0G == null) {
            A0G = qkM.A0E();
        }
        C268854eA r0 = qkM.A04;
        if (r0 == null) {
            return C269194ej.A04;
        }
        return r0.A06(A0G);
    }

    public final C10433RsA A09() {
        C10433RsA rsA;
        S7Z s7z;
        S7Z s7z2;
        if (this instanceof C8213QkM) {
            C8213QkM qkM = (C8213QkM) this;
            C10433RsA rsA2 = qkM.A09;
            if (rsA2 == null) {
                C268854eA r2 = qkM.A04;
                C10433RsA rsA3 = null;
                if (r2 != null) {
                    if (qkM.A08) {
                        s7z = qkM.A02;
                    } else {
                        S7Z s7z3 = qkM.A00;
                        if (s7z3 == null || (rsA3 = r2.A0A((C8208QkH) s7z3.A02)) == null) {
                            s7z = qkM.A03;
                        }
                    }
                    if ((s7z == null || (rsA3 = r2.A0A((C8208QkH) s7z.A02)) == null) && (s7z2 = qkM.A01) != null) {
                        rsA3 = r2.A0A((C8208QkH) s7z2.A02);
                    }
                }
                if (rsA3 == null) {
                    rsA = C8213QkM.A0B;
                } else {
                    rsA = rsA3;
                }
                qkM.A09 = rsA;
                return rsA3;
            } else if (rsA2 == C8213QkM.A0B) {
                return null;
            } else {
                return rsA2;
            }
        }
        return null;
    }

    public final C268894eF A0A() {
        C269064eW r0;
        if (this instanceof C8212QkL) {
            r0 = ((C8212QkL) this).A03;
        } else {
            C8213QkM qkM = (C8213QkM) this;
            if (qkM.A08) {
                r0 = qkM.A0G();
                if (r0 == null) {
                    r0 = qkM.A0E();
                }
                return r0.A03();
            }
            r0 = qkM.A0I();
            if (r0 == null) {
                C8206QkF A0H = qkM.A0H();
                if (A0H != null) {
                    return A0H.A0G(0);
                }
                r0 = qkM.A0E();
                if (r0 == null) {
                    r0 = qkM.A0G();
                }
            }
            return r0.A03();
        }
        if (r0 == null) {
            return AnonymousClass4eE.A07;
        }
        return r0.A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ce, code lost:
        if (r9 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r1 != null) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.T9n A0B() {
        /*
            r15 = this;
            boolean r0 = r15 instanceof X.C8213QkM
            if (r0 == 0) goto L_0x00ff
            r0 = r15
            X.QkM r0 = (X.C8213QkM) r0
            X.T9n r7 = r0.A0A
            if (r7 != 0) goto L_0x00e1
            boolean r6 = r0.A08
            if (r6 == 0) goto L_0x00ef
            X.S7Z r1 = r0.A02
            if (r1 != 0) goto L_0x0017
            X.S7Z r1 = r0.A01
        L_0x0015:
            if (r1 == 0) goto L_0x00ec
        L_0x0017:
            java.lang.Object r4 = r1.A02
            X.QkH r4 = (X.C8208QkH) r4
            if (r4 == 0) goto L_0x00ec
            X.4eA r5 = r0.A04
            java.lang.Boolean r3 = r5.A0S(r4)
            java.lang.String r13 = r5.A0i(r4)
            java.lang.Integer r2 = r5.A0V(r4)
            java.lang.String r1 = r5.A0h(r4)
            if (r3 != 0) goto L_0x00e6
            if (r2 != 0) goto L_0x00e6
            if (r1 != 0) goto L_0x00e6
            X.T9n r7 = X.T9n.A09
            if (r13 == 0) goto L_0x004a
            java.lang.Boolean r11 = r7.A02
            java.lang.Integer r12 = r7.A03
            java.lang.String r14 = r7.A04
            X.RsB r10 = r7.A06
            X.4em r8 = r7.A01
            X.4em r9 = r7.A00
            X.T9n r7 = new X.T9n
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
        L_0x004a:
            r0.A0A = r7
            if (r6 != 0) goto L_0x00e1
            X.QkF r3 = r0.A0G()
            if (r3 != 0) goto L_0x0058
            X.QkC r3 = r0.A0E()
        L_0x0058:
            r6 = 1
            if (r3 == 0) goto L_0x0072
            java.lang.Boolean r1 = r5.A0M(r4)
            if (r1 == 0) goto L_0x0072
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0071
            r2 = 0
            X.RsB r1 = new X.RsB
            r1.<init>(r3, r2)
            X.T9n r7 = r7.A01(r1)
        L_0x0071:
            r6 = 0
        L_0x0072:
            X.4el r1 = r5.A09(r4)
            X.4em r8 = r1.A01
            X.4em r5 = X.C269224em.DEFAULT
            if (r8 != r5) goto L_0x007d
            r8 = 0
        L_0x007d:
            X.4em r9 = r1.A00
            if (r9 != r5) goto L_0x0082
            r9 = 0
        L_0x0082:
            if (r6 != 0) goto L_0x0088
            if (r8 == 0) goto L_0x0088
            if (r9 != 0) goto L_0x00d0
        L_0x0088:
            boolean r1 = r4 instanceof X.C8206QkF
            if (r1 == 0) goto L_0x00e2
            r2 = r4
            X.QkG r2 = (X.C8207QkG) r2
            int r1 = r2.A0F()
            if (r1 <= 0) goto L_0x00e2
            r1 = 0
            r2.A0G(r1)
        L_0x0099:
            X.4ee r1 = r0.A07
            if (r6 != 0) goto L_0x00a1
            if (r8 == 0) goto L_0x00a1
            if (r9 != 0) goto L_0x00d0
        L_0x00a1:
            X.4eu r1 = (X.C269304eu) r1
            X.4ei r1 = r1.A01
            X.4el r1 = r1.A01
            if (r8 != 0) goto L_0x00ae
            X.4em r8 = r1.A01
            if (r8 != r5) goto L_0x00ae
            r8 = 0
        L_0x00ae:
            if (r9 != 0) goto L_0x00b5
            X.4em r9 = r1.A00
            if (r9 != r5) goto L_0x00b5
            r9 = 0
        L_0x00b5:
            if (r6 == 0) goto L_0x00cc
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00cc
            if (r3 == 0) goto L_0x00cc
            r2 = 1
            X.RsB r1 = new X.RsB
            r1.<init>(r3, r2)
            X.T9n r7 = r7.A01(r1)
        L_0x00cc:
            if (r8 != 0) goto L_0x00d0
            if (r9 == 0) goto L_0x00df
        L_0x00d0:
            java.lang.Boolean r11 = r7.A02
            java.lang.String r13 = r7.A05
            java.lang.Integer r12 = r7.A03
            java.lang.String r14 = r7.A04
            X.RsB r10 = r7.A06
            X.T9n r7 = new X.T9n
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
        L_0x00df:
            r0.A0A = r7
        L_0x00e1:
            return r7
        L_0x00e2:
            r4.A03()
            goto L_0x0099
        L_0x00e6:
            X.T9n r7 = X.T9n.A00(r3, r2, r13, r1)
            goto L_0x004a
        L_0x00ec:
            X.T9n r7 = X.T9n.A09
            goto L_0x00df
        L_0x00ef:
            X.S7Z r1 = r0.A00
            if (r1 != 0) goto L_0x0017
            X.S7Z r1 = r0.A03
            if (r1 != 0) goto L_0x0017
            X.S7Z r1 = r0.A01
            if (r1 != 0) goto L_0x0017
            X.S7Z r1 = r0.A02
            goto L_0x0015
        L_0x00ff:
            r0 = r15
            X.QkL r0 = (X.C8212QkL) r0
            X.T9n r7 = r0.A01
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SK8.A0B():X.T9n");
    }

    public final C269434f7 A0C() {
        if (this instanceof C8212QkL) {
            return ((C8212QkL) this).A02;
        }
        return ((C8213QkM) this).A06;
    }

    public final C269434f7 A0D() {
        if (this instanceof C8212QkL) {
            return null;
        }
        A0F();
        return null;
    }

    public final C8203QkC A0E() {
        if (this instanceof C8212QkL) {
            C8208QkH qkH = ((C8212QkL) this).A03;
            if (qkH instanceof C8203QkC) {
                return (C8203QkC) qkH;
            }
            return null;
        }
        C8213QkM qkM = (C8213QkM) this;
        S7Z s7z = qkM.A01;
        if (s7z == null) {
            return null;
        }
        C8203QkC qkC = (C8203QkC) s7z.A02;
        S7Z s7z2 = s7z.A01;
        while (s7z2 != null) {
            C8203QkC qkC2 = (C8203QkC) s7z2.A02;
            Class<?> declaringClass = qkC.A00.getDeclaringClass();
            Class<?> declaringClass2 = qkC2.A00.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    qkC = qkC2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
                s7z2 = s7z2.A01;
            }
            throw AnonymousClass7TE.A0w(002.A13("Multiple fields representing property \"", qkM.A0L(), "\": ", qkC.A0B(), " vs ", qkC2.A0B()));
        }
        return qkC;
    }

    public final C8208QkH A0F() {
        if (this instanceof C8212QkL) {
            return ((C8212QkL) this).A03;
        }
        C8213QkM qkM = (C8213QkM) this;
        if (!qkM.A08) {
            C8202QkB A0I = qkM.A0I();
            if (A0I != null) {
                return A0I;
            }
            C8206QkF A0H = qkM.A0H();
            if (A0H != null) {
                return A0H;
            }
            C8203QkC A0E = qkM.A0E();
            if (A0E != null) {
                return A0E;
            }
        }
        C8206QkF A0G = qkM.A0G();
        if (A0G == null) {
            return qkM.A0E();
        }
        return A0G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r1.isAssignableFrom(r2) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r2 < r0) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C8206QkF A0G() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C8212QkL
            if (r0 == 0) goto L_0x0016
            r0 = r10
            X.QkL r0 = (X.C8212QkL) r0
            X.QkH r1 = r0.A03
            boolean r0 = r1 instanceof X.C8206QkF
            if (r0 == 0) goto L_0x0080
            X.QkF r1 = (X.C8206QkF) r1
            int r0 = r1.A0F()
            if (r0 != 0) goto L_0x0080
            return r1
        L_0x0016:
            r5 = r10
            X.QkM r5 = (X.C8213QkM) r5
            X.S7Z r6 = r5.A02
            if (r6 == 0) goto L_0x0080
            X.S7Z r4 = r6.A01
            if (r4 != 0) goto L_0x0026
        L_0x0021:
            java.lang.Object r1 = r6.A02
            X.QkF r1 = (X.C8206QkF) r1
            return r1
        L_0x0026:
            java.lang.Object r0 = r6.A02
            X.QkF r0 = (X.C8206QkF) r0
            java.lang.reflect.Method r0 = r0.A01
            java.lang.Class r2 = r0.getDeclaringClass()
            java.lang.Object r3 = r4.A02
            X.QkF r3 = (X.C8206QkF) r3
            java.lang.reflect.Method r0 = r3.A01
            java.lang.Class r1 = r0.getDeclaringClass()
            if (r2 == r1) goto L_0x0053
            boolean r0 = r2.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x0063
            boolean r0 = r1.isAssignableFrom(r2)
            if (r0 == 0) goto L_0x0053
        L_0x0048:
            X.S7Z r4 = r4.A01
            if (r4 != 0) goto L_0x0026
            X.S7Z r0 = r6.A02()
            r5.A02 = r0
            goto L_0x0021
        L_0x0053:
            int r2 = X.C8213QkM.A00(r3)
            java.lang.Object r1 = r6.A02
            X.QkF r1 = (X.C8206QkF) r1
            int r0 = X.C8213QkM.A00(r1)
            if (r2 == r0) goto L_0x0065
            if (r2 >= r0) goto L_0x0048
        L_0x0063:
            r6 = r4
            goto L_0x0048
        L_0x0065:
            java.lang.String r4 = "Conflicting getter definitions for property \""
            java.lang.String r5 = r5.A0L()
            java.lang.String r6 = "\": "
            java.lang.String r7 = r1.A0B()
            java.lang.String r8 = " vs "
            java.lang.String r9 = r3.A0B()
            java.lang.String r0 = X.002.A13(r4, r5, r6, r7, r8, r9)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0080:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SK8.A0G():X.QkF");
    }

    public final C8206QkF A0H() {
        if (this instanceof C8212QkL) {
            C8208QkH qkH = ((C8212QkL) this).A03;
            if (!(qkH instanceof C8206QkF)) {
                return null;
            }
            C8206QkF qkF = (C8206QkF) qkH;
            if (qkF.A0F() == 1) {
                return qkF;
            }
            return null;
        }
        C8213QkM qkM = (C8213QkM) this;
        S7Z s7z = qkM.A03;
        if (s7z == null) {
            return null;
        }
        S7Z s7z2 = s7z.A01;
        if (s7z2 != null) {
            while (true) {
                Object obj = s7z.A02;
                C8206QkF A0X = qkM.A0X((C8206QkF) obj, (C8206QkF) s7z2.A02);
                if (A0X != obj) {
                    if (A0X == s7z2.A02) {
                        s7z = s7z2;
                    } else {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        A1C.add(s7z.A02);
                        loop1:
                        while (true) {
                            A1C.add(s7z2.A02);
                            while (true) {
                                s7z2 = s7z2.A01;
                                if (s7z2 == null) {
                                    break loop1;
                                }
                                Object obj2 = s7z.A02;
                                C8206QkF A0X2 = qkM.A0X((C8206QkF) obj2, (C8206QkF) s7z2.A02);
                                if (A0X2 != obj2) {
                                    if (A0X2 == s7z2.A02) {
                                        A1C.clear();
                                        s7z = s7z2;
                                    }
                                }
                            }
                        }
                        if (!A1C.isEmpty()) {
                            throw Pxf.A0X("Conflicting setter definitions for property \"%s\": %s", new Object[]{qkM.A0L(), A1C.stream().map(new C51568FwI(0)).collect(Collectors.joining(" vs "))});
                        }
                    }
                }
                s7z2 = s7z2.A01;
                if (s7z2 == null) {
                    break;
                }
            }
            qkM.A03 = s7z.A02();
        }
        return (C8206QkF) s7z.A02;
    }

    public final C8202QkB A0I() {
        Object obj;
        if (this instanceof C8212QkL) {
            obj = ((C8212QkL) this).A03;
            if (!(obj instanceof C8202QkB)) {
                return null;
            }
        } else {
            S7Z s7z = ((C8213QkM) this).A00;
            S7Z s7z2 = s7z;
            if (s7z == null) {
                return null;
            }
            do {
                C8202QkB qkB = (C8202QkB) s7z.A02;
                if (qkB.A02 instanceof C8205QkE) {
                    return qkB;
                }
                s7z = s7z.A01;
            } while (s7z != null);
            obj = s7z2.A02;
        }
        return (C8202QkB) obj;
    }

    public final C11243SHd A0J() {
        S7Z s7z;
        C11243SHd sHd;
        if (!(this instanceof C8213QkM)) {
            return null;
        }
        C8213QkM qkM = (C8213QkM) this;
        C268854eA r2 = qkM.A04;
        C11243SHd sHd2 = null;
        if (r2 == null) {
            return null;
        }
        if (qkM.A08) {
            s7z = qkM.A02;
        } else {
            S7Z s7z2 = qkM.A00;
            if (s7z2 != null) {
                C269064eW r0 = (C269064eW) s7z2.A02;
                sHd2 = r2.A0H(r0);
                if (sHd2 != null) {
                    sHd2 = r2.A0I(r0, sHd2);
                }
                if (sHd2 != null) {
                    return sHd2;
                }
            }
            s7z = qkM.A03;
        }
        if (s7z != null) {
            C269064eW r02 = (C269064eW) s7z.A02;
            sHd = r2.A0H(r02);
            if (sHd != null) {
                sHd = r2.A0I(r02, sHd);
            }
            if (sHd != null) {
                return sHd;
            }
        }
        S7Z s7z3 = qkM.A01;
        if (s7z3 == null) {
            return sHd;
        }
        C269064eW r03 = (C269064eW) s7z3.A02;
        C11243SHd A0H = r2.A0H(r03);
        if (A0H != null) {
            return r2.A0I(r03, A0H);
        }
        return A0H;
    }

    public final Class A0K() {
        if (!(this instanceof C8212QkL)) {
            return A0A().A00;
        }
        C8208QkH qkH = ((C8212QkL) this).A03;
        if (qkH == null) {
            return Object.class;
        }
        return qkH.A04();
    }

    public final String A0L() {
        C269434f7 r0;
        if (this instanceof C8213QkM) {
            r0 = ((C8213QkM) this).A06;
            if (r0 == null) {
                return null;
            }
        } else {
            r0 = ((C8212QkL) this).A02;
        }
        return r0.A02;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Iterator, java.lang.Object, X.TM4] */
    public final Iterator A0M() {
        if (this instanceof C8212QkL) {
            C8202QkB A0I = A0I();
            if (A0I != null) {
                return Collections.singleton(A0I).iterator();
            }
        } else {
            S7Z s7z = ((C8213QkM) this).A00;
            if (s7z != null) {
                ? obj = new Object();
                obj.A00 = s7z;
                return obj;
            }
        }
        return C269574fL.A00;
    }

    public final boolean A0N() {
        Object A0E;
        if (this instanceof C8213QkM) {
            C8213QkM qkM = (C8213QkM) this;
            if (qkM.A00 == null && qkM.A03 == null) {
                A0E = qkM.A01;
            }
            return true;
        }
        if (A0I() == null && A0H() == null) {
            A0E = A0E();
        }
        return true;
        if (A0E != null) {
            return true;
        }
        return false;
    }

    public final boolean A0O() {
        Object A0E;
        if (this instanceof C8213QkM) {
            C8213QkM qkM = (C8213QkM) this;
            if (qkM.A02 == null) {
                A0E = qkM.A01;
            }
            return true;
        }
        if (A0G() == null) {
            A0E = A0E();
        }
        return true;
        if (A0E != null) {
            return true;
        }
        return false;
    }

    public final boolean A0P() {
        if (this instanceof C8212QkL) {
            return ((C8212QkL) this).A03 instanceof C8202QkB;
        }
        return AnonymousClass7TF.A1V(((C8213QkM) this).A00);
    }

    public final boolean A0Q() {
        if (this instanceof C8212QkL) {
            return ((C8212QkL) this).A03 instanceof C8203QkC;
        }
        return AnonymousClass7TF.A1V(((C8213QkM) this).A01);
    }

    public final boolean A0R() {
        if (this instanceof C8212QkL) {
            return AnonymousClass7TF.A1V(A0H());
        }
        return AnonymousClass7TF.A1V(((C8213QkM) this).A03);
    }

    public final boolean A0S() {
        if (this instanceof C8212QkL) {
            return false;
        }
        C8213QkM qkM = (C8213QkM) this;
        if (C8213QkM.A07(qkM.A01) || C8213QkM.A07(qkM.A02) || C8213QkM.A07(qkM.A03) || C8213QkM.A06(qkM.A00)) {
            return true;
        }
        return false;
    }

    public final boolean A0T() {
        if (this instanceof C8212QkL) {
            return false;
        }
        C8213QkM qkM = (C8213QkM) this;
        if (C8213QkM.A06(qkM.A01) || C8213QkM.A06(qkM.A02) || C8213QkM.A06(qkM.A03) || C8213QkM.A06(qkM.A00)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0U() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C8213QkM
            if (r0 == 0) goto L_0x0033
            r3 = r4
            X.QkM r3 = (X.C8213QkM) r3
            X.4eA r2 = r3.A04
            r1 = 0
            if (r2 == 0) goto L_0x0033
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0035
            X.S7Z r0 = r3.A02
        L_0x0012:
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r0.A02
            X.QkH r0 = (X.C8208QkH) r0
            java.lang.Boolean r1 = r2.A0T(r0)
            if (r1 != 0) goto L_0x002a
        L_0x001e:
            X.S7Z r0 = r3.A01
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r0.A02
            X.QkH r0 = (X.C8208QkH) r0
            java.lang.Boolean r1 = r2.A0T(r0)
        L_0x002a:
            if (r1 == 0) goto L_0x0033
            boolean r1 = r1.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            return r0
        L_0x0035:
            X.S7Z r0 = r3.A00
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r0.A02
            X.QkH r0 = (X.C8208QkH) r0
            java.lang.Boolean r1 = r2.A0T(r0)
            if (r1 != 0) goto L_0x002a
        L_0x0043:
            X.S7Z r0 = r3.A03
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SK8.A0U():boolean");
    }

    public final boolean A0V(C269434f7 r2) {
        C269434f7 r0;
        if (this instanceof C8212QkL) {
            r0 = ((C8212QkL) this).A02;
        } else {
            r0 = ((C8213QkM) this).A06;
        }
        return r0.equals(r2);
    }

    public final Class[] A0W() {
        S7Z s7z;
        if (!(this instanceof C8213QkM)) {
            return null;
        }
        C8213QkM qkM = (C8213QkM) this;
        C268854eA r2 = qkM.A04;
        Class[] clsArr = null;
        if (r2 == null) {
            return null;
        }
        if (qkM.A08) {
            s7z = qkM.A02;
        } else {
            S7Z s7z2 = qkM.A00;
            if (s7z2 != null && (clsArr = r2.A0q((C269064eW) s7z2.A02)) != null) {
                return clsArr;
            }
            s7z = qkM.A03;
        }
        if (s7z != null && (clsArr = r2.A0q((C269064eW) s7z.A02)) != null) {
            return clsArr;
        }
        S7Z s7z3 = qkM.A01;
        if (s7z3 != null) {
            return r2.A0q((C269064eW) s7z3.A02);
        }
        return clsArr;
    }
}
