package X;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class IZ1 implements C233432vi {
    public final List A00 = AnonymousClass7TE.A1C();
    public final List A01;
    public final Set A02 = DbS.A0y();

    public final 1PW AGd(List list) {
        0qQ.A0B(list, 0);
        List<C233432vi> list2 = this.A01;
        if (list2.isEmpty()) {
            return 1PW.A0K;
        }
        Integer num = AnonymousClass05K.A0N;
        1PW r4 = new 1PW(num);
        for (C233432vi AGd : list2) {
            1PW AGd2 = AGd.AGd(list);
            if (AGd2.A0C == num) {
                boolean z = true;
                if (r4.A00().isEmpty() && AnonymousClass7TE.A1b(AGd2.A00())) {
                    Iterator it = AGd2.A00().iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        if (!r4.A00().contains(A18)) {
                            r4.A01(A18);
                        }
                    }
                }
                int i = AGd2.A01;
                if (C55159HdB.A00((double) r4.A01, (double) i)) {
                    r4.A01 = i;
                }
                int i2 = AGd2.A04;
                if (C55159HdB.A00((double) r4.A04, (double) i2)) {
                    r4.A04 = i2;
                }
                int i3 = AGd2.A02;
                if (C55159HdB.A00((double) r4.A02, (double) i3)) {
                    r4.A02 = i3;
                }
                double d = r4.A00;
                double d2 = AGd2.A00;
                if (C55159HdB.A00(d, d2)) {
                    r4.A00 = d2;
                }
                int i4 = AGd2.A03;
                if (C55159HdB.A00((double) r4.A03, (double) i4)) {
                    r4.A03 = i4;
                }
                int i5 = AGd2.A09;
                if (C55159HdB.A00((double) r4.A09, (double) i5)) {
                    r4.A09 = i5;
                }
                int i6 = AGd2.A0A;
                if (C55159HdB.A00((double) r4.A0A, (double) i6)) {
                    r4.A0A = i6;
                }
                String str = r4.A0D;
                String str2 = AGd2.A0D;
                if (str.length() == 0 && str2.length() != 0) {
                    r4.A0D = str2;
                }
                if (!r4.A0G && !AGd2.A0G) {
                    z = false;
                }
                r4.A0G = z;
            }
        }
        return r4;
    }

    public final C233612w1 AMC() {
        return new IZ6(this, 1);
    }

    public final AnonymousClass4lJ AN3() {
        return new C57365IYw(this, 0);
    }

    public final void ATF(AnonymousClass30Y r1, C252093oY r2) {
    }

    public final String B4s() {
        return "";
    }

    public final void CJE(C376459Ib r1, List list) {
    }

    public final void Dpg(String str) {
        0qQ.A0B(str, 0);
        for (C233432vi Dpg : this.A01) {
            Dpg.Dpg(str);
        }
    }

    public final void EDQ(C233602vz r2) {
        0qQ.A0B(r2, 0);
        this.A02.remove(r2);
    }

    public final void EIs(1PW r1) {
    }

    public final void EO6(C233452vk r3) {
        0qQ.A0B(r3, 0);
        for (C233432vi EO6 : this.A01) {
            EO6.EO6(r3);
        }
    }

    public final void A7t(C233602vz r2) {
        if (r2 != null) {
            this.A02.add(r2);
        }
    }

    public final void CNn() {
        for (C233432vi CNn : this.A01) {
            CNn.CNn();
        }
    }

    public final void Crm(int i) {
        for (C233432vi Crm : this.A01) {
            Crm.Crm(i);
        }
    }

    public final void Crv(int i) {
        for (C233432vi Crv : this.A01) {
            Crv.Crv(i);
        }
    }

    public final void Dpb() {
        for (C233432vi Dpb : this.A01) {
            Dpb.Dpb();
        }
    }

    public final void Dpe() {
        for (C233432vi Dpe : this.A01) {
            Dpe.Dpe();
        }
    }

    public final void Dpk() {
        for (C233432vi Dpk : this.A01) {
            Dpk.Dpk();
        }
    }

    public final void EBI() {
        for (C233432vi EBI : this.A01) {
            EBI.EBI();
        }
    }

    public final void EIr() {
        for (C233432vi EIr : this.A01) {
            EIr.EIr();
        }
    }

    public IZ1(List list) {
        this.A01 = list;
        IZ0 iz0 = new IZ0(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C233432vi r2 = (C233432vi) it.next();
            this.A00.add(r2.AMC());
            r2.A7t(iz0);
        }
    }

    public final Set Bsw() {
        return AnonymousClass7TE.A1F();
    }
}
