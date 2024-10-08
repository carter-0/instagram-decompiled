package X;

public final class H5H extends C252233om {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ C229352nF A01;
    public final /* synthetic */ String A02;

    public H5H(AnonymousClass4DH r1, C229352nF r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void onDestroy() {
        this.A01.A07(this.A02);
        this.A00.unregisterLifecycleListener(this);
    }
}
