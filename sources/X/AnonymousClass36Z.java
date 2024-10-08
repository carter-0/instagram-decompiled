package X;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.36Z  reason: invalid class name */
public abstract class AnonymousClass36Z {
    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass4DH r2, UserSession userSession) {
        A02(fragmentActivity, r2, userSession, DJR.A00);
    }

    public static final void A02(FragmentActivity fragmentActivity, AnonymousClass4DH r6, UserSession userSession, C62320sa r8) {
        0xm A00 = AnonymousClass0xl.A00(C61170le.A00);
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = A00.A00.AR4();
        AR4.E5c("preference_push_permission_dialog_impression_timestamp", currentTimeMillis);
        AR4.apply();
        1DL.A04(fragmentActivity, new C50309FXo(r6, userSession, A00, r8), new String[]{"android.permission.POST_NOTIFICATIONS"});
    }

    public static final boolean A03(Context context) {
        if (Build.VERSION.SDK_INT < 33 || 1DL.A07(context, "android.permission.POST_NOTIFICATIONS")) {
            return false;
        }
        return true;
    }

    public static final void A01(FragmentActivity fragmentActivity, AnonymousClass4DH r1, UserSession userSession, C62320sa r3) {
        A02(fragmentActivity, r1, userSession, r3);
    }
}
