package instagram.features.stories.fragment.userlist;

import X.0Aj;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C16343UtG;
import X.C16467UvN;
import X.C16468UvO;
import X.DTP;
import X.DbT;
import X.DbW;
import X.DbX;
import X.DbZ;
import X.XBP;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;

public abstract class ReelTabbedFragment extends AnonymousClass4DH implements AnonymousClass4DS, XBP {
    public UserSession A00;
    public Object A01;
    public FixedTabBar mTabBar;
    public C16343UtG mTabController;
    public ViewPager mViewPager;

    public final void DqK(Object obj) {
        if (this instanceof C16467UvN) {
            DTP dtp = (DTP) obj;
            this.A01 = dtp;
            UserSession userSession = this.A00;
            String value = dtp.getValue();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, userSession), "ig_aqr_responder_tab_switched");
            A0e.AAJ("selected", value);
            A0e.Cgf();
            return;
        }
        this.A01 = obj;
    }

    public final void configureActionBar(2da r3) {
        int i;
        boolean z = this instanceof C16468UvO;
        Context requireContext = requireContext();
        if (z) {
            i = 2131971581;
        } else {
            i = 2131971598;
        }
        DbW.A1C(r3, requireContext.getString(i));
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-873232827);
        ReelTabbedFragment.super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        AnonymousClass0fD.A09(-892160625, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1595649592);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_reel_poll_voters_tabbed_fragment);
        AnonymousClass0fD.A09(-692468331, A02);
        return A0C;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(1247110639);
        super.onDestroyView();
        this.mTabController = null;
        this.mTabBar = null;
        this.mViewPager = null;
        AnonymousClass0fD.A09(124734541, A02);
    }

    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(1993303799);
        ReelTabbedFragment.super.onStart();
        DbZ.A1P(this, 8);
        AnonymousClass0fD.A09(230545836, A02);
    }

    public final void onStop() {
        int A02 = AnonymousClass0fD.A02(-5969789);
        ReelTabbedFragment.super.onStop();
        DbZ.A1P(this, 0);
        AnonymousClass0fD.A09(1496839921, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTabBar = (FixedTabBar) view.requireViewById(R.id.fixed_tabbar_view);
        this.mViewPager = view.requireViewById(R.id.view_pager);
    }
}
