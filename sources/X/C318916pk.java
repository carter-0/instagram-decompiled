package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;
import java.util.List;

/* renamed from: X.6pk  reason: invalid class name and case insensitive filesystem */
public final class C318916pk extends C249383je {
    public float A00;
    public float A01;
    public int A02 = -1;
    public final int A03;
    public final C227762js A04;
    public final UserSession A05;
    public final UserDetailTabController A06;
    public final C318936pm A07;
    public final C318946pn A08;
    public final C318926pl A09;
    public final UserDetailFragment A0A;
    public final boolean A0B;

    public C318916pk(C227762js r4, UserSession userSession, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        this.A0A = userDetailFragment;
        this.A04 = r4;
        this.A06 = userDetailTabController;
        this.A03 = AnonymousClass3D4.A00(userDetailFragment.requireContext());
        userDetailFragment.requireContext().getResources().getDimensionPixelOffset(2Yu.A0H(userDetailFragment.requireContext(), 0Pn.A01(userSession)));
        this.A0B = userDetailFragment.A15();
        this.A09 = new C318926pl(this);
        this.A07 = new C318936pm(this);
        this.A08 = new C318946pn(this);
    }

    public static final void A00(C318916pk r4) {
        AppBarLayout appBarLayout;
        UserDetailTabController userDetailTabController = r4.A06;
        C323756y3 r0 = userDetailTabController.mViewHolder;
        if (!(r0 == null || (appBarLayout = r0.A0B) == null)) {
            appBarLayout.A03(r4.A07);
        }
        C323756y3 r02 = userDetailTabController.mViewHolder;
        if (r02 != null) {
            RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = r02.A0G;
            C318946pn r1 = r4.A08;
            0qQ.A0B(r1, 0);
            refreshableAppBarLayoutBehavior.A0G.remove(r1);
        }
        C323756y3 r03 = userDetailTabController.mViewHolder;
        if (r03 != null) {
            0nA.A0e(r03.A03, 0);
            0nA.A0e(userDetailTabController.mViewHolder.A02, 0);
            0nA.A0e(userDetailTabController.mViewHolder.A06, 0);
        }
        UserDetailFragment userDetailFragment = r4.A0A;
        if (userDetailFragment.getContext() != null) {
            boolean z = !2Y9.A01(userDetailFragment.requireContext().getResources().getConfiguration().screenWidthDp);
            AnonymousClass2ZQ A002 = C71172bH.A00();
            if (A002 != null) {
                A002.Eu7(z);
            }
        }
        r4.A04.A02();
    }

    public static final void A01(C318916pk r18) {
        AppBarLayout appBarLayout;
        C323756y3 r0;
        TabLayout tabLayout;
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup;
        ViewParent parent;
        View view;
        C318916pk r4 = r18;
        UserDetailFragment userDetailFragment = r4.A0A;
        View view2 = userDetailFragment.mView;
        if (view2 != null) {
            UserDetailTabController userDetailTabController = r4.A06;
            C323756y3 r02 = userDetailTabController.mViewHolder;
            if (!(r02 == null || (view = r02.A00) == null)) {
                0nA.A0c(view, r4.A03);
            }
            boolean z = r4.A0B;
            boolean z2 = false;
            if (z && (parent = view2.getParent()) != null) {
                0nA.A0c((View) parent, 0);
            }
            2dZ A042 = 2dZ.A0t.A04(userDetailFragment);
            List list = 0sn.A00;
            List list2 = list;
            UserSession userSession = r4.A05;
            0qQ.A0B(userSession, 0);
            if (C322606w6.A03(userSession)) {
                if (C322606w6.A04(userSession)) {
                    viewGroup = A042.A0O;
                } else {
                    viewGroup = A042.A0P;
                }
                list2 = 0sr.A1N(viewGroup);
            }
            boolean A012 = 2Y9.A01(userDetailFragment.requireContext().getResources().getConfiguration().screenWidthDp);
            ViewGroup viewGroup2 = null;
            C227762js r13 = r4.A04;
            int i = r4.A03;
            r13.A05(r4.A09, list, list2, (float) i, true);
            boolean A032 = C322606w6.A03(userSession);
            if (!(!A032 || (r0 = userDetailTabController.mViewHolder) == null || (tabLayout = r0.A0C) == null || (viewTreeObserver = tabLayout.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnGlobalLayoutListener(new C319016pu(tabLayout, r4));
            }
            C323756y3 r03 = userDetailTabController.mViewHolder;
            if (!(r03 == null || (appBarLayout = r03.A0B) == null)) {
                appBarLayout.A02(r4.A07);
            }
            C323756y3 r04 = userDetailTabController.mViewHolder;
            if (r04 != null) {
                RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = r04.A0G;
                C318946pn r8 = r4.A08;
                0qQ.A0B(r8, 0);
                List list3 = refreshableAppBarLayoutBehavior.A0G;
                if (!list3.contains(r8)) {
                    list3.add(r8);
                }
            }
            01N A1H = 0jo.A1H();
            if (C322606w6.A03(userSession) && !A032) {
                018.A18(A1H, 0nA.A10(A042.A0O));
                A1H.add(A042.A0P);
            }
            AnonymousClass2ZQ A002 = C71172bH.A00();
            if (A002 != null) {
                viewGroup2 = A002.C3o();
            }
            if (A012 && viewGroup2 != null) {
                A002.Eni(viewGroup2);
            }
            01N A1I = 0jo.A1I(A1H);
            if (!A1I.isEmpty()) {
                r13.A0A = A1I;
            }
            C323756y3 r05 = userDetailTabController.mViewHolder;
            if (r05 != null) {
                0nA.A0e(r05.A03, i);
                0nA.A0e(userDetailTabController.mViewHolder.A02, i);
                0nA.A0e(userDetailTabController.mViewHolder.A06, i);
            }
            if (!z) {
                z2 = true;
            }
            AnonymousClass2ZQ A003 = C71172bH.A00();
            if (A003 != null) {
                A003.Eu7(z2);
            }
        }
    }

    public final void onScroll(C238133Ar r11, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A032 = AnonymousClass0fD.A03(-1335299175);
        C238133Ar r4 = r11;
        0qQ.A0B(r11, 0);
        if (this.A02 == -1) {
            i6 = 511817369;
        } else {
            this.A04.onScroll(r4, i, i2, i3, i4, i5);
            i6 = -146679594;
        }
        AnonymousClass0fD.A0A(i6, A032);
    }

    public final void onScrollStateChanged(C238133Ar r4, int i) {
        int A032 = AnonymousClass0fD.A03(122312237);
        0qQ.A0B(r4, 0);
        this.A02 = i;
        if (i == 0 && this.A00 * -1.0f < ((float) this.A03)) {
            this.A04.A0D = true;
        }
        this.A04.onScrollStateChanged(r4, i);
        AnonymousClass0fD.A0A(-1038351283, A032);
    }
}
