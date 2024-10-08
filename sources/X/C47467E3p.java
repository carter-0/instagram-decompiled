package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.Serializable;

/* renamed from: X.E3p  reason: case insensitive filesystem */
public final class C47467E3p extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "AvatarCoinFlipExpandedViewFragment";
    public ViewGroup A00;
    public ViewGroup A01;
    public AvatarCoinFlipConfig A02;
    public AvatarCoinFlipConfig A03;
    public C320946tJ A04;
    public ProfileCoinFlipView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgImageView A08;
    public ExtendedImageUrl A09;
    public C324436zH A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Intent A0H;
    public final AnonymousClass0eM A0I = DbS.A0I(C51799G2i.A00(this, 13), C51799G2i.A00(this, 7), new MMX(18, (Object) null, (Object) this), DbS.A0z(C46795DlU.class));
    public final AnonymousClass0eM A0J = DbS.A0I(C51799G2i.A00(this, 12), C51799G2i.A00(this, 8), new MMX(17, (Object) null, (Object) this), DbS.A0z(DdZ.class));
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;

    public final String getModuleName() {
        return "avatar_coin_flip_mimicry";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.instagram.avatars.coinflip.CoinFlipAvatarImageView, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            r21 = this;
            r1 = 0
            r2 = r22
            X.0qQ.A0B(r2, r1)
            r3 = r21
            r0 = r23
            super.onViewCreated(r2, r0)
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x0016
            r0.postponeEnterTransition()
        L_0x0016:
            r0 = 2131432510(0x7f0b143e, float:1.848678E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r2, r0)
            r3.A00 = r0
            r0 = 2131432511(0x7f0b143f, float:1.8486782E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r2, r0)
            r3.A01 = r0
            r0 = 2131432512(0x7f0b1440, float:1.8486784E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.instagram.avatars.coinflip.ProfileCoinFlipView r0 = (com.instagram.avatars.coinflip.ProfileCoinFlipView) r0
            r3.A05 = r0
            r0 = 2131430326(0x7f0b0bb6, float:1.848235E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r2, r0)
            r3.A08 = r0
            r0 = 2131432398(0x7f0b13ce, float:1.8486552E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r2, r0)
            r3.A07 = r0
            r0 = 2131430924(0x7f0b0e0c, float:1.8483563E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r2, r0)
            r3.A06 = r0
            X.0eM r5 = r3.A0L
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.DcE.A00(r0)
            if (r0 != 0) goto L_0x006e
            android.view.ViewGroup r6 = r3.A00
            if (r6 == 0) goto L_0x006e
            com.instagram.avatars.coinflip.ProfileCoinFlipView r4 = r3.A05
            if (r4 == 0) goto L_0x006e
            X.2co r2 = X.C232972uk.A00
            X.0qQ.A08(r2)
            X.6zH r0 = new X.6zH
            r0.<init>(r6, r4, r2)
            r3.A0A = r0
        L_0x006e:
            com.instagram.avatars.coinflip.ProfileCoinFlipView r12 = r3.A05
            if (r12 == 0) goto L_0x0141
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r12)
            r10 = 2131165318(0x7f070086, float:1.794485E38)
            r13 = 0
            X.C320966tM.A03(r0, r12, r2, r13, r10)
            X.2eS.A01(r12)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r3.A09
            if (r0 != 0) goto L_0x0092
            java.lang.String r6 = "externalUserProfilePicUrl"
        L_0x008a:
            X.0qQ.A0F(r6)
        L_0x008d:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0092:
            r12.setProfilePicUrl(r0, r3)
            android.content.res.Resources r0 = X.DbV.A05(r3)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            float r2 = (float) r0
            android.content.res.Resources r0 = X.DbV.A05(r3)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r12.setCameraDistance(r2)
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            android.content.Context r7 = r3.requireContext()
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r0 = r3.A02
            java.lang.String r11 = "externalCoinFlipConfig"
            if (r0 == 0) goto L_0x01dd
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r6 = r0.A06
            java.lang.String r4 = r6.A03
            int r0 = r6.A02
            float r2 = (float) r0
            int r0 = r6.A01
            float r0 = (float) r0
            float r2 = r2 / r0
            X.6tQ r9 = X.C320966tM.A00(r7, r8, r4, r2, r10)
            r19 = 1
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            android.content.Context r7 = r3.requireContext()
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r0 = r3.A02
            if (r0 == 0) goto L_0x01dd
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r6 = r0.A05
            java.lang.String r4 = r6.A03
            int r0 = r6.A02
            float r2 = (float) r0
            int r0 = r6.A01
            float r0 = (float) r0
            float r2 = r2 / r0
            X.6tQ r0 = X.C320966tM.A00(r7, r8, r4, r2, r10)
            X.6tQ[] r0 = new X.C321006tQ[]{r9, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r12.setAvatarDrawables(r0)
            X.6tJ r0 = r3.A04
            java.lang.String r6 = "initialCoinSide"
            if (r0 == 0) goto L_0x008a
            r12.A0F(r0)
            X.6tJ r2 = r3.A04
            if (r2 == 0) goto L_0x008a
            X.6tJ r0 = X.C320946tJ.AVATAR
            if (r2 != r0) goto L_0x010b
            r2 = 1065353216(0x3f800000, float:1.0)
            com.instagram.avatars.coinflip.CoinFlipAvatarImageView r0 = r12.A01
            r0.setAvatarScale(r2)
        L_0x010b:
            android.content.Context r4 = r3.requireContext()
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r2 = r3.A02
            if (r2 == 0) goto L_0x01dd
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.C320966tM.A01(r4, r2, r12, r3, r0)
            android.view.ViewGroup r10 = r3.A01
            if (r10 == 0) goto L_0x0141
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r18 = X.DcE.A01(r0)
            X.6tJ r11 = r3.A04
            if (r11 == 0) goto L_0x008a
            r0 = 10
            X.G2i r14 = X.C51799G2i.A00(r3, r0)
            r0 = 11
            X.G2i r15 = X.C51799G2i.A00(r3, r0)
            X.G1O r16 = X.G1O.A00
            X.G1P r17 = X.G1P.A00
            X.6tq r9 = new X.6tq
            r20 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0141:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r3.A08
            if (r2 == 0) goto L_0x0154
            android.content.Context r1 = r3.requireContext()
            android.content.Context r0 = r3.getContext()
            int r0 = X.2Yu.A0B(r0)
            X.DbX.A12(r1, r2, r0)
        L_0x0154:
            X.6zH r0 = r3.A0A
            if (r0 == 0) goto L_0x0162
            X.2cs r2 = r0.A00
            r0 = 0
            r2.A05(r0)
            r2.A03()
        L_0x0162:
            A00(r3)
            boolean r0 = r3.A0D
            if (r0 != 0) goto L_0x017f
            android.view.ViewGroup r4 = r3.A00
            if (r4 == 0) goto L_0x017f
            android.content.Context r2 = r3.requireContext()
            android.content.Context r1 = r3.getContext()
            r0 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A16(r2, r4, r0)
        L_0x017f:
            android.view.ViewGroup r1 = r3.A00
            if (r1 == 0) goto L_0x0188
            r0 = 32
            X.FP6.A00(r1, r0, r3)
        L_0x0188:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r3.A08
            if (r1 == 0) goto L_0x0191
            r0 = 33
            X.FP6.A00(r1, r0, r3)
        L_0x0191:
            com.instagram.common.ui.base.IgTextView r1 = r3.A07
            if (r1 == 0) goto L_0x019a
            r0 = 34
            X.FP6.A00(r1, r0, r3)
        L_0x019a:
            com.instagram.common.ui.base.IgTextView r1 = r3.A06
            if (r1 == 0) goto L_0x01a3
            r0 = 35
            X.FP6.A00(r1, r0, r3)
        L_0x01a3:
            com.instagram.avatars.coinflip.ProfileCoinFlipView r2 = r3.A05
            if (r2 == 0) goto L_0x01bd
            com.instagram.avatars.coinflip.CoinFlipAvatarImageView r1 = r2.A01
            r0 = 122(0x7a, float:1.71E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.setTransitionName(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r2.A02
            r0 = 239(0xef, float:3.35E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.setTransitionName(r0)
        L_0x01bd:
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x01c6
            r0.startPostponedEnterTransition()
        L_0x01c6:
            X.0eM r0 = r3.A0J
            java.lang.Object r0 = r0.getValue()
            X.DdZ r0 = (X.DdZ) r0
            X.2Fk r2 = r0.A02
            r0 = 15
            X.J6h r1 = new X.J6h
            r1.<init>(r3, r0)
            r0 = 41
            X.Dba.A16(r3, r2, r1, r0)
            return
        L_0x01dd:
            X.0qQ.A0F(r11)
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47467E3p.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C47467E3p e3p) {
        C320946tJ r1;
        ViewGroup viewGroup = e3p.A00;
        if (viewGroup != null) {
            UF4 uf4 = new UF4();
            uf4.A0d(200);
            C14283TtH.A02(viewGroup, uf4);
        }
        AvatarCoinFlipConfig avatarCoinFlipConfig = e3p.A03;
        int i = 0;
        if (avatarCoinFlipConfig == null || !avatarCoinFlipConfig.A08) {
            ProfileCoinFlipView profileCoinFlipView = e3p.A05;
            if (profileCoinFlipView != null) {
                r1 = profileCoinFlipView.A01;
            } else {
                r1 = null;
            }
            if (r1 != C320946tJ.PROFILE_PICTURE) {
                IgTextView igTextView = e3p.A07;
                if (igTextView != null) {
                    igTextView.setVisibility(DbW.A01(e3p.A0C ? 1 : 0));
                }
                IgTextView igTextView2 = e3p.A06;
                if (igTextView2 != null) {
                    if (e3p.A0C) {
                        i = 8;
                    }
                    igTextView2.setVisibility(i);
                    return;
                }
                return;
            }
        }
        IgTextView igTextView3 = e3p.A07;
        if (igTextView3 != null) {
            igTextView3.setVisibility(8);
        }
        IgTextView igTextView4 = e3p.A06;
        if (igTextView4 != null) {
            igTextView4.setVisibility(8);
        }
    }

    public static final void A01(C47467E3p e3p) {
        Intent intent = e3p.A0H;
        intent.putExtra(AnonymousClass000.A00(4217), e3p.A0G);
        ProfileCoinFlipView profileCoinFlipView = e3p.A05;
        C320946tJ r1 = null;
        if (profileCoinFlipView != null) {
            r1 = profileCoinFlipView.A01;
        }
        intent.putExtra(AnonymousClass000.A00(4001), AnonymousClass7TF.A1W(r1, C320946tJ.PROFILE_PICTURE));
        DbX.A17(intent, e3p);
        if (DcE.A00(AnonymousClass7TE.A0l(e3p.A0L))) {
            C320946tJ r12 = e3p.A04;
            if (r12 == null) {
                0qQ.A0F("initialCoinSide");
                throw AnonymousClass00P.createAndThrow();
            }
            ProfileCoinFlipView profileCoinFlipView2 = e3p.A05;
            if (profileCoinFlipView2 != null && r12 == profileCoinFlipView2.A01) {
                e3p.requireActivity().finishAfterTransition();
                return;
            }
        }
        DbT.A1K(e3p);
    }

    public static final void A02(C47467E3p e3p, boolean z) {
        if (z) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(DbT.A0X(e3p.A0L)), "expandable_profile_picture_action");
            if (A0e.isSampled()) {
                DbV.A1L(A0e, AnonymousClass7TF.A0w("action", "Add your avatar to profile"));
            }
        }
        FragmentActivity requireActivity = e3p.requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(e3p.A0L);
        AvatarCoinFlipConfig avatarCoinFlipConfig = e3p.A03;
        C50023FJi A002 = C50023FJi.A00(e3p, 7);
        C50023FJi A003 = C50023FJi.A00(e3p, 8);
        Boolean A0u = AnonymousClass7TE.A0u();
        0qQ.A0B(A0l, 1);
        View inflate = LayoutInflater.from(requireActivity).inflate(R.layout.avatar_coin_flip_nux_dialogue_fragment, (ViewGroup) null);
        0qQ.A07(inflate);
        if (A0u.equals(true)) {
            TextView A0B2 = DbW.A0B(inflate, R.id.avatar_coin_flip_dialog_nux_title);
            TextView A0B3 = DbW.A0B(inflate, R.id.avatar_coin_flip_dialog_nux_subtitle);
            A0B2.setText(2131953420);
            A0B3.setText(2131953419);
        }
        C49738F4d.A01(inflate, avatarCoinFlipConfig, e3p, A0l);
        C358248ab A0X = DbS.A0X(requireActivity);
        A0X.A0k(inflate);
        A0X.A0I(A002, 2131952264);
        A0X.A0H(A003, 2131953430);
        A0X.A0s(true);
        A0X.A0r(true);
        A0X.A09 = true;
        DbT.A1V(A0X);
        C46795DlU dlU = (C46795DlU) e3p.A0I.getValue();
        if (dlU != null) {
            dlU.A00("ig_external_profile", AnonymousClass05K.A00, (String) null);
        }
    }

    public static final void A03(C47467E3p e3p, boolean z) {
        e3p.A0E = z;
        ((DdZ) e3p.A0J.getValue()).A02((String) null, AnonymousClass7TE.A0u());
        IgTextView igTextView = e3p.A07;
        if (igTextView != null) {
            igTextView.setVisibility(8);
        }
        IgTextView igTextView2 = e3p.A06;
        if (igTextView2 != null) {
            igTextView2.setVisibility(8);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0L);
    }

    public C47467E3p() {
        C51799G2i A002 = C51799G2i.A00(this, 9);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C51799G2i.A00(C51799G2i.A00(this, 14), 15));
        this.A0K = DbS.A0I(C51799G2i.A00(A003, 16), A002, new MMX(19, (Object) null, (Object) A003), DbS.A0z(C314326i1.class));
        this.A0H = DbS.A09();
        this.A0L = C227642jf.A02(this);
    }

    public final boolean onBackPressed() {
        A01(this);
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.E3p, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        C320946tJ r1;
        int A022 = AnonymousClass0fD.A02(1126517521);
        C47467E3p.super.onCreate(bundle);
        this.A03 = (AvatarCoinFlipConfig) requireArguments().getParcelable(AnonymousClass000.A00(2646));
        AvatarCoinFlipConfig avatarCoinFlipConfig = (AvatarCoinFlipConfig) requireArguments().getParcelable(AnonymousClass000.A00(2640));
        if (avatarCoinFlipConfig != null) {
            this.A02 = avatarCoinFlipConfig;
            String string = requireArguments().getString(AnonymousClass000.A00(2641));
            if (string != null) {
                this.A0B = string;
                ExtendedImageUrl parcelable = requireArguments().getParcelable(AnonymousClass000.A00(2642));
                if (parcelable != null) {
                    this.A09 = parcelable;
                    Serializable serializable = requireArguments().getSerializable(AnonymousClass000.A00(2643));
                    if (!(serializable instanceof C320946tJ) || (r1 = (C320946tJ) serializable) == null) {
                        illegalStateException = AnonymousClass7TE.A0z("initial coin side is required");
                        i = 281618707;
                    } else {
                        this.A04 = r1;
                        this.A0F = requireArguments().getBoolean(AnonymousClass000.A00(2648));
                        this.A0D = requireArguments().getBoolean(AnonymousClass000.A00(2633));
                        AnonymousClass7TE.A1Z(new MHD((Object) this, (AnonymousClass4D7) null, 46), DbW.A0E(this));
                        if (this.A03 == null) {
                            ((DdZ) this.A0J.getValue()).A02((String) null, AnonymousClass7TE.A0u());
                        }
                        AnonymousClass0fD.A09(-1615825055, A022);
                        return;
                    }
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("external user profile pic url required");
                    i = 2143287770;
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("external user id required");
                i = -62862862;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("external coin flip config required");
            i = -1992200890;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(313554354);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_coin_flip_expanded_view_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-170374961, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-937705889);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A05 = null;
        this.A08 = null;
        this.A07 = null;
        this.A06 = null;
        AnonymousClass0fD.A09(791779237, A022);
    }
}
