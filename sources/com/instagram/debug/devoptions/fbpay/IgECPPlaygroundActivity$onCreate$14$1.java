package com.instagram.debug.devoptions.fbpay;

import X.AnonymousClass0fD;
import android.view.View;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

public final class IgECPPlaygroundActivity$onCreate$14$1 implements View.OnClickListener {
    public final /* synthetic */ FBPayAnimationButton $payButton;

    public IgECPPlaygroundActivity$onCreate$14$1(FBPayAnimationButton fBPayAnimationButton) {
        this.$payButton = fBPayAnimationButton;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1867217143);
        FBPayAnimationButton fBPayAnimationButton = this.$payButton;
        CharSequence text = fBPayAnimationButton.getButtonView().getText();
        FBPayAnimationButton.A01(fBPayAnimationButton);
        fBPayAnimationButton.removeAllViews();
        FBPayAnimationButton.A00(fBPayAnimationButton);
        fBPayAnimationButton.getButtonView().setText(text);
        fBPayAnimationButton.setFocusable(false);
        fBPayAnimationButton.setImportantForAccessibility(2);
        fBPayAnimationButton.getProgressMsgView().setImportantForAccessibility(2);
        AnonymousClass0fD.A0C(-1588239294, A05);
    }
}
