package X;

import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.5Le  reason: invalid class name and case insensitive filesystem */
public final class C284155Le implements C284165Lf {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final C284035Kr A03;

    public final void E6G(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C284035Kr r6 = this.A03;
                boolean z = false;
                if (((AnonymousClass5Kq) r6).A0H() != 0) {
                    z = true;
                }
                list.add(Boolean.valueOf(z));
                if (!r6.A0C()) {
                    A06 = r6.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r7 = (AnonymousClass5Kq) this.A03;
            int A0F = r7.A04 + r7.A03 + r7.A0F();
            do {
                boolean z2 = false;
                if (r7.A0H() != 0) {
                    z2 = true;
                }
                list.add(Boolean.valueOf(z2));
            } while (r7.A04 + r7.A03 < A0F);
            A03(A0F);
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final void E6L(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                C284035Kr r2 = this.A03;
                list.add(Double.valueOf(Double.longBitsToDouble(((AnonymousClass5Kq) r2).A0G())));
                if (!r2.A0C()) {
                    A06 = r2.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A0F();
            if ((A0F & 7) == 0) {
                int i2 = r3.A04 + r3.A03 + A0F;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(r3.A0G())));
                } while (r3.A04 + r3.A03 < i2);
                return;
            }
            throw new C289845eJ("Failed to parse the message.");
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final void E6M(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C284035Kr r1 = this.A03;
                list.add(Integer.valueOf(((AnonymousClass5Kq) r1).A0F()));
                if (!r1.A0C()) {
                    A06 = r1.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A04 + r3.A03 + r3.A0F();
            do {
                list.add(Integer.valueOf(r3.A0F()));
            } while (r3.A04 + r3.A03 < A0F);
            A03(A0F);
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final void E6P(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A0F();
            if ((A0F & 3) == 0) {
                int i2 = r3.A04 + r3.A03 + A0F;
                do {
                    list.add(Integer.valueOf(r3.A0E()));
                } while (r3.A04 + r3.A03 < i2);
                return;
            }
            throw new C289845eJ("Failed to parse the message.");
        } else if (i != 5) {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        } else {
            do {
                C284035Kr r1 = this.A03;
                list.add(Integer.valueOf(((AnonymousClass5Kq) r1).A0E()));
                if (!r1.A0C()) {
                    A06 = r1.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        }
    }

    public final void E6Q(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                C284035Kr r2 = this.A03;
                list.add(Long.valueOf(((AnonymousClass5Kq) r2).A0G()));
                if (!r2.A0C()) {
                    A06 = r2.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A0F();
            if ((A0F & 7) == 0) {
                int i2 = r3.A04 + r3.A03 + A0F;
                do {
                    list.add(Long.valueOf(r3.A0G()));
                } while (r3.A04 + r3.A03 < i2);
                return;
            }
            throw new C289845eJ("Failed to parse the message.");
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final void E6R(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A0F();
            if ((A0F & 3) == 0) {
                int i2 = r3.A04 + r3.A03 + A0F;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(r3.A0E())));
                } while (r3.A04 + r3.A03 < i2);
                return;
            }
            throw new C289845eJ("Failed to parse the message.");
        } else if (i != 5) {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        } else {
            do {
                C284035Kr r1 = this.A03;
                list.add(Float.valueOf(Float.intBitsToFloat(((AnonymousClass5Kq) r1).A0E())));
                if (!r1.A0C()) {
                    A06 = r1.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        }
    }

    public final void E6V(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C284035Kr r1 = this.A03;
                list.add(Integer.valueOf(((AnonymousClass5Kq) r1).A0F()));
                if (!r1.A0C()) {
                    A06 = r1.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A04 + r3.A03 + r3.A0F();
            do {
                list.add(Integer.valueOf(r3.A0F()));
            } while (r3.A04 + r3.A03 < A0F);
            A03(A0F);
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final void E6W(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C284035Kr r2 = this.A03;
                list.add(Long.valueOf(((AnonymousClass5Kq) r2).A0H()));
                if (!r2.A0C()) {
                    A06 = r2.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A04 + r3.A03 + r3.A0F();
            do {
                list.add(Long.valueOf(r3.A0H()));
            } while (r3.A04 + r3.A03 < A0F);
            A03(A0F);
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final void E6e(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A0F();
            if ((A0F & 3) == 0) {
                int i2 = r3.A04 + r3.A03 + A0F;
                do {
                    list.add(Integer.valueOf(r3.A0E()));
                } while (r3.A04 + r3.A03 < i2);
                return;
            }
            throw new C289845eJ("Failed to parse the message.");
        } else if (i != 5) {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        } else {
            do {
                C284035Kr r1 = this.A03;
                list.add(Integer.valueOf(((AnonymousClass5Kq) r1).A0E()));
                if (!r1.A0C()) {
                    A06 = r1.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        }
    }

    public final void E6f(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                C284035Kr r2 = this.A03;
                list.add(Long.valueOf(((AnonymousClass5Kq) r2).A0G()));
                if (!r2.A0C()) {
                    A06 = r2.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A0F();
            if ((A0F & 7) == 0) {
                int i2 = r3.A04 + r3.A03 + A0F;
                do {
                    list.add(Long.valueOf(r3.A0G()));
                } while (r3.A04 + r3.A03 < i2);
                return;
            }
            throw new C289845eJ("Failed to parse the message.");
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final void E6g(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C284035Kr r2 = this.A03;
                int A0F = ((AnonymousClass5Kq) r2).A0F();
                list.add(Integer.valueOf((-(A0F & 1)) ^ (A0F >>> 1)));
                if (!r2.A0C()) {
                    A06 = r2.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F2 = r3.A04 + r3.A03 + r3.A0F();
            do {
                int A0F3 = r3.A0F();
                list.add(Integer.valueOf((-(A0F3 & 1)) ^ (A0F3 >>> 1)));
            } while (r3.A04 + r3.A03 < A0F2);
            A03(A0F2);
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final void E6h(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C284035Kr r6 = this.A03;
                long A0H = ((AnonymousClass5Kq) r6).A0H();
                list.add(Long.valueOf((-(A0H & 1)) ^ (A0H >>> 1)));
                if (!r6.A0C()) {
                    A06 = r6.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r7 = (AnonymousClass5Kq) this.A03;
            int A0F = r7.A04 + r7.A03 + r7.A0F();
            do {
                long A0H2 = r7.A0H();
                list.add(Long.valueOf((-(A0H2 & 1)) ^ (A0H2 >>> 1)));
            } while (r7.A04 + r7.A03 < A0F);
            A03(A0F);
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final void E6n(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C284035Kr r1 = this.A03;
                list.add(Integer.valueOf(((AnonymousClass5Kq) r1).A0F()));
                if (!r1.A0C()) {
                    A06 = r1.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A04 + r3.A03 + r3.A0F();
            do {
                list.add(Integer.valueOf(r3.A0F()));
            } while (r3.A04 + r3.A03 < A0F);
            A03(A0F);
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final void E6o(List list) {
        int A06;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C284035Kr r2 = this.A03;
                list.add(Long.valueOf(((AnonymousClass5Kq) r2).A0H()));
                if (!r2.A0C()) {
                    A06 = r2.A06();
                } else {
                    return;
                }
            } while (A06 == this.A02);
            this.A01 = A06;
        } else if (i == 2) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this.A03;
            int A0F = r3.A04 + r3.A03 + r3.A0F();
            do {
                list.add(Long.valueOf(r3.A0H()));
            } while (r3.A04 + r3.A03 < A0F);
            A03(A0F);
        } else {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public static Object A00(C284155Le r4, C284055Ku r5, AnonymousClass5L3 r6) {
        int i = r4.A00;
        r4.A00 = ((r4.A02 >>> 3) << 3) | 4;
        try {
            Object Cr9 = r6.Cr9();
            r6.Co6(r5, r4, Cr9);
            r6.ClW(Cr9);
            if (r4.A02 == r4.A00) {
                return Cr9;
            }
            throw new C289845eJ("Failed to parse the message.");
        } finally {
            r4.A00 = i;
        }
    }

    public static Object A01(C284155Le r5, C284055Ku r6, AnonymousClass5L3 r7) {
        C284035Kr r4 = r5.A03;
        AnonymousClass5Kq r3 = (AnonymousClass5Kq) r4;
        int A0F = r3.A0F();
        if (r4.A00 < 100) {
            int A07 = r4.A07(A0F);
            Object Cr9 = r7.Cr9();
            r4.A00++;
            r7.Co6(r6, r5, Cr9);
            r7.ClW(Cr9);
            r4.A0B(0);
            r4.A00--;
            r3.A01 = A07;
            AnonymousClass5Kq.A01(r3);
            return Cr9;
        }
        throw new C289845eJ("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0074, code lost:
        return java.lang.Long.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0085, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A02(X.C284155Le r2, X.C284055Ku r3, X.AnonymousClass5L7 r4, java.lang.Class r5) {
        /*
            int[] r1 = X.C284175Lg.A00
            int r0 = r4.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x00ca;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00aa;
                case 4: goto L_0x0024;
                case 5: goto L_0x0075;
                case 6: goto L_0x0064;
                case 7: goto L_0x0095;
                case 8: goto L_0x0024;
                case 9: goto L_0x0017;
                case 10: goto L_0x0086;
                case 11: goto L_0x0075;
                case 12: goto L_0x0064;
                case 13: goto L_0x0051;
                case 14: goto L_0x003c;
                case 15: goto L_0x0031;
                case 16: goto L_0x0024;
                case 17: goto L_0x0017;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 910(0x38e, float:1.275E-42)
            java.lang.String r1 = X.Pxd.A00(r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0017:
            r0 = 0
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            X.5Kq r0 = (X.AnonymousClass5Kq) r0
            long r0 = r0.A0H()
            goto L_0x0070
        L_0x0024:
            r0 = 0
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            X.5Kq r0 = (X.AnonymousClass5Kq) r0
            int r0 = r0.A0F()
            goto L_0x0081
        L_0x0031:
            r0 = 2
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            java.lang.String r0 = r0.A0A()
            return r0
        L_0x003c:
            r0 = 0
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            X.5Kq r0 = (X.AnonymousClass5Kq) r0
            long r4 = r0.A0H()
            r0 = 1
            long r2 = r4 >>> r0
            r0 = 1
            long r4 = r4 & r0
            long r0 = -r4
            long r0 = r0 ^ r2
            goto L_0x0070
        L_0x0051:
            r0 = 0
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            X.5Kq r0 = (X.AnonymousClass5Kq) r0
            int r0 = r0.A0F()
            int r1 = r0 >>> 1
            r0 = r0 & 1
            int r0 = -r0
            r0 = r0 ^ r1
            goto L_0x0081
        L_0x0064:
            r0 = 1
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            X.5Kq r0 = (X.AnonymousClass5Kq) r0
            long r0 = r0.A0G()
        L_0x0070:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L_0x0075:
            r0 = 5
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            X.5Kq r0 = (X.AnonymousClass5Kq) r0
            int r0 = r0.A0E()
        L_0x0081:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0086:
            r0 = 2
            A04(r2, r0)
            X.5Kw r0 = X.C284075Kw.A02
            X.5L3 r0 = r0.A00(r5)
            java.lang.Object r0 = A01(r2, r3, r0)
            return r0
        L_0x0095:
            r0 = 5
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            X.5Kq r0 = (X.AnonymousClass5Kq) r0
            int r0 = r0.A0E()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x00aa:
            r0 = 1
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            X.5Kq r0 = (X.AnonymousClass5Kq) r0
            long r0 = r0.A0G()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L_0x00bf:
            r0 = 2
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            X.5L9 r0 = r0.A08()
            return r0
        L_0x00ca:
            r0 = 0
            A04(r2, r0)
            X.5Kr r0 = r2.A03
            X.5Kq r0 = (X.AnonymousClass5Kq) r0
            long r4 = r0.A0H()
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x00de
            r0 = 1
        L_0x00de:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284155Le.A02(X.5Le, X.5Ku, X.5L7, java.lang.Class):java.lang.Object");
    }

    private void A03(int i) {
        AnonymousClass5Kq r0 = (AnonymousClass5Kq) this.A03;
        if (r0.A04 + r0.A03 != i) {
            throw new C289845eJ("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void A04(C284155Le r0, int i) {
        if ((r0.A02 & 7) != i) {
            throw new C289845eJ("Protocol message tag had invalid wire type.");
        }
    }

    public final int B5c() {
        int i = this.A01;
        if (i != 0) {
            this.A02 = i;
            this.A01 = 0;
        } else {
            i = this.A03.A06();
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

    public C284155Le(C284035Kr r2) {
        Charset charset = C284045Ks.A03;
        this.A03 = r2;
        r2.A01 = this;
    }
}
