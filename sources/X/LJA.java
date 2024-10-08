package X;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

public abstract class LJA {
    public static final void A01(2da r18) {
        2da r1 = r18;
        r1.ErJ(new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass05K.A00, -2, -2, -2, 2131964105, R.drawable.instagram_x_pano_outline_24, -2, -2, true));
        r1.Eu4(true);
    }

    public static AnonymousClass3JR A00(Fragment fragment, 2da r3) {
        A01(r3);
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A0K = fragment.getString(2131972502);
        return r1;
    }
}
