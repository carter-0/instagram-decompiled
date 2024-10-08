package X;

public final class I77 {
    public long A00;
    public C286025Tq A01;
    public final long A02;
    public final C56553I1h A03;
    public final C55428HhY A04;
    public final C286025Tq A05;
    public final C3022462f A06;
    public final JS3 A07;
    public final C285975Tl A08;

    public I77(C56553I1h i1h, C55428HhY hhY, JS3 js3, C285975Tl r8) {
        C3022462f r2;
        C286025Tq r3 = r8.A01;
        long j = r8.A00;
        if (i1h != null) {
            r2 = i1h.A02;
        } else {
            r2 = null;
        }
        this.A05 = r3;
        this.A02 = j;
        this.A06 = r2;
        this.A07 = js3;
        this.A04 = hhY;
        this.A00 = j;
        this.A01 = r3;
        this.A08 = r8;
        this.A03 = i1h;
    }

    public static final int A00(C56553I1h i1h, I77 i77, int i) {
        AnonymousClass5VN r6;
        C268064ch r1;
        C268064ch r2 = i1h.A01;
        if (r2 == null || (r1 = i1h.A00) == null) {
            r6 = AnonymousClass5VN.A04;
        } else {
            r6 = r1.CgV(r2, true);
        }
        JS3 js3 = i77.A07;
        int E1S = js3.E1S(C51968G9o.A02(i77.A08.A00));
        C3022462f r4 = i1h.A02;
        AnonymousClass5VN A062 = r4.A06(E1S);
        return js3.FHr(r4.A03.A08(C289325dP.A00(A062.A01, A062.A03 + (C288025bF.A00(r6.A01()) * ((float) i)))));
    }

    public static int A01(I77 i77) {
        i77.A04.A00 = null;
        return i77.A01.A00.length();
    }

    public static int A02(I77 i77) {
        return i77.A01.A00.length();
    }

    public static final int A03(I77 i77, C3022462f r7, int i) {
        JS3 js3 = i77.A07;
        int E1S = js3.E1S(C51968G9o.A02(i77.A00));
        C55428HhY hhY = i77.A04;
        if (hhY.A00 == null) {
            hhY.A00 = Float.valueOf(r7.A06(E1S).A01);
        }
        C3022262d r2 = r7.A03;
        int A062 = r2.A06(E1S) + i;
        if (A062 < 0) {
            return 0;
        }
        if (A062 >= r2.A02) {
            return A02(i77);
        }
        float A032 = r2.A03(A062) - 1.0f;
        Float f = hhY.A00;
        0qQ.A0A(f);
        float floatValue = f.floatValue();
        if ((!A06(i77) || floatValue < r7.A01(A062)) && (A06(i77) || floatValue > r7.A00(A062))) {
            return js3.FHr(r2.A08(C289325dP.A00(floatValue, A032)));
        }
        return r2.A07(A062, true);
    }

    public static final void A04(I77 i77) {
        int A002;
        i77.A04.A00 = null;
        String str = i77.A01.A00;
        if (str.length() > 0 && (A002 = C18085VlF.A00(str, C51968G9o.A02(i77.A00))) != -1) {
            i77.A00 = C3026964x.A00(A002, A002);
        }
    }

    public static final void A05(I77 i77) {
        int A012;
        i77.A04.A00 = null;
        String str = i77.A01.A00;
        if (str.length() > 0 && (A012 = C18085VlF.A01(str, C51968G9o.A02(i77.A00))) != -1) {
            i77.A00 = C3026964x.A00(A012, A012);
        }
    }

    public static final boolean A06(I77 i77) {
        C52430GSi gSi;
        C3022462f r3 = i77.A06;
        if (r3 != null) {
            gSi = r3.A09(i77.A07.E1S(C51968G9o.A02(i77.A00)));
        } else {
            gSi = null;
        }
        return C51969G9p.A1a(gSi, C52430GSi.Rtl);
    }

    public final Integer A07() {
        C3022462f r2 = this.A06;
        if (r2 == null) {
            return null;
        }
        JS3 js3 = this.A07;
        int E1S = js3.E1S(C285965Tk.A00(this.A00));
        C3022262d r22 = r2.A03;
        return Integer.valueOf(js3.FHr(r22.A07(r22.A06(E1S), true)));
    }

