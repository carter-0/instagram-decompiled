package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.2s4  reason: invalid class name and case insensitive filesystem */
public final class C231662s4 implements C231672s5 {
    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        Drawable drawable = igImageView.getDrawable();
        if ((drawable instanceof BitmapDrawable) || (drawable instanceof C247913h7)) {
            C247913h7 r0 = new C247913h7(drawable, new BitmapDrawable(igImageView.getResources(), bitmap));
            igImageView.setImageDrawable(r0);
            r0.A04.setDuration(200).start();
            return;
        }
        igImageView.setImageBitmap(bitmap);
    }
}
