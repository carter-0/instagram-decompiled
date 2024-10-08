package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.0Yg;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TG;
import X.C10142RnJ;
import X.C13683Tez;
import X.C62320sa;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$5 extends 0Yg implements C62320sa {
    public final /* synthetic */ C10142RnJ $response;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, C10142RnJ rnJ) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$response = rnJ;
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            0qQ.A0F("executor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$response));
        }
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, C10142RnJ rnJ) {
        AnonymousClass7TG.A1N(credentialProviderCreatePublicKeyCredentialController, rnJ);
        C13683Tez tez = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tez == null) {
            0qQ.A0F("callback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tez.onResult(rnJ);
        }
    }
}
