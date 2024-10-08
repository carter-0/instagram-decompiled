package X;

public final class T0M implements 2IR {
    public final /* synthetic */ SNQ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        String str = this.A01;
        0KC.A0G("MldwFederatedAnalyticsLogger", 002.A0g("Failed to log event ", str, " to MLDW"), th);
        SNQ.A00(this.A00, "event.federated.not_processed.persist.failed.mldw", str, this.A02);
    }

    public T0M(SNQ snq, String str, String str2) {
        this.A01 = str;
        this.A00 = snq;
        this.A02 = str2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        SNQ.A00(this.A00, "event.federated.persisted.mldw", this.A01, this.A02);
    }
}
