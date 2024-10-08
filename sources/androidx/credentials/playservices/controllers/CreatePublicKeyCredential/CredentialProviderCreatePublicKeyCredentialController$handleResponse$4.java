package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.0Yg;
import X.0qQ;
import X.AnonymousClass00P;
import X.C13683Tez;
import X.C62320sa;
import X.C8987RKd;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$4 extends 0Yg implements C62320sa {
    public final /* synthetic */ C8987RKd $exception;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, C8987RKd rKd) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$exception = rKd;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, C8987RKd rKd) {
        0qQ.A0B(credentialProviderCreatePublicKeyCredentialController, 0);
        C13683Tez tez = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tez == null) {
            0qQ.A0F("callback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tez.DCo(rKd);
        }
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            0qQ.A0F("executor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$exception));
        }
    }
}
