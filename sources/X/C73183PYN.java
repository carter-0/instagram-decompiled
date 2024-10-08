package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.PYN  reason: case insensitive filesystem */
public final class C73183PYN implements Runnable {
    public final /* synthetic */ NUA A00;
    public final /* synthetic */ boolean A01;

    public C73183PYN(NUA nua, boolean z) {
        this.A00 = nua;
        this.A01 = z;
    }

    public final void run() {
        NUA nua = this.A00;
        IgdsBottomButtonLayout igdsBottomButtonLayout = nua.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(this.A01);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = nua.A00;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setSecondaryButtonEnabled(!this.A01);
        }
    }
}
