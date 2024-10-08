package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.359  reason: invalid class name */
public final class AnonymousClass359 {
    public static final int A00(C2365134a r1, C227872kC r2) {
        0qQ.A0B(r2, 1);
        C270374gd r0 = r2.A00.A0C;
        int i = 0;
        if (r0 != null) {
            i = 1;
        }
        if (!1OP.A05(r1.A0O.A07).A0U(false).isEmpty()) {
            return i + 1;
        }
        return i;
    }

    public final int A01(Context context, C227872kC r5, int i) {
        int i2;
        int A00 = AnonymousClass3D4.A00(context) + i;
        if (r5.A00.A0U) {
            i2 = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        } else {
            i2 = 0;
        }
        return A00 + i2;
    }
}
