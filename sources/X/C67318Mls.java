package X;

import android.content.Context;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Mls  reason: case insensitive filesystem */
public abstract class C67318Mls {
    public static final void A00(Context context, ImageView imageView) {
        imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.alert_off_new_pano_outline_12dp));
        boolean A07 = C61670oa.A07();
        int i = R.attr.textColorTertiary;
        if (A07) {
            i = R.attr.muteIconPrimaryColor;
        }
        imageView.setColorFilter(2Yu.A0F(context, i));
        imageView.setVisibility(0);
    }
}
