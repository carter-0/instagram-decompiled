package X;

import android.content.Context;
import com.instagram.android.R;

public abstract class O02 {
    public static final void A00(Context context, boolean z, boolean z2) {
        int i;
        C310336ap A0a = DbS.A0a();
        if (z) {
            i = 2131958960;
        } else {
            i = 2131958961;
            if (z2) {
                i = 2131958959;
            }
        }
        DbS.A19(context, A0a, i);
        A0a.A02();
        A0a.A07(R.drawable.instagram_facebook_circle_pano_outline_24);
        DbY.A1N(A0a);
    }
}
