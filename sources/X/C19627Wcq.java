package X;

/* renamed from: X.Wcq  reason: case insensitive filesystem */
public final class C19627Wcq implements X51 {
    public final /* synthetic */ C15334Uaj A00;

    public C19627Wcq(C15334Uaj uaj) {
        this.A00 = uaj;
    }

    public final void DZu() {
        C249713kF r4 = C249713kF.A00;
        C15334Uaj uaj = this.A00;
        C17940ViV A0A = r4.A0A(uaj.requireActivity(), AnonymousClass7TE.A0l(uaj.A0G), "shop_manager_add_products");
        String str = uaj.A0D;
        if (str == null) {
            0qQ.A0F("waterfallId");
            throw AnonymousClass00P.createAndThrow();
        }
        A0A.A05 = str;
        A0A.A06 = false;
        A0A.A08 = false;
        A0A.A07 = true;
        A0A.A03 = 1001;
        A0A.A00 = uaj;
        A0A.A00();
    }
}
