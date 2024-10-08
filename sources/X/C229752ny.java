package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.search.common.analytics.SearchContext;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2ny  reason: invalid class name and case insensitive filesystem */
public final class C229752ny {
    public final Fragment A00;
    public final UserSession A01;
    public final Set A02 = new HashSet();

    public final void A00(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str2;
        0qQ.A0B(str8, 1);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            Set set = this.A02;
            String str9 = str;
            boolean contains = set.contains(str9);
            if (!contains) {
                set.add(str9);
            }
            boolean z = true;
            if (2Y9.A02(2Y9.A00(activity))) {
                z = false;
            }
            C309516Yo r2 = new C309516Yo(activity, this.A01);
            ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
            String str10 = str6;
            String str11 = str7;
            contextualFeedFragment.setArguments(C46424Del.A00((Bundle) null, (Bundle) null, (0jB) null, (ContextualFeedNetworkConfig) null, (SearchContext) null, (Integer) null, str9, str8, str11, (String) null, str3, str10, str5, (String) null, (String) null, (String) null, (String) null, (String) null, str4, (String) null, (ArrayList) null, 0, false, true, false, false, contains, false, false, false, true, z));
            r2.A0B((Bundle) null, contextualFeedFragment);
            r2.A08();
            r2.A04();
        }
    }

    public C229752ny(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
