package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.73V  reason: invalid class name */
public final class AnonymousClass73V {
    public static final AnonymousClass73V A00 = new Object();

    public static final void A02(C58840Ae r4, C3263576k r5, C69445Nlp nlp, C48088EVg eVg, String str, String str2, String str3) {
        0qQ.A0B(eVg, 1);
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r42 = (0wc) r4;
        0Aj A002 = r42.A00(r42.A00, "ig_wellbeing_restrict_upsell_action");
        A002.AAJ("action", str);
        A002.AAJ("step", str2);
        A002.AAJ("entrypoint", A01(eVg));
        A002.A9H("extra_values", hashMap);
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9F("actor_ig_userid", A003);
        }
        if (r5 != null) {
            A002.A8M(r5, "source_of_action");
        }
        if (nlp != null) {
            A002.A8M(nlp, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        A002.Cgf();
    }

    public static final void A03(C58840Ae r4, C3263576k r5, C69445Nlp nlp, String str, String str2) {
        0qQ.A0B(r4, 0);
        A04(r4, r5, nlp, "click", str, str2);
    }

    public static final void A07(C58840Ae r4, C3263576k r5, C69445Nlp nlp, String str, String str2, List list) {
        0qQ.A0B(r4, 0);
        A06(r4, r5, nlp, "click", str, str2, list);
    }

    public static final void A08(C58840Ae r3, UserSession userSession, 2Eq r5, List list) {
        String str;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(list, 1);
        0qQ.A0B(r3, 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AnonymousClass170) it.next()).isRestricted()) {
                if (1YZ.A02 != null) {
                    if (list.size() == 1) {
                        str = "open_restricted_thread";
                    } else {
                        str = "open_restricted_group_thread";
                    }
                    A09(r3, r5, str);
                    return;
                }
                return;
            }
        }
    }

    public static final void A09(C58840Ae r6, 2Eq r7, String str) {
        String str2;
        List arrayList;
        C58840Ae r1 = r6;
        0qQ.A0B(r6, 0);
        if (r7 != null) {
            str2 = r7.C6k();
            arrayList = r7.BRV();
        } else {
            str2 = null;
            arrayList = new ArrayList();
        }
        A06(r1, (C3263576k) null, (C69445Nlp) null, "click", str, str2, arrayList);
    }

    public static final Long A00(String str) {
        if (str != null) {
            return 00y.A0n(10, str);
        }
        return null;
    }

    public static final void A04(C58840Ae r4, C3263576k r5, C69445Nlp nlp, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r42 = (0wc) r4;
        0Aj A002 = r42.A00(r42.A00, "ig_wellbeing_restrict_group_chat_warning");
        A002.AAJ("action", str);
        A002.AAJ("step", str2);
        A002.AAJ("entrypoint", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A002.A9H("extra_values", hashMap);
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9F("direct_thread_id", A003);
        }
        A002.A8M(r5, "source_of_action");
        A002.A8M(nlp, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A002.Cgf();
    }

    public static final void A05(C58840Ae r5, C3263576k r6, C69445Nlp nlp, String str, String str2, String str3, List list) {
        Long A0n;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r52 = (0wc) r5;
        0Aj A002 = r52.A00(r52.A00, "ig_wellbeing_restrict_direct_flow_action");
        A002.AAJ("action", "click");
        A002.AAJ("step", str);
        A002.AAJ("entrypoint", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A002.A9H("extra_values", hashMap);
        if (!(str2 == null || (A0n = 00y.A0n(10, str2)) == null)) {
            A002.A9F("direct_thread_id", A0n);
        }
        Long A003 = A00(str3);
        if (A003 != null || ((!list.isEmpty()) && list.size() == 1 && (A003 = A00((String) 00k.A0O(list, 0))) != null)) {
            A002.A9F("actor_ig_userid", A003);
        }
        if (r6 != null) {
            A002.A8M(r6, "source_of_action");
        }
        if (nlp != null) {
            A002.A8M(nlp, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        A002.Cgf();
    }

    public static final void A06(C58840Ae r4, C3263576k r5, C69445Nlp nlp, String str, String str2, String str3, List list) {
        Long A002;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r42 = (0wc) r4;
        0Aj A003 = r42.A00(r42.A00, "ig_wellbeing_restrict_manage_direct_thread");
        A003.AAJ("action", str);
        A003.AAJ("step", str2);
        A003.AAJ("entrypoint", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A003.A9H("extra_values", hashMap);
        if (str3 != null) {
            Long A0n = 00y.A0n(10, str3);
            if (A0n != null) {
                A003.A9F("direct_thread_id", A0n);
            }
            if (list.size() == 1 && (A002 = A00((String) 00k.A0O(list, 0))) != null) {
                A003.A9F("actor_ig_userid", A002);
            }
        }
        if (r5 != null) {
            A003.A8M(r5, "source_of_action");
        }
        if (nlp != null) {
            A003.A8M(nlp, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        A003.Cgf();
    }

    public static final void A0A(C58840Ae r4, User user, String str, String str2) {
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r42 = (0wc) r4;
        0Aj A002 = r42.A00(r42.A00, "ig_wellbeing_restrict_list_action");
        A002.AAJ("action", str);
        A002.AAJ("step", str2);
        A002.A9H("extra_values", hashMap);
        if (user != null) {
            str3 = user.getId();
        } else {
            str3 = null;
        }
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9F("actor_ig_userid", A003);
        }
        A002.Cgf();
    }

    public static final void A0B(C58840Ae r5, User user, String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r52 = (0wc) r5;
        0Aj A002 = r52.A00(r52.A00, "ig_wellbeing_restrict_manage_comment");
        A002.AAJ("action", "click");
        A002.AAJ("step", str);
        A002.AAJ("entrypoint", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        A002.A9H("extra_values", hashMap);
        Long A003 = A00(user.getId());
        if (A003 != null) {
            A002.A9F("actor_ig_userid", A003);
        }
        Long A0n = 00y.A0n(10, str2);
        if (A0n != null) {
            A002.A9F("comment_id", A0n);
        }
        Long A004 = A00(str3);
        if (A004 != null) {
            A002.A9F("parent_comment_id", A004);
        }
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str4);
        0qQ.A0B(A06, 0);
        Long A0n2 = 00y.A0n(10, A06);
        if (A0n2 != null) {
            A002.A9F("parent_media_id", A0n2);
        }
        A002.Cgf();
    }

    public static final void A0C(C58840Ae r3, C48088EVg eVg, String str, String str2, String str3, String str4) {
        0wc r32 = (0wc) r3;
        0Aj A002 = r32.A00(r32.A00, "instagram_wellbeing_upsells_action");
        if (A002.isSampled()) {
            LinkedHashMap A06 = 0Yt.A06(new 0eP[]{new 0eP("nav_chain", AnonymousClass1QI.A00.A02.A00), new 0eP("actor_ig_user_id", str2)});
            A002.AAJ("step", str);
            A002.AAJ("entrypoint", A01(eVg));
            A002.A9H("extra_values", A06);
            A002.AAJ("action", str3);
            A002.AAJ("surface", str4);
            A002.Cgf();
        }
    }

    public static final void A0D(C58840Ae r7, String str) {
        A05(r7, (C3263576k) null, (C69445Nlp) null, "restrict_account_button", (String) null, str, new ArrayList());
    }

    public static final void A0E(C58840Ae r4, String str, String str2) {
        0wc r42 = (0wc) r4;
        0Aj A002 = r42.A00(r42.A00, "ig_wellbeing_restrict_profile_flow_action");
        A002.AAJ("action", "click");
        A002.AAJ("step", str);
        A002.AAJ("entrypoint", "profile_following_sheet");
        Long A003 = A00(str2);
        if (A003 != null) {
            A002.A9F("actor_ig_userid", A003);
        }
        A002.Cgf();
    }

    public static final void A0F(C58840Ae r4, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r42 = (0wc) r4;
        0Aj A002 = r42.A00(r42.A00, "ig_wellbeing_restrict_activity_feed_flow_action");
        A002.AAJ("action", str);
        A002.AAJ("step", str2);
        A002.AAJ("entrypoint", "newsfeed_you");
        A002.A9H("extra_values", hashMap);
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9F("actor_ig_userid", A003);
        }
        A002.Cgf();
    }

    public static final void A0G(C58840Ae r4, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r42 = (0wc) r4;
        0Aj A002 = r42.A00(r42.A00, "ig_wellbeing_restrict_profile_flow_action");
        A002.AAJ("action", str);
        A002.AAJ("step", str2);
        A002.AAJ("entrypoint", "profile");
        A002.A9H("extra_values", hashMap);
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9F("actor_ig_userid", A003);
        }
        A002.Cgf();
    }

    public static final void A0H(C58840Ae r4, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r42 = (0wc) r4;
        0Aj A002 = r42.A00(r42.A00, "ig_wellbeing_restrict_upsell_action");
        A002.AAJ("action", str);
        A002.AAJ("step", str2);
        A002.AAJ("entrypoint", "profile");
        A002.A9H("extra_values", hashMap);
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9F("actor_ig_userid", A003);
        }
        A002.Cgf();
    }

    public final void A0I(C58840Ae r6, User user, String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r62 = (0wc) r6;
        0Aj A002 = r62.A00(r62.A00, "ig_wellbeing_restrict_upsell_action");
        A002.AAJ("action", "click");
        A002.AAJ("step", str);
        A002.AAJ("entrypoint", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        A002.A9H("extra_values", hashMap);
        if (str2 != null) {
            Long A0n = 00y.A0n(10, str2);
            if (A0n != null) {
                A002.A9F("comment_id", A0n);
            }
            Long A003 = A00(str3);
            if (A003 != null) {
                A002.A9F("parent_comment_id", A003);
            }
            Long A004 = A00(str4);
            if (A004 != null) {
                A002.A9F("parent_media_id", A004);
            }
        }
        Long A005 = A00(str5);
        if (!(A005 == null && (user == null || (A005 = A00(user.getId())) == null))) {
            A002.A9F("actor_ig_userid", A005);
        }
        A002.Cgf();
    }

    public final void A0J(C58840Ae r5, User user, String str, String str2, String str3, String str4, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r52 = (0wc) r5;
        0Aj A002 = r52.A00(r52.A00, "ig_wellbeing_restrict_comment_flow_action");
        A002.AAJ("action", str);
        A002.AAJ("step", str2);
        A002.AAJ("entrypoint", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        A002.A9H("extra_values", hashMap);
        if (str3 != null) {
            Long A0n = 00y.A0n(10, str3);
            if (A0n != null) {
                A002.A9F("comment_id", A0n);
            }
            Long A003 = A00(str4);
            if (A003 != null) {
                A002.A9F("parent_comment_id", A003);
            }
            Long A004 = A00(str5);
            if (A004 != null) {
                A002.A9F("parent_media_id", A004);
            }
        }
        Long A005 = A00(str6);
        if (!(A005 == null && (user == null || (A005 = A00(user.getId())) == null))) {
            A002.A9F("actor_ig_userid", A005);
        }
        A002.Cgf();
    }

    public static final String A01(C48088EVg eVg) {
        switch (eVg.ordinal()) {
            case 1:
                return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            case 2:
            case 3:
            case 4:
                return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
            case 5:
            case 6:
            case 8:
                return "profile";
            case 7:
                return "profile_following_sheet";
            case 9:
                return "newsfeed_you";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "hide_story_from";
            default:
                0wb.A03("restrict_error", "unknown analytics entry point");
                return "unknown";
        }
    }
}
