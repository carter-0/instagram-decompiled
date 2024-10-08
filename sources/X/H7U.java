package X;

public final class H7U extends 2Cn {
    public final /* synthetic */ 1IX A00;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        0kD.A07("InspirationHubRepository", "getRemoteMediaTask failed", exc);
        this.A00.resumeWith(C41845B3m.A0c(exc));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        0qQ.A0B(obj, 0);
        this.A00.resumeWith(C41845B3m.A0d(obj));
    }

    public H7U(1IX r1) {
        this.A00 = r1;
    }
}
