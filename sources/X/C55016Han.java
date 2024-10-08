package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Han  reason: case insensitive filesystem */
public abstract class C55016Han {
    public static final void A00(Activity activity, UserSession userSession) {
        AnonymousClass7TG.A1N(userSession, activity);
        C310336ap A0Z = C51975G9x.A0Z();
        DbT.A1D(activity.getResources(), A0Z, 2131963339);
        A0Z.A02();
        Drawable drawable = activity.getDrawable(R.drawable.instagram_text_pano_outline_24);
        if (drawable != null) {
            C51975G9x.A0y(activity, drawable, A0Z);
            A0Z.A0L = true;
            A0Z.A0G = AnonymousClass7TF.A0d(activity.getResources(), 2131963342);
            A0Z.A0A = new FdJ(activity, userSession, 9);
            DbY.A1N(A0Z);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
