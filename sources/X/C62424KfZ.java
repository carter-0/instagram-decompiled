package X;

/* renamed from: X.KfZ  reason: case insensitive filesystem */
public final class C62424KfZ extends AnonymousClass4M2 {
    public final /* synthetic */ LRF A00;

    public C62424KfZ(LRF lrf) {
        this.A00 = lrf;
    }

    public final void D5H(AnonymousClass4MN r4) {
        LRF lrf = this.A00;
        AnonymousClass4MM r1 = lrf.A03;
        if (r1 != null) {
            r1.seekTo(lrf.A01);
        }
        AnonymousClass4MM r0 = lrf.A03;
        if (r0 != null) {
            r0.start();
        }
    }

    public final void DZ2(AnonymousClass4MN r3, long j) {
        LRF lrf = this.A00;
        lrf.A08.postOnAnimation(lrf.A0D);
    }
}
