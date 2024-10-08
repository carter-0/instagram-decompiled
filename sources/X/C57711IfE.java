package X;

import android.content.Context;
import android.widget.TextView;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* renamed from: X.IfE  reason: case insensitive filesystem */
public final class C57711IfE implements Runnable {
    public final /* synthetic */ FBPayAnimationButton A00;

    public C57711IfE(FBPayAnimationButton fBPayAnimationButton) {
        this.A00 = fBPayAnimationButton;
    }

    public final void run() {
        boolean z = FBPayAnimationButton.A0D;
        FBPayAnimationButton fBPayAnimationButton = this.A00;
        if (z) {
            TextView progressMsgView = fBPayAnimationButton.getProgressMsgView();
            Context context = fBPayAnimationButton.getContext();
            DbT.A18(context, progressMsgView, 2131961392);
            fBPayAnimationButton.getProgressMsgView().setTextColor(AnonymousClass2E0.A0A().A03(context, 16));
            return;
        }
        DbT.A18(fBPayAnimationButton.getContext(), fBPayAnimationButton.getProgressMsgView(), 2131961391);
    }
}
