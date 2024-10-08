package X;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TS5<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public List A00 = Collections.emptyList();
    public Map A01 = Collections.emptyMap();
    public boolean A02;
    public Map A03 = Collections.emptyMap();
    public final int A04;
    public volatile TSM A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TS5)) {
            return super.equals(obj);
        }
        TS5 ts5 = (TS5) obj;
        int size = size();
        if (size == ts5.size()) {
            int size2 = this.A00.size();
            if (size2 != ts5.A00.size()) {
                return entrySet().equals(ts5.entrySet());
            }
            int i = 0;
            while (i < size2) {
                if (((Map.Entry) this.A00.get(i)).equals(ts5.A00.get(i))) {
                    i++;
                }
            }
            if (size2 != size) {
                return this.A01.equals(ts5.A01);
            }
            return true;
        }
        return false;
    }

    private int A00(Comparable comparable) {
        int i;
        int A06 = C51966G9m.A06(this.A00);
        if (A06 >= 0) {
            int compareTo = comparable.compareTo(((C13135TMt) this.A00.get(A06)).A01);
            if (compareTo > 0) {
                i = A06 + 2;
                return -i;
            } else if (compareTo == 0) {
                return A06;
            }
        }
        int i2 = 0;
        while (i2 <= A06) {
            int i3 = (i2 + A06) / 2;
            int compareTo2 = comparable.compareTo(((C13135TMt) this.A00.get(i3)).A01);
            if (compareTo2 < 0) {
                A06 = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        i = i2 + 1;
        return -i;
    }

    public static void A03(TS5 ts5) {
        if (ts5.A02) {
            throw C66580MXl.A11();
        }
    }

    public void A05() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.A02) {
            if (this.A01.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.A01);
            }
            this.A01 = unmodifiableMap;
            if (this.A03.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.A03);
            }
            this.A03 = unmodifiableMap2;
            this.A02 = true;
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (A00(comparable) >= 0 || this.A01.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Set entrySet() {
        if (this.A05 == null) {
            this.A05 = new TSM(this);
        }
        return this.A05;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return ((C13135TMt) this.A00.get(A002)).getValue();
        }
        return this.A01.get(comparable);
    }

    public final int hashCode() {
        int size = this.A00.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass7TE.A0N(this.A00.get(i2), i);
        }
        if (this.A01.size() > 0) {
            return i + this.A01.hashCode();
        }
        return i;
    }

    public final int size() {
        return this.A00.size() + this.A01.size();
    }

    public TS5(int i) {
        this.A04 = i;
    }

    public static Object A01(TS5 ts5, int i) {
        A03(ts5);
        Object value = ((C13135TMt) ts5.A00.remove(i)).getValue();
        if (!ts5.A01.isEmpty()) {
            Iterator it = ts5.A02().entrySet().iterator();
            List list = ts5.A00;
            Map.Entry A1J = AnonymousClass7TE.A1J(it);
            list.add(new C13135TMt(ts5, (Comparable) A1J.getKey(), A1J.getValue()));
            it.remove();
        }
        return value;
    }

    private SortedMap A02() {
        A03(this);
        if (this.A01.isEmpty() && !(this.A01 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.A01 = treeMap;
            this.A03 = treeMap.descendingMap();
        }
        return (SortedMap) this.A01;
    }

    /* renamed from: A04 */
    public final Object put(Comparable comparable, Object obj) {
        A03(this);
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return ((C13135TMt) this.A00.get(A002)).setValue(obj);
        }
        A03(this);
        if (this.A00.isEmpty() && !(this.A00 instanceof ArrayList)) {
            this.A00 = DbS.A0v(this.A04);
        }
        int i = -(A002 + 1);
        int i2 = this.A04;
        if (i >= i2) {
            return A02().put(comparable, obj);
        }
        if (this.A00.size() == i2) {
            C13135TMt tMt = (C13135TMt) this.A00.remove(i2 - 1);
            A02().put(tMt.A01, tMt.getValue());
        }
        this.A00.add(i, new C13135TMt(this, comparable, obj));
        return null;
    }

    public final void clear() {
        A03(this);
        if (!this.A00.isEmpty()) {
            this.A00.clear();
        }
        if (!this.A01.isEmpty()) {
            this.A01.clear();
        }
    }

    public final Object remove(Object obj) {
        A03(this);
        Comparable comparable = (Comparable) obj;
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return A01(this, A002);
        }
        if (this.A01.isEmpty()) {
            return null;
        }
        return this.A01.remove(comparable);
    }
}
