package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* renamed from: X.Quu  reason: case insensitive filesystem */
public final class C8449Quu extends C13136TMu implements NavigableMap {
    public static final Comparator A03;
    public static final C8449Quu A04;
    public final transient C8448Qut A00;
    public final transient C8453Quy A01;
    public final transient C8449Quu A02;

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Comparator comparator() {
        return this.A01.A02;
    }

    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.A01.A02.compare(obj, obj2) <= 0) {
            return headMap(obj2, false).tailMap(obj, true);
        }
        throw AnonymousClass7TE.A0w(C9705RfO.A00("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    static {
        C8456Qv1 qv1 = C8456Qv1.A00;
        A03 = qv1;
        C8453Quy A022 = C8453Quy.A02(qv1);
        C8460Qv5 qv5 = C8448Qut.A00;
        A04 = new C8449Quu(C8447Qus.A02, (C8449Quu) null, A022);
    }

    private final C8449Quu A00(int i, int i2) {
        if (i == 0) {
            if (i2 == this.A00.size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return A01(this.A01.A02);
        }
        C8453Quy quy = this.A01;
        C8448Qut qut = this.A00;
        return new C8449Quu(qut.subList(i, i2), (C8449Quu) null, quy.A0A(i, i2));
    }

    public static C8449Quu A01(Comparator comparator) {
        if (C8456Qv1.A00.equals(comparator)) {
            return A04;
        }
        C8453Quy A022 = C8453Quy.A02(comparator);
        C8460Qv5 qv5 = C8448Qut.A00;
        return new C8449Quu(C8447Qus.A02, (C8449Quu) null, A022);
    }

    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.A01.descendingSet();
    }

    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C13098TLf quz;
        Comparator qv0;
        C8449Quu quu = this.A02;
        if (quu != null) {
            return quu;
        }
        boolean isEmpty = isEmpty();
        C8453Quy quy = this.A01;
        if (isEmpty) {
            Comparator comparator = quy.A02;
            if (comparator instanceof C13098TLf) {
                quz = (C13098TLf) comparator;
            } else {
                quz = new C8454Quz(comparator);
            }
            if (quz instanceof C8455Qv0) {
                qv0 = ((C8455Qv0) quz).A00;
            } else if (quz instanceof C8457Qv2) {
                qv0 = C8456Qv1.A00;
            } else if (quz instanceof C8456Qv1) {
                qv0 = C8457Qv2.A00;
            } else {
                qv0 = new C8455Qv0(quz);
            }
            return A01(qv0);
        }
        return new C8449Quu(this.A00.A08(), this, quy.descendingSet());
    }

    public final Object firstKey() {
        return this.A01.first();
    }

    public final Object lastKey() {
        return this.A01.last();
    }

    public final int size() {
        return this.A00.size();
    }

    public C8449Quu(C8448Qut qut, C8449Quu quu, C8453Quy quy) {
        this.A01 = quy;
        this.A00 = qut;
        this.A02 = quu;
    }

    /* renamed from: A03 */
    public final C8449Quu headMap(Object obj, boolean z) {
        obj.getClass();
        C8453Quy quy = this.A01;
        int binarySearch = Collections.binarySearch(quy.A01, obj, quy.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else if (z) {
            binarySearch++;
        }
        return A00(0, binarySearch);
    }

    /* renamed from: A04 */
    public final C8449Quu tailMap(Object obj, boolean z) {
        obj.getClass();
        C8453Quy quy = this.A01;
        int binarySearch = Collections.binarySearch(quy.A01, obj, quy.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else if (!z) {
            binarySearch++;
        }
        return A00(binarySearch, this.A00.size());
    }

    public final Object ceilingKey(Object obj) {
        return Pxi.A0X(ceilingEntry(obj));
    }

    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) AnonymousClass7TE.A13(entrySet().A08());
    }

    public final Object floorKey(Object obj) {
        return Pxi.A0X(floorEntry(obj));
    }

    public final Object higherKey(Object obj) {
        return Pxi.A0X(higherEntry(obj));
    }

    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().A08().get(Pxe.A0A(this.A00));
    }

    public final Object lowerKey(Object obj) {
        return Pxi.A0X(lowerEntry(obj));
    }

    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw C66580MXl.A11();
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.A01.A02.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        throw AnonymousClass7TE.A0w(C9705RfO.A00("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
