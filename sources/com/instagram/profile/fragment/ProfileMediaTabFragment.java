package com.instagram.profile.fragment;

import X.02m;
import X.0Tu;
import X.0qQ;
import X.17k;
import X.182;
import X.2Rw;
import X.2ZX;
import X.2el;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0j7;
import X.AnonymousClass0wW;
import X.AnonymousClass2qB;
import X.AnonymousClass32J;
import X.AnonymousClass32Q;
import X.AnonymousClass3AS;
import X.AnonymousClass3DZ;
import X.AnonymousClass4DH;
import X.AnonymousClass4DT;
import X.AnonymousClass4DV;
import X.AnonymousClass57H;
import X.AnonymousClass57M;
import X.AnonymousClass71L;
import X.AnonymousClass71M;
import X.AnonymousClass71N;
import X.AnonymousClass723;
import X.AnonymousClass724;
import X.AnonymousClass725;
import X.AnonymousClass726;
import X.AnonymousClass727;
import X.AnonymousClass728;
import X.AnonymousClass729;
import X.AnonymousClass72A;
import X.C15234UWt;
import X.C16129UpG;
import X.C20962X6p;
import X.C227762js;
import X.C228172ku;
import X.C228312lJ;
import X.C229122ms;
import X.C229402nK;
import X.C230732q9;
import X.C2366634p;
import X.C238103Ao;
import X.C238133Ar;
import X.C249383je;
import X.C249813kP;
import X.C267614bu;
import X.C267644bx;
import X.C294255m9;
import X.C294265mA;
import X.C321456uC;
import X.C321606uS;
import X.C322216vR;
import X.C322616w8;
import X.C322696wG;
import X.C322706wH;
import X.C322736wK;
import X.C322796wQ;
import X.C3251071b;
import X.C3251271d;
import X.C3251671h;
import X.C3251771i;
import X.C3251871j;
import X.C3252271n;
import X.C3252371o;
import X.C48247EbS;
import X.C70542Rd;
import X.WZN;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProfileMediaTabFragment extends AnonymousClass4DH implements AnonymousClass4DV, AnonymousClass723, AnonymousClass724, AnonymousClass4DT, AnonymousClass0j7 {
    public UserSession A00;
    public C16129UpG A01;
    public AnonymousClass71N A02;
    public C294255m9 A03;
    public C322796wQ A04;
    public C15234UWt A05;
    public C229122ms A06;
    public String A07;
    public boolean A08 = false;
    public 2el A09;
    public C3251871j A0A;
    public C228312lJ A0B;
    public AnonymousClass57M A0C;
    public C321456uC A0D;
    public C321606uS A0E;
    public String A0F;
    public final C228172ku A0G = new C228172ku();
    public final AnonymousClass729 A0H = new AnonymousClass729(this);
    public final AnonymousClass72A A0I = new AnonymousClass72A(this);
    public final AnonymousClass726 A0J = new AnonymousClass725(this);
    public final AnonymousClass728 A0K = new AnonymousClass727(this);
    public C229402nK mDropFrameWatcher;
    public RecyclerView mRecyclerView;
    public C238133Ar mScrollingViewProxy;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = r10.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C321456uC A00(com.instagram.profile.fragment.ProfileMediaTabFragment r10) {
        /*
            r2 = r10
            X.6uC r0 = r10.A0D
            if (r0 != 0) goto L_0x0029
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x002a
            X.6wQ r1 = r10.A04
            X.WZN r0 = r1.A06
            if (r0 == 0) goto L_0x002a
            com.instagram.profile.fragment.UserDetailTabController r0 = r0.A02
        L_0x0011:
            X.6vu r0 = r0.A0P
            com.instagram.user.model.User r8 = r0.A0J
            X.4DU r5 = r1.A02
            com.instagram.common.session.UserSession r3 = r10.A00
            X.2el r4 = r10.A09
            X.32Q r7 = r1.A0D
            java.util.Set r9 = r1.A0H
            java.util.Set r10 = r1.A0G
            X.5m9 r6 = r2.A03
            X.6uC r0 = X.C321426u9.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2.A0D = r0
        L_0x0029:
            return r0
        L_0x002a:
            X.6wQ r1 = r10.A04
            X.6wH r0 = r1.A07
            com.instagram.profile.fragment.UserDetailTabController r0 = r0.A02
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.ProfileMediaTabFragment.A00(com.instagram.profile.fragment.ProfileMediaTabFragment):X.6uC");
    }

    public final Fragment ACU() {
        return this;
    }

    public final C227762js BD0() {
        return null;
    }

    public final boolean CbJ() {
        return false;
    }

    public final void Daz(UserDetailTabController userDetailTabController) {
    }

    public final void DqG(boolean z) {
    }

    public final void DqM() {
    }

    public final void A01() {
        C322216vR r4 = this.A04.A05;
        C321606uS r3 = r4.A0C;
        int i = r3.A00;
        if (i != 0) {
            02m r2 = r3.A01;
            r2.markerPoint(i, "empty_grid_rendered");
            int i2 = r3.A00;
            if (i2 != 0) {
                r2.markerEnd(i2, 2);
                r3.A00 = 0;
            }
        }
        C2366634p r32 = r4.A08;
        r32.A01.A0K("is_empty_state", true);
        r32.A05();
    }

    public final String BhI() {
        return this.A07;
    }

    public final ViewGroup BqB() {
        return this.mRecyclerView;
    }

    public final void DWI(int i, ViewGroup viewGroup) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && i != 0) {
            C3251871j.A01(recyclerView, this.A0A, i, true);
        }
    }

    public final void DeD(int i) {
        this.mRecyclerView.post(new C3252371o(this, i));
    }

    public final void DhR(boolean z) {
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.post(new C3252271n(recyclerView));
    }

    public final void DqL(boolean z) {
        C322696wG r1;
        Object obj;
        if (!this.A08 || (obj = this.A01) == null) {
            r1 = this.A04.A09;
            obj = this.A02;
        } else {
            r1 = this.A04.A09;
        }
        0qQ.A0B(obj, 0);
        r1.A00 = new WeakReference(obj);
        this.A04.A05.A04 = getScrollingViewProxy();
        C15234UWt uWt = this.A05;
        if (uWt != null) {
            uWt.A0E("tab_selected");
        }
    }

    public final String getModuleName() {
        if ("profile_fan_club_grid".equals(this.A07)) {
            return "fan_club";
        }
        C322796wQ r0 = this.A04;
        if (r0 != null) {
            return r0.A01.getModuleName();
        }
        return "profile_unknown";
    }

    public final C238133Ar getScrollingViewProxy() {
        C238133Ar r0 = this.mScrollingViewProxy;
        if (r0 != null) {
            return r0;
        }
        C238133Ar A002 = C238103Ao.A00(this.mRecyclerView);
        this.mScrollingViewProxy = A002;
        return A002;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final String getUrl() {
        return null;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        int i3 = C70542Rd.A00;
        return null;
    }

    public final void afterOnDestroyView() {
        super.afterOnDestroyView();
        unregisterLifecycleListener(this.mDropFrameWatcher);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003f, code lost:
        if (r7.A03 != X.C294255m9.A09) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 134852654(0x809b02e, float:4.1434036E-34)
            int r4 = X.AnonymousClass0fD.A02(r0)
            com.instagram.profile.fragment.ProfileMediaTabFragment.super.onCreate(r8)
            android.os.Bundle r3 = r7.requireArguments()
            X.0eM r0 = X.C227642jf.A02(r7)
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            r7.A00 = r0
            java.lang.String r0 = "ProfileMediaTabFragment.profile_tab_mode"
            java.io.Serializable r0 = r3.getSerializable(r0)
            r0.getClass()
            X.5m9 r0 = (X.C294255m9) r0
            r7.A03 = r0
            java.lang.String r0 = "ProfileMediaTabFragment.profile_tab_identifier"
            java.lang.String r0 = r3.getString(r0)
            r0.getClass()
            r7.A07 = r0
            com.instagram.common.session.UserSession r0 = r7.A00
            boolean r0 = X.C278764xU.A00(r0)
            if (r0 == 0) goto L_0x0041
            X.5m9 r2 = r7.A03
            X.5m9 r1 = X.C294255m9.A09
            r0 = 1
            if (r2 == r1) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r7.A08 = r0
            java.lang.String r0 = "ProfileMediaTabFragment.profile_source_media_id"
            java.lang.String r0 = r3.getString(r0)
            r7.A0F = r0
            r1 = 0
            X.2ej r0 = X.C71682ef.A00()
            X.2el r0 = X.C71682ef.A01(r1, r0)
            r7.A09 = r0
            androidx.fragment.app.Fragment r0 = r7.requireParentFragment()
            com.instagram.profile.fragment.UserDetailFragment r0 = (com.instagram.profile.fragment.UserDetailFragment) r0
            X.2lJ r0 = r0.A0h
            r7.A0B = r0
            if (r0 == 0) goto L_0x0066
            r7.registerLifecycleListener(r0)
        L_0x0066:
            com.instagram.common.session.UserSession r6 = r7.A00
            java.lang.String r3 = r7.A07
            r5 = 0
            X.0qQ.A0B(r6, r5)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317294267208664(0x810663000013d8, double:3.0305413603643386E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x00b0
            r0 = 36880244220690747(0x8306630001013b, double:3.3865531777639227E-306)
            java.lang.String r1 = X.182.A04(r2, r6, r0)
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.00l.A0R(r1, r0, r5)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00b0
            com.instagram.common.session.UserSession r1 = r7.A00
            java.lang.String r0 = r7.A07
            X.UWt r2 = new X.UWt
            r2.<init>(r1, r0)
            r7.A05 = r2
            android.content.Context r1 = r7.requireContext()
            com.instagram.common.session.UserSession r0 = r7.A00
            X.2cc r0 = X.C71342cb.A00(r0)
            r2.A0R(r1, r0, r7)
        L_0x00b0:
            java.lang.String r1 = r7.A07
            java.lang.String r0 = "profile_tagged_media_photos_of_you"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "tagged_profile"
            r7.setModuleNameV2(r0)
        L_0x00bf:
            com.instagram.common.session.UserSession r3 = r7.A00
            X.0qQ.A0B(r3, r5)
            X.02m r2 = X.02m.A0p
            r0 = 46
            X.G2j r1 = new X.G2j
            r1.<init>(r2, r0)
            java.lang.Class<X.6uS> r0 = X.C321606uS.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.6uS r0 = (X.C321606uS) r0
            r7.A0E = r0
            r0 = -1846210764(0xffffffff91f50f34, float:-3.8663554E-28)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.ProfileMediaTabFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        2ZX r4;
        UserDetailTabController userDetailTabController;
        int A022 = AnonymousClass0fD.A02(-556154435);
        Integer num = this.A03.A01;
        Integer num2 = AnonymousClass05K.A01;
        boolean z = false;
        if (num == num2) {
            z = true;
        }
        17k.A0G(z, "ProfileMediaTabFragment no longer supports FEED View.");
        this.A04 = requireParentFragment().AvN();
        C228312lJ r6 = this.A0B;
        if (r6 != null) {
            UserSession userSession = this.A00;
            Integer num3 = AnonymousClass05K.A0u;
            this.A0C = new AnonymousClass57M(userSession, this.A09, new AnonymousClass2qB((AnonymousClass57H) null, C230732q9.A00(this.A04.A05.A05, getModuleName()), r6), num3);
            this.A0G.A03(this.A0B);
        }
        this.A06 = new AnonymousClass71L(this, this.A04.A0A);
        UserSession userSession2 = this.A00;
        0qQ.A0B(userSession2, 0);
        boolean A062 = 182.A06(0Tu.A05, userSession2, 36327438979971515L);
        Context requireContext = requireContext();
        C322796wQ r1 = this.A04;
        AnonymousClass32J r21 = r1.A04;
        C267644bx r20 = r1.A03;
        UserSession userSession3 = this.A00;
        AnonymousClass32Q r18 = r1.A0D;
        AnonymousClass0iw r17 = r1.A01;
        C229122ms r16 = this.A06;
        C322706wH r15 = r1.A07;
        C294255m9 r14 = this.A03;
        C267614bu r13 = r1.A0E;
        C322616w8 r12 = r1.A0B;
        AnonymousClass726 r23 = this.A0J;
        C48247EbS ebS = r1.A08;
        AnonymousClass57M r62 = this.A0C;
        C15234UWt uWt = this.A05;
        if (getRootActivity() instanceof 2ZX) {
            r4 = (2ZX) getRootActivity();
        } else {
            r4 = null;
        }
        String str = this.A0F;
        2ZX r2 = null;
        this.A02 = new AnonymousClass71N(requireContext, r4, r17, userSession3, r20, r21, r23, r62, r15, ebS, r14, this, uWt, r12, new AnonymousClass71M(this), r18, r16, r13, Boolean.valueOf(A062), str);
        if (this.A08 && this.A04.A06 != null) {
            Context requireContext2 = requireContext();
            C322796wQ r19 = this.A04;
            AnonymousClass32J r22 = r19.A04;
            C267644bx r212 = r19.A03;
            C20962X6p x6p = r19.A0C;
            UserSession userSession4 = this.A00;
            AnonymousClass32Q r172 = r19.A0D;
            AnonymousClass0iw r182 = r19.A01;
            C229122ms r152 = this.A06;
            WZN wzn = r19.A06;
            C294255m9 r132 = this.A03;
            C267614bu r122 = r19.A0E;
            C322616w8 r7 = r19.A0B;
            AnonymousClass728 r63 = this.A0K;
            C48247EbS ebS2 = r19.A08;
            AnonymousClass57M r42 = this.A0C;
            C15234UWt uWt2 = this.A05;
            if (getRootActivity() instanceof 2ZX) {
                r2 = (2ZX) getRootActivity();
            }
            this.A01 = new C16129UpG(requireContext2, r2, r182, userSession4, r212, r22, r23, r63, r42, wzn, ebS2, r132, this, uWt2, r7, x6p, r172, r152, r122, this.A0F, A062);
        }
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C3251271d r0 = new C3251271d(this, new C3251071b(), this.A02, this.A04.A0F);
        C228172ku r43 = this.A0G;
        r43.A03(r0);
        C229402nK r02 = new C229402nK(requireActivity(), this, this.A00, 23592965);
        this.mDropFrameWatcher = r02;
        r02.A03 = num2;
        registerLifecycleListener(r02);
        r43.A03(this.mDropFrameWatcher);
        C15234UWt uWt3 = this.A05;
        if (uWt3 != null) {
            uWt3.A00 = this.A06;
            boolean z2 = this.A08;
            String str2 = null;
            C322796wQ r03 = this.A04;
            if (z2) {
                WZN wzn2 = r03.A06;
                if (wzn2 != null) {
                    userDetailTabController = wzn2.A02;
                }
                this.A05.A01 = str2;
            } else {
                userDetailTabController = r03.A07.A02;
            }
            User user = userDetailTabController.A0P.A0J;
            if (user != null) {
                str2 = user.getId();
            }
            this.A05.A01 = str2;
        }
        View inflate = layoutInflater.inflate(R.layout.profile_media_tab_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1884346520, A022);
        return inflate;
    }

    public final void onDestroyView() {
        Object obj;
        List list;
        WZN wzn;
        int A022 = AnonymousClass0fD.A02(-1237624311);
        super.onDestroyView();
        this.A0A = null;
        this.mRecyclerView.A0b();
        this.mRecyclerView.setAdapter((2Rw) null);
        this.A04.A0B.A04.remove(this);
        if (!this.A08 || (wzn = this.A04.A06) == null) {
            C322706wH r2 = this.A04.A07;
            C294265mA r1 = this.A03.A00;
            obj = this.A0H;
            0qQ.A0B(obj, 0);
            list = ((C322736wK) r2.A03.get(r1)).A07;
        } else {
            C294265mA r12 = this.A03.A00;
            obj = this.A0I;
            0qQ.A0B(r12, 0);
            0qQ.A0B(obj, 1);
            list = WZN.A00(wzn, r12).A08;
        }
        list.remove(obj);
        this.A0G.A00();
        ProfileMediaTabFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-1192000036, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C3251771i r6;
        2Rw r0;
        WZN wzn;
        this.mRecyclerView = (RecyclerView) view.requireViewById(16908298);
        int i = 1;
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(requireContext());
        this.mRecyclerView.setItemAnimator((AnonymousClass3AS) null);
        this.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        this.A04.A05.A04 = getScrollingViewProxy();
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        int A012 = (int) 182.A01(0Tu.A05, userSession, 36606212426634602L);
        C3251671h r5 = new C3251671h(this);
        if (A012 == -1) {
            r6 = C3251771i.A0C;
        } else {
            r6 = new C3251771i(AnonymousClass05K.A00, AnonymousClass05K.A01, A012);
        }
        C3251871j r3 = new C3251871j(fastScrollingLinearLayoutManager, r5, r6, false, true);
        this.A0A = r3;
        C228172ku r1 = this.A0G;
        r1.A02(r3);
        this.mRecyclerView.A15(r1);
        if (!this.A08) {
            this.mRecyclerView.setRecycledViewPool(this.A04.A00);
        }
        if (!this.A08 || this.A01 == null) {
            i = 0;
        }
        C249813kP.A00.A04("profile", "use_grid_adapter", i);
        RecyclerView recyclerView = this.mRecyclerView;
        if (i != 0) {
            r0 = this.A01;
        } else {
            r0 = this.A02;
        }
        recyclerView.setAdapter(r0);
        C322616w8 r2 = this.A04.A0B;
        Set set = r2.A04;
        if (!set.contains(this)) {
            set.add(this);
            HashSet hashSet = r2.A03;
            if (!hashSet.contains(this.A07)) {
                DhR(false);
            }
            hashSet.add(this.A07);
            HashSet hashSet2 = r2.A02;
            if (!hashSet2.contains(this.A07)) {
                DeD(r2.A00);
            }
            hashSet2.add(this.A07);
        }
        if (!this.A08 || (wzn = this.A04.A06) == null) {
            C322706wH r32 = this.A04.A07;
            C294265mA r12 = this.A03.A00;
            AnonymousClass729 r22 = this.A0H;
            0qQ.A0B(r22, 0);
            List list = ((C322736wK) r32.A03.get(r12)).A07;
            if (!list.contains(r22)) {
                list.add(r22);
            }
            r22.A00();
        } else {
            C294265mA r13 = this.A03.A00;
            AnonymousClass72A r23 = this.A0I;
            0qQ.A0B(r13, 0);
            0qQ.A0B(r23, 1);
            List list2 = WZN.A00(wzn, r13).A08;
            if (!list2.contains(r23)) {
                list2.add(r23);
            }
            r23.A00();
        }
        this.A09.A06(this.mRecyclerView, AnonymousClass3DZ.A00(this));
        super.onViewCreated(view, bundle);
    }
}
