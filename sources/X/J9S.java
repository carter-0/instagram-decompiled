package X;

import androidx.compose.ui.Modifier;

public final class J9S extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9S(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        super(2);
        this.A00 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A06 = str;
        this.A05 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.A00;
        C286575Wy r13 = (C286575Wy) obj;
        int A0B = C51968G9o.A0B(obj2);
        if (i2 != 0) {
            if (A0B != 2 || !r13.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(1804046994, "com.instagram.remindme.savesheet.ui.MediaReminderViewBinder.bind.<anonymous>.<anonymous> (MediaReminderViewBinder.kt:36)");
                }
                String str = this.A05;
                0lg r5 = (0lg) this.A03;
                C286885Ye.A01(r13, r5, str, AnonymousClass5PI.A01(r13, new J9S(this.A04, this.A01, r5, this.A02, this.A06, str, 0), 1791554423));
                if (0fL.A02()) {
                    i = -1217653345;
                }
                return C60340gF.A00;
            }
            r13.Evl();
            return C60340gF.A00;
        }
        if (A0B != 2 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-98856159, "com.instagram.remindme.savesheet.ui.MediaReminderViewBinder.bind.<anonymous>.<anonymous>.<anonymous> (MediaReminderViewBinder.kt:37)");
            }
            C55814Hnu hnu = (C55814Hnu) this.A04;
            C53005Ggw ggw = hnu.A02;
            C270284gU A022 = AnonymousClass6FW.A02(r13, ggw.A07, 0);
            JMC jmc = ((C53268GlG) A022.getValue()).A00;
            r13.ExS(-1658134060);
            if (!0qQ.A0K(jmc, C57316IWz.A00)) {
                if (0qQ.A0K(jmc, IX0.A00)) {
                    long j = C55351HgJ.A00;
                    r13.ExS(-1658127564);
                    Object obj3 = this.A01;
                    boolean AGw = r13.AGw(obj3);
                    Object obj4 = this.A03;
                    boolean A1U = C51966G9m.A1U(r13, obj4, AGw);
                    Object obj5 = this.A02;
                    boolean A1U2 = C51966G9m.A1U(r13, obj5, A1U);
                    String str2 = this.A06;
                    boolean A1Z = C51965G9l.A1Z(r13, str2, A1U2);
                    String str3 = this.A05;
                    boolean A1Z2 = C51965G9l.A1Z(r13, str3, A1Z);
                    Object ECw = r13.ECw();
                    if (A1Z2 || ECw == AnonymousClass5XT.A00) {
                        ECw = new MJJ(obj3, obj4, obj5, str2, str3, 1);
                        r13.FLL(ECw);
                    }
                    C51965G9l.A1X(r13, false);
                    0qQ.A0B(ECw, 1);
                    AnonymousClass7TE.A1Z(new MGA(ECw, (AnonymousClass4D7) null, 24, j), C318116oQ.A00(ggw));
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
            C286565Wx r52 = (C286565Wx) r13;
            C53268GlG glG = (C53268GlG) C51967G9n.A0o(r52, A022, false);
            Modifier A0U = C51969G9p.A0U();
            boolean A1Z3 = C51967G9n.A1Z(r13, hnu, -1658119103);
            Object ECw2 = r13.ECw();
            if (A1Z3 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C51975G9x.A0u(r13, hnu, 22);
            }
            C62320sa A19 = C51968G9o.A19(r52, ECw2);
            boolean A1Z4 = C51967G9n.A1Z(r13, hnu, -1658116853);
            Object obj6 = this.A01;
            boolean A1U3 = C51966G9m.A1U(r13, obj6, A1Z4);
            Object ECw3 = r13.ECw();
            if (A1U3 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new MJ8(46, obj6, hnu);
                r13.FLL(ECw3);
            }
            C55102HcB.A00(r13, A0U, glG, A19, C51965G9l.A0y(r52, ECw3, false), 48, 0);
            if (0fL.A02()) {
                i = -1537911781;
            }
            return C60340gF.A00;
        }
        r13.Evl();
        return C60340gF.A00;
        0fL.A00(i);
        return C60340gF.A00;
    }
}
