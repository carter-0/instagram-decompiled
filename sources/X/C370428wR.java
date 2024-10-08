package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.8wR  reason: invalid class name and case insensitive filesystem */
public final class C370428wR {
    public int A00;
    public int A01;
    public int A02;
    public PendingIntent A03;
    public PendingIntent A04;
    public IconCompat A05;
    public String A06;

    public static Notification.BubbleMetadata A00(C370428wR r3) {
        if (r3 == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C21509Xdb.A00(r3);
        }
        if (i == 29) {
            return C21508Xda.A00(r3);
        }
        return null;
    }

    public static C370428wR A01(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C21509Xdb.A01(bubbleMetadata);
        }
        if (i == 29) {
            return C21508Xda.A01(bubbleMetadata);
        }
        return null;
    }
}
