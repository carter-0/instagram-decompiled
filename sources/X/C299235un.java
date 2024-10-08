package X;

import java.util.Set;

/* renamed from: X.5un  reason: invalid class name and case insensitive filesystem */
public final class C299235un implements C250603lj {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ C229312nB A02;

    public C299235un(C307786Rm r1, C276544tV r2, C229312nB r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        01c r2 = C299225um.A00;
        C276544tV r4 = this.A01;
        Set<C276544tV> set = (Set) r2.A05((long) r4.A03);
        if (set != null) {
            for (C276544tV r5 : set) {
                String str = "";
                String A0K = r5.A0K(35);
                if (A0K != null) {
                    str = A0K;
                }
                C229312nB r7 = this.A02;
                1Bk r22 = r7.A00;
                C294085lp r23 = new C294085lp(r11, r12, Long.valueOf(r22.A04(str, -2147483648L)), r22.A0F(str));
                C307786Rm r3 = this.A00;
                0t0 A012 = AnonymousClass0eN.A01(new AnonymousClass9M0(41, r3, r23));
                if (r12.CEk(r11) == AnonymousClass05K.A00) {
                    r7.A02(str);
                    C277014uI A0A = r5.A0A(36);
                    if (A0A != null) {
                        Object value = A012.getValue();
                        0qQ.A07(value);
                        C307886Rw.A03(r3, r4, (AnonymousClass6Tm) value, A0A);
                    }
                }
                C277014uI A0A2 = r5.A0A(38);
                if (A0A2 != null && r12.CEk(r11) == AnonymousClass05K.A0C) {
                    Object value2 = A012.getValue();
                    0qQ.A07(value2);
                    C307886Rw.A03(r3, r4, (AnonymousClass6Tm) value2, A0A2);
                }
                C277014uI A0A3 = r5.A0A(40);
                if (A0A3 != null && r12.CEk(r11) == AnonymousClass05K.A01) {
                    Object value3 = A012.getValue();
                    0qQ.A07(value3);
                    C307886Rw.A03(r3, r4, (AnonymousClass6Tm) value3, A0A3);
                }
            }
        }
    }
}
