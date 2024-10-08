package X;

/* renamed from: X.Tye  reason: case insensitive filesystem */
public final /* synthetic */ class C14574Tye implements X5N {
    public final /* synthetic */ C14556TyL A00;

    public /* synthetic */ C14574Tye(C14556TyL tyL) {
        this.A00 = tyL;
    }

    public final void onCancel() {
        X22 x22;
        C14556TyL tyL = this.A00;
        if (tyL.A09 != C46626Di6.FULL_SCREEN || (x22 = tyL.A01) == null) {
            2Tb r0 = tyL.A07;
            if (r0 != null) {
                r0.dismiss();
            }
        } else {
            x22.D9W();
        }
        tyL.A00 = 6;
    }
}
