package com.instagram.archive.fragment;

import X.0qQ;
import X.0s1;
import X.27S;
import X.2da;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass376;
import X.AnonymousClass3JR;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.C15384Ubj;
import X.C62589KiM;
import X.C64683LgB;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbX;
import X.DbZ;
import X.E1G;
import X.Ki3;
import X.LT8;
import X.LYC;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public class ArchiveHomeFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public 2da A00;
    public C62589KiM A01;
    public UserSession A02;
    public Fragment A03;
    public Fragment A04;
    public Fragment A05;
    public Fragment A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public final 27S A09 = new C64683LgB(this, 0);
    public View mCalendarActionBarButton;

    public static void A00(ArchiveHomeFragment archiveHomeFragment) {
        Fragment fragment;
        C62589KiM kiM = archiveHomeFragment.A01;
        if (kiM == C62589KiM.STORY) {
            fragment = archiveHomeFragment.A06;
            if (fragment == null) {
                Bundle requireArguments = archiveHomeFragment.requireArguments();
                DbU.A1D(requireArguments, archiveHomeFragment.A02);
                requireArguments.putSerializable("highlight_management_source", Ki3.ARCHIVE);
                fragment = new ArchiveReelTabbedFragment();
                fragment.setArguments(requireArguments);
                archiveHomeFragment.A06 = fragment;
            }
        } else if (kiM == C62589KiM.POSTS) {
            fragment = archiveHomeFragment.A03;
            if (fragment == null) {
                fragment = LT8.A02(archiveHomeFragment.A02.A05);
                archiveHomeFragment.A03 = fragment;
            }
        } else if (kiM == C62589KiM.LIVE) {
            fragment = archiveHomeFragment.A04;
            if (fragment == null) {
                String str = archiveHomeFragment.A02.A05;
                0qQ.A0B(str, 0);
                fragment = new C15384Ubj();
                DbZ.A1B(fragment, "IgSessionManager.SESSION_TOKEN_KEY", str);
                archiveHomeFragment.A04 = fragment;
            }
        } else if (kiM == C62589KiM.QUICK_SNAP) {
            fragment = archiveHomeFragment.A05;
            if (fragment == null) {
                String str2 = archiveHomeFragment.A02.A05;
                0qQ.A0B(str2, 0);
                fragment = new E1G();
                DbZ.A1B(fragment, "IgSessionManager.SESSION_TOKEN_KEY", str2);
                archiveHomeFragment.A05 = fragment;
            }
        } else {
            fragment = null;
        }
        0s1 A0C = DbW.A0C(archiveHomeFragment);
        fragment.getClass();
        A0C.A0A(fragment, R.id.archive_home_fragment_container);
        A0C.A01();
        2da r2 = archiveHomeFragment.A00;
        if (r2 != null) {
            r2.Eom(archiveHomeFragment.A01.A00);
            r2.Eoo(new LYC(archiveHomeFragment, 27));
            r2.EuC(true);
        }
    }

    public final void configureActionBar(2da r4) {
        int i;
        this.A00 = r4;
        this.mCalendarActionBarButton = null;
        if (r4 != null) {
            r4.Eom(this.A01.A00);
            r4.Eoo(new LYC(this, 27));
            r4.EuC(true);
        }
        r4.Eu4(true);
        if (!this.A07) {
            boolean z = this.A08;
            AnonymousClass3JR A0K = DbS.A0K();
            if (!z) {
                A0K.A02(AnonymousClass05K.A00);
                i = 25;
            } else {
                A0K.A06 = R.drawable.instagram_settings_pano_outline_24;
                A0K.A05 = 2131973150;
                i = 26;
            }
            DbX.A19(new LYC(this, i), A0K, r4);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final String getModuleName() {
        Fragment fragment;
        if (isAdded()) {
            fragment = getChildFragmentManager().A0P(R.id.archive_home_fragment_container);
        } else {
            fragment = null;
        }
        if (fragment instanceof AnonymousClass4DH) {
            return ((AnonymousClass4DH) fragment).getModuleName();
        }
        return this.A01.A02;
    }

    public final boolean onBackPressed() {
        Fragment fragment;
        if (isAdded()) {
            fragment = getChildFragmentManager().A0P(R.id.archive_home_fragment_container);
        } else {
            fragment = null;
        }
        if (fragment instanceof AnonymousClass4DR) {
            return ((AnonymousClass4DR) fragment).onBackPressed();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006a, code lost:
        if (r7 == false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 2050385586(0x7a3666b2, float:2.3677023E35)
            int r4 = X.AnonymousClass0fD.A02(r0)
            com.instagram.archive.fragment.ArchiveHomeFragment.super.onCreate(r9)
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r8)
            r8.A02 = r0
            X.C64184LSr.A03(r0)
            com.instagram.common.session.UserSession r2 = r8.A02
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319098153540505(0x81080700011b99, double:3.031682145344262E-306)
            boolean r0 = X.DbY.A1Y(r3, r2, r0)
            r8.A08 = r0
            com.instagram.common.session.UserSession r2 = r8.A02
            r0 = 36319098153474968(0x81080700001b98, double:3.031682145302816E-306)
            boolean r0 = X.DbY.A1Y(r3, r2, r0)
            r8.A07 = r0
            com.instagram.common.session.UserSession r0 = r8.A02
            boolean r0 = X.AnonymousClass39U.A04(r0)
            r7 = r0 ^ 1
            com.instagram.common.session.UserSession r0 = r8.A02
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A85
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 211(0xd3, float:2.96E-43)
            r0 = r1[r0]
            java.lang.Object r6 = r2.CDM(r3, r0)
            r5 = r6
            android.os.Bundle r2 = r8.mArguments
            if (r2 == 0) goto L_0x005f
            java.lang.String r1 = "archive_home_tab_mode"
            java.io.Serializable r0 = r2.getSerializable(r1)
            if (r0 == 0) goto L_0x005f
            java.io.Serializable r0 = r2.getSerializable(r1)
            X.KiM r0 = (X.C62589KiM) r0
            java.lang.String r6 = r0.A01
            r5 = r6
        L_0x005f:
            X.KiM r0 = X.C62589KiM.QUICK_SNAP
            java.lang.String r0 = r0.A01
            boolean r0 = X.2Ob.A00(r6, r0)
            if (r0 == 0) goto L_0x006c
            r3 = 1
            if (r7 != 0) goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            X.KiM r2 = X.C62589KiM.STORY
            java.lang.String r1 = r2.A01
            boolean r0 = X.2Ob.A00(r6, r1)
            if (r0 == 0) goto L_0x009c
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x009c
        L_0x007b:
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0083
            X.KiM r0 = X.C62589KiM.POSTS
            java.lang.String r1 = r0.A01
        L_0x0083:
            r5 = r1
        L_0x0084:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.util.HashMap r0 = X.C62589KiM.A03
            java.lang.Object r0 = r0.get(r5)
            X.KiM r0 = (X.C62589KiM) r0
            if (r0 != 0) goto L_0x0093
            r0 = r2
        L_0x0093:
            r8.A01 = r0
            r0 = 644233110(0x26663796, float:7.9872613E-16)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x009c:
            if (r3 != 0) goto L_0x007b
            if (r6 != 0) goto L_0x0084
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.ArchiveHomeFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1307781194);
        AnonymousClass1Nd.A00(this.A02).A01(this.A09, AnonymousClass376.class);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.archive_home_fragment);
        AnonymousClass0fD.A09(44997564, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(451334250);
        super.onDestroyView();
        this.mCalendarActionBarButton = null;
        AnonymousClass1Nd.A00(this.A02).A02(this.A09, AnonymousClass376.class);
        AnonymousClass0fD.A09(-293445653, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A00(this);
    }
}
