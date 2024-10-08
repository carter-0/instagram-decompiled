package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* renamed from: X.5df  reason: invalid class name and case insensitive filesystem */
public final class C289485df {
    public int A00;
    public final int A01;
    public final C289495dh A02;
    public final C289495dh A03;
    public final C289495dh A04;
    public final C289495dh A05;
    public final C289495dh A06;
    public final boolean A07;

    public C289485df(int i, int i2, int i3, int i4) {
        this.A01 = i2;
        boolean z = i2 > 5;
        this.A07 = z;
        AnonymousClass0eM r0 = C284905Ot.A01;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = new ParcelableSnapshotMutableIntState(0);
        this.A05 = parcelableSnapshotMutableIntState;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = new ParcelableSnapshotMutableIntState(i3);
        this.A03 = parcelableSnapshotMutableIntState2;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = new ParcelableSnapshotMutableIntState(0);
        this.A06 = parcelableSnapshotMutableIntState3;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = new ParcelableSnapshotMutableIntState(i4);
        this.A04 = parcelableSnapshotMutableIntState4;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5 = new ParcelableSnapshotMutableIntState(i);
        this.A02 = parcelableSnapshotMutableIntState5;
        if (z) {
            int BI6 = parcelableSnapshotMutableIntState5.BI6();
            int i5 = i2 / 2;
            int BI62 = parcelableSnapshotMutableIntState5.BI6();
            if (BI6 > i5) {
                parcelableSnapshotMutableIntState4.EZz(Math.min(BI62 + 2, i2 - 1));
                parcelableSnapshotMutableIntState3.EZz(Math.max((parcelableSnapshotMutableIntState2.BI6() - 5) + 1, 0));
            } else {
                parcelableSnapshotMutableIntState3.EZz(Math.max(BI62 - 2, 0));
                parcelableSnapshotMutableIntState4.EZz(Math.min((parcelableSnapshotMutableIntState.BI6() + 5) - 1, i2 - 1));
            }
            parcelableSnapshotMutableIntState.EZz(Math.max(0, parcelableSnapshotMutableIntState3.BI6() - 2));
            parcelableSnapshotMutableIntState2.EZz(Math.min(parcelableSnapshotMutableIntState4.BI6() + 2, i2 - 1));
        }
    }
}
