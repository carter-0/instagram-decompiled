package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mdl  reason: case insensitive filesystem */
public abstract class C66852Mdl {
    public static final Drawable A00(Context context, UserSession userSession) {
        int i;
        if (!182.A06(0Tu.A05, userSession, 36328985168199373L)) {
            return context.getDrawable(R.drawable.direct_visual_message_view_once_filled);
        }
        Drawable drawable = context.getDrawable(R.drawable.instagram_view_once_pano_outline_24);
        if (drawable != null) {
            i = drawable.getIntrinsicHeight();
        } else {
            i = 0;
        }
        float f = (float) i;
        float A04 = 1.0f - ((f - (0nA.A04(context, 4) * 2.0f)) / f);
        return new ScaleDrawable(drawable, 17, A04, A04);
    }

    public static final Drawable A01(C3722390a r5, C66851Mdk mdk) {
        AnonymousClass7FE r4 = mdk.A01;
        boolean z = r4.A06;
        Drawable drawable = r5.A03;
        C3265577g.A07(drawable, r4, false, z, r4.A07);
        return drawable;
    }

    public static final SpannableStringBuilder A02(StyleSpan styleSpan, String str) {
        SpannableStringBuilder A0E = C51965G9l.A0E();
        A0E.append(str);
        A0E.setSpan(styleSpan, 0, str.length(), 33);
        return A0E;
    }
}
