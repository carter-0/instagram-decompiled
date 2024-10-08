package X;

/* renamed from: X.TGp  reason: case insensitive filesystem */
public final class C12982TGp implements Runnable {
    public final /* synthetic */ C11510SbX A00;
    public final /* synthetic */ C8132QhQ A01;

    public C12982TGp(C11510SbX sbX, C8132QhQ qhQ) {
        this.A01 = qhQ;
        this.A00 = sbX;
    }

    public final void run() {
        C8132QhQ qhQ = this.A01;
        QF4 qf4 = qhQ.A07;
        if (qf4 != null) {
            if (qf4.A00.getViewTreeObserver().isAlive()) {
                QF4 qf42 = qhQ.A07;
                if (qf42 != null) {
                    qf42.A00.getViewTreeObserver().removeOnDrawListener(this.A00);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("payButtonViewHolder");
        throw AnonymousClass00P.createAndThrow();
    }
}
