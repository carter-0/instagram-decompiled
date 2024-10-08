package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class XGJ<K, V> extends Y45<K, V, Map.Entry<K, V>> {
    public final boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if ((obj instanceof C62650uo) && !(obj instanceof AnonymousClass0s3)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return 0qQ.A0K(this.A00.get(entry.getKey()), entry.getValue());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Iterator, X.Xd7] */
    public final Iterator iterator() {
        Y43 y43 = this.A00;
        return new C21502Xd7(y43, AnonymousClass7TF.A0u(y43.A00().A01));
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if (!(obj instanceof C62650uo) || (obj instanceof AnonymousClass0s3)) {
            return AnonymousClass7TF.A1V(this.A00.remove(((Map.Entry) obj).getKey()));
        }
        return false;
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
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (this.A00.remove(AnonymousClass7TE.A1J(it).getKey()) != null || z) {
                    z = true;
                }
            }
        }
    }

    public final boolean retainAll(Collection collection) {
        C284995Pg r8;
        int i;
        boolean z;
        Snapshot A00;
        LinkedHashMap A0x = DbS.A0x(C21055XCg.A00(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(it);
            A0x.put(A1J.getKey(), A1J.getValue());
        }
        Y43 y43 = this.A00;
        boolean z2 = false;
        do {
            Object obj = C21524Xds.A00;
            synchronized (obj) {
                AnonymousClass5P2 r0 = y43.A00;
                XGP A05 = C21053XCe.A05(r0, r0);
                r8 = A05.A01;
                i = A05.A00;
            }
            0qQ.A0A(r8);
            C286855Yb AEp = r8.AEp();
            Iterator it2 = y43.entrySet().iterator();
            z = true;
            while (it2.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(it2);
                if (!A0x.containsKey(A1J2.getKey()) || !0qQ.A0K(A0x.get(A1J2.getKey()), A1J2.getValue())) {
                    AEp.remove(A1J2.getKey());
                    z2 = true;
                }
            }
            C284995Pg AEC = AEp.AEC();
            if (0qQ.A0K(AEC, r8)) {
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
