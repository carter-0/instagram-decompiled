package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.7xa  reason: invalid class name and case insensitive filesystem */
public abstract class C347917xa {
    public static final String A01(int i) {
        int round = Math.round(((float) i) / 1000.0f);
        int i2 = round / 60;
        int i3 = i2 / 60;
        StringBuilder sb = new StringBuilder();
        if (i3 > 0) {
            sb.append(i3);
            sb.append(":");
        }
        sb.append(i2 % 60);
        sb.append(":");
        String valueOf = String.valueOf(round % 60);
        if (valueOf.length() == 1) {
            sb.append("0");
        }
        sb.append(valueOf);
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final Bitmap A00(String str, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        while (i3 / i2 > i && i4 / i2 > i) {
            i2 *= 2;
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = i2;
        return BitmapFactory.decodeFile(str, options);
    }
}
