package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.config.MediaKitConfig;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class FV7 implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "UserOptionsOverflowHelper";
    public final Context A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final AnonymousClass07i A03;
    public final AnonymousClass4DH A04;
    public final AnonymousClass0iw A05;
    public final 0wc A06;
    public final UserSession A07;
    public final C323206x7 A08;
    public final AnonymousClass6ST A09;
    public final G7P A0A = new C51030FnM(this);
    public final F3J A0B;
    public final User A0C;
    public final G8B A0D = new C51051Fnh(this, 2);
    public final C267694c3 A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final Resources A0I;
    public final 1Xl A0J;
    public final UserDetailTabController A0K;
    public final C74489Pvj A0L = new C48057EUb(this, 6);
    public final String A0M;
    public final String A0N;
    public final List A0O;

    public FV7(Context context, FragmentActivity fragmentActivity, AnonymousClass07i r25, AnonymousClass4DH r26, AnonymousClass0iw r27, 0wc r28, UserSession userSession, 1Xl r30, C323206x7 r31, UserDetailTabController userDetailTabController, User user, C267694c3 r34, String str, String str2, String str3, String str4) {
        EWQ[] ewqArr;
        EWQ ewq;
        EWQ ewq2;
        Context context2 = context;
        0qQ.A0B(context2, 2);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 4);
        User user2 = user;
        0qQ.A0B(user2, 5);
        AnonymousClass07i r10 = r25;
        0qQ.A0B(r10, 10);
        0wc r5 = r28;
        0qQ.A0B(r5, 11);
        this.A02 = fragmentActivity;
        this.A00 = context2;
        AnonymousClass4DH r1 = r26;
        this.A04 = r1;
        this.A07 = userSession2;
        this.A0C = user2;
        this.A0K = userDetailTabController;
        this.A0E = r34;
        this.A05 = r27;
        this.A08 = r31;
        this.A03 = r10;
        this.A06 = r5;
        this.A0N = str;
        this.A0J = r30;
        this.A0F = str2;
        this.A0G = str3;
        this.A0H = str4;
        Context requireContext = r1.requireContext();
        this.A01 = requireContext;
        Resources A052 = DbV.A05(r1);
        0qQ.A07(A052);
        this.A0I = A052;
        this.A0B = new F3J(r1, userSession2);
        AnonymousClass6ST r12 = new AnonymousClass6ST(requireContext, true);
        DbX.A15(r12.getContext(), r12);
        this.A09 = r12;
        0Tu r122 = 0Tu.A05;
        if (182.A06(r122, userSession2, 36326803325073384L)) {
            ewqArr = new EWQ[16];
            ewqArr[0] = EWQ.A0A;
            ewqArr[1] = EWQ.A07;
            ewqArr[2] = EWQ.A0I;
            ewqArr[3] = EWQ.A09;
            ewqArr[4] = EWQ.A08;
            ewqArr[5] = EWQ.A04;
            ewqArr[6] = EWQ.A0H;
            ewqArr[7] = EWQ.A0C;
            ewqArr[8] = EWQ.A0B;
            ewqArr[9] = EWQ.A0J;
            ewqArr[10] = EWQ.A0G;
            ewqArr[11] = EWQ.A06;
            ewqArr[12] = EWQ.A0D;
            ewqArr[13] = EWQ.A0F;
            ewqArr[14] = EWQ.A05;
            ewq2 = EWQ.A0E;
        } else {
            ewqArr = new EWQ[16];
            if (182.A06(r122, userSession2, 36324634366324929L)) {
                ewqArr[0] = EWQ.A0F;
                ewqArr[1] = EWQ.A05;
                ewqArr[2] = EWQ.A0E;
                ewqArr[3] = EWQ.A04;
                ewqArr[4] = EWQ.A0H;
                ewqArr[5] = EWQ.A0B;
                ewqArr[6] = EWQ.A06;
                ewqArr[7] = EWQ.A0D;
                ewqArr[8] = EWQ.A07;
                ewqArr[9] = EWQ.A0A;
                ewqArr[10] = EWQ.A0I;
                ewq = EWQ.A09;
            } else {
                ewqArr[0] = EWQ.A0E;
                ewqArr[1] = EWQ.A05;
                ewqArr[2] = EWQ.A04;
                ewqArr[3] = EWQ.A0B;
                ewqArr[4] = EWQ.A0F;
                ewqArr[5] = EWQ.A0H;
                ewqArr[6] = EWQ.A06;
                ewqArr[7] = EWQ.A0D;
                ewqArr[8] = EWQ.A07;
                ewqArr[9] = EWQ.A0I;
                ewqArr[10] = EWQ.A09;
                ewq = EWQ.A0A;
            }
            ewqArr[11] = ewq;
            ewqArr[12] = EWQ.A08;
            ewqArr[13] = EWQ.A0C;
            ewqArr[14] = EWQ.A0J;
            ewq2 = EWQ.A0G;
        }
        ewqArr[15] = ewq2;
        this.A0O = 0sr.A1P(ewqArr);
        this.A0M = "UserOptionsDialog";
    }

    public final void A04(EWQ ewq) {
        AnonymousClass710 BhL;
        C46649DiU diU;
        FragmentActivity fragmentActivity;
        IgBloksScreenConfig igBloksScreenConfig;
        switch (DbU.A02(ewq, 0)) {
            case 0:
                1Z4 r2 = 1Z4.A00;
                Context context = this.A00;
                UserSession userSession = this.A07;
                FragmentActivity fragmentActivity2 = this.A02;
                String moduleName = this.A05.getModuleName();
                String str = this.A0F;
                User user = this.A0C;
                r2.A00(context, fragmentActivity2, userSession, user, this.A0D, moduleName, str, user.getUsername());
                return;
            case 1:
                this.A0B.A01(this.A0A, this.A0C, "profile", true, false);
                return;
            case 2:
                A01(this, "copy_profile_url");
                FragmentActivity fragmentActivity3 = this.A02;
                0hq r8 = this.A04.mFragmentManager;
                User user2 = this.A0C;
                C46395DeI.A04(fragmentActivity3, (View) null, r8, this.A03, this, this.A07, user2, (Long) null, "profile_action_sheet", this.A0G, this.A0H, (String) null, false);
                return;
            case 3:
                User user3 = this.A0C;
                String username = user3.getUsername();
                Fragment fragment = this.A04;
                FragmentActivity requireActivity = fragment.requireActivity();
                0hq parentFragmentManager = fragment.getParentFragmentManager();
                0gy A002 = AnonymousClass07i.A00(fragment);
                UserSession userSession2 = this.A07;
                String A0k = AnonymousClass7TF.A0k(002.A0D(username, '@'));
                String str2 = this.A0G;
                String str3 = this.A0H;
                boolean booleanValue = AnonymousClass7TF.A0R(0Tu.A05, userSession2, 36314859024616287L).booleanValue();
                C46395DeI.A0A(requireActivity, parentFragmentManager, A002, new FT6(userSession2, requireActivity, user3, fragment, A0k, 0, booleanValue), fragment, userSession2, user3, DbT.A0l(booleanValue), (Long) null, "profile_action_sheet", "qr_code", str2, str3, false);
                return;
            case 4:
                C323206x7 r0 = this.A08;
                if (r0 != null && (BhL = r0.BhL()) != null) {
                    BhL.DRV("more_menu", false);
                    return;
                }
                return;
            case 5:
                A01(this, "tap_share_this_profile");
                0xI A003 = 0xI.A00(this.A04, C273654mx.A00(43));
                User user4 = this.A0C;
                A003.A0C(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user4.getId());
                A003.A0C("nav_chain", DbS.A0k());
                UserSession userSession3 = this.A07;
                DbU.A1R(A003, userSession3);
                C49731F3w A072 = 1as.A04.A02.A07(this.A05, userSession3, 2FW.A1O);
                A072.A06(user4.getId());
                if (user4.A1x()) {
                    A072.A07.putSerializable(Pxd.A00(145), 28D.A0b);
                }
                DirectShareSheetFragment A004 = A072.A00();
                AnonymousClass37D A022 = AnonymousClass37D.A00.A02(this.A01);
                if (A022 != null) {
                    A022.A0J(A004);
                    return;
                }
                return;
            case 6:
                UserSession userSession4 = this.A07;
                String id = this.A0C.getId();
                C49383Eul eul = new C49383Eul(this);
                AnonymousClass0fN.A00(eul.A00.A09);
                1NY A0a = AnonymousClass7TG.A0a(userSession4);
                A0a.A0K("direct_v2/whitelist/%s/", new Object[]{id});
                1OC A0S = DbU.A0S(A0a, 1XP.class, 1XY.class);
                A0S.A00 = new C47370Dwg(userSession4, eul, id);
                1ES.A03(A0S);
                return;
            case 7:
                A02(this, false);
                return;
            case 8:
                Integer num = AnonymousClass05K.A01;
                UserSession userSession5 = this.A07;
                F8R.A01(this, userSession5, num);
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("shared_user_id", this.A0C.getId());
                diU = C46649DiU.A04("com.bloks.www.ig.bloks.your_shared_activity.entry", A1E);
                fragmentActivity = this.A01;
                igBloksScreenConfig = DbS.A0N(userSession5);
                igBloksScreenConfig.A0U = DbU.A0m(this.A04, 2131973612);
                break;
            case 9:
                A01(this, "remove_follower");
                0wc r3 = this.A06;
                User user5 = this.A0C;
                DbZ.A1S(r3, "remove_follower_dialog_impression", user5.getId());
                Context context2 = this.A00;
                FragmentActivity fragmentActivity4 = this.A02;
                UserSession userSession6 = this.A07;
                C49174Eqf.A00(fragmentActivity4, context2, this.A04, this.A05, userSession6, new C51032FnO(this, 1), user5);
                return;
            case 10:
                User user6 = this.A0C;
                String id2 = user6.getId();
                boolean isRestricted = user6.isRestricted();
                1YZ r4 = 1YZ.A02;
                if (r4 != null) {
                    0wc r6 = this.A06;
                    if (isRestricted) {
                        AnonymousClass73V.A0G(r6, "click", "unrestrict_option", id2);
                        r4.A02(this.A02, this.A03, this.A07, new C51089FoJ(this, id2), id2, this.A05.getModuleName());
                        return;
                    }
                    AnonymousClass73V.A0G(r6, "click", "restrict_option", id2);
                    C56541I0s A005 = r4.A00();
                    UserSession userSession7 = this.A07;
                    Context context3 = this.A00;
                    String moduleName2 = this.A05.getModuleName();
                    C48088EVg eVg = C48088EVg.PROFILE_OVERFLOW;
                    String str4 = this.A0F;
                    A005.A00(context3, (C3263576k) null, (C69445Nlp) null, r6, userSession7, user6, new C51096FoQ(this), eVg, new C51100FoU(this, id2), moduleName2, str4);
                    return;
                }
                return;
            case 11:
                A01(this, "about_this_account");
                HashMap A1E2 = AnonymousClass7TE.A1E();
                A1E2.put("target_user_id", this.A0C.getId());
                A1E2.put("referer_type", "ProfileMore");
                diU = C46649DiU.A04(AnonymousClass000.A00(45), A1E2);
                fragmentActivity = this.A02;
                igBloksScreenConfig = DbS.A0N(this.A07);
                DbS.A18(this.A00, igBloksScreenConfig, 2131952054);
                igBloksScreenConfig.A0R = "account_transparency_bloks";
                igBloksScreenConfig.A0P = AnonymousClass05K.A01;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(this, "manage_notifications");
                C46447Df9.A03().A01(this.A02, this.A07, (C273414mX) null, this.A0C, (String) null);
                return;
            case 13:
                JSONObject A11 = DbS.A11();
                try {
                    User user7 = this.A0C;
                    A11.put("business_owner_igid", user7.getId());
                    A11.put("source", user7.A03.BoY());
                    A11.put("delivery_method", "profile");
                } catch (JSONException unused) {
                    0wb.A03("UserOptionDialogClickListener.handleLeaveAReview", "JSON error");
                }
                String A10 = DbT.A10(A11);
                C309516Yo A0M2 = DbS.A0M(this.A02, this.A07);
                A0M2.A0D(IgFragmentFactoryImpl.A00().A02(AnonymousClass000.A00(1602), A10));
                A0M2.A04();
                return;
            case 14:
                Map A0w = AnonymousClass7TF.A0w(C66579MXk.A00(164), this.A0C.getId());
                AnonymousClass4DH r32 = this.A04;
                C360678ey A052 = C359988do.A05(this.A07, "com.instagram.branded_content.wishlists.creator_lists_selector_bottom_sheet", A0w);
                E84.A00(A052, this, 13);
                r32.schedule(A052);
                return;
            case 15:
                User user8 = this.A0C;
                if (user8.A03.Avu() != null) {
                    AnonymousClass1ZZ.A00().E18(this.A02, this.A07, new MediaKitConfig(MediaKitEntryPoint.PROFILE, user8.A03.Avu(), (String) null));
                    return;
                }
                return;
            default:
                throw AnonymousClass7TE.A1K();
        }
        diU.A0D(fragmentActivity, igBloksScreenConfig);
    }

    public static final void A00(FV7 fv7) {
        if (1Wj.A00 != null) {
            DcL.A00().A00(fv7.A02, fv7.A07, "985297752732769", C70342O2u.A00(fv7.A0C.getId()));
        }
    }

    public static final void A01(FV7 fv7, String str) {
        UserSession userSession = fv7.A07;
        AnonymousClass4DH r1 = fv7.A04;
        User user = fv7.A0C;
        C319976rX.A06(r1, userSession, DbV.A0e(user), str, user.getId(), "more_menu");
    }

    public static final void A02(FV7 fv7, boolean z) {
        String str;
        UserSession userSession = fv7.A07;
        C71093OcF A012 = ORV.A01(fv7.A02, fv7.A05, userSession, C14068TpH.PROFILE, C16677UzD.USER, fv7.A0C.getId());
        A012.A07(fv7.A0L);
        A012.A08("shopping_session_id", fv7.A0N);
        if (z) {
            str = "profile_block";
        } else {
            str = "";
        }
        A012.A08("nua_action", str);
        1Xl r2 = fv7.A0J;
        String str2 = null;
        if (!(r2 == null || r2.BPf() == null)) {
            str2 = r2.BPf().getId();
        }
        A012.A08("profile_media_attribution", str2);
        A012.A06();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fd, code lost:
        r0 = X.182.A06(r5, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0113, code lost:
        if (r0 == null) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0115, code lost:
        r0 = r0.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a2, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36326803325073384L) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c6, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36326803325073384L) != false) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x000a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A03() {
        /*
            r8 = this;
            java.util.List r0 = r8.A0O
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x000a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0165
            java.lang.Object r3 = r7.next()
            r0 = r3
            X.EWQ r0 = (X.EWQ) r0
            int r0 = r0.ordinal()
            java.lang.String r1 = " "
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x0020;
                case 2: goto L_0x004a;
                case 3: goto L_0x0070;
                case 4: goto L_0x0084;
                case 5: goto L_0x00cb;
                case 6: goto L_0x010b;
                case 7: goto L_0x0028;
                case 8: goto L_0x00b1;
                case 9: goto L_0x011a;
                case 10: goto L_0x0024;
                case 11: goto L_0x0068;
                case 12: goto L_0x0121;
                case 13: goto L_0x0102;
                case 14: goto L_0x0130;
                case 15: goto L_0x014a;
                default: goto L_0x0020;
            }
        L_0x0020:
            r2.add(r3)
            goto L_0x000a
        L_0x0024:
            X.1YZ r0 = X.1YZ.A02
            if (r0 == 0) goto L_0x000a
        L_0x0028:
            com.instagram.common.session.UserSession r5 = r8.A07
            X.0Tu r4 = X.0Tu.A05
            r0 = 2342167841149104529(0x20810d3e00093191, double:4.069682951583972E-152)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0020
            com.instagram.user.model.User r1 = r8.A0C
            boolean r0 = r1.A1X()
            if (r0 != 0) goto L_0x000a
            X.4Cl r0 = r1.A03
            com.instagram.api.schemas.IGAIAgentType r1 = r0.AaX()
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A05
            if (r1 == r0) goto L_0x000a
            goto L_0x0020
        L_0x004a:
            com.instagram.user.model.User r0 = r8.A0C
            java.lang.String r0 = r0.getUsername()
            boolean r0 = X.DbU.A1a(r0, r1)
            if (r0 != 0) goto L_0x000a
            com.instagram.common.session.UserSession r5 = r8.A07
            X.2FW r0 = X.2FW.A0G
            X.0Tu r4 = X.0Tu.A05
            r0 = 36314859023436628(0x81042c00290b54, double:3.0290013023969635E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0020
            goto L_0x000a
        L_0x0068:
            com.instagram.user.model.User r0 = r8.A0C
            boolean r0 = r0.A1h()
            goto L_0x0161
        L_0x0070:
            com.instagram.user.model.User r0 = r8.A0C
            java.lang.String r0 = r0.getUsername()
            boolean r0 = X.DbU.A1a(r0, r1)
            if (r0 != 0) goto L_0x000a
            com.instagram.common.session.UserSession r0 = r8.A07
            boolean r0 = X.C14290TtO.A00(r0)
            goto L_0x0161
        L_0x0084:
            X.6x7 r0 = r8.A08
            if (r0 == 0) goto L_0x000a
            com.instagram.user.model.User r6 = r8.A0C
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.Bld()
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r5 = r8.A07
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317126763483941(0x81063c00001325, double:3.0304354303343404E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00a9
            goto L_0x000a
        L_0x00a9:
            com.instagram.common.session.UserSession r0 = r8.A07
            boolean r0 = X.C324376zB.A01(r0, r6)
            goto L_0x0161
        L_0x00b1:
            com.instagram.user.model.User r4 = r8.A0C
            com.instagram.user.model.FollowStatus r1 = r4.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r1 == r0) goto L_0x00c1
            boolean r0 = r4.A2A()
            if (r0 == 0) goto L_0x000a
        L_0x00c1:
            com.instagram.common.session.UserSession r4 = r8.A07
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319093858507671(0x81080600001b97, double:3.031679429148203E-306)
            goto L_0x00fd
        L_0x00cb:
            com.instagram.common.session.UserSession r4 = r8.A07
            boolean r0 = X.C322606w6.A05(r4)
            if (r0 == 0) goto L_0x0020
            X.0Tu r5 = X.0Tu.A05
            r0 = 36327426095069606(0x810f9a000039a6, double:3.0369487691011945E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x00ed
            r0 = 36327426095659437(0x810f9a000939ad, double:3.036948769474206E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x00ed
            goto L_0x0020
        L_0x00ed:
            r0 = 36327426095069606(0x810f9a000039a6, double:3.0369487691011945E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x000a
            r0 = 36327426095724974(0x810f9a000a39ae, double:3.036948769515652E-306)
        L_0x00fd:
            boolean r0 = X.182.A06(r5, r4, r0)
            goto L_0x0161
        L_0x0102:
            com.instagram.user.model.User r0 = r8.A0C
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.Bve()
            goto L_0x0113
        L_0x010b:
            com.instagram.user.model.User r0 = r8.A0C
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.BXz()
        L_0x0113:
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.booleanValue()
            goto L_0x0161
        L_0x011a:
            com.instagram.user.model.User r0 = r8.A0C
            boolean r0 = r0.A2A()
            goto L_0x0161
        L_0x0121:
            com.instagram.user.model.User r0 = r8.A0C
            boolean r0 = r0.A29()
            if (r0 == 0) goto L_0x000a
            com.instagram.common.session.UserSession r0 = r8.A07
            boolean r0 = X.C322606w6.A05(r0)
            goto L_0x0161
        L_0x0130:
            com.instagram.common.session.UserSession r4 = r8.A07
            r0 = 36312995005072970(0x81027a0002064a, double:3.0278224896779866E-306)
            boolean r0 = X.AnonymousClass430.A03(r4, r0)
            if (r0 == 0) goto L_0x000a
            boolean r0 = X.JYR.A00(r4)
            if (r0 == 0) goto L_0x000a
            com.instagram.user.model.User r0 = r8.A0C
            boolean r0 = r0.A1S()
            goto L_0x0161
        L_0x014a:
            com.instagram.user.model.User r0 = r8.A0C
            X.4Cl r0 = r0.A03
            java.lang.String r0 = r0.Avu()
            if (r0 == 0) goto L_0x000a
            com.instagram.common.session.UserSession r5 = r8.A07
            X.0Tu r4 = X.0Tu.A05
            r0 = 36316289246564567(0x810579001a10d7, double:3.0299057812621184E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
        L_0x0161:
            if (r0 == 0) goto L_0x000a
            goto L_0x0020
        L_0x0165:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r6 = r2.iterator()
        L_0x016d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0287
            java.lang.Object r4 = r6.next()
            X.EWQ r4 = (X.EWQ) r4
            int r0 = r4.ordinal()
            switch(r0) {
                case 0: goto L_0x01fe;
                case 1: goto L_0x022e;
                case 2: goto L_0x0247;
                case 3: goto L_0x01a9;
                case 4: goto L_0x026a;
                case 5: goto L_0x01cd;
                case 6: goto L_0x026e;
                case 7: goto L_0x0185;
                case 8: goto L_0x022a;
                case 9: goto L_0x0243;
                case 10: goto L_0x021b;
                case 11: goto L_0x0213;
                case 12: goto L_0x01ef;
                case 13: goto L_0x0217;
                case 14: goto L_0x0276;
                case 15: goto L_0x0272;
                default: goto L_0x0180;
            }
        L_0x0180:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0185:
            com.instagram.common.session.UserSession r3 = r8.A07
            X.0Tu r2 = X.0Tu.A06
            r0 = 36324634366324929(0x810d10000030c1, double:3.0351832686016714E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x01a4
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326803325073384(0x810f09000437e8, double:3.03655492684789E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 2131972204(0x7f13506c, float:1.9581409E38)
            if (r0 == 0) goto L_0x0279
        L_0x01a4:
            r1 = 2131972171(0x7f13504b, float:1.9581342E38)
            goto L_0x0279
        L_0x01a9:
            com.instagram.common.session.UserSession r3 = r8.A07
            X.0Tu r2 = X.0Tu.A06
            r0 = 36324634366324929(0x810d10000030c1, double:3.0351832686016714E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x01c8
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326803325073384(0x810f09000437e8, double:3.03655492684789E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 2131971010(0x7f134bc2, float:1.9578987E38)
            if (r0 == 0) goto L_0x0279
        L_0x01c8:
            r1 = 2131971011(0x7f134bc3, float:1.957899E38)
            goto L_0x0279
        L_0x01cd:
            com.instagram.common.session.UserSession r3 = r8.A07
            boolean r0 = X.C322606w6.A02(r3)
            if (r0 == 0) goto L_0x01da
            r1 = 2131960301(0x7f1321ed, float:1.9557267E38)
            goto L_0x0279
        L_0x01da:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326803325073384(0x810f09000437e8, double:3.03655492684789E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 2131960325(0x7f132205, float:1.9557315E38)
            if (r0 == 0) goto L_0x0279
            r1 = 2131960326(0x7f132206, float:1.9557318E38)
            goto L_0x0279
        L_0x01ef:
            com.instagram.common.session.UserSession r0 = r8.A07
            boolean r0 = X.C322606w6.A05(r0)
            r1 = 2131965839(0x7f13378f, float:1.95685E38)
            if (r0 == 0) goto L_0x0279
            r1 = 2131970042(0x7f1347fa, float:1.9577024E38)
            goto L_0x0279
        L_0x01fe:
            com.instagram.user.model.User r0 = r8.A0C
            boolean r2 = r0.CPV()
            android.content.Context r1 = r8.A00
            r0 = 2131966159(0x7f1338cf, float:1.9569148E38)
            if (r2 == 0) goto L_0x020e
            r0 = 2131966172(0x7f1338dc, float:1.9569175E38)
        L_0x020e:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x027f
        L_0x0213:
            r1 = 2131952052(0x7f1301b4, float:1.9540536E38)
            goto L_0x0279
        L_0x0217:
            r1 = 2131964903(0x7f1333e7, float:1.95666E38)
            goto L_0x0279
        L_0x021b:
            com.instagram.user.model.User r0 = r8.A0C
            boolean r0 = r0.isRestricted()
            r1 = 2131972302(0x7f1350ce, float:1.9581608E38)
            if (r0 == 0) goto L_0x0279
            r1 = 2131975971(0x7f135f23, float:1.958905E38)
            goto L_0x0279
        L_0x022a:
            r1 = 2131973887(0x7f1356ff, float:1.9584822E38)
            goto L_0x0279
        L_0x022e:
            com.instagram.user.model.User r0 = r8.A0C
            android.content.res.Resources r2 = r8.A0I
            boolean r1 = r0.A1w()
            r0 = 2131966163(0x7f1338d3, float:1.9569156E38)
            if (r1 == 0) goto L_0x023e
            r0 = 2131966166(0x7f1338d6, float:1.9569162E38)
        L_0x023e:
            java.lang.String r0 = r2.getString(r0)
            goto L_0x027f
        L_0x0243:
            r1 = 2131972018(0x7f134fb2, float:1.9581032E38)
            goto L_0x0279
        L_0x0247:
            com.instagram.common.session.UserSession r3 = r8.A07
            com.instagram.user.model.User r0 = r8.A0C
            java.lang.String r2 = r0.getId()
            java.lang.String r1 = "profile_action_sheet"
            java.lang.String r0 = "copy_link"
            X.C22031Xty.A0E(r8, r3, r2, r1, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326803325073384(0x810f09000437e8, double:3.03655492684789E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 2131956753(0x7f131411, float:1.955007E38)
            if (r0 == 0) goto L_0x0279
            r1 = 2131956754(0x7f131412, float:1.9550073E38)
            goto L_0x0279
        L_0x026a:
            r1 = 2131959810(0x7f132002, float:1.955627E38)
            goto L_0x0279
        L_0x026e:
            r1 = 2131958517(0x7f131af5, float:1.9553648E38)
            goto L_0x0279
        L_0x0272:
            r1 = 2131970041(0x7f1347f9, float:1.9577022E38)
            goto L_0x0279
        L_0x0276:
            r1 = 2131954170(0x7f1309fa, float:1.9544832E38)
        L_0x0279:
            X.4DH r0 = r8.A04
            java.lang.String r0 = r0.getString(r1)
        L_0x027f:
            X.0qQ.A07(r0)
            X.DbU.A1W(r4, r0, r5)
            goto L_0x016d
        L_0x0287:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FV7.A03():java.util.List");
    }

    public final String getModuleName() {
        return this.A0M;
    }
}
