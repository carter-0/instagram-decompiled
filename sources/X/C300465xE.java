package X;

import com.facebook.msys.mci.NotificationCenter;

/* renamed from: X.5xE  reason: invalid class name and case insensitive filesystem */
public final class C300465xE {
    public static NotificationCenter A00;

    public static synchronized NotificationCenter A00() {
        NotificationCenter notificationCenter;
        synchronized (C300465xE.class) {
            notificationCenter = A00;
            if (notificationCenter == null) {
                notificationCenter = new NotificationCenter();
                A00 = notificationCenter;
            }
        }
        return notificationCenter;
    }
}
