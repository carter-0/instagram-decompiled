package X;

import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.L8l  reason: case insensitive filesystem */
public final class C63830L8l {
    public final Rect A00;
    public final RectF A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;

    public C63830L8l(Rect rect, ImageUrl imageUrl, String str, String str2) {
        this.A00 = rect;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = imageUrl;
        this.A01 = JW0.A08(rect, imageUrl.getWidth(), imageUrl.getHeight());
    }
}
