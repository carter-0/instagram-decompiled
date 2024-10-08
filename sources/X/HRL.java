package X;

public abstract class HRL {
    public static final void A00(C304786Ff r12, C289315dO r13, AnonymousClass5Q3 r14, C289645dx r15, float f) {
        C3018060d r0;
        C289315dO r1 = r13;
        C304786Ff r6 = r12;
        AnonymousClass5Q3 r5 = r14;
        C289645dx r8 = r15;
        float f2 = f;
        if (r13 instanceof C289305dN) {
            AnonymousClass5VN r3 = ((C289305dN) r1).A00;
            float f3 = r3.A01;
            float f4 = r3.A03;
            r5.AQr(r6, (C288195bW) null, r8, f2, 3, C289325dP.A00(f3, f4), C288015bE.A00(r3.A02 - f3, r3.A00 - f4));
            return;
        }
        if (r13 instanceof C3018460h) {
            C3018460h r16 = (C3018460h) r1;
            r0 = r16.A01;
            if (r0 == null) {
                AnonymousClass6GT r4 = r16.A00;
                long j = r4.A04;
                long j2 = AnonymousClass6GS.A00;
                float A01 = C51971G9r.A01(j);
                float f5 = r4.A01;
                float f6 = r4.A03;
                r5.AQu(r6, (C288195bW) null, r8, f2, 3, C289325dP.A00(f5, f6), C288015bE.A00(r4.A02 - f5, r4.A00 - f6), AnonymousClass6GR.A00(A01, A01));
                return;
            }
        } else if (r13 instanceof C289335dQ) {
            r0 = ((C289335dQ) r1).A00;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r14.AQm(r12, (C288195bW) null, r0, r15, f2, 3);
    }
}
