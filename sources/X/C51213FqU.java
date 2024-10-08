package X;

/* renamed from: X.FqU  reason: case insensitive filesystem */
public final /* synthetic */ class C51213FqU implements Runnable {
    public final /* synthetic */ C47483E4i A00;

    public /* synthetic */ C51213FqU(C47483E4i e4i) {
        this.A00 = e4i;
    }

    public final void run() {
        C47483E4i e4i = this.A00;
        02m.A0p.markerEnd(725105460, 2);
        AnonymousClass6ST r1 = e4i.A0D;
        if (r1 != null && (r1.getOwnerActivity() == null || !r1.getOwnerActivity().isDestroyed())) {
            r1.cancel();
        }
        C47483E4i.A02(e4i);
    }
}
