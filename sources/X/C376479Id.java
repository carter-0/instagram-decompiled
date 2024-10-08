package X;

/* renamed from: X.9Id  reason: invalid class name and case insensitive filesystem */
public final class C376479Id extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C376479Id(1Xj r2, C231652s1 r3, AnonymousClass3W1 r4, int i) {
        0qQ.A0B(r2, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(r3, 4);
        this.A01 = i;
        this.A03 = r2;
        this.A04 = r4;
        this.A02 = r3;
    }

    public final void A00() {
        C232502tp r2;
        String str;
        switch (this.A00) {
            case 0:
                C232482tn r22 = (C232482tn) this.A02;
                C270464gm r1 = (C270464gm) this.A03;
                0qQ.A0B(r1, 1);
                if (r22.A02) {
                    r2 = r22.A00;
                    str = r1.A06;
                    0qQ.A07(str);
                    break;
                } else {
                    return;
                }
            case 1:
                ((C231652s1) this.A02).AHO((1Xj) this.A03, (AnonymousClass3W1) this.A04, this.A01);
                return;
            default:
                C231782sN r3 = (C231782sN) this.A02;
                int i = this.A01;
                C274594oe r12 = (C274594oe) this.A03;
                0qQ.A0B(r12, 1);
                if (i != 0) {
                    if (i == 2 && (r2 = (C232502tp) r3.A06.getValue()) != null) {
                        str = r12.A03.A09;
                        if (str == null) {
                            str = "";
                            break;
                        }
                    } else {
                        return;
                    }
                } else {
                    C2364233r r23 = r3.A00;
                    if (r23 != null) {
                        String str2 = r12.A06;
                        0qQ.A0B(str2, 0);
                        r23.A00.AGG();
                        r23.A01.remove(str2);
                        return;
                    }
                    return;
                }
                break;
        }
        r2.A02.A03(str);
    }

    public final void A01(Integer num) {
        C232502tp r2;
        String str;
        C62320sa r4;
        C62320sa r3;
        C62320sa r0;
        C2364233r r22;
        int i = this.A00;
        0qQ.A0B(num, 0);
        switch (i) {
            case 0:
                C232482tn r6 = (C232482tn) this.A02;
                C270464gm r5 = (C270464gm) this.A03;
                0qQ.A0B(r5, 1);
                if (r6.A02) {
                    r2 = r6.A00;
                    str = r5.A06;
                    0qQ.A07(str);
                    r4 = C41626Axe.A00;
                    r3 = new C377409Ls(4, r5, r6);
                    r0 = C41627Axf.A00;
                    break;
                } else {
                    return;
                }
            case 1:
                ((C231652s1) this.A02).E3r((1Xj) this.A03, (AnonymousClass3W1) this.A04, num, this.A01);
                return;
            default:
                C231782sN r23 = (C231782sN) this.A02;
                int i2 = this.A01;
                C274594oe r52 = (C274594oe) this.A03;
                AnonymousClass5O4 r32 = (AnonymousClass5O4) this.A04;
                0qQ.A0B(r52, 1);
                0qQ.A0B(r32, 2);
                if (i2 != 0) {
                    if (i2 == 2 && (r2 = (C232502tp) r23.A06.getValue()) != null) {
                        str = r52.A03.A09;
                        if (str == null) {
                            str = "";
                        }
                        r4 = C41628Axg.A00;
                        r3 = new C58178Ini(r52, 39);
                        r0 = C41629Axh.A00;
                        break;
                    } else {
                        return;
                    }
                } else if (r23.A07 && (r22 = r23.A00) != null) {
                    String str2 = r52.A06;
                    r22.A03(str2, new AnonymousClass9IV(r52, r32), str2);
                    return;
                } else {
                    return;
                }
                break;
        }
        r2.A07(str, r4, r3, r0);
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof C376479Id)) {
            return false;
        }
        C376479Id r3 = (C376479Id) obj;
        if (r3.A00 != i || this.A01 != r3.A01 || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A04, r3.A04) || !0qQ.A0K(this.A02, r3.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode();
    }

    public C376479Id(C232482tn r2, C270464gm r3, GY3 gy3, int i) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(gy3, 3);
        0qQ.A0B(r2, 4);
        this.A01 = i;
        this.A03 = r3;
        this.A04 = gy3;
        this.A02 = r2;
    }

    public C376479Id(C231782sN r2, C274594oe r3, AnonymousClass5O4 r4, int i) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(r2, 4);
        this.A01 = i;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }
}
