package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.HbH  reason: case insensitive filesystem */
public abstract class C55046HbH {
    public static final void A00(Context context, C53109Gih gih, int i, int i2) {
        C255913uv r1 = gih.A00;
        if (r1 != null) {
            r1.setVisibility(0);
            r1.A01(i2, i);
            r1.setCurrentPage(i2);
            r1.setActiveColor(context.getColor(R.color.badge_color));
            r1.setInactiveColor(context.getColor(R.color.grey_2));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
