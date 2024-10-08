package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.0Yg;
import X.0rm;
import X.AnonymousClass7TG;
import X.C62320sa;

public final class CredentialProviderGetSignInIntentController$handleResponse$4 extends 0Yg implements C62320sa {
    public final /* synthetic */ 0rm $exception;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$4(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, 0rm r3) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$exception = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$4$$ExternalSyntheticLambda0(this.this$0, this.$exception));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, 0rm r2) {
        AnonymousClass7TG.A1N(credentialProviderGetSignInIntentController, r2);
        credentialProviderGetSignInIntentController.getCallback().DCo(r2.A00);
    }
}
