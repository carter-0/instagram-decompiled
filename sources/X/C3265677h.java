package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.77h  reason: invalid class name and case insensitive filesystem */
public final class C3265677h {
    public static final 0bY A00 = new 1Q7("IgSecureUriParser").A00;
    public static final C3265677h A01 = new Object();
    public static final 11S A02 = new 11S(".*facebook\\.com");
    public static final 11S A03 = new 11S(".*fb\\.watch");

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r1 == null) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A04(X.2FW r5, java.lang.Object r6, boolean r7) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.Nt0 r0 = X.Nt0.$redex_init_class
            int r1 = r5.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x001b
            r0 = 4
            if (r1 == r0) goto L_0x0025
            java.lang.String r1 = r5.A00
        L_0x0012:
            if (r7 == 0) goto L_0x001a
        L_0x0014:
            java.lang.String r0 = "forward_"
            java.lang.String r1 = X.002.A0R(r0, r1)
        L_0x001a:
            return r1
        L_0x001b:
            if (r6 != 0) goto L_0x0022
            if (r7 == 0) goto L_0x0022
            java.lang.String r1 = r5.A00
            goto L_0x0014
        L_0x0022:
            java.lang.String r4 = ""
            goto L_0x0027
        L_0x0025:
            java.lang.String r4 = "visual_"
        L_0x0027:
            boolean r0 = r6 instanceof X.C300925yB
            java.lang.String r3 = "video"
            java.lang.String r2 = "photo"
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            X.5yB r6 = (X.C300925yB) r6
            boolean r0 = r6.A05()
        L_0x003d:
            if (r0 != 0) goto L_0x0040
            r3 = r2
        L_0x0040:
            r1.append(r3)
        L_0x0043:
            java.lang.String r1 = r1.toString()
            goto L_0x0012
        L_0x0048:
            boolean r0 = r6 instanceof X.C331377Qt
            if (r0 == 0) goto L_0x005b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            X.7Qt r6 = (X.C331377Qt) r6
            boolean r0 = r6.A01()
            goto L_0x003d
        L_0x005b:
            boolean r0 = r6 instanceof X.1Xj
            if (r0 == 0) goto L_0x006e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            X.1Xj r6 = (X.1Xj) r6
            boolean r0 = r6.CeS()
            goto L_0x003d
        L_0x006e:
            boolean r0 = r6 instanceof X.C271374ik
            if (r0 == 0) goto L_0x0091
            X.4ik r6 = (X.C271374ik) r6
            X.4iq r0 = r6.A04
            if (r0 == 0) goto L_0x0083
            boolean r0 = r0.A0V
            if (r0 != 0) goto L_0x007d
            r3 = r2
        L_0x007d:
            java.lang.String r1 = X.002.A0R(r4, r3)
            if (r1 != 0) goto L_0x0012
        L_0x0083:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "photo_or_video"
            r1.append(r0)
            goto L_0x0043
        L_0x0091:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid content for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3265677h.A04(X.2FW, java.lang.Object, boolean):java.lang.String");
    }

    public static final void A06(C391629tO r5, AnonymousClass0iw r6, UserSession userSession, String str, boolean z) {
        String str2;
        0qQ.A0B(userSession, 3);
        0wc A012 = AnonymousClass0kN.A01(r6, userSession);
        0Aj A002 = A012.A00(A012.A00, "mwb_actor_experience_event");
        if (A002.isSampled()) {
            A002.A8k("action", 12);
            A002.A8M(r5, "restriction_type");
            if (z) {
                str2 = "ig_direct_encrypted_group_thread";
            } else {
                str2 = "id_direct_group_thread";
            }
            A002.AAJ("surface", str2);
            0bb r2 = new 0bb();
            r2.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, -1L);
            r2.A03("is_fbid", false);
            A002.AAK(r2, "other_user");
            A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A002.Cgf();
        }
    }

    public static final void A07(EZa eZa, C48140EZi eZi, AnonymousClass0iw r5, 0lg r6, String str) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(str, 2);
        0wc A012 = AnonymousClass0kN.A01(r5, r6);
        0Aj A002 = A012.A00(A012.A00, "direct_thread_change_group_name");
        if (A002.isSampled()) {
            A002.AAJ("open_thread_id", str);
            A002.A8M(eZa, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.AAJ("action", "NAME_THREAD");
            A002.A8M(eZi, "thread_creation_entry_point");
            A002.Cgf();
        }
    }

    public static final void A08(C48140EZi eZi, AnonymousClass0iw r4, UserSession userSession) {
        String str;
        0qQ.A0B(userSession, 0);
        0wc A012 = AnonymousClass0kN.A01(r4, userSession);
        0Aj A002 = A012.A00(A012.A00, "direct_group_creation_fail");
        if (eZi == null || (str = eZi.A00) == null) {
            str = "unknown";
        }
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A002.Cgf();
    }

    public static final void A09(C48140EZi eZi, AnonymousClass0iw r4, UserSession userSession, String str, String str2, String str3, String str4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 2);
        if (str4.length() == 0) {
            0wj.A01.AEf("group_creation_creation_type_is_null_or_empty", 20134884).report();
        }
        0wc A012 = AnonymousClass0kN.A01(r4, userSession);
        0Aj A002 = A012.A00(A012.A00, "direct_group_creation_create");
        A002.AAJ("group_session_id", str);
        A002.AAJ("radio_type", "");
        A002.AAJ("share_sheet_session_id", str2);
        if (eZi == null) {
            eZi = C48140EZi.UNKNOWN;
        }
        A002.A8M(eZi, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
        A002.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
        A002.Cgf();
    }

    public static final void A0C(C48136EZe eZe, AnonymousClass0iw r5, 0lg r6, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, long j2) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r5, 1);
        0wc A012 = AnonymousClass0kN.A01(r5, r6);
        0Aj A002 = A012.A00(A012.A00, C66579MXk.A00(766));
        if (A002.isSampled()) {
            A002.A9F("position", Long.valueOf(j));
            A002.A9F("relative_position", Long.valueOf(j2));
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str11);
            A002.AAJ(C67009Mgh.A01(9, 10, 4), str5);
            A002.AAJ(C66579MXk.A00(162), str);
            A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            Long l = null;
            if (str4 != null) {
                l = Long.valueOf((long) str4.length());
            }
            A002.A9F("search_query_length", l);
            A002.AAe("recipient_ids", directShareTarget.A0C());
            A002.AAJ("recipient_removal_type", str3);
            A002.AAJ(C66579MXk.A00(1106), str4);
            A002.AAJ("share_sheet_session_id", str6);
            A002.AAJ("ranking_info_token", str10);
            A002.AAJ("inventory_source", str9);
            A002.A8M(eZe, "sheet_state");
            A002.AAJ("ranking_request_id", str7);
            A002.AAJ("media_type", str8);
            A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A002.Cgf();
        }
    }

    public static final void A0E(0xI r3, DirectThreadKey directThreadKey) {
        String str;
        List list = null;
        if (directThreadKey != null) {
            str = directThreadKey.A00;
            list = directThreadKey.A02;
        } else {
            str = null;
        }
        if (str != null) {
            r3.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        }
        if (list != null) {
            r3.A0D("recipient_ids", list);
        }
    }

    public static final void A0H(AnonymousClass0iw r1, 0lg r2, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, long j2) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r1, 1);
        0wc A012 = AnonymousClass0kN.A01(r1, r2);
        0Aj A002 = A012.A00(A012.A00, "direct_compose_unselect_recipient");
        if (A002.isSampled()) {
            A002.A9F("position", Long.valueOf(j));
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str9);
            A002.AAJ("recipient_removal_type", str3);
            A002.A9F("relative_position", Long.valueOf(j2));
            A002.AAJ(C66579MXk.A00(162), str);
            A002.AAe("recipient_ids", directShareTarget.A0B());
            A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A002.AAJ("share_sheet_session_id", str4);
            A002.AAJ("ranking_info_token", str8);
            A002.AAJ("inventory_source", str7);
            A002.AAJ("ranking_request_id", str5);
            A002.AAJ("media_type", str6);
            A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A002.Cgf();
        }
    }

    public static final void A0I(AnonymousClass0iw r1, 0lg r2, String str) {
        0qQ.A0B(str, 2);
        0wc A012 = AnonymousClass0kN.A01(r1, r2);
        0Aj A002 = A012.A00(A012.A00, "direct_thread_tap_small_media_to_enlarge");
        A002.AAJ("media_type", str);
        A002.Cgf();
    }

    public static final void A0J(AnonymousClass0iw r1, 0lg r2, String str, int i) {
        0qQ.A0B(str, 2);
        0wc A012 = AnonymousClass0kN.A01(r1, r2);
        0Aj A002 = A012.A00(A012.A00, "direct_thread_tap_stack");
        if (A002.isSampled()) {
            A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A002.A9F("stack_media_count", Long.valueOf((long) i));
            A002.Cgf();
        }
    }

    public static final void A0K(AnonymousClass0iw r1, 0lg r2, String str, String str2) {
        0qQ.A0B(r2, 0);
        0wc A012 = AnonymousClass0kN.A01(r1, r2);
        0Aj A002 = A012.A00(A012.A00, "direct_thread_tap_sender_profile");
        A002.AAJ("sender_id", str2);
        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.Cgf();
    }

    public static final void A0L(AnonymousClass0iw r3, 0lg r4, String str, String str2, String str3) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(str, 2);
        0qQ.A0B(str3, 4);
        0wc A012 = AnonymousClass0kN.A01(r3, r4);
        0Aj A002 = A012.A00(A012.A00, "ig_direct_modal_composer_send");
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A002.AAJ("media_type", str3);
        A002.AAJ("container_module", r3.getModuleName());
        A002.AAJ("media_id", str2);
        A002.Cgf();
    }

    public static final void A0M(AnonymousClass0iw r1, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r1, 1);
        0wc A012 = AnonymousClass0kN.A01(r1, userSession);
        0Aj A002 = A012.A00(A012.A00, "direct_compose_too_many_recipients_alert");
        A002.A9O("e_counter_channel", "");
        A002.Cgf();
    }

    public static final void A0N(AnonymousClass0iw r1, UserSession userSession, C254783t2 r3, Boolean bool, boolean z, boolean z2) {
        0qQ.A0B(r1, 5);
        0wc A012 = AnonymousClass0kN.A01(r1, userSession);
        0Aj A002 = A012.A00(A012.A00, "direct_composer_gallery_send_media");
        if (A002.isSampled()) {
            if (bool != null) {
                A002.A7p("from_gallery", bool);
            }
            A002.A7p("is_drag_and_drop", Boolean.valueOf(z2));
            A002.A7p("is_photo", Boolean.valueOf(z));
            A002.AAJ("open_thread_id", AnonymousClass4KK.A02(r3));
            A002.A9F("occamadillo_thread_id", AnonymousClass4KK.A01(r3));
            A002.A7p("is_e2ee", Boolean.valueOf(AnonymousClass6W3.A07(r3)));
            A002.Cgf();
        }
    }

    public static final void A0O(AnonymousClass0iw r5, UserSession userSession, Boolean bool, Integer num, String str, String str2, String str3) {
        String str4;
        0qQ.A0B(str2, 2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("comment_id", str3);
        if (bool != null) {
            if (bool.booleanValue()) {
                str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str4 = "0";
            }
            linkedHashMap.put("has_emoji", str4);
        }
        if (num != null) {
            linkedHashMap.put("private_reply_emoji", num.toString());
        }
        0wc A012 = AnonymousClass0kN.A01(r5, userSession);
        0Aj A002 = A012.A00(A012.A00, "direct_private_reply_events");
        A002.AAJ("action", str);
        A002.AAJ("commenter_id", str2);
        A002.A9H("event_data", linkedHashMap);
        A002.AAJ("error_message", (String) null);
        A002.Cgf();
    }

    public static final void A0Q(AnonymousClass0iw r4, UserSession userSession, String str) {
        String str2;
        C69487NmV nmV;
        C69462Nm6 nm6;
        C69489NmX nmX;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 2);
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "direct_inbox";
        0wc A002 = r1.A00();
        0Aj A003 = A002.A00(A002.A00, "direct_inbox_action");
        A003.AAJ("action", str);
        A003.Cgf();
        C327977Cy r3 = new C327977Cy(r4, userSession);
        String str3 = userSession.A06;
        switch (str.hashCode()) {
            case -1038808081:
                if (str.equals("filter_booked")) {
                    nm6 = C69462Nm6.CLICK;
                    nmV = C69487NmV.FILTER_MAIN_PAGE;
                    str2 = null;
                    nmX = C69489NmX.MARK_AS_APPOINTMENT;
                    break;
                } else {
                    return;
                }
            case -890177597:
                if (str.equals("filter_lead")) {
                    nm6 = C69462Nm6.CLICK;
                    nmV = C69487NmV.FILTER_MAIN_PAGE;
                    str2 = null;
                    nmX = C69489NmX.MARK_AS_LEAD;
                    break;
                } else {
                    return;
                }
            case -890062029:
                if (str.equals("filter_paid")) {
                    nm6 = C69462Nm6.CLICK;
                    nmV = C69487NmV.FILTER_MAIN_PAGE;
                    str2 = null;
                    nmX = C69489NmX.MARK_AS_PAID;
                    break;
                } else {
                    return;
                }
            case -495694250:
                if (str.equals("filter_unread")) {
                    nm6 = C69462Nm6.CLICK;
                    nmV = C69487NmV.FILTER_MAIN_PAGE;
                    str2 = null;
                    nmX = C69489NmX.MARK_AS_UNREAD;
                    break;
                } else {
                    return;
                }
            case -294655587:
                if (str.equals("filter_unanswered")) {
                    nm6 = C69462Nm6.CLICK;
                    nmV = C69487NmV.FILTER_MAIN_PAGE;
                    str2 = null;
                    nmX = C69489NmX.MARK_AS_UNANSWERED;
                    break;
                } else {
                    return;
                }
            case -141404276:
                if (str.equals("filter_shipped")) {
                    nm6 = C69462Nm6.CLICK;
                    nmV = C69487NmV.FILTER_MAIN_PAGE;
                    str2 = null;
                    nmX = C69489NmX.MARK_AS_SHIPPED;
                    break;
                } else {
                    return;
                }
            case 884896422:
                if (str.equals("filter_ordered")) {
                    nm6 = C69462Nm6.CLICK;
                    nmV = C69487NmV.FILTER_MAIN_PAGE;
                    str2 = null;
                    nmX = C69489NmX.MARK_AS_ORDER;
                    break;
                } else {
                    return;
                }
            case 1312801427:
                if (str.equals("filter_flagged")) {
                    nm6 = C69462Nm6.CLICK;
                    nmV = C69487NmV.FILTER_MAIN_PAGE;
                    str2 = null;
                    nmX = C69489NmX.FLAG;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        C327977Cy.A00(nmX, nm6, nmV, r3, str2, str3);
    }

    public static final void A0R(AnonymousClass0iw r4, UserSession userSession, String str, String str2, String str3, String str4) {
        0wc A012 = AnonymousClass0kN.A01(r4, userSession);
        0Aj A002 = A012.A00(A012.A00, "direct_business_interop_education_flow");
        A002.AAJ("action", str);
        A002.A7p(C66579MXk.A00(930), true);
        A002.A7p(AnonymousClass000.A00(3451), true);
        A002.AAJ("entrypoint", str2);
        A002.AAJ("event_location", str3);
        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str4);
        A002.Cgf();
    }

    public static final void A0S(AnonymousClass0iw r1, UserSession userSession, String str, String str2, String str3, String str4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r1, 1);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        0wc A012 = AnonymousClass0kN.A01(r1, userSession);
        0Aj A002 = A012.A00(A012.A00, "direct_private_reply_events");
        A002.AAJ("action", str);
        A002.AAJ("commenter_id", str2);
        A002.A9H("event_data", 0se.A0M(new 0eP("comment_id", str3)));
        A002.AAJ("error_message", str4);
        A002.Cgf();
    }

    public static final void A0T(AnonymousClass0iw r7, UserSession userSession, String str, String str2, String str3, String str4, String str5, List list, List list2, int i, int i2) {
        String str6;
        String valueOf;
        String str7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        if (list.size() == 1) {
            str6 = (String) list.get(0);
        } else {
            if (list.size() > 1) {
                linkedHashMap.put("thread_ids", list.toString());
            }
            str6 = "";
        }
        if (str4 != null) {
            linkedHashMap.put("source", str4);
        }
        if (!list2.isEmpty()) {
            linkedHashMap.put("labels", list2.toString());
        }
        int i3 = i2;
        if (i3 <= 1) {
            if (i3 == 1) {
                z = true;
            }
            valueOf = String.valueOf(z);
            str7 = "is_unread";
        } else {
            valueOf = String.valueOf(i3);
            str7 = "unread_count";
        }
        linkedHashMap.put(str7, valueOf);
        0wc A012 = AnonymousClass0kN.A01(r7, userSession);
        0Aj A002 = A012.A00(A012.A00, "direct_request_user_action");
        if (A002.isSampled()) {
            A002.AAJ("event_action_name", str);
            A002.A9F("ig_userid", Long.valueOf(Long.parseLong(str2)));
            A002.AAJ(AnonymousClass000.A00(1793), str3);
            A002.AAJ("selected_folder", str5);
            A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str6);
            A002.A9F("position", Long.valueOf((long) i));
            A002.AAJ("extra_client_data", linkedHashMap.toString());
            A002.Cgf();
        }
    }

    public static final void A0V(0xF r9, 0lg r10, C270214gN r11, DirectThreadKey directThreadKey, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r10, 0);
        0qQ.A0B(directThreadKey, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(r11, 8);
        0qQ.A0B(r9, 9);
        A0r(str);
        0xI A032 = A03("failed", z2);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        Boolean valueOf = Boolean.valueOf(z3);
        A032.A09("is_shh_mode", valueOf);
        boolean z4 = z;
        A0F(A032, z4);
        A0D(A032, r11);
        Long valueOf2 = Long.valueOf(j);
        A032.A0B("total_duration", valueOf2);
        A032.A04(r9);
        A0E(A032, directThreadKey);
        C60510iO.A00(r10).EFq(A032);
        "direct_message_failed".getClass();
        0xI A012 = 0xI.A01("direct_message_failed", (String) null);
        A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A012.A0C("client_context", str2);
        A012.A09("is_shh_mode", valueOf);
        A0F(A012, z4);
        A0D(A012, r11);
        A012.A0B("total_duration", valueOf2);
        A012.A04(r9);
        A0E(A012, directThreadKey);
        C60510iO.A00(r10).EFq(A012);
    }

    public static final void A0W(0xF r3, 0lg r4, DirectThreadKey directThreadKey, String str, String str2, long j, boolean z, boolean z2) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(directThreadKey, 1);
        0qQ.A0B(str, 2);
        0xI A032 = A03("sent", z);
        A0r(str);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        A032.A0B("total_duration", Long.valueOf(j));
        A032.A09("is_shh_mode", Boolean.valueOf(z2));
        if (r3 != null) {
            A032.A04(r3);
        }
        A0E(A032, directThreadKey);
        C60510iO.A00(r4).EFq(A032);
    }

    public static final void A0X(0xF r3, 0lg r4, DirectThreadKey directThreadKey, String str, String str2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(str, 2);
        0qQ.A0B(r3, 7);
        0xI A032 = A03("send_attempt", z2);
        A0r(str);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        A032.A09("is_shh_mode", Boolean.valueOf(z3));
        A0F(A032, z);
        A032.A04(r3);
        A0E(A032, directThreadKey);
        C60510iO.A00(r4).EFq(A032);
    }

    public static final void A0Y(0xF r2, Integer num) {
        0qQ.A0B(r2, 0);
        0xF.A00(r2, XD9.A00(num), "channel");
    }

    public static final void A0Z(0xF r2, Integer num) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(num, 1);
        0xF.A00(r2, XD9.A00(num), "channel");
    }

    public static final void A0a(0xF r2, Integer num) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(num, 1);
        0xF.A00(r2, XD9.A00(num), "channel");
    }

    public static final void A0c(0wc r2, String str, String str2, boolean z) {
        0qQ.A0B(str, 1);
        0Aj A002 = r2.A00(r2.A00, "direct_thread_change_group_photo");
        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.AAJ("action", str2);
        A002.A7p("is_e2ee", Boolean.valueOf(z));
        A002.Cgf();
    }

    public static final void A0g(0lg r1, DirectThreadKey directThreadKey, 2FW r3, String str, boolean z) {
        0qQ.A0B(r1, 0);
        if (r3 != 2FW.A1A) {
            A0i(r1, directThreadKey, r3.A00, str, z);
            return;
        }
        throw new IllegalStateException("Must use String overload and DirectAnalyticsUtil#getMessageType() with MEDIA types");
    }

    public static final void A0h(0lg r4, DirectThreadKey directThreadKey, String str, String str2) {
        0qQ.A0B(str, 2);
        0xI A032 = A03("retry_attempt", false);
        A0r(str);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        A032.A0C("channel", "Unset");
        C60510iO.A00(r4).EFq(A032);
        A0i(r4, directThreadKey, str, str2, false);
    }

    public static final void A0i(0lg r3, DirectThreadKey directThreadKey, String str, String str2, boolean z) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(str, 2);
        0xI A032 = A03("send_intent", z);
        A0r(str);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        A032.A0C("channel", "Unset");
        A0E(A032, directThreadKey);
        C60510iO.A00(r3).EFq(A032);
    }

    public static final void A0k(0lg r2, C254743sy r3, String str, boolean z) {
        C69442Nlm nlm;
        0qQ.A0B(r3, 2);
        AnonymousClass0kM r1 = new AnonymousClass0kM(r2);
        r1.A01 = "direct_thread";
        0wc A002 = r1.A00();
        0Aj A003 = A002.A00(A002.A00, "direct_delete_message_cancel");
        if (A003.isSampled()) {
            A003.AAJ("action", "cancel");
            A003.A7p("is_e2ee", Boolean.valueOf(C66647MaG.A0E(r3)));
            if (z) {
                nlm = C69442Nlm.DIALOG;
            } else {
                nlm = C69442Nlm.BULK_SELECTION;
            }
            A003.A8M(nlm, C66579MXk.A00(356));
            A003.AAJ("message_id", str);
            A003.AAJ("open_thread_id", C67003Mgb.A01(r3));
            A003.A9F("occamadillo_thread_id", C67003Mgb.A00(r3));
            A003.Cgf();
        }
    }

    public static final void A0m(0lg r3, String str, String str2) {
        0qQ.A0B(str, 1);
        0xI A032 = A03("cancelled", false);
        A0r(str);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        A032.A0C("channel", "Unset");
        C60510iO.A00(r3).EFq(A032);
    }

    public static final void A0n(0lg r2, String str, boolean z) {
        0qQ.A0B(r2, 0);
        AnonymousClass0kM r1 = new AnonymousClass0kM(r2);
        r1.A01 = "direct_inbox";
        0wc A002 = r1.A00();
        0Aj A003 = A002.A00(A002.A00, "direct_inbox_action");
        A003.AAJ("action", "thread_flag");
        A003.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A003.A7p("is_interop", Boolean.valueOf(z));
        A003.Cgf();
    }

    public static final void A0o(UserSession userSession, int i) {
        0qQ.A0B(userSession, 0);
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "direct_inbox";
        0wc A002 = r1.A00();
        0Aj A003 = A002.A00(A002.A00, "direct_inbox_tab_impression");
        A003.A8k("tab", Integer.valueOf(i));
        A003.Cgf();
    }

    public static final void A0p(UserSession userSession, String str, long j, long j2, long j3) {
        0qQ.A0B(userSession, 0);
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "direct_inbox";
        0wc A002 = r1.A00();
        0Aj A003 = A002.A00(A002.A00, "direct_iris_error_state_event");
        if (A003.isSampled()) {
            A003.AAJ("action", str);
            A003.A9F("ig_userid", Long.valueOf(Long.parseLong(userSession.A06)));
            A003.A9F("current_seq_id", Long.valueOf(j));
            A003.A9F("latest_seq_id", Long.valueOf(j2));
            A003.A9F("iris_stuck_time", Long.valueOf(j3));
            A003.Cgf();
        }
    }

    public static final void A0q(UserSession userSession, String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        0wc A012 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
        0Aj A002 = A012.A00(A012.A00, "mwb_muted_words_fetch_event");
        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        int i = 2;
        if (z) {
            i = 1;
        }
        A002.A8k("muted_status", Integer.valueOf(i));
        A002.AAJ("fetch_id", str2);
        A002.AAJ("dictionary_id", str3);
        if (z2) {
            str4 = "open_group";
        } else {
            str4 = "open_one_to_one";
        }
        A002.AAJ("thread_type", str4);
        A002.Cgf();
    }

    public static final 0xI A01(AnonymousClass0iw r1, String str, String str2, String str3) {
        0xI A002 = 0xI.A00(r1, "direct_quick_reply_waterfall");
        A002.A0C("action", str);
        A002.A0C("source_module", str2);
        A002.A0C("waterfall_id", str3);
        return A002;
    }

    public static final 0xI A02(C241953Sa r3, String str, boolean z) {
        "direct_message_mark_waterfall".getClass();
        0xI A012 = 0xI.A01("direct_message_mark_waterfall", (String) null);
        A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r3.A00());
        A012.A0C("client_context", r3.A01);
        A012.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r3.A04);
        A012.A0C("message_id", r3.A02);
        A012.A0B("date_created", Long.valueOf(r3.A00));
        A012.A0C("action", str);
        if (z) {
            A012.A09("sampled", true);
        }
        return A012;
    }

    public static final 0xI A03(String str, boolean z) {
        "direct_message_waterfall".getClass();
        0xI A012 = 0xI.A01("direct_message_waterfall", (String) null);
        A012.A0C("action", str);
        A012.A0C("dedupe_token", UUID.randomUUID().toString());
        if (z) {
            A012.A09("sampled", true);
        }
        return A012;
    }

    public static final void A0B(XSV xsv, AnonymousClass0iw r4, 0lg r5, 1iA r6, String str, String str2, boolean z) {
        String str3;
        if (r6 == 1iA.A0Q || r6 == 1iA.A0a) {
            0wc A012 = AnonymousClass0kN.A01(r4, r5);
            0Aj A002 = A012.A00(A012.A00, "direct_save_media");
            if (A002.isSampled()) {
                A002.A9O("saved", Boolean.valueOf(z));
                A002.A9O("e_counter_channel", "");
                String name = r6.name();
                if (name != null) {
                    str3 = name.toLowerCase(Locale.ROOT);
                    0qQ.A07(str3);
                } else {
                    str3 = null;
                }
                A002.AAJ("media_type", str3);
                A002.AAJ("reason", str);
                A002.AAJ("media_source", str2);
                A002.A8M(xsv, "thread_type");
                A002.Cgf();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final void A0D(0xI r2, C270214gN r3) {
        r2.A0C(AnonymousClass000.A00(34), r3.A01.A01);
        r2.A0C(TraceFieldType.ErrorCode, r3.A03);
        r2.A0C(AnonymousClass000.A00(283), r3.A04);
    }

    public static final void A0F(0xI r2, boolean z) {
        if (z) {
            r2.A09("is_silent", true);
        }
    }

    public static final void A0U(0xF r1) {
        A0Y(r1, AnonymousClass05K.A0C);
    }

    public static final void A0b(0wc r2, String str, String str2, long j) {
        0Aj A002 = r2.A00(r2.A00, "update_ttlc_settings");
        A002.AAJ("event_trigger_type", str2);
        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.A9F("ttlc_modes", Long.valueOf(j));
        A002.Cgf();
    }

    public static final void A0d(0wc r2, String str, String str2, boolean z) {
        0Aj A002 = r2.A00(r2.A00, "update_dm_settings");
        A002.AAJ("event_trigger_type", str2);
        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.A7p("toggle_value", Boolean.valueOf(z));
        A002.Cgf();
    }

    public static final void A0e(0wc r2, String str, String str2, boolean z) {
        0Aj A002 = r2.A00(r2.A00, "update_tlc_settings");
        A002.AAJ("event_trigger_type", str2);
        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.A7p("toggle_value", Boolean.valueOf(z));
        A002.Cgf();
    }

    public static final void A0f(0lg r2, int i) {
        AnonymousClass0kM r1 = new AnonymousClass0kM(r2);
        r1.A01 = "direct_inbox";
        0wc A002 = r1.A00();
        0Aj A003 = A002.A00(A002.A00, "direct_inbox_action");
        A003.AAJ("action", "multiple_thread_muted_messages");
        A003.A9F(AnonymousClass000.A00(5330), Long.valueOf((long) i));
        A003.Cgf();
    }

    public static final void A0j(0lg r2, C254743sy r3) {
        AnonymousClass0kM r1 = new AnonymousClass0kM(r2);
        r1.A01 = "direct_inbox";
        0wc A002 = r1.A00();
        0Aj A003 = A002.A00(A002.A00, "direct_inbox_action");
        A003.AAJ("action", "thread_deleted");
        A003.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C66647MaG.A0A(r3));
        A003.AAJ("open_thread_id", C67003Mgb.A01(r3));
        A003.A9F("occamadillo_thread_id", C67003Mgb.A00(r3));
        A003.A7p("is_e2ee", Boolean.valueOf(C66647MaG.A0E(r3)));
        A003.Cgf();
    }

    public static final void A0l(0lg r2, Integer num, String str, int i, boolean z) {
        AnonymousClass0kM r1 = new AnonymousClass0kM(r2);
        r1.A01 = "direct_inbox";
        0wc A002 = r1.A00();
        0Aj A003 = A002.A00(A002.A00, "direct_inbox_action");
        A003.AAJ("action", "thread_move");
        A003.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A003.A7p("is_interop", Boolean.valueOf(z));
        A003.A9F("folder", Long.valueOf((long) i));
        if (num != null) {
            A003.A9F("position", Long.valueOf((long) num.intValue()));
        }
        A003.Cgf();
    }

    public static final void A0r(String str) {
        if (str.equals(2FW.A1A.A00) || str.equals(2FW.A0q.A00)) {
            0wb.A04("DirectAnalyticsUtil_invalid_content_type", 002.A0R("Invalid contentType: ", str), 1);
        }
    }

    public static final 1Ln A00(AnonymousClass0iw r2, 0lg r3, C254743sy r4, boolean z, boolean z2, boolean z3) {
        String str;
        1Ln A05 = 1Ln.A05(AnonymousClass0kN.A01(r2, r3));
        A05.A0O("is_e2ee", Boolean.valueOf(z));
        A05.A0O("is_barcelona_installed", Boolean.valueOf(z2));
        A05.A0O("is_barcelona_link", Boolean.valueOf(z3));
        C254793t3 A08 = C66647MaG.A08(r4);
        if (A08 != null) {
            if (r4 != null) {
                str = C66647MaG.A0A(r4);
            } else {
                str = null;
            }
            A05.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A05.A0Q("occamadillo_thread_id", AnonymousClass4KK.A01(A08));
            A05.A0R("open_thread_id", AnonymousClass4KK.A02(A08));
        }
        return A05;
    }

    public static final void A05(C391629tO r3, C391549tG r4, AnonymousClass0iw r5, UserSession userSession, String str, String str2, int i, boolean z, boolean z2) {
        String str3;
        long j;
        Long A0n;
        0wc A012 = AnonymousClass0kN.A01(r5, userSession);
        0Aj A002 = A012.A00(A012.A00, "mwb_actor_experience_event");
        if (A002.isSampled()) {
            A002.A8k("action", Integer.valueOf(i));
            A002.A8M(r3, "restriction_type");
            if (z2) {
                if (z) {
                    str3 = "ig_direct_encrypted_group_thread";
                } else {
                    str3 = "id_direct_group_thread";
                }
            } else if (z) {
                str3 = "ig_direct_encrypted_thread";
            } else {
                str3 = "id_direct_thread";
            }
            A002.AAJ("surface", str3);
            0bb r32 = new 0bb();
            if (str == null || (A0n = 00y.A0n(10, str)) == null) {
                j = -1;
            } else {
                j = A0n.longValue();
            }
            r32.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(j));
            r32.A03("is_fbid", false);
            A002.AAK(r32, "other_user");
            A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A002.A8M(r4, "invalid_invite_composer_block_reason");
            A002.Cgf();
        }
    }

    public static final void A0A(C3263576k r3, C69445Nlp nlp, AnonymousClass0iw r5, UserSession userSession, String str) {
        0wc A012 = AnonymousClass0kN.A01(r5, userSession);
        0Aj A002 = A012.A00(A012.A00, "direct_group_block_warning_dialog_action");
        A002.AAJ("action", str);
        A002.A8M(r3, "source");
        A002.A8M(nlp, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A002.Cgf();
    }

    public static final void A0P(AnonymousClass0iw r1, UserSession userSession, Boolean bool, String str, int i) {
        0wc A012 = AnonymousClass0kN.A01(r1, userSession);
        0Aj A002 = A012.A00(A012.A00, "direct_business_inbox_hmps_events");
        A002.AAJ("action", str);
        A002.A8k("hmps_state", Integer.valueOf(i));
        if (bool != null) {
            A002.A7p("is_persistent", bool);
        }
        A002.Cgf();
    }

    public static final void A0G(AnonymousClass0iw r9, 0xF r10, UserSession userSession, 1Xl r12, DirectShareTarget directShareTarget, 2FW r14, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        long parseLong;
        String str9;
        0Aj A002;
        String str10;
        String A0F;
        String str11;
        1Xj BPf;
        String A09;
        Long l;
        0qQ.A0B(userSession, 0);
        String str12 = str;
        0qQ.A0B(str12, 4);
        String str13 = str6;
        if (r12 == null || (BPf = r12.BPf()) == null || !BPf.CcK()) {
            0xI A012 = 0xI.A01("direct_reshare_send", str12);
            A012.A09("comment_included", Boolean.valueOf(z));
            A012.A0C("source_of_reshare", r9.getModuleName());
            A012.A09("is_close_friends_blast", false);
            A012.A09("is_recent_thread", false);
            String str14 = str3;
            if (str3 != null && !z2) {
                A012.A0C("reel_id", str14);
                1OP r0 = 1OP.$redex_init_class;
                ReelStore A032 = ReelStore.A03(userSession);
                0qQ.A07(A032);
                Reel A0M = A032.A0M(str14);
                if (r14 == 2FW.A1e && A0M != null && (A0M.A0b() || A0M.A0P == ReelType.A05)) {
                    Set A0Q = A0M.A0Q();
                    0qQ.A07(A0Q);
                    Iterator it = directShareTarget.A0B().iterator();
                    boolean z3 = false;
                    while (it.hasNext()) {
                        Object next = it.next();
                        Iterator it2 = A0Q.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                List A3c = ((1Xj) it2.next()).A3c();
                                if (A3c != null && A3c.contains(next)) {
                                    z3 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z3) {
                        str11 = "mwf_tagged_friend ";
                    } else {
                        str11 = "mwf_other ";
                    }
                    A012.A0C("recipient_type ", str11);
                }
            }
            String str15 = str4;
            if (str4 != null) {
                A012.A0C("tray_session_id", str15);
            }
            String str16 = str5;
            if (str5 != null) {
                A012.A0C("viewer_session_id", str16);
            }
            if (str6 != null) {
                A012.A0C("share_sheet_session_id", str13);
            }
            String str17 = str7;
            if (str7 != null) {
                A012.A0C("audio_cluster_id", str17);
            }
            if (r12 != null) {
                1Xj BPf2 = r12.BPf();
                if (!182.A06(0Tu.A05, userSession, 36323921401884273L)) {
                    A012.A0C("m_pk", BPf2.getId());
                }
                Integer num4 = num2;
                if (num2 != null) {
                    A012.A08(num4, "m_ix");
                }
                Integer num5 = num3;
                if (num3 != null) {
                    A012.A08(num5, "recs_ix");
                }
                String str18 = str2;
                if (str2 != null) {
                    A012.A0C("parent_m_pk", str18);
                }
                String mezqlToken = BPf2.A0C.getMezqlToken();
                if (mezqlToken != null) {
                    A012.A0C("mezql_token", mezqlToken);
                }
                String loggingInfoToken = BPf2.A0C.getLoggingInfoToken();
                if (loggingInfoToken != null) {
                    A012.A0C("ranking_info_token", loggingInfoToken);
                }
                String BIl = BPf2.A0C.BIl();
                if (BIl != null) {
                    A012.A0C("inventory_source", BIl);
                }
                Integer valueOf = Integer.valueOf(BPf2.BR7().A00);
                if (valueOf != null) {
                    A012.A08(valueOf, "m_t");
                }
                Integer valueOf2 = Integer.valueOf(BPf2.BR7().A00);
                if (valueOf2 != null) {
                    A012.A08(valueOf2, "media_type");
                }
                if (r12 instanceof AnonymousClass3OA) {
                    A012.A07(C271774jZ.A9M, "ad");
                    AnonymousClass3OA r4 = (AnonymousClass3OA) r12;
                    A012.A0C("ad_id", r4.A0S);
                    str10 = "tracking_token";
                    A0F = r4.A0j;
                } else if (r12.BPf().CcK()) {
                    1Xj BPf3 = r12.BPf();
                    A012.A07(C271774jZ.A9M, "ad");
                    A012.A0C("ad_id", C231122qu.A07(userSession, BPf3));
                    str10 = "tracking_token";
                    A0F = C231122qu.A0F(userSession, BPf3);
                } else {
                    A012.A07(C271774jZ.A9M, "organic");
                }
                A012.A0C(str10, A0F);
            }
            if (r10 != null) {
                A012.A04(r10);
            }
            List<DirectShareTarget> singletonList = Collections.singletonList(directShareTarget);
            0qQ.A07(singletonList);
            if (!singletonList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList = new ArrayList();
                for (DirectShareTarget directShareTarget2 : singletonList) {
                    C254783t2 r1 = directShareTarget2.A09;
                    r1.getClass();
                    if (r1 instanceof C254763t0) {
                        arrayList.add(((C254763t0) r1).A00);
                    }
                    List<PendingRecipient> unmodifiableList = Collections.unmodifiableList(directShareTarget2.A0Q);
                    0qQ.A07(unmodifiableList);
                    for (PendingRecipient id : unmodifiableList) {
                        linkedHashSet.add(id.getId());
                    }
                }
                A012.A0D("thread_ids", arrayList);
                A012.A0D("recipient_ids", 00k.A0a(linkedHashSet));
            }
            C60510iO.A00(userSession).EFq(A012);
            if (r12 != null) {
                1Xj BPf4 = r12.BPf();
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36323921402015346L)) {
                    parseLong = 0;
                } else {
                    String A30 = BPf4.A30();
                    if (A30 != null) {
                        parseLong = Long.parseLong(A30);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (182.A06(r2, userSession, 36323921402146420L)) {
                    str9 = AnonymousClass1QI.A00.A02.A00;
                } else {
                    str9 = null;
                }
                0wc A022 = AnonymousClass0kN.A02(userSession);
                A002 = A022.A00(A022.A00, "ig_direct_reshare_send_do_not_use");
                A002.A9F("media_id", Long.valueOf(parseLong));
                A002.AAJ("container_module", str12);
                A002.AAJ("ranking_info_token", BPf4.A0C.getLoggingInfoToken());
                A002.AAJ("canonical_nav_chain", str9);
            } else {
                return;
            }
        } else {
            1Xj BPf5 = r12.BPf();
            AnonymousClass0kM r02 = new AnonymousClass0kM(userSession);
            r02.A00 = r9;
            0wc A003 = r02.A00();
            A002 = A003.A00(A003.A00, "instagram_ad_direct_reshare_send");
            String str19 = "";
            if (182.A06(0Tu.A05, userSession, 36323921401884273L)) {
                A09 = str19;
            } else {
                A09 = C294185m0.A09(BPf5);
            }
            if (A002.isSampled()) {
                0qQ.A0B(BPf5, 1);
                User A2A = BPf5.A2A(userSession);
                0qQ.A0A(A2A);
                A002.AAJ("a_pk", Long.valueOf(Long.parseLong(A2A.getId())).toString());
                A002.AAJ("follow_status", C294185m0.A06(userSession, BPf5));
                A002.AAJ("m_pk", A09);
                A002.A9F("m_t", Long.valueOf((long) BPf5.BR7().A00));
                A002.AAJ("source_of_action", r9.getModuleName());
                String C9L = BPf5.C9L();
                if (C9L != null) {
                    str19 = C9L;
                }
                A002.AAJ("tracking_token", str19);
                A002.AAJ("action", C294185m0.A08(BPf5));
                A002.A9F("ad_id", C294185m0.A01(userSession, BPf5));
                A002.AAJ("delivery_flags", C243413Yr.A00(BPf5.A0e));
                A002.A9F("elapsed_time_since_last_item", -1L);
                A002.AAJ("feed_request_id", BPf5.A0R);
                A002.AAJ("inventory_source", BPf5.A0C.BIl());
                A002.A7p("is_acp_delivered", false);
                A002.A7p("is_eof", BPf5.A0C.CSj());
                A002.A9F("m_ts", Long.valueOf(BPf5.A1A()));
                A002.A9F("top_liker_count", C294185m0.A02(userSession, BPf5));
                A002.AAJ("carousel_cover_media_id", C294185m0.A0A(BPf5, num));
                A002.A9F("carousel_index", C294185m0.A03(BPf5, num));
                A002.A9F("carousel_m_t", C294185m0.A04(BPf5, num));
                A002.AAJ("carousel_media_id", C294185m0.A0B(BPf5, num));
                A002.A9F("carousel_size", C294185m0.A05(BPf5, num));
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.AAJ("subtype", str8);
                A002.AAJ("share_sheet_session_id", str13);
                String A0H = C231122qu.A0H(userSession, BPf5.getId());
                if (A0H != null) {
                    l = 00y.A0n(10, A0H);
                } else {
                    l = null;
                }
                A002.A9F("host_profile_id", l);
            } else {
                return;
            }
        }
        A002.Cgf();
    }
}
