package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6vn  reason: invalid class name and case insensitive filesystem */
public final class C322416vn implements C322386vk {
    public final String A00;

    public final String BRv(Activity activity, UserSession userSession) {
        String str;
        0qQ.A0B(activity, 0);
        0qQ.A0B(userSession, 1);
        User A02 = 17h.A00(userSession).A02(this.A00);
        if (A02 != null) {
            str = A02.getUsername();
        } else {
            str = null;
        }
        String string = activity.getString(2131969964, new Object[]{str});
        0qQ.A07(string);
        return string;
    }

    public final int CHV(Context context, boolean z) {
        0qQ.A0B(context, 0);
        return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public final void DsG(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0xa r4 = C314986jA.A00(userSession).A01;
        0xY AR4 = r4.AR4();
        AR4.E5c("profile_exclusives_tab_header_tooltip_count", r4.getLong("profile_exclusives_tab_header_tooltip_count", 0) + 1);
        AR4.apply();
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR42 = r4.AR4();
        AR42.E5c("profile_exclusives_tab_tooltip_timestamp", currentTimeMillis);
        AR42.apply();
        Set set = 0sl.A00;
        Set stringSet = r4.getStringSet("profile_exclusives_tab_tooltip_creator_set", set);
        if (stringSet == null) {
            stringSet = set;
        }
        LinkedHashSet A01 = 094.A01(this.A00, stringSet);
        0xY AR43 = r4.AR4();
        AR43.E5h("profile_exclusives_tab_tooltip_creator_set", A01);
        AR43.apply();
    }

    public final long EKO() {
        return 1000;
    }

    public final boolean EtR(UserSession userSession, boolean z) {
        17M r1;
        0qQ.A0B(userSession, 1);
        C314996jB A002 = C314986jA.A00(userSession);
        17i A003 = 17h.A00(userSession);
        String str = this.A00;
        User A02 = A003.A02(str);
        if (A02 != null) {
            r1 = A02.A02;
        } else {
            r1 = null;
        }
        if (r1 != 17M.A03) {
            return false;
        }
        0xa r7 = A002.A01;
        Set set = 0sl.A00;
        Set stringSet = r7.getStringSet("profile_exclusives_tab_tooltip_creator_set", set);
        if (stringSet == null) {
            stringSet = set;
        }
        if (stringSet.contains(str) || r7.getLong("profile_exclusives_tab_header_tooltip_count", 0) >= 10 || System.currentTimeMillis() - r7.getLong("profile_exclusives_tab_tooltip_timestamp", 0) <= TimeUnit.DAYS.toMillis(1)) {
            return false;
        }
        return true;
    }

    public final C322366vi Bdj() {
        return C322366vi.EXCLUSIVES_TAB;
    }

    public final /* synthetic */ boolean EtY() {
        return true;
    }

    public C322416vn(String str) {
        this.A00 = str;
    }

    public final /* synthetic */ int BSL(UserSession userSession) {
        return 0;
    }
}
