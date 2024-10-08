package X;

import java.nio.charset.Charset;
import java.util.List;

public final class SUM {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final C11363SPb A03;

    public static C11363SPb A03(SUM sum) {
        A0A(sum, 0);
        return sum.A03;
    }

    public final void A0C(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C11363SPb sPb = this.A03;
                list.add(Boolean.valueOf(sPb.A0U()));
                if (!sPb.A0T()) {
                    A0G = sPb.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C11363SPb sPb2 = this.A03;
            int A022 = A02(sPb2);
            do {
                list.add(Boolean.valueOf(sPb2.A0U()));
            } while (sPb2.A0A() < A022);
            A07(A022);
        } else {
            throw AnonymousClass5I7.A00();
        }
    }

    public final void A0D(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                C11363SPb sPb = this.A03;
                list.add(Double.valueOf(sPb.A08()));
                if (!sPb.A0T()) {
                    A0G = sPb.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C11363SPb sPb2 = this.A03;
            int A012 = A01(sPb2);
            do {
                list.add(Double.valueOf(sPb2.A08()));
            } while (sPb2.A0A() < A012);
        } else {
            throw AnonymousClass5I7.A00();
        }
    }

    public static Object A04(SUM sum, SQg sQg, C13903TjQ tjQ) {
        int i = sum.A00;
        sum.A00 = ((sum.A02 >>> 3) << 3) | 4;
        try {
            Object Cr9 = tjQ.Cr9();
            tjQ.Co9(sum, sQg, Cr9);
            tjQ.ClW(Cr9);
            if (sum.A02 == sum.A00) {
                return Cr9;
            }
            throw Pxg.A0T("Failed to parse the message.");
        } finally {
            sum.A00 = i;
        }
    }

