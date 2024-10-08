package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import instagram.features.stories.fragment.userlist.ReelTabbedFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UvN  reason: case insensitive filesystem */
public final class C16467UvN extends ReelTabbedFragment {
    public static final String __redex_internal_original_name = "ReelQuickReactorsTabbedFragment";
    public List A00;

    public final String getModuleName() {
        return "reel_reactor_tabs";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00.getClass();
        0hq childFragmentManager = getChildFragmentManager();
        ViewPager viewPager = this.mViewPager;
        FixedTabBar fixedTabBar = this.mTabBar;
        List list = this.A00;
        C51974G9v.A1M(childFragmentManager, viewPager, fixedTabBar);
        0qQ.A0B(list, 5);
        C16343UtG utG = new C16343UtG(childFragmentManager, viewPager, fixedTabBar, this, list, false, false);
        this.mTabController = utG;
        utG.A03(this.A01);
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        DTP dtp = (DTP) obj;
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        bundle.putString("ReelQuickReactorsListFragment.ARGUMENTS_REACTION", dtp.getValue());
        bundle.putString("ReelQuickReactorsListFragment.ARGUMENTS_REACTION_LABEL", dtp.getName());
        C15391Ubu ubu = new C15391Ubu();
        ubu.setArguments(bundle);
        return ubu;
    }

    public final /* bridge */ /* synthetic */ OIJ AN9(Object obj) {
        return C18278Vot.A01(((DTP) obj).getValue());
    }

    public final void onCreate(Bundle bundle) {
        List list;
        DTP dtp;
        int A02 = AnonymousClass0fD.A02(-1923365524);
        super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        String string = requireArguments().getString("ReelUserListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelUserListFragment.REEL_ITEM_ID");
        String string3 = requireArguments().getString("ReelUserListFragment.REEL_REACTION");
        Reel A0M = ReelStore.A03(this.A00).A0M(string);
        if (A0M != null) {
            Iterator it = A0M.A0O(this.A00).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C255773uh r2 = (C255773uh) it.next();
                if (r2.A0j.equals(string2)) {
                    if (r2.A0e == C250963mL.MEDIA) {
                        1Xj r0 = r2.A0b;
                        r0.getClass();
                        list = r0.A0C.Bjr();
                    } else {
                        list = null;
                    }
                    this.A00 = list;
                    list.getClass();
                    List list2 = this.A00;
                    if (string3 != null) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            DTP dtp2 = (DTP) it2.next();
                            if (dtp2.getValue().equals(string3)) {
                                dtp = dtp2;
                                break;
                            }
                        }
                    } else {
                        dtp = AnonymousClass7TE.A13(list2);
                    }
                    this.A01 = dtp;
                }
            }
        }
        AnonymousClass0fD.A09(682753033, A02);
    }
}
