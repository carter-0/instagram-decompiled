package X;

public final class FAL {
    public static int A03 = 2;
    public C47796EHh A00;
    public final AnonymousClass4DH A01;
    public final 0lg A02;

    public static void A00(FAL fal) {
        AnonymousClass1qB r0 = AnonymousClass1qB.$redex_init_class;
        AnonymousClass1qC r02 = AnonymousClass1qC.$redex_init_class;
        if (!AnonymousClass1qB.A00()) {
            0qv r1 = 0qv.A02;
            AnonymousClass4DH r4 = fal.A01;
            String replaceAll = r1.A05(r4.getContext()).replaceAll("-", "");
            1NY A0O = DbU.A0O(fal.A02);
            A0O.A0A("si/fetch_headers/");
            A0O.A9m("challenge_type", "signup");
            A0O.A9m("guid", replaceAll);
            1OC A0S = DbT.A0S(A0O, Dw9.class, F7E.class);
            A0S.A00 = new EBW(fal);
            r4.schedule(A0S);
        }
    }

    public FAL(AnonymousClass4DH r1, 0lg r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
