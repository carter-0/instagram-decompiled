package com.instagram.archive.fragment;

import X.0hq;
import X.0qQ;
import X.182;
import X.1Ng;
import X.1wn;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass1Nd;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass7TF;
import X.C14674U0v;
import X.C16343UtG;
import X.C16517UwM;
import X.C19221WQb;
import X.C273374mT;
import X.C51973G9u;
import X.C51974G9v;
import X.C64642LfU;
import X.DbT;
import X.LT8;
import X.OIJ;
import X.WQ8;
import X.XBP;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArchiveReelTabbedFragment extends C273374mT implements AnonymousClass4DR, XBP {
    public Fragment A00;
    public Fragment A01;
    public C16517UwM A02 = C16517UwM.GRID;
    public AnonymousClass4DH A03;
    public AnonymousClass4DH A04;
    public AnonymousClass4DH A05;
    public AnonymousClass4DH A06;
    public AnonymousClass0iw A07;
    public List A08;
    public Map A09;
    public final 1wn A0A = new C19221WQb(this, 3);
    public final 1wn A0B = new C19221WQb(this, 4);
    public FixedTabBar mTabBar;
    public C16343UtG mTabController;
    public ViewPager mViewPager;

    public final boolean isContainerFragment() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C16517UwM uwM = (C16517UwM) requireArguments().getSerializable("archive_stories_tab");
        if (uwM != null) {
            this.A02 = uwM;
        }
        FixedTabBar fixedTabBar = (FixedTabBar) view.requireViewById(R.id.fixed_tabbar_view);
        this.mTabBar = fixedTabBar;
        fixedTabBar.A08 = true;
        ViewPager requireViewById = view.requireViewById(R.id.view_pager);
        this.mViewPager = requireViewById;
        requireViewById.setOffscreenPageLimit(2);
        0hq childFragmentManager = getChildFragmentManager();
        ViewPager viewPager = this.mViewPager;
        FixedTabBar fixedTabBar2 = this.mTabBar;
        List list = this.A08;
        C51974G9v.A1M(childFragmentManager, viewPager, fixedTabBar2);
        0qQ.A0B(list, 5);
        C16343UtG utG = new C16343UtG(childFragmentManager, viewPager, fixedTabBar2, this, list, false, false);
        this.mTabController = utG;
        utG.A03(this.A02);
        1Ng A002 = AnonymousClass1Nd.A00(getSession());
        A002.A01(this.A0A, WQ8.class);
        A002.A01(this.A0B, C64642LfU.class);
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        C16517UwM uwM = (C16517UwM) obj;
        switch (uwM.ordinal()) {
            case 0:
                return this.A00;
            case 1:
                return this.A03;
            case 2:
                return this.A05;
            case 3:
                return this.A06;
            case 4:
                return this.A01;
            case 5:
                return this.A04;
            default:
                throw C51973G9u.A0g(uwM, "illegal tab: ", new StringBuilder());
        }
    }

    public final /* bridge */ /* synthetic */ OIJ AN9(Object obj) {
        Object obj2 = this.A09.get(obj);
        obj2.getClass();
        return (OIJ) obj2;
    }

    public final /* bridge */ /* synthetic */ void DqK(Object obj) {
        AnonymousClass0iw r0;
        C16517UwM uwM = (C16517UwM) obj;
        this.A02 = uwM;
        switch (uwM.ordinal()) {
            case 0:
                r0 = (AnonymousClass0iw) this.A00;
                break;
            case 1:
                r0 = this.A03;
                break;
            case 2:
                r0 = this.A05;
                break;
            case 3:
                r0 = this.A06;
                break;
            case 4:
                r0 = (AnonymousClass0iw) this.A01;
                break;
            case 5:
                r0 = this.A04;
                break;
            default:
                return;
        }
        this.A07 = r0;
    }

    public final String getModuleName() {
        return this.A07.getModuleName();
    }

    public final boolean onBackPressed() {
        return this.mTabController.A01().onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(926378214);
        ArchiveReelTabbedFragment.super.onCreate(bundle);
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        this.A09 = new HashMap();
        C16517UwM uwM = C16517UwM.GRID;
        arrayList.add(uwM);
        UserSession session = getSession();
        if (182.A06(AnonymousClass7TF.A0H(session), session, 36329019529051887L)) {
            List list = this.A08;
            C16517UwM uwM2 = C16517UwM.HIGHLIGHTS;
            list.add(uwM2);
            this.A09.put(uwM2, new OIJ((Drawable) null, (Drawable) null, (View) null, (String) null, (String) null, -1, -1, -1, R.drawable.instagram_story_highlight_pano_outline_24, R.drawable.instagram_story_highlight_pano_filled_24, -1, -1, -1, -1, -1, -1));
        }
        List list2 = this.A08;
        C16517UwM uwM3 = C16517UwM.CALENDAR;
        list2.add(uwM3);
        List list3 = this.A08;
        C16517UwM uwM4 = C16517UwM.MAP;
        list3.add(uwM4);
        this.A09.put(uwM, new OIJ((Drawable) null, (Drawable) null, (View) null, (String) null, (String) null, -1, -1, -1, R.drawable.instagram_story_pano_outline_24, R.drawable.instagram_story_pano_filled_24, -1, -1, -1, -1, -1, -1));
        this.A09.put(uwM3, new OIJ(new C14674U0v(requireContext(), AnonymousClass05K.A01), new C14674U0v(requireContext(), AnonymousClass05K.A00), (View) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1));
        this.A09.put(uwM4, new OIJ((Drawable) null, (Drawable) null, (View) null, (String) null, (String) null, -1, -1, -1, R.drawable.instagram_location_map_pano_outline_24, R.drawable.instagram_location_map_pano_filled_24, -1, -1, -1, -1, -1, -1));
        getSession();
        this.A00 = LT8.A00(requireArguments(), getSession());
        Bundle requireArguments = requireArguments();
        ArchiveReelCalendarFragment archiveReelCalendarFragment = new ArchiveReelCalendarFragment();
        archiveReelCalendarFragment.setArguments(requireArguments);
        this.A03 = archiveReelCalendarFragment;
        Bundle requireArguments2 = requireArguments();
        ArchiveReelMapFragment archiveReelMapFragment = new ArchiveReelMapFragment();
        archiveReelMapFragment.setArguments(requireArguments2);
        this.A05 = archiveReelMapFragment;
        Bundle requireArguments3 = requireArguments();
        C273374mT r2 = new C273374mT();
        r2.setArguments(requireArguments3);
        this.A06 = r2;
        Bundle requireArguments4 = requireArguments();
        ArchiveReelHighlightsFragment archiveReelHighlightsFragment = new ArchiveReelHighlightsFragment();
        archiveReelHighlightsFragment.setArguments(requireArguments4);
        this.A04 = archiveReelHighlightsFragment;
        Bundle requireArguments5 = requireArguments();
        ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment = new ArchiveReelRecycleBinFragment();
        archiveReelRecycleBinFragment.setArguments(requireArguments5);
        this.A01 = archiveReelRecycleBinFragment;
        this.A07 = this.A00;
        AnonymousClass0fD.A09(440777051, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1072015026);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_archive_reel_tabbed_fragment);
        AnonymousClass0fD.A09(-1865216525, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-635290848);
        super.onDestroyView();
        1Ng A002 = AnonymousClass1Nd.A00(getSession());
        A002.A02(this.A0A, WQ8.class);
        A002.A02(this.A0B, C64642LfU.class);
        ArchiveReelTabbedFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-527094096, A022);
    }
}
