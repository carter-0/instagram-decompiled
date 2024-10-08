package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class XGL<K, V> extends Y45<K, V, V> {
    public final boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object containsValue : collection) {
                if (!this.A00.containsValue(containsValue)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Iterator, X.Xd7] */
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        Y43 y43 = this.A00;
        return new C21502Xd7(y43, AnonymousClass7TF.A0u(y43.A00().A01));
    }

    public final boolean remove(Object obj) {
        Object obj2;
        Y43 y43 = this.A00;
        Iterator it = y43.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (0qQ.A0K(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        y43.remove(entry.getKey());
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        C21524Xds.A00();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        C21524Xds.A00();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean removeAll(Collection collection) {
        C284995Pg r9;
        int i;
        boolean z;
        Snapshot A00;
        Set A0k = 00k.A0k(collection);
        Y43 y43 = this.A00;
        boolean z2 = false;
        do {
            Object obj = C21524Xds.A00;
            synchronized (obj) {
                AnonymousClass5P2 r0 = y43.A00;
                XGP A05 = C21053XCe.A05(r0, r0);
                r9 = A05.A01;
                i = A05.A00;
            }
            0qQ.A0A(r9);
            C286855Yb AEp = r9.AEp();
            Iterator it = y43.entrySet().iterator();
            z = true;
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                if (A0k.contains(A1J.getValue())) {
                    AEp.remove(A1J.getKey());
                    z2 = true;
                }
            }
            C284995Pg AEC = AEp.AEC();
            if (0qQ.A0K(AEC, r9)) {
                break;
            }
            AnonymousClass5P2 r02 = y43.A00;
            0qQ.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AnonymousClass5P3.A07) {
                A00 = AnonymousClass5P3.A00();
                XGP xgp = (XGP) AnonymousClass5P3.A02(A00, y43, r02);
                synchronized (obj) {
                    int i2 = xgp.A00;
                    if (i2 == i) {
                        xgp.A01 = AEC;
                        xgp.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass5P3.A0H(A00, y43);
        } while (!z);
        return z2;
    }

    public final boolean retainAll(Collection collection) {
        C284995Pg r9;
        int i;
        boolean z;
        Snapshot A00;
        Set A0k = 00k.A0k(collection);
        Y43 y43 = this.A00;
        boolean z2 = false;
        do {
            Object obj = C21524Xds.A00;
            synchronized (obj) {
                AnonymousClass5P2 r0 = y43.A00;
                XGP A05 = C21053XCe.A05(r0, r0);
                r9 = A05.A01;
                i = A05.A00;
            }
            0qQ.A0A(r9);
            C286855Yb AEp = r9.AEp();
            Iterator it = y43.entrySet().iterator();
            z = true;
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                if (!A0k.contains(A1J.getValue())) {
                    AEp.remove(A1J.getKey());
                    z2 = true;
                }
            }
            C284995Pg AEC = AEp.AEC();
            if (0qQ.A0K(AEC, r9)) {
                break;
            }
            AnonymousClass5P2 r02 = y43.A00;
            0qQ.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AnonymousClass5P3.A07) {
                A00 = AnonymousClass5P3.A00();
                XGP xgp = (XGP) AnonymousClass5P3.A02(A00, y43, r02);
                synchronized (obj) {
                    int i2 = xgp.A00;
                    if (i2 == i) {
                        xgp.A01 = AEC;
                        xgp.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass5P3.A0H(A00, y43);
        } while (!z);
        return z2;
    }
}
