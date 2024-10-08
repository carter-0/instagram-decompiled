package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Lbp  reason: case insensitive filesystem */
public final class C64434Lbp implements C252203oj {
    public static int A06;
    public static final C64107LNm A07 = C64107LNm.A01;
    public int A00;
    public final CopyOnWriteArrayList A01;
    public final C71392co A02;
    public final C71392co A03;
    public final 2cp A04;
    public final CopyOnWriteArrayList A05;

    public final void A00() {
        List A1D;
        this.A00 = 0;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        if (copyOnWriteArrayList.get(0) != null) {
            Collection values = this.A04.A02.values();
            if (values instanceof List) {
                A1D = (List) values;
            } else {
                A1D = AnonymousClass7TE.A1D(values);
            }
            Iterator A0h = JTQ.A0h(A1D);
            while (A0h.hasNext()) {
                ((2cs) A0h.next()).A09(this.A02);
            }
            ((2cs) copyOnWriteArrayList.get(this.A00)).A09(this.A03);
        }
    }

    public final void A01(C252203oj r3) {
        2cs A022 = this.A04.A02();
        A022.A0A(this);
        A022.A09(this.A02);
        this.A01.add(A022);
        this.A05.add(r3);
    }

    public final void DmB(2cs r3) {
        ((C252203oj) this.A05.get(this.A01.indexOf(r3))).DmB(r3);
    }

    public final void DmC(2cs r3) {
        ((C252203oj) this.A05.get(this.A01.indexOf(r3))).DmC(r3);
    }

    public final void DmD(2cs r3) {
        ((C252203oj) this.A05.get(this.A01.indexOf(r3))).DmD(r3);
    }

    public final void DmE(2cs r8) {
        int i;
        int i2;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int indexOf = copyOnWriteArrayList.indexOf(r8);
        C252203oj r5 = (C252203oj) this.A05.get(indexOf);
        int i3 = this.A00;
        if (indexOf == i3) {
            i2 = indexOf - 1;
            i = indexOf + 1;
        } else if (indexOf < i3) {
            i2 = indexOf - 1;
            if (i2 > -1 && i2 < copyOnWriteArrayList.size()) {
                ((2cs) copyOnWriteArrayList.get(i2)).A06(r8.A09.A00);
            }
            r5.DmE(r8);
        } else {
            if (indexOf > i3) {
                i = indexOf + 1;
                i2 = -1;
            }
            r5.DmE(r8);
        }
        if (i > -1 && i < copyOnWriteArrayList.size()) {
            ((2cs) copyOnWriteArrayList.get(i)).A06(r8.A09.A00);
        }
        ((2cs) copyOnWriteArrayList.get(i2)).A06(r8.A09.A00);
        r5.DmE(r8);
    }

    public C64434Lbp(C71392co r5, C71392co r6) {
        this.A04 = 2cp.A00();
        this.A05 = new CopyOnWriteArrayList();
        this.A01 = new CopyOnWriteArrayList();
        this.A00 = -1;
        this.A03 = r5;
        this.A02 = r6;
        C64107LNm lNm = A07;
        int i = A06;
        A06 = i + 1;
        lNm.A00(r5, 002.A0O("main spring ", i));
        int i2 = A06;
        A06 = i2 + 1;
        lNm.A00(r6, 002.A0O("attachment spring ", i2));
    }

    public C64434Lbp() {
        this(C71392co.A04(40.0d, 6.0d), C71392co.A04(70.0d, 10.0d));
    }
}
