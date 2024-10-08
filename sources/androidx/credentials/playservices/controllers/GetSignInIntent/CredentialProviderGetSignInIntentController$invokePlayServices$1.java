package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.0Yg;
import X.AnonymousClass7TG;
import X.C62320sa;

public final class CredentialProviderGetSignInIntentController$invokePlayServices$1 extends 0Yg implements C62320sa {
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$1(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Exception exc) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = exc;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$invokePlayServices$1$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Exception exc) {
        AnonymousClass7TG.A1N(credentialProviderGetSignInIntentController, exc);
        credentialProviderGetSignInIntentController.getCallback().DCo(exc);
    }
}
