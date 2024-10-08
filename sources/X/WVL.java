package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

public final class WVL implements JO3 {
    public final N41 A00;
    public final C20948X6b A01;
    public final boolean A02;

    public final C367618rI AEb(Context context) {
        String A16;
        Drawable drawable;
        int i;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        if (this.A02) {
            A16 = AnonymousClass7TE.A16(context2, 2131960642);
            drawable = context2.getDrawable(R.drawable.instagram_star_off_pano_outline_24);
            i = 1;
        } else {
            A16 = AnonymousClass7TE.A16(context2, 2131960260);
            drawable = context2.getDrawable(R.drawable.instagram_star_pano_outline_24);
            i = 2;
        }
        return new C367618rI((Drawable) null, drawable, (C15048ULb) null, new C19398WXr(this, i), (Integer) null, A16, 0, 0, 0, false, false, false, true, false, false, false);
    }

    public WVL(N41 n41, C20948X6b x6b, boolean z) {
        this.A00 = n41;
        this.A02 = z;
        this.A01 = x6b;
    }
}
