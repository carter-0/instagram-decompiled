package X;

/* renamed from: X.MbN  reason: case insensitive filesystem */
public final class C66716MbN implements AnonymousClass11X, AnonymousClass1OD {
    public final 1P0 A00;
    public final 1OC A01;

    public final void A00(1P0 r4) {
        C66750Mbv mbv;
        1OC r2 = this.A01;
        if (r4 != null) {
            mbv = new C66750Mbv(this.A00, r4, this);
        } else {
            mbv = null;
        }
        r2.A00 = mbv;
    }

    public final void cancel() {
        this.A01.cancel();
    }

    public final String getName() {
        return this.A01.A05;
    }

    public final int getRunnableId() {
        return this.A01.A04.runnableId;
    }

    public final void onCancel() {
        this.A01.onCancel();
    }

    public final void onFinish() {
        this.A01.onFinish();
    }

    public final void onStart() {
        this.A01.onStart();
    }

    public final void run() {
        this.A01.run();
    }

    public final String toString() {
        return this.A01.toString();
    }

    public C66716MbN(1P0 r1, 1OC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
