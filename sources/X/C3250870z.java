package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.profile.fragment.ProfileFollowRelationshipFragment;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.webrtc.CameraCapturer;

/* renamed from: X.70z  reason: invalid class name and case insensitive filesystem */
public final class C3250870z implements AnonymousClass710 {
    public Dc2 A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final AnonymousClass0iw A03;
    public final 0wc A04;
    public final UserSession A05;
    public final C323206x7 A06;
    public final UserDetailFragment A07;
    public final UserDetailTabController A08;
    public final Dc6 A09;
    public final String A0A;
    public final AnonymousClass47L A0B;
    public final C323246xB A0C;
    public final C231002qi A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;

    public final void D2Y(FollowStatus followStatus, User user) {
        String str;
        0qQ.A0B(user, 0);
        if (user.A0G() == FollowStatus.A05) {
            str = "following_sheet";
        } else {
            str = "button_tray";
        }
        D2b(user, str, true);
    }

    public final void D2b(User user, String str, boolean z) {
        UserDetailFragment userDetailFragment;
        1AA A022;
        View view;
        String str2;
        String str3;
        User user2 = user;
        FollowStatus A0G2 = user2.A0G();
        if (!user2.CPV()) {
            UserSession userSession = this.A05;
            UserDetailFragment userDetailFragment2 = this.A07;
            if (A0G2 == FollowStatus.A05) {
                str3 = "unfollow";
            } else {
                str3 = "follow";
            }
            C319986rY A012 = C319976rX.A01(A0G2);
            Dc6 dc6 = this.A09;
            String A032 = dc6.A03();
            String str4 = this.A0A;
            String str5 = this.A0F;
            UserDetailLaunchConfig userDetailLaunchConfig = dc6.A0B;
            C319976rX.A0A(userDetailFragment2, userSession, A012, str3, A032, str4, str5, userDetailLaunchConfig.A0D, userDetailLaunchConfig.A0E, str);
        }
        FollowStatus followStatus = FollowStatus.A06;
        if (A0G2 == followStatus && z && !CnA()) {
            this.A08.A0L(C322496vv.Open);
        }
        UserDetailLaunchConfig userDetailLaunchConfig2 = this.A09.A0B;
        String str6 = userDetailLaunchConfig2.A0G;
        if (str6 != null && !TextUtils.isEmpty(str6)) {
            UserSession userSession2 = this.A05;
            UserDetailFragment userDetailFragment3 = this.A07;
            String str7 = userDetailLaunchConfig2.A0D;
            String str8 = userDetailLaunchConfig2.A0E;
            FollowStatus B6o = user2.B6o();
            FollowStatus followStatus2 = FollowStatus.A05;
            if (B6o == followStatus2 || user2.B6o() == FollowStatus.A07) {
                0xI A002 = 0xI.A00(userDetailFragment3, "search_follow_button_clicked");
                A002.A0C("rank_token", str6);
                A002.A0C(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user2.getId());
                A002.A09("inline", false);
                if (user2.B6o() == followStatus2) {
                    str2 = "follow";
                } else {
                    str2 = "requested";
                }
                A002.A0C("follow_status", str2);
                if (str7 != null) {
                    A002.A0C("hashtag_id", str7);
                }
                if (str8 != null) {
                    A002.A0C("hashtag_name", str8);
                }
                C60510iO.A00(userSession2).EFq(A002);
            }
        }
        UserSession userSession3 = this.A05;
        if (AnonymousClass2f1.A00(userSession3).A0N(user2) == followStatus && user2.A0N() == AnonymousClass05K.A0C) {
            1OP.A05(userSession3).A0c(user2.getId());
            C322486vu r4 = this.A08.A0P;
            if (r4.A0E != null) {
                r4.A0E = null;
                r4.A00();
            }
        }
        if (A0G2 != FollowStatus.A05 || !user2.A2A()) {
            C49966FGz fGz = C49966FGz.A00;
            AnonymousClass0iw r11 = this.A03;
            userDetailFragment = this.A07;
            Context requireContext = userDetailFragment.requireContext();
            FragmentActivity requireActivity = userDetailFragment.requireActivity();
            if (AnonymousClass0t1.A01.A01(userSession3).A0N() == AnonymousClass05K.A0C && ((!C49966FGz.A05(userSession3) || !C49966FGz.A06(userSession3, fGz)) && user2.A0G() == followStatus && !user2.A2A() && !user2.A2L() && (A022 = 182.A02(userSession3, 36328207779183680L)) != null && A022.Ah0(0Tu.A04, 36328207779183680L) && C49966FGz.A00(userSession3, fGz) < 3)) {
                if (C49966FGz.A00(userSession3, fGz) == 0) {
                    1AA A023 = 182.A02(userSession3, 36891157732787083L);
                    String str9 = null;
                    if (A023 != null) {
                        0Tu A003 = 0Tu.A00(new 0Tu());
                        A003.A03 = true;
                        0Tu A004 = 0Tu.A00(A003);
                        A004.A01 = true;
                        str9 = A023.C1v(A004, 36891157732787083L);
                    }
                    if (str9 != null && str9.equals("bottomsheet_and_toast")) {
                        List singletonList = Collections.singletonList(user2);
                        0qQ.A07(singletonList);
                        C49966FGz.A01(requireActivity, requireContext, r11, userSession3, new Fc4(), singletonList);
                        C49966FGz.A04(userSession3, fGz);
                    }
                }
                C49966FGz.A02(requireContext, r11, userSession3, user2, true);
            }
        } else {
            Fd3 fd3 = new Fd3(this);
            C310336ap r42 = new C310336ap();
            userDetailFragment = this.A07;
            r42.A0D = userDetailFragment.requireContext().getString(2131972019, new Object[]{user2.getUsername()});
            r42.A09 = user2.Bh3();
            r42.A0B(C310356ar.CIRCULAR);
            r42.A0L = true;
            r42.A0A(fd3);
            String string = userDetailFragment.requireContext().getString(2131972017);
            0qQ.A07(string);
            r42.A0G = string;
            r42.A01 = CameraCapturer.OPEN_CAMERA_TIMEOUT;
            r42.A02 = userDetailFragment.requireContext().getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
            Dc2 A005 = r42.A00();
            this.A00 = A005;
            1xC.A01.A00(new AnonymousClass3GP(A005));
        }
        C324416zF r112 = userDetailFragment.A0l;
        if (r112 != null && (view = userDetailFragment.A03) != null && userDetailFragment.A19 != null) {
            User user3 = userDetailFragment.A10.A03;
            FragmentActivity requireActivity2 = userDetailFragment.requireActivity();
            0hq parentFragmentManager = userDetailFragment.getParentFragmentManager();
            AnonymousClass07i r7 = userDetailFragment.A08;
            UserSession userSession4 = userDetailFragment.A0I;
            0qQ.A0B(r7, 4);
            0qQ.A0B(userSession4, 6);
            if (user3 != null) {
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.ProfileExpandedPictureBinder.Holder");
                JVQ jvq = JVQ.A00;
                ViewGroup viewGroup = ((C324426zG) tag).A01;
                Context context = view.getContext();
                0qQ.A07(context);
                jvq.A00(viewGroup, C324416zF.A00(requireActivity2, context, parentFragmentManager, r7, userDetailFragment, userSession4, userDetailFragment, r112, userDetailFragment, user3));
            }
        }
    }

