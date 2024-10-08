package X;

import android.view.View;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;

/* renamed from: X.6yJ  reason: invalid class name and case insensitive filesystem */
public final class C323916yJ implements C2365734g {
    public final /* synthetic */ RefreshableAppBarLayoutBehavior A00;

    public C323916yJ(RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior) {
        this.A00 = refreshableAppBarLayoutBehavior;
    }

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        0qQ.A0B(view, 0);
        2dP layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        layoutParams.A00(new HeaderScrollingViewBehavior());
        this.A00.A0I.add(view);
    }
}
