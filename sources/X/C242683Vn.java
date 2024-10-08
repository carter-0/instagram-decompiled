package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Vn  reason: invalid class name and case insensitive filesystem */
public abstract class C242683Vn {
    public static ImageUrl A00(Context context, ImageUrl imageUrl) {
        if (imageUrl != null) {
            String url = imageUrl.getUrl();
            if (url.endsWith("_8.jpg")) {
                int A09 = 0nA.A09(context);
                if (Math.abs(306 - A09) < Math.abs(1080 - A09)) {
                    return new SimpleImageUrl(url.replace("_8.jpg", "_6.jpg"));
                }
            }
        }
        return imageUrl;
    }

    public static ExtendedImageUrl A01(Integer num, List list, int i) {
        Integer num2;
        Integer num3;
        int abs;
        Iterator it = list.iterator();
        int i2 = Integer.MAX_VALUE;
        ExtendedImageUrl extendedImageUrl = null;
        while (it.hasNext()) {
            ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) it.next();
            int height = extendedImageUrl2.getHeight();
            int width = extendedImageUrl2.getWidth();
            if (height == width) {
                num3 = AnonymousClass05K.A0C;
            } else {
                num3 = AnonymousClass05K.A01;
            }
            if ((num == AnonymousClass05K.A00 || num == num3) && ((abs = Math.abs(((i / 20) + i) - width)) < i2 || (extendedImageUrl != null && abs == i2 && width < extendedImageUrl.getWidth()))) {
                extendedImageUrl = extendedImageUrl2;
                i2 = abs;
            }
        }
        if (extendedImageUrl != null || num == (num2 = AnonymousClass05K.A00)) {
            return extendedImageUrl;
        }
        return A01(num2, list, i);
    }
}
