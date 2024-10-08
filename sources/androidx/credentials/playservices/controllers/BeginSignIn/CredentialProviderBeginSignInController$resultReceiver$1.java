package androidx.credentials.playservices.controllers.BeginSignIn;

import X.0qQ;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

public final class CredentialProviderBeginSignInController$resultReceiver$1 extends ResultReceiver {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    public void onReceiveResult(int i, Bundle bundle) {
        0qQ.A0B(bundle, 1);
        CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        if (!credentialProviderBeginSignInController.maybeReportErrorFromResultReceiver(bundle, new CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), credentialProviderBeginSignInController.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
            this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$resultReceiver$1(CredentialProviderBeginSignInController credentialProviderBeginSignInController, Handler handler) {
        super(handler);
        this.this$0 = credentialProviderBeginSignInController;
    }
}
