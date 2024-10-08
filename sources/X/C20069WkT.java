package X;

/* renamed from: X.WkT  reason: case insensitive filesystem */
public final class C20069WkT implements Runnable {
    public final /* synthetic */ C15358UbA A00;

    public C20069WkT(C15358UbA ubA) {
        this.A00 = ubA;
    }

    public final void run() {
        C15358UbA ubA = this.A00;
        if (ubA.isResumed()) {
            DbU.A0L(ubA, 2dZ.A0t).A0T();
        }
    }
}
