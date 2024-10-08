package X;

/* renamed from: X.Jiu  reason: case insensitive filesystem */
public final class C60296Jiu extends 2YL {
    public final C319836rJ A00;
    public final AnonymousClass0r6 A01;
    public final 05G A02;

    public C60296Jiu(C319836rJ r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        02z A10 = C51970G9q.A10(false);
        this.A02 = A10;
        this.A01 = 10b.A03(A10);
    }

    public static final void A01(C60296Jiu jiu) {
        boolean A1a;
        05G r2 = jiu.A02;
        C319836rJ r1 = jiu.A00;
        Boolean bool = (Boolean) r1.A00("IS_PROMO_VIDEO");
        if (bool != null) {
            A1a = bool.booleanValue();
        } else {
            Object A002 = r1.A00("IS_ORIGINAL_MEDIA_PROMO_VIDEO");
            if (A002 != null) {
                A1a = AnonymousClass7TE.A1a(A002);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        AnonymousClass7TF.A1O(r2, A1a);
    }

    public static C319836rJ A00(AnonymousClass0eM r0) {
        return ((C60296Jiu) r0.getValue()).A00;
    }
}
