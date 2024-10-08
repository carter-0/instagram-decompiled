package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.LzV  reason: case insensitive filesystem */
public final class C65777LzV implements MT2 {
    public final int A00;
    public final Object A01;

    public C65777LzV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DbU() {
        if (this.A00 != 0) {
            ReelViewerFragment.A0I((ReelViewerFragment) this.A01, false);
            return;
        }
        C273384mU r0 = ((K3O) this.A01).A02;
        if (r0 == null) {
            0qQ.A0F("reelViewerDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.EHd();
        }
    }
}
