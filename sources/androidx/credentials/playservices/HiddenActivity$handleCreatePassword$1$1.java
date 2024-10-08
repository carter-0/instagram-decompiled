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
import com.google.android.gms.auth.api.identity.SavePasswordResult;

public final class HiddenActivity$handleCreatePassword$1$1 extends 0Yg implements 0sP {
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ HiddenActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleCreatePassword$1$1(HiddenActivity hiddenActivity, int i) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i;
    }

    public final void invoke(SavePasswordResult savePasswordResult) {
        try {
            HiddenActivity hiddenActivity = this.this$0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(savePasswordResult.A00.getIntentSender(), this.$requestCode, (Intent) null, 0, 0, 0, (Bundle) null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity2 = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            0qQ.A0A(resultReceiver);
            hiddenActivity2.setupFailure(resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, AnonymousClass7TF.A0m("During save password, found UI intent sender failure: ", e));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SavePasswordResult) obj);
        return C60340gF.A00;
    }
}
