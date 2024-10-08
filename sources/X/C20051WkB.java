package X;

/* renamed from: X.WkB  reason: case insensitive filesystem */
public final class C20051WkB implements Runnable {
    public final /* synthetic */ C15383Ubh A00;

    public C20051WkB(C15383Ubh ubh) {
        this.A00 = ubh;
    }

    public final void run() {
        C15383Ubh ubh = this.A00;
        if (ubh.isResumed()) {
            C15466UdH udH = ubh.A08;
            if (udH == null) {
                DbS.A13();
                throw AnonymousClass00P.createAndThrow();
            } else {
                udH.A02 = false;
            }
        }
    }
}
