package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Ekn  reason: case insensitive filesystem */
public abstract class C48825Ekn {
    public static final void A00(View view, C314466iJ r2) {
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            C48827Ekp.A00(findViewById);
            r2.DUr();
        }
    }
}
