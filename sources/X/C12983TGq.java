package X;

import com.facebookpay.widget.button.FBPayButton;

/* renamed from: X.TGq  reason: case insensitive filesystem */
public final class C12983TGq implements Runnable {
    public final /* synthetic */ C11510SbX A00;
    public final /* synthetic */ C8131QhP A01;

    public C12983TGq(C11510SbX sbX, C8131QhP qhP) {
        this.A01 = qhP;
        this.A00 = sbX;
    }

    public final void run() {
        C8131QhP qhP = this.A01;
        FBPayButton fBPayButton = qhP.A0Q;
        if (fBPayButton != null) {
            if (fBPayButton.getViewTreeObserver().isAlive()) {
                FBPayButton fBPayButton2 = qhP.A0Q;
                if (fBPayButton2 != null) {
                    fBPayButton2.getViewTreeObserver().removeOnDrawListener(this.A00);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("continueButton");
        throw AnonymousClass00P.createAndThrow();
    }
}
