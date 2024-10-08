package X;

public abstract class RTX {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        C307706Rd r3;
        C307786Rm r52 = r5.A03;
        if (r52 != null) {
            AnonymousClass6RZ A04 = C307476Qg.A04(r52, "media_store");
            if (!(A04 instanceof C307706Rd) || (r3 = (C307706Rd) A04) == null) {
                1Kn.A02(C273654mx.A00(569), "Failed to load albums: MediaStore data module is not found.");
                return null;
            }
            String A0g = DbY.A0g(r6);
            0qQ.A0B(A0g, 1);
            r3.A02.execute(new TIJ(r3, r52, A0g));
        }
        return null;
    }
}
