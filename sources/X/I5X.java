package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.search.common.analytics.SearchContext;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;

public final class I5X {
    public final UserSession A00;

    public static final void A00(Activity activity, UserSession userSession, 1Xj r12) {
        String str;
        1Xj r7 = r12;
        String id = r12.getId();
        if (id != null && (str = (String) 00k.A0J(00l.A0R(id, new String[]{"_"}, 0))) != null) {
            new I0v(userSession).A02(new H4O(activity, userSession, r7, id, 0), C54662HMt.ALL, str, (String) null);
        }
    }

    public static final void A01(Activity activity, I5X i5x, String str, String str2, String str3, ArrayList arrayList) {
        Activity activity2 = activity;
        I5X i5x2 = i5x;
        String str4 = str;
        String str5 = str2;
        ArrayList arrayList2 = arrayList;
        if (arrayList == null) {
            new I0v(i5x2.A00).A02(new H4P(activity2, i5x2, str4, str5, 0), C54662HMt.ALL, str4, (String) null);
        } else {
            A02(activity2, i5x2, str4, str5, str3, arrayList2, false);
        }
        String str6 = (String) 00k.A0J(DbV.A18(str4, "_"));
        if (str6 != null) {
            LRh lRh = new LRh(i5x2.A00, activity2);
            UserSession userSession = lRh.A07;
            AnonymousClass0iw r2 = lRh.A05;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), AnonymousClass000.A00(661));
            if (A0e.isSampled()) {
                C51965G9l.A1C(C54689HOu.OPEN_CAROUSEL_REVIEW_PAGE, A0e);
                DbW.A16(A0e, r2);
                Long l = null;
                try {
                    l = AnonymousClass7TE.A10(str6);
                } catch (NumberFormatException unused) {
                }
                C51965G9l.A1E(A0e, l);
                C51965G9l.A1K(A0e, lRh.A08);
                A0e.Cgf();
            }
        }
    }

    public static final void A02(Activity activity, I5X i5x, String str, String str2, String str3, ArrayList arrayList, boolean z) {
        Class<ModalActivity> cls;
        Bundle bundle;
        int i;
        UserSession userSession = i5x.A00;
        String str4 = str;
        String str5 = str3;
        ArrayList arrayList2 = arrayList;
        if (182.A06(0Tu.A05, userSession, 36320279272169655L)) {
            cls = ModalActivity.class;
            String A0j = AnonymousClass7TG.A0j();
            bundle = AnonymousClass7TE.A0a();
            bundle.putStringArrayList("initial_media_id_list", AnonymousClass7TE.A1D(arrayList2));
            bundle.putString("parent_media_id", (String) 00k.A0J(DbV.A18(str4, "_")));
            bundle.putString("next_max_id", str5);
            bundle.putString("viewer_session_id", A0j);
            i = 864;
        } else {
            String A0b = AnonymousClass7TF.A0b();
            ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
            contextualFeedFragment.setArguments(C46424Del.A00((Bundle) null, (Bundle) null, (0jB) null, (ContextualFeedNetworkConfig) null, (SearchContext) null, (Integer) null, "open_carousel_review_page", (String) null, (String) null, (String) null, "open_carousel_review_page", str5, (String) null, str4, str2, (String) null, (String) null, (String) null, A0b, (String) null, arrayList2, 0, false, false, z, false, false, false, false, false, true, false));
            cls = ModalActivity.class;
            bundle = contextualFeedFragment.mArguments;
            i = 629;
        }
        Dbb.A0i(activity, bundle, userSession, cls, C273654mx.A00(i));
    }

    public I5X(UserSession userSession) {
        this.A00 = userSession;
    }
}
