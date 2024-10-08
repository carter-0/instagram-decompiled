package androidx.credentials.playservices;

import X.C13683Tez;
import X.C3736596k;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

public final /* synthetic */ class CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1 implements C3736596k {
    public final /* synthetic */ CredentialProviderPlayServicesImpl f$0;
    public final /* synthetic */ CancellationSignal f$1;
    public final /* synthetic */ Executor f$2;
    public final /* synthetic */ C13683Tez f$3;

    public /* synthetic */ CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez) {
        this.f$0 = credentialProviderPlayServicesImpl;
        this.f$1 = cancellationSignal;
        this.f$2 = executor;
        this.f$3 = tez;
    }

    public final void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(this.f$0, this.f$1, this.f$2, this.f$3, exc);
    }
}
