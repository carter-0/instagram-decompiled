package androidx.credentials.playservices.controllers.BeginSignIn;

import X.0Yg;
import X.0rm;
import X.AnonymousClass7TG;
import X.C62320sa;

public final class CredentialProviderBeginSignInController$handleResponse$4 extends 0Yg implements C62320sa {
    public final /* synthetic */ 0rm $exception;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, 0rm r3) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$exception = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$4$$ExternalSyntheticLambda0(this.this$0, this.$exception));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, 0rm r2) {
        AnonymousClass7TG.A1N(credentialProviderBeginSignInController, r2);
        credentialProviderBeginSignInController.getCallback().DCo(r2.A00);
    }
}
