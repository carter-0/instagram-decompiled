package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.Xdb  reason: case insensitive filesystem */
public abstract class C21509Xdb {
    public static Notification.BubbleMetadata A00(C370428wR r4) {
        Notification.BubbleMetadata.Builder builder;
        String str = r4.A06;
        if (str != null) {
            builder = new Notification.BubbleMetadata.Builder(str);
        } else {
            builder = new Notification.BubbleMetadata.Builder(r4.A04, C66773McJ.A00((Context) null, r4.A05));
        }
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(r4.A03);
        boolean z = true;
        if ((r4.A02 & 1) == 0) {
            z = false;
        }
        deleteIntent.setAutoExpandBubble(z).setSuppressNotification(AnonymousClass7TF.A1P(r4.A02 & 2));
        int i = r4.A00;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        int i2 = r4.A01;
        if (i2 != 0) {
            builder.setDesiredHeightResId(i2);
        }
        return builder.build();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Xbx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.Xbx, java.lang.Object] */
    public static C370428wR A01(Notification.BubbleMetadata bubbleMetadata) {
        C21465Xbx xbx;
        if (bubbleMetadata.getShortcutId() != null) {
            String shortcutId = bubbleMetadata.getShortcutId();
            ? obj = new Object();
            if (!TextUtils.isEmpty(shortcutId)) {
                obj.A06 = shortcutId;
                xbx = obj;
            } else {
                throw AnonymousClass7TE.A11("Bubble requires a non-null shortcut id");
            }
        } else {
            PendingIntent intent = bubbleMetadata.getIntent();
            IconCompat A01 = C66773McJ.A01(bubbleMetadata.getIcon());
            ? obj2 = new Object();
            if (intent != null) {
                obj2.A04 = intent;
                obj2.A05 = A01;
                xbx = obj2;
            } else {
                throw AnonymousClass7TE.A11("Bubble requires non-null pending intent");
            }
        }
        boolean autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
        int i = xbx.A02;
        int i2 = i & -2;
        if (autoExpandBubble) {
            i2 = i | 1;
        }
        xbx.A02 = i2;
        xbx.A03 = bubbleMetadata.getDeleteIntent();
        boolean isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
        int i3 = xbx.A02;
        int i4 = i3 & -3;
        if (isNotificationSuppressed) {
            i4 = i3 | 2;
        }
        xbx.A02 = i4;
        if (bubbleMetadata.getDesiredHeight() != 0) {
            xbx.A00 = Math.max(bubbleMetadata.getDesiredHeight(), 0);
            xbx.A01 = 0;
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            xbx.A01 = bubbleMetadata.getDesiredHeightResId();
            xbx.A00 = 0;
        }
        return xbx.A00();
    }
}
