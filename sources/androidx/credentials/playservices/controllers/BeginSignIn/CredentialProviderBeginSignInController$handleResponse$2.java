package androidx.credentials.playservices.controllers.BeginSignIn;

import X.0Yg;
import X.0qQ;
import X.0sP;
import X.AnonymousClass7TG;
import X.C60340gF;
import X.C8988RKe;

public final class CredentialProviderBeginSignInController$handleResponse$2 extends 0Yg implements 0sP {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(1);
        this.this$0 = credentialProviderBeginSignInController;
    }

    public final void invoke(C8988RKe rKe) {
        0qQ.A0B(rKe, 0);
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$2$$ExternalSyntheticLambda0(this.this$0, rKe));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C8988RKe rKe) {
        AnonymousClass7TG.A1N(credentialProviderBeginSignInController, rKe);
        credentialProviderBeginSignInController.getCallback().DCo(rKe);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8988RKe) obj);
        return C60340gF.A00;
    }
}
