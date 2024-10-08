package X;

public final class SyC implements C13641Te8 {
    public final C10605Ruz A00;
    public final Object A01;

    public SyC(C10605Ruz ruz, Object obj) {
        this.A01 = obj;
        this.A00 = ruz;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.RKJ, java.lang.Exception] */
    public final Object FP1() {
        if (C10085RmN.A01 == null) {
            C10085RmN.A01 = new Exception();
        }
        synchronized (C10085RmN.A00) {
        }
        throw AnonymousClass7TE.A0z("Must call PhenotypeContext.setContext() first");
    }
}
