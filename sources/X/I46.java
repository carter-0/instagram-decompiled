package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

public final class I46 {
    public Object A00;
    public boolean A01;
    public final C305176Gv A02;
    public final C289495dh A03;
    public final C289495dh A04;

    public static final void A00(I46 i46, int i, int i2) {
        if (((float) i) >= 0.0f) {
            i46.A03.EZz(i);
            i46.A02.A00(i);
            i46.A04.EZz(i2);
            return;
        }
        throw AnonymousClass7TE.A0w(G9w.A0j(C273654mx.A00(488), i));
    }

    public I46(int i, int i2) {
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A03 = new ParcelableSnapshotMutableIntState(i);
        this.A04 = new ParcelableSnapshotMutableIntState(i2);
        this.A02 = new C305176Gv(i, 90, 200);
    }

    public I46() {
        this(0, 0);
    }
}
