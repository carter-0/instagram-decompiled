package androidx.credentials.playservices.controllers.BeginSignIn;

import X.0Yg;
import X.AnonymousClass7TG;
import X.C10144RnL;
import X.C62320sa;

public final class CredentialProviderBeginSignInController$handleResponse$3 extends 0Yg implements C62320sa {
    public final /* synthetic */ C10144RnL $response;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C10144RnL rnL) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$response = rnL;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$3$$ExternalSyntheticLambda0(this.this$0, this.$response));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C10144RnL rnL) {
        AnonymousClass7TG.A1N(credentialProviderBeginSignInController, rnL);
        credentialProviderBeginSignInController.getCallback().onResult(rnL);
    }
}
