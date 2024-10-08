package X;

import android.view.ViewGroup;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.Fpk  reason: case insensitive filesystem */
public final class C51174Fpk implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;

    public C51174Fpk(CategorySearchFragment categorySearchFragment) {
        this.A00 = categorySearchFragment;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams;
        CategorySearchFragment categorySearchFragment = this.A00;
        IgdsBottomButtonLayout igdsBottomButtonLayout = categorySearchFragment.businessNavBar;
        0qQ.A0A(igdsBottomButtonLayout);
        int measuredHeight = igdsBottomButtonLayout.getMeasuredHeight();
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = categorySearchFragment.businessNavBar;
        if (igdsBottomButtonLayout2 != null) {
            layoutParams = igdsBottomButtonLayout2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        0qQ.A0C(layoutParams, C273654mx.A00(3));
        layoutParams.height = measuredHeight;
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = categorySearchFragment.businessNavBar;
        if (igdsBottomButtonLayout3 != null) {
            igdsBottomButtonLayout3.setLayoutParams(layoutParams);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout4 = categorySearchFragment.businessNavBar;
        if (igdsBottomButtonLayout4 != null) {
            igdsBottomButtonLayout4.setFooterText(categorySearchFragment.getString(2131952918));
        }
    }
}
