package androidx.credentials.playservices.controllers.BeginSignIn;

import X.0Yg;
import X.AnonymousClass7TG;
import X.C62320sa;
import X.QB8;

public final class CredentialProviderBeginSignInController$handleResponse$6 extends 0Yg implements C62320sa {
    public final /* synthetic */ QB8 $e;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$6(CredentialProviderBeginSignInController credentialProviderBeginSignInController, QB8 qb8) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = qb8;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$6$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, QB8 qb8) {
        AnonymousClass7TG.A1N(credentialProviderBeginSignInController, qb8);
        credentialProviderBeginSignInController.getCallback().DCo(qb8);
    }
}
