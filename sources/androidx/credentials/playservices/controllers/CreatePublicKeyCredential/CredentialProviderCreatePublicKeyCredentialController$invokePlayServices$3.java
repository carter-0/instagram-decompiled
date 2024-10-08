package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.0Yg;
import X.0qQ;
import X.AnonymousClass00P;
import X.C13683Tez;
import X.C62320sa;
import X.C8987RKd;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3 extends 0Yg implements C62320sa {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        0qQ.A0B(credentialProviderCreatePublicKeyCredentialController, 0);
        C13683Tez tez = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tez == null) {
            0qQ.A0F("callback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tez.DCo(new C8987RKd("android.credentials.CreateCredentialException.TYPE_UNKNOWN", CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            0qQ.A0F("executor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController));
        }
    }
}
