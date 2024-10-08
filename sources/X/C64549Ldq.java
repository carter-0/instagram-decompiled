package X;

import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Ldq  reason: case insensitive filesystem */
public final class C64549Ldq implements C66429MRj {
    public final /* synthetic */ C63882LAl A00;
    public final /* synthetic */ C47522E6i A01;

    public final void DkF(AnonymousClass3YP r4) {
        0qQ.A0B(r4, 0);
        if (r4 == AnonymousClass3YP.SHARING) {
            IgdsButton igdsButton = this.A00.A06;
            igdsButton.setLoading(true);
            igdsButton.setEnabled(false);
        } else if (r4 == AnonymousClass3YP.SHARED) {
            this.A00.A00.setVisibility(8);
            this.A01.A04();
        } else if (r4 == AnonymousClass3YP.NOT_SHARED) {
            JTT.A1N(this.A00.A06);
        }
    }

    public C64549Ldq(C63882LAl lAl, C47522E6i e6i) {
        this.A00 = lAl;
        this.A01 = e6i;
    }
}
