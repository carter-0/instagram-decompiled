package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.0Yg;
import X.AnonymousClass7TG;
import X.C62320sa;
import X.C8988RKe;

public final class CredentialProviderGetSignInIntentController$handleResponse$5 extends 0Yg implements C62320sa {
    public final /* synthetic */ C8988RKe $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C8988RKe rKe) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = rKe;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$5$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C8988RKe rKe) {
        AnonymousClass7TG.A1N(credentialProviderGetSignInIntentController, rKe);
        credentialProviderGetSignInIntentController.getCallback().DCo(rKe);
    }
}
