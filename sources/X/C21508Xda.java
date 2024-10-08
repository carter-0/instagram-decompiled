package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.Xda  reason: case insensitive filesystem */
public abstract class C21508Xda {
    public static Notification.BubbleMetadata A00(C370428wR r4) {
        PendingIntent pendingIntent = r4.A04;
        if (pendingIntent == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder deleteIntent = new Notification.BubbleMetadata.Builder().setIcon(C66773McJ.A00((Context) null, r4.A05)).setIntent(pendingIntent).setDeleteIntent(r4.A03);
        boolean z = true;
        if ((r4.A02 & 1) == 0) {
            z = false;
        }
        Notification.BubbleMetadata.Builder suppressNotification = deleteIntent.setAutoExpandBubble(z).setSuppressNotification(AnonymousClass7TF.A1P(r4.A02 & 2));
        int i = r4.A00;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        int i2 = r4.A01;
        if (i2 != 0) {
            suppressNotification.setDesiredHeightResId(i2);
        }
        return suppressNotification.build();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Xbx, java.lang.Object] */
    public static C370428wR A01(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata.getIntent() == null) {
            return null;
        }
        PendingIntent intent = bubbleMetadata.getIntent();
        IconCompat A01 = C66773McJ.A01(bubbleMetadata.getIcon());
        ? obj = new Object();
        if (intent != null) {
            obj.A04 = intent;
            obj.A05 = A01;
            boolean autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
            int i = obj.A02;
            int i2 = i & -2;
            if (autoExpandBubble) {
                i2 = i | 1;
            }
            obj.A02 = i2;
            obj.A03 = bubbleMetadata.getDeleteIntent();
            boolean isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
            int i3 = obj.A02;
            int i4 = i3 & -3;
            if (isNotificationSuppressed) {
                i4 = i3 | 2;
            }
            obj.A02 = i4;
            if (bubbleMetadata.getDesiredHeight() != 0) {
                obj.A00 = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                obj.A01 = 0;
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                obj.A01 = bubbleMetadata.getDesiredHeightResId();
                obj.A00 = 0;
            }
            return obj.A00();
        }
        throw AnonymousClass7TE.A11("Bubble requires non-null pending intent");
    }
}
