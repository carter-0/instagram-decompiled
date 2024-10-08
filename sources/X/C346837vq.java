package X;

/* renamed from: X.7vq  reason: invalid class name and case insensitive filesystem */
public final class C346837vq extends AnonymousClass4CZ {
    public final C346847vr A00 = new C346847vr();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r1.A01 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0L(X.C262094Cc r3) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.4CZ r0 = X.AnonymousClass12W.A00
            X.134 r0 = X.AnonymousClass12y.A00
            X.134 r0 = r0.A0P()
            boolean r1 = r0.A0L(r3)
            r0 = 1
            if (r1 != 0) goto L_0x0021
            X.7vr r1 = r2.A00
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x001e
            boolean r1 = r1.A01
            r0 = 0
            if (r1 != 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            r0 = r0 ^ 1
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346837vq.A0L(X.4Cc):boolean");
    }

    public final void A0O(Runnable runnable, C262094Cc r5) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(runnable, 1);
        C346847vr r2 = this.A00;
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        AnonymousClass134 A0P = AnonymousClass12y.A00.A0P();
        if (A0P.A0L(r5) || r2.A00 || !r2.A01) {
            A0P.A0O(new C346907vx(r2, runnable), r5);
        } else if (r2.A03.offer(runnable)) {
            r2.A00();
        } else {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
    }
}
