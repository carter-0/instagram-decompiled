package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.0Yg;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TG;
import X.C13683Tez;
import X.C62320sa;
import X.C8987RKd;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ Throwable $t;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$t = th;
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            0qQ.A0F("executor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$t));
        }
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        AnonymousClass7TG.A1N(credentialProviderCreatePublicKeyCredentialController, th);
        C13683Tez tez = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tez == null) {
            0qQ.A0F("callback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tez.DCo(new C8987RKd("android.credentials.CreateCredentialException.TYPE_UNKNOWN", th.getMessage()));
        }
    }
}
