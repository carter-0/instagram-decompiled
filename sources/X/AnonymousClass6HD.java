package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.6HD  reason: invalid class name */
public final class AnonymousClass6HD<T> implements C284925Ox, List<T>, RandomAccess, AnonymousClass07u {
    public AnonymousClass5P2 A00;

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return 0q3.A01(this, objArr);
    }

    private final boolean A00(0sP r10) {
        int i;
        AnonymousClass6HG r1;
        Object invoke;
        Snapshot A002;
        boolean z;
        do {
            Object obj = C18284Vp7.A00;
            synchronized (obj) {
                AnonymousClass5P2 r0 = this.A00;
                0qQ.A0C(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                AnonymousClass6HI r02 = (AnonymousClass6HI) AnonymousClass5P3.A08((AnonymousClass6HI) r0);
                i = r02.A00;
                r1 = r02.A02;
            }
            0qQ.A0A(r1);
            C20583WvB AEq = r1.AEq();
            invoke = r10.invoke(AEq);
            AnonymousClass6HG A0P = AEq.A0P();
            if (0qQ.A0K(A0P, r1)) {
                break;
            }
            AnonymousClass5P2 r03 = this.A00;
            0qQ.A0C(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                AnonymousClass6HI r2 = (AnonymousClass6HI) AnonymousClass5P3.A02(A002, this, r03);
                synchronized (obj) {
                    int i2 = r2.A00;
                    z = true;
                    if (i2 == i) {
                        r2.A02 = A0P;
                        r2.A00 = i2 + 1;
                        r2.A01++;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass5P3.A0H(A002, this);
        } while (!z);
        return ((Boolean) invoke).booleanValue();
    }

    public final int A01() {
        AnonymousClass5P2 r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((AnonymousClass6HI) AnonymousClass5P3.A08(r1)).A01;
    }

    public final AnonymousClass6HI A02() {
        AnonymousClass5P2 r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (AnonymousClass6HI) AnonymousClass5P3.A07(this, r1);
    }

    public final AnonymousClass5P2 B6D() {
        return this.A00;
    }

    public final void E4K(AnonymousClass5P2 r2) {
        r2.A01 = this.A00;
        this.A00 = r2;
    }

    public final boolean add(Object obj) {
        int i;
        AnonymousClass6HG r0;
        boolean z;
        Snapshot A002;
        do {
            Object obj2 = C18284Vp7.A00;
            synchronized (obj2) {
                AnonymousClass5P2 r02 = this.A00;
                0qQ.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                AnonymousClass6HI r03 = (AnonymousClass6HI) AnonymousClass5P3.A08((AnonymousClass6HI) r02);
                i = r03.A00;
                r0 = r03.A02;
            }
            0qQ.A0A(r0);
            AnonymousClass6HG A7O = r0.A7O(obj);
            z = false;
            if (0qQ.A0K(A7O, r0)) {
                return false;
            }
            AnonymousClass5P2 r04 = this.A00;
            0qQ.A0C(r04, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                AnonymousClass6HI r2 = (AnonymousClass6HI) AnonymousClass5P3.A02(A002, this, r04);
                synchronized (obj2) {
                    int i2 = r2.A00;
                    if (i2 == i) {
                        r2.A02 = A7O;
                        r2.A01++;
                        r2.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            AnonymousClass5P3.A0H(A002, this);
        } while (!z);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.util.AbstractCollection, X.WvB] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean addAll(java.util.Collection r11) {
        /*
            r10 = this;
        L_0x0000:
            java.lang.Object r9 = X.C18284Vp7.A00
            monitor-enter(r9)
            X.5P2 r0 = r10.A00     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            X.0qQ.A0C(r0, r8)     // Catch:{ all -> 0x00a9 }
            X.6HI r0 = (X.AnonymousClass6HI) r0     // Catch:{ all -> 0x00a9 }
            X.5P2 r0 = X.AnonymousClass5P3.A08(r0)     // Catch:{ all -> 0x00a9 }
            X.6HI r0 = (X.AnonymousClass6HI) r0     // Catch:{ all -> 0x00a9 }
            int r7 = r0.A00     // Catch:{ all -> 0x00a9 }
            X.6HG r5 = r0.A02     // Catch:{ all -> 0x00a9 }
            monitor-exit(r9)
            X.0qQ.A0A(r5)
            boolean r0 = r5 instanceof X.AnonymousClass6HE
            if (r0 == 0) goto L_0x0063
            r3 = r5
            X.6HE r3 = (X.AnonymousClass6HE) r3
            int r1 = r3.size()
            int r0 = r11.size()
            int r1 = r1 + r0
            r0 = 32
            if (r1 > r0) goto L_0x005e
            java.lang.Object[] r2 = r3.A00
            int r1 = r3.size()
            int r0 = r11.size()
            int r1 = r1 + r0
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r2, r1)
            X.0qQ.A07(r4)
            int r3 = r3.size()
            java.util.Iterator r2 = r11.iterator()
        L_0x0048:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r1 = r2.next()
            int r0 = r3 + 1
            r4[r3] = r1
            r3 = r0
            goto L_0x0048
        L_0x0058:
            X.6HE r6 = new X.6HE
            r6.<init>(r4)
            goto L_0x006e
        L_0x005e:
            X.WvB r0 = r3.AEq()
            goto L_0x0067
        L_0x0063:
            X.WvB r0 = r5.AEq()
        L_0x0067:
            r0.addAll(r11)
            X.6HG r6 = r0.A0P()
        L_0x006e:
            boolean r0 = X.0qQ.A0K(r6, r5)
            r5 = 0
            if (r0 != 0) goto L_0x00a8
            X.5P2 r0 = r10.A00
            X.0qQ.A0C(r0, r8)
            java.lang.Object r4 = X.AnonymousClass5P3.A07
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.Snapshot r3 = X.AnonymousClass5P3.A00()     // Catch:{ all -> 0x00a5 }
            X.5P2 r2 = X.AnonymousClass5P3.A02(r3, r10, r0)     // Catch:{ all -> 0x00a5 }
            X.6HI r2 = (X.AnonymousClass6HI) r2     // Catch:{ all -> 0x00a5 }
            monitor-enter(r9)     // Catch:{ all -> 0x00a5 }
            int r1 = r2.A00     // Catch:{ all -> 0x00a2 }
            if (r1 != r7) goto L_0x0099
            r2.A02 = r6     // Catch:{ all -> 0x00a2 }
            int r0 = r2.A01     // Catch:{ all -> 0x00a2 }
            int r0 = r0 + 1
            r2.A01 = r0     // Catch:{ all -> 0x00a2 }
            int r0 = r1 + 1
            r2.A00 = r0     // Catch:{ all -> 0x00a2 }
            r5 = 1
        L_0x0099:
            monitor-exit(r9)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)
            X.AnonymousClass5P3.A0H(r3, r10)
            if (r5 == 0) goto L_0x0000
            r5 = 1
            return r5
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00a8:
            return r5
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6HD.addAll(java.util.Collection):boolean");
    }

    public final void clear() {
        Snapshot A002;
        AnonymousClass5P2 r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (AnonymousClass5P3.A07) {
            A002 = AnonymousClass5P3.A00();
            AnonymousClass6HI r2 = (AnonymousClass6HI) AnonymousClass5P3.A02(A002, this, r1);
            synchronized (C18284Vp7.A00) {
                r2.A02 = AnonymousClass6HE.A01;
                r2.A00++;
                r2.A01++;
            }
        }
        AnonymousClass5P3.A0H(A002, this);
    }

    public final ListIterator listIterator(int i) {
        return new C20391WqX(this, i);
    }

    public final boolean remove(Object obj) {
        int i;
        AnonymousClass6HG r2;
        boolean z;
        Snapshot A002;
        do {
            Object obj2 = C18284Vp7.A00;
            synchronized (obj2) {
                AnonymousClass5P2 r0 = this.A00;
                0qQ.A0C(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                AnonymousClass6HI r02 = (AnonymousClass6HI) AnonymousClass5P3.A08((AnonymousClass6HI) r0);
                i = r02.A00;
                r2 = r02.A02;
            }
            0qQ.A0A(r2);
            AnonymousClass6HG r6 = (AnonymousClass6HF) r2;
            int indexOf = r6.indexOf(obj);
            if (indexOf != -1) {
                r6 = r6.EDL(indexOf);
            }
            z = false;
            if (0qQ.A0K(r6, r2)) {
                return false;
            }
            AnonymousClass5P2 r03 = this.A00;
            0qQ.A0C(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                AnonymousClass6HI r22 = (AnonymousClass6HI) AnonymousClass5P3.A02(A002, this, r03);
                synchronized (obj2) {
                    int i2 = r22.A00;
                    if (i2 == i) {
                        r22.A02 = r6;
                        r22.A01++;
                        r22.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            AnonymousClass5P3.A0H(A002, this);
        } while (!z);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int i;
        AnonymousClass6HG r2;
        boolean z;
        Snapshot A002;
        do {
            Object obj = C18284Vp7.A00;
            synchronized (obj) {
                AnonymousClass5P2 r0 = this.A00;
                0qQ.A0C(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                AnonymousClass6HI r02 = (AnonymousClass6HI) AnonymousClass5P3.A08((AnonymousClass6HI) r0);
                i = r02.A00;
                r2 = r02.A02;
            }
            0qQ.A0A(r2);
            AnonymousClass6HG EDB = r2.EDB(new J6M(collection, 21));
            z = false;
            if (0qQ.A0K(EDB, r2)) {
                return false;
            }
            AnonymousClass5P2 r03 = this.A00;
            0qQ.A0C(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                AnonymousClass6HI r22 = (AnonymousClass6HI) AnonymousClass5P3.A02(A002, this, r03);
                synchronized (obj) {
                    int i2 = r22.A00;
                    if (i2 == i) {
                        r22.A02 = EDB;
                        r22.A01++;
                        r22.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            AnonymousClass5P3.A0H(A002, this);
        } while (!z);
        return true;
    }

    public final boolean retainAll(Collection collection) {
        return A00(new J6M(collection, 23));
    }

    public final List subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= size()) {
            return new C20388WqU(this, i, i2);
        }
        C18086VlG.A00("fromIndex or toIndex are out of bounds");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String toString() {
        AnonymousClass5P2 r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StringBuilder sb = new StringBuilder();
        sb.append("SnapshotStateList(value=");
        sb.append(((AnonymousClass6HI) AnonymousClass5P3.A08(r1)).A02);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.5P2, X.6HI] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.5P2, X.6HI] */
    public AnonymousClass6HD() {
        AnonymousClass6HE r3 = AnonymousClass6HE.A01;
        ? r2 = new AnonymousClass5P2();
        r2.A02 = r3;
        if (AnonymousClass5PH.A07()) {
            ? r1 = new AnonymousClass5P2();
            r1.A02 = r3;
            r1.A00 = 1;
            r2.A01 = r1;
        }
        this.A00 = r2;
    }

    public final boolean contains(Object obj) {
        return A02().A02.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return A02().A02.containsAll(collection);
    }

    public final Object get(int i) {
        return A02().A02.get(i);
    }

    public final int indexOf(Object obj) {
        return A02().A02.indexOf(obj);
    }

    public final boolean isEmpty() {
        return A02().A02.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final int lastIndexOf(Object obj) {
        return A02().A02.lastIndexOf(obj);
    }

    public final Object set(int i, Object obj) {
        int i2;
        AnonymousClass6HG r0;
        Snapshot A002;
        boolean z;
        Object obj2 = get(i);
        do {
            Object obj3 = C18284Vp7.A00;
            synchronized (obj3) {
                AnonymousClass5P2 r02 = this.A00;
                0qQ.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                AnonymousClass6HI r03 = (AnonymousClass6HI) AnonymousClass5P3.A08((AnonymousClass6HI) r02);
                i2 = r03.A00;
                r0 = r03.A02;
            }
            0qQ.A0A(r0);
            AnonymousClass6HG ENM = r0.ENM(obj, i);
            if (0qQ.A0K(ENM, r0)) {
                return obj2;
            }
            AnonymousClass5P2 r04 = this.A00;
            0qQ.A0C(r04, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                AnonymousClass6HI r2 = (AnonymousClass6HI) AnonymousClass5P3.A02(A002, this, r04);
                synchronized (obj3) {
                    int i3 = r2.A00;
                    z = true;
                    if (i3 == i2) {
                        r2.A02 = ENM;
                        r2.A00 = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass5P3.A0H(A002, this);
        } while (!z);
        return obj2;
    }

    public final /* bridge */ int size() {
        return A02().A02.size();
    }

    public final /* synthetic */ AnonymousClass5P2 CoB(AnonymousClass5P2 r2, AnonymousClass5P2 r3, AnonymousClass5P2 r4) {
        return null;
    }

    public final void add(int i, Object obj) {
        int i2;
        AnonymousClass6HG r0;
        Snapshot A002;
        boolean z;
        do {
            Object obj2 = C18284Vp7.A00;
            synchronized (obj2) {
                AnonymousClass5P2 r02 = this.A00;
                0qQ.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                AnonymousClass6HI r03 = (AnonymousClass6HI) AnonymousClass5P3.A08((AnonymousClass6HI) r02);
                i2 = r03.A00;
                r0 = r03.A02;
            }
            0qQ.A0A(r0);
            AnonymousClass6HG A7j = r0.A7j(obj, i);
            if (!0qQ.A0K(A7j, r0)) {
                AnonymousClass5P2 r04 = this.A00;
                0qQ.A0C(r04, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (AnonymousClass5P3.A07) {
                    A002 = AnonymousClass5P3.A00();
                    AnonymousClass6HI r3 = (AnonymousClass6HI) AnonymousClass5P3.A02(A002, this, r04);
                    synchronized (obj2) {
                        int i3 = r3.A00;
                        z = true;
                        if (i3 == i2) {
                            r3.A02 = A7j;
                            r3.A01++;
                            r3.A00 = i3 + 1;
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

    public final boolean addAll(int i, Collection collection) {
        return A00(new C58735Iwi(i, 1, collection));
    }

    public final ListIterator listIterator() {
        return new C20391WqX(this, 0);
    }

    public final /* bridge */ Object remove(int i) {
        int i2;
        AnonymousClass6HG r0;
        Snapshot A002;
        boolean z;
        Object obj = get(i);
        do {
            Object obj2 = C18284Vp7.A00;
            synchronized (obj2) {
                AnonymousClass5P2 r02 = this.A00;
                0qQ.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                AnonymousClass6HI r03 = (AnonymousClass6HI) AnonymousClass5P3.A08((AnonymousClass6HI) r02);
                i2 = r03.A00;
                r0 = r03.A02;
            }
            0qQ.A0A(r0);
            AnonymousClass6HG EDL = r0.EDL(i);
            if (0qQ.A0K(EDL, r0)) {
                return obj;
            }
            AnonymousClass5P2 r04 = this.A00;
            0qQ.A0C(r04, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass5P3.A07) {
                A002 = AnonymousClass5P3.A00();
                AnonymousClass6HI r3 = (AnonymousClass6HI) AnonymousClass5P3.A02(A002, this, r04);
                synchronized (obj2) {
                    int i3 = r3.A00;
                    z = true;
                    if (i3 == i2) {
                        r3.A02 = EDL;
                        r3.A01++;
                        r3.A00 = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass5P3.A0H(A002, this);
        } while (!z);
        return obj;
    }
}
