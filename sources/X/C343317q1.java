package X;

import android.graphics.Rect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.7q1  reason: invalid class name and case insensitive filesystem */
public final class C343317q1 {
    public final String A00;

    public final void A00(Rect rect, Medium medium) {
        1Jk.A08.A0C(rect, new SimpleImageUrl(medium.A02().toString()), this.A00, (WeakReference) null);
    }

    public final void A01(Medium medium) {
        1Jk.A08.A0F(new SimpleImageUrl(medium.A02().toString()), this.A00);
    }

    public C343317q1(String str) {
        this.A00 = str;
    }
}
