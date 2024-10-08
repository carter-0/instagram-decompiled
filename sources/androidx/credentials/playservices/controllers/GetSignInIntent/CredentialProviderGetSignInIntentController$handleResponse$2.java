package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.0Yg;
import X.0qQ;
import X.0sP;
import X.AnonymousClass7TG;
import X.C60340gF;
import X.C8988RKe;

public final class CredentialProviderGetSignInIntentController$handleResponse$2 extends 0Yg implements 0sP {
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(1);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public final void invoke(C8988RKe rKe) {
        0qQ.A0B(rKe, 0);
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$2$$ExternalSyntheticLambda0(this.this$0, rKe));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C8988RKe rKe) {
        AnonymousClass7TG.A1N(credentialProviderGetSignInIntentController, rKe);
        credentialProviderGetSignInIntentController.getCallback().DCo(rKe);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8988RKe) obj);
        return C60340gF.A00;
    }
}
