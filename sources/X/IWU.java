package X;

public final class IWU implements C230922qa {
    public final /* synthetic */ AnonymousClass32F A00;

    public final void Ds7(C300555xO r3) {
        String str;
        0qQ.A0B(r3, 0);
        AnonymousClass32F r0 = this.A00;
        C230882qT r1 = r0.A06;
        if (r1 == null) {
            str = "quickPromotionTooltipsController";
        } else {
            C231002qi r02 = r0.A05;
            if (r02 == null) {
                str = "quickPromotionDelegate";
            } else {
                r1.A01(r02, r3);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public IWU(AnonymousClass32F r1) {
        this.A00 = r1;
    }

    public final void DVk(C300555xO r2) {
        C230882qT r0 = this.A00.A06;
        if (r0 == null) {
            0qQ.A0F("quickPromotionTooltipsController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A02 = r2;
        }
    }
}
