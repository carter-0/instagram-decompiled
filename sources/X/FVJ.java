package X;

public final class FVJ implements G5U {
    public final /* synthetic */ E88 A00;

    public FVJ(E88 e88) {
        this.A00 = e88;
    }

    public final void cleanup() {
        E88 e88 = this.A00;
        AnonymousClass1EO r0 = e88.A01;
        if (r0 != null) {
            r0.cancel();
        }
        e88.A01 = null;
        e88.A02 = null;
    }
}
