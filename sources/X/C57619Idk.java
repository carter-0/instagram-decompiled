package X;

import java.util.List;

/* renamed from: X.Idk  reason: case insensitive filesystem */
public final class C57619Idk implements C59587JPh {
    public final /* synthetic */ HK4 A00;

    public final void DLr(C267324bN r1, int i) {
    }

    public C57619Idk(HK4 hk4) {
        this.A00 = hk4;
    }

    public final void onDataSetChanged() {
        HK4 hk4 = this.A00;
        C53067Gi0 gi0 = hk4.A00;
        if (gi0 != null) {
            List A0I = hk4.A03.A0A.A0I();
            0qQ.A0B(A0I, 0);
            gi0.A01 = A0I;
            C53067Gi0 gi02 = hk4.A00;
            if (gi02 != null) {
                gi02.notifyDataSetChanged();
                return;
            }
        }
        0qQ.A0F("clipsViewerDebugOverlayAdapter");
        throw AnonymousClass00P.createAndThrow();
    }
}
