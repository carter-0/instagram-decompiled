package X;

import java.util.Comparator;

public final class XFR implements Comparator {
    public static final XFR A00 = new Object();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        AnonymousClass7TG.A1N(obj, comparable);
        return comparable.compareTo(obj);
    }

    public final Comparator reversed() {
        return C22428Y3k.A00;
    }
}
