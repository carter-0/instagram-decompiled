package X;

public final class XGP extends AnonymousClass5P2 {
    public int A00;
    public C284995Pg A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XGP, X.5P2] */
    public final AnonymousClass5P2 A00() {
        C284995Pg r1 = this.A01;
        ? r0 = new AnonymousClass5P2();
        r0.A01 = r1;
        return r0;
    }

    public final void A01(AnonymousClass5P2 r3) {
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        XGP xgp = (XGP) r3;
        synchronized (C21524Xds.A00) {
            this.A01 = xgp.A01;
            this.A00 = xgp.A00;
        }
    }
}
