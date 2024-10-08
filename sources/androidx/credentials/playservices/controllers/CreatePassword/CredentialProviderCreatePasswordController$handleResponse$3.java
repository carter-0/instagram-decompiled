package androidx.credentials.playservices.controllers.CreatePassword;

import X.0Yg;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TG;
import X.C10142RnJ;
import X.C13683Tez;
import X.C62320sa;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$handleResponse$3 extends 0Yg implements C62320sa {
    public final /* synthetic */ C10142RnJ $response;
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, C10142RnJ rnJ) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = rnJ;
    }

    public final void invoke() {
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            0qQ.A0F("executor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new CredentialProviderCreatePasswordController$handleResponse$3$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController, this.$response));
        }
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, C10142RnJ rnJ) {
        AnonymousClass7TG.A1N(credentialProviderCreatePasswordController, rnJ);
        C13683Tez tez = credentialProviderCreatePasswordController.callback;
        if (tez == null) {
            0qQ.A0F("callback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tez.onResult(rnJ);
        }
    }
}
