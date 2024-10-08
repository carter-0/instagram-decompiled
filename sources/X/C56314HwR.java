package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.HwR  reason: case insensitive filesystem */
public abstract class C56314HwR {
    public static final void A01(Context context, MVB mvb, Integer num, String str, String str2) {
        int i;
        String str3 = str;
        0qQ.A0B(str, 1);
        Context context2 = context;
        Drawable A02 = C14091Tpi.A02(context, str2);
        if (A02 != null) {
            if (num != null) {
                i = num.intValue();
            } else {
                i = R.attr.igds_color_active_badge;
            }
            A00(context2, A02, mvb, str3, (String) null, (String) null, 2Yu.A0H(context, i), Dc5.A00(), true);
        }
    }

    public static final void A00(Context context, Drawable drawable, MVB mvb, String str, String str2, String str3, int i, int i2, boolean z) {
        1xC r2 = 1xC.A01;
        C310336ap A0a = DbS.A0a();
        A0a.A01 = i2;
        A0a.A0D = str;
        A0a.A0I = str2;
        A0a.A02();
        A0a.A0L = true;
        A0a.A0R = z;
        if (str3 == null) {
            str3 = AnonymousClass7TE.A16(context, 2131975851);
        }
        A0a.A0G = str3;
        A0a.A0A = mvb;
        A0a.A08(drawable, context.getColor(i));
        DbY.A1K(r2, A0a);
    }
}
