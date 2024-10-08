package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* renamed from: X.6Gu  reason: invalid class name and case insensitive filesystem */
public final class C305166Gu {
    public Object A00;
    public boolean A01;
    public final C305176Gv A02;
    public final C289495dh A03;
    public final C289495dh A04;

    public static final void A00(C305166Gu r2, int i, int i2) {
        if (((float) i) >= 0.0f) {
            r2.A03.EZz(i);
            r2.A02.A00(i);
            r2.A04.EZz(i2);
            return;
        }
        throw new IllegalArgumentException(002.A0I("Index should be non-negative (", ')', i));
    }

    public C305166Gu(int i, int i2) {
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A03 = new ParcelableSnapshotMutableIntState(i);
        this.A04 = new ParcelableSnapshotMutableIntState(i2);
        this.A02 = new C305176Gv(i, 30, 100);
    }

    public C305166Gu() {
        this(0, 0);
    }
}
