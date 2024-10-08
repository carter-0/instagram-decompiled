package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import java.lang.ref.WeakReference;

public final class Dc7 extends UserDetailFragment {
    public static final String __redex_internal_original_name = "SelfFragment";
    public AnonymousClass36O A00;
    public C318956po A01;
    public final C267624bv A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final FX1 A07;
    public final 1wn A08;
    public final 1wn A09;
    public final 1wn A0A;

    public final boolean A15() {
        return true;
    }

    public final void Ehu(C375639El r1) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        AnonymousClass36O r1 = this.A00;
        if (r1 == null) {
            0qQ.A0F("updateProfilePictureHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A08(intent, i, i2, false);
        if (i == 1111 && i2 == -1) {
            C319076q0.A01(requireContext(), intent2, AnonymousClass7TE.A0l(this.A06), new C51651FyD(this, 24), new C51651FyD(this, 25), new C51658FyK(this, 1));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass0eM r3 = this.A06;
        Object value = r3.getValue();
        requireActivity();
        0qQ.A0B(value, 1);
        C319036pw.A01 = true;
        AnonymousClass2kB r7 = (AnonymousClass2kB) this.A05.getValue();
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass36O r6 = this.A00;
        if (r6 == null) {
            str3 = "updateProfilePictureHelper";
        } else {
            C318956po r9 = this.A01;
            if (r9 == null) {
                str3 = "editProfileAvatarHandler";
            } else {
                C319046px r14 = new C319046px(this);
                C319076q0.A02(requireContext, viewLifecycleOwner, r6, r7, A0l, r9, "ig_self_profile", new C319066pz(this), new C51651FyD(this, 23), new C319056py(this), r14);
                if (!DcE.A05(AnonymousClass7TE.A0l(r3))) {
                    25x.A00(AnonymousClass7TE.A0l(r3)).A04(new G4S(this, 21));
                }
                DbX.A0R(r3).A01(this.A08, AnonymousClass3DU.class);
                UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                FragmentActivity requireActivity = requireActivity();
                0qQ.A0B(A0l2, 0);
                if (C319106q3.A00 && 182.A06(0Tu.A06, A0l2, 36328624391077353L)) {
                    0Tu r1 = 0Tu.A05;
                    if (DbW.A1U(r1, A0l2) || DbW.A1V(r1, A0l2)) {
                        str = "1534085557478153";
                        str2 = "test";
                    } else {
                        str = "515473607779528";
                        str2 = "control";
                    }
                    C49791F6z.A01(A0l2, AnonymousClass05K.A0u, AnonymousClass05K.A0C, str2);
                    1Wj r0 = 1Wj.A00;
                    if (r0 != null) {
                        r0.A03(A0l2, requireActivity, str);
                    }
                    C319106q3.A00 = false;
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass36O A0j() {
        AnonymousClass36O r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("updateProfilePictureHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public Dc7() {
        0Yh A0z = DbS.A0z(AnonymousClass2kB.class);
        this.A05 = DbS.A0I(C51800G2j.A00(this, 11), C51800G2j.A00(this, 12), new MJ4(29, (Object) null, this), A0z);
        0Yh A0z2 = DbS.A0z(C46369Ddm.class);
        this.A04 = DbS.A0I(C51800G2j.A00(this, 13), C51800G2j.A00(this, 14), new MJ4(30, (Object) null, this), A0z2);
        C51800G2j A002 = C51800G2j.A00(this, 6);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C51800G2j.A00(C51800G2j.A00(this, 15), 16));
        this.A03 = DbS.A0I(C51800G2j.A00(A003, 17), A002, new MJ4(31, (Object) null, A003), DbS.A0z(C46368Ddk.class));
        this.A09 = FXZ.A00(this, 55);
        this.A08 = FXZ.A00(this, 54);
        this.A0A = FXZ.A00(this, 56);
        this.A07 = FX1.A00(this, 24);
        this.A02 = new C50195FTb(this, 4);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int i2;
        int A022 = AnonymousClass0fD.A02(-253821101);
        0sP g4s = new G4S(this, 20);
        boolean z = AnonymousClass36O.A0G;
        AnonymousClass0eM r2 = this.A06;
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        0hq r12 = this.mFragmentManager;
        if (r12 != null) {
            this.A00 = new AnonymousClass36O(this, r12, (AnonymousClass57Y) null, A0l, DbX.A0l(AnonymousClass0t1.A01, r2), AnonymousClass05K.A0r, g4s);
            super.onCreate(bundle);
            UserSession A0l2 = AnonymousClass7TE.A0l(r2);
            Context requireContext = requireContext();
            WeakReference weakReference = new WeakReference(requireActivity());
            WeakReference weakReference2 = new WeakReference(this);
            WeakReference weakReference3 = weakReference2;
            this.A01 = new C318956po(requireContext, (View) null, (ProfileCoinFlipView) null, this, A0l2, (C252063oV) null, (C319656qy) null, weakReference, weakReference3, (C62320sa) null, (C62320sa) null, C51800G2j.A00(this, 7), C51800G2j.A00(this, 8), (C62320sa) null, new C51654FyG(this, 12));
            InstagramMainActivity activity = getActivity();
            if (activity instanceof AnonymousClass2ZQ) {
                UserDetailTabController userDetailTabController = this.A0z;
                0qQ.A0C(activity, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgMainActivityLegacy");
                2aC r0 = ((AnonymousClass2ZQ) activity).A08;
                if (r0 != null) {
                    i2 = r0.A00;
                } else {
                    i2 = 0;
                }
                userDetailTabController.A0J(i2);
            }
            1Ng A0R = DbX.A0R(r2);
            A0R.A01(this.A07, C318986pr.class);
            A0R.A01(this.A09, C239563Gy.class);
            if (182.A06(0Tu.A06, DbT.A0X(r2), 36312363644879926L)) {
                DbX.A0R(r2).A01(this.A0A, C319666qz.class);
            }
            Parcelable parcelable = requireArguments().getParcelable("ProfileLaunchConstants.LAUNCH_CONFIG");
            if (parcelable != null) {
                if (((UserDetailLaunchConfig) parcelable).A0U) {
                    AnonymousClass36O r22 = this.A00;
                    if (r22 == null) {
                        0qQ.A0F("updateProfilePictureHelper");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    r22.A05(requireContext());
                }
                AnonymousClass0fD.A09(-1143101934, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 70253064;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -2059992898;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
        if (onCreateAnimation != null) {
            return onCreateAnimation;
        }
        boolean z2 = C70542Rd.A03;
        return null;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1168884896);
        super.onDestroy();
        AnonymousClass0eM r5 = this.A06;
        1Ng A0R = DbX.A0R(r5);
        A0R.A02(this.A09, C239563Gy.class);
        A0R.A02(this.A07, C318986pr.class);
        if (182.A06(0Tu.A06, DbT.A0X(r5), 36312363644879926L)) {
            DbX.A0R(r5).A02(this.A0A, C319666qz.class);
        }
        C48208Eao.A00 = null;
        AnonymousClass0fD.A09(-987875594, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1865351082);
        super.onDestroyView();
        AnonymousClass0eM r3 = this.A06;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        FragmentActivity requireActivity = requireActivity();
        C319036pw.A01 = DbW.A1X(A0l);
        C319036pw.A00(requireActivity, A0l);
        DbX.A0R(r3).A02(this.A08, AnonymousClass3DU.class);
        AnonymousClass0fD.A09(-1160771870, A022);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1qK, java.lang.Object] */
    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1720765253);
        super.onResume();
        AnonymousClass0eM r6 = this.A06;
        DbX.A0R(r6).A00(new Object());
        AnonymousClass36O r0 = this.A00;
        if (r0 != null) {
            r0.A02();
            0lg A0X = DbT.A0X(r6);
            0qQ.A0B(A0X, 0);
            C319406qX r1 = (C319406qX) A0X.A01(C319406qX.class, new C73662Phb(A0X, 28));
            if (r1.A00()) {
                if (this.A00 != null) {
                    if (AnonymousClass36O.A0F) {
                        AnonymousClass36O.A0F = false;
                        AnonymousClass7TF.A0D().postDelayed(new C51452FuM(this, DbW.A0S(r6, 0), r1), 1000);
                    }
                }
            }
            AnonymousClass0fD.A09(-2014267395, A022);
            return;
        }
        0qQ.A0F("updateProfilePictureHelper");
        throw AnonymousClass00P.createAndThrow();
    }
}