    public final void D2p(User user) {
    }

    public final void D39(User user) {
        UserSession userSession = this.A05;
        UserDetailFragment userDetailFragment = this.A07;
        C319986rY A002 = A00();
        Dc6 dc6 = this.A09;
        C319976rX.A08(userDetailFragment, userSession, A002, "share_profile_url", dc6.A03(), this.A0A, this.A0F, "button_tray");
        if (C322606w6.A02(userSession)) {
            Bundle bundle = new Bundle();
            bundle.putString("displayed_user_id", user.getId());
            C49080Eoy.A00(this.A02, bundle, userSession, dc6.A03(), false);
            return;
        }
        boolean A062 = 182.A06(0Tu.A05, userSession, 36314859023567702L);
        Bundle A003 = C343547qO.A00((RectF) null, EWD.PROFILE_ACTION_BAR_ICON, false);
        A003.putBoolean("NametagFragment.ARGUMENT_ENABLE_DOWNLOAD_QR", A062);
        FragmentActivity fragmentActivity = this.A02;
        AnonymousClass6W8 r3 = new AnonymousClass6W8(fragmentActivity, A003, userSession, TransparentModalActivity.class, "nametag");
        r3.A07();
        r3.A0C(fragmentActivity);
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
        1YZ r0;
        C56541I0s A002;
        0qQ.A0B(user, 0);
        0qQ.A0B(ewa, 1);
        if (EWA.UserActionUnblock == ewa && (r0 = 1YZ.A02) != null && (A002 = r0.A00()) != null) {
            A002.A01(this.A07, this.A04, this.A05, user);
        }
    }

