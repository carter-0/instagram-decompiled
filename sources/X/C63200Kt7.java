package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kt7  reason: case insensitive filesystem */
public abstract class C63200Kt7 {
    public static void A00(Context context, UserSession userSession, Boolean bool) {
        if (bool.booleanValue()) {
            1Av A00 = 1Au.A00(userSession);
            if (!AnonymousClass7TG.A1a(A00, A00.A48, 1Av.A8a, 478)) {
                C358248ab A0Y = DbS.A0Y(context);
                A0Y.A0j(context.getDrawable(R.drawable.ig_illustrations_illo_photo_dump_refresh));
                DbT.A19(context, A0Y, 2131968279);
                DbU.A17(context, A0Y, 2131968278);
                A0Y.A0Y((DialogInterface.OnClickListener) null, C358278ae.BLUE_BOLD, context.getString(2131968772), true);
                LV8.A00(A0Y, userSession, 9);
                DbT.A1V(A0Y);
                return;
            }
            1Au.A00(userSession).A1W(true);
        }
    }
}
