package X;

import android.view.ViewPropertyAnimator;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* renamed from: X.IfF  reason: case insensitive filesystem */
public final class C57712IfF implements Runnable {
    public final /* synthetic */ FBPayAnimationButton A00;

    public C57712IfF(FBPayAnimationButton fBPayAnimationButton) {
        this.A00 = fBPayAnimationButton;
    }

    public final void run() {
        FBPayAnimationButton fBPayAnimationButton = this.A00;
        if (FBPayAnimationButton.A0D) {
            ViewPropertyAnimator withStartAction = fBPayAnimationButton.getProgressMsgView().animate().setStartDelay(3600).setDuration(3000).withStartAction(new C57710IfD(fBPayAnimationButton));
            fBPayAnimationButton.A02 = withStartAction;
            if (withStartAction != null) {
                withStartAction.start();
            }
        }
    }
}
