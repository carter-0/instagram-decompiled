package X;

import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

public final class PQO implements C295005nO {
    public final /* synthetic */ OFN A00;
    public final /* synthetic */ C71091OcD A01;
    public final /* synthetic */ String A02;

    public PQO(OFN ofn, C71091OcD ocD, String str) {
        this.A01 = ocD;
        this.A00 = ofn;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void onFinish() {
        C71091OcD ocD = this.A01;
        OFN ofn = this.A00;
        ? r5 = ofn.A02;
        ConstrainedImageView constrainedImageView = ofn.A03;
        String str = this.A02;
        C71091OcD.A02(ocD, str, ocD.A03);
        C60957JuF A022 = ocD.A0H.A02(str);
        if (A022 != null) {
            LNx lNx = ocD.A0G;
            if (lNx != null) {
                lNx.A01(AnonymousClass7TE.A1I(new C61030JvU(r5, constrainedImageView, A022, str)));
                return;
            }
            return;
        }
        r5.setAlpha(1.0f);
        C294975nL A0c = JTP.A0c(r5, 1);
        A0c.A0U(0.0f, 1.0f, -1.0f);
        A0c.A0V(0.0f, 1.0f, -1.0f);
        A0c.A0C(100).A0H();
    }
}
