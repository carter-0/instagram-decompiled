package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.0Yg;
import X.0qQ;
import X.C62320sa;
import X.QB8;
import androidx.credentials.playservices.controllers.CredentialProviderController;

public final class CredentialProviderGetSignInIntentController$invokePlayServices$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        0qQ.A0B(credentialProviderGetSignInIntentController, 0);
        credentialProviderGetSignInIntentController.getCallback().DCo(QB8.A00(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$invokePlayServices$2$$ExternalSyntheticLambda0(this.this$0));
    }
}
