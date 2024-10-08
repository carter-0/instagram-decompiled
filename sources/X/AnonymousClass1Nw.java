package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.1Nw  reason: invalid class name */
public final class AnonymousClass1Nw {
    public final AnonymousClass1Ny A00;
    public final ConcurrentLinkedQueue A01;

    public final C227052iZ A00() {
        C227052iZ r0 = (C227052iZ) this.A01.poll();
        if (r0 == null) {
            return new C227052iZ(this);
        }
        return r0;
    }

    public AnonymousClass1Nw(AnonymousClass1Ny r2) {
        this.A01 = new ConcurrentLinkedQueue();
        this.A00 = r2;
    }

    public AnonymousClass1Nw() {
        this.A01 = new ConcurrentLinkedQueue();
        this.A00 = new AnonymousClass1Ny(5);
    }
}
