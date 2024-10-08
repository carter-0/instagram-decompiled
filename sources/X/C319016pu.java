package X;

import android.view.ViewTreeObserver;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6pu  reason: invalid class name and case insensitive filesystem */
public final class C319016pu implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TabLayout A00;
    public final /* synthetic */ C318916pk A01;

    public C319016pu(TabLayout tabLayout, C318916pk r2) {
        this.A00 = tabLayout;
        this.A01 = r2;
    }

    public final void onGlobalLayout() {
        TabLayout tabLayout = this.A00;
        if (tabLayout.getMeasuredHeight() > 0) {
            C318916pk r0 = this.A01;
            r0.A04.A03(((float) r0.A03) + ((float) tabLayout.getMeasuredHeight()));
            ViewTreeObserver viewTreeObserver = tabLayout.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }
}
