package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.5PG  reason: invalid class name */
public final class AnonymousClass5PG extends Snapshot {
    public 0sP A00;
    public final long A01;
    public final Snapshot A02;
    public final Snapshot A03;
    public final boolean A04;

    public final void A0H() {
        Snapshot snapshot;
        this.A02 = true;
        if (this.A04 && (snapshot = this.A02) != null) {
            snapshot.A0H();
        }
    }

    public AnonymousClass5PG(Snapshot snapshot, 0sP r4, boolean z) {
        super(AnonymousClass5P8.A04, 0);
        this.A02 = snapshot;
        this.A04 = z;
        int i = AnonymousClass5P3.A00;
        this.A00 = r4 == null ? null : r4;
        this.A01 = Thread.currentThread().getId();
        this.A03 = this;
    }
}
