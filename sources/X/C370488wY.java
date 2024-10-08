package X;

import android.service.notification.StatusBarNotification;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8wY  reason: invalid class name and case insensitive filesystem */
public final class C370488wY implements Comparator {
    public final int compare(Object obj, Object obj2) {
        Long valueOf;
        Object value = ((Map.Entry) obj2).getValue();
        0qQ.A07(value);
        Iterator it = ((Iterable) value).iterator();
        Long l = null;
        if (!it.hasNext()) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(((StatusBarNotification) it.next()).getPostTime());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((StatusBarNotification) it.next()).getPostTime());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        }
        Object value2 = ((Map.Entry) obj).getValue();
        0qQ.A07(value2);
        Iterator it2 = ((Iterable) value2).iterator();
        if (it2.hasNext()) {
            Long valueOf3 = Long.valueOf(((StatusBarNotification) it2.next()).getPostTime());
            loop0:
            while (true) {
                l = valueOf3;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop0;
                    }
                    valueOf3 = Long.valueOf(((StatusBarNotification) it2.next()).getPostTime());
                    if (l.compareTo(valueOf3) < 0) {
                    }
                }
            }
        }
        return 29b.A00(valueOf, l);
    }
}
