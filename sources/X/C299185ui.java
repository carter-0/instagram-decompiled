package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.5ui  reason: invalid class name and case insensitive filesystem */
public abstract class C299185ui {
    public static final void A00(ColorFilter colorFilter, ImageView.ScaleType scaleType, ImageView imageView, C307786Rm r7, C276544tV r8, C277014uI r9, String str, boolean z) {
        0qQ.A0B(imageView, 1);
        0qQ.A0B(r7, 2);
        C299195uj r3 = new C299195uj(colorFilter, scaleType, imageView, r7, r8, r9, str, z);
        C64361Kj.A00();
        if (str != null) {
            1OO A0J = 1NK.A00().A0J(new SimpleImageUrl(str), "bloks");
            A0J.A02(r3);
            C226952iF A00 = A0J.A00();
            imageView.setTag(R.id.image_request_callback, r3);
            A00.E5t();
            A01(r7, r8, r9, "ImageRequested");
            return;
        }
        imageView.setImageDrawable((Drawable) null);
    }

    public static final void A01(C307786Rm r3, C276544tV r4, C277014uI r5, String str) {
        if (r5 != null) {
            C308276Tl r2 = new C308276Tl();
            r2.A01(str);
            r2.A02(Long.valueOf(System.currentTimeMillis()));
            C307886Rw.A03(r3, r4, new AnonymousClass6Tm(r2.A00), r5);
        }
    }
}
