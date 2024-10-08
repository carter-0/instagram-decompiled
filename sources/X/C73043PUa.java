package X;

/* renamed from: X.PUa  reason: case insensitive filesystem */
public final class C73043PUa implements Runnable {
    public final /* synthetic */ NDz A00;

    public C73043PUa(NDz nDz) {
        this.A00 = nDz;
    }

    public final void run() {
        try {
            NDz nDz = this.A00;
            1DF r2 = (1DF) nDz.A0B.getValue();
            if (r2 != null) {
                r2.A07(nDz.A00, 0);
            }
        } catch (IllegalStateException e) {
            e = e;
            C69729NrE nrE = this.A00.A0A;
            if (nrE instanceof NE0) {
                if (182.A06(0Tu.A05, ((NE0) nrE).A00, 36329891406299506L)) {
                    return;
                }
            } else {
                e = AnonymousClass00P.createAndThrow();
            }
            throw e;
        }
    }
}
