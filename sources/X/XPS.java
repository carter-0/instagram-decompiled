package X;

public final class XPS extends 0ng {
    public final /* synthetic */ C22413Y2v A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XPS(C22413Y2v y2v) {
        super(279);
        this.A00 = y2v;
    }

    public final void run() {
        AnonymousClass6UF r1 = this.A00.A00;
        if (!r1.isDone()) {
            r1.cancel(true);
        }
    }
}
