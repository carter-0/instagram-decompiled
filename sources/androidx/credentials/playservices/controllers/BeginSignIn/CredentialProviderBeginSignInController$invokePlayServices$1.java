package androidx.credentials.playservices.controllers.BeginSignIn;

import X.0Yg;
import X.0qQ;
import X.C62320sa;
import X.QB8;
import androidx.credentials.playservices.controllers.CredentialProviderController;

public final class CredentialProviderBeginSignInController$invokePlayServices$1 extends 0Yg implements C62320sa {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$invokePlayServices$1(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        0qQ.A0B(credentialProviderBeginSignInController, 0);
        credentialProviderBeginSignInController.getCallback().DCo(QB8.A00(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$invokePlayServices$1$$ExternalSyntheticLambda0(this.this$0));
    }
}
