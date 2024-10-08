package X;

/* renamed from: X.IgX  reason: case insensitive filesystem */
public final class C57792IgX implements Runnable {
    public final /* synthetic */ H1N A00;

    public C57792IgX(H1N h1n) {
        this.A00 = h1n;
    }

    public final void run() {
        H1N h1n = this.A00;
        C238143As r1 = h1n.A03;
        if (r1 != null) {
            r1.EaP(true);
        }
        H38 h38 = h1n.A05;
        if (h38 == null) {
            0qQ.A0F("clipsSavedTabFetcher");
            throw AnonymousClass00P.createAndThrow();
        } else {
            h38.A01();
        }
    }
}
