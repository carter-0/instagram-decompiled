package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import instagram.features.stories.fragment.userlist.ReelTabbedFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UvO  reason: case insensitive filesystem */
public final class C16468UvO extends ReelTabbedFragment {
    public static final String __redex_internal_original_name = "ReelPollVotersTabbedFragment";
    public String A00 = "";
    public String A01;
    public String A02 = "";
    public String A03;
    public final List A04 = new ArrayList();

    public final String getModuleName() {
        return "reel_poll_voters_tabs";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        0hq childFragmentManager = getChildFragmentManager();
        ViewPager viewPager = this.mViewPager;
        FixedTabBar fixedTabBar = this.mTabBar;
        List list = this.A04;
        C51974G9v.A1M(childFragmentManager, viewPager, fixedTabBar);
        0qQ.A0B(list, 5);
        C16343UtG utG = new C16343UtG(childFragmentManager, viewPager, fixedTabBar, this, list, false, false);
        this.mTabController = utG;
        utG.A03(this.A01);
    }

    private C16469UvP A00(int i) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        bundle.putInt("ReelUserListFragment.POLL_OPTION_INDEX", i);
        Fragment ubu = new C15391Ubu();
        ubu.setArguments(bundle);
        return ubu;
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        UwE uwE = (UwE) obj;
        int ordinal = uwE.ordinal();
        int i = 1;
        int i2 = 0;
        if (ordinal != 0) {
            i2 = 2;
            if (ordinal != 1) {
                i = 3;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw C51973G9u.A0g(uwE, "illegal tab: ", new StringBuilder());
                    }
                }
            }
            return A00(i);
        }
        return A00(i2);
    }

    public final /* bridge */ /* synthetic */ OIJ AN9(Object obj) {
        String str;
        UwE uwE = (UwE) obj;
        int ordinal = uwE.ordinal();
        if (ordinal == 0) {
            str = this.A00;
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                str = this.A03;
            } else if (ordinal == 3) {
                str = this.A01;
            } else {
                throw C51973G9u.A0g(uwE, "illegal tab: ", new StringBuilder());
            }
            str.getClass();
        } else {
            str = this.A02;
        }
        return C18278Vot.A01(str);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1550507451);
        super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        String A0l = DbU.A0l(requireArguments(), "ReelUserListFragment.REEL_ID");
        String A0l2 = DbU.A0l(requireArguments(), "ReelUserListFragment.REEL_ITEM_ID");
        Reel A0M = ReelStore.A03(this.A00).A0M(A0l);
        if (A0M != null) {
            Iterator it = A0M.A0O(this.A00).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C255773uh r1 = (C255773uh) it.next();
                if (r1.A0j.equals(A0l2)) {
                    C272024jy A002 = C297825sP.A00(r1);
                    A002.getClass();
                    List A012 = AnonymousClass9OX.A01(A002);
                    this.A00 = C18687Vwl.A02((C272014jx) AnonymousClass7TE.A13(A012));
                    this.A02 = C18687Vwl.A02((C272014jx) A012.get(1));
                    if (A012.size() > 2) {
                        this.A03 = ((C272014jx) A012.get(2)).getText();
                    }
                    if (A012.size() > 3) {
                        this.A01 = ((C272014jx) A012.get(3)).getText();
                    }
                }
            }
        }
        List list = this.A04;
        UwE uwE = UwE.FIRST_OPTION;
        list.add(uwE);
        list.add(UwE.SECOND_OPTION);
        if (this.A03 != null) {
            list.add(UwE.THIRD_OPTION);
        }
        if (this.A01 != null) {
            list.add(UwE.FOURTH_OPTION);
        }
        this.A01 = uwE;
        AnonymousClass0fD.A09(161936968, A022);
    }
}
