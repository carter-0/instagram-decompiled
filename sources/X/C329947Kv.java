package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.7Kv  reason: invalid class name and case insensitive filesystem */
public final class C329947Kv {
    public static final C329947Kv A00 = new Object();

    public final int[] A00(Context context, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        int A02;
        if (directThreadThemeInfo == null) {
            return new int[]{context.getColor(2Yu.A0H(context, R.attr.igds_color_gradient_purple)), context.getColor(2Yu.A0H(context, R.attr.igds_color_gradient_blue))};
        }
        if (C329957Kw.A07(directThreadThemeInfo, z).length == 0) {
            if (z) {
                A02 = directThreadThemeInfo.A01();
            } else {
                A02 = directThreadThemeInfo.A02();
            }
            return new int[]{A02};
        }
        int[] A07 = C329957Kw.A07(directThreadThemeInfo, z);
        0qQ.A0A(A07);
        return A07;
    }
}
