package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.PYO  reason: case insensitive filesystem */
public final class C73184PYO implements Runnable {
    public final /* synthetic */ NUB A00;
    public final /* synthetic */ boolean A01;

    public C73184PYO(NUB nub, boolean z) {
        this.A00 = nub;
        this.A01 = z;
    }

    public final void run() {
        NUB nub = this.A00;
        IgdsBottomButtonLayout igdsBottomButtonLayout = nub.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(this.A01);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = nub.A00;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setSecondaryButtonEnabled(!this.A01);
        }
    }
}
