package com.instagram.direct.request;

import X.002;
import X.00k;
import X.02m;
import X.0Tu;
import X.0f9;
import X.0qQ;
import X.0sP;
import X.0wb;
import X.0wj;
import X.15p;
import X.182;
import X.1NY;
import X.1OC;
import X.1XP;
import X.1XY;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass65B;
import X.AnonymousClass74W;
import X.AnonymousClass74X;
import X.AnonymousClass74Y;
import X.AnonymousClass77c;
import X.AnonymousClass7BV;
import X.C239023El;
import X.C3265177b;
import X.C370528wc;
import X.C370538wd;
import X.C45522Cxw;
import X.C47337Dv4;
import X.C66579MXk;
import X.C66716MbN;
import X.CE8;
import X.D16;
import X.NHO;
import X.OQI;
import X.T0A;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public abstract class DirectThreadApi {
    public static final 1OC A01(UserSession userSession, DirectThreadKey directThreadKey, String str, String str2, int i) {
        0qQ.A0B(directThreadKey, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0A("direct_v2/threads/broadcast/update_prompt_response/delete/");
        r2.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        r2.A9m("prompt_id", str);
        r2.A9m("response_id", str2);
        r2.A0C("prompt_type", i);
        r2.A0Q(1XP.class, 1XY.class);
        return r2.A0M();
    }

    public static final 1OC A02(UserSession userSession, Boolean bool, String str, String str2, List list, int i, boolean z) {
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0R = true;
        r2.A0A("direct_v2/create_group_thread/");
        r2.A0Q(C370538wd.class, C370528wc.class);
        r2.A9m("recipient_users", A0K(list));
        r2.A9m("client_context", str);
        r2.A0H("pin_to_profile", z);
        r2.A9m("is_creator_subscriber_thread", "true");
        r2.A0C("duration_s", i);
        r2.A0E("invite_all_subscribers", bool);
        if (!(str2 == null || str2.length() == 0)) {
            r2.A9m("thread_title", str2);
        }
        return r2.A0M();
    }

    public static final 1OC A03(UserSession userSession, Long l, String str, int i, int i2) {
        0qQ.A0B(userSession, 0);
        1NY r5 = new 1NY(userSession, -2);
        r5.A05();
        r5.A0A("direct_v2/get_channel_directory/");
        r5.A0Q(CE8.class, C45522Cxw.class);
        r5.A0C(C66579MXk.A00(1170), i);
        r5.A0G(C66579MXk.A00(118), str);
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != 0) {
                r5.A0D(C66579MXk.A00(119), longValue);
            }
        }
        r5.A0C("surface", i2);
        return r5.A0M();
    }

    public static final 1OC A04(UserSession userSession, Long l, String str, String str2, List list, boolean z, boolean z2) {
        0qQ.A0B(list, 3);
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A01);
        r2.A0R = true;
        r2.A0A("direct_v2/create_group_thread/");
        r2.A0O((15p) null, C370538wd.class, C370528wc.class, false);
        r2.A9m("recipient_users", A0K(list));
        r2.A9m("client_context", str);
        r2.A0H("is_partnership_folder", z);
        if (!(str2 == null || str2.length() == 0)) {
            r2.A9m("thread_title", str2);
        }
        if (z2) {
            r2.A9m("is_optional_e2ee", "true");
            if (l != null) {
                r2.A9m("wa_jid", l.toString());
            }
        }
        return r2.A0M();
    }

    public static final 1OC A05(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        1NY r3 = new 1NY(userSession, -2);
        r3.A04();
        r3.A0K("direct_v2/threads/%s/remove_thread_image/", new Object[]{str});
        r3.A0Q(AnonymousClass74W.class, AnonymousClass74X.class);
        r3.A0R = true;
        return r3.A0M();
    }

    public static final 1OC A06(UserSession userSession, String str, String str2) {
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A01);
        r2.A0A("direct_v2/add_to_inbox/");
        r2.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        r2.A9m(AnonymousClass000.A00(3412), "true");
        r2.A9m("ad_id", str2);
        r2.A0O((15p) null, 1XP.class, 1XY.class, false);
        return r2.A0M();
    }

    public static final 1OC A07(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0K("direct_v2/threads/%s/turn_xposting_on/", new Object[]{str});
        r2.A9m("destination_thread_fbid", str2);
        r2.A0Q(1XP.class, 1XY.class);
        return r2.A0M();
    }

    public static final 1OC A08(UserSession userSession, String str, String str2, int i) {
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0K("direct_v2/threads/%s/participant_requests/", new Object[]{str});
        r2.A9m("page_size", String.valueOf(i));
        r2.A0G("cursor", str2);
        r2.A0O((15p) null, NHO.class, OQI.class, false);
        return r2.A0M();
    }

    public static final 1OC A09(UserSession userSession, String str, String str2, int i, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        1NY r3 = new 1NY(userSession, -2);
        r3.A04();
        r3.A0R = true;
        r3.A0A("direct_v2/create_group_thread/");
        r3.A0Q(C370538wd.class, C370528wc.class);
        r3.A9m("is_discoverable_chat_thread", "true");
        r3.A9m("recipient_users", "[]");
        r3.A0C("duration_s", i);
        r3.A9m("instagram_school_fbid", str2);
        r3.A0G("thread_title", str);
        if (z) {
            r3.A9m("pin_to_profile", "true");
        }
        if (z2) {
            r3.A9m("require_approval_join", "true");
        }
        return r3.A0M();
    }

    public static final 1OC A0A(UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0A("direct_v2/threads/broadcast/delete_collection/");
        r2.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        r2.A9m("collection_id", str2);
        r2.A9m("collection_type", str3);
        r2.A0Q(1XP.class, 1XY.class);
        return r2.A0M();
    }

    public static final 1OC A0B(UserSession userSession, String str, String str2, String str3, String str4, String str5, int i) {
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0A("direct_v2/threads/broadcast/update_prompt_response/add/");
        r2.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        r2.A9m("client_context", str2);
        r2.A9m("prompt_id", str3);
        r2.A0C("prompt_type", i);
        r2.A0Q(C47337Dv4.class, D16.class);
        if (str4 != null) {
            r2.A9m("response_id", str4);
        } else if (str5 != null) {
            r2.A9m(C66579MXk.A00(1060), str5);
        }
        return r2.A0M();
    }

    public static final 1OC A0C(UserSession userSession, String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        0qQ.A0B(userSession, 0);
        if (z) {
            str4 = "direct_v2/threads/%s/broadcast_update_thread_image/";
            str5 = AnonymousClass000.A00(1116);
        } else {
            str4 = "direct_v2/threads/%s/update_thread_image/";
            str5 = "upload_id";
        }
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0K(str4, new Object[]{str});
        r2.A04 = new T0A(str5, str3, z, str2);
        r2.A0Q(AnonymousClass74W.class, AnonymousClass74X.class);
        return r2.A0M();
    }

    public static final 1OC A0D(UserSession userSession, String str, String str2, List list) {
        return A04(userSession, (Long) null, str, str2, list, false, false);
    }

    public static final 1OC A0E(UserSession userSession, String str, String str2, List list, List list2) {
        String A0g;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(list, 2);
        0qQ.A0B(list2, 3);
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A01);
        r2.A0K("direct_v2/threads/%s/get_items/", new Object[]{str});
        r2.A0O((15p) null, C3265177b.class, AnonymousClass77c.class, false);
        r2.A9m(AnonymousClass000.A00(3475), 002.A0E(C239023El.A00(',').A02(list), '[', ']'));
        r2.A9m("visual_message_return_type", "unseen");
        if (list.size() == list2.size()) {
            if (list2.isEmpty()) {
                A0g = "[]";
            } else {
                A0g = 002.A0g("[\"", new C239023El("\",\"").A02(list2), "\"]");
            }
            r2.A9m(AnonymousClass000.A00(1661), A0g);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Disjoint itemIds and clientContexts: itemIds=");
            sb.append(list.size());
            sb.append(" clientContexts=");
            sb.append(list2);
            0wb.A03("get_items", sb.toString());
        }
        r2.A0G("eb_device_id", AnonymousClass65B.A03.A02(userSession));
        r2.A0G("igd_request_log_tracking_id", str2);
        return r2.A0M();
    }

    public static final 1OC A0F(UserSession userSession, String str, List list, List list2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 3);
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0A("direct_v2/send_direct_invite/");
        StringBuilder sb = new StringBuilder("[");
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            sb.append("\"");
            sb.append((String) list2.get(i));
            sb.append("\"");
            if (i < list2.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        String obj = sb.toString();
        0qQ.A07(obj);
        r2.A9m("categories", obj);
        r2.A9m("user_ids", A0K(list));
        r2.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        r2.A0Q(1XP.class, 1XY.class);
        return r2.A0M();
    }

    public static final 1OC A0G(UserSession userSession, List list) {
        String A0g;
        0qQ.A0B(userSession, 0);
        1NY r3 = new 1NY(userSession, -2);
        r3.A04();
        r3.A0A("direct_v2/threads/deletion/");
        r3.A0Q(1XP.class, 1XY.class);
        if (list.isEmpty()) {
            A0g = "[]";
        } else {
            A0g = 002.A0g("[\"", new C239023El("\",\"").A02(list), "\"]");
        }
        r3.A9m("thread_ids", A0g);
        return r3.A0M();
    }

    public static final C66716MbN A0H(UserSession userSession, AnonymousClass7BV r10, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4) {
        String str5;
        02m r2;
        int i;
        String str6;
        String str7 = str4;
        0qQ.A0B(str7, 7);
        AnonymousClass7BV r6 = r10;
        String str8 = str2;
        if (!(r10 == null || (r2 = 02m.A0p) == null)) {
            MarkerEditor withMarker = r2.withMarker(r10.A01, r10.A00);
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            withMarker.annotate("requested_message_limit", i);
            withMarker.annotate("cursor_id", str2);
            if (num == null) {
                str6 = "null";
            } else if (1 - num.intValue() != 0) {
                str6 = "NEWER";
            } else {
                str6 = "OLDER";
            }
            withMarker.annotate("direction", str6);
            withMarker.markerEditingCompleted();
        }
        UserSession userSession2 = userSession;
        1NY r3 = new 1NY(userSession, -2);
        r3.A08(AnonymousClass05K.A0N);
        r3.A0K("direct_v2/threads/%s/", new Object[]{str});
        r3.A0O((15p) null, AnonymousClass74W.class, AnonymousClass74X.class, false);
        if (!(str2 == null || num == null)) {
            r3.A9m("cursor", str2);
            if (1 - num.intValue() != 0) {
                str5 = "newer";
            } else {
                str5 = "older";
            }
            r3.A9m("direction", str5);
        }
        if (l != null) {
            r3.A9m("seq_id", l.toString());
        }
        if (num2 != null) {
            r3.A9m("limit", String.valueOf((long) num2.intValue()));
        }
        r3.A0G("fetch_attribution", str3);
        r3.A9m("visual_message_return_type", "unseen");
        r3.A9m("eb_device_id", AnonymousClass65B.A03.A02(userSession));
        r3.A9m("igd_request_log_tracking_id", str7);
        if (str.length() < 3) {
            0f9 AEf = 0wj.A01.AEf("invalid_thread_id", 817891202);
            AEf.ABQ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            AEf.report();
        }
        1OC A0M = r3.A0M();
        boolean z = false;
        if (num == AnonymousClass05K.A01) {
            z = true;
        }
        return new C66716MbN(new AnonymousClass74Y(userSession2, r6, str8, str7, z), A0M);
    }

    public static final C66716MbN A0I(UserSession userSession, AnonymousClass7BV r10, Integer num, Long l, String str, List list, boolean z) {
        02m r2;
        int i;
        String str2 = str;
        0qQ.A0B(str, 5);
        AnonymousClass7BV r5 = r10;
        if (!(r10 == null || (r2 = 02m.A0p) == null)) {
            MarkerEditor withMarker = r2.withMarker(r10.A01, r10.A00);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            withMarker.annotate("requested_message_limit", i);
            withMarker.annotate("user_ids", 00k.A0P(", ", "", "", list, (0sP) null));
            withMarker.markerEditingCompleted();
        }
        UserSession userSession2 = userSession;
        1NY r22 = new 1NY(userSession, -2);
        r22.A08(AnonymousClass05K.A0N);
        r22.A0A("direct_v2/threads/get_by_participants/");
        r22.A9m("recipient_users", A0K(list));
        r22.A0O((15p) null, AnonymousClass74W.class, AnonymousClass74X.class, false);
        if (l != null) {
            r22.A9m("seq_id", l.toString());
        }
        if (z) {
            r22.A9m("use_recipient_as_eimu_id", "true");
        }
        if (num != null) {
            r22.A9m("limit", String.valueOf((long) num.intValue()));
        }
        r22.A9m("eb_device_id", AnonymousClass65B.A03.A02(userSession));
        r22.A9m("igd_request_log_tracking_id", str);
        return new C66716MbN(new AnonymousClass74Y(userSession2, r5, (String) null, str2, true), r22.A0M());
    }

    public static final int A00(UserSession userSession, String str) {
        int A01;
        if (!0qQ.A0K(str, "snapshot") || (A01 = (int) 182.A01(0Tu.A05, userSession, 36609631217457033L)) < 0) {
            return 20;
        }
        return A01;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A0J(com.instagram.common.session.UserSession r20, java.lang.String r21, X.AnonymousClass4D7 r22, X.C62320sa r23) {
        /*
            r4 = r23
            r0 = 27
            r3 = r22
            boolean r0 = X.ME7.A02(r0, r3)
            if (r0 == 0) goto L_0x00e8
            r5 = r3
            X.ME7 r5 = (X.ME7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e8
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r5.A02
            X.1Hj r7 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L_0x007c
            if (r0 != r6) goto L_0x00f4
            java.lang.Object r4 = r5.A01
            X.0sa r4 = (X.C62320sa) r4
            X.0eS.A00(r1)
        L_0x002c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ef
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x00ef
            java.lang.Class<com.instagram.direct.request.graphql.GetInstagramMessagingPromptV2SuggestionsResponseImpl$XfbIgMessagingPromptv2Suggestions> r2 = com.instagram.direct.request.graphql.GetInstagramMessagingPromptV2SuggestionsResponseImpl.XfbIgMessagingPromptv2Suggestions.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -239551392(0xfffffffff1b8bc60, float:-1.8295351E30)
            r5 = 0
            java.lang.String r0 = "xfb_ig_messaging_promptv2_suggestions(input:$input)"
            X.3lr r3 = r3.getOptionalTreeField(r5, r0, r2, r1)
            if (r3 == 0) goto L_0x00ef
            java.lang.Class<com.instagram.direct.request.graphql.GetInstagramMessagingPromptV2SuggestionsResponseImpl$XfbIgMessagingPromptv2Suggestions$Suggestions> r2 = com.instagram.direct.request.graphql.GetInstagramMessagingPromptV2SuggestionsResponseImpl.XfbIgMessagingPromptv2Suggestions.Suggestions.class
            r1 = 1691400262(0x64d0b846, float:3.0801609E22)
            java.lang.String r0 = "suggestions"
            com.google.common.collect.ImmutableList r1 = r3.getRequiredCompactedTreeListField(r5, r0, r2, r1)
            if (r1 == 0) goto L_0x00ef
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x0064:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00f3
            java.lang.Object r2 = r3.next()
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r1 = "text"
            java.lang.String r1 = r2.getOptionalStringField(r5, r1)
            if (r1 == 0) goto L_0x0064
            r0.add(r1)
            goto L_0x0064
        L_0x007c:
            X.0eS.A00(r1)
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r3 = new X.2IS
            r3.<init>()
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r15 = 0
            java.lang.String r0 = "prompt_type"
            X.0Df r2 = r1.A02()
            r1 = r21
            X.0Df.A00(r2, r1, r0)
            java.lang.String r1 = "input"
            X.2IV r0 = r8.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r2, r1)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r9 = X.AnonymousClass1vS.A00()
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r3.getParamsCopy()
            java.lang.Class<com.instagram.direct.request.graphql.GetInstagramMessagingPromptV2SuggestionsResponseImpl> r13 = com.instagram.direct.request.graphql.GetInstagramMessagingPromptV2SuggestionsResponseImpl.class
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.lang.String r10 = "GetInstagramMessagingPromptV2Suggestions"
            r14 = 0
            java.lang.String r18 = "xfb_ig_messaging_promptv2_suggestions"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS
            r2 = 1
            long r0 = r9.toMillis(r2)
            X.1Ef r8 = r8.setFreshCacheAgeMs(r0)
            long r0 = r9.toMillis(r2)
            X.1Ef r1 = r8.setMaxToleratedCacheAgeMs(r0)
            X.1vn r0 = X.1vm.A01(r20)
            r5.A01 = r4
            r5.A00 = r6
            java.lang.Object r1 = r0.A04(r1, r5)
            if (r1 != r7) goto L_0x002c
            return r7
        L_0x00e8:
            X.ME7 r5 = new X.ME7
            r5.<init>(r3)
            goto L_0x001a
        L_0x00ef:
            java.lang.Object r0 = r4.invoke()
        L_0x00f3:
            return r0
        L_0x00f4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.request.DirectThreadApi.A0J(com.instagram.common.session.UserSession, java.lang.String, X.4D7, X.0sa):java.lang.Object");
    }

    public static final String A0K(List list) {
        return 002.A0E(C239023El.A00(',').A02(list), '[', ']');
    }
}
