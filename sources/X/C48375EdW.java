package X;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.EdW  reason: case insensitive filesystem */
public abstract class C48375EdW {
    public static final void A00(Context context, IgdsBanner igdsBanner, Integer num, Integer num2, String str, C62320sa r21, C62320sa r22, int i, int i2, int i3) {
        Drawable drawable;
        IgdsBanner igdsBanner2 = igdsBanner;
        0qQ.A0B(igdsBanner2, 0);
        C62320sa r3 = r21;
        C62320sa r2 = r22;
        AnonymousClass7TF.A1G(r3, 8, r2);
        Context context2 = context;
        String str2 = str;
        if (str == null || str2.length() == 0) {
            drawable = context2.getDrawable(R.drawable.instagram_avatars_pano_filled_24);
            if (!(num2 == null || drawable == null)) {
                int intValue = num2.intValue();
                drawable.setColorFilter(new LightingColorFilter(context2.getColor(intValue), context2.getColor(intValue)));
            }
        } else {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            AnonymousClass7TE.A1N(context2, shapeDrawable.getPaint(), R.color.blue_1);
            drawable = new C59921Jbk(context2, shapeDrawable, (Drawable) null, str2, R.dimen.action_bar_item_spacing_left, R.drawable.instagram_avatars_pano_filled_24, 0, 0, 880, false);
        }
        igdsBanner2.setIcon(drawable);
        DbT.A1U(igdsBanner2, 02K.A01(context2).getString(i2), false);
        igdsBanner2.setBodyColor(context2.getColor(i));
        igdsBanner2.setAction((CharSequence) 02K.A01(context2).getString(i3));
        igdsBanner2.setDismissible(true);
        igdsBanner2.setDividerVisibility(1);
        if (num != null) {
            igdsBanner2.setDividerColor(num.intValue());
        }
        igdsBanner2.A00 = new C50469FcH(0, r2, r3);
    }
}
