package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Dia  reason: case insensitive filesystem */
public final class C46655Dia extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "UpdateProfilePictureBottomSheetFragment";
    public int A00;
    public ViewPager2 A01;
    public TabLayout A02;
    public String A03;
    public String A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = DbS.A0I(C51801G2k.A00(this, 27), C51801G2k.A00(this, 26), new MMX(7, (Object) null, (Object) this), DbS.A0z(DdZ.class));
    public final AnonymousClass0eM A07;

    public final String getModuleName() {
        return "edit_profile_picture_bottom_sheet";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0118, code lost:
        if (r0 != false) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            r17 = this;
            r3 = 0
            r4 = r18
            X.0qQ.A0B(r4, r3)
            r2 = r17
            r0 = r19
            super.onViewCreated(r4, r0)
            android.os.Bundle r1 = r2.mArguments
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "tab_type_key"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r1 = (com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType) r1
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r1 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB
        L_0x001d:
            android.os.Bundle r5 = r2.mArguments
            if (r5 == 0) goto L_0x01b5
            java.lang.String r0 = "logging_surface_key"
            java.lang.String r5 = r5.getString(r0)
            if (r5 == 0) goto L_0x01b5
            r2.A04 = r5
            java.lang.String r0 = "ig_edit_profile"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x019a
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r9 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB
            if (r1 != r9) goto L_0x0196
            r0 = 1435(0x59b, float:2.011E-42)
        L_0x0039:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x003d:
            r2.A03 = r0
            android.os.Bundle r5 = r2.mArguments
            if (r5 == 0) goto L_0x0192
            java.lang.String r0 = "coin_flip_setting_value_key"
            boolean r16 = r5.getBoolean(r0)
        L_0x0049:
            android.os.Bundle r5 = r2.mArguments
            if (r5 == 0) goto L_0x018f
            java.lang.String r0 = "is_viewpager_scroll_enabled_key"
            boolean r5 = r5.getBoolean(r0)
        L_0x0053:
            android.os.Bundle r6 = r2.mArguments
            if (r6 == 0) goto L_0x018c
            java.lang.String r0 = "is_enable_avatar_creation_flow"
            boolean r10 = r6.getBoolean(r0)
        L_0x005d:
            X.0eM r6 = r2.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            boolean r0 = X.DcE.A05(r0)
            r7 = 2131443456(0x7f0b3f00, float:1.850898E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r4, r7)
            androidx.viewpager2.widget.ViewPager2 r8 = (androidx.viewpager2.widget.ViewPager2) r8
            androidx.fragment.app.FragmentActivity r11 = r2.requireActivity()
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r13 = r2.A04
            if (r13 != 0) goto L_0x0086
            java.lang.String r0 = "surface"
        L_0x007e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0086:
            java.lang.String r14 = r2.A03
            if (r14 != 0) goto L_0x008d
            java.lang.String r0 = "mechanism"
            goto L_0x007e
        L_0x008d:
            if (r10 == 0) goto L_0x0095
            if (r5 != 0) goto L_0x0118
            if (r0 != 0) goto L_0x011c
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r9 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_AVATAR_TAB
        L_0x0095:
            java.util.List r15 = X.AnonymousClass7TE.A1I(r9)
        L_0x0099:
            X.Did r10 = new X.Did
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r8.setAdapter(r10)
            r9 = 2
            X.JqK r7 = new X.JqK
            r7.<init>(r2, r9)
            r8.A05(r7)
            r2.A01 = r8
            X.0lg r7 = X.AnonymousClass7TF.A0L(r6, r3)
            X.0Tu r10 = X.0Tu.A05
            boolean r7 = X.DbW.A1U(r10, r7)
            if (r7 != 0) goto L_0x00c2
            X.0lg r7 = X.AnonymousClass7TF.A0L(r6, r3)
            boolean r7 = X.DbW.A1V(r10, r7)
            if (r7 == 0) goto L_0x00f8
        L_0x00c2:
            r7 = 2131443454(0x7f0b3efe, float:1.8508977E38)
            android.widget.TextView r12 = X.AnonymousClass7TG.A0R(r4, r7)
            X.0lg r7 = X.AnonymousClass7TF.A0L(r6, r3)
            boolean r7 = X.DbW.A1V(r10, r7)
            if (r7 == 0) goto L_0x00f5
            android.content.Context r8 = r2.requireContext()
            r7 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r8, r7)
            android.content.Context r8 = r2.requireContext()
            r7 = 2131969938(0x7f134792, float:1.9576813E38)
            java.lang.String r9 = X.DbY.A0c(r8, r11, r7)
            int r8 = X.DbZ.A01(r2)
            X.ESx r7 = new X.ESx
            r7.<init>((X.C46655Dia) r2, (int) r8)
            X.AnonymousClass7AV.A07(r7, r12, r11, r9)
        L_0x00f5:
            r12.setVisibility(r3)
        L_0x00f8:
            r3 = 2131443455(0x7f0b3eff, float:1.8508979E38)
            android.view.View r3 = r4.requireViewById(r3)
            com.google.android.material.tabs.TabLayout r3 = (com.google.android.material.tabs.TabLayout) r3
            r2.A02 = r3
            X.0lg r7 = X.DbT.A0X(r6)
            r3 = 36322465407838403(0x810b17000028c3, double:3.0338116105210975E-306)
            boolean r7 = X.182.A06(r10, r7, r3)
            com.google.android.material.tabs.TabLayout r11 = r2.A02
            if (r11 != 0) goto L_0x012b
            java.lang.String r0 = "tabLayout"
            goto L_0x007e
        L_0x0118:
            if (r0 == 0) goto L_0x011c
            goto L_0x0095
        L_0x011c:
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType[] r9 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.values()
            X.Fw8 r7 = new X.Fw8
            r7.<init>(r3)
            java.util.List r15 = X.03t.A0A(r7, r9)
            goto L_0x0099
        L_0x012b:
            androidx.viewpager2.widget.ViewPager2 r9 = r2.A01
            if (r9 == 0) goto L_0x0188
            X.FSz r8 = new X.FSz
            r8.<init>(r2, r0, r5, r7)
            X.MgQ r7 = new X.MgQ
            r7.<init>(r9, r11, r8)
            r7.A00()
            if (r5 == 0) goto L_0x0158
            if (r0 != 0) goto L_0x0158
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r5 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_AVATAR_TAB
            r0 = 1058642330(0x3f19999a, float:0.6)
            A02(r2, r5, r0)
            X.0lg r0 = X.DbT.A0X(r6)
            boolean r0 = X.182.A06(r10, r0, r3)
            if (r0 != 0) goto L_0x0158
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            A03(r2, r5, r0)
        L_0x0158:
            androidx.viewpager2.widget.ViewPager2 r3 = r2.A01
            if (r3 == 0) goto L_0x0188
            X.FsO r0 = new X.FsO
            r0.<init>(r2, r1)
            r3.post(r0)
            androidx.viewpager2.widget.ViewPager2 r3 = r2.A01
            if (r3 == 0) goto L_0x0188
            X.FpY r0 = new X.FpY
            r0.<init>(r2)
            r3.post(r0)
            X.07U r5 = X.07U.A05
            X.07Z r4 = r2.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r4)
            r8 = 0
            r9 = 17
            X.MHG r3 = new X.MHG
            r7 = r1
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r3, r0)
            return
        L_0x0188:
            java.lang.String r0 = "viewPager"
            goto L_0x007e
        L_0x018c:
            r10 = 1
            goto L_0x005d
        L_0x018f:
            r5 = 1
            goto L_0x0053
        L_0x0192:
            r16 = 0
            goto L_0x0049
        L_0x0196:
            r0 = 1434(0x59a, float:2.01E-42)
            goto L_0x0039
        L_0x019a:
            java.lang.String r0 = "ig_self_profile"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01ae
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r9 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB
            if (r1 != r9) goto L_0x01aa
            java.lang.String r0 = "ig_self_profile_identity_sheet_profile_picture"
            goto L_0x003d
        L_0x01aa:
            java.lang.String r0 = "ig_self_profile_identity_sheet_avatar"
            goto L_0x003d
        L_0x01ae:
            java.lang.String r0 = "surface not recognized"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01b5:
            java.lang.String r0 = "surface is required"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46655Dia.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ProfileCoinFlipView A00(C46655Dia dia, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType) {
        View view;
        TabLayout tabLayout = dia.A02;
        if (tabLayout == null) {
            0qQ.A0F("tabLayout");
            throw AnonymousClass00P.createAndThrow();
        }
        C324746zp A072 = tabLayout.A07(updateProfilePicturePagerAdapter$UpdateProfileTabType.A00);
        if (A072 == null || (view = A072.A03) == null) {
            return null;
        }
        return (ProfileCoinFlipView) view.findViewById(R.id.profile_coin_flip_view);
    }

    public static final CircularImageView A01(C46655Dia dia, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType) {
        View view;
        TabLayout tabLayout = dia.A02;
        if (tabLayout == null) {
            0qQ.A0F("tabLayout");
            throw AnonymousClass00P.createAndThrow();
        }
        C324746zp A072 = tabLayout.A07(updateProfilePicturePagerAdapter$UpdateProfileTabType.A00);
        if (A072 == null || (view = A072.A03) == null) {
            return null;
        }
        return (CircularImageView) view.findViewById(R.id.profile_pic_imageview);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C46655Dia() {
        C51801G2k A002 = C51801G2k.A00(this, 25);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C51801G2k.A00(C51801G2k.A00(this, 28), 29));
        this.A05 = DbS.A0I(C51801G2k.A00(A003, 30), A002, new MMX(8, (Object) null, (Object) A003), DbS.A0z(C314336i2.class));
        this.A07 = C227642jf.A02(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A02(C46655Dia dia, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType, float f) {
        ? A012 = A01(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType);
        if (A012 != 0) {
            A012.setAlpha(f);
        }
        ProfileCoinFlipView A002 = A00(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType);
        if (A002 != null) {
            A002.setAlpha(f);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A03(C46655Dia dia, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType, float f) {
        ? A012 = A01(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType);
        if (A012 != 0) {
            A012.setScaleX(f);
            A012.setScaleY(f);
        }
        ProfileCoinFlipView A002 = A00(dia, updateProfilePicturePagerAdapter$UpdateProfileTabType);
        if (A002 != null) {
            A002.setScaleX(f);
            A002.setScaleY(f);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1930322295);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_update_profile_picture, viewGroup, false);
        AnonymousClass0fD.A09(-2117480929, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-869154359);
        C46655Dia.super.onPause();
        ViewPager2 viewPager2 = this.A01;
        if (viewPager2 == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        viewPager2.post(new C51162FpY(this));
        AnonymousClass0fD.A09(-786563059, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1606575649);
        super.onResume();
        ViewPager2 viewPager2 = this.A01;
        if (viewPager2 == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        viewPager2.post(new C51161FpX(this));
        AnonymousClass0fD.A09(-1936295833, A022);
    }
}
