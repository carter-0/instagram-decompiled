package X;

public final class MhV extends 0ng {
    public final /* synthetic */ C66633Ma2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MhV(C66633Ma2 ma2, int i) {
        super(449242285, i, false, false);
        this.A00 = ma2;
    }

    public final void run() {
        C66633Ma2 ma2 = this.A00;
        C290645fe r1 = ma2.A0K;
        if (r1 != null) {
            if (C290645fe.A00(r1)) {
                synchronized (r1) {
                    r1.A00.A0B();
                }
            } else {
                r1.A00.A0B();
            }
            C290645fe r12 = ma2.A0K;
            if (r12 == null) {
                0qQ.A0F("banyanClient");
                throw AnonymousClass00P.createAndThrow();
            } else {
                ma2.A1F = AnonymousClass7TF.A1R(r12.A01("direct_ibc_nullstate").A02.size());
            }
        }
    }
}
