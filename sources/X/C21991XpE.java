package X;

import java.util.Collection;

/* renamed from: X.XpE  reason: case insensitive filesystem */
public abstract class C21991XpE {
    public static final int A00(C21381XZo xZo, C22558YAp yAp, C22558YAp yAp2, int i) {
        int A01;
        0qQ.A0B(yAp, 0);
        0qQ.A0B(xZo, 1);
        0qQ.A0B(yAp2, 2);
        if (xZo.A01) {
            int Bcr = i - yAp.Bcr();
            int Bzs = yAp.Bzs();
            if (Bcr >= 0 && Bcr < Bzs) {
                int i2 = 0;
                do {
                    int i3 = i2 / 2;
                    int i4 = 1;
                    if (i2 % 2 == 1) {
                        i4 = -1;
                    }
                    int i5 = (i3 * i4) + Bcr;
                    if (i5 >= 0 && i5 < yAp.Bzs() && (A01 = xZo.A00.A01(i5)) != -1) {
                        return A01 + yAp2.Bcr();
                    }
                    i2++;
                } while (i2 < 30);
            }
        }
        return C229632nm.A05(C229632nm.A0C(0, yAp2.getSize()), i);
    }

    public static final C21381XZo A01(C22558YAp yAp, C22558YAp yAp2, C252303ot r11) {
        C22558YAp yAp3 = yAp;
        0qQ.A0B(yAp, 0);
        0qQ.A0B(yAp2, 1);
        boolean z = true;
        C232362ta A00 = C232332tX.A00(new C21156XGz(yAp3, yAp2, r11, yAp.Bzs(), yAp2.Bzs()));
        Collection A0C = C229632nm.A0C(0, yAp3.Bzs());
        if (!(A0C instanceof Collection) || !A0C.isEmpty()) {
            0sh it = A0C.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (A00.A01(it.A00()) != -1) {
                        break;
                    }
                } else {
                    break;
                }
            }
            return new C21381XZo(A00, z);
        }
        z = false;
        return new C21381XZo(A00, z);
    }

    public static final void A02(C21381XZo xZo, C22558YAp yAp, C22558YAp yAp2, C231452rh r10) {
        DbZ.A0t(0, yAp, yAp2, xZo);
        if (xZo.A01) {
            C22127Xvr xvr = new C22127Xvr(yAp, yAp2, r10);
            xZo.A00.A02(xvr);
            C22558YAp yAp3 = xvr.A06;
            int Bcr = yAp3.Bcr();
            int i = xvr.A02;
            int min = Math.min(Bcr, i);
            C22558YAp yAp4 = xvr.A05;
            int Bcr2 = yAp4.Bcr() - i;
            if (Bcr2 > 0) {
                if (min > 0) {
                    xvr.A07.D1O(0, min, C21242XQn.PLACEHOLDER_POSITION_CHANGE);
                }
                xvr.A07.DKr(0, Bcr2);
            } else if (Bcr2 < 0) {
                C231452rh r1 = xvr.A07;
                r1.Ddf(0, -Bcr2);
                int i2 = min + Bcr2;
                if (i2 > 0) {
                    r1.D1O(0, i2, C21242XQn.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            int Bcr3 = yAp4.Bcr();
            xvr.A02 = Bcr3;
            int Bcq = yAp3.Bcq();
            int i3 = xvr.A00;
            int min2 = Math.min(Bcq, i3);
            int Bcq2 = yAp4.Bcq() - i3;
            int i4 = Bcr3 + xvr.A04 + i3;
            int i5 = i4 - min2;
            boolean A1O = JTQ.A1O(i5, yAp3.getSize() - min2);
            if (Bcq2 > 0) {
                xvr.A07.DKr(i4, Bcq2);
            } else if (Bcq2 < 0) {
                xvr.A07.Ddf(i4 + Bcq2, -Bcq2);
                min2 += Bcq2;
            }
            if (min2 > 0 && A1O) {
                xvr.A07.D1O(i5, min2, C21242XQn.PLACEHOLDER_POSITION_CHANGE);
            }
            xvr.A00 = yAp4.Bcq();
            return;
        }
        int Bcr4 = yAp.Bcr();
        int Bcr5 = yAp2.Bcr();
        int max = Math.max(Bcr4, Bcr5);
        int min3 = Math.min(Bcr4 + yAp.Bzs(), Bcr5 + yAp2.Bzs());
        int i6 = min3 - max;
        if (i6 > 0) {
            r10.Ddf(max, i6);
            r10.DKr(max, i6);
        }
        int min4 = Math.min(max, min3);
        int max2 = Math.max(max, min3);
        int Bcr6 = yAp.Bcr();
        int size = yAp2.getSize();
        int i7 = Bcr6;
        if (Bcr6 > size) {
            i7 = size;
        }
        int Bzs = Bcr6 + yAp.Bzs();
        if (Bzs > size) {
            Bzs = size;
        }
        C21242XQn xQn = C21242XQn.ITEM_TO_PLACEHOLDER;
        int i8 = min4 - i7;
        if (i8 > 0) {
            r10.D1O(i7, i8, xQn);
        }
        int i9 = Bzs - max2;
        if (i9 > 0) {
            r10.D1O(max2, i9, xQn);
        }
        int Bcr7 = yAp2.Bcr();
        int size2 = yAp.getSize();
        int i10 = Bcr7;
        if (Bcr7 > size2) {
            i10 = size2;
        }
        int Bzs2 = Bcr7 + yAp2.Bzs();
        if (Bzs2 > size2) {
            Bzs2 = size2;
        }
        C21242XQn xQn2 = C21242XQn.PLACEHOLDER_TO_ITEM;
        int i11 = min4 - i10;
        if (i11 > 0) {
            r10.D1O(i10, i11, xQn2);
        }
        int i12 = Bzs2 - max2;
        if (i12 > 0) {
            r10.D1O(max2, i12, xQn2);
        }
        int size3 = yAp2.getSize();
        int size4 = yAp.getSize();
        int i13 = size3 - size4;
        if (i13 > 0) {
            r10.DKr(size4, i13);
        } else if (i13 < 0) {
            r10.Ddf(size4 + i13, -i13);
        }
    }
}
