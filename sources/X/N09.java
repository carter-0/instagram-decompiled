package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

public final class N09 extends N0B {
    public final Context A00;

    public final Drawable getBrandingDrawable() {
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.maa_login_gradient_background);
        if (drawable == null) {
            return new ColorDrawable(AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_background));
        }
        return drawable;
    }

    public final Drawable getIconDrawable() {
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.caa_central_images_instagram);
        if (!(context.getDrawable(R.drawable.maa_login_gradient_background) == null || drawable == null)) {
            C51969G9p.A12(PorterDuff.Mode.SRC_ATOP, drawable, context.getColor(2Yu.A0A(context)));
        }
        return drawable;
    }

    public N09(Context context) {
        super(context);
        this.A00 = context;
    }
}
