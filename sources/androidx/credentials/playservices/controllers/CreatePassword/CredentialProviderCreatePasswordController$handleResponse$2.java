package androidx.credentials.playservices.controllers.CreatePassword;

import X.0Yg;
import X.0qQ;
import X.0sP;
import X.AnonymousClass00P;
import X.AnonymousClass7TG;
import X.C13683Tez;
import X.C60340gF;
import X.C8987RKd;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$handleResponse$2 extends 0Yg implements 0sP {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(1);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public final void invoke(C8987RKd rKd) {
        0qQ.A0B(rKd, 0);
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            0qQ.A0F("executor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new CredentialProviderCreatePasswordController$handleResponse$2$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController, rKd));
        }
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, C8987RKd rKd) {
        AnonymousClass7TG.A1N(credentialProviderCreatePasswordController, rKd);
        C13683Tez tez = credentialProviderCreatePasswordController.callback;
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
