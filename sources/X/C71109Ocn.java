package X;

import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.util.LinkedHashMap;

/* renamed from: X.Ocn  reason: case insensitive filesystem */
public final class C71109Ocn {
    public final 0wc A00;
    public final String A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final void A04(int i) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "direct_reachability_settings_upsell_impression");
        if (A0e.isSampled()) {
            AnonymousClass7TE.A1W(A0e, AnonymousClass000.A00(92), i);
            DbS.A1N(A0e, this.A01);
            if (i == 2) {
                A0e.A9H("extra_data_map", AnonymousClass7TF.A0w("seen", String.valueOf(0)));
            }
            A0e.Cgf();
        }
    }

    public final void A06(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, 16V r7, String str, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_interop_reachability_setting_client_interaction");
        if (A0e.isSampled()) {
            A0e.AAJ("setting_name", A01(str));
            AnonymousClass7TE.A1W(A0e, "interaction_type", 1);
            int A002 = A00(directMessagesInteropOptionsViewModel.A00(str));
            if (A002 != Integer.MIN_VALUE) {
                AnonymousClass7TE.A1W(A0e, "setting_from_value", A002);
            } else {
                A0e.AAJ("setting_from_value", (String) null);
            }
            int A003 = A00(directMessagesInteropOptionsViewModel2.A00(str));
            if (A003 != Integer.MIN_VALUE) {
                AnonymousClass7TE.A1W(A0e, "setting_to_value", A003);
            } else {
                A0e.AAJ("setting_to_value", (String) null);
            }
            A0e.A7p("setting_change_succeeded", Boolean.valueOf(z3));
            A0e.A9H("extra_data_map", A02(directMessagesInteropOptionsViewModel2, r7, z, z2));
            DbV.A1J(A0e, this.A01);
        }
    }

    public static final int A00(DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions) {
        if (directMessageInteropReachabilityOptions == null) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        switch (directMessageInteropReachabilityOptions.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 5;
            default:
                return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
    }

    public static final LinkedHashMap A02(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, 16V r8, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A05;
        String str10 = null;
        if (directMessageInteropReachabilityOptions != null) {
            str = directMessageInteropReachabilityOptions.A03;
        } else {
            str = null;
        }
        0eP A1L = AnonymousClass7TE.A1L("ig_followers", str);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = directMessagesInteropOptionsViewModel.A08;
        if (directMessageInteropReachabilityOptions2 != null) {
            str2 = directMessageInteropReachabilityOptions2.A03;
        } else {
            str2 = null;
        }
        0eP A1L2 = AnonymousClass7TE.A1L("others_on_ig", str2);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = directMessagesInteropOptionsViewModel.A07;
        if (directMessageInteropReachabilityOptions3 != null) {
            str3 = directMessageInteropReachabilityOptions3.A03;
        } else {
            str3 = null;
        }
        0eP A1L3 = AnonymousClass7TE.A1L("others_on_fb", str3);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4 = directMessagesInteropOptionsViewModel.A04;
        if (directMessageInteropReachabilityOptions4 != null) {
            str4 = directMessageInteropReachabilityOptions4.A03;
        } else {
            str4 = null;
        }
        0eP A1L4 = AnonymousClass7TE.A1L("group_message_setting", str4);
        if (r8 != null) {
            str5 = r8.A01;
        } else {
            str5 = null;
        }
        LinkedHashMap A07 = 0Yt.A07(new 0eP[]{A1L, A1L2, A1L3, A1L4, AnonymousClass7TE.A1L("account_type", str5)});
        if (r8 != 16V.A05) {
            if (z) {
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5 = directMessagesInteropOptionsViewModel.A00;
                if (directMessageInteropReachabilityOptions5 != null) {
                    str8 = directMessageInteropReachabilityOptions5.A03;
                } else {
                    str8 = null;
                }
                A07.put("fb_friends", str8);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6 = directMessagesInteropOptionsViewModel.A01;
                if (directMessageInteropReachabilityOptions6 != null) {
                    str9 = directMessageInteropReachabilityOptions6.A03;
                } else {
                    str9 = null;
                }
                A07.put("fb_friends_of_friends", str9);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7 = directMessagesInteropOptionsViewModel.A09;
                if (directMessageInteropReachabilityOptions7 != null) {
                    str10 = directMessageInteropReachabilityOptions7.A03;
                }
                str7 = "people_with_your_phone_number";
            }
            return A07;
        }
        if (z2) {
            DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8 = directMessagesInteropOptionsViewModel.A03;
            if (directMessageInteropReachabilityOptions8 != null) {
                str6 = directMessageInteropReachabilityOptions8.A03;
            } else {
                str6 = null;
            }
            A07.put("fb_messaged_your_page", str6);
            DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9 = directMessagesInteropOptionsViewModel.A02;
            if (directMessageInteropReachabilityOptions9 != null) {
                str10 = directMessageInteropReachabilityOptions9.A03;
            }
            str7 = "fb_liked_or_followed_your_page";
        }
        return A07;
        A07.put(str7, str10);
        return A07;
    }

    public static final void A03(C71109Ocn ocn, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, 16V r6, String str, boolean z, boolean z2, boolean z3) {
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(ocn.A00, "ig_interop_reachability_settings_suggestion");
        if (A0e.isSampled()) {
            int A002 = A00(directMessagesInteropOptionsViewModel.A00(str));
            int A003 = A00(directMessagesInteropOptionsViewModel2.A00(str));
            if (A002 != Integer.MIN_VALUE && A003 != Integer.MIN_VALUE) {
                if (z3) {
                    str2 = "dialog_confirmed_by_user";
                } else {
                    str2 = "dialog_shown";
                }
                A0e.AAJ("event_subtype", str2);
                A0e.AAJ("setting_name", A01(str));
                AnonymousClass7TE.A1W(A0e, "setting_from_value", A002);
                AnonymousClass7TE.A1W(A0e, "setting_to_value", A003);
                A0e.A9H("extra_data_map", A02(directMessagesInteropOptionsViewModel2, r6, z, z2));
                A0e.Cgf();
            }
        }
    }

    public final void A05(int i, int i2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "direct_reachability_settings_upsell_click");
        if (A0e.isSampled()) {
            AnonymousClass7TE.A1W(A0e, AnonymousClass000.A00(92), i);
            AnonymousClass7TE.A1W(A0e, "action_type", i2);
            DbV.A1J(A0e, this.A01);
        }
    }

    public C71109Ocn(AnonymousClass0iw r2, UserSession userSession, String str) {
        this.A03 = userSession;
        this.A02 = r2;
        this.A01 = str;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public static final String A01(String str) {
        switch (str.hashCode()) {
            case -2143256302:
                if (str.equals("fb_friends")) {
                    return "direct-interop-message-reachability-settings-fb-friends";
                }
                break;
            case -1890055046:
                if (str.equals("fb_friends_of_friends")) {
                    return "direct-interop-message-reachability-settings-fb-friends-of-friends";
                }
                break;
            case -1839818691:
                if (str.equals("people_with_your_phone_number")) {
                    return "direct-interop-message-reachability-settings-people-with-your-phone-number";
                }
                break;
            case -1275916548:
                if (str.equals("fb_messaged_your_page")) {
                    return "direct-interop-message-reachability-settings-fb-messaged-your-page";
                }
                break;
            case -456614348:
                if (str.equals("ig_followers")) {
                    return "direct-interop-message-reachability-settings-ig-followers";
                }
                break;
            case -371252023:
                if (str.equals("ig_verified")) {
                    return "direct-interop-message-reachability-settings-verified-accounts";
                }
                break;
            case -8227469:
                if (str.equals("fb_liked_or_followed_your_page")) {
                    return "direct-interop-message-reachability-settings-fb-liked-or-followed-your-page";
                }
                break;
            case 949752640:
                if (str.equals("others_on_fb")) {
                    return "direct-interop-message-reachability-settings-others-on-fb";
                }
                break;
            case 949752738:
                if (str.equals("others_on_ig")) {
                    return "direct-interop-message-reachability-settings-others-on-ig";
                }
                break;
            case 1767124056:
                if (str.equals("group_message_setting")) {
                    return "direct-interop-message-reachability-settings-ig-group-settings";
                }
                break;
        }
        throw DbW.A0c("Invalid MessageInteropOption ", str);
    }
}
