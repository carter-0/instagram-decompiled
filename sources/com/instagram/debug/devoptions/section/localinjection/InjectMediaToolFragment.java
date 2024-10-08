package com.instagram.debug.devoptions.section.localinjection;

import X.0hq;
import X.0oI;
import X.0qQ;
import X.0sr;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass3JR;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C18278Vot;
import X.C227642jf;
import X.C74372Ptm;
import X.DbS;
import X.DbX;
import X.Dbb;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;

public final class InjectMediaToolFragment extends AnonymousClass4DH implements AnonymousClass4DS, C74372Ptm {
    public FixedTabBar fixedTabBar;
    public ViewPager fragmentPager;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);

    public String getModuleName() {
        return "inject_media_tool_fragment";
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.fixedTabBar = (FixedTabBar) view.requireViewById(R.id.fixed_tabbar_view);
        this.fragmentPager = view.requireViewById(R.id.inject_media_pager);
        initTabBarAndViewPager();
    }

    private final void initTabBarAndViewPager() {
        FixedTabBar fixedTabBar2 = this.fixedTabBar;
        if (fixedTabBar2 != null) {
            fixedTabBar2.A06 = this;
            List<LocalMediaInjectionConstants.InjectionGroup> injectionGroups = getInjectionGroups(requireContext());
            ArrayList A0r = AnonymousClass7TG.A0r(injectionGroups);
            for (LocalMediaInjectionConstants.InjectionGroup injectionGroup : injectionGroups) {
                A0r.add(C18278Vot.A01(injectionGroup.name));
            }
            FixedTabBar fixedTabBar3 = this.fixedTabBar;
            if (fixedTabBar3 != null) {
                fixedTabBar3.setTabs(A0r);
                FixedTabBar fixedTabBar4 = this.fixedTabBar;
                if (fixedTabBar4 != null) {
                    fixedTabBar4.A02(0);
                    if (injectionGroups.size() == 1) {
                        FixedTabBar fixedTabBar5 = this.fixedTabBar;
                        if (fixedTabBar5 != null) {
                            fixedTabBar5.setVisibility(8);
                        }
                    }
                    0hq childFragmentManager = getChildFragmentManager();
                    0qQ.A07(childFragmentManager);
                    InjectMediaToolFragmentAdapter injectMediaToolFragmentAdapter = new InjectMediaToolFragmentAdapter(childFragmentManager, AnonymousClass7TE.A0l(this.session$delegate), injectionGroups);
                    ViewPager viewPager = this.fragmentPager;
                    if (viewPager != null) {
                        injectMediaToolFragmentAdapter.mContainer = viewPager;
                        viewPager.setAdapter(injectMediaToolFragmentAdapter);
                        ViewPager viewPager2 = this.fragmentPager;
                        if (viewPager2 != null) {
                            FixedTabBar fixedTabBar6 = this.fixedTabBar;
                            if (fixedTabBar6 != null) {
                                viewPager2.A0J(fixedTabBar6);
                                ViewPager viewPager3 = this.fragmentPager;
                                if (viewPager3 != null) {
                                    viewPager3.A0J(new InjectMediaToolFragment$initTabBarAndViewPager$1(this));
                                    return;
                                }
                            }
                        }
                    }
                    0qQ.A0F("fragmentPager");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        0qQ.A0F("fixedTabBar");
        throw AnonymousClass00P.createAndThrow();
    }

    public void setMode(int i) {
        String str;
        ViewPager viewPager = this.fragmentPager;
        if (viewPager == null) {
            str = "fragmentPager";
        } else {
            viewPager.setCurrentItem(i);
            DbS.A1D(this);
            FixedTabBar fixedTabBar2 = this.fixedTabBar;
            if (fixedTabBar2 == null) {
                str = "fixedTabBar";
            } else {
                fixedTabBar2.A02(i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final List getInjectionGroups(Context context) {
        if (0oI.A09(context)) {
            return AnonymousClass7TE.A1I(new LocalMediaInjectionConstants.InjectionGroup("Ads", AnonymousClass7TE.A1I(LocalMediaInjectionConstants.InjectionContentType.THREADS_ADS)));
        }
        return 0sr.A1P(new LocalMediaInjectionConstants.InjectionGroup[]{new LocalMediaInjectionConstants.InjectionGroup("Ads", 0sr.A1P(new LocalMediaInjectionConstants.InjectionContentType[]{LocalMediaInjectionConstants.InjectionContentType.FEED_ADS, LocalMediaInjectionConstants.InjectionContentType.STORIES_ADS, LocalMediaInjectionConstants.InjectionContentType.REELS_ADS})), new LocalMediaInjectionConstants.InjectionGroup("Organic", AnonymousClass7TE.A1I(LocalMediaInjectionConstants.InjectionContentType.REELS_ORGANIC)), new LocalMediaInjectionConstants.InjectionGroup("Netego", 0sr.A1P(new LocalMediaInjectionConstants.InjectionContentType[]{LocalMediaInjectionConstants.InjectionContentType.FEED_NETEGO, LocalMediaInjectionConstants.InjectionContentType.STORIES_NETEGO}))});
    }

    public void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        r3.setTitle(getString(2131958059));
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A0K = getString(2131958062);
        DbX.A19(new InjectMediaToolFragment$configureActionBar$1(this), r1, r3);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1542267692);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_injection_tool, viewGroup, false);
        AnonymousClass0fD.A09(-239093580, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
