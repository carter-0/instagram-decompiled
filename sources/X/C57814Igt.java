package X;

/* renamed from: X.Igt  reason: case insensitive filesystem */
public final class C57814Igt implements Runnable {
    public final /* synthetic */ IOA A00;
    public final /* synthetic */ 1Xj A01;

    public C57814Igt(IOA ioa, 1Xj r2) {
        this.A00 = ioa;
        this.A01 = r2;
    }

    public final void run() {
        C334387bB r1 = this.A00.A01;
        if (r1 == null) {
            0qQ.A0F("mentionThumbnailSelectionDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.EuB(this.A01);
        }
    }
}
