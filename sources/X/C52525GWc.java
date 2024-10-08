package X;

/* renamed from: X.GWc  reason: case insensitive filesystem */
public final class C52525GWc implements C229132mt {
    public final /* synthetic */ AnonymousClass32L A00;

    public C52525GWc(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final void ACw() {
        String str;
        GWY gwy = this.A00.A0J;
        if (gwy == null) {
            str = "viewController";
        } else {
            GXP gxp = gwy.A09.A00;
            if (gxp == null) {
                str = "feedNetworkSource";
            } else if (gxp.A00.A06()) {
                GWY.A00(gwy, AnonymousClass05K.A0N, false, false, gwy.A0I, false, false);
                return;
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
