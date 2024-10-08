package androidx.credentials.playservices.controllers;

import X.0Yg;
import X.AnonymousClass7TG;
import X.C13683Tez;
import X.C62320sa;
import java.util.concurrent.Executor;

public final class CredentialProviderController$maybeReportErrorFromResultReceiver$1 extends 0Yg implements C62320sa {
    public final /* synthetic */ C13683Tez $callback;
    public final /* synthetic */ Object $exception;
    public final /* synthetic */ Executor $executor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$maybeReportErrorFromResultReceiver$1(Executor executor, C13683Tez tez, Object obj) {
        super(0);
        this.$executor = executor;
        this.$callback = tez;
        this.$exception = obj;
    }

    public final void invoke() {
        this.$executor.execute(new CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0(this.$callback, this.$exception));
    }

    public static final void invoke$lambda$0(C13683Tez tez, Object obj) {
        AnonymousClass7TG.A1N(tez, obj);
        tez.DCo(obj);
    }
}
