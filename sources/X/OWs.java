package X;

import android.app.Notification;
import android.graphics.drawable.Icon;

public abstract class OWs {
    public static void A00(Notification.BigPictureStyle bigPictureStyle) {
        bigPictureStyle.setContentDescription((CharSequence) null);
    }

    public static void A01(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void A02(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }
}
