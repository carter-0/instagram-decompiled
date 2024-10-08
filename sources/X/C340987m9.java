package X;

/* renamed from: X.7m9  reason: invalid class name and case insensitive filesystem */
public final class C340987m9 implements C340347l7 {
    public final /* synthetic */ C340957m6 A00;

    public C340987m9(C340957m6 r1) {
        this.A00 = r1;
    }

    public final void DZF() {
        C340577lU.A01("ConcurrentFrontBackController", "Main camera preview stopped");
        C340957m6 r1 = this.A00;
        if (!r1.A06) {
            r1.A06 = true;
            if (!r1.A0E.A00.isEmpty() && r1.A06) {
                r1.A06 = false;
                C342057ny.A00(new C40748Aie(r1));
            }
        }
    }
}
