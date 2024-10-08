package androidx.credentials.playservices.controllers.CreatePassword;

import X.0Yg;
import X.0qQ;
import X.AnonymousClass00P;
import X.C13683Tez;
import X.C62320sa;
import X.C8987RKd;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$invokePlayServices$1 extends 0Yg implements C62320sa {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$invokePlayServices$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        0qQ.A0B(credentialProviderCreatePasswordController, 0);
        C13683Tez tez = credentialProviderCreatePasswordController.callback;
        if (tez == null) {
            0qQ.A0F("callback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tez.DCo(new C8987RKd("android.credentials.CreateCredentialException.TYPE_UNKNOWN", CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }
    }

    public final void invoke() {
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            0qQ.A0F("executor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new CredentialProviderCreatePasswordController$invokePlayServices$1$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController));
        }
    }
}
