package X;

import java.util.Comparator;

/* renamed from: X.Y3k  reason: case insensitive filesystem */
public final class C22428Y3k implements Comparator {
    public static final C22428Y3k A00 = new Object();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        AnonymousClass7TG.A1N(comparable, obj2);
        return comparable.compareTo(obj2);
    }

    public final Comparator reversed() {
        return XFR.A00;
    }
}
