package X;

public abstract class SQA {
    public static final C8295Qnb A02(1MD r2, SOC soc, AnonymousClass5A3 r4, C11214SFo sFo) {
        1MD r1 = r2;
        SOC soc2 = soc;
        AnonymousClass5A3 r3 = r4;
        C51974G9v.A1O(r3, r1, soc2, sFo);
        return new C8295Qnb(r1, soc2, r3, sFo, 1);
    }

    public static final C8295Qnb A03(SOC soc, AnonymousClass5A3 r4, C11214SFo sFo) {
        SOC soc2 = soc;
        AnonymousClass5A3 r3 = r4;
        AnonymousClass7TG.A1T(r3, soc2, sFo);
        return new C8295Qnb(C11599Scy.A00, soc2, r3, sFo, 0);
    }

    public static C7422QCn A00(1MD r0, SIS sis, AnonymousClass5A3 r2, C11214SFo sFo) {
        SOC soc = sis.A00;
        C8295Qnb A02 = A02(r0, soc, r2, sFo);
        SSC.A05(A02);
        C7422QCn qCn = A02.A03;
        SIS.A00(qCn, soc);
        return qCn;
    }

    public static C7422QCn A01(C11214SFo sFo) {
        AnonymousClass5A3 A06 = AnonymousClass2E0.A06();
        0qQ.A07(A06);
        SOC A04 = AnonymousClass2E0.A04();
        0qQ.A07(A04);
        C8295Qnb A03 = A03(A04, A06, sFo);
        SSC.A05(A03);
        return A03.A03;
    }
}
