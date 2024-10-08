package com.instagram.profile.fragment;

import X.00k;
import X.02V;
import X.08m;
import X.0Tu;
import X.0Yv;
import X.0hq;
import X.0qQ;
import X.0xY;
import X.182;
import X.1Au;
import X.1Jk;
import X.1Xj;
import X.1q7;
import X.2PP;
import X.AnonymousClass05K;
import X.AnonymousClass07Z;
import X.AnonymousClass08u;
import X.AnonymousClass0iw;
import X.AnonymousClass2rW;
import X.AnonymousClass2xO;
import X.AnonymousClass32J;
import X.AnonymousClass32Q;
import X.AnonymousClass3AB;
import X.AnonymousClass3AD;
import X.AnonymousClass3BD;
import X.AnonymousClass3W1;
import X.AnonymousClass4DH;
import X.AnonymousClass4DU;
import X.AnonymousClass4UC;
import X.AnonymousClass4UE;
import X.AnonymousClass4c1;
import X.AnonymousClass5PJ;
import X.AnonymousClass723;
import X.AnonymousClass72p;
import X.C15953UlV;
import X.C17884Vhb;
import X.C20962X6p;
import X.C228402lc;
import X.C231292rN;
import X.C233922wh;
import X.C2355930l;
import X.C238103Ao;
import X.C238133Ar;
import X.C267614bu;
import X.C267634bw;
import X.C267644bx;
import X.C267654by;
import X.C273674n0;
import X.C294255m9;
import X.C294265mA;
import X.C318996ps;
import X.C319006pt;
import X.C321616uT;
import X.C322186vO;
import X.C322206vQ;
import X.C322216vR;
import X.C322356vh;
import X.C322486vu;
import X.C322496vv;
import X.C322506vw;
import X.C322586w4;
import X.C322596w5;
import X.C322606w6;
import X.C322616w8;
import X.C322626w9;
import X.C322636wA;
import X.C322646wB;
import X.C322656wC;
import X.C322666wD;
import X.C322686wF;
import X.C322696wG;
import X.C322706wH;
import X.C322736wK;
import X.C322796wQ;
import X.C322806wR;
import X.C322816wS;
import X.C322826wT;
import X.C322866wX;
import X.C322876wY;
import X.C323756y3;
import X.C323906yI;
import X.C324246ys;
import X.C324376zB;
import X.C48247EbS;
import X.C59146J8c;
import X.C59345JFx;
import X.C62000qj;
import X.Dc6;
import X.GTX;
import X.IWD;
import X.WZM;
import X.WZN;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UserDetailTabController implements C231292rN, AnonymousClass08u, C267654by {
    public int A00;
    public int A01;
    public WZN A02;
    public C319006pt A03;
    public C322596w5 A04;
    public Integer A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public C20962X6p A0E;
    public boolean A0F;
    public boolean A0G;
    public final ViewTreeObserver.OnPreDrawListener A0H;
    public final FragmentActivity A0I;
    public final C324246ys A0J;
    public final C324246ys A0K;
    public final AnonymousClass4DH A0L;
    public final UserSession A0M;
    public final C322876wY A0N;
    public final C322686wF A0O;
    public final C322486vu A0P;
    public final C322706wH A0Q;
    public final C322796wQ A0R;
    public final C322806wR A0S;
    public final UserDetailFragment A0T;
    public final C322616w8 A0U;
    public final C322356vh A0V;
    public final AnonymousClass3AB A0W;
    public final Runnable A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final C322696wG A0e;
    public final UserDetailFragment A0f;
    public final C322626w9 A0g;
    public final AnonymousClass4c1 A0h;
    public final boolean A0i;
    public AnonymousClass72p mOpalSwitchIndicatorHelper;
    public FadeInFollowButton mOverFlowFollowButton;
    public View mPVFollowSecondaryCTAView;
    public IgTextView mUpsellFollowButtonView;
    public C323906yI mUserDetailEmptyStateController;
    public C323756y3 mViewHolder;

    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.A06 = "swipe";
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onPageSelected(int i) {
        A05(this, i, true);
    }

    public static void A00(UserDetailTabController userDetailTabController) {
        if (userDetailTabController.mViewHolder != null && userDetailTabController.A0C) {
            A04(userDetailTabController);
            if (userDetailTabController.A0A) {
                userDetailTabController.mViewHolder.A0J.setIsLoading(false);
                return;
            }
            C323756y3 r0 = userDetailTabController.mViewHolder;
            if (r0 != null) {
                r0.A02.getLayoutParams().A02 = 49;
            }
            userDetailTabController.mViewHolder.A0E.A05 = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (X.C323926yK.A02(r8.A01, r2.A0J) != false) goto L_0x0021;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.profile.fragment.UserDetailTabController r11) {
        /*
            X.6yI r8 = r11.mUserDetailEmptyStateController
            if (r8 == 0) goto L_0x00c4
            X.6vu r2 = r8.A03
            X.6vy r0 = r2.A0g
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x0016
            com.instagram.common.session.UserSession r1 = r2.A0c
            com.instagram.user.model.User r0 = r2.A0J
            boolean r0 = X.C324376zB.A01(r1, r0)
            if (r0 != 0) goto L_0x0021
        L_0x0016:
            com.instagram.common.session.UserSession r1 = r8.A01
            com.instagram.user.model.User r0 = r2.A0J
            boolean r1 = X.C323926yK.A02(r1, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            X.3oV r7 = r8.A02
            if (r0 == 0) goto L_0x0137
            r1 = 0
            r7.setVisibility(r1)
            android.view.View r0 = r7.getView()
            android.content.Context r6 = r0.getContext()
            com.instagram.common.session.UserSession r2 = r8.A01
            X.6vu r10 = r8.A03
            com.instagram.user.model.User r0 = r10.A0J
            boolean r0 = X.C323926yK.A02(r2, r0)
            r5 = 0
            if (r0 == 0) goto L_0x00e2
            com.instagram.common.session.UserSession r3 = r10.A0c
            com.instagram.user.model.User r0 = r10.A0J
            boolean r0 = X.C324376zB.A01(r3, r0)
            if (r0 != 0) goto L_0x00e2
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323899926916695(0x810c6500002e57, double:3.034718806162554E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            boolean r1 = r10.A0j
            if (r0 != 0) goto L_0x00d2
            if (r1 == 0) goto L_0x00c7
            r0 = 2131976613(0x7f1361a5, float:1.9590351E38)
            java.lang.String r4 = r6.getString(r0)
            r0 = 2131976612(0x7f1361a4, float:1.959035E38)
        L_0x0064:
            java.lang.String r1 = r6.getString(r0)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r11 = r0.A01(r2)
            X.0eM r0 = r8.A04
            java.lang.Object r9 = r0.getValue()
            X.LCS r9 = (X.LCS) r9
            java.lang.String r0 = r2.A06
            r2 = 10
            java.lang.Long r3 = X.00y.A0n(r2, r0)
            com.instagram.user.model.User r0 = r10.A0J
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r0.getId()
            java.lang.Long r5 = X.00y.A0n(r2, r0)
        L_0x008a:
            X.4Cl r0 = r11.A03
            java.lang.Boolean r0 = r0.CaZ()
            if (r0 == 0) goto L_0x00c5
            boolean r2 = r0.booleanValue()
        L_0x0096:
            java.lang.String r0 = "publisher_profile_block"
            r9.A00(r3, r5, r0, r2)
            r9 = 2131238598(0x7f081ec6, float:1.809348E38)
            r0 = 2131954413(0x7f130aed, float:1.9545325E38)
            java.lang.String r5 = r6.getString(r0)
            X.Wdy r0 = new X.Wdy
            r0.<init>(r6, r8)
        L_0x00aa:
            X.6rr r3 = X.C320156rr.EMPTY
            android.view.View r2 = r7.getView()
            com.instagram.ui.emptystaterow.EmptyStateView r2 = (com.instagram.ui.emptystaterow.EmptyStateView) r2
            r2.A0R(r3, r9)
            r2.A0W(r3, r4)
            r2.A0V(r3, r1)
            r2.A0U(r3, r5)
            r2.A0O(r0, r3)
            r2.A0H()
        L_0x00c4:
            return
        L_0x00c5:
            r2 = 0
            goto L_0x0096
        L_0x00c7:
            r0 = 2131976615(0x7f1361a7, float:1.9590356E38)
            java.lang.String r4 = r6.getString(r0)
            r0 = 2131976614(0x7f1361a6, float:1.9590354E38)
            goto L_0x0064
        L_0x00d2:
            r0 = 2131968318(0x7f13413e, float:1.9573527E38)
            if (r1 == 0) goto L_0x00da
            r0 = 2131968319(0x7f13413f, float:1.957353E38)
        L_0x00da:
            java.lang.String r4 = r6.getString(r0)
            r0 = 2131968320(0x7f134140, float:1.9573531E38)
            goto L_0x0064
        L_0x00e2:
            r0 = 2131975275(0x7f135c6b, float:1.9587638E38)
            java.lang.String r0 = r6.getString(r0)
            X.0qQ.A07(r0)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r4 = r0.toLowerCase(r9)
            X.0qQ.A07(r4)
            int r0 = r4.length()
            r3 = 1
            if (r0 <= 0) goto L_0x0126
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char r0 = r4.charAt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            X.0qQ.A0C(r1, r0)
            java.lang.String r0 = r1.toUpperCase(r9)
            X.0qQ.A07(r0)
            r2.append(r0)
            java.lang.String r0 = r4.substring(r3)
            X.0qQ.A07(r0)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
        L_0x0126:
            r0 = 2131962588(0x7f132adc, float:1.9561905E38)
            java.lang.String r1 = r6.getString(r0)
            X.Tqr r0 = new X.Tqr
            r0.<init>(r8)
            r9 = 2131238510(0x7f081e6e, float:1.80933E38)
            goto L_0x00aa
        L_0x0137:
            r0 = 8
            r7.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.UserDetailTabController.A01(com.instagram.profile.fragment.UserDetailTabController):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v21, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r26v3, types: [X.6wS] */
    /* JADX WARNING: type inference failed for: r0v193 */
    /* JADX WARNING: type inference failed for: r26v4, types: [X.IWP] */
    /* JADX WARNING: type inference failed for: r0v194 */
    /* JADX WARNING: type inference failed for: r26v5, types: [X.6s8] */
    /* JADX WARNING: type inference failed for: r0v195 */
    /* JADX WARNING: type inference failed for: r0v196 */
    /* JADX WARNING: type inference failed for: r0v197 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e3, code lost:
        throw new java.lang.IllegalStateException(X.002.A0R("Could not find provider for tab ", r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r6.A03.BPt().intValue() <= 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02ed, code lost:
        r8.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36330161989239273L) != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x035b, code lost:
        if (r1 != false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x036b, code lost:
        if (r0.booleanValue() != false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0380, code lost:
        if (r11.equals("created") == false) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x02ed, code lost:
        r26 = new X.C322816wS(r27, r15, r3, r30, r1, r32, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        if (r10.A00 == false) goto L_0x00e4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03dd A[LOOP:2: B:192:0x03d6->B:194:0x03dd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(com.instagram.profile.fragment.UserDetailTabController r34) {
        /*
            r7 = r34
            X.6vu r2 = r7.A0P
            com.instagram.user.model.User r6 = r2.A0J
            X.6y3 r0 = r7.mViewHolder
            if (r0 == 0) goto L_0x04d5
            if (r6 == 0) goto L_0x04d5
            r5 = 0
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x04a3
            com.instagram.common.session.UserSession r0 = r2.A0c
            boolean r0 = X.C324376zB.A02(r0, r6)
            if (r0 == 0) goto L_0x04a3
            X.4Cl r0 = r6.A03
            java.lang.Integer r0 = r0.BPt()
            if (r0 == 0) goto L_0x002e
            X.4Cl r0 = r6.A03
            java.lang.Integer r0 = r0.BPt()
            int r0 = r0.intValue()
            r1 = 1
            if (r0 > 0) goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            X.6vy r0 = r2.A0g
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x0049
            if (r1 != 0) goto L_0x0049
            com.instagram.common.session.UserSession r3 = r7.A0M
            X.0qQ.A0B(r3, r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330161989239273(0x811217000041e9, double:3.0386789595906535E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x04a3
        L_0x0049:
            X.6y3 r0 = r7.mViewHolder
            android.view.View r0 = r0.A01
            r0.setVisibility(r5)
            X.6y3 r0 = r7.mViewHolder
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r0 = r0.A0I
            r0.setVisibility(r5)
            X.6wR r4 = r7.A0S
            X.01N r8 = X.0jo.A1H()
            java.lang.String r25 = "profile_media_grid"
            r0 = r25
            r8.add(r0)
            java.lang.String r24 = "profile_highlights"
            X.Dc6 r0 = r4.A04
            r34 = r0
            com.instagram.api.schemas.IGUserHighlightsTrayType r1 = r0.A01
            com.instagram.api.schemas.IGUserHighlightsTrayType r0 = com.instagram.api.schemas.IGUserHighlightsTrayType.SUBTAB
            if (r1 != r0) goto L_0x0076
            boolean r0 = r6.A1q()
            if (r0 != 0) goto L_0x007a
        L_0x0076:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x008e
        L_0x007a:
            com.instagram.common.session.UserSession r3 = r4.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329019528068836(0x81110d00023ee4, double:3.037956462546147E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x008e
            r0 = r24
            r8.add(r0)
        L_0x008e:
            java.lang.String r14 = "profile_fan_club_grid"
            com.instagram.common.session.UserSession r3 = r4.A02
            boolean r0 = X.C324726zn.A01(r3, r6)
            if (r0 == 0) goto L_0x00b6
            X.4Cl r0 = r6.A03
            java.lang.Boolean r1 = r0.BB5()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x00b3
            X.17M r1 = r6.A02
            X.17M r0 = X.17M.A06
            if (r1 != r0) goto L_0x00b6
        L_0x00b3:
            r8.add(r14)
        L_0x00b6:
            java.lang.String r13 = "profile_clips"
            boolean r2 = r4.A0A
            X.6wU r10 = r4.A07
            r23 = 3
            r0 = r23
            X.0qQ.A0B(r10, r0)
            int r0 = r6.A07()
            r11 = 0
            if (r0 <= 0) goto L_0x00cb
            r11 = 1
        L_0x00cb:
            int r0 = r6.A07()
            if (r0 <= 0) goto L_0x00e4
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.BCP()
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r10.A00
            r9 = 1
            if (r0 != 0) goto L_0x00e5
        L_0x00e4:
            r9 = 0
        L_0x00e5:
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r6.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0332
            if (r11 != 0) goto L_0x00f7
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x0334
        L_0x00f7:
            r8.add(r13)
        L_0x00fa:
            java.lang.String r22 = "profile_ar_effects"
            X.4Cl r0 = r6.A03
            java.lang.Integer r0 = r0.C8d()
            if (r0 == 0) goto L_0x010f
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x010f
            r0 = r22
            r8.add(r0)
        L_0x010f:
            java.lang.String r21 = "profile_reposts"
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.BC1()
            if (r0 == 0) goto L_0x012a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x012a
            boolean r0 = X.C321616uT.A00(r3)
            if (r0 == 0) goto L_0x012a
            r0 = r21
            r8.add(r0)
        L_0x012a:
            java.lang.String r20 = "profile_saved"
            if (r2 == 0) goto L_0x013b
            X.0Tu r9 = X.0Tu.A05
            r0 = 36320292154384590(0x81091d000020ce, double:3.032437236285917E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 != 0) goto L_0x0159
        L_0x013b:
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.BBx()
            if (r0 == 0) goto L_0x015e
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x015e
            boolean r0 = X.I31.A01(r3)
            if (r0 == 0) goto L_0x0151
            if (r2 != 0) goto L_0x0159
        L_0x0151:
            boolean r0 = X.I31.A00(r3)
            if (r0 == 0) goto L_0x015e
            if (r2 != 0) goto L_0x015e
        L_0x0159:
            r0 = r20
            r8.add(r0)
        L_0x015e:
            java.lang.String r19 = "profile_products"
            X.6zo r11 = new X.6zo
            r11.<init>(r3)
            com.instagram.profile.intf.UserDetailLaunchConfig r10 = r4.A06
            com.instagram.sponsored.analytics.SourceModelInfoParams r9 = r10.A04
            if (r9 == 0) goto L_0x032f
            java.lang.String r1 = r9.A06
        L_0x016d:
            java.lang.String r0 = r6.getId()
            boolean r0 = r11.A01(r1, r0)
            if (r0 == 0) goto L_0x017c
            r0 = r19
            r8.add(r0)
        L_0x017c:
            java.lang.String r18 = "profile_potato"
            if (r2 != 0) goto L_0x018e
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.BAm()
            if (r0 == 0) goto L_0x032c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x032c
        L_0x018e:
            r12 = 1
        L_0x018f:
            X.0Tu r11 = X.0Tu.A05
            r0 = 36324230639464339(0x810cb200012f93, double:3.034927950109357E-306)
            boolean r0 = X.182.A06(r11, r3, r0)
            if (r0 == 0) goto L_0x01a3
            if (r12 == 0) goto L_0x01a3
            r0 = r18
            r8.add(r0)
        L_0x01a3:
            java.lang.String r17 = "profile_tagged_media_photos_of_you"
            r0 = r17
            r8.add(r0)
            X.01N r1 = X.0jo.A1I(r8)
            java.util.List r12 = r4.A09
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x02f2
            java.lang.String r11 = "created"
        L_0x01b8:
            r12.clear()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r16 = r1.iterator()
        L_0x01c4:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x036f
            java.lang.Object r15 = r16.next()
            java.lang.String r15 = (java.lang.String) r15
            int r0 = r15.hashCode()
            r1 = 0
            switch(r0) {
                case -2014282985: goto L_0x02c7;
                case -907820214: goto L_0x02b7;
                case -842512582: goto L_0x0280;
                case -839856918: goto L_0x026c;
                case -767746179: goto L_0x0257;
                case -729607923: goto L_0x022b;
                case -715147151: goto L_0x0216;
                case 698507925: goto L_0x0203;
                case 1131473645: goto L_0x01f0;
                case 1522794269: goto L_0x01e4;
                default: goto L_0x01d8;
            }
        L_0x01d8:
            java.lang.String r0 = "Could not find provider for tab "
            java.lang.String r1 = X.002.A0R(r0, r15)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01e4:
            r0 = r17
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x01d8
            X.6wS r0 = r4.A03
            goto L_0x02ed
        L_0x01f0:
            boolean r0 = r15.equals(r14)
            if (r0 == 0) goto L_0x01d8
            android.content.Context r0 = r4.A00
            r27 = r0
            X.07Z r15 = r4.A01
            X.5m9 r30 = X.C294255m9.A08
            r32 = 2131962047(0x7f1328bf, float:1.9560808E38)
            goto L_0x02de
        L_0x0203:
            r0 = r24
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x01d8
            android.content.Context r15 = r4.A00
            com.instagram.profile.intf.AutoLaunchReelParams r1 = r4.A05
            X.LvR r0 = new X.LvR
            r0.<init>(r15, r3, r1, r6)
            goto L_0x02ed
        L_0x0216:
            r0 = r20
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x01d8
            android.content.Context r15 = r4.A00
            java.lang.String r1 = r6.getId()
            X.IWO r0 = new X.IWO
            r0.<init>(r15, r3, r1)
            goto L_0x02ed
        L_0x022b:
            boolean r0 = r15.equals(r13)
            if (r0 == 0) goto L_0x01d8
            android.content.Context r0 = r4.A00
            r27 = r0
            if (r9 == 0) goto L_0x0254
            java.lang.String r0 = r9.A06
            r30 = r0
            java.lang.String r1 = r9.A07
        L_0x023d:
            java.lang.String r0 = r10.A0L
            r32 = r0
            java.lang.String r15 = r10.A0C
            X.6s8 r0 = new X.6s8
            r26 = r0
            r28 = r3
            r29 = r6
            r31 = r1
            r33 = r15
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x02ed
        L_0x0254:
            r30 = r1
            goto L_0x023d
        L_0x0257:
            r0 = r18
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x01d8
            android.content.Context r15 = r4.A00
            java.lang.String r1 = r6.getId()
            X.IWN r0 = new X.IWN
            r0.<init>(r15, r3, r1)
            goto L_0x02ed
        L_0x026c:
            r0 = r21
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x01d8
            android.content.Context r0 = r4.A00
            r27 = r0
            X.07Z r15 = r4.A01
            X.5m9 r30 = X.C294255m9.A0C
            r32 = 2131972225(0x7f135081, float:1.9581452E38)
            goto L_0x02de
        L_0x0280:
            r0 = r19
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x01d8
            android.content.Context r0 = r4.A00
            r27 = r0
            if (r9 == 0) goto L_0x02b4
            java.lang.String r0 = r9.A06
            r29 = r0
        L_0x0292:
            java.lang.String r0 = r10.A08
            r30 = r0
            java.lang.String r0 = r4.A08
            r31 = r0
            boolean r15 = r4.A0B
            r0 = r34
            com.instagram.user.model.User r0 = r0.A03
            if (r0 == 0) goto L_0x02a6
            java.lang.String r1 = r0.B8Q()
        L_0x02a6:
            X.IWP r0 = new X.IWP
            r26 = r0
            r28 = r3
            r32 = r1
            r33 = r15
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x02ed
        L_0x02b4:
            r29 = r1
            goto L_0x0292
        L_0x02b7:
            r0 = r22
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x01d8
            android.content.Context r1 = r4.A00
            X.LvS r0 = new X.LvS
            r0.<init>(r1, r3, r6)
            goto L_0x02ed
        L_0x02c7:
            r0 = r25
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x01d8
            android.content.Context r0 = r4.A00
            r27 = r0
            if (r9 == 0) goto L_0x02d7
            java.lang.String r1 = r9.A06
        L_0x02d7:
            X.07Z r15 = r4.A01
            r32 = 2131963145(0x7f132d09, float:1.9563035E38)
            X.5m9 r30 = X.C294255m9.A09
        L_0x02de:
            X.6wS r0 = new X.6wS
            r26 = r0
            r28 = r15
            r29 = r3
            r31 = r1
            r33 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
        L_0x02ed:
            r8.add(r0)
            goto L_0x01c4
        L_0x02f2:
            int r8 = r12.size()
            int r0 = r1.size()
            if (r8 != r0) goto L_0x0328
            r0 = 10
            int r0 = X.0Yv.A1E(r12, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r11 = r12.iterator()
        L_0x030b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x031f
            java.lang.Object r0 = r11.next()
            X.6wT r0 = (X.C322826wT) r0
            java.lang.String r0 = r0.C3j()
            r8.add(r0)
            goto L_0x030b
        L_0x031f:
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x0328
            java.lang.String r11 = "no_change"
            goto L_0x0372
        L_0x0328:
            java.lang.String r11 = "updated"
            goto L_0x01b8
        L_0x032c:
            r12 = 0
            goto L_0x018f
        L_0x032f:
            r1 = 0
            goto L_0x016d
        L_0x0332:
            if (r11 != 0) goto L_0x00f7
        L_0x0334:
            if (r2 == 0) goto L_0x035f
            if (r9 != 0) goto L_0x035f
            X.0Tu r9 = X.0Tu.A05
            r0 = 36318136080930691(0x81072700021783, double:3.03107372675186E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 != 0) goto L_0x00f7
            boolean r0 = r6.A1a()
            if (r0 != 0) goto L_0x035f
            r0 = 36318136081586060(0x810727000c178c, double:3.031073727166318E-306)
            boolean r1 = X.182.A06(r9, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x035f
            goto L_0x00f7
        L_0x035f:
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.BCP()
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00fa
            goto L_0x00f7
        L_0x036f:
            r12.addAll(r8)
        L_0x0372:
            java.lang.String r0 = "updated"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03ed
            java.lang.String r0 = "created"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03f4
        L_0x0382:
            X.6y3 r1 = r7.mViewHolder
            if (r1 == 0) goto L_0x0453
            boolean r0 = r7.A07
            if (r0 != 0) goto L_0x0453
            r4 = 1
            r7.A07 = r4
            com.google.android.material.tabs.TabLayout r3 = r1.A0C
            X.6zt r2 = new X.6zt
            r2.<init>(r7)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.6y3 r0 = r7.mViewHolder
            com.google.android.material.tabs.TabLayout r0 = r0.A0C
            android.content.Context r0 = r0.getContext()
            int r0 = X.0nA.A09(r0)
            X.C324806zv.A00(r3, r2, r1, r0)
            X.6y3 r0 = r7.mViewHolder
            com.google.android.material.tabs.TabLayout r2 = r0.A0C
            java.util.ArrayList r0 = r2.A0c
            int r1 = r0.size()
            r0 = r23
            if (r1 != r0) goto L_0x0453
            int r0 = r2.A02
            if (r0 != r4) goto L_0x0453
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165672(0x7f0701e8, float:1.7945568E38)
            int r3 = r1.getDimensionPixelSize(r0)
            X.6y3 r0 = r7.mViewHolder
            com.google.android.material.tabs.TabLayout r0 = r0.A0C
            r2 = 0
            android.view.View r1 = r0.getChildAt(r5)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x03d6:
            int r0 = r1.getChildCount()
            int r0 = r0 - r4
            if (r2 >= r0) goto L_0x0453
            android.view.View r0 = r1.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.setMarginEnd(r3)
            int r2 = r2 + 1
            goto L_0x03d6
        L_0x03ed:
            X.6y3 r0 = r7.mViewHolder
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r0 = r0.A0I
            r0.setCurrentItem(r5)
        L_0x03f4:
            X.6wF r4 = r7.A0O
            X.6y3 r0 = r7.mViewHolder
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r1 = r0.A0I
            java.util.List r0 = X.00k.A0a(r12)
            r4.A03(r1, r0)
            X.6y3 r0 = r7.mViewHolder
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r8 = r0.A0I
            java.lang.String r0 = r7.A0a
            if (r0 != 0) goto L_0x042f
            boolean r0 = X.C324726zn.A01(r3, r6)
            if (r0 == 0) goto L_0x0439
            X.4Cl r0 = r6.A03
            java.lang.Boolean r1 = r0.BB5()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0428
            if (r2 != 0) goto L_0x0428
            X.17M r1 = r6.A02
            X.17M r0 = X.17M.A06
            if (r1 != r0) goto L_0x0439
        L_0x0428:
            X.17M r1 = r6.A02
            X.17M r0 = X.17M.A06
            if (r1 != r0) goto L_0x0439
            r0 = r14
        L_0x042f:
            int r1 = r4.A01(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0439
            r8.setCurrentItem(r1)
        L_0x0439:
            X.6y3 r1 = r7.mViewHolder
            if (r1 == 0) goto L_0x044a
            boolean r0 = r7.A0c
            if (r0 == 0) goto L_0x044a
            com.google.android.material.appbar.AppBarLayout r1 = r1.A0B
            r0 = 10
            r1.A03 = r0
            r1.requestLayout()
        L_0x044a:
            java.lang.Runnable r0 = r7.A0X
            r8.post(r0)
            r7.A07 = r5
            goto L_0x0382
        L_0x0453:
            X.6y3 r0 = r7.mViewHolder
            if (r0 == 0) goto L_0x0472
            X.6wF r0 = r7.A0O
            int r1 = r0.A01(r13)
            X.6y3 r0 = r7.mViewHolder
            com.google.android.material.tabs.TabLayout r3 = r0.A0C
            X.6zp r0 = r3.A07(r1)
            if (r1 < 0) goto L_0x0472
            if (r0 == 0) goto L_0x0472
            X.6vh r2 = r7.A0V
            X.6vi r1 = X.C322366vi.PANAVISION_PROFILE_UNIFICATION
            X.6zq r0 = r0.A04
            r2.A01(r3, r0, r1)
        L_0x0472:
            X.6y3 r0 = r7.mViewHolder
            if (r0 == 0) goto L_0x0491
            X.6wF r0 = r7.A0O
            int r1 = r0.A01(r14)
            if (r1 < 0) goto L_0x0491
            X.6y3 r0 = r7.mViewHolder
            com.google.android.material.tabs.TabLayout r3 = r0.A0C
            X.6zp r0 = r3.A07(r1)
            if (r0 == 0) goto L_0x0491
            X.6vh r2 = r7.A0V
            X.6vi r1 = X.C322366vi.EXCLUSIVES_TAB
            X.6zq r0 = r0.A04
            r2.A01(r3, r0, r1)
        L_0x0491:
            com.instagram.common.session.UserSession r0 = r7.A0M
            java.lang.String r1 = r0.A06
            java.lang.String r0 = r6.getId()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x04d5
            r7.A0E()
            return
        L_0x04a3:
            X.6y3 r0 = r7.mViewHolder
            android.view.View r0 = r0.A01
            r1 = 8
            r0.setVisibility(r1)
            X.6y3 r0 = r7.mViewHolder
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r0 = r0.A0I
            r0.setVisibility(r1)
            X.6wF r2 = r7.A0O
            X.6y3 r0 = r7.mViewHolder
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r1 = r0.A0I
            java.util.List r0 = java.util.Collections.emptyList()
            r2.A03(r1, r0)
            X.6y3 r0 = r7.mViewHolder
            if (r0 == 0) goto L_0x04cb
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r1 = r0.A0I
            java.lang.Runnable r0 = r7.A0X
            r1.removeCallbacks(r0)
        L_0x04cb:
            X.6wR r0 = r7.A0S
            java.util.List r0 = r0.A09
            r0.clear()
            r7.A0H()
        L_0x04d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.UserDetailTabController.A02(com.instagram.profile.fragment.UserDetailTabController):void");
    }

    public static void A03(UserDetailTabController userDetailTabController) {
        boolean A012;
        String str;
        if (userDetailTabController.mViewHolder != null) {
            if (userDetailTabController.A0T() && 1q7.A03 != null) {
                1q7 A002 = C318996ps.A00();
                UserSession userSession = userDetailTabController.A0M;
                if (A002.A06(userSession)) {
                    if (userDetailTabController.mOpalSwitchIndicatorHelper == null) {
                        A04(userDetailTabController);
                        C318996ps.A00();
                        IWD iwd = new IWD();
                        userDetailTabController.mOpalSwitchIndicatorHelper = iwd;
                        ViewGroup viewGroup = userDetailTabController.mViewHolder.A06;
                        AnonymousClass4DH r5 = userDetailTabController.A0L;
                        0qQ.A0B(viewGroup, 0);
                        0qQ.A0B(r5, 1);
                        viewGroup.addView(GTX.A01(r5, new AnonymousClass5PJ(1631125871, true, new C59345JFx(iwd, 47)), false, false));
                        if (!userDetailTabController.A0F) {
                            ViewGroup viewGroup2 = userDetailTabController.mViewHolder.A07;
                            String str2 = userDetailTabController.A0Z;
                            if (userDetailTabController.A0i) {
                                str = "self_profile";
                            } else {
                                str = "profile";
                            }
                            AnonymousClass0iw r9 = userDetailTabController.A0R.A01;
                            int i = 0;
                            0qQ.A0B(viewGroup2, 0);
                            0qQ.A0B(userSession, 2);
                            if (1Au.A00(userSession).A01.getInt("opal_main_profile_tease_animation_count", 0) < 5) {
                                viewGroup2.addView(GTX.A01(r5, new AnonymousClass5PJ(750075973, true, new C59146J8c(userSession, viewGroup2, r9, str2, str, 2)), false, false));
                            } else {
                                i = 8;
                            }
                            viewGroup2.setVisibility(i);
                            userDetailTabController.A0F = true;
                        }
                    }
                    A012 = false;
                    userDetailTabController.mViewHolder.A06.setVisibility(0);
                    userDetailTabController.A0A = A012;
                }
            }
            C323756y3 r0 = userDetailTabController.mViewHolder;
            if (r0 != null) {
                r0.A07.setVisibility(8);
                userDetailTabController.mViewHolder.A06.setVisibility(8);
                userDetailTabController.mOpalSwitchIndicatorHelper = null;
            }
            A012 = AnonymousClass2xO.A01(userDetailTabController.A0M);
            userDetailTabController.A0A = A012;
        }
    }

    public static void A04(UserDetailTabController userDetailTabController) {
        C323756y3 r0 = userDetailTabController.mViewHolder;
        if (r0 != null) {
            1Jk.A08.A0I(String.valueOf(r0.A02.hashCode()), userDetailTabController.A0L.getModuleName());
            AnonymousClass72p r02 = userDetailTabController.mOpalSwitchIndicatorHelper;
            if (r02 != null) {
                r02.FKx(0.0f);
                return;
            }
            boolean z = userDetailTabController.A0A;
            C323756y3 r03 = userDetailTabController.mViewHolder;
            if (z) {
                r03.A0J.setIsLoading(false);
                return;
            }
            r03.A0E.A01(0.0f);
            userDetailTabController.mViewHolder.A0E.A02(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r3 == null) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(com.instagram.profile.fragment.UserDetailTabController r17, int r18, boolean r19) {
        /*
            java.lang.String r0 = "UserDetailTabController.onPageSelected"
            X.0lp r11 = X.0lq.A00(r0)
            r5 = r17
            X.6wF r7 = r5.A0O     // Catch:{ all -> 0x0112 }
            r1 = r18
            X.723 r4 = r7.A02(r1)     // Catch:{ all -> 0x0112 }
            if (r4 == 0) goto L_0x010e
            X.5m9 r9 = r5.A0B()     // Catch:{ all -> 0x0112 }
            X.6wR r0 = r5.A0S     // Catch:{ all -> 0x0112 }
            java.util.List r6 = r0.A09     // Catch:{ all -> 0x0112 }
            java.lang.Object r3 = X.00k.A0O(r6, r1)     // Catch:{ all -> 0x0112 }
            X.6wT r3 = (X.C322826wT) r3     // Catch:{ all -> 0x0112 }
            if (r3 == 0) goto L_0x0049
            java.lang.String r0 = r5.A06     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0049
            if (r9 == 0) goto L_0x0067
            X.5mA r0 = r9.A00     // Catch:{ all -> 0x0112 }
            boolean r0 = r5.A0U(r0)     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x004f
            com.instagram.profile.fragment.UserDetailFragment r2 = r5.A0f     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = "UserDetailFragment.onInitialUserInitiatedTabSwitch"
            X.0lp r10 = X.0lq.A00(r0)     // Catch:{ all -> 0x0112 }
            X.6uS r8 = r2.A1A     // Catch:{ all -> 0x0043 }
            if (r8 == 0) goto L_0x004c
            java.lang.String r2 = "head_load"
            r0 = 1
            r8.A01(r2, r0)     // Catch:{ all -> 0x0043 }
            goto L_0x004c
        L_0x0043:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00fd }
            goto L_0x010d
        L_0x0049:
            if (r9 == 0) goto L_0x0065
            goto L_0x004f
        L_0x004c:
            r10.close()     // Catch:{ all -> 0x0112 }
        L_0x004f:
            X.6vu r0 = r5.A0P     // Catch:{ all -> 0x0112 }
            X.6xI r8 = r0.A0G     // Catch:{ all -> 0x0112 }
            if (r8 == 0) goto L_0x0065
            com.instagram.profile.fragment.UserDetailTabController r2 = r8.A04     // Catch:{ all -> 0x0112 }
            X.5mA r0 = r9.A00     // Catch:{ all -> 0x0112 }
            boolean r0 = r2.A0U(r0)     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x0065
            com.instagram.profile.fragment.UserDetailFragment r2 = r8.A03     // Catch:{ all -> 0x0112 }
            r0 = 1
            r2.A0w(r9, r0)     // Catch:{ all -> 0x0112 }
        L_0x0065:
            if (r3 == 0) goto L_0x010e
        L_0x0067:
            com.instagram.profile.fragment.UserDetailFragment r9 = r5.A0f     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = r3.C3j()     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = "UserDetailFragment.onTabSwitch"
            X.0lp r8 = X.0lq.A00(r0)     // Catch:{ all -> 0x0112 }
            r9.A1S = r2     // Catch:{ all -> 0x00f8 }
            r2 = 1
            r9.A1Y = r2     // Catch:{ all -> 0x00f8 }
            X.6pi r0 = r9.A0p     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x007f
            r0.A00()     // Catch:{ all -> 0x00f8 }
        L_0x007f:
            r8.close()     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r5.A06     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x00bf
            int r0 = r5.A01     // Catch:{ all -> 0x0112 }
            java.lang.Object r8 = X.00k.A0O(r6, r0)     // Catch:{ all -> 0x0112 }
            X.6wT r8 = (X.C322826wT) r8     // Catch:{ all -> 0x0112 }
            X.4c1 r12 = r5.A0h     // Catch:{ all -> 0x0112 }
            java.lang.String r13 = r3.C3l()     // Catch:{ all -> 0x0112 }
            r13.getClass()     // Catch:{ all -> 0x0112 }
            java.lang.String r9 = r5.A06     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = "tap_header"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r14 = "swipe"
            boolean r0 = r9.equals(r14)     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0102
            java.lang.String r15 = "swipe"
        L_0x00ab:
            java.lang.String r16 = r3.BMO()     // Catch:{ all -> 0x0112 }
            if (r8 == 0) goto L_0x00da
            java.lang.String r17 = r8.AbV()     // Catch:{ all -> 0x0112 }
        L_0x00b5:
            java.lang.String r18 = r3.AbV()     // Catch:{ all -> 0x0112 }
            r18.getClass()     // Catch:{ all -> 0x0112 }
            r12.Cko(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0112 }
        L_0x00bf:
            int r0 = r5.A01     // Catch:{ all -> 0x0112 }
            r8 = r19
            if (r0 == r1) goto L_0x00d1
            X.723 r0 = r7.A02(r0)     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x00ce
            r0.DqM()     // Catch:{ all -> 0x0112 }
        L_0x00ce:
            r4.DqG(r8)     // Catch:{ all -> 0x0112 }
        L_0x00d1:
            int r0 = r5.A01     // Catch:{ all -> 0x0112 }
            java.lang.Object r0 = X.00k.A0O(r6, r0)     // Catch:{ all -> 0x0112 }
            X.6wT r0 = (X.C322826wT) r0     // Catch:{ all -> 0x0112 }
            goto L_0x00e2
        L_0x00da:
            r17 = 0
            goto L_0x00b5
        L_0x00dd:
            java.lang.String r14 = "tab_header"
            java.lang.String r15 = "tap_tab"
            goto L_0x00ab
        L_0x00e2:
            if (r0 == 0) goto L_0x00e7
            r0.DqF()     // Catch:{ all -> 0x0112 }
        L_0x00e7:
            r5.A01 = r1     // Catch:{ all -> 0x0112 }
            boolean r1 = r5.A0G     // Catch:{ all -> 0x0112 }
            r0 = 0
            if (r1 != 0) goto L_0x00ef
            r0 = 1
        L_0x00ef:
            r3.DqL(r0)     // Catch:{ all -> 0x0112 }
            r4.DqL(r8)     // Catch:{ all -> 0x0112 }
            r5.A0G = r2     // Catch:{ all -> 0x0112 }
            goto L_0x010e
        L_0x00f8:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00fd }
            goto L_0x010d
        L_0x00fd:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x010d
        L_0x0102:
            java.lang.String r0 = "Unknown tab navigation type: "
            java.lang.String r0 = X.002.A0R(r0, r9)     // Catch:{ all -> 0x0112 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0112 }
            r1.<init>(r0)     // Catch:{ all -> 0x0112 }
        L_0x010d:
            throw r1     // Catch:{ all -> 0x0112 }
        L_0x010e:
            r11.close()
            return
        L_0x0112:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0117 }
            throw r1
        L_0x0117:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.UserDetailTabController.A05(com.instagram.profile.fragment.UserDetailTabController, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r2 = r5.A04.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e9, code lost:
        r0 = r5.A04.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0105, code lost:
        r2 = r5.A04.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(com.instagram.profile.fragment.UserDetailTabController r5, boolean r6) {
        /*
            X.6vu r3 = r5.A0P
            com.instagram.user.model.User r0 = r3.A0J
            if (r0 == 0) goto L_0x0121
            com.instagram.user.model.FollowStatus r1 = r0.B6o()
        L_0x000a:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            if (r1 != r0) goto L_0x0018
            com.instagram.user.model.User r0 = r3.A0J
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.CPV()
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0097
            android.view.View r0 = r5.mPVFollowSecondaryCTAView
            if (r0 == 0) goto L_0x0036
            X.6w5 r0 = r5.A04
            com.instagram.profile.fragment.UserDetailFragment r2 = r0.A00
            X.6zK r0 = r2.A0O
            if (r0 == 0) goto L_0x0036
            android.view.View r1 = r0.A02
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x005a
            X.6zK r0 = r2.A0O
            r0.A02(r1)
        L_0x0036:
            com.instagram.common.ui.base.IgTextView r2 = r5.mUpsellFollowButtonView
            if (r2 == 0) goto L_0x0068
            com.instagram.user.model.User r0 = r3.A0J
            if (r0 == 0) goto L_0x0047
            com.instagram.common.session.UserSession r1 = r5.A0M
            java.lang.String r0 = r0.getId()
            X.C267154b3.A02(r2, r1, r0)
        L_0x0047:
            X.6w5 r0 = r5.A04
            r3 = 1
            com.instagram.profile.fragment.UserDetailFragment r0 = r0.A00
            X.6xm r2 = r0.A17
            if (r2 == 0) goto L_0x0018
            android.view.View r1 = r0.mView
            android.content.Context r0 = r0.getContext()
            r2.A02(r0, r1, r3)
            return
        L_0x005a:
            X.6zK r0 = r2.A0O
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0036
            X.6zK r0 = r2.A0O
            r0.A03(r1)
            goto L_0x0036
        L_0x0068:
            com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton r2 = r5.mOverFlowFollowButton
            if (r2 == 0) goto L_0x0018
            com.instagram.user.model.User r0 = r3.A0J
            if (r0 == 0) goto L_0x0079
            com.instagram.common.session.UserSession r1 = r5.A0M
            java.lang.String r0 = r0.getId()
            X.C267154b3.A02(r2, r1, r0)
        L_0x0079:
            com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton r1 = r5.mOverFlowFollowButton
            com.instagram.common.session.UserSession r0 = r5.A0M
            r1.A04(r6, r0)
            X.6w5 r4 = r5.A04
            r1 = 1
            com.instagram.profile.fragment.UserDetailFragment r0 = r4.A00
            android.os.Handler r3 = r0.A2c
            X.6pN r2 = new X.6pN
            r2.<init>(r4, r1)
            if (r6 == 0) goto L_0x0094
            r0 = 0
        L_0x0090:
            r3.postDelayed(r2, r0)
            return
        L_0x0094:
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x0090
        L_0x0097:
            com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton r0 = r5.mOverFlowFollowButton
            if (r0 == 0) goto L_0x00df
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00df
            com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton r3 = r5.mOverFlowFollowButton
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x00cc
            if (r6 == 0) goto L_0x00b0
            r0 = 0
            r3.setInAnimation(r0)
            r3.setOutAnimation(r0)
        L_0x00b0:
            r0 = 0
            r3.setDisplayedChild(r0)
            X.6pM r2 = new X.6pM
            r2.<init>(r3)
            if (r6 == 0) goto L_0x011e
            r0 = 0
        L_0x00bd:
            r3.postDelayed(r2, r0)
            if (r6 == 0) goto L_0x00cc
            android.view.animation.AlphaAnimation r0 = r3.A0D
            r3.setInAnimation(r0)
            android.view.animation.AlphaAnimation r0 = r3.A0E
            r3.setOutAnimation(r0)
        L_0x00cc:
            X.6w5 r4 = r5.A04
            r1 = 0
            com.instagram.profile.fragment.UserDetailFragment r0 = r4.A00
            android.os.Handler r3 = r0.A2c
            X.6pN r2 = new X.6pN
            r2.<init>(r4, r1)
            if (r6 == 0) goto L_0x011b
            r0 = 0
        L_0x00dc:
            r3.postDelayed(r2, r0)
        L_0x00df:
            com.instagram.common.ui.base.IgTextView r0 = r5.mUpsellFollowButtonView
            if (r0 == 0) goto L_0x00fb
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00fb
            X.6w5 r0 = r5.A04
            r3 = 0
            com.instagram.profile.fragment.UserDetailFragment r0 = r0.A00
            X.6xm r2 = r0.A17
            if (r2 == 0) goto L_0x00fb
            android.view.View r1 = r0.mView
            android.content.Context r0 = r0.getContext()
            r2.A02(r0, r1, r3)
        L_0x00fb:
            android.view.View r0 = r5.mPVFollowSecondaryCTAView
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0018
            X.6w5 r0 = r5.A04
            com.instagram.profile.fragment.UserDetailFragment r2 = r0.A00
            X.6zK r0 = r2.A0O
            if (r0 == 0) goto L_0x0018
            android.view.View r1 = r0.A02
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0018
            X.6zK r0 = r2.A0O
            r0.A03(r1)
            return
        L_0x011b:
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x00dc
        L_0x011e:
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x00bd
        L_0x0121:
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A08
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.UserDetailTabController.A06(com.instagram.profile.fragment.UserDetailTabController, boolean):void");
    }

    public static boolean A07(UserDetailTabController userDetailTabController) {
        C323756y3 r0 = userDetailTabController.mViewHolder;
        if (r0 == null || r0.A0I.getCurrentItem() <= -1 || userDetailTabController.A0O.A00.size() <= 0) {
            return false;
        }
        return true;
    }

    public final int A08(C294265mA r3) {
        AnonymousClass2rW r0;
        if (!this.A0D || r3 != C294265mA.MAIN_GRID) {
            r0 = ((C322736wK) this.A0Q.A03.get(r3)).A02;
        } else {
            WZN wzn = this.A02;
            if (wzn == null) {
                return 0;
            }
            0qQ.A0B(r3, 0);
            r0 = WZN.A00(wzn, r3).A07;
        }
        return r0.A01.size();
    }

    public final int A09(C294265mA r7, String str) {
        int i;
        WZN wzn;
        if (!this.A0D || r7 != C294265mA.MAIN_GRID || (wzn = this.A02) == null) {
            C322736wK r2 = (C322736wK) this.A0Q.A03.get(r7);
            0qQ.A0B(str, 0);
            int i2 = 0;
            for (1Xj id : r2.A02.A01) {
                if (!0qQ.A0K(id.getId(), str)) {
                    i2 = i + 1;
                } else if (i == -1) {
                    return -1;
                } else {
                    C294255m9 r22 = r2.A05;
                    int ordinal = r22.ordinal();
                    if (!(ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("getRowPosition for this profile tab mode unsupported ");
                        sb.append(r22);
                        throw new UnsupportedOperationException(sb.toString());
                    }
                }
            }
            return -1;
        }
        0qQ.A0B(r7, 0);
        0qQ.A0B(str, 1);
        WZM A002 = WZN.A00(wzn, r7);
        i = 0;
        for (C17884Vhb A003 : A002.A07.A01) {
            if (!0qQ.A0K(A003.A00(), str)) {
                i++;
            } else if (i == -1) {
                return -1;
            } else {
                C294255m9 r23 = A002.A04;
                if (r23.ordinal() != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getRowPosition for this profile tab mode unsupported ");
                    sb2.append(r23);
                    sb2.append(". Likely you are trying to use ProfileGridItems in a tab that is not the main grid");
                    throw new UnsupportedOperationException(sb2.toString());
                }
            }
        }
        return -1;
        return i / 3;
    }

    public final C238133Ar A0A() {
        AnonymousClass723 r0;
        C323756y3 r02 = this.mViewHolder;
        if (r02 != null) {
            r0 = this.A0O.A02(r02.A0I.getCurrentItem());
        } else {
            r0 = null;
        }
        if (r0 != null) {
            ViewGroup BqB = r0.BqB();
            if ((BqB instanceof AbsListView) || (BqB instanceof RecyclerView)) {
                try {
                    return C238103Ao.A00(BqB);
                } catch (IllegalArgumentException | IllegalStateException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public final C294255m9 A0B() {
        if (this.mViewHolder == null || !A07(this)) {
            return null;
        }
        C322686wF r2 = this.A0O;
        return ((C322826wT) r2.A00.get(this.mViewHolder.A0I.getCurrentItem())).BhJ();
    }

    public final String A0C() {
        if (this.mViewHolder == null || !A07(this)) {
            return null;
        }
        C322686wF r2 = this.A0O;
        return ((C322826wT) r2.A00.get(this.mViewHolder.A0I.getCurrentItem())).C3j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r3 = r4.mViewHolder.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E() {
        /*
            r4 = this;
            X.6y3 r0 = r4.mViewHolder
            if (r0 == 0) goto L_0x0021
            X.6wF r1 = r4.A0O
            java.lang.String r0 = "profile_highlights"
            int r1 = r1.A01(r0)
            if (r1 < 0) goto L_0x0021
            X.6y3 r0 = r4.mViewHolder
            com.google.android.material.tabs.TabLayout r3 = r0.A0C
            X.6zp r0 = r3.A07(r1)
            if (r0 == 0) goto L_0x0021
            X.6vh r2 = r4.A0V
            X.6vi r1 = X.C322366vi.HIGHLIGHTS_TAB
            X.6zq r0 = r0.A04
            r2.A01(r3, r0, r1)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.UserDetailTabController.A0E():void");
    }

    public final void A0F() {
        this.A0P.notifyDataSetChangedSmart();
        A0G();
    }

    public final void A0H() {
        C323756y3 r0;
        if (this.A09 && (r0 = this.mViewHolder) != null) {
            RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = r0.A0G;
            refreshableAppBarLayoutBehavior.A06 = AnonymousClass05K.A01;
            RefreshableAppBarLayoutBehavior.A02(refreshableAppBarLayoutBehavior);
            AnonymousClass3AD r1 = refreshableAppBarLayoutBehavior.A05;
            if (r1 != null) {
                r1.setIsLoading(false);
            }
            for (C267634bw DnQ : refreshableAppBarLayoutBehavior.A0G) {
                DnQ.DnQ();
            }
            this.mViewHolder.A0J.setIsLoading(false);
        }
    }

    public final void A0I() {
        08m adapter;
        C323756y3 r0 = this.mViewHolder;
        if (r0 != null && (adapter = r0.A0I.getAdapter()) != null) {
            List A0a2 = 00k.A0a(this.A0S.A09);
            int i = 0;
            while (i < A0a2.size()) {
                if (!2PP.A00(((C322826wT) A0a2.get(i)).C3j(), "profile_fan_club_grid")) {
                    i++;
                } else if (i != -1 && i < adapter.getCount()) {
                    this.mViewHolder.A0I.setCurrentItem(i);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void A0J(int i) {
        C322486vu r1 = this.A0P;
        if (r1.A00 != i) {
            r1.A00 = i;
            r1.A00();
        }
        C322816wS r4 = this.A0S.A03;
        C294255m9 r3 = r4.A07;
        boolean z = false;
        if (r3 == C294255m9.A0B) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r3);
        sb.append(" does not support setting badge count externally");
        02V.A07(z, sb.toString());
        r4.A00 = i;
        C322816wS.A01(r4);
    }

    public final void A0K(C322506vw r3) {
        C322486vu r1 = this.A0P;
        if (r1.A09 != r3) {
            r1.A09 = r3;
            r1.A00();
        }
    }

    public final void A0L(C322496vv r3) {
        C322486vu r1 = this.A0P;
        if (r1.A0A != r3) {
            r1.A0A = r3;
            r1.A00();
        }
    }

    public final void A0M(C48247EbS ebS) {
        C322486vu r1 = this.A0P;
        if (r1.A0D != ebS) {
            r1.A0D = ebS;
            r1.A00();
        }
    }

    public final void A0N(C294265mA r3) {
        if (!this.A0D || r3 != C294265mA.MAIN_GRID) {
            C322736wK r1 = (C322736wK) this.A0Q.A03.get(r3);
            r1.A02.A04();
            C322736wK.A00(r1);
        }
    }

    public final void A0O(C294265mA r3) {
        WZN wzn = this.A02;
        if (wzn != null) {
            0qQ.A0B(r3, 0);
            WZM A002 = WZN.A00(wzn, r3);
            A002.A07.A04();
            WZM.A00(A002);
        }
    }

    public final void A0P(C294265mA r5, List list) {
        if (!this.A0D || r5 != C294265mA.MAIN_GRID) {
            C322736wK r3 = (C322736wK) this.A0Q.A03.get(r5);
            0qQ.A0B(list, 0);
            C273674n0 r2 = r3.A02;
            r2.A0A(list);
            r2.A01 = r3.A06.A1A(r3.A05);
            C322736wK.A00(r3);
        }
    }

    public final void A0Q(C294265mA r5, List list) {
        WZN wzn = this.A02;
        if (wzn != null) {
            0qQ.A0B(list, 0);
            0qQ.A0B(r5, 1);
            WZM A002 = WZN.A00(wzn, r5);
            C15953UlV ulV = A002.A07;
            ulV.A0A(list);
            ulV.A00 = A002.A05.A1A(A002.A04);
            WZM.A00(A002);
        }
    }

    public final void A0R(AnonymousClass4UE r5) {
        C322486vu r3 = this.A0P;
        AnonymousClass4UE r0 = r3.A0H;
        if (r0 != r5) {
            if (r0 != null && r5 == null && ((AnonymousClass4UC) r0).A0D.equals("511740098064479")) {
                0xY AR4 = 1Au.A00(r3.A0c).A01.AR4();
                AR4.E5T("has_dismissed_link_sharing_profile_megaphone", true);
                AR4.apply();
            }
            r3.A0H = r5;
            r3.A00();
        }
    }

    public final void A0S(User user, boolean z) {
        C322486vu r1 = this.A0P;
        if (r1.A0J != user) {
            r1.A0J = user;
            if (!C324376zB.A02(r1.A0c, user)) {
                r1.A0Y.A05();
            }
            if (z) {
                r1.A00();
            }
        }
        if (!C324376zB.A02(this.A0M, user)) {
            HashMap hashMap = this.A0Q.A03;
            for (Object obj : hashMap.keySet()) {
                C322736wK r12 = (C322736wK) hashMap.get(obj);
                r12.A02.A04();
                C322736wK.A00(r12);
            }
        }
        A02(this);
        A01(this);
        A03(this);
    }

    public final boolean A0T() {
        User user;
        C322486vu r0 = this.A0P;
        boolean z = r0.A0j;
        if ((!z && ((user = r0.A0J) == null || user.A03.BYD() == null)) || 1q7.A03 == null) {
            return false;
        }
        1q7 A002 = C318996ps.A00();
        UserSession userSession = this.A0M;
        if (z) {
            return A002.A05(userSession);
        }
        return A002.A04(userSession);
    }

    public final boolean A0U(C294265mA r3) {
        WZN wzn;
        if (!this.A0D || r3 != C294265mA.MAIN_GRID || (wzn = this.A02) == null) {
            return ((C322736wK) this.A0Q.A03.get(r3)).A01;
        }
        0qQ.A0B(r3, 0);
        return WZN.A00(wzn, r3).A00;
    }

    public final C322796wQ AvN() {
        return this.A0R;
    }

    public final AnonymousClass3W1 BQr(1Xj r4) {
        C228402lc r0;
        WeakReference weakReference = this.A0e.A00;
        if (weakReference == null || (r0 = (C228402lc) weakReference.get()) == null) {
            return new AnonymousClass3W1(r4.A0o(), r4.A4o());
        }
        return r0.BQr(r4);
    }

    public final void Cs9(1Xj r2) {
        C231292rN r0;
        WeakReference weakReference = this.A0e.A00;
        if (weakReference != null && (r0 = (C231292rN) weakReference.get()) != null) {
            r0.Cs9(r2);
        }
    }

    public final ArrayList A0D() {
        ArrayList arrayList;
        String id;
        C294255m9 A0B2 = A0B();
        if (A0B2 == null) {
            return null;
        }
        WZN wzn = this.A02;
        if (wzn == null || !this.A0D || A0B2 != C294255m9.A09) {
            C322706wH r0 = this.A0Q;
            C322736wK r02 = (C322736wK) r0.A03.get(A0B2.A00);
            C273674n0 r1 = r02.A02;
            r1.A08(r02.A03);
            List<1Xj> list = r1.A01;
            arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (1Xj id2 : list) {
                arrayList.add(id2.getId());
            }
        } else {
            C294265mA r12 = A0B2.A00;
            0qQ.A0B(r12, 0);
            WZM A002 = WZN.A00(wzn, r12);
            C15953UlV ulV = A002.A07;
            ulV.A08(A002.A06);
            List list2 = ulV.A01;
            ArrayList<C17884Vhb> arrayList2 = new ArrayList<>();
            for (Object next : list2) {
                if (((C17884Vhb) next).A01 == ProfileGridItemTypeEnum.MEDIA) {
                    arrayList2.add(next);
                }
            }
            arrayList = new ArrayList();
            for (C17884Vhb vhb : arrayList2) {
                1Xj r03 = vhb.A02;
                if (!(r03 == null || (id = r03.getId()) == null)) {
                    arrayList.add(id);
                }
            }
        }
        return new ArrayList(arrayList);
    }

    public final void A0G() {
        C294255m9 A0B2 = A0B();
        if (A0B2 == null) {
            return;
        }
        if (!this.A0D || A0B2 != C294255m9.A09) {
            C322706wH r0 = this.A0Q;
            C322736wK.A00((C322736wK) r0.A03.get(A0B2.A00));
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, X.6wG] */
    public UserDetailTabController(FragmentActivity fragmentActivity, 0hq r43, AnonymousClass07Z r44, AnonymousClass4DH r45, C322586w4 r46, C2355930l r47, AnonymousClass0iw r48, UserSession userSession, C233922wh r50, C322186vO r51, AnonymousClass4DU r52, C267644bx r53, AnonymousClass32J r54, C322216vR r55, C322486vu r56, C48247EbS ebS, C322596w5 r58, UserDetailFragment userDetailFragment, UserDetailFragment userDetailFragment2, UserDetailFragment userDetailFragment3, Dc6 dc6, AnonymousClass4c1 r63, AutoLaunchReelParams autoLaunchReelParams, UserDetailLaunchConfig userDetailLaunchConfig, C322206vQ r66, C322356vh r67, C20962X6p x6p, AnonymousClass32Q r69, AnonymousClass3AB r70, C267614bu r71, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C322636wA r0;
        String str2;
        C322616w8 r2 = new C322616w8();
        this.A0U = r2;
        C322626w9 r1 = new C322626w9(this);
        this.A0g = r1;
        if (((Boolean) C62000qj.A02.A0I.invoke()).booleanValue()) {
            r0 = null;
        } else {
            r0 = new C322636wA(r1);
        }
        this.A0H = r0;
        this.A08 = false;
        this.A0D = false;
        this.A0F = false;
        this.A0X = new C322646wB(this);
        this.A0J = new C322656wC(this);
        this.A0K = new C322666wD(this);
        UserSession userSession2 = userSession;
        this.A0M = userSession2;
        this.A0W = r70;
        C322486vu r12 = r56;
        this.A0P = r12;
        this.A0T = userDetailFragment2;
        r12.A0Q = true;
        0Tu r8 = 0Tu.A05;
        UserDetailLaunchConfig userDetailLaunchConfig2 = userDetailLaunchConfig;
        if (182.A06(r8, userSession2, 36323045229931295L)) {
            str2 = "profile_media_grid";
        } else {
            str2 = userDetailLaunchConfig2.A0L;
        }
        this.A0a = str2;
        this.A0c = userDetailLaunchConfig2.A0a;
        this.A0h = r63;
        this.A0f = userDetailFragment3;
        this.A0V = r67;
        this.A0i = z2;
        this.A0d = z3;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        this.A0I = fragmentActivity2;
        this.A04 = r58;
        this.A0E = x6p;
        this.A0b = z4;
        AnonymousClass4DH r10 = r45;
        this.A0L = r10;
        this.A0Z = userDetailLaunchConfig2.A0O;
        this.A0Y = userDetailLaunchConfig2.A0A;
        this.A0D = z5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C294255m9 r02 = C294255m9.A09;
        if (z5) {
            arrayList2.add(r02);
        } else {
            arrayList.add(r02);
        }
        arrayList.add(C294255m9.A0B);
        if (C321616uT.A00(userSession2)) {
            arrayList.add(C294255m9.A0C);
        }
        arrayList.add(C294255m9.A08);
        arrayList.add(C294255m9.A0A);
        this.A0A = AnonymousClass2xO.A01(userSession2);
        boolean A032 = C322606w6.A03(userSession2);
        0qQ.A0B(userSession2, 0);
        this.A08 = 182.A06(r8, userSession2, 36321082428695624L);
        C322686wF r13 = new C322686wF(r43, A032);
        this.A0O = r13;
        r13.A01 = userDetailLaunchConfig2.A0V;
        ? obj = new Object();
        this.A0e = obj;
        AnonymousClass32Q r27 = r69;
        boolean z7 = z;
        AnonymousClass0iw r14 = r48;
        AnonymousClass4DU r16 = r52;
        UserDetailFragment userDetailFragment4 = userDetailFragment;
        C322706wH r28 = new C322706wH(fragmentActivity2.getResources(), fragmentActivity2, r10, r14, userSession2, r51, r16, userDetailFragment4, this, r27, arrayList, z7);
        this.A0Q = r28;
        if (this.A0D) {
            this.A02 = new WZN(fragmentActivity2.getResources(), fragmentActivity2, r10, r14, userSession2, r16, userDetailFragment4, this, r66, r27, arrayList2, z7);
        }
        C20962X6p x6p2 = this.A0E;
        C322586w4 r122 = r46;
        C233922wh r15 = r50;
        C2355930l r132 = r47;
        AnonymousClass32J r18 = r54;
        C322216vR r19 = r55;
        C48247EbS ebS2 = ebS;
        C322696wG r23 = obj;
        C322616w8 r25 = r2;
        C20962X6p x6p3 = x6p2;
        WZN wzn = this.A02;
        C322706wH r21 = r28;
        this.A0R = new C322796wQ(new AnonymousClass3BD(), r122, r132, r14, r15, r16, r53, r18, r19, wzn, r21, ebS2, r23, userDetailFragment4, r25, x6p3, r27, r71, new HashSet(), new HashSet(), new HashSet());
        AnonymousClass07Z r9 = r44;
        FragmentActivity fragmentActivity3 = fragmentActivity2;
        UserSession userSession3 = userSession2;
        this.A0S = new C322806wR(fragmentActivity3, r9, userSession3, dc6, autoLaunchReelParams, userDetailLaunchConfig2, str, z7, z6);
        this.A0N = new C322866wX(this, z7);
    }
}
