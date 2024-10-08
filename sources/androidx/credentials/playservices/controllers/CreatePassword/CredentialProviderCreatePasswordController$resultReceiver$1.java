package androidx.credentials.playservices.controllers.CreatePassword;

import X.0qQ;
import X.AnonymousClass00P;
import X.C13683Tez;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$resultReceiver$1 extends ResultReceiver {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    public void onReceiveResult(int i, Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        0qQ.A0B(bundle, 1);
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            str = "executor";
        } else {
            C13683Tez tez = credentialProviderCreatePasswordController.callback;
            if (tez == null) {
                str = "callback";
            } else if (!credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(bundle2, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, tez, credentialProviderCreatePasswordController.cancellationSignal)) {
                this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i);
                return;
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$resultReceiver$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Handler handler) {
        super(handler);
        this.this$0 = credentialProviderCreatePasswordController;
    }
}
