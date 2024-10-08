package androidx.credentials.playservices;

import X.0Yg;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13683Tez;
import X.C62320sa;
import X.RKQ;
import android.util.Log;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends 0Yg implements C62320sa {
    public final /* synthetic */ C13683Tez $callback;
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ Executor $executor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, C13683Tez tez) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = tez;
    }

    public static final void invoke$lambda$0(C13683Tez tez, Exception exc) {
        AnonymousClass7TG.A1N(tez, exc);
        tez.DCo(new RKQ(exc.getMessage()));
    }

    public final void invoke() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("During clear credential sign out failed with ");
        Log.w(CredentialProviderPlayServicesImpl.TAG, AnonymousClass7TF.A0i(this.$e, A1A));
        this.$executor.execute(new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1$$ExternalSyntheticLambda0(this.$callback, this.$e));
    }
}
