package X;

import java.util.Comparator;

/* renamed from: X.TLf  reason: case insensitive filesystem */
public abstract class C13098TLf implements Comparator {
    public final int compare(Object obj, Object obj2) {
        if (this instanceof C8455Qv0) {
            return ((C8455Qv0) this).A00.compare(obj2, obj);
        }
        if (this instanceof C8457Qv2) {
            Comparable comparable = (Comparable) obj2;
            obj.getClass();
            if (obj == comparable) {
                return 0;
            }
            return comparable.compareTo(obj);
        } else if (!(this instanceof C8456Qv1)) {
            return ((C8454Quz) this).A00.compare(obj, obj2);
        } else {
            Comparable comparable2 = (Comparable) obj;
            comparable2.getClass();
            obj2.getClass();
            return comparable2.compareTo(obj2);
        }
    }
}
