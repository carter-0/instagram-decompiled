package X;

import java.util.List;

public final class IGH implements AnonymousClass5RD {
    public final IES A00;

    public final C289145d6 Cnx(C268004cb r18, List list, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        IGY igy;
        List list2 = list;
        int size = list2.size();
        C267974cY[] r12 = new C267974cY[size];
        long j3 = 0;
        int size2 = list2.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            j2 = j;
            if (i7 >= size2) {
                break;
            }
            C268074ci r11 = (C268074ci) list2.get(i7);
            Object BaX = r11.BaX();
            if ((BaX instanceof IGY) && (igy = (IGY) BaX) != null && C51971G9r.A1W(igy.A00)) {
                C267974cY Cnz = r11.Cnz(j2);
                j3 = C289155d7.A00(Cnz.A01, Cnz.A00);
                r12[i7] = Cnz;
            }
            i7++;
        }
        int size3 = list2.size();
        for (int i8 = 0; i8 < size3; i8++) {
            C268074ci r3 = (C268074ci) list2.get(i8);
            if (r12[i8] == null) {
                r12[i8] = r3.Cnz(j2);
            }
        }
        C268004cb r4 = r18;
        if (r4.CWf()) {
            i = C51965G9l.A04(j3);
        } else {
            if (size != 0) {
                C267974cY r5 = r12[0];
                int i9 = size - 1;
                if (i9 != 0) {
                    if (r5 != null) {
                        i2 = r5.A01;
                    } else {
                        i2 = 0;
                    }
                    C226422gn A002 = new 2HY(1, i9).A00();
                    while (A002.hasNext()) {
                        C267974cY r1 = r12[A002.A00()];
                        if (r1 != null) {
                            i3 = r1.A01;
                        } else {
                            i3 = 0;
                        }
                        if (i2 < i3) {
                            r5 = r1;
                            i2 = i3;
                        }
                    }
                }
                if (r5 != null) {
                    i = r5.A01;
                }
            }
            i = 0;
        }
        if (r4.CWf()) {
            i6 = C289005cr.A00(j3);
        } else if (size != 0) {
            C267974cY r52 = r12[0];
            int i10 = size - 1;
            if (i10 != 0) {
                if (r52 != null) {
                    i4 = r52.A00;
                } else {
                    i4 = 0;
                }
                C226422gn A003 = new 2HY(1, i10).A00();
                while (A003.hasNext()) {
                    C267974cY r13 = r12[A003.A00()];
                    if (r13 != null) {
                        i5 = r13.A00;
                    } else {
                        i5 = 0;
                    }
                    if (i4 < i5) {
                        r52 = r13;
                        i4 = i5;
                    }
                }
            }
            if (r52 != null) {
                i6 = r52.A00;
            }
        }
        if (!r4.CWf()) {
            this.A00.A04.Epw(new C289005cr(C289155d7.A00(i, i6)));
        }
        return C51969G9p.A0a(r4, new J6Y((Object) r12, i, (Object) this, i6, 0), i, i6);
    }

    public IGH(IES ies) {
        this.A00 = ies;
    }

    public final int CmW(C268014cc r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(G9w.A0J(list, 0).CmV(i));
        int A06 = C51966G9m.A06(list);
        int i2 = 1;
        if (1 <= A06) {
            while (true) {
                valueOf = C51975G9x.A0d(valueOf, G9w.A0J(list, i2).CmV(i));
                if (i2 == A06) {
                    break;
                }
                i2++;
            }
        }
        return C51967G9n.A04(valueOf, 0);
    }

    public final int CmZ(C268014cc r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(G9w.A0J(list, 0).CmY(i));
        int A06 = C51966G9m.A06(list);
        int i2 = 1;
        if (1 <= A06) {
            while (true) {
                valueOf = C51975G9x.A0d(valueOf, G9w.A0J(list, i2).CmY(i));
                if (i2 == A06) {
                    break;
                }
                i2++;
            }
        }
        return C51967G9n.A04(valueOf, 0);
    }

    public final int CoP(C268014cc r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(G9w.A0J(list, 0).CoO(i));
        int A06 = C51966G9m.A06(list);
        int i2 = 1;
        if (1 <= A06) {
            while (true) {
                valueOf = C51975G9x.A0d(valueOf, G9w.A0J(list, i2).CoO(i));
                if (i2 == A06) {
                    break;
                }
                i2++;
            }
        }
        return C51967G9n.A04(valueOf, 0);
    }

    public final int CoS(C268014cc r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(G9w.A0J(list, 0).CoR(i));
        int A06 = C51966G9m.A06(list);
        int i2 = 1;
        if (1 <= A06) {
            while (true) {
                valueOf = C51975G9x.A0d(valueOf, G9w.A0J(list, i2).CoR(i));
                if (i2 == A06) {
                    break;
                }
                i2++;
            }
        }
        return C51967G9n.A04(valueOf, 0);
    }
}
