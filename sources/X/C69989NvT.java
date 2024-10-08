package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.instagram.android.R;

/* renamed from: X.NvT  reason: case insensitive filesystem */
public abstract class C69989NvT {
    public static final SpannableString A00(Context context) {
        C2606346l r2;
        Drawable drawable = context.getDrawable(R.drawable.instagram_app_messenger_pano_filled_24);
        if (drawable != null) {
            drawable.mutate().setColorFilter(AnonymousClass7TF.A03(context, R.attr.glyphColorPrimary), PorterDuff.Mode.SRC_IN);
            drawable.setBounds(0, 0, C61380mr.A01(context, 9), C61380mr.A01(context, 9));
        }
        SpannableString A0D = C66580MXl.A0D(002.A0D(context.getResources().getString(2131968532), ' '));
        if (drawable != null) {
            r2 = new C2606346l(drawable);
            r2.A01 = (int) C61380mr.A00(context, 2.0f);
        } else {
            r2 = null;
        }
        A0D.setSpan(r2, 0, 1, 33);
        return A0D;
    }
}
