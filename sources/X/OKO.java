package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;

public abstract class OKO {
    public final Resources A00;
    public final Context A01;

    public final void A00(ImageView imageView) {
        Drawable drawable;
        0qQ.A0B(imageView, 0);
        boolean z = this instanceof C68883NaL;
        if (z) {
            drawable = ((C68883NaL) this).A00;
        } else {
            drawable = ((C68884NaM) this).A00;
        }
        if (drawable != null) {
            Context context = this.A01;
            if (Build.VERSION.SDK_INT < 29) {
                drawable.setColorFilter(DbV.A01(context), PorterDuff.Mode.SRC_ATOP);
            } else {
                drawable.setColorFilter(new BlendModeColorFilter(DbV.A01(context), BlendMode.SRC_ATOP));
            }
        }
        if (z) {
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.getLayoutParams().height = -2;
            C66580MXl.A1C(imageView, -2);
        } else {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Resources resources = this.A00;
            layoutParams.width = resources.getDimensionPixelSize(R.dimen.action_button_settings_height);
            DbT.A1B(resources, imageView.getLayoutParams(), R.dimen.abc_star_medium);
        }
        imageView.requestLayout();
        imageView.setImageDrawable(drawable);
    }

    public OKO(Context context) {
        this.A01 = context;
        this.A00 = AnonymousClass7TF.A0A(context);
    }
}
