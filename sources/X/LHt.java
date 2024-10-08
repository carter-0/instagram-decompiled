package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class LHt {
    public static final void A00(Activity activity, Context context, Fragment fragment, C348257y9 r24, UserSession userSession) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        C348257y9 r2 = r24;
        0qQ.A0B(r2, 4);
        Context context2 = context;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.audio_translations_language_list_cell_row_height);
        Activity activity2 = activity;
        AnonymousClass8XZ r0 = new AnonymousClass8XZ(activity2, AnonymousClass07i.A00(fragment), (C348927zH) null, AnonymousClass8XO.PHOTO_AND_VIDEO, userSession2, new C61673KGx(1, r2, new C355608Qq(context2, userSession2, AnonymousClass05K.A00, dimensionPixelSize, dimensionPixelSize, false)), Integer.MAX_VALUE, 0, -1, -1, true, false, false);
        r0.A01 = 1;
        r0.A01((2Cn) null);
    }

    public static final void A01(Context context, Bitmap bitmap, ImageView imageView) {
        AnonymousClass7TG.A1O(imageView, bitmap);
        imageView.setImageDrawable(new C348417yP(context, bitmap, (float) AnonymousClass7TG.A04(context), (float) DbY.A01(context), DbS.A02(context, 34), 0, false));
    }
}
