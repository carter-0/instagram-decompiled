package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.0qQ;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

public final class CredentialProviderGetSignInIntentController$resultReceiver$1 extends ResultReceiver {
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    public void onReceiveResult(int i, Bundle bundle) {
        0qQ.A0B(bundle, 1);
        CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        if (!credentialProviderGetSignInIntentController.maybeReportErrorFromResultReceiver(bundle, new CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), credentialProviderGetSignInIntentController.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
            this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$resultReceiver$1(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Handler handler) {
        super(handler);
        this.this$0 = credentialProviderGetSignInIntentController;
    }
}
