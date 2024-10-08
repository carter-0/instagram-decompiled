package X;

/* renamed from: X.PY0  reason: case insensitive filesystem */
public final class C73165PY0 implements Runnable {
    public final /* synthetic */ C71759OqL A00;
    public final /* synthetic */ C73540PeW A01;

    public C73165PY0(C71759OqL oqL, C73540PeW peW) {
        this.A00 = oqL;
        this.A01 = peW;
    }

    public final void run() {
        C71759OqL oqL = this.A00;
        Object invoke = this.A01.B9B().invoke();
        0qQ.A0B(invoke, 1);
        0sP r0 = oqL.A00;
        if (r0 != null) {
            r0.invoke(invoke);
        }
    }
}
