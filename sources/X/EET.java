package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.widget.search.SearchController;

public final class EET extends C252233om implements C74502Pvw {
    public boolean A00;
    public final View A01;
    public final CategorySearchFragment A02;
    public final SearchController A03;
    public final Activity A04;
    public final ViewGroup A05;

    public final void A00() {
        String searchString;
        SearchController searchController = this.A03;
        if (searchController.A03 == AnonymousClass05K.A0C) {
            OIK oik = searchController.mViewHolder;
            if (oik == null) {
                searchString = "";
            } else {
                searchString = oik.A0F.getSearchString();
            }
            if (searchString == null) {
                searchString = "";
            }
            searchController.A01(AnonymousClass05K.A00, 0.0f, (float) this.A01.getHeight(), true);
            CategorySearchFragment categorySearchFragment = this.A02;
            ViewGroup viewGroup = categorySearchFragment.container;
            if (viewGroup != null) {
                viewGroup.setPadding(0, categorySearchFragment.A00, 0, 0);
            }
            IgdsInlineSearchBox igdsInlineSearchBox = categorySearchFragment.searchBox;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A0E.setText(searchString);
            }
            CategorySearchFragment.A07(categorySearchFragment);
            ViewGroup viewGroup2 = categorySearchFragment.mainScreenContainer;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutTransition(new LayoutTransition());
            }
        }
    }

    public final void DRx() {
    }

    public final void DRz() {
    }

    public final void Dhf(SearchController searchController, boolean z) {
    }

    public final void Dht(String str, boolean z) {
    }

    public final void Dhw(String str, String str2) {
        0qQ.A0B(str, 0);
        if (this.A03.A03 != AnonymousClass05K.A01) {
            this.A02.A0e(str);
        }
    }

    public final void Dmq(SearchController searchController, Integer num, Integer num2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A03.onViewCreated(view, bundle);
    }

    public EET(Activity activity, View view, ViewGroup viewGroup, ViewGroup viewGroup2, C47577E8p e8p, CategorySearchFragment categorySearchFragment, UserSession userSession, IgdsInlineSearchBox igdsInlineSearchBox) {
        C47577E8p e8p2 = e8p;
        boolean A1Z = DbW.A1Z(e8p2);
        ViewGroup viewGroup3 = viewGroup2;
        ViewGroup viewGroup4 = viewGroup;
        AnonymousClass7TG.A1S(viewGroup4, viewGroup3);
        IgdsInlineSearchBox igdsInlineSearchBox2 = igdsInlineSearchBox;
        0qQ.A0B(igdsInlineSearchBox2, 8);
        this.A04 = activity;
        this.A02 = categorySearchFragment;
        this.A05 = viewGroup4;
        this.A01 = view;
        this.A00 = A1Z;
        UserSession userSession2 = userSession;
        this.A03 = new SearchController(activity, viewGroup3, e8p2, userSession2, new C47913EMh(this), this, 0, 0, false);
        igdsInlineSearchBox2.A02();
        FP5.A01(igdsInlineSearchBox2, 15, this);
    }

    public final float Abo(SearchController searchController, Integer num) {
        return (float) this.A01.getHeight();
    }

    public final void CvL(SearchController searchController, Integer num, float f, float f2) {
        Activity activity;
        ViewGroup viewGroup;
        View view = this.A01;
        if (view != null && (activity = this.A04) != null && (viewGroup = this.A05) != null) {
            float height = f2 - ((float) view.getHeight());
            DbT.A0K(activity).A0P.setTranslationY(height);
            viewGroup.setTranslationY(height);
        }
    }

    public final void onDestroyView() {
        this.A03.onDestroyView();
    }

    public final void onPause() {
        this.A03.onPause();
    }

    public final void onResume() {
        SearchController searchController = this.A03;
        searchController.onResume();
        if (searchController.A03 == AnonymousClass05K.A0C) {
            this.A02.A0c();
        }
    }

    public final void DDU() {
        A00();
    }
}
