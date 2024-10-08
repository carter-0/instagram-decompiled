package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.List;

public final class DcA extends AnonymousClass4DH implements AnonymousClass4DR, C227252iu, AnonymousClass0j6, C227272iw, C227822jy, C267684c2 {
    public static final /* synthetic */ AnonymousClass0YZ[] A09 = {new 01B(DcA.class, "mainActivity", "getMainActivity()Lcom/instagram/mainactivity/delegate/IgMainActivityLegacy;", 0)};
    public static final String __redex_internal_original_name = "ProfileWithMenuFragment";
    public List A00;
    public UserDetailFragment A01;
    public final C46362Dde A02 = new C46362Dde(this, C51800G2j.A00(this, 4));
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(C51800G2j.A00(this, 5));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final FX1 A05 = FX1.A00(this, 23);
    public final 1wn A06 = FXZ.A00(this, 53);
    public final C49381Euj A07 = new C49381Euj(this);
    public final boolean A08 = true;

    public final void AV0(boolean z) {
        UserDetailFragment userDetailFragment = this.A01;
        if (userDetailFragment != null) {
            userDetailFragment.AV0(false);
        }
    }

    public final void DqH() {
        A01((Integer) null, false);
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        UserDetailFragment userDetailFragment = this.A01;
        if (userDetailFragment != null) {
            userDetailFragment.configureActionBar(r2);
        }
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        A01(Integer.valueOf(configuration.screenWidthDp), false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.user_detail_fragment).setLayoutDirection(3);
        C322576w3.A00();
        UserSession A0l = AnonymousClass7TE.A0l(this.A04);
        requireContext();
        0qQ.A0B(A0l, 0);
        User A0Q = AnonymousClass7TF.A0Q(A0l);
        if (AnonymousClass431.A00(A0l) && A0Q.A2M() && !182.A06(0Tu.A06, A0l, 36314609912646370L)) {
            1NY A0L = DbZ.A0L(A0l);
            A0L.A0A("accounts/update_business_info/");
            DbV.A1N(A0L, C3727892k.class, C3727992l.class);
            1ES.A03(DbT.A0T(A0L, "is_profile_audio_call_enabled", "0"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0091, code lost:
        if (X.182.A06(r1, r0, 36315799618588208L) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        if (X.C319886rO.A02(r0) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d1, code lost:
        if (X.182.A06(r1, r0, 36322353739212894L) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        if (X.C318996ps.A00().A05(r0) == false) goto L_0x00e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.DcA r26) {
        /*
            r6 = r26
            com.instagram.profile.fragment.UserDetailFragment r0 = r6.A01
            if (r0 == 0) goto L_0x00f5
            X.6x7 r0 = r0.A0x
            if (r0 == 0) goto L_0x00f5
            X.6xC r10 = r0.A0C
            X.0eM r7 = r6.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            android.content.Context r2 = r6.requireContext()
            r5 = 1
            X.0qQ.A0B(r0, r5)
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r0)
            boolean r1 = r1.A1P()
            if (r1 == 0) goto L_0x010c
            java.lang.Integer r13 = X.AnonymousClass05K.A0Y
        L_0x0026:
            boolean r1 = X.0oI.A0C(r2)
            if (r1 != 0) goto L_0x0108
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x002e:
            r8 = r0
            X.0Tu r1 = X.0Tu.A05
            r2 = 36311835363771167(0x81016c0000031f, double:3.027089127849226E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 != 0) goto L_0x003d
            r8 = 0
        L_0x003d:
            X.Ddd r2 = X.C46361Ddd.A00(r0)
            boolean r2 = r2.A0F
            if (r2 == 0) goto L_0x00f6
            java.lang.Integer r12 = X.AnonymousClass05K.A01
        L_0x0047:
            r2 = 0
            boolean r20 = X.AnonymousClass37B.A01(r0, r2)
            X.0Tu r4 = X.0Tu.A06
            r2 = 36313888359188757(0x81034a00100915, double:3.0283874504180586E-306)
            boolean r18 = X.182.A06(r4, r0, r2)
            r2 = 36313544760756311(0x8102fa00000857, double:3.02817015738582E-306)
            boolean r21 = X.182.A06(r1, r0, r2)
            r2 = 36312363644748852(0x8101e700000434, double:3.0274232148667305E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            r16 = r2 ^ 1
            r2 = 36312513968604306(0x81020a00000492, double:3.027518280278225E-306)
            boolean r17 = X.182.A06(r1, r0, r2)
            r2 = 36311350032466429(0x8100fb000001fd, double:3.026782202377837E-306)
            boolean r25 = X.182.A06(r1, r0, r2)
            com.instagram.user.model.User r2 = X.AnonymousClass7TF.A0Q(r0)
            boolean r2 = r2.A2L()
            if (r2 != 0) goto L_0x0093
            r2 = 36315799618588208(0x81050700000e30, double:3.0295961385582953E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            r15 = 1
            if (r2 != 0) goto L_0x0094
        L_0x0093:
            r15 = 0
        L_0x0094:
            r2 = 36314893380488054(0x81043400000b76, double:3.02902302993463E-306)
            boolean r19 = X.182.A06(r1, r0, r2)
            boolean r24 = X.C319116q4.A08(r0, r5)
            r2 = 36321627889346151(0x810a5400022667, double:3.033281960454181E-306)
            boolean r22 = X.182.A06(r1, r0, r2)
            boolean r2 = X.C319886rO.A03(r0)
            if (r2 != 0) goto L_0x00b7
            boolean r2 = X.C319886rO.A02(r0)
            r14 = 1
            if (r2 != 0) goto L_0x00b8
        L_0x00b7:
            r14 = 0
        L_0x00b8:
            X.C65001Zz.A00()
            r2 = 36322353738688598(0x810afd00002856, double:3.033740990501105E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 == 0) goto L_0x00d3
            r2 = 36322353739212894(0x810afd0008285e, double:3.033740990832672E-306)
            boolean r1 = X.182.A06(r1, r0, r2)
            r26 = 1
            if (r1 != 0) goto L_0x00d5
        L_0x00d3:
            r26 = 0
        L_0x00d5:
            boolean r1 = X.C318996ps.A01()
            if (r1 == 0) goto L_0x00e7
            X.1q7 r1 = X.C318996ps.A00()
            boolean r0 = r1.A05(r0)
            r23 = 1
            if (r0 != 0) goto L_0x00e9
        L_0x00e7:
            r23 = 0
        L_0x00e9:
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r7)
            java.util.List r0 = X.C319136q6.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r10.A00 = r0
            r6.A00 = r0
        L_0x00f5:
            return
        L_0x00f6:
            com.instagram.user.model.User r2 = X.AnonymousClass7TF.A0Q(r0)
            boolean r2 = r2.A1W()
            if (r2 == 0) goto L_0x0104
            java.lang.Integer r12 = X.AnonymousClass05K.A0N
            goto L_0x0047
        L_0x0104:
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            goto L_0x0047
        L_0x0108:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x002e
        L_0x010c:
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DcA.A00(X.DcA):void");
    }

    public final void A02() {
        AnonymousClass0eM r1 = this.A03;
        if (r1.CVQ()) {
            C284945Oz r12 = ((E3T) r1.getValue()).A02;
            r12.Epw(Integer.valueOf(AnonymousClass7TE.A0M(r12.getValue()) + 1));
        }
    }

    public final boolean COC() {
        return this.A08;
    }

    public final 0jB E4x() {
        0jB r3 = new 0jB();
        User A0l = DbX.A0l(AnonymousClass0t1.A01, this.A04);
        r3.A0A(Dbm.A01(), A0l.getUsername());
        r3.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A0l.getId());
        return r3;
    }

    public final void EKl() {
        UserDetailFragment userDetailFragment = this.A01;
        if (userDetailFragment != null) {
            userDetailFragment.EKl();
        }
    }

    public final String getModuleName() {
        return "self_profile";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (X.0lz.A02(requireContext()) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(java.lang.Integer r6, boolean r7) {
        /*
            r5 = this;
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x005c
            if (r6 == 0) goto L_0x0079
            int r0 = r6.intValue()
        L_0x000c:
            boolean r0 = X.2Y9.A01(r0)
            r4 = 1
            r3 = r0 ^ 1
            r2 = 0
            X.Dde r1 = r5.A02
            X.0YZ[] r0 = A09
            r0 = r0[r2]
            java.lang.Object r0 = r1.A03(r5, r0)
            X.2ZR r0 = (X.2ZR) r0
            if (r3 == 0) goto L_0x0061
            if (r0 == 0) goto L_0x0027
            r0.Eu7(r7)
        L_0x0027:
            if (r7 != 0) goto L_0x005f
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.0eM r0 = r5.A04
            r0.getValue()
            android.content.Context r0 = r5.requireContext()
            boolean r0 = X.0lz.A02(r0)
            if (r0 != 0) goto L_0x005f
        L_0x003a:
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            if (r2 == 0) goto L_0x005c
            r0 = 2131443528(0x7f0b3f48, float:1.8509127E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x005c
            if (r4 == 0) goto L_0x005d
            X.0eM r0 = r5.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            int r0 = X.0Pn.A01(r0)
            int r0 = X.2Yu.A0G(r2, r0)
        L_0x0059:
            X.0nA.A0X(r1, r0)
        L_0x005c:
            return
        L_0x005d:
            r0 = 0
            goto L_0x0059
        L_0x005f:
            r4 = 0
            goto L_0x003a
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            r0.Eu7(r2)
        L_0x0066:
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x005c
            r0 = 2131443528(0x7f0b3f48, float:1.8509127E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x005c
            X.0nA.A0X(r0, r2)
            return
        L_0x0079:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenWidthDp
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DcA.A01(java.lang.Integer, boolean):void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-428999667);
        DcA.super.onCreate(bundle);
        AnonymousClass0eM r7 = this.A04;
        1Ng A0R = DbX.A0R(r7);
        A0R.A01(this.A06, FW5.class);
        A0R.A01(this.A05, 2Cy.class);
        UserDetailFragment A0P = getChildFragmentManager().A0P(R.id.user_detail_fragment);
        if (A0P instanceof UserDetailFragment) {
            this.A01 = A0P;
        } else {
            1a1 A023 = C46447Df9.A02();
            UserSession A0l = AnonymousClass7TE.A0l(r7);
            C46474Dfc A012 = C46548Dgp.A01(AnonymousClass7TE.A0l(r7), DbU.A0u(r7), "profile_with_menu", "self_profile");
            A012.A0a = true;
            UserDetailFragment A002 = C46474Dfc.A00(A0l, A023, A012);
            0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.profile.fragment.UserDetailFragment");
            UserDetailFragment userDetailFragment = A002;
            this.A01 = userDetailFragment;
            0s1 A0C = DbW.A0C(this);
            A0C.A0D(userDetailFragment, userDetailFragment.getClass().getCanonicalName(), R.id.user_detail_fragment);
            A0C.A00();
        }
        new C363668k9(AnonymousClass7TE.A0l(r7)).A00("profile_switch");
        C46361Ddd A003 = C46361Ddd.A00(AnonymousClass7TE.A0l(r7));
        A003.A04();
        A003.A0B.add(this.A07);
        if (!A003.A0C) {
            A003.A0C = true;
            C49401Ev3 ev3 = A003.A03;
            C49402Ev4 ev4 = new C49402Ev4(A003);
            C239113Fa r0 = new C239113Fa(C41845B3m.A04(), C46366Ddi.class, "IGFBPayExperienceEnabled", false);
            UserSession userSession = ev3.A00;
            1OC A004 = C46479Dfi.A00(r0, userSession);
            EDV.A00(A004, ev3, ev4, 39);
            1ES.A05(A004, 665, 3, 182.A06(0Tu.A05, userSession, 36328216370494549L), false);
        }
        AnonymousClass0fD.A09(-1479342998, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int A022 = AnonymousClass0fD.A02(-596459766);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater, 0);
        ViewGroup viewGroup2 = viewGroup;
        DcA.super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getActivity() == null || viewGroup == null) {
            inflate = layoutInflater.inflate(R.layout.fragment_profile_without_slideout_menu, viewGroup, false);
        } else {
            inflate = 2Su.A01(layoutInflater2, (ViewGroup.LayoutParams) null, viewGroup2, R.layout.fragment_profile_without_slideout_menu, false, false);
        }
        AnonymousClass0fD.A09(1649180525, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1939827913);
        super.onDestroy();
        AnonymousClass0eM r3 = this.A04;
        1Ng A0R = DbX.A0R(r3);
        A0R.A02(this.A06, FW5.class);
        A0R.A02(this.A05, 2Cy.class);
        C46361Ddd A002 = C46361Ddd.A00(AnonymousClass7TE.A0l(r3));
        A002.A0B.remove(this.A07);
        AnonymousClass0fD.A09(1620915604, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1102003465);
        super.onResume();
        A01((Integer) null, false);
        AnonymousClass0fD.A09(1750552015, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(513392378);
        DcA.super.onStart();
        UserDetailFragment userDetailFragment = this.A01;
        if (userDetailFragment != null) {
            C318866pf r0 = userDetailFragment.A0m;
            if (r0 != null) {
                r0.A06 = this;
            }
            C318856pe r02 = userDetailFragment.A0o;
            if (r02 != null) {
                r02.A00 = this;
            }
            C323336xK r03 = userDetailFragment.A18;
            if (r03 != null) {
                r03.A01 = this;
            }
            userDetailFragment.A0x.A00 = this;
        }
        A00(this);
        AnonymousClass0fD.A09(1593188513, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1298948175);
        DcA.super.onStop();
        A01((Integer) null, true);
        AnonymousClass0fD.A09(-507087507, A022);
    }
}