    public static Object A05(SUM sum, SQg sQg, C13903TjQ tjQ) {
        C11363SPb sPb = sum.A03;
        int A0H = sPb.A0H();
        if (sPb.A00 < 100) {
            int A0I = sPb.A0I(A0H);
            Object Cr9 = tjQ.Cr9();
            sPb.A00++;
            tjQ.Co9(sum, sQg, Cr9);
            tjQ.ClW(Cr9);
            sPb.A0R(0);
            sPb.A00--;
            sPb.A0S(A0I);
            return Cr9;
        }
        throw Pxg.A0T(C273654mx.A00(494));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        return java.lang.Long.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ad, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A06(X.SUM r1, X.SQg r2, X.C8915RFi r3, java.lang.Class r4) {
        /*
            int[] r0 = X.C10014Rl9.A00
            int r0 = X.Pxe.A08(r3, r0)
            switch(r0) {
                case 1: goto L_0x00c8;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00a1;
                case 5: goto L_0x0096;
                case 6: goto L_0x0087;
                case 7: goto L_0x0078;
                case 8: goto L_0x006f;
                case 9: goto L_0x0066;
                case 10: goto L_0x0057;
                case 11: goto L_0x004c;
                case 12: goto L_0x0041;
                case 13: goto L_0x0038;
                case 14: goto L_0x002f;
                case 15: goto L_0x0024;
                case 16: goto L_0x001a;
                case 17: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "unsupported field type."
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0011:
            X.SPb r0 = A03(r1)
            long r0 = r0.A0N()
            goto L_0x0091
        L_0x001a:
            X.SPb r0 = A03(r1)
            int r0 = r0.A0H()
            goto L_0x00a9
        L_0x0024:
            r0 = 2
            A0A(r1, r0)
            X.SPb r0 = r1.A03
            java.lang.String r0 = r0.A0Q()
            return r0
        L_0x002f:
            X.SPb r0 = A03(r1)
            long r0 = r0.A0M()
            goto L_0x0091
        L_0x0038:
            X.SPb r0 = A03(r1)
            int r0 = r0.A0F()
            goto L_0x00a9
        L_0x0041:
            r0 = 1
            A0A(r1, r0)
            X.SPb r0 = r1.A03
            long r0 = r0.A0L()
            goto L_0x0091
        L_0x004c:
            r0 = 5
            A0A(r1, r0)
            X.SPb r0 = r1.A03
            int r0 = r0.A0E()
            goto L_0x00a9
        L_0x0057:
            r0 = 2
            A0A(r1, r0)
            X.SH5 r0 = X.SH5.A02
            X.TjQ r0 = r0.A00(r4)
            java.lang.Object r0 = A05(r1, r2, r0)
            return r0
        L_0x0066:
            X.SPb r0 = A03(r1)
            long r0 = r0.A0K()
            goto L_0x0091
        L_0x006f:
            X.SPb r0 = A03(r1)
            int r0 = r0.A0D()
            goto L_0x00a9
        L_0x0078:
            r0 = 5
            A0A(r1, r0)
            X.SPb r0 = r1.A03
            float r0 = r0.A09()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x0087:
            r0 = 1
            A0A(r1, r0)
            X.SPb r0 = r1.A03
            long r0 = r0.A0J()
        L_0x0091:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L_0x0096:
            r0 = 5
            A0A(r1, r0)
            X.SPb r0 = r1.A03
            int r0 = r0.A0C()
            goto L_0x00a9
        L_0x00a1:
            X.SPb r0 = A03(r1)
            int r0 = r0.A0B()
        L_0x00a9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00ae:
            r0 = 1
            A0A(r1, r0)
            X.SPb r0 = r1.A03
            double r0 = r0.A08()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L_0x00bd:
            r0 = 2
            A0A(r1, r0)
            X.SPb r0 = r1.A03
            X.TAP r0 = r0.A0O()
            return r0
        L_0x00c8:
            X.SPb r0 = A03(r1)
            boolean r0 = r0.A0U()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUM.A06(X.SUM, X.SQg, X.RFi, java.lang.Class):java.lang.Object");
    }

    private void A07(int i) {
        if (this.A03.A0A() != i) {
            throw AnonymousClass5I7.A02();
        }
    }

    public static void A08(int i) {
        if ((i & 3) != 0) {
            throw Pxg.A0T("Failed to parse the message.");
        }
    }

    public static void A09(int i) {
        if ((i & 7) != 0) {
            throw Pxg.A0T("Failed to parse the message.");
        }
    }

    public static void A0A(SUM sum, int i) {
        if ((sum.A02 & 7) != i) {
            throw AnonymousClass5I7.A00();
        }
    }

    public final int A0B() {
        int i = this.A01;
        if (i != 0) {
            this.A02 = i;
            this.A01 = 0;
        } else {
            i = this.A03.A0G();
            this.A02 = i;
            if (i == 0) {
                return Integer.MAX_VALUE;
            }
        }
        if (i != this.A00) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public final void A0E(List list) {
        int i;
        int A022;
        if (list instanceof R30) {
            R30 r30 = (R30) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C11363SPb sPb = this.A03;
                    A022 = A02(sPb);
                    do {
                        r30.A8j(sPb.A0B());
                    } while (sPb.A0A() < A022);
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb2 = this.A03;
                r30.A8j(sPb2.A0B());
                if (!sPb2.A0T()) {
                    i = sPb2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C11363SPb sPb3 = this.A03;
                A022 = A02(sPb3);
                do {
                    G9w.A0x(sPb3.A0B(), list);
                } while (sPb3.A0A() < A022);
            }
            throw AnonymousClass5I7.A00();
        }
        do {
            C11363SPb sPb4 = this.A03;
            G9w.A0x(sPb4.A0B(), list);
            if (!sPb4.A0T()) {
                i = sPb4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A07(A022);
    }

    public final void A0F(List list) {
        int A0G;
        if (list instanceof R30) {
            R30 r30 = (R30) list;
            int i = this.A02 & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        C11363SPb sPb = this.A03;
                        r30.A8j(sPb.A0C());
                        if (!sPb.A0T()) {
                            A0G = sPb.A0G();
                        } else {
                            return;
                        }
                    } while (A0G == this.A02);
                }
                throw AnonymousClass5I7.A00();
            }
            C11363SPb sPb2 = this.A03;
            int A002 = A00(sPb2);
            do {
                r30.A8j(sPb2.A0C());
            } while (sPb2.A0A() < A002);
            return;
        }
        int i2 = this.A02 & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C11363SPb sPb3 = this.A03;
                    G9w.A0x(sPb3.A0C(), list);
                    if (!sPb3.A0T()) {
                        A0G = sPb3.A0G();
                    } else {
                        return;
                    }
                } while (A0G == this.A02);
            }
            throw AnonymousClass5I7.A00();
        }
        C11363SPb sPb4 = this.A03;
        int A003 = A00(sPb4);
        do {
            G9w.A0x(sPb4.A0C(), list);
        } while (sPb4.A0A() < A003);
        return;
        this.A01 = A0G;
    }

    public final void A0G(List list) {
        int i;
        if (list instanceof R31) {
            R31 r31 = (R31) list;
            int i2 = this.A02 & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    C11363SPb sPb = this.A03;
                    int A012 = A01(sPb);
                    do {
                        r31.A02(sPb.A0J());
                    } while (sPb.A0A() < A012);
                    return;
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb2 = this.A03;
                r31.A02(sPb2.A0J());
                if (!sPb2.A0T()) {
                    i = sPb2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
        } else {
            int i3 = this.A02 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    C11363SPb sPb3 = this.A03;
                    int A013 = A01(sPb3);
                    do {
                        Pxe.A1J(sPb3.A0J(), list);
                    } while (sPb3.A0A() < A013);
                    return;
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb4 = this.A03;
                Pxe.A1J(sPb4.A0J(), list);
                if (!sPb4.A0T()) {
                    i = sPb4.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
        }
        this.A01 = i;
    }

    public final void A0H(List list) {
        int A0G;
        if (list instanceof R2z) {
            R2z r2z = (R2z) list;
            int i = this.A02 & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        C11363SPb sPb = this.A03;
                        r2z.A8W(sPb.A09());
                        if (!sPb.A0T()) {
                            A0G = sPb.A0G();
                        } else {
                            return;
                        }
                    } while (A0G == this.A02);
                }
                throw AnonymousClass5I7.A00();
            }
            C11363SPb sPb2 = this.A03;
            int A002 = A00(sPb2);
            do {
                r2z.A8W(sPb2.A09());
            } while (sPb2.A0A() < A002);
            return;
        }
        int i2 = this.A02 & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C11363SPb sPb3 = this.A03;
                    list.add(Float.valueOf(sPb3.A09()));
                    if (!sPb3.A0T()) {
                        A0G = sPb3.A0G();
                    } else {
                        return;
                    }
                } while (A0G == this.A02);
            }
            throw AnonymousClass5I7.A00();
        }
        C11363SPb sPb4 = this.A03;
        int A003 = A00(sPb4);
        do {
            list.add(Float.valueOf(sPb4.A09()));
        } while (sPb4.A0A() < A003);
        return;
        this.A01 = A0G;
    }

    public final void A0I(List list) {
        int i;
        int A022;
        if (list instanceof R30) {
            R30 r30 = (R30) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C11363SPb sPb = this.A03;
                    A022 = A02(sPb);
                    do {
                        r30.A8j(sPb.A0D());
                    } while (sPb.A0A() < A022);
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb2 = this.A03;
                r30.A8j(sPb2.A0D());
                if (!sPb2.A0T()) {
                    i = sPb2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C11363SPb sPb3 = this.A03;
                A022 = A02(sPb3);
                do {
                    G9w.A0x(sPb3.A0D(), list);
                } while (sPb3.A0A() < A022);
            }
            throw AnonymousClass5I7.A00();
        }
        do {
            C11363SPb sPb4 = this.A03;
            G9w.A0x(sPb4.A0D(), list);
            if (!sPb4.A0T()) {
                i = sPb4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A07(A022);
    }

    public final void A0J(List list) {
        int i;
        int A022;
        if (list instanceof R31) {
            R31 r31 = (R31) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C11363SPb sPb = this.A03;
                    A022 = A02(sPb);
                    do {
                        r31.A02(sPb.A0K());
                    } while (sPb.A0A() < A022);
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb2 = this.A03;
                r31.A02(sPb2.A0K());
                if (!sPb2.A0T()) {
                    i = sPb2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C11363SPb sPb3 = this.A03;
                A022 = A02(sPb3);
                do {
                    Pxe.A1J(sPb3.A0K(), list);
                } while (sPb3.A0A() < A022);
            }
            throw AnonymousClass5I7.A00();
        }
        do {
            C11363SPb sPb4 = this.A03;
            Pxe.A1J(sPb4.A0K(), list);
            if (!sPb4.A0T()) {
                i = sPb4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A07(A022);
    }

    public final void A0K(List list) {
        int A0G;
        if (list instanceof R30) {
            R30 r30 = (R30) list;
            int i = this.A02 & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        C11363SPb sPb = this.A03;
                        r30.A8j(sPb.A0E());
                        if (!sPb.A0T()) {
                            A0G = sPb.A0G();
                        } else {
                            return;
                        }
                    } while (A0G == this.A02);
                }
                throw AnonymousClass5I7.A00();
            }
            C11363SPb sPb2 = this.A03;
            int A002 = A00(sPb2);
            do {
                r30.A8j(sPb2.A0E());
            } while (sPb2.A0A() < A002);
            return;
        }
        int i2 = this.A02 & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C11363SPb sPb3 = this.A03;
                    G9w.A0x(sPb3.A0E(), list);
                    if (!sPb3.A0T()) {
                        A0G = sPb3.A0G();
                    } else {
                        return;
                    }
                } while (A0G == this.A02);
            }
            throw AnonymousClass5I7.A00();
        }
        C11363SPb sPb4 = this.A03;
        int A003 = A00(sPb4);
        do {
            G9w.A0x(sPb4.A0E(), list);
        } while (sPb4.A0A() < A003);
        return;
        this.A01 = A0G;
    }

    public final void A0L(List list) {
        int i;
        if (list instanceof R31) {
            R31 r31 = (R31) list;
            int i2 = this.A02 & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    C11363SPb sPb = this.A03;
                    int A012 = A01(sPb);
                    do {
                        r31.A02(sPb.A0L());
                    } while (sPb.A0A() < A012);
                    return;
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb2 = this.A03;
                r31.A02(sPb2.A0L());
                if (!sPb2.A0T()) {
                    i = sPb2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
        } else {
            int i3 = this.A02 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    C11363SPb sPb3 = this.A03;
                    int A013 = A01(sPb3);
                    do {
                        Pxe.A1J(sPb3.A0L(), list);
                    } while (sPb3.A0A() < A013);
                    return;
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb4 = this.A03;
                Pxe.A1J(sPb4.A0L(), list);
                if (!sPb4.A0T()) {
                    i = sPb4.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
        }
        this.A01 = i;
    }

    public final void A0M(List list) {
        int i;
        int A022;
        if (list instanceof R30) {
            R30 r30 = (R30) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C11363SPb sPb = this.A03;
                    A022 = A02(sPb);
                    do {
                        r30.A8j(sPb.A0F());
                    } while (sPb.A0A() < A022);
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb2 = this.A03;
                r30.A8j(sPb2.A0F());
                if (!sPb2.A0T()) {
                    i = sPb2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C11363SPb sPb3 = this.A03;
                A022 = A02(sPb3);
                do {
                    G9w.A0x(sPb3.A0F(), list);
                } while (sPb3.A0A() < A022);
            }
            throw AnonymousClass5I7.A00();
        }
        do {
            C11363SPb sPb4 = this.A03;
            G9w.A0x(sPb4.A0F(), list);
            if (!sPb4.A0T()) {
                i = sPb4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A07(A022);
    }

    public final void A0N(List list) {
        int i;
        int A022;
        if (list instanceof R31) {
            R31 r31 = (R31) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C11363SPb sPb = this.A03;
                    A022 = A02(sPb);
                    do {
                        r31.A02(sPb.A0M());
                    } while (sPb.A0A() < A022);
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb2 = this.A03;
                r31.A02(sPb2.A0M());
                if (!sPb2.A0T()) {
                    i = sPb2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C11363SPb sPb3 = this.A03;
                A022 = A02(sPb3);
                do {
                    Pxe.A1J(sPb3.A0M(), list);
                } while (sPb3.A0A() < A022);
            }
            throw AnonymousClass5I7.A00();
        }
        do {
            C11363SPb sPb4 = this.A03;
            Pxe.A1J(sPb4.A0M(), list);
            if (!sPb4.A0T()) {
                i = sPb4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A07(A022);
    }

    public final void A0O(List list) {
        int i;
        int A022;
        if (list instanceof R30) {
            R30 r30 = (R30) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C11363SPb sPb = this.A03;
                    A022 = A02(sPb);
                    do {
                        r30.A8j(sPb.A0H());
                    } while (sPb.A0A() < A022);
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb2 = this.A03;
                r30.A8j(sPb2.A0H());
                if (!sPb2.A0T()) {
                    i = sPb2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C11363SPb sPb3 = this.A03;
                A022 = A02(sPb3);
                do {
                    G9w.A0x(sPb3.A0H(), list);
                } while (sPb3.A0A() < A022);
            }
            throw AnonymousClass5I7.A00();
        }
        do {
            C11363SPb sPb4 = this.A03;
            G9w.A0x(sPb4.A0H(), list);
            if (!sPb4.A0T()) {
                i = sPb4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A07(A022);
    }

    public final void A0P(List list) {
        int i;
        int A022;
        if (list instanceof R31) {
            R31 r31 = (R31) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C11363SPb sPb = this.A03;
                    A022 = A02(sPb);
                    do {
                        r31.A02(sPb.A0N());
                    } while (sPb.A0A() < A022);
                }
                throw AnonymousClass5I7.A00();
            }
            do {
                C11363SPb sPb2 = this.A03;
                r31.A02(sPb2.A0N());
                if (!sPb2.A0T()) {
                    i = sPb2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C11363SPb sPb3 = this.A03;
                A022 = A02(sPb3);
                do {
                    Pxe.A1J(sPb3.A0N(), list);
                } while (sPb3.A0A() < A022);
            }
            throw AnonymousClass5I7.A00();
        }
        do {
            C11363SPb sPb4 = this.A03;
            Pxe.A1J(sPb4.A0N(), list);
            if (!sPb4.A0T()) {
                i = sPb4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A07(A022);
    }

    public SUM(C11363SPb sPb) {
        Charset charset = SD9.A04;
        this.A03 = sPb;
        sPb.A01 = this;
    }

    public static int A00(C11363SPb sPb) {
        int A0H = sPb.A0H();
        A08(A0H);
        return sPb.A0A() + A0H;
    }

    public static int A01(C11363SPb sPb) {
        int A0H = sPb.A0H();
        A09(A0H);
        return sPb.A0A() + A0H;
    }

    public static int A02(C11363SPb sPb) {
        return sPb.A0A() + sPb.A0H();
    }
}
