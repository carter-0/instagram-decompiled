package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6xE  reason: invalid class name and case insensitive filesystem */
public final class C323276xE implements C323286xF, C230222pE {
    public AutoLaunchReelParams A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final UserDetailFragment A03;
    public final UserDetailTabController A04;
    public final UserDetailLaunchConfig A05;
    public final AnonymousClass32A A06;
    public final AnonymousClass0eM A07;
    public final Dda A08;
    public final 2Zg A09;
    public final String A0A;
    public final String A0B;

    public C323276xE(FragmentActivity fragmentActivity, UserSession userSession, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController, Dda dda, UserDetailLaunchConfig userDetailLaunchConfig, AnonymousClass32A r14, 2Zg r15, String str, String str2) {
        0qQ.A0B(r14, 7);
        this.A02 = userSession;
        this.A03 = userDetailFragment;
        this.A01 = fragmentActivity;
        this.A04 = userDetailTabController;
        this.A05 = userDetailLaunchConfig;
        this.A09 = r15;
        this.A06 = r14;
        this.A0A = str;
        this.A0B = str2;
        this.A08 = dda;
        AnonymousClass9LD r6 = new AnonymousClass9LD(this, 7);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LD(new AnonymousClass9LD(userDetailFragment, 8), 9));
        this.A07 = new C227862kA(new AnonymousClass9LD(A002, 10), r6, new C377419Lt(49, (Object) null, A002), new 0Yh(C2614949u.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.DcE.A00(r12.A02) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r13, com.instagram.avatars.coinflip.ProfileCoinFlipView r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, float r18, boolean r19, boolean r20) {
        /*
            r12 = this;
            r0 = 0
            r1 = r15
            X.0qQ.A0B(r15, r0)
            r0 = 1
            r2 = r16
            X.0qQ.A0B(r2, r0)
            if (r14 == 0) goto L_0x0016
            com.instagram.common.session.UserSession r0 = r12.A02
            boolean r0 = X.DcE.A00(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r6 = 0
        L_0x0017:
            com.instagram.common.session.UserSession r9 = r12.A02
            boolean r0 = X.DcE.A04(r9)
            if (r0 == 0) goto L_0x0065
            X.C46447Df9.A03()
            java.lang.String r4 = "ig_self_profile"
            r0 = r13
            r3 = r17
            r5 = r18
            r7 = r19
            r8 = r20
            X.E3r r0 = X.C48372EdT.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r11 = "avatar_coin_flip_customization"
            android.os.Bundle r8 = r0.mArguments
            if (r8 == 0) goto L_0x0065
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r10 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r7 = r12.A01
            X.6W8 r6 = new X.6W8
            r6.<init>(r7, r8, r9, r10, r11)
            r5 = 1111(0x457, float:1.557E-42)
            if (r14 == 0) goto L_0x0066
            boolean r0 = X.DcE.A00(r9)
            if (r0 == 0) goto L_0x0066
            com.instagram.profile.fragment.UserDetailFragment r4 = r12.A03
            com.instagram.avatars.coinflip.CoinFlipAvatarImageView r1 = r14.A01
            java.lang.String r0 = "avatarTransition"
            X.34S r3 = new X.34S
            r3.<init>(r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r14.A02
            java.lang.String r1 = "backgroundTransition"
            X.34S r0 = new X.34S
            r0.<init>(r2, r1)
            X.34S[] r0 = new X.AnonymousClass34S[]{r3, r0}
            r6.A0B(r7, r4, r0, r5)
        L_0x0065:
            return
        L_0x0066:
            com.instagram.profile.fragment.UserDetailFragment r0 = r12.A03
            r6.A0D(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323276xE.A03(com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse, com.instagram.avatars.coinflip.ProfileCoinFlipView, java.lang.String, java.lang.String, java.lang.String, float, boolean, boolean):void");
    }

    public final void Cpa(User user) {
        UserSession userSession = this.A02;
        C254773t1 A002 = C69862NtQ.A00(userSession, user);
        UserDetailFragment userDetailFragment = this.A03;
        1pE A012 = 1pE.A01(userDetailFragment.requireActivity(), userDetailFragment, userSession, "inbox_active_now_tab");
        A012.A0B = A002;
        A012.A0q = true;
        A012.A01 = userDetailFragment;
        A012.A11 = false;
        A012.A0v = true;
        A012.A06();
    }

    public final void D2F(ProfileCoinFlipView profileCoinFlipView) {
        ProfileCoinFlipView profileCoinFlipView2 = profileCoinFlipView;
        0qQ.A0B(profileCoinFlipView, 0);
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A03.A0B;
        if (avatarCoinFlipConfig != null) {
            AvatarCoinFlipSticker avatarCoinFlipSticker = avatarCoinFlipConfig.A05;
            AvatarCoinFlipSticker avatarCoinFlipSticker2 = avatarCoinFlipConfig.A06;
            A03(avatarCoinFlipConfig.A04, profileCoinFlipView2, avatarCoinFlipSticker.A03, avatarCoinFlipSticker2.A03, avatarCoinFlipConfig.A07, avatarCoinFlipSticker.A00, avatarCoinFlipConfig.A03, avatarCoinFlipConfig.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r13.A05(r5) != false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D2v(android.graphics.RectF r15, X.AnonymousClass70G r16, X.C319896rP r17, com.instagram.user.model.User r18) {
        /*
            r14 = this;
            r0 = 0
            r12 = r16
            X.0qQ.A0B(r12, r0)
            r2 = 1
            com.instagram.common.session.UserSession r5 = r14.A02
            com.instagram.profile.fragment.UserDetailFragment r4 = r14.A03
            com.instagram.profile.fragment.UserDetailTabController r0 = r14.A04
            X.6vu r0 = r0.A0P
            com.instagram.user.model.User r3 = r0.A0J
            if (r3 == 0) goto L_0x00aa
            java.lang.String r1 = r5.A06
            java.lang.String r0 = r3.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x009a
            X.6rY r6 = X.C319986rY.SELF
        L_0x0021:
            r15 = r18
            java.lang.String r8 = r15.getId()
            java.lang.String r9 = r14.A0A
            java.lang.String r10 = r14.A0B
            java.lang.String r7 = "tap_profile_pic"
            java.lang.String r11 = "user_profile_header"
            X.C319976rX.A08(r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = r17
            if (r17 == 0) goto L_0x003d
            boolean r0 = r13.A05(r5)
            r1 = 0
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r1 = 1
        L_0x003e:
            boolean r0 = r4.A15()
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r15.A1n()
            if (r0 == 0) goto L_0x00ae
            if (r1 == 0) goto L_0x00ae
            boolean r0 = r15.A1Y()
            if (r0 == 0) goto L_0x0065
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318136081127302(0x81072700051786, double:3.031073726876198E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0065
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r0 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB
            A01(r0, r14)
        L_0x0064:
            return
        L_0x0065:
            android.content.Context r11 = r4.getContext()
            if (r11 == 0) goto L_0x0064
            r0 = 2131952341(0x7f1302d5, float:1.9541122E38)
            java.lang.String r1 = r11.getString(r0)
            r0 = 2131952405(0x7f130315, float:1.9541252E38)
            java.lang.String r0 = r11.getString(r0)
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[]{r1, r0}
            X.8ab r0 = new X.8ab
            r0.<init>((android.content.Context) r11)
            r0.A0l(r4, r5)
            X.FIm r10 = new X.FIm
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.A0e(r10, r1)
            r0.A0s(r2)
            android.app.Dialog r0 = r0.A02()
            X.AnonymousClass0fN.A00(r0)
            return
        L_0x009a:
            X.2f1 r0 = X.AnonymousClass2f1.A00(r5)
            com.instagram.user.model.FollowStatus r1 = r0.A0N(r3)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r1 != r0) goto L_0x00aa
            X.6rY r6 = X.C319986rY.FOLLOWING
            goto L_0x0021
        L_0x00aa:
            X.6rY r6 = X.C319986rY.NOT_FOLLOWING
            goto L_0x0021
        L_0x00ae:
            A02(r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323276xE.D2v(android.graphics.RectF, X.70G, X.6rP, com.instagram.user.model.User):void");
    }

    public final void D5N(View view, View view2, C68209N5y n5y, String str, String str2, boolean z) {
        new C72363P3c(this.A02, this.A01).DUZ(C71047OaP.A00(view, view2, (C68209N5y) null, (String) null, (String) null, (String) null, (String) null, false, true, false, false));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.WNI, java.lang.Object, X.4bz] */
    public final void DN4(Reel reel, AnonymousClass3N3 r21, List list) {
        String str;
        String str2;
        String str3;
        AnonymousClass3BQ r13;
        AnonymousClass3N3 r14 = r21;
        View AeY = r14.AeY();
        C16165Upq upq = new C16165Upq((Activity) this.A01, AeY, (C230222pE) this);
        if (!0nA.A0F(AeY).equals(upq.A00.C4O())) {
            upq.A0D(0nA.A0F(AeY));
        }
        AnonymousClass32A r11 = this.A06;
        r11.A0C = this.A03.A1M.A04;
        C322486vu r2 = this.A04.A0P;
        User user = r2.A0J;
        if (user != null) {
            str = user.getId();
        } else {
            str = this.A05.A0O;
            if (str == null) {
                str = "INVALID_USER_ID";
            }
        }
        ? obj = new Object();
        obj.A00 = str;
        r11.A01 = obj;
        r11.A05 = upq;
        List list2 = list;
        boolean z = false;
        if (list2.size() >= 2) {
            z = true;
        }
        r11.A0F = z;
        AnonymousClass32D r1 = new AnonymousClass32D();
        User user2 = r2.A0J;
        if (user2 != null) {
            str2 = user2.getId();
        } else {
            str2 = this.A05.A0O;
            if (str2 == null) {
                str2 = "INVALID_USER_ID";
            }
        }
        r1.A02 = str2;
        r11.A03 = new ReelViewerConfig(r1);
        AutoLaunchReelParams autoLaunchReelParams = this.A00;
        if (autoLaunchReelParams != null) {
            str3 = autoLaunchReelParams.A03;
            r11.A0G = autoLaunchReelParams.A05;
            r11.A0I = autoLaunchReelParams.A08;
            r11.A0H = autoLaunchReelParams.A06;
            r11.A0A = autoLaunchReelParams.A02;
            if (str3 != null) {
                r13 = AnonymousClass3BQ.PUSH_NOTIFICATION;
            }
            r13 = AnonymousClass3BQ.PROFILE;
        } else {
            str3 = null;
            r13 = AnonymousClass3BQ.PROFILE;
        }
        UserSession userSession = this.A02;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36328027390819193L);
        List A0U = 1OP.A05(userSession).A0U(true);
        ArrayList arrayList = new ArrayList();
        for (Object next : A0U) {
            Reel reel2 = (Reel) next;
            if (!reel2.A16(userSession) && !reel2.A0f() && !reel2.A0e() && !list2.contains(reel2)) {
                arrayList.add(next);
            }
        }
        Reel reel3 = reel;
        if (!A062 || arrayList.size() < 5) {
            r11.A04(reel3, r13, r14, str3, list2, list2, list2);
        } else {
            ArrayList arrayList2 = new ArrayList(list2);
            Reel reel4 = new Reel(AnonymousClass05K.A0N, (List) null, arrayList);
            reel4.A1B = false;
            arrayList2.add(reel4);
            arrayList2.addAll(arrayList);
            r11.A04(reel3, r13, r14, str3, arrayList2, arrayList2, arrayList2);
        }
        this.A00 = null;
    }

    public final void DUU(C279864zZ r20) {
        UserSession userSession = this.A02;
        AnonymousClass4AB A002 = AnonymousClass911.A00(r20, userSession, (Integer) null, -1, 0, false, false, false, false, false, false, false, false);
        C319726r6 r2 = C319726r6.NOTE_BUBBLE;
        if (!0qQ.A0K(A002.A0A.getId(), 0eE.A00(userSession).A00().getId()) && C71147Oe5.A05(userSession, A002)) {
            C3018660j.A01(userSession).A0I(r2, A002);
            for (AnonymousClass913 BWY : A002.A0J) {
                long parseLong = Long.parseLong(BWY.BWY().A0H);
                if (A002.A0E != null) {
                    ((C2614949u) this.A07.getValue()).A04(parseLong);
                } else {
                    ((C2614949u) this.A07.getValue()).A02(parseLong);
                    C3018660j.A01(userSession).A0E(C69506Nmo.A0O, (GT1) null, HOK.DOUBLE_TAP, (Boolean) null, true, (Long) null, "❤️", "profile");
                }
            }
        }
    }

    public final void DUY(C279864zZ r19, String str, String str2) {
        C71147Oe5 oe5 = C71147Oe5.A00;
        UserSession userSession = this.A02;
        UserDetailFragment userDetailFragment = this.A03;
        oe5.A09(userDetailFragment, (NotePogVideoDict) null, r19, userDetailFragment, userSession, new C72370P3j(this), (Integer) null, (String) null, (String) null, false, false, false, false, true, false, false);
    }

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    private final void A00() {
        2Zg r3 = this.A09;
        if (r3 != null) {
            r3.FLD(new PositionConfig((AnonymousClass57C) null, C358098aM.A00(AnonymousClass9QA.A00, new C358088aL[0]), (AnonymousClass3QO) null, "profile_picture_tap_on_self_profile", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1.0f, 0, true));
        }
    }

    public static final void A01(UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType, C323276xE r8) {
        UserSession userSession = r8.A02;
        if (C324536zU.A00(userSession)) {
            FFO.A02(r8.A01, userSession, "edit_photo_and_avatar");
            return;
        }
        new C331127Pr(userSession).A00().A02(r8.A01, C48367EdO.A00(updateProfilePicturePagerAdapter$UpdateProfileTabType, userSession, "ig_self_profile", r8.A03.A1X, true, true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r8.A1n() != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (X.C14168Tr6.A00(r2, !r8.A1n(), X.2R8.A04(r2, r8)) != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r3 != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r1 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.DcE.A02(r2) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r6.A05(r2) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass70G r5, X.C319896rP r6, X.C323276xE r7, com.instagram.user.model.User r8) {
        /*
            com.instagram.common.session.UserSession r2 = r7.A02
            X.0Tu r3 = X.0Tu.A05
            r0 = 36315400186694823(0x8104aa00010ca7, double:3.0293435362205355E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r4 = 0
            if (r0 != 0) goto L_0x0022
            r0 = 36315400187022504(0x8104aa00060ca8, double:3.029343536427762E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x0022
            boolean r0 = X.DcE.A02(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            if (r6 == 0) goto L_0x002c
            boolean r0 = r6.A05(r2)
            r3 = 1
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            boolean r0 = X.2R8.A04(r2, r8)
            if (r0 != 0) goto L_0x0079
            if (r1 == 0) goto L_0x004c
            boolean r0 = r8.A1n()
            if (r0 == 0) goto L_0x004b
        L_0x003b:
            boolean r0 = r8.A1n()
            r1 = r0 ^ 1
            boolean r0 = X.2R8.A04(r2, r8)
            boolean r0 = X.C14168Tr6.A00(r2, r1, r0)
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r4 = 1
        L_0x004c:
            boolean r0 = X.2R8.A04(r2, r8)
            if (r0 == 0) goto L_0x005c
            if (r3 != 0) goto L_0x005e
            X.2Zg r0 = r7.A09
            if (r0 == 0) goto L_0x005b
            r7.A00()
        L_0x005b:
            return
        L_0x005c:
            if (r3 == 0) goto L_0x006f
        L_0x005e:
            if (r6 == 0) goto L_0x006f
            java.util.ArrayList r1 = r6.A02(r2)
            com.instagram.model.reels.Reel r0 = r6.A01(r2)
            X.0qQ.A07(r0)
            r7.DN4(r0, r5, r1)
            return
        L_0x006f:
            if (r4 == 0) goto L_0x005b
            com.instagram.profile.fragment.UserDetailFragment r1 = r7.A03
            X.6tJ r0 = X.C320946tJ.PROFILE_PICTURE
            r1.A0u(r0)
            return
        L_0x0079:
            if (r1 == 0) goto L_0x004c
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323276xE.A02(X.70G, X.6rP, X.6xE, com.instagram.user.model.User):void");
    }

    public final void CyC(User user) {
        C69980NvK.A00(this.A03, this.A02);
    }

    public final void D2G() {
        this.A03.A0u(C320946tJ.AVATAR);
    }

    public final void DFj(Reel reel, AnonymousClass6UY r3) {
        this.A04.A0F();
    }

    public final void DP8(User user) {
        if (2R8.A04(this.A02, user)) {
            A01(UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_AVATAR_TAB, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (X.2R8.A04(r3, r11) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r2 = X.AnonymousClass36X.IG_PROFILE_PHOTO_LONG_PRESS;
        X.AnonymousClass36O.A0B = r2;
        X.00y.A0n(10, r3.A06);
        X.C46653DiY.A00(r2, r3, "profile_picture_long_clicked", "photo_editing", (java.lang.String) null, (java.lang.String) null, (java.util.Map) null);
        A01(com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r11.A1n() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (X.DcE.A02(r3) != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (X.C14168Tr6.A00(r3, !r11.A1n(), X.2R8.A04(r3, r11)) != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r9.A03.A0u(X.C320946tJ.PROFILE_PICTURE);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DPK(X.C319896rP r10, com.instagram.user.model.User r11) {
        /*
            r9 = this;
            com.instagram.common.session.UserSession r3 = r9.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315400186694823(0x8104aa00010ca7, double:3.0293435362205355E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0021
            r0 = 36315400187022504(0x8104aa00060ca8, double:3.029343536427762E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0021
            boolean r0 = X.DcE.A02(r3)
            r2 = 0
            if (r0 == 0) goto L_0x003a
        L_0x0021:
            r2 = 1
            boolean r0 = r11.A1n()
            r1 = r0 ^ 1
            boolean r0 = X.2R8.A04(r3, r11)
            boolean r0 = X.C14168Tr6.A00(r3, r1, r0)
            if (r0 == 0) goto L_0x003a
        L_0x0032:
            com.instagram.profile.fragment.UserDetailFragment r1 = r9.A03
            X.6tJ r0 = X.C320946tJ.PROFILE_PICTURE
            r1.A0u(r0)
        L_0x0039:
            return
        L_0x003a:
            boolean r0 = X.2R8.A04(r3, r11)
            if (r0 == 0) goto L_0x005b
            X.36X r2 = X.AnonymousClass36X.IG_PROFILE_PHOTO_LONG_PRESS
            X.AnonymousClass36O.A0B = r2
            java.lang.String r1 = r3.A06
            r0 = 10
            X.00y.A0n(r0, r1)
            r6 = 0
            java.lang.String r4 = "profile_picture_long_clicked"
            java.lang.String r5 = "photo_editing"
            r7 = r6
            r8 = r6
            X.C46653DiY.A00(r2, r3, r4, r5, r6, r7, r8)
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r0 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB
            A01(r0, r9)
            return
        L_0x005b:
            if (r2 == 0) goto L_0x0039
            boolean r0 = r11.A1n()
            if (r0 != 0) goto L_0x0039
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323276xE.DPK(X.6rP, com.instagram.user.model.User):void");
    }

    public final void Da9() {
        C2366634p r0;
        Dda dda = this.A08;
        if (dda != null && (r0 = dda.A06) != null) {
            r0.A01();
        }
    }

    public final void DaA(boolean z) {
        C2366634p r2;
        Dda dda = this.A08;
        if (dda != null && (r2 = dda.A06) != null) {
            r2.A01.A0K("has_profile_pic_animation", z);
            r2.A05();
        }
    }

    public final void DaC() {
        C2366634p r0;
        Dda dda = this.A08;
        if (dda != null && (r0 = dda.A01) != null) {
            r0.A05();
        }
    }

    public final void A04(AutoLaunchReelParams autoLaunchReelParams) {
        this.A00 = autoLaunchReelParams;
    }

    public final void DXu(User user) {
        A00();
    }
}
