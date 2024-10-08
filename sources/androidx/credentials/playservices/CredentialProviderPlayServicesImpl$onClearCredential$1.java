package androidx.credentials.playservices;

import X.0Yg;
import X.0qQ;
import X.0sP;
import X.C13683Tez;
import X.C60340gF;
import X.C62320sa;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl$onClearCredential$1 extends 0Yg implements 0sP {
    public final /* synthetic */ C13683Tez $callback;
    public final /* synthetic */ CancellationSignal $cancellationSignal;
    public final /* synthetic */ Executor $executor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$1(CancellationSignal cancellationSignal, Executor executor, C13683Tez tez) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = tez;
    }

    public final void invoke(Void voidR) {
        CredentialProviderPlayServicesImpl.Companion companion = CredentialProviderPlayServicesImpl.Companion;
        CancellationSignal cancellationSignal = this.$cancellationSignal;
        final Executor executor = this.$executor;
        final C13683Tez tez = this.$callback;
        companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new C62320sa() {
            public static final void invoke$lambda$0(C13683Tez tez) {
                0qQ.A0B(tez, 0);
                tez.onResult((Object) null);
            }

            public final void invoke() {
                executor.execute(new CredentialProviderPlayServicesImpl$onClearCredential$1$1$$ExternalSyntheticLambda0(tez));
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Void) null);
        return C60340gF.A00;
    }
}
