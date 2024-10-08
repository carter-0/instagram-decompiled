package X;

/* renamed from: X.ASd  reason: case insensitive filesystem */
public final class C40114ASd implements 2Kw {
    public final /* synthetic */ C39745A7l A00;

    public C40114ASd(C39745A7l a7l) {
        this.A00 = a7l;
    }

    public final void invoke(Throwable th) {
        0KC.A0C("FXIGAccessLibrarySSOAndRegFlagNetworkManager", AnonymousClass7TG.A0m(th, "Fetch failed: ", AnonymousClass7TE.A1A()));
        C39745A7l a7l = this.A00;
        0KC.A0C("FXIGAccessLibrarySSOAndRegFlagAppJob", "App start fetch failed");
        B2L b2l = a7l.A03;
        if (b2l != null) {
            b2l.onFailure();
        }
    }
}
