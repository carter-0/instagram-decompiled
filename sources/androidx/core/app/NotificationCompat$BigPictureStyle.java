package androidx.core.app;

import X.AA2;
import X.C370398wN;
import X.C370408wO;
import X.C66773McJ;
import X.OWs;
import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

public final class NotificationCompat$BigPictureStyle extends AA2 {
    public IconCompat A00;
    public IconCompat A01;
    public boolean A02;
    public boolean A03;

    public final void A06(C370408wO r8) {
        C370398wN r82 = (C370398wN) r8;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(r82.A04).setBigContentTitle(this.A01);
        IconCompat iconCompat = this.A01;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                OWs.A01(bigContentTitle, C66773McJ.A00(r82.A05, iconCompat));
            } else {
                int i = iconCompat.A02;
                if (i == -1) {
                    i = ((Icon) iconCompat.A06).getType();
                }
                if (i == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.A01.A05());
                }
            }
        }
        if (this.A02) {
            IconCompat iconCompat2 = this.A00;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(C66773McJ.A00(r82.A05, iconCompat2));
            }
        }
        if (this.A03) {
            bigContentTitle.setSummaryText(this.A02);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            OWs.A02(bigContentTitle, this.A03);
            OWs.A00(bigContentTitle);
        }
    }

    public final void A01(Bundle bundle) {
        super.A01(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    public final void A05(Bundle bundle) {
        IconCompat iconCompat;
        IconCompat iconCompat2;
        super.A05(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            Parcelable parcelable = bundle.getParcelable("android.largeIcon.big");
            if (parcelable != null) {
                if (parcelable instanceof Icon) {
                    iconCompat2 = C66773McJ.A01(parcelable);
                } else if (parcelable instanceof Bitmap) {
                    iconCompat2 = IconCompat.A02((Bitmap) parcelable);
                }
                this.A00 = iconCompat2;
                this.A02 = true;
            }
            iconCompat2 = null;
            this.A00 = iconCompat2;
            this.A02 = true;
        }
        Parcelable parcelable2 = bundle.getParcelable("android.picture");
        if (parcelable2 == null) {
            parcelable2 = bundle.getParcelable("android.pictureIcon");
        }
        if (parcelable2 != null) {
            if (parcelable2 instanceof Icon) {
                iconCompat = C66773McJ.A01(parcelable2);
            } else if (parcelable2 instanceof Bitmap) {
                iconCompat = IconCompat.A02((Bitmap) parcelable2);
            }
            this.A01 = iconCompat;
            this.A03 = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }
        iconCompat = null;
        this.A01 = iconCompat;
        this.A03 = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}
