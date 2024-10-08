package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class F27 {
    public final Fragment A00;
    public final UserSession A01;

    public F27(Fragment fragment, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragment;
    }

    public final String A00() {
        String string;
        int A002 = C63112Krf.A00(this.A01);
        Resources A05 = DbV.A05(this.A00);
        if (A002 > 0) {
            string = DbY.A0d(A05, A002, R.plurals.birthday_effect_audience_picker_close_friends_count);
        } else {
            string = A05.getString(2131953799);
        }
        0qQ.A0A(string);
        return string;
    }
}
