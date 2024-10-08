package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7vd  reason: invalid class name and case insensitive filesystem */
public final class C346717vd implements AnonymousClass1MK {
    public Drawable A00;
    public final 0sP A01;
    public final 0sP A02;

    public C346717vd(Drawable drawable, ImageUrl imageUrl, String str, 0sP r5, 0sP r6) {
        0qQ.A0B(str, 2);
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = drawable;
        if (imageUrl != null) {
            1OO A0J = 1NK.A00().A0J(imageUrl, str);
            A0J.A02(this);
            A0J.A01();
        }
    }

    public final void CyF(C226952iF r3, AnonymousClass3LX r4) {
        0qQ.A0B(r4, 1);
        Bitmap bitmap = r4.A01;
        if (bitmap != null) {
            Drawable drawable = (Drawable) this.A01.invoke(bitmap);
            this.A00 = drawable;
            this.A02.invoke(drawable);
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }
}
