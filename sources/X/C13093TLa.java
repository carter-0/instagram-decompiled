package X;

import java.net.Inet4Address;
import java.util.Comparator;

/* renamed from: X.TLa  reason: case insensitive filesystem */
public final class C13093TLa implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass7TG.A1N(obj, obj2);
        boolean z = obj2 instanceof Inet4Address;
        if (obj instanceof Inet4Address) {
            if (!z) {
                return -1;
            }
            return 0;
        } else if (z) {
            return 1;
        } else {
            return 0;
        }
    }
}
