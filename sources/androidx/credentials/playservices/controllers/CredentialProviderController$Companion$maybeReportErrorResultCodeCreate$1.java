package androidx.credentials.playservices.controllers;

import X.0Yg;
import X.0rm;
import X.0sP;
import X.C62320sa;

public final class CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1 extends 0Yg implements C62320sa {
    public final /* synthetic */ 0rm $exception;
    public final /* synthetic */ 0sP $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(0sP r2, 0rm r3) {
        super(0);
        this.$onError = r2;
        this.$exception = r3;
    }

    public final void invoke() {
        this.$onError.invoke(this.$exception.A00);
    }
}
