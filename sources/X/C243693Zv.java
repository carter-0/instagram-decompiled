package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.Arrays;

/* renamed from: X.3Zv  reason: invalid class name and case insensitive filesystem */
public final class C243693Zv {
    public static final void A00(Context context) {
        int hashCode = Arrays.hashCode(new Object[]{context.getTheme(), Boolean.valueOf(AnonymousClass3HA.A00(context))});
        Integer num = C243683Zu.A0D;
        if (num == null || hashCode != num.intValue()) {
            C243683Zu.A0B = null;
        }
        C243683Zu.A0D = Integer.valueOf(hashCode);
    }

    public final C243683Zu A01(Context context) {
        A00(context);
        C243683Zu r0 = C243683Zu.A0B;
        if (r0 != null) {
            return r0;
        }
        int color = context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_text));
        C243683Zu r02 = new C243683Zu(context.getColor(2Yu.A0H(context, R.attr.textColorPrimary)), context.getColor(2Yu.A0H(context, R.attr.textColorBoldLink)), context.getColor(2Yu.A0H(context, R.attr.textColorLocation)), context.getColor(2Yu.A0H(context, R.attr.textColorPrimary)), color, context.getColor(2Yu.A0H(context, R.attr.glyphColorPrimary)), context.getColor(2Yu.A0H(context, R.attr.glyphColorSecondaryActive)), 2Yu.A0H(context, R.attr.igds_color_primary_text), 2Yu.A0H(context, R.attr.igds_color_stroke), color, true);
        C243683Zu.A0B = r02;
        return r02;
    }
}
