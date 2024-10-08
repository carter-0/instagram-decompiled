package androidx.credentials.playservices;

import X.0Yg;
import X.0qQ;
import X.0sP;
import X.AnonymousClass7TF;
import X.C60340gF;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.auth.api.identity.BeginSignInResult;

public final class HiddenActivity$handleBeginSignIn$1$1 extends 0Yg implements 0sP {
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ HiddenActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleBeginSignIn$1$1(HiddenActivity hiddenActivity, int i) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i;
    }

    public final void invoke(BeginSignInResult beginSignInResult) {
        try {
            HiddenActivity hiddenActivity = this.this$0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(beginSignInResult.A00.getIntentSender(), this.$requestCode, (Intent) null, 0, 0, 0, (Bundle) null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity2 = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            0qQ.A0A(resultReceiver);
            hiddenActivity2.setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, AnonymousClass7TF.A0m("During begin sign in, one tap ui intent sender failure: ", e));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BeginSignInResult) obj);
        return C60340gF.A00;
    }
}