    public final Integer A08() {
        int length;
        C3022462f r7 = this.A06;
        if (r7 == null) {
            return null;
        }
        JS3 js3 = this.A07;
        int E1S = js3.E1S((int) (this.A00 & 4294967295L));
        while (true) {
            length = this.A05.length();
            if (E1S >= length) {
                break;
            }
            int A022 = A02(this) - 1;
            int i = E1S;
            if (E1S > A022) {
                i = A022;
            }
            int A042 = (int) (r7.A04(i) & 4294967295L);
            if (A042 > E1S) {
                length = js3.FHr(A042);
                break;
            }
            E1S++;
        }
        return Integer.valueOf(length);
    }

    public final Integer A09() {
        int i;
        C3022462f r4 = this.A06;
        if (r4 == null) {
            return null;
        }
        JS3 js3 = this.A07;
        int E1S = js3.E1S(C51968G9o.A02(this.A00));
        while (true) {
            if (E1S > 0) {
                int A022 = A02(this) - 1;
                int i2 = E1S;
                if (E1S > A022) {
                    i2 = A022;
                }
                int A042 = C51965G9l.A04(r4.A04(i2));
                if (A042 < E1S) {
                    i = js3.FHr(A042);
                    break;
                }
                E1S--;
            } else {
                i = 0;
                break;
            }
        }
        return Integer.valueOf(i);
    }

    public final void A0B() {
        this.A04.A00 = null;
        String str = this.A01.A00;
        int length = str.length();
        if (length > 0) {
            int A002 = C285965Tk.A00(this.A00);
            while (true) {
                if (A002 < length) {
                    if (str.charAt(A002) == 10) {
                        break;
                    }
                    A002++;
                } else {
                    A002 = length;
                    break;
                }
            }
            if (A002 == C285965Tk.A00(this.A00) && A002 != length) {
                while (true) {
                    A002++;
                    if (A002 < length) {
                        if (str.charAt(A002) == 10) {
                            break;
                        }
                    } else {
                        A002 = length;
                        break;
                    }
                }
            }
            this.A00 = C3026964x.A00(A002, A002);
        }
    }

    public final void A0C() {
        this.A04.A00 = null;
        String str = this.A01.A00;
        if (str.length() > 0) {
            int A012 = C285965Tk.A01(this.A00);
            while (true) {
                if (A012 > 0) {
                    if (str.charAt(A012 - 1) == 10) {
                        break;
                    }
                    A012--;
                } else {
                    A012 = 0;
                    break;
                }
            }
            if (A012 == C285965Tk.A01(this.A00) && A012 != 0) {
                while (true) {
                    A012--;
                    if (A012 > 0) {
                        if (str.charAt(A012 - 1) == 10) {
                            break;
                        }
                    } else {
                        A012 = 0;
                        break;
                    }
                }
            }
            this.A00 = C3026964x.A00(A012, A012);
        }
    }

    public final void A0A() {
        Integer A082;
        if (A01(this) > 0) {
            boolean A062 = A06(this);
            int A012 = A01(this);
            if (A062) {
                if (A012 > 0) {
                    A082 = A09();
                } else {
                    return;
                }
            } else if (A012 > 0) {
                A082 = A08();
            } else {
                return;
            }
            if (A082 != null) {
                int intValue = A082.intValue();
                this.A00 = C3026964x.A00(intValue, intValue);
            }
        }
    }

    public final void A0D() {
        Integer A09;
        if (A01(this) > 0) {
            boolean A062 = A06(this);
            int A012 = A01(this);
            if (A062) {
                if (A012 > 0) {
                    A09 = A08();
                } else {
                    return;
                }
            } else if (A012 > 0) {
                A09 = A09();
            } else {
                return;
            }
            if (A09 != null) {
                int intValue = A09.intValue();
                this.A00 = C3026964x.A00(intValue, intValue);
            }
        }
    }

    public final void A0E() {
        C3022462f r3;
        if (A01(this) > 0 && (r3 = this.A06) != null) {
            JS3 js3 = this.A07;
            int FHr = js3.FHr(r3.A03(r3.A03.A06(js3.E1S(C285965Tk.A01(this.A00)))));
            if (Integer.valueOf(FHr) != null) {
                this.A00 = C3026964x.A00(FHr, FHr);
            }
        }
    }
}
