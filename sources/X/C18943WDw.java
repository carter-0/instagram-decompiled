package X;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.WDw  reason: case insensitive filesystem */
public final class C18943WDw implements AnonymousClass05A {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ CoordinatorLayout A02;
    public final /* synthetic */ AppBarLayout.BaseBehavior A03;
    public final /* synthetic */ AppBarLayout A04;

    public C18943WDw(View view, CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, int i) {
        this.A03 = baseBehavior;
        this.A02 = coordinatorLayout;
        this.A04 = appBarLayout;
        this.A01 = view;
        this.A00 = i;
    }

    public final boolean E2R(View view, AnonymousClass059 r11) {
        this.A03.A0P(this.A01, this.A02, this.A04, new int[]{0, 0}, 0, this.A00, 1);
        return true;
    }
}
