package X;

public abstract class RTZ {
    public static final C10910S0l A00(C307896Rx r2, AnonymousClass6Tm r3) {
        String obj;
        C276544tV A0O = DbY.A0O(r3);
        C307786Rm r0 = r2.A03;
        if (r0 != null) {
            Object A06 = C307476Qg.A06(r0, A0O);
            String str = "";
            if (!(A06 instanceof C52706GbJ)) {
                return null;
            }
            CharSequence A00 = ((C52706GbJ) A06).A00();
            if (!(A00 == null || (obj = A00.toString()) == null)) {
                str = obj;
            }
            return new C10910S0l(str);
        }
        throw AnonymousClass7TE.A0w("Required value was null.");
    }
}
