package com.instagram.user.userlist.fragment;

import X.00k;
import X.0h9;
import X.0hq;
import X.0jB;
import X.0nA;
import X.0qQ;
import X.1Xj;
import X.1Xl;
import X.1wn;
import X.2EG;
import X.2R8;
import X.2Rw;
import X.2Yu;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0j6;
import X.AnonymousClass0wW;
import X.AnonymousClass3OA;
import X.AnonymousClass47K;
import X.AnonymousClass47L;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass4Zh;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C14072TpM;
import X.C227642jf;
import X.C238833Dp;
import X.C238863Ds;
import X.C238873Dt;
import X.C240413Ku;
import X.C251383n1;
import X.C252063oV;
import X.C271714jT;
import X.C271794jb;
import X.C273494mf;
import X.C273504mg;
import X.C273654mx;
import X.C319986rY;
import X.C324466zK;
import X.C324806zv;
import X.C46431Des;
import X.C46443Df5;
import X.C46459DfN;
import X.C46460DfO;
import X.C47043Dpd;
import X.C47291DuK;
import X.C50271FWc;
import X.C51008Fmv;
import X.C66992MgQ;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbZ;
import X.Dbb;
import X.EVS;
import X.FXT;
import X.GTD;
import X.GTF;
import X.GTG;
import X.GTH;
import X.Q02;
import X.Q03;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.user.recommended.FollowListData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class UnifiedFollowFragment extends AnonymousClass4DH implements AnonymousClass4DU, C273494mf, AnonymousClass0j6, AnonymousClass4DS, AnonymousClass4Zh, C240413Ku {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public SparseArray A04;
    public View A05;
    public C14072TpM A06;
    public 1Xl A07;
    public C324466zK A08;
    public C319986rY A09;
    public C46443Df5 A0A;
    public C46443Df5 A0B;
    public FollowListData A0C;
    public C46431Des A0D;
    public C47291DuK A0E;
    public C47291DuK A0F;
    public C47291DuK A0G;
    public String A0H;
    public String A0I;
    public ArrayList A0J;
    public HashMap A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int A0R;
    public int A0S;
    public final Map A0T = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A0U = C227642jf.A02(this);
    public final 1wn A0V = new FXT(this, 1);
    public final boolean A0W = true;
    public TabLayout tabLayout;
    public ViewPager2 viewPager;

    public final void D2K(IgImageView igImageView, 1Xl r13, int i, int i2, boolean z, boolean z2) {
        AnonymousClass7TF.A1C(r13, 0, igImageView);
        AnonymousClass0eM r3 = this.A0U;
        C271794jb r8 = new C271794jb(AnonymousClass7TE.A0l(r3), r13);
        r8.A00 = i2;
        r8.A01 = i;
        Q03 q03 = new Q03(this, AnonymousClass7TE.A0l(r3), r8, this, 2EG.A3W);
        q03.A00(igImageView, r8, Dbb.A0N(r13, q03, i2, i));
        if (r13 instanceof AnonymousClass3OA) {
            q03.A0O = (AnonymousClass3OA) r13;
        }
        new Q02(q03).A02();
        1Xj BPf = r13.BPf();
        FragmentActivity requireActivity = requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        AnonymousClass47L r32 = null;
        AndroidLink A022 = AnonymousClass47K.A02(requireActivity, A0l, BPf, i2, false);
        AnonymousClass47L r1 = null;
        if (A022 != null) {
            r32 = C271714jT.A01(A022);
        }
        if (r32 != AnonymousClass47L.AD_DESTINATION_CANVAS) {
            if (A022 != null) {
                r1 = C271714jT.A01(A022);
            }
            if (r1 != AnonymousClass47L.AD_DESTINATION_CLIPS_VIEWER) {
                return;
            }
        }
        DbZ.A17(this);
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        Bundle bundle = this.mArguments;
        if (bundle == null || bundle.getBoolean("UnifiedFollowFragment.EXTRA_SHOW_ACTION_BAR", true)) {
            String str = this.A0I;
            if (str == null) {
                0qQ.A0F("profileUserName");
                throw AnonymousClass00P.createAndThrow();
            }
            r4.setTitle(str);
            r4.Eu4(true);
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.tabLayout = (TabLayout) view.requireViewById(R.id.unified_follow_list_tab_layout);
        this.viewPager = (ViewPager2) view.requireViewById(R.id.unified_follow_list_view_pager);
        0hq childFragmentManager = getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        0h9 r0 = this.mLifecycleRegistry;
        0qQ.A07(r0);
        C46431Des des = new C46431Des(childFragmentManager, r0, this);
        this.A0D = des;
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setAdapter(des);
        }
        ViewPager2 viewPager22 = this.viewPager;
        if (viewPager22 != null) {
            viewPager22.setOffscreenPageLimit(1);
        }
        C47043Dpd dpd = new C47043Dpd(1, this, this);
        this.A06 = dpd;
        ViewPager2 viewPager23 = this.viewPager;
        if (viewPager23 != null) {
            viewPager23.A05(dpd);
        }
        this.A0T.clear();
        TabLayout tabLayout2 = this.tabLayout;
        ViewPager2 viewPager24 = this.viewPager;
        if (!(tabLayout2 == null || viewPager24 == null)) {
            new C66992MgQ(viewPager24, tabLayout2, C46459DfN.A00).A00();
        }
        TabLayout tabLayout3 = this.tabLayout;
        if (tabLayout3 != null) {
            C324806zv.A00(tabLayout3, new C51008Fmv(this, 1), DbZ.A02(this), 0nA.A09(AnonymousClass7TE.A0S(tabLayout3)));
        }
        FollowListData followListData = this.A0C;
        if (followListData == null) {
            str = "initialFollowListData";
        } else {
            C46443Df5 df5 = followListData.A00;
            this.A0A = df5;
            List list = this.A0L;
            str = "tabs";
            if (list != null) {
                if (!00k.A0u(list, df5)) {
                    List list2 = this.A0L;
                    if (list2 != null) {
                        this.A0A = (C46443Df5) list2.get(0);
                    }
                }
                ViewPager2 viewPager25 = this.viewPager;
                if (viewPager25 != null) {
                    List list3 = this.A0L;
                    if (list3 != null) {
                        viewPager25.A03(list3.indexOf(this.A0A), false);
                    }
                }
                ViewPager2 viewPager26 = this.viewPager;
                if (viewPager26 != null) {
                    viewPager26.post(new C46460DfO(this));
                }
                Bundle bundle2 = this.mArguments;
                if (bundle2 != null && bundle2.getBoolean("UnifiedFollowFragment.IS_BOTTOM_SHEET")) {
                    TabLayout tabLayout4 = this.tabLayout;
                    if (tabLayout4 != null) {
                        DbT.A16(requireContext(), tabLayout4, 2Yu.A02(getContext()));
                    }
                    Bundle bundle3 = this.mArguments;
                    if (bundle3 != null && bundle3.getBoolean("UnifiedFollowFragment.EXTRA_SHOW_SECONDARY_CTA") && this.A08 != null && this.A07 != null) {
                        C238863Ds r3 = C238863Ds.SOCIAL_CONTEXT_SHEET;
                        C238833Dp A002 = C238833Dp.A00(getSession());
                        0qQ.A07(A002);
                        A002.A08(view, new C238873Dt((Integer) null, r3, (String) null, (String) null));
                        View view2 = this.A05;
                        if (view2 == null) {
                            0qQ.A0F("followListContainer");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        ViewGroup viewGroup = (ViewGroup) view2;
                        Context requireContext = requireContext();
                        AnonymousClass0eM r32 = this.A0U;
                        GTF gtf = new GTF(requireContext, AnonymousClass7TE.A0l(r32), this);
                        View A012 = GTF.A04.A01(requireContext(), viewGroup, AnonymousClass7TE.A0l(r32));
                        GTH gth = new GTH(AnonymousClass7TE.A0l(r32), this, this);
                        GTG gtg = new GTG(-1, 0);
                        Object tag = A012.getTag();
                        if (tag != null) {
                            GTD gtd = (GTD) tag;
                            1Xl r02 = this.A07;
                            if (r02 != null) {
                                gtf.A00(gth.A00(r02, gtg), gtd);
                                viewGroup.addView(A012);
                                viewGroup.invalidate();
                                C324466zK r03 = this.A08;
                                if (r03 != null) {
                                    r03.A02(A012);
                                    return;
                                }
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4x() {
        String str;
        0jB r2 = new 0jB();
        if (this.A0Q) {
            str = C273654mx.A00(988);
        } else {
            str = "swipe";
        }
        r2.A0A("action", str);
        C46443Df5 df5 = this.A0A;
        String str2 = null;
        if (df5 != null) {
            str2 = df5.A00;
        }
        r2.A0A("source_tab", str2);
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            List list = this.A0L;
            if (list == null) {
                0qQ.A0F("tabs");
                throw AnonymousClass00P.createAndThrow();
            }
            r2.A0A("dest_tab", ((C46443Df5) list.get(viewPager2.A00)).A00);
        }
        return r2;
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        UserSession userSession = (UserSession) this.A0U.getValue();
        String str = this.A0H;
        if (str == null) {
            0qQ.A0F("profileUserId");
            throw AnonymousClass00P.createAndThrow();
        } else if (2R8.A05(userSession, str)) {
            return "self_unified_follow_lists";
        } else {
            return "unified_follow_lists";
        }
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0U);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final boolean isContainerFragment() {
        return this.A0W;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final boolean isScrolledToBottom() {
        int ordinal;
        C273504mg r3;
        String str;
        C46443Df5 df5 = this.A0A;
        Fragment fragment = null;
        if (df5 != null) {
            C46431Des des = this.A0D;
            if (des == null) {
                str = "fragmentStateAdapter";
            } else {
                List list = this.A0L;
                if (list == null) {
                    str = "tabs";
                } else {
                    int indexOf = list.indexOf(df5);
                    SparseArray sparseArray = des.A00.A04;
                    if (sparseArray == null) {
                        str = "fragmentSparseArray";
                    } else {
                        fragment = (Fragment) sparseArray.get(indexOf);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C46443Df5 df52 = this.A0A;
        if (df52 == null) {
            ordinal = -1;
        } else {
            ordinal = df52.ordinal();
        }
        if ((ordinal == 0 || ordinal == 1 || ordinal == 3) && (fragment instanceof C273494mf) && (r3 = (C273504mg) fragment) != null) {
            return r3.isScrolledToBottom();
        }
        return false;
    }

    public final boolean isScrolledToTop() {
        int ordinal;
        C273494mf r3;
        String str;
        C46443Df5 df5 = this.A0A;
        Fragment fragment = null;
        if (df5 != null) {
            C46431Des des = this.A0D;
            if (des == null) {
                str = "fragmentStateAdapter";
            } else {
                List list = this.A0L;
                if (list == null) {
                    str = "tabs";
                } else {
                    int indexOf = list.indexOf(df5);
                    SparseArray sparseArray = des.A00.A04;
                    if (sparseArray == null) {
                        str = "fragmentSparseArray";
                    } else {
                        fragment = (Fragment) sparseArray.get(indexOf);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C46443Df5 df52 = this.A0A;
        if (df52 == null) {
            ordinal = -1;
        } else {
            ordinal = df52.ordinal();
        }
        if ((ordinal == 0 || ordinal == 1 || ordinal == 3) && (fragment instanceof C273494mf) && (r3 = (C273494mf) fragment) != null) {
            return r3.isScrolledToTop();
        }
        return false;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C324466zK r0 = this.A08;
        if (r0 != null) {
            r0.A01(i);
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r1[0] = X.C253673rC.A03(r3, java.lang.Integer.valueOf(r0));
        r0 = r3.getString(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        X.0qQ.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        r0 = r3.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r0 = X.DbV.A0v(r3, X.C253673rC.A03(r3, java.lang.Integer.valueOf(r1)), r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        X.0qQ.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C46443Df5 r6, com.instagram.user.userlist.fragment.UnifiedFollowFragment r7) {
        /*
            android.content.res.Resources r3 = X.DbV.A05(r7)
            X.0qQ.A07(r3)
            int r0 = r6.ordinal()
            r5 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x0037;
                case 2: goto L_0x0010;
                case 3: goto L_0x001f;
                case 4: goto L_0x009c;
                case 5: goto L_0x0010;
                case 6: goto L_0x0010;
                case 7: goto L_0x0010;
                case 8: goto L_0x0010;
                case 9: goto L_0x0010;
                case 10: goto L_0x00aa;
                case 11: goto L_0x00b0;
                case 12: goto L_0x00a4;
                case 13: goto L_0x008a;
                case 14: goto L_0x0010;
                case 15: goto L_0x0010;
                case 16: goto L_0x0086;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unrecognized tab: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x001f:
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_MUTUAL"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != r5) goto L_0x002f
            r0 = 2131967933(0x7f133fbd, float:1.9572746E38)
            goto L_0x006c
        L_0x002f:
            r2 = 2131970080(0x7f134820, float:1.95771E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r0 = r7.A03
            goto L_0x004e
        L_0x0037:
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_FOLLOWING"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != r5) goto L_0x0047
            r0 = 2131962634(0x7f132b0a, float:1.9561999E38)
            goto L_0x006c
        L_0x0047:
            r2 = 2131970079(0x7f13481f, float:1.9577099E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r0 = r7.A0R
        L_0x004e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.C253673rC.A03(r3, r0)
            r1[r4] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            goto L_0x0070
        L_0x005d:
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x0074
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_FOLLOWERS"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != r5) goto L_0x0074
            r0 = 2131962608(0x7f132af0, float:1.9561946E38)
        L_0x006c:
            java.lang.String r0 = r3.getString(r0)
        L_0x0070:
            X.0qQ.A0A(r0)
            return r0
        L_0x0074:
            r2 = 2131820722(0x7f1100b2, float:1.9274167E38)
            int r1 = r7.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = X.C253673rC.A03(r3, r0)
            java.lang.String r0 = X.DbV.A0v(r3, r0, r2, r1)
            goto L_0x0070
        L_0x0086:
            r0 = 2131969712(0x7f1346b0, float:1.9576355E38)
            goto L_0x009f
        L_0x008a:
            r1 = 2131970081(0x7f134821, float:1.9577103E38)
            int r0 = r7.A0S
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.C253673rC.A03(r3, r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r3, r0, r1)
            goto L_0x00c1
        L_0x009c:
            r0 = 2131974662(0x7f135a06, float:1.9586394E38)
        L_0x009f:
            java.lang.String r0 = r3.getString(r0)
            goto L_0x00c1
        L_0x00a4:
            r2 = 2131820897(0x7f110161, float:1.9274522E38)
            int r1 = r7.A01
            goto L_0x00b5
        L_0x00aa:
            r2 = 2131820898(0x7f110162, float:1.9274524E38)
            int r1 = r7.A02
            goto L_0x00b5
        L_0x00b0:
            r2 = 2131820896(0x7f110160, float:1.927452E38)
            int r1 = r7.A00
        L_0x00b5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = X.C253673rC.A03(r3, r0)
            java.lang.String r0 = X.DbV.A0v(r3, r0, r2, r1)
        L_0x00c1:
            X.0qQ.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.userlist.fragment.UnifiedFollowFragment.A00(X.Df5, com.instagram.user.userlist.fragment.UnifiedFollowFragment):java.lang.String");
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = -1597470263(0xffffffffa0c889c9, float:-3.3972496E-19)
            int r4 = X.AnonymousClass0fD.A02(r0)
            com.instagram.user.userlist.fragment.UnifiedFollowFragment.super.onCreate(r10)
            android.os.Bundle r6 = r9.requireArguments()
            java.lang.Class<com.instagram.user.recommended.FollowListData> r1 = com.instagram.user.recommended.FollowListData.class
            java.lang.String r0 = "UnifiedFollowFragment.INITIAL_FOLLOW_LIST_DATA"
            android.os.Parcelable r0 = X.C320236s2.A00(r6, r1, r0)
            com.instagram.user.recommended.FollowListData r0 = (com.instagram.user.recommended.FollowListData) r0
            r9.A0C = r0
            java.lang.String r8 = "initialFollowListData"
            if (r0 == 0) goto L_0x0168
            java.lang.String r0 = r0.A02
            r9.A0H = r0
            r0 = 2525(0x9dd, float:3.538E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.A0I = r0
            java.lang.String r0 = "UnifiedFollowFragment.MUTUAL_FOLLOWERS_COUNT"
            int r0 = r6.getInt(r0)
            r9.A03 = r0
            java.lang.String r0 = "UnifiedFollowFragment.FOLLOWER_COUNT"
            int r0 = r6.getInt(r0)
            r9.A02 = r0
            java.lang.String r0 = "UnifiedFollowFragment.FOLLOWING_COUNT"
            int r0 = r6.getInt(r0)
            r9.A0R = r0
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_ADMINS_COUNT"
            int r0 = r6.getInt(r0)
            r9.A00 = r0
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_BLOCKED_COUNT"
            int r0 = r6.getInt(r0)
            r9.A01 = r0
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_SUBSCRIBED_COUNT"
            int r0 = r6.getInt(r0)
            r9.A0S = r0
            java.lang.String r0 = "SimilarAccountsFragment.ARGUMENT_CHAINED_IDS"
            java.util.ArrayList r0 = r6.getStringArrayList(r0)
            r9.A0J = r0
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_LOGGING_FOLLOW_STATUS"
            java.io.Serializable r0 = r6.getSerializable(r0)
            if (r0 == 0) goto L_0x01c4
            X.6rY r0 = (X.C319986rY) r0
            r9.A09 = r0
            java.lang.String r0 = "UnifiedFollowFragment.ID_TO_ALGORITHM_MAP"
            java.io.Serializable r0 = r6.getSerializable(r0)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r9.A0K = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r9.A04 = r0
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_SHOW_SUBSCRIBED_TAB_IN_FOLLOWING"
            boolean r0 = r6.getBoolean(r0)
            r9.A0O = r0
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_SHOW_SPAM_FOLLOWERS_TAB"
            boolean r0 = r6.getBoolean(r0)
            r9.A0N = r0
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_SPAM_FOLLOWERS_SETTING_ENABLED"
            boolean r0 = r6.getBoolean(r0)
            r9.A0P = r0
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_USER_IS_GROUP_PROFILE"
            boolean r0 = r6.getBoolean(r0)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            if (r0 == 0) goto L_0x015c
            X.Df5 r0 = X.C46443Df5.GROUP_PROFILE_MEMBERS
            r5.add(r0)
            X.Df5 r0 = X.C46443Df5.GROUP_PROFILE_ADMINS
            r5.add(r0)
            int r0 = r9.A01
            if (r0 <= 0) goto L_0x00be
            X.Df5 r0 = X.C46443Df5.GROUP_PROFILE_BLOCKED
        L_0x00bb:
            r5.add(r0)
        L_0x00be:
            r9.A0L = r5
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_SHOW_CREATOR_RECS"
            boolean r0 = r6.getBoolean(r0)
            r9.A0M = r0
            X.0eM r5 = r9.A0U
            X.1Ng r2 = X.DbX.A0R(r5)
            java.lang.Class<X.FWc> r1 = X.C50271FWc.class
            X.1wn r0 = r9.A0V
            r2.A01(r0, r1)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r5)
            r2 = 31784969(0x1e50009, float:8.4121365E-38)
            java.lang.String r0 = "Following"
            X.DuK r1 = new X.DuK
            r1.<init>(r3, r0, r2)
            r9.A0G = r1
            android.content.Context r0 = r9.requireContext()
            X.DbY.A0v(r0, r1, r9, r5)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r5)
            r2 = 31784968(0x1e50008, float:8.412136E-38)
            java.lang.String r0 = "Followers"
            X.DuK r1 = new X.DuK
            r1.<init>(r3, r0, r2)
            r9.A0F = r1
            android.content.Context r0 = r9.requireContext()
            X.DbY.A0v(r0, r1, r9, r5)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r5)
            r2 = 224340297(0xd5f2949, float:6.8766876E-31)
            com.instagram.user.recommended.FollowListData r0 = r9.A0C
            if (r0 == 0) goto L_0x0168
            X.Df5 r0 = r0.A00
            java.lang.String r0 = r0.toString()
            X.DuK r1 = new X.DuK
            r1.<init>(r3, r0, r2)
            r9.A0E = r1
            android.content.Context r0 = r9.requireContext()
            X.DbY.A0v(r0, r1, r9, r5)
            android.os.Bundle r1 = r9.mArguments
            if (r1 == 0) goto L_0x0155
            java.lang.String r0 = "UnifiedFollowFragment.EXTRA_MEDIA_ID"
            java.lang.String r3 = r1.getString(r0)
            if (r3 == 0) goto L_0x0155
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            android.os.Bundle r1 = r9.requireArguments()
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r0 = "fragment_argument_ad_retrieval_key"
            java.lang.String r0 = r1.getString(r0)
            X.1Xl r0 = X.C324666zh.A00(r2, r0, r3)
            r9.A07 = r0
            if (r0 == 0) goto L_0x0155
            android.content.Context r0 = r9.requireContext()
            X.6zK r0 = X.C324456zJ.A00(r0)
            r9.A08 = r0
            r9.registerLifecycleListener(r0)
        L_0x0155:
            r0 = -562324083(0xffffffffde7b9d8d, float:-4.53270068E18)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x015c:
            X.0eM r0 = r9.A0U
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r9.A0H
            if (r0 != 0) goto L_0x0170
            java.lang.String r8 = "profileUserId"
        L_0x0168:
            X.0qQ.A0F(r8)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0170:
            boolean r7 = X.2R8.A05(r1, r0)
            if (r7 != 0) goto L_0x019c
            int r0 = r9.A03
            if (r0 <= 0) goto L_0x019c
            X.Df5 r0 = X.C46443Df5.MUTUAL
            r5.add(r0)
        L_0x017f:
            X.Df5 r0 = X.C46443Df5.FOLLOWERS
            r5.add(r0)
            X.Df5 r0 = X.C46443Df5.FOLLOWING
            r5.add(r0)
            if (r7 != 0) goto L_0x01b3
            android.os.Bundle r2 = r9.mArguments
            r1 = 1
            if (r2 == 0) goto L_0x00be
            java.lang.String r0 = "UnifiedFollowFragment.HAS_SIMILAR_ACCOUNTS"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != r1) goto L_0x00be
            X.Df5 r0 = X.C46443Df5.SIMILAR
            goto L_0x00bb
        L_0x019c:
            com.instagram.user.recommended.FollowListData r2 = r9.A0C
            if (r2 == 0) goto L_0x0168
            X.Df5 r1 = r2.A00
            X.Df5 r0 = X.C46443Df5.MUTUAL
            if (r1 != r0) goto L_0x017f
            X.Df5 r3 = X.C46443Df5.FOLLOWERS
            java.lang.String r2 = r2.A02
            r1 = 0
            r0 = 0
            com.instagram.user.recommended.FollowListData r0 = X.C46451DfE.A00(r3, r2, r1, r0)
            r9.A0C = r0
            goto L_0x017f
        L_0x01b3:
            boolean r0 = r9.A0O
            if (r0 == 0) goto L_0x01bc
            X.Df5 r0 = X.C46443Df5.SUBSCRIBED
            r5.add(r0)
        L_0x01bc:
            boolean r0 = r9.A0N
            if (r0 == 0) goto L_0x00be
            X.Df5 r0 = X.C46443Df5.SPAM_FOLLOWERS
            goto L_0x00bb
        L_0x01c4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1883998907(0xffffffff8fb47545, float:-1.7794541E-29)
            X.AnonymousClass0fD.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.userlist.fragment.UnifiedFollowFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1546210224);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.cloneInContext(new C251383n1(getContext(), 2132017996)).inflate(R.layout.unified_follow_fragment_layout, viewGroup, false);
        this.A05 = inflate.getRootView().requireViewById(R.id.unified_follow_list_view_pager_wrapper);
        AnonymousClass0fD.A09(-1277239527, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-2003615625);
        super.onDestroy();
        this.A08 = null;
        DbX.A0R(this.A0U).A02(this.A0V, C50271FWc.class);
        AnonymousClass0fD.A09(1996667330, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1107636717);
        super.onDestroyView();
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setAdapter((2Rw) null);
        }
        UnifiedFollowFragmentLifecycleUtil.cleanupReferences(this);
        this.A0T.clear();
        AnonymousClass0fD.A09(1889666818, A022);
    }
}
