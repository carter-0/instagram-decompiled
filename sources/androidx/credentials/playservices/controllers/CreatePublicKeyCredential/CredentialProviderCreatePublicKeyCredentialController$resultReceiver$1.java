package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.0qQ;
import X.AnonymousClass00P;
import X.C13683Tez;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 extends ResultReceiver {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    public void onReceiveResult(int i, Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        0qQ.A0B(bundle, 1);
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            str = "executor";
        } else {
            C13683Tez tez = credentialProviderCreatePublicKeyCredentialController.callback;
            if (tez == null) {
                str = "callback";
            } else if (!credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(bundle2, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, tez, credentialProviderCreatePublicKeyCredentialController.cancellationSignal)) {
                this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
                return;
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Handler handler) {
        super(handler);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }
}
