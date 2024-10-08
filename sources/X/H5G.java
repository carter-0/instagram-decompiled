package X;

public final class H5G extends C252233om {
    public final /* synthetic */ C229352nF A00;
    public final /* synthetic */ C246793fF A01;
    public final /* synthetic */ String A02;

    public H5G(C229352nF r1, C246793fF r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void onDestroy() {
        this.A00.A07(this.A02);
        this.A01.A00.unregisterLifecycleListener(this);
    }
}
