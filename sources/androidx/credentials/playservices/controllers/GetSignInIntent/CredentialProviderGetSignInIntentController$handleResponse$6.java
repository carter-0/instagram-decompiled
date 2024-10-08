package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.0Yg;
import X.AnonymousClass7TG;
import X.C62320sa;
import X.QB8;

public final class CredentialProviderGetSignInIntentController$handleResponse$6 extends 0Yg implements C62320sa {
    public final /* synthetic */ QB8 $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$6(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, QB8 qb8) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = qb8;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$6$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, QB8 qb8) {
        AnonymousClass7TG.A1N(credentialProviderGetSignInIntentController, qb8);
        credentialProviderGetSignInIntentController.getCallback().DCo(qb8);
    }
}
