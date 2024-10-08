package X;

public abstract class V55 {
    public static final Boolean A00(C307896Rx r0, AnonymousClass6Tm r1) {
        boolean z;
        C276544tV r12 = (C276544tV) r1.A01();
        C307786Rm r02 = r0.A03;
        if (r02 != null) {
            C18434Vrd vrd = (C18434Vrd) C13988Tno.A0V(r02, r12);
            C226492gu r03 = vrd.A00;
            if (r03 != null) {
                z = r03.isPlaying();
            } else {
                z = vrd.A01.A04;
            }
            return Boolean.valueOf(z);
        }
        throw AnonymousClass7TE.A0y();
    }
}
