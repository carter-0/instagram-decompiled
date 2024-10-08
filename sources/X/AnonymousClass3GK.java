package X;

import java.util.ArrayDeque;

/* renamed from: X.3GK  reason: invalid class name */
public final class AnonymousClass3GK extends ArrayDeque {
    public static final AnonymousClass3GK A00 = new ArrayDeque();

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null) {
            return super.contains((Object) null);
        }
        return false;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null) {
            return super.remove((Object) null);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
