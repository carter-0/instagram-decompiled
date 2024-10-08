package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.0Yg;
import X.AnonymousClass7TG;
import X.C10144RnL;
import X.C62320sa;

public final class CredentialProviderGetSignInIntentController$handleResponse$3 extends 0Yg implements C62320sa {
    public final /* synthetic */ C10144RnL $response;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C10144RnL rnL) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = rnL;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$3$$ExternalSyntheticLambda0(this.this$0, this.$response));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C10144RnL rnL) {
        AnonymousClass7TG.A1N(credentialProviderGetSignInIntentController, rnL);
        credentialProviderGetSignInIntentController.getCallback().onResult(rnL);
    }
}
