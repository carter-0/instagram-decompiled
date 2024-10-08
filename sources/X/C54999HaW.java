package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.HaW  reason: case insensitive filesystem */
public abstract class C54999HaW {
    public static final void A00(Activity activity, UserSession userSession, String str, String str2) {
        Activity activity2 = activity;
        AnonymousClass7TG.A1N(userSession, activity);
        I5X i5x = new I5X(userSession);
        String str3 = str;
        if (str != null) {
            I5X.A01(activity2, i5x, str3, str2, (String) null, (ArrayList) null);
        }
    }
}
