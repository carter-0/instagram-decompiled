package X;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2vv  reason: invalid class name and case insensitive filesystem */
public final class C233562vv implements C233432vi {
    public 1PW A00 = 1PW.A0K;
    public boolean A01;
    public boolean A02;
    public final C228812mN A03;
    public final C233402vf A04;
    public final C252343ox A05;
    public final Set A06 = new LinkedHashSet();
    public final C249863kU A07;

    public final String B4s() {
        return "";
    }

    public final void CJE(C376459Ib r1, List list) {
    }

    public final void Crm(int i) {
    }

    public final /* synthetic */ void Dpb() {
    }

    public final /* synthetic */ void Dpe() {
    }

    public final /* synthetic */ void Dpg(String str) {
    }

    public final /* synthetic */ void Dpk() {
    }

    public final void A7t(C233602vz r2) {
        if (r2 != null) {
            this.A06.add(r2);
        }
    }

    public final 1PW AGd(List list) {
        int i;
        C252343ox r4 = this.A05;
        1PW A08 = r4.A08(list);
        1PW r1 = this.A00;
        if (!(r1 == 1PW.A0K || (i = r1.A05) == -1)) {
            boolean z = r4.A06;
            int i2 = A08.A05;
            if (z) {
                i2 += i;
            }
            A08.A05 = i2;
        }
        return A08;
    }

    public final C233612w1 AMC() {
        return new AnonymousClass2w2(this);
    }

    public final AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final Set Bsw() {
        return new HashSet();
    }

    public final void CNn() {
        this.A05.A0B();
    }

    public final void EBI() {
        this.A05.A0C();
    }

    public final void EDQ(C233602vz r2) {
        this.A06.remove(r2);
    }

    public final void EIr() {
        this.A05.A06 = true;
    }

    public final void EO6(C233452vk r2) {
        this.A05.A05 = r2;
    }

    public C233562vv(C228812mN r2, C233402vf r3, C249863kU r4, C252343ox r5, boolean z, boolean z2) {
        this.A07 = r4;
        this.A04 = r3;
        this.A05 = r5;
        this.A03 = r2;
        this.A02 = z;
        this.A01 = z2;
    }

    public final void ATF(AnonymousClass30Y r12, C252093oY r13) {
        Object BTb;
        if (r13.CEk(r12) == AnonymousClass05K.A0C) {
            C252343ox r1 = this.A05;
            if (r1 instanceof C252333ow) {
                C252333ow r14 = (C252333ow) r1;
                if (r14 instanceof C233542vt) {
                    C233542vt r15 = (C233542vt) r14;
                    if (r15.A0C) {
                        AnonymousClass9I2 r3 = r15.A02;
                        r15.A0A.Cjk(r3, "feed_tbi", (long) r15.A01, 0, (long) r15.A00);
                        r15.A00 = 0;
                        r15.A01 = 0;
                        r3.A04 = 0;
                        r3.A01 = 0;
                        r3.A03 = 0;
                        r3.A02 = 0;
                        r3.A06 = 0;
                        r3.A05 = 0;
                        r3.A00 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            C252343ox r5 = this.A05;
            C228812mN r4 = this.A03;
            r5.A04 = r4;
            r5.ATF(r12, r13);
            if (!this.A01 || !this.A07.A02.isEmpty()) {
                if (r5.A06) {
                    1PW A072 = r5.A07(r12, r13);
                    if (this.A02) {
                        Object BTb2 = this.A07.A00().BTb();
                        if (A072.A0C == AnonymousClass05K.A01) {
                            C266924aZ.A00(r4, BTb2, this.A06);
                        }
                    }
                    for (C233602vz DKi : this.A06) {
                        DKi.DKi(A072);
                    }
                    return;
                } else if (r5 instanceof C252333ow) {
                    ((C252333ow) r5).A00++;
                    return;
                }
            } else if (this.A02) {
                int A042 = r5.A04(r12.A04);
                C233402vf r0 = this.A04;
                List BYj = r0.BYj();
                C251373n0 Coa = r0.Coa();
                if (Coa != null && (BTb = Coa.BTb()) != null && r5.A0J(r13, BTb, BYj, A042)) {
                    C266924aZ.A00(r4, BTb, this.A06);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Crv(int i) {
    }

    public final void EIs(1PW r1) {
        this.A00 = r1;
    }
}
