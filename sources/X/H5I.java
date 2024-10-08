package X;

public final class H5I extends C252233om {
    public final /* synthetic */ C229382nI A00;
    public final /* synthetic */ C254083ru A01;

    public H5I(C229382nI r1, C254083ru r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onDestroy() {
        this.A01.A00 = null;
        this.A00.A06(this);
    }

    public final void onDestroyView() {
        AnonymousClass6NS r0 = this.A01.A00;
        if (r0 != null) {
            r0.A04();
        }
    }
}
