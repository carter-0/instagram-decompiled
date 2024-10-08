package com.instagram.debug.devoptions.section.localinjection;

import X.0qQ;
import X.AnonymousClass00P;
import X.C60140do;
import X.DbS;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;

public final class InjectMediaToolFragment$initTabBarAndViewPager$1 extends C60140do {
    public final /* synthetic */ InjectMediaToolFragment this$0;

    public InjectMediaToolFragment$initTabBarAndViewPager$1(InjectMediaToolFragment injectMediaToolFragment) {
        this.this$0 = injectMediaToolFragment;
    }

    public void onPageSelected(int i) {
        DbS.A1D(this.this$0);
        FixedTabBar fixedTabBar = this.this$0.fixedTabBar;
        if (fixedTabBar == null) {
            0qQ.A0F("fixedTabBar");
            throw AnonymousClass00P.createAndThrow();
        } else {
            fixedTabBar.A02(i);
        }
    }
}
