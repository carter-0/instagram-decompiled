package X;

import android.app.Notification;
import android.os.Bundle;
import androidx.core.app.NotificationCompat$BigPictureStyle;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.core.app.NotificationCompat$InboxStyle;
import java.util.Iterator;

public abstract class AA2 {
    public AnonymousClass9T8 A00;
    public CharSequence A01;
    public CharSequence A02;
    public boolean A03 = false;

    public void A01(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public final void A02(AnonymousClass9T8 r2) {
        if (this.A00 != r2) {
            this.A00 = r2;
            r2.A0A(this);
        }
    }

    public String A03() {
        if (this instanceof NotificationCompat$BigPictureStyle) {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
        if (this instanceof NotificationCompat$BigTextStyle) {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }
        if (this instanceof NotificationCompat$InboxStyle) {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    public void A04(Bundle bundle) {
        if (this.A03) {
            bundle.putCharSequence("android.summaryText", this.A02);
        }
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", A03());
    }

    public void A05(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.A02 = bundle.getCharSequence("android.summaryText");
            this.A03 = true;
        }
        this.A01 = bundle.getCharSequence("android.title.big");
    }

    public void A06(C370408wO r5) {
        if (this instanceof NotificationCompat$BigTextStyle) {
            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = (NotificationCompat$BigTextStyle) this;
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(((C370398wN) r5).A04).setBigContentTitle(notificationCompat$BigTextStyle.A01).bigText(notificationCompat$BigTextStyle.A00);
            if (notificationCompat$BigTextStyle.A03) {
                bigText.setSummaryText(notificationCompat$BigTextStyle.A02);
            }
        } else if (this instanceof NotificationCompat$InboxStyle) {
            NotificationCompat$InboxStyle notificationCompat$InboxStyle = (NotificationCompat$InboxStyle) this;
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((C370398wN) r5).A04).setBigContentTitle(notificationCompat$InboxStyle.A01);
            if (notificationCompat$InboxStyle.A03) {
                bigContentTitle.setSummaryText(notificationCompat$InboxStyle.A02);
            }
            Iterator it = notificationCompat$InboxStyle.A00.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        } else {
            ((C370398wN) r5).A04.setStyle(new Notification.DecoratedCustomViewStyle());
        }
    }
}