    public final boolean DPN(User user) {
        UserSession userSession = this.A05;
        if (!182.A06(0Tu.A05, userSession, 36330630140740300L)) {
            return false;
        }
        FragmentActivity fragmentActivity = this.A02;
        Fragment fragment = this.A07;
        C46395DeI.A04(fragmentActivity, (View) null, fragment.mFragmentManager, AnonymousClass07i.A00(fragment), this.A03, userSession, user, (Long) null, "self_profile_nametag_view", (String) null, (String) null, 02K.A01(fragment.requireContext()).getString(2131965614), false);
        return true;
    }

    public final void Euj(View view) {
        UserDetailFragment userDetailFragment = this.A07;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null) {
            1Av A002 = 1Au.A00(userDetailFragment.A0I);
            String id = user.getId();
            0xa r4 = A002.A01;
            Set C1t = r4.C1t("long_press_follow_tooltip_shown_account_set");
            if (C1t.size() < 2 && !C1t.contains(id) && C319536ql.A03(view)) {
                UserSession userSession = userDetailFragment.A0I;
                0qQ.A0B(userSession, 0);
                if (AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A06 && (!FFT.A01(userSession, user).isEmpty())) {
                    AnonymousClass5Gv r1 = userDetailFragment.A0X;
                    if (r1 == null) {
                        r1 = C319536ql.A00(userDetailFragment.requireActivity(), view, C226262fy.BELOW_ANCHOR, userDetailFragment.getString(2131965615));
                        userDetailFragment.A0X = r1;
                    }
                    if (!UserDetailFragment.A0i(userDetailFragment)) {
                        r1.A07(userDetailFragment.A0I);
                        Set A0j = 00k.A0j(r4.C1t("long_press_follow_tooltip_shown_account_set"));
                        A0j.add(id);
                        0xY AR4 = r4.AR4();
                        AR4.ED3("long_press_follow_tooltip_shown_account_set");
                        AR4.apply();
                        0xY AR42 = r4.AR4();
                        AR42.E5h("long_press_follow_tooltip_shown_account_set", A0j);
                        AR42.apply();
                    }
                }
            }
        }
    }

    public C3250870z(FragmentActivity fragmentActivity, AnonymousClass0iw r3, 0wc r4, UserSession userSession, AnonymousClass47L r6, C323206x7 r7, UserDetailFragment userDetailFragment, C323246xB r9, UserDetailTabController userDetailTabController, Dc6 dc6, C231002qi r12, String str, String str2, String str3, String str4, String str5, boolean z) {
        0qQ.A0B(r9, 10);
        this.A05 = userSession;
        this.A07 = userDetailFragment;
        this.A02 = fragmentActivity;
        this.A08 = userDetailTabController;
        this.A09 = dc6;
        this.A0A = str;
        this.A0F = str2;
        this.A0E = str3;
        this.A0B = r6;
        this.A0C = r9;
        this.A06 = r7;
        this.A04 = r4;
        this.A0D = r12;
        this.A03 = r3;
        this.A0G = str4;
        this.A0H = str5;
        this.A0I = z;
    }

    private final C319986rY A00() {
        User user = this.A08.A0P.A0J;
        if (user != null) {
            UserSession userSession = this.A05;
            if (0qQ.A0K(userSession.A06, user.getId())) {
                return C319986rY.SELF;
            }
            if (AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A05) {
                return C319986rY.FOLLOWING;
            }
        }
        return C319986rY.NOT_FOLLOWING;
    }

    public static final void A02(C3250870z r7, String str) {
        User user = r7.A08.A0P.A0J;
        if (user != null) {
            FragmentActivity fragmentActivity = r7.A02;
            UserSession userSession = r7.A05;
            String str2 = str;
            F7B.A00(fragmentActivity, r7.A07, r7.A03, userSession, user, str2, r7.A0A, r7.A0I);
        }
    }

    public final boolean CnA() {
        C322486vu r1;
        User user;
        Boolean BAl;
        String str;
        UserDetailFragment userDetailFragment = this.A07;
        if ((!userDetailFragment.A30.A00.isEmpty()) || (user = r1.A0J) == null || (BAl = user.A03.BAl()) == null || !BAl.booleanValue()) {
            return false;
        }
        User user2 = (r1 = this.A08.A0P).A0J;
        if (user2 != null) {
            str = user2.getId();
        } else {
            str = null;
        }
        if (userDetailFragment.isVisible() && str != null) {
            UserSession userSession = this.A05;
            C320106rm r2 = new C320106rm(userSession, "non_self_profile_chaining", 31791406);
            r2.A0R(userDetailFragment.requireContext(), C71342cb.A00(userSession), userDetailFragment);
            r2.A00.A08((String) null);
            r2.A0E("fetch_request_start");
            1OC A002 = C46374Ddr.A00(userSession, AnonymousClass05K.A00, str, (String) null, false);
            A002.A00 = new ECT(r2, this);
            userDetailFragment.schedule(A002);
        }
        return true;
    }

    public final void D1L(String str) {
        String str2;
        C322486vu r3 = this.A08.A0P;
        C322496vv r0 = r3.A0A;
        C322496vv r2 = C322496vv.Closed;
        if (r0 == r2) {
            str2 = "tap_suggested_users_to_open";
        } else {
            str2 = "tap_suggested_users_to_close";
        }
        UserSession userSession = this.A05;
        UserDetailFragment userDetailFragment = this.A07;
        C319976rX.A08(userDetailFragment, userSession, A00(), str2, this.A09.A03(), this.A0A, this.A0F, "button_tray");
        if (userDetailFragment.A15()) {
            if (!userDetailFragment.A30.A00.isEmpty()) {
                CnA();
            } else {
                EHb();
                return;
            }
        } else if (CnA()) {
            return;
        }
        C322496vv r1 = r3.A0A;
        C322496vv r02 = C322496vv.Open;
        if (r1 == r02) {
            r3.A0A = r2;
        } else if (r1 == r2) {
            r3.A0A = r02;
        } else {
            return;
        }
        r3.A00();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.WNI, java.lang.Object, X.4bz] */
    public final void D2R(String str) {
        UserSession userSession = this.A05;
        UserDetailFragment userDetailFragment = this.A07;
        C319986rY r6 = C319986rY.SELF;
        Dc6 dc6 = this.A09;
        C319976rX.A08(userDetailFragment, userSession, r6, "edit_profile", dc6.A03(), this.A0A, this.A0F, "button_tray");
        C46656Dib A042 = C46447Df9.A03().A01.A04("profile");
        C323246xB r2 = this.A0C;
        r2.A03(A042, "edit_profile", false);
        r2.A01();
        r2.A02();
        String A032 = dc6.A03();
        ? obj = new Object();
        obj.A00 = A032;
        r2.A04(obj);
        r2.A00();
    }

    public final void D2a(1Xj r36, UserDetailEntryInfo userDetailEntryInfo, FollowButton followButton, String str, String str2, String str3, String str4) {
        FAG fag;
        UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
        String str5 = str2;
        String str6 = str3;
        Dc6 dc6 = this.A09;
        User user = dc6.A03;
        if (user != null) {
            UserSession userSession = this.A05;
            FollowStatus A0N = AnonymousClass2f1.A00(userSession).A0N(user);
            FollowButton followButton2 = followButton;
            if (user.CPV()) {
                FragmentActivity fragmentActivity = this.A02;
                if (str3 == null) {
                    str6 = "";
                }
                FH6.A02(fragmentActivity, userSession, followButton2, this, user, str6);
                return;
            }
            FollowStatus followStatus = FollowStatus.A05;
            1Xj r26 = r36;
            if (A0N == followStatus) {
                UserDetailFragment userDetailFragment = this.A07;
                C319986rY A012 = C319976rX.A01(user.B6o());
                String A032 = dc6.A03();
                String str7 = this.A0A;
                C319976rX.A08(userDetailFragment, userSession, A012, "tap_follow_sheet", A032, str7, this.A0F, str);
                if (1YZ.A02 != null) {
                    AnonymousClass73V.A0E(this.A04, "profile_following_sheet_entry_point", user.getId());
                }
                C46447Df9.A03();
                userDetailFragment.requireContext();
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
                bundle.putString("ProfileFollowRelationshipFragment.ARG_DISPLAYED_USER_ID", user.getId());
                bundle.putString("ProfileFollowRelationShipFragment.ARG_SOURCE_COMMENT_ID", str4);
                bundle.putString("ProfileFollowRelationshipFragment.ARG_SOURCE_MEDIA_ID", str7);
                ProfileFollowRelationshipFragment profileFollowRelationshipFragment = new ProfileFollowRelationshipFragment();
                profileFollowRelationshipFragment.setArguments(bundle);
                C331127Pr r3 = new C331127Pr(userSession);
                r3.A0T = profileFollowRelationshipFragment;
                r3.A0a = false;
                r3.A03 = 0.7f;
                User user2 = dc6.A03;
                if (user2 != null) {
                    r3.A0d = user2.getUsername();
                    C331157Pu A002 = r3.A00();
                    User user3 = dc6.A03;
                    if (user3 != null) {
                        Context requireContext = userDetailFragment.requireContext();
                        Activity activity = this.A02;
                        UserDetailTabController userDetailTabController = this.A08;
                        if (str2 == null) {
                            str5 = "";
                        }
                        if (userDetailEntryInfo == null) {
                            userDetailEntryInfo2 = new UserDetailEntryInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null);
                        }
                        if (str3 == null) {
                            str6 = "";
                        }
                        C323206x7 r0 = this.A06;
                        Activity activity2 = activity;
                        UserSession userSession2 = userSession;
                        C331157Pu r27 = A002;
                        UserDetailTabController userDetailTabController2 = userDetailTabController;
                        profileFollowRelationshipFragment.A00 = new C51028FnK(activity2, requireContext, userSession2, r26, r27, userDetailTabController2, userDetailEntryInfo2, user3, r0.BwV(), (AnonymousClass70J) r0.A0d.getValue(), str5, str6);
                        A002.A03(userDetailFragment.requireContext(), profileFollowRelationshipFragment);
                        User user4 = userDetailFragment.A10.A03;
                        if (!userDetailFragment.A15() && user4 != null) {
                            user4.getId();
                            if (user4.A2E() && user4.B6o() == followStatus) {
                                User user5 = userDetailFragment.A10.A03;
                                if (userDetailFragment.A0u == null) {
                                    C46410DeX deX = userDetailFragment.A0v;
                                    UserSession userSession3 = userDetailFragment.A0I;
                                    if (user5 != null) {
                                        fag = new FAG();
                                        String id = user5.getId();
                                        0qQ.A0B(userSession3, 0);
                                        1NY r2 = new 1NY(userSession3, -2);
                                        r2.A08(AnonymousClass05K.A0N);
                                        r2.A0K("friendships/unfollow_chaining_count/%s/", new Object[]{id});
                                        r2.A0O((15p) null, C47311Due.class, F4X.class, false);
                                        1OC A0M = r2.A0M();
                                        A0M.A00 = new EC2(userSession3, fag, deX, user5);
                                        C46465DfT dfT = deX.A02;
                                        String id2 = user5.getId();
                                        0wc r22 = dfT.A00;
                                        0Aj A003 = r22.A00(r22.A00, "unfollow_chaining_count_prefetch");
                                        A003.AAJ("target_id", id2);
                                        A003.Cgf();
                                        1ES.A03(A0M);
                                    } else {
                                        fag = null;
                                    }
                                    userDetailFragment.A0u = fag;
                                } else if (user5 != null) {
                                    C46465DfT dfT2 = userDetailFragment.A0v.A02;
                                    String id3 = user5.getId();
                                    0wc r23 = dfT2.A00;
                                    0Aj A004 = r23.A00(r23.A00, "unfollow_chaining_already_prefetched");
                                    A004.AAJ("target_id", id3);
                                    A004.Cgf();
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                C49061Eof.A00(userSession).A02(EWT.FOLLOW_USER_FLOW, (Integer) null);
                C267064at r5 = followButton2.A0J;
                0xF r4 = new 0xF();
                0xF.A00(r4, this.A0G, "starting_clips_media_id");
                0xF.A00(r4, this.A0H, "starting_clips_ranking_info_token");
                r5.A04(r4, userSession, r26, (AnonymousClass3W1) null, (SearchContext) null, this, user, (C249763kK) null, (Double) null, (String) null);
                UserDetailFragment userDetailFragment2 = this.A07;
                User user6 = userDetailFragment2.A10.A03;
                if (user6 != null) {
                    UserSession userSession4 = userDetailFragment2.A0I;
                    0qQ.A0B(userSession4, 0);
                    if (182.A06(0Tu.A05, userSession4, 36323062408293186L) && userDetailFragment2.getActivity() != null) {
                        C384829hx r42 = new C384829hx();
                        C331127Pr r32 = new C331127Pr(userDetailFragment2.A0I);
                        r32.A0d = userDetailFragment2.getString(2131969973, new Object[]{user6.getUsername()});
                        r32.A00().A02(userDetailFragment2.getActivity(), r42);
                    }
                }
                C231002qi r1 = this.A0D;
                EnumSet of = EnumSet.of(Trigger.A1d);
                0qQ.A07(of);
                r1.AVg(of);
            }
        }
    }

    public final void D2d(String str, String str2) {
        C319976rX.A08(this.A07, this.A05, A00(), str, this.A09.A03(), this.A0A, this.A0F, "user_profile_header");
    }

    public final void DDw() {
        C358248ab r2 = new C358248ab((Activity) this.A02);
        r2.A0l(this.A07, this.A05);
        r2.A09(2131962206);
        r2.A08(2131962204);
        r2.A0G(new SUz(this), 2131962205);
        r2.A0H(C71244Og9.A00, 17039360);
        r2.A04();
        AnonymousClass0fN.A00(r2.A02());
    }

    public final void DPC(1Xj r6, UserDetailEntryInfo userDetailEntryInfo, String str, String str2, String str3) {
        User user = this.A09.A03;
        if (user != null) {
            UserSession userSession = this.A05;
            if (AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A06 && (!FFT.A01(userSession, user).isEmpty())) {
                C47410E1c e1c = new C47410E1c();
                e1c.A05 = user;
                e1c.A01 = r6;
                e1c.A06 = str;
                e1c.A08 = str2;
                e1c.A07 = str3;
                e1c.A03 = userDetailEntryInfo;
                new C331127Pr(userSession).A00().A02(this.A02, e1c);
            }
        }
    }

    public final void DRV(String str, boolean z) {
        User user;
        boolean z2;
        C322486vu r2 = this.A08.A0P;
        if (r2.A0J != null) {
            AnonymousClass2f1 A002 = AnonymousClass2f1.A00(this.A05);
            User user2 = r2.A0J;
            if (user2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (A002.A0Q(user2)) {
                User user3 = r2.A0J;
                if (user3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                } else if (user3.A2A()) {
                    User user4 = r2.A0J;
                    if (user4 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    } else if (!user4.A2L()) {
                        User user5 = r2.A0J;
                        if (user5 != null) {
                            user5.A1x();
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
            }
        }
        EM4(str);
        UserSession userSession = this.A05;
        User user6 = r2.A0J;
        if (user6 == null || !AnonymousClass430.A01(userSession) || !JYR.A00(userSession) || !user6.A1S()) {
            if (AnonymousClass430.A03(userSession, 36316808935903888L) && (user = r2.A0J) != null && AnonymousClass430.A01(userSession) && user.A1S()) {
                MonetizationRepository A003 = AnonymousClass2o3.A00(userSession);
                UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND;
                if (!A003.A05(userMonetizationProductType) && A003.A06(userMonetizationProductType)) {
                    z2 = true;
                }
            }
            if (this.A0B == AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE) {
                str = "message_button_ctd";
            }
            A02(this, str);
            return;
        }
        z2 = false;
        C46498Dg1 dg1 = new C46498Dg1(this.A02, userSession);
        dg1.A04(new FN8(this, str), 2131959732);
        dg1.A04(new FNQ(this, str, z2), 2131969193);
        HashMap hashMap = new HashMap();
        hashMap.put("show_brand_on_boarding_flow", String.valueOf(z2));
        hashMap.put("is_brand_onboarded", String.valueOf(JYR.A00(userSession)));
        UserDetailFragment userDetailFragment = this.A07;
        JVF.A05(userDetailFragment, userSession, AnonymousClass05K.A05, hashMap);
        new C49945FFy(dg1).A05(userDetailFragment.requireContext());
    }

    public final void DRZ(boolean z) {
        if (!this.A01 && z) {
            C52369GPq gPq = new C52369GPq(this.A05, (String) null);
            String A032 = this.A09.A03();
            0qQ.A0B(A032, 0);
            C52369GPq.A03(gPq, 00y.A0n(10, A032), "profile_stardust_message_icon_impression");
            this.A01 = true;
        }
    }

    public final void EHb() {
        UserDetailFragment userDetailFragment = this.A07;
        if (userDetailFragment.isVisible()) {
            UserSession userSession = this.A05;
            C320106rm r2 = new C320106rm(userSession, "self_profile_chaining", 31793260);
            r2.A0R(userDetailFragment.requireContext(), C71342cb.A00(userSession), userDetailFragment);
            r2.A00.A08((String) null);
            r2.A0E("fetch_request_start");
            1OC A002 = C46396DeJ.A00(userSession, (Integer) null, userDetailFragment.getModuleName());
            A002.A00 = new C46442Df4(r2, this);
            userDetailFragment.schedule(A002);
        }
    }

    public final void EM4(String str) {
        UserSession userSession = this.A05;
        C319976rX.A09(this.A07, userSession, A00(), AnonymousClass000.A00(1278), this.A09.A03(), this.A0A, this.A0F, this.A0E, str);
    }

    public static final void A01(C3250870z r1, int i) {
        0f9 A002 = 0wj.A00(r1.getClass().getSimpleName(), i, true);
        A002.ABQ("su_check_timeout_event", "Checking whether there is a cache timeout event.");
        A002.report();
    }
}
