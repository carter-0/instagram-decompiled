package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.03J;
import X.0sL;
import X.C8988RKe;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

public final /* synthetic */ class CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 extends 03J implements 0sL {
    public CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    public final C8988RKe invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
