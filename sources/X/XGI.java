package X;

import androidx.compose.runtime.snapshots.Snapshot;

public final class XGI extends Snapshot {
    public final Snapshot A00;
    public final 0sP A01;

    public final 0sP A06() {
        return null;
    }

    public final void A08() {
    }

    public final boolean A0G() {
        return true;
    }

    public final /* bridge */ /* synthetic */ void A0F(C284925Ox r2) {
        Object obj = AnonymousClass5P3.A07;
        throw AnonymousClass7TE.A0z(C273654mx.A00(1216));
    }

    public final void A0H() {
        if (!this.A02) {
            int A012 = A01();
            Snapshot snapshot = this.A00;
            if (A012 != snapshot.A01()) {
                A0A();
            }
            snapshot.A0D(this);
            super.A0H();
        }
    }

    public XGI(Snapshot snapshot, AnonymousClass5P8 r2, 0sP r3, int i) {
        super(r2, i);
        this.A01 = r3;
        this.A00 = snapshot;
        snapshot.A0C(this);
    }

    public final /* bridge */ /* synthetic */ Snapshot A03(0sP r6) {
        int A012 = A01();
        return new XGI(this.A00, A04(), AnonymousClass5P3.A0C(r6, this.A01, true), A012);
    }

    public final /* bridge */ /* synthetic */ 0sP A05() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ void A0C(Snapshot snapshot) {
        C21524Xds.A00();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void A0D(Snapshot snapshot) {
        C21524Xds.A00();
        throw AnonymousClass00P.createAndThrow();
    }
}
