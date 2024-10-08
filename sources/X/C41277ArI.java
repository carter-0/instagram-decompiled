package X;

import android.service.notification.StatusBarNotification;
import java.util.Comparator;

/* renamed from: X.ArI  reason: case insensitive filesystem */
public final class C41277ArI implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return 29b.A00(Long.valueOf(((StatusBarNotification) obj2).getPostTime()), Long.valueOf(((StatusBarNotification) obj).getPostTime()));
    }
}
