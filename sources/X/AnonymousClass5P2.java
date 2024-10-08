package X;

/* renamed from: X.5P2  reason: invalid class name */
public abstract class AnonymousClass5P2 {
    public int A00 = AnonymousClass5P3.A00().A01();
    public AnonymousClass5P2 A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.5P2, X.5Pa] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.5P2, X.60c] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.5P2, X.6HI] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.5P2, X.5XI] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.5P2, X.5P1] */
    public AnonymousClass5P2 A00() {
        if (this instanceof AnonymousClass5P1) {
            Object obj = ((AnonymousClass5P1) this).A00;
            ? r2 = new AnonymousClass5P2();
            r2.A00 = obj;
            return r2;
        } else if (this instanceof AnonymousClass5TZ) {
            return new AnonymousClass5TZ();
        } else {
            if (this instanceof AnonymousClass5XI) {
                int i = ((AnonymousClass5XI) this).A00;
                ? r22 = new AnonymousClass5P2();
                r22.A00 = i;
                return r22;
            } else if (this instanceof AnonymousClass6HI) {
                AnonymousClass6HG r0 = ((AnonymousClass6HI) this).A02;
                ? r23 = new AnonymousClass5P2();
                r23.A02 = r0;
                return r23;
            } else if (this instanceof C3017960c) {
                long j = ((C3017960c) this).A00;
                ? r24 = new AnonymousClass5P2();
                r24.A00 = j;
                return r24;
            } else {
                float f = ((C284955Pa) this).A00;
                ? r25 = new AnonymousClass5P2();
                r25.A00 = f;
                return r25;
            }
        }
    }

    public void A01(AnonymousClass5P2 r4) {
        if (this instanceof AnonymousClass5P1) {
            0qQ.A0C(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            ((AnonymousClass5P1) this).A00 = ((AnonymousClass5P1) r4).A00;
        } else if (this instanceof AnonymousClass5TZ) {
            AnonymousClass5TZ r1 = (AnonymousClass5TZ) this;
            0qQ.A0C(r4, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            AnonymousClass5TZ r42 = (AnonymousClass5TZ) r4;
            r1.A03 = r42.A03;
            r1.A04 = r42.A04;
            r1.A00 = r42.A00;
        } else if (this instanceof AnonymousClass5XI) {
            0qQ.A0C(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            ((AnonymousClass5XI) this).A00 = ((AnonymousClass5XI) r4).A00;
        } else if (this instanceof C3017960c) {
            0qQ.A0C(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            ((C3017960c) this).A00 = ((C3017960c) r4).A00;
        } else if (this instanceof AnonymousClass6HI) {
            AnonymousClass6HI r2 = (AnonymousClass6HI) this;
            synchronized (C18284Vp7.A00) {
                0qQ.A0C(r4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                AnonymousClass6HI r43 = (AnonymousClass6HI) r4;
                r2.A02 = r43.A02;
                r2.A00 = r43.A00;
                r2.A01 = r43.A01;
            }
        } else {
            0qQ.A0C(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            ((C284955Pa) this).A00 = ((C284955Pa) r4).A00;
        }
    }
}
