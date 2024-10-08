package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;

/* renamed from: X.McJ  reason: case insensitive filesystem */
public abstract class C66773McJ {
    public static Icon A00(Context context, IconCompat iconCompat) {
        Icon icon;
        String str;
        switch (iconCompat.A02) {
            case -1:
                return (Icon) iconCompat.A06;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) iconCompat.A06);
                break;
            case 2:
                String str2 = iconCompat.A07;
                if (str2 == null || TextUtils.isEmpty(str2)) {
                    str = ((String) iconCompat.A06).split(":", -1)[0];
                } else {
                    str = iconCompat.A07;
                }
                icon = Icon.createWithResource(str, iconCompat.A00);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) iconCompat.A06, iconCompat.A00, iconCompat.A01);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) iconCompat.A06);
                break;
            case 5:
                icon = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.A06);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    icon = C69679Nq1.A00(iconCompat.A06());
                    break;
                } else if (context != null) {
                    InputStream A07 = iconCompat.A07(context);
                    if (A07 != null) {
                        icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(A07));
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot load adaptive icon from uri: ");
                        sb.append(iconCompat.A06());
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Context is required to resolve the file uri of the icon: ");
                    sb2.append(iconCompat.A06());
                    throw new IllegalArgumentException(sb2.toString());
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = iconCompat.A03;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.A04;
        if (mode != IconCompat.A0A) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    public static IconCompat A01(Object obj) {
        obj.getClass();
        Icon icon = (Icon) obj;
        int type = icon.getType();
        if (type == 2) {
            return IconCompat.A01((Resources) null, icon.getResPackage(), icon.getResId());
        }
        int i = 4;
        if (type != 4) {
            i = 6;
            if (type != 6) {
                IconCompat iconCompat = new IconCompat(-1);
                iconCompat.A06 = obj;
                return iconCompat;
            }
        }
        Uri uri = icon.getUri();
        uri.getClass();
        String obj2 = uri.toString();
        obj2.getClass();
        IconCompat iconCompat2 = new IconCompat(i);
        iconCompat2.A06 = obj2;
        return iconCompat2;
    }
}
