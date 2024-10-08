package X;

import java.util.List;

/* renamed from: X.836  reason: invalid class name */
public final class AnonymousClass836 {
    public final 2Fk A00;
    public final AnonymousClass0r6 A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    public final void A01(AnonymousClass51N r6, int i) {
        String str;
        AnonymousClass51M r1;
        0qQ.A0B(r6, 1);
        05G r4 = this.A02;
        AnonymousClass51O A04 = ((AnonymousClass831) r4.getValue()).A04(i);
        String str2 = null;
        if (!(A04 instanceof AnonymousClass51M) || (r1 = (AnonymousClass51M) A04) == null) {
            str = null;
        } else {
            str = r1.A0L;
            str2 = r1.A0M;
        }
        r4.Epw(AEH.A01(AEH.A01(LSY.A02(r6, (AnonymousClass831) r4.getValue(), i), str, i - 1), str2, i));
    }

    public final void A02(List list) {
        0qQ.A0B(list, 0);
        05G r2 = this.A02;
        r2.Epw(new AnonymousClass831(list, ((AnonymousClass831) r2.getValue()).A03));
    }

    public final String A00(int i) {
        AnonymousClass51M r3;
        AnonymousClass51M r2;
        String str;
        05G r22 = this.A02;
        AnonymousClass51O A04 = ((AnonymousClass831) r22.getValue()).A04(i + 1);
        if (A04 instanceof AnonymousClass51M) {
            r3 = (AnonymousClass51M) A04;
        } else {
            r3 = null;
        }
        AnonymousClass51O A042 = ((AnonymousClass831) r22.getValue()).A04(i);
        if ((A042 instanceof AnonymousClass51M) && (r2 = (AnonymousClass51M) A042) != null && (str = r2.A0M) != null) {
            return str;
        }
        if (r3 != null) {
            return r3.A0L;
        }
        return null;
    }

    public AnonymousClass836() {
        02z r2 = new 02z(new AnonymousClass831(0sn.A00, false));
        this.A02 = r2;
        05F A032 = 10b.A03(r2);
        this.A03 = A032;
        this.A01 = new AnonymousClass837(this, r2);
        this.A00 = C226292g8.A00(19B.A00, A032);
    }
}
