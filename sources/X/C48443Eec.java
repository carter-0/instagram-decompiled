package X;

import android.os.Bundle;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Eec  reason: case insensitive filesystem */
public abstract class C48443Eec {
    public static final Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        Object A03 = r14.A03(0);
        0qQ.A0C(A03, C66579MXk.A00(5));
        Object A02 = r14.A02();
        String A0j = DbW.A0j(r14, DbS.A0p(A02));
        String A0i = DbW.A0i(r14, 3);
        boolean A1W = DbW.A1W(r14, 4);
        C309516Yo A0I = Dbb.A0I(r13);
        0qQ.A0B(A0j, 0);
        ArrayList A1D = AnonymousClass7TE.A1D((Collection) A03);
        ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
        contextualFeedFragment.setArguments(C46424Del.A03((Bundle) null, (ContextualFeedNetworkConfig) null, "Static", A0i, (String) A02, A0j, A1D, false, false, false, false, A1W));
        Dba.A0w((Bundle) null, contextualFeedFragment, A0I);
        return null;
    }
}
