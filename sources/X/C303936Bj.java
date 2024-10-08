package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;

/* renamed from: X.6Bj  reason: invalid class name and case insensitive filesystem */
public abstract class C303936Bj {
    public static C268454dQ A00;

    public static final C268454dQ A00(Context context) {
        0qQ.A0B(context, 0);
        C268454dQ r0 = A00;
        if (r0 == null) {
            Typeface A02 = AnonymousClass3U3.A02(context, R.font.ig_logo_font);
            if (A02 != null) {
                r0 = C303946Bk.A00(A02);
            } else {
                r0 = null;
            }
            A00 = r0;
        }
        return r0;
    }
}
