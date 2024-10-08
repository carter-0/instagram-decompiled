package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.0Yg;
import X.0qQ;
import X.0sP;
import X.AnonymousClass00P;
import X.AnonymousClass7TG;
import X.C13683Tez;
import X.C60340gF;
import X.C8987RKd;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$2 extends 0Yg implements 0sP {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(1);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    public final void invoke(C8987RKd rKd) {
        0qQ.A0B(rKd, 0);
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            0qQ.A0F("executor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, rKd));
        }
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, C8987RKd rKd) {
        AnonymousClass7TG.A1N(credentialProviderCreatePublicKeyCredentialController, rKd);
        C13683Tez tez = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tez == null) {
            0qQ.A0F("callback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tez.DCo(rKd);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8987RKd) obj);
        return C60340gF.A00;
    }
}
