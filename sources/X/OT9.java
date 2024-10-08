package X;

public final class OT9 {
    public final OJa A00;
    public final AnonymousClass0eK A01;

    public static final C254703su A00(OT9 ot9, String str, String str2, boolean z) {
        C333517Zg A0V = C66580MXl.A0V(ot9.A01);
        C376179Gx r1 = C376179Gx.PSEUDO_GET_DIRECT_MESSAGE_OBJECT_FROM_DATASOURCE;
        C254703su r3 = null;
        if (A0V.AH1(r1)) {
            AnonymousClass7ZY BSN = A0V.BSN();
            0qQ.A0C(BSN, "null cannot be cast to non-null type com.instagram.direct.messagethread.DirectMessageStoreImpl");
            AnonymousClass7LQ BSO = ((AnonymousClass7ZX) BSN).BSO(str);
            if ((BSO == null || (r3 = BSO.A0e) == null) && str2 != null) {
                if (z) {
                    ot9.A00.A00(002.A0R(str2, ": null_direct_message"));
                }
                DbT.A1Q(0wj.A01, 002.A0R(str2, ": Message is null"), 20134884);
            }
        } else {
            C69932NuY.A00(r1);
            if (z) {
                ot9.A00.A00(002.A0R(str2, ": pseudo_capability_disabled"));
                return null;
            }
        }
        return r3;
    }

    public OT9(OJa oJa, AnonymousClass0eK r2) {
        AnonymousClass7TG.A1O(r2, oJa);
        this.A01 = r2;
        this.A00 = oJa;
    }
}
