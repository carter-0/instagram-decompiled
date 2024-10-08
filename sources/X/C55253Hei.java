package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Hei  reason: case insensitive filesystem */
public abstract class C55253Hei {
    public static final void A00(Activity activity, Context context, Bundle bundle, UserSession userSession) {
        AnonymousClass7TG.A1T(userSession, context, activity);
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(activity, bundle, userSession, ModalActivity.class, "clips_template_browser");
        A02.A07();
        A02.A0C(context);
    }
}
