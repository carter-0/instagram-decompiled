package X;

/* renamed from: X.Xcu  reason: case insensitive filesystem */
public final class C21496Xcu {
    public final XtE A00 = new XtE();

    public final void A00() {
        if (!this.A00.A08()) {
            throw AnonymousClass7TE.A0z("Cannot cancel a completed task.");
        }
    }

    public final void A01(Exception exc) {
        XtE xtE = this.A00;
        Object obj = xtE.A05;
        synchronized (obj) {
            if (xtE.A02) {
                throw AnonymousClass7TE.A0z("Cannot set the error on a completed task.");
            }
            xtE.A02 = true;
            xtE.A00 = exc;
            obj.notifyAll();
            XtE.A01(xtE);
        }
    }

    public final void A02(Object obj) {
        if (!this.A00.A09(obj)) {
            throw AnonymousClass7TE.A0z("Cannot set the result of a completed task.");
        }
    }
}
