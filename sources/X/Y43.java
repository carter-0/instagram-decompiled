package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class Y43<K, V> implements C284925Ox, Map<K, V>, AnonymousClass0s2 {
    public AnonymousClass5P2 A00;
    public final Collection A01;
    public final Set A02;
    public final Set A03;

    public final XGP A00() {
        AnonymousClass5P2 r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (XGP) AnonymousClass5P3.A07(this, r1);
    }

    public final void E4K(AnonymousClass5P2 r2) {
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.A00 = r2;
    }

    public final void clear() {
        Snapshot A002;
        AnonymousClass5P2 r0 = this.A00;
        0qQ.A0C(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C284985Pf r5 = C284985Pf.A02;
        0qQ.A0C(r5, C273654mx.A00(349));
        if (r5 != ((XGP) AnonymousClass5P3.A08(r0)).A01) {
            AnonymousClass5P2 r02 = this.A00;
            0qQ.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                XGP xgp = (XGP) AnonymousClass5P3.A02(A002, this, r02);
                synchronized (C21524Xds.A00) {
                    xgp.A01 = r5;
                    xgp.A00++;
                }
            }
            AnonymousClass5P3.A0H(A002, this);
        }
    }

    public final Object put(Object obj, Object obj2) {
        C284995Pg r1;
        int i;
        Object put;
        Snapshot A002;
        boolean z;
        do {
            Object obj3 = C21524Xds.A00;
            synchronized (obj3) {
                AnonymousClass5P2 r0 = this.A00;
                XGP A05 = C21053XCe.A05(r0, r0);
                r1 = A05.A01;
                i = A05.A00;
            }
            0qQ.A0A(r1);
            C286855Yb AEp = r1.AEp();
            put = AEp.put(obj, obj2);
            C284995Pg AEC = AEp.AEC();
            if (0qQ.A0K(AEC, r1)) {
                break;
            }
            AnonymousClass5P2 r02 = this.A00;
            0qQ.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                XGP xgp = (XGP) AnonymousClass5P3.A02(A002, this, r02);
                synchronized (obj3) {
                    int i2 = xgp.A00;
                    z = true;
                    if (i2 == i) {
                        xgp.A01 = AEC;
                        xgp.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass5P3.A0H(A002, this);
        } while (!z);
        return put;
    }

    public final void putAll(Map map) {
        C284995Pg r1;
        int i;
        Snapshot A002;
        boolean z;
        do {
            Object obj = C21524Xds.A00;
            synchronized (obj) {
                AnonymousClass5P2 r0 = this.A00;
                XGP A05 = C21053XCe.A05(r0, r0);
                r1 = A05.A01;
                i = A05.A00;
            }
            0qQ.A0A(r1);
            C286855Yb AEp = r1.AEp();
            AEp.putAll(map);
            C284995Pg AEC = AEp.AEC();
            if (!0qQ.A0K(AEC, r1)) {
                AnonymousClass5P2 r02 = this.A00;
                0qQ.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (AnonymousClass5P3.A07) {
                    A002 = AnonymousClass5P3.A00();
                    XGP xgp = (XGP) AnonymousClass5P3.A02(A002, this, r02);
                    synchronized (obj) {
                        int i2 = xgp.A00;
                        z = true;
                        if (i2 == i) {
                            xgp.A01 = AEC;
                            xgp.A00 = i2 + 1;
                        } else {
                            z = false;
                        }
                    }
                }
                AnonymousClass5P3.A0H(A002, this);
            } else {
                return;
            }
        } while (!z);
    }

    public final Object remove(Object obj) {
        C284995Pg r1;
        int i;
        Object remove;
        Snapshot A002;
        boolean z;
        do {
            Object obj2 = C21524Xds.A00;
            synchronized (obj2) {
                AnonymousClass5P2 r0 = this.A00;
                XGP A05 = C21053XCe.A05(r0, r0);
                r1 = A05.A01;
                i = A05.A00;
            }
            0qQ.A0A(r1);
            C286855Yb AEp = r1.AEp();
            remove = AEp.remove(obj);
            C284995Pg AEC = AEp.AEC();
            if (0qQ.A0K(AEC, r1)) {
                break;
            }
            AnonymousClass5P2 r02 = this.A00;
            0qQ.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                XGP xgp = (XGP) AnonymousClass5P3.A02(A002, this, r02);
                synchronized (obj2) {
                    int i2 = xgp.A00;
                    z = true;
                    if (i2 == i) {
                        xgp.A01 = AEC;
                        xgp.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass5P3.A0H(A002, this);
        } while (!z);
        return remove;
    }

    public final String toString() {
        AnonymousClass5P2 r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SnapshotStateMap(value=");
        A1A.append(((XGP) AnonymousClass5P3.A08(r1)).A01);
        A1A.append(")@");
        A1A.append(hashCode());
        return A1A.toString();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.XGP, X.5P2] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.XGP, X.5P2] */
    public Y43() {
        C284985Pf r3 = C284985Pf.A02;
        0qQ.A0C(r3, C273654mx.A00(349));
        ? r2 = new AnonymousClass5P2();
        r2.A01 = r3;
        if (AnonymousClass5PH.A07()) {
            ? r1 = new AnonymousClass5P2();
            r1.A01 = r3;
            r1.A00 = 1;
            r2.A01 = r1;
        }
        this.A00 = r2;
        this.A02 = new Y45(this);
        this.A03 = new Y45(this);
        this.A01 = new Y45(this);
    }

    public final AnonymousClass5P2 B6D() {
        return this.A00;
    }

    public final boolean containsKey(Object obj) {
        return A00().A01.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return A00().A01.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return this.A02;
    }

    public final Object get(Object obj) {
        return A00().A01.get(obj);
    }

    public final boolean isEmpty() {
        return A00().A01.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return this.A03;
    }

    public final /* bridge */ int size() {
        return A00().A01.size();
    }

    public final /* bridge */ Collection values() {
        return this.A01;
    }

    public final /* synthetic */ AnonymousClass5P2 CoB(AnonymousClass5P2 r2, AnonymousClass5P2 r3, AnonymousClass5P2 r4) {
        return null;
    }
}
