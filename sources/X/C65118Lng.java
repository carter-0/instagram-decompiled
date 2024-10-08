package X;

/* renamed from: X.Lng  reason: case insensitive filesystem */
public final class C65118Lng implements C352308Cv {
    public final /* synthetic */ LRF A00;

    public C65118Lng(LRF lrf) {
        this.A00 = lrf;
    }

    public final void DNN(int i) {
        LRF lrf = this.A00;
        AnonymousClass4MM r0 = lrf.A03;
        if (r0 != null) {
            r0.seekTo(i);
        }
        lrf.A01 = i;
    }

    public final void Dfv(int i) {
        LRF lrf = this.A00;
        AnonymousClass4MM r1 = lrf.A03;
        if (r1 != null) {
            r1.seekTo(lrf.A01);
        }
        lrf.A00 = i;
    }

    public final void DiS(int i) {
        AnonymousClass4MM r0 = this.A00.A03;
        if (r0 != null) {
            r0.seekTo(i);
        }
    }

    public final void Dsh(boolean z) {
        LRF lrf = this.A00;
        lrf.A04 = false;
        lrf.A08.postOnAnimation(lrf.A0D);
    }

    public final void Dsj(boolean z) {
        this.A00.A04 = true;
    }
}
