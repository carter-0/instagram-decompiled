package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

public abstract class VG4 {
    public static final void A00(Activity activity, Fragment fragment, 28D r7, UserSession userSession, Long l, String str, String str2, String str3, int i) {
        0qQ.A0B(userSession, 0);
        Bundle bundle = new Bundle();
        bundle.putSerializable("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_ENTRY_POINT", r7);
        bundle.putString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_MEDIA_INSIGHTS_ID", str);
        bundle.putString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_MEDIA_ID", str2);
        bundle.putInt("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_NUM_SUPPORTERS", i);
        bundle.putString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_INSIGHTS_TITLE", str3);
        if (l != null) {
            bundle.putLong("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_INSIGHTS_CREATION_DATE", l.longValue());
        }
        AnonymousClass6W8.A02(activity, bundle, userSession, TransparentModalActivity.class, C273654mx.A00(1345)).A0D(fragment, 1);
    }
}
