package androidx.credentials.playservices.controllers.CreatePassword;

import X.03J;
import X.0sL;
import X.C8987RKd;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

public final /* synthetic */ class CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 extends 03J implements 0sL {
    public CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    public final C8987RKd invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
