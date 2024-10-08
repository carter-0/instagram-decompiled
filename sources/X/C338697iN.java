package X;

/* renamed from: X.7iN  reason: invalid class name and case insensitive filesystem */
public final class C338697iN implements Runnable {
    public final /* synthetic */ C338677iL A00;

    public C338697iN(C338677iL r1) {
        this.A00 = r1;
    }

    public final void run() {
        int currentTimeMillis;
        C338677iL r7 = this.A00;
        AnonymousClass91c r6 = r7.A02;
        if (r6 != null) {
            C252063oV r5 = r7.A0A;
            if (r5.CVM()) {
                int A0W = r6.A0W();
                if (A0W == 0) {
                    currentTimeMillis = 0;
                } else {
                    currentTimeMillis = (int) ((System.currentTimeMillis() - r7.A00) % ((long) A0W));
                }
                r6.EXC(currentTimeMillis, r6.getDurationInMs());
                r5.getView().postOnAnimation(r7.A0B);
            }
        }
    }
}
