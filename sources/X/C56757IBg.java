package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.search.common.analytics.SearchContext;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;

/* renamed from: X.IBg  reason: case insensitive filesystem */
public final class C56757IBg implements View.OnClickListener {
    public final /* synthetic */ ContextualFeedFragment A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;

    public C56757IBg(ContextualFeedFragment contextualFeedFragment, Integer num, String str) {
        this.A02 = str;
        this.A00 = contextualFeedFragment;
        this.A01 = num;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(426651283);
        String str = this.A02;
        ContextualFeedFragment contextualFeedFragment = this.A00;
        if (0qQ.A0K(str, contextualFeedFragment.A0O)) {
            contextualFeedFragment.EKl();
        } else {
            Integer num = this.A01;
            String A012 = AnonymousClass3VU.A01(num);
            String string = contextualFeedFragment.getString(AnonymousClass3VU.A00(num));
            String A022 = AnonymousClass3VU.A02(num);
            String A002 = AnonymousClass1FM.A00();
            C309516Yo A0M = DbS.A0M(contextualFeedFragment.requireActivity(), ContextualFeedFragment.A00(contextualFeedFragment));
            ContextualFeedFragment contextualFeedFragment2 = new ContextualFeedFragment();
            contextualFeedFragment2.setArguments(C46424Del.A00((Bundle) null, (Bundle) null, (0jB) null, (ContextualFeedNetworkConfig) null, (SearchContext) null, (Integer) null, str, string, (String) null, (String) null, A012, (String) null, A022, (String) null, (String) null, (String) null, (String) null, (String) null, A002, (String) null, (ArrayList) null, 0, false, true, false, false, false, false, false, false, true, false));
            Dba.A0w((Bundle) null, contextualFeedFragment2, A0M);
        }
        AnonymousClass0fD.A0C(-2120595996, A05);
    }
}
