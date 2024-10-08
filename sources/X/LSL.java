package X;

import java.util.List;

public final class LSL {
    public C64087LMf A00;
    public List A01 = AnonymousClass7TE.A1C();
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final double A05;
    public final long A06;
    public final C61262Jzu A07;
    public final C61929KSa A08;
    public final C262224Cq A09;
    public final boolean A0A;

    public LSL(C61262Jzu jzu, C61929KSa kSa, C262224Cq r4, double d, long j, boolean z) {
        0qQ.A0B(r4, 2);
        this.A07 = jzu;
        this.A09 = r4;
        this.A08 = kSa;
        this.A0A = z;
        this.A05 = d;
        this.A06 = j;
    }

    public static final void A00(LSL lsl) {
        if ((!lsl.A0A || lsl.A02) && !lsl.A04) {
            18g A012 = C638918c.A01(C61170le.A00);
            A012.A0O(A012.A02, "ttnc_estimator_prediction_start");
            lsl.A04 = true;
            C61929KSa kSa = lsl.A08;
            if (kSa != null) {
                MPA A002 = MPA.A00(lsl, 9);
                long currentTimeMillis = System.currentTimeMillis();
                KSV ksv = kSa.A01;
                if (ksv == null) {
                    ksv = LT2.A02(kSa, currentTimeMillis);
                }
                MBK mbk = new MBK(A002, 6);
                LDU ldu = new LDU(ksv, ksv, (C62943Kov) null);
                ldu.A00 = mbk;
                ldu.A02.EJc(ldu);
                return;
            }
            A02(lsl, "null_model");
        }
    }

    public static final void A01(LSL lsl, C64087LMf lMf) {
        lsl.A00 = lMf;
        List<C63639L1b> list = lsl.A01;
        for (C63639L1b l1b : list) {
            l1b.A00.invoke(lMf);
        }
        list.clear();
        lsl.A03();
    }

    public static final void A02(LSL lsl, String str) {
        C62880wX r2 = C61170le.A00;
        18g.A05(C638918c.A01(r2).A02, "ttnc_estimator_failure_reason", str);
        18g A012 = C638918c.A01(r2);
        A012.A0O(A012.A02, "ttnc_estimator_prediction_failed");
        A01(lsl, new C64087LMf(-1.0d, -1.0d, -1, false));
    }

    public final void A03() {
        int i;
        C64087LMf lMf;
        String str;
        if (!this.A03 && (i = this.A07.A00) > 0 && (lMf = this.A00) != null) {
            long j = (long) i;
            boolean z = true;
            boolean A1R = AnonymousClass7TF.A1R((lMf.A00 > lMf.A01 ? 1 : (lMf.A00 == lMf.A01 ? 0 : -1)));
            boolean z2 = false;
            if (j >= lMf.A02) {
                z2 = true;
            }
            if (A1R != z2) {
                z = false;
            }
            C62880wX r2 = C61170le.A00;
            18g.A06(C638918c.A01(r2).A02, "ttnc_estimator_correct", z);
            18g A012 = C638918c.A01(r2);
            if (z2) {
                str = "ttnc_estimator_correct_slow";
            } else {
                str = "ttnc_estimator_correct_fast";
            }
            18g.A06(A012.A02, str, z);
            this.A03 = true;
        }
    }
}
