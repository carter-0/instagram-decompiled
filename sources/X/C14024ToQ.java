package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.ToQ  reason: case insensitive filesystem */
public final class C14024ToQ implements C250603lj {
    public final C14167Tr5 A00;
    public final C307786Rm A01;
    public final C14166Tr4 A02;

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        C14166Tr4 tr4 = this.A02;
        Set<C276544tV> set = (Set) tr4.A01.A01.get(tr4.A00);
        if (set != null) {
            for (C276544tV r3 : set) {
                0qQ.A0B(r3, 0);
                String str = "";
                String A0K = r3.A0K(38);
                if (A0K != null) {
                    str = A0K;
                }
                List list = r3.A09;
                if (r3.A0R(51, true) && list != null && !list.isEmpty()) {
                    String A002 = C7283Q2i.A00(AnonymousClass05K.A01, list);
                    0qQ.A07(A002);
                    str = C7283Q2i.A01(str, A002);
                    0qQ.A0A(str);
                }
                C14167Tr5 tr5 = this.A00;
                0qQ.A0B(str, 0);
                C229312nB r8 = tr5.A00;
                1Bk r6 = r8.A00;
                C294085lp r62 = new C294085lp(r11, r12, Long.valueOf(r6.A04(str, -2147483648L)), r6.A0F(str));
                C277014uI A0A = r3.A0A(35);
                if (r12.CEk(r11) == AnonymousClass05K.A00) {
                    r8.A02(str);
                    if (A0A != null) {
                        C308276Tl r0 = new C308276Tl();
                        r0.A03(r62, 0);
                        C307786Rm r1 = this.A01;
                        r0.A03(r1, 1);
                        C307886Rw.A03(r1, r3, r0.A00(), A0A);
                    }
                }
                C277014uI A0A2 = r3.A0A(36);
                if (A0A2 != null && r12.CEk(r11) == AnonymousClass05K.A0C) {
                    C308276Tl r02 = new C308276Tl();
                    r02.A03(r62, 0);
                    C307786Rm r13 = this.A01;
                    r02.A03(r13, 1);
                    C307886Rw.A03(r13, r3, r02.A00(), A0A2);
                }
                C277014uI A0A3 = r3.A0A(40);
                if (A0A3 != null && r12.CEk(r11) == AnonymousClass05K.A01) {
                    C308276Tl r03 = new C308276Tl();
                    r03.A03(r62, 0);
                    C307786Rm r14 = this.A01;
                    r03.A03(r14, 1);
                    C307886Rw.A03(r14, r3, r03.A00(), A0A3);
                }
            }
        }
    }

    public C14024ToQ(C14166Tr4 tr4, C14167Tr5 tr5, C307786Rm r3) {
        this.A01 = r3;
        this.A00 = tr5;
        this.A02 = tr4;
    }
}
