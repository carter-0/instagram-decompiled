package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import java.util.HashMap;

/* renamed from: X.E6h  reason: case insensitive filesystem */
public final class C47521E6h extends C227812jx implements AnonymousClass4DU, C273504mg, C273494mf, C51960G9g, AnonymousClass32I, AnonymousClass4DS, AnonymousClass4Zh, AnonymousClass32K, G6S {
    public static final String __redex_internal_original_name = "SocialContextFollowListFragment";
    public View A00;
    public 1Xl A01;
    public C324466zK A02;
    public C47585E8x A03;
    public SocialContextFollowListFragmentConfig A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = true;
    public DdO A08;
    public AnonymousClass7Q8 A09;
    public final C228172ku A0A = new C228172ku();
    public final HashMap A0B = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A0C = C227642jf.A02(this);

    public final void D2K(IgImageView igImageView, 1Xl r13, int i, int i2, boolean z, boolean z2) {
        AnonymousClass7TF.A1C(r13, 0, igImageView);
        AnonymousClass0eM r3 = this.A0C;
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

    public final void D2Y(FollowStatus followStatus, User user) {
        0qQ.A0B(user, 0);
        F8H.A01(this, AnonymousClass7TE.A0l(this.A0C), user, "mutual_list");
    }

    public final void D2p(User user) {
        0qQ.A0B(user, 0);
        F8H.A00(this, AnonymousClass7TE.A0l(this.A0C), user);
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void D33(SparseArray sparseArray, Integer num) {
    }

    public final void D37(SparseArray sparseArray) {
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final void DSJ(View view, User user, boolean z) {
    }

    public final void DdL(User user) {
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = this.A04;
        if (socialContextFollowListFragmentConfig == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        } else if (!socialContextFollowListFragmentConfig.A06) {
            DbW.A1B(r2, 2131962608);
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final String getModuleName() {
        return "profile_social_context";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isScrolledToBottom() {
        return AnonymousClass7TF.A1Q(DbV.A0F(this).canScrollVertically(1) ? 1 : 0);
    }

    public final boolean isScrolledToTop() {
        return AnonymousClass7TF.A1Q(DbV.A0F(this).canScrollVertically(-1) ? 1 : 0);
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
        C228172ku r2 = this.A0A;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        AnonymousClass0eM r3 = this.A0C;
        r2.A03(new C46446Df8(AnonymousClass7TE.A0l(r3), this));
        getScrollingViewProxy().AAD(new C47914EMi(this, 1));
        C47585E8x e8x = this.A03;
        if (e8x == null) {
            str = "socialContextFollowListAdapter";
        } else {
            setAdapter(e8x);
            if (this.A02 != null) {
                C238863Ds r22 = C238863Ds.SOCIAL_CONTEXT_SHEET;
                C238833Dp A002 = C238833Dp.A00(DbT.A0X(r3));
                0qQ.A07(A002);
                A002.A08(view, new C238873Dt((Integer) null, r22, (String) null, (String) null));
                View view2 = this.A00;
                if (view2 == null) {
                    str = "followContainer";
                } else {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    GTF gtf = new GTF(requireContext(), AnonymousClass7TE.A0l(r3), this);
                    View A012 = GTF.A04.A01(requireContext(), viewGroup, AnonymousClass7TE.A0l(r3));
                    GTH gth = new GTH(AnonymousClass7TE.A0l(r3), this, this);
                    GTG gtg = new GTG(-1, 0);
                    Object tag = A012.getTag();
                    if (tag != null) {
                        GTD gtd = (GTD) tag;
                        1Xl r0 = this.A01;
                        if (r0 != null) {
                            gtf.A00(gth.A00(r0, gtg), gtd);
                            viewGroup.addView(A012);
                            viewGroup.invalidate();
                            C324466zK r02 = this.A02;
                            if (r02 != null) {
                                r02.A02(A012);
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            }
            if (this.A05 && getScrollingViewProxy().CWN()) {
                DbV.A0F(this).setBackground((Drawable) null);
                return;
            }
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D34() {
        C46443Df5 df5 = C46443Df5.FOLLOWERS;
        SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = this.A04;
        if (socialContextFollowListFragmentConfig == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        FollowListData A002 = C46451DfE.A00(df5, socialContextFollowListFragmentConfig.A08, (String) null, true);
        F8I.A00(requireActivity(), AnonymousClass7TE.A0l(this.A0C), A002, false).A04();
        DbZ.A15(this);
    }

    public final void D35() {
        C46443Df5 df5 = C46443Df5.MUTUAL;
        SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = this.A04;
        if (socialContextFollowListFragmentConfig == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        FollowListData A002 = C46451DfE.A00(df5, socialContextFollowListFragmentConfig.A08, (String) null, true);
        F8I.A00(requireActivity(), AnonymousClass7TE.A0l(this.A0C), A002, true).A04();
        DbZ.A15(this);
    }

    public final void D36() {
        if (AnonymousClass7TF.A1V(C66571pQ.A02)) {
            C309516Yo A0N = DbX.A0N(requireActivity(), this.A0C);
            A0N.A0B((Bundle) null, FC6.A00().A00().A01("social_context_follow_list", getString(2131960850)));
            A0N.A04();
            DbZ.A15(this);
        }
    }

    public final void EG6(UserSession userSession, int i) {
        C47585E8x e8x = this.A03;
        String str = "socialContextFollowListAdapter";
        if (e8x != null) {
            int i2 = i;
            if (i < e8x.A05.size()) {
                C47585E8x e8x2 = this.A03;
                if (e8x2 != null) {
                    if (i < e8x2.A04 - 1) {
                        User A0g = DbS.A0g(e8x2.A05, i);
                        HashMap hashMap = this.A0B;
                        if (!hashMap.containsKey(A0g.getId())) {
                            hashMap.put(A0g.getId(), Integer.valueOf(i));
                            UserSession A0l = AnonymousClass7TE.A0l(this.A0C);
                            String id = A0g.getId();
                            SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = this.A04;
                            if (socialContextFollowListFragmentConfig == null) {
                                str = "config";
                            } else {
                                F87.A00(A0l, socialContextFollowListFragmentConfig.A07, (Integer) null, id, (String) null, "profile_social_context", i2);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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

    public final int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
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

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C324466zK r0 = this.A02;
        if (r0 != null) {
            r0.A01(i);
        }
    }

    public final void onUserRowClick(User user) {
        Number number = (Number) DbV.A0r(user, this.A0B);
        if (number != null) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0C);
            SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = this.A04;
            if (socialContextFollowListFragmentConfig != null) {
                FollowListData followListData = socialContextFollowListFragmentConfig.A07;
                String id = user.getId();
                int intValue = number.intValue();
                SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig2 = this.A04;
                if (socialContextFollowListFragmentConfig2 != null) {
                    F87.A01(A0l, followListData, id, "follow_list_user_tap", socialContextFollowListFragmentConfig2.A07.A02, "profile_social_context", intValue);
                }
            }
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0eM r4 = this.A0C;
        UserDetailLaunchConfig A012 = C46474Dfc.A01(AnonymousClass7TE.A0l(r4), user.getId(), "social_context_follow_list", "profile_social_context");
        if (this.A05) {
            F8F.A00(requireActivity(), AnonymousClass7TE.A0l(r4), A012);
            return;
        }
        C309516Yo A0P = DbZ.A0P(this, r4);
        A0P.A0F = true;
        A0P.A0D(C46447Df9.A02().A02(AnonymousClass7TE.A0l(r4), A012));
        A0P.A04();
        DbZ.A15(this);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b7, code lost:
        if (X.182.A06(X.0Tu.A05, r10, 36325673748608128L) == false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r32) {
        /*
            r31 = this;
            r0 = -1517389603(0xffffffffa58e78dd, float:-2.4714974E-16)
            int r8 = X.AnonymousClass0fD.A02(r0)
            r5 = r31
            r0 = r32
            super.onCreate(r0)
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.Class<com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig> r1 = com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig.class
            r0 = 2497(0x9c1, float:3.499E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = X.C320236s2.A00(r2, r1, r0)
            com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig r0 = (com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig) r0
            r5.A04 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "FollowListFragment.IsBottomSheet"
            r4 = 0
            boolean r0 = r1.getBoolean(r0, r4)
            r5.A05 = r0
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0eM r6 = r5.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            X.ELS r0 = new X.ELS
            r0.<init>((androidx.fragment.app.FragmentActivity) r2, (com.instagram.common.session.UserSession) r1, (X.C47521E6h) r5)
            r5.A08 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "FollowListFragment.MediaId"
            r3 = 0
            java.lang.String r7 = r1.getString(r0, r3)
            if (r7 == 0) goto L_0x0071
            android.content.Context r0 = r5.requireContext()
            X.6zK r0 = X.C324456zJ.A00(r0)
            r5.A02 = r0
            r5.registerLifecycleListener(r0)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            android.os.Bundle r1 = r5.requireArguments()
            X.0qQ.A0B(r2, r4)
            java.lang.String r0 = "fragment_argument_ad_retrieval_key"
            java.lang.String r0 = r1.getString(r0)
            X.1Xl r0 = X.C324666zh.A00(r2, r0, r7)
            r5.A01 = r0
        L_0x0071:
            android.content.Context r16 = r5.requireContext()
            androidx.fragment.app.FragmentActivity r15 = r5.requireActivity()
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r6)
            X.DdO r7 = r5.A08
            if (r7 != 0) goto L_0x008b
            java.lang.String r13 = "delegate"
        L_0x0083:
            X.0qQ.A0F(r13)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008b:
            com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig r0 = r5.A04
            java.lang.String r13 = "config"
            if (r0 == 0) goto L_0x0083
            int r12 = r0.A00
            com.instagram.user.recommended.FollowListData r0 = r0.A07
            X.Df5 r2 = r0.A00
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r6)
            X.AnonymousClass7TG.A1N(r2, r10)
            X.Df5 r0 = X.C46443Df5.FOLLOWERS
            if (r2 == r0) goto L_0x00aa
            X.Df5 r0 = X.C46443Df5.FOLLOWING
            if (r2 == r0) goto L_0x00aa
            X.Df5 r0 = X.C46443Df5.MUTUAL
            if (r2 != r0) goto L_0x00b9
        L_0x00aa:
            X.0Tu r9 = X.0Tu.A05
            r0 = 36325673748608128(0x810e0200033480, double:3.035840578142823E-306)
            boolean r0 = X.182.A06(r9, r10, r0)
            r27 = 1
            if (r0 != 0) goto L_0x00bb
        L_0x00b9:
            r27 = 0
        L_0x00bb:
            com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig r0 = r5.A04
            if (r0 == 0) goto L_0x0083
            boolean r10 = r0.A04
            X.0lg r11 = X.AnonymousClass7TF.A0L(r6, r4)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36323066703457094(0x810ba300032b46, double:3.034191872291581E-306)
            boolean r0 = X.182.A06(r9, r11, r0)
            if (r0 != 0) goto L_0x00de
            X.0lg r11 = X.AnonymousClass7TF.A0L(r6, r4)
            r0 = 36323066703522631(0x810ba300042b47, double:3.034191872333027E-306)
            X.182.A06(r9, r11, r0)
        L_0x00de:
            android.os.Bundle r11 = r5.requireArguments()
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig r0 = r5.A04
            if (r0 == 0) goto L_0x0083
            com.instagram.user.recommended.FollowListData r0 = r0.A07
            X.Det r1 = new X.Det
            r1.<init>(r11, r9, r0)
            boolean r0 = r5.A05
            android.os.Bundle r11 = r5.requireArguments()
            java.lang.String r9 = "FollowListFragment.AddAdUniversalCTAGap"
            boolean r30 = r11.getBoolean(r9, r4)
            X.E8x r14 = new X.E8x
            r19 = r5
            r21 = r2
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r1
            r26 = r12
            r28 = r10
            r29 = r0
            r20 = r7
            r17 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5.A03 = r14
            android.content.Context r7 = r5.requireContext()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            X.E8x r1 = r5.A03
            if (r1 == 0) goto L_0x0197
            X.7Q8 r0 = new X.7Q8
            r0.<init>(r7, r2, r1)
            r5.A09 = r0
            r0.A00()
            r10 = 1
            r5.A07 = r10
            X.E8x r1 = r5.A03
            if (r1 == 0) goto L_0x0197
            java.util.Set r0 = r1.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x014c
            java.util.Set r0 = r1.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x014c
            boolean r0 = r5.A07
            X.C46445Df7.A01(r5, r0)
        L_0x014c:
            X.0lg r2 = X.DbT.A0X(r6)
            com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig r1 = r5.A04
            if (r1 == 0) goto L_0x0083
            java.lang.String r9 = r1.A08
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0194
            int r7 = r1.A00
        L_0x015c:
            java.lang.String r6 = "profile_social_context"
            X.0qQ.A0B(r2, r4)
            X.0qQ.A0B(r9, r10)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r0 = "discover/surface_with_su/"
            r2.A0A(r0)
            java.lang.Class<X.Dvy> r1 = X.C47364Dvy.class
            java.lang.Class<X.F7Y> r0 = X.F7Y.class
            r2.A0O(r3, r1, r0, r4)
            java.lang.String r0 = "module"
            r2.A9m(r0, r6)
            java.lang.String r0 = "target_id"
            r2.A9m(r0, r9)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "mutual_followers_limit"
            X.1OC r1 = X.DbT.A0T(r2, r0, r1)
            r0 = 53
            X.C47696EDf.A00(r5, r1, r0)
            r0 = -1379630414(0xffffffffadc482b2, float:-2.234066E-11)
            X.AnonymousClass0fD.A09(r0, r8)
            return
        L_0x0194:
            r7 = 12
            goto L_0x015c
        L_0x0197:
            java.lang.String r13 = "socialContextFollowListAdapter"
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47521E6h.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(156961811);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        this.A00 = inflate.requireViewById(R.id.layout_listview_parent_container);
        AnonymousClass0fD.A09(591743807, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1264700878);
        AnonymousClass7Q8 r1 = this.A09;
        if (r1 == null) {
            0qQ.A0F("followStatusUpdatedListener");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A01();
        this.A02 = null;
        super.onDestroy();
        AnonymousClass0fD.A09(168638293, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(153376878);
        C47521E6h.super.onPause();
        this.A06 = false;
        AnonymousClass0fD.A09(-399605249, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1603283978);
        super.onResume();
        if (182.A06(0Tu.A05, DbT.A0X(this.A0C), 36325003733512746L)) {
            ((C47585E8x) getAdapter()).A0C();
        }
        this.A06 = true;
        AnonymousClass0fD.A09(-1173621446, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(521730998);
        C47521E6h.super.onStart();
        C46445Df7.A01(this, this.A07);
        AnonymousClass0fD.A09(179233909, A022);
    }

    public final C358248ab ALt(C358248ab r1) {
        Dba.A1K(this, r1);
        return r1;
    }
}
