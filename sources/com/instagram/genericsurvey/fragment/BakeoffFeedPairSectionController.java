package com.instagram.genericsurvey.fragment;

import X.0hq;
import X.0qQ;
import X.C74372Ptm;
import X.U84;
import X.X49;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.viewpager.BakeOffViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;

public final class BakeoffFeedPairSectionController implements C74372Ptm {
    public ArrayList A00;
    public final Context A01;
    public final AdBakeOffFragment A02;
    public final 0hq A03;
    public final UserSession A04;
    public FixedTabBar fixedTabBar;
    public BakeOffViewPager fragmentPager;
    public X49 pagerAdapter;

    public BakeoffFeedPairSectionController(Context context, 0hq r4, UserSession userSession, AdBakeOffFragment adBakeOffFragment) {
        0qQ.A0B(userSession, 3);
        this.A02 = adBakeOffFragment;
        this.A03 = r4;
        this.A04 = userSession;
        this.A01 = context;
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        this.pagerAdapter = new U84(r4, userSession, arrayList);
    }

    public final void setMode(int i) {
        BakeOffViewPager bakeOffViewPager = this.fragmentPager;
        if (bakeOffViewPager != null) {
            bakeOffViewPager.A0I(i, true);
        }
        FixedTabBar fixedTabBar2 = this.fixedTabBar;
        if (fixedTabBar2 != null) {
            fixedTabBar2.A02(i);
        }
    }
}
