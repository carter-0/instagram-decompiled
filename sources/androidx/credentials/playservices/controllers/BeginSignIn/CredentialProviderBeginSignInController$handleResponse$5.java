package androidx.credentials.playservices.controllers.BeginSignIn;

import X.0Yg;
import X.AnonymousClass7TG;
import X.C62320sa;
import X.C8988RKe;

public final class CredentialProviderBeginSignInController$handleResponse$5 extends 0Yg implements C62320sa {
    public final /* synthetic */ C8988RKe $e;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C8988RKe rKe) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = rKe;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$5$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C8988RKe rKe) {
        AnonymousClass7TG.A1N(credentialProviderBeginSignInController, rKe);
        credentialProviderBeginSignInController.getCallback().DCo(rKe);
    }
}
