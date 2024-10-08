package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.6gx  reason: invalid class name and case insensitive filesystem */
public final class C313756gx implements AnonymousClass0lh {
    public Boolean A00;
    public String A01;
    public final long A02;
    public final 0wc A03;
    public final UserSession A04;

    public static final String A06(List list) {
        if (list.contains(0) || list.contains(3)) {
            return "instagram";
        }
        if (list.contains(1)) {
            return "broadcast";
        }
        return "subscriber_broadcast";
    }

    public final void A0H(2FW r5, Integer num, String str, boolean z) {
        String obj;
        1Ln A0E;
        String str2;
        0qQ.A0B(num, 3);
        if (2FW.A09.contains(r5) && num == AnonymousClass05K.A0N) {
            obj = r5.toString();
            A0E = 1Ln.A0E(this.A03);
            if (A0E.A00.isSampled()) {
                A0E.A0h(Long.valueOf(this.A02));
                str2 = "xposting_disabled_unsupported_send_type";
            } else {
                return;
            }
        } else if (2FW.A08.contains(r5) && !z) {
            int intValue = num.intValue();
            if (intValue == 2) {
                obj = r5.toString();
                A0E = 1Ln.A0E(this.A03);
                if (A0E.A00.isSampled()) {
                    A0E.A0h(Long.valueOf(this.A02));
                    str2 = "xposting_disabled_manual_opt_out";
                } else {
                    return;
                }
            } else if (intValue == 1) {
                obj = r5.toString();
                A0E = 1Ln.A0E(this.A03);
                if (A0E.A00.isSampled()) {
                    A0E.A0h(Long.valueOf(this.A02));
                    str2 = "xposting_disabled_collaborator_moderator";
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        A0E.A0l(str2);
        A0E.A0k("tap");
        A0E.A0p("composer_send_button");
        A0E.A0q("thread_view");
        A0E.A0o("broadcast");
        A0E.A0s(str);
        A0E.A0v(this.A01);
        A0E.A0w(0se.A0M(new 0eP("send_type", obj)));
        A0E.Cgf();
    }

    public final void A0I(Dc9 dc9, String str, boolean z) {
        String str2;
        String str3;
        0qQ.A0B(dc9, 0);
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            HashMap hashMap = new HashMap();
            hashMap.put("creator_igid", str);
            int ordinal = dc9.ordinal();
            if (ordinal == 2) {
                str2 = "all_notifications_enabled";
            } else if (ordinal == 1) {
                str2 = "some_notifications_enabled";
            } else if (ordinal == 0) {
                str2 = "notifications_disabled";
            } else {
                throw new RuntimeException();
            }
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l(str2);
            if (z) {
                str3 = "toggle";
            } else {
                str3 = "tap";
            }
            A0E.A0k(str3);
            A0E.A0p("broadcast_chats_notifications");
            A0E.A0q("profile_notification_settings");
            A0E.A0o("instagram");
            A0E.A0w(hashMap);
            A0E.Cgf();
        }
    }

    public final void A0X(String str, String str2, String str3, boolean z) {
        String str4;
        0qQ.A0B(str2, 1);
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled() && str3 != null) {
            A0E.A0h(Long.valueOf(this.A02));
            if (z) {
                str4 = "live_stream_end";
            } else {
                str4 = "live_stream_end_cancel";
            }
            A0E.A0l(str4);
            A0E.A0k("tap");
            A0E.A0p("end_live_button");
            A0E.A0q("live_stream_view");
            A0E.A0o("broadcast");
            A0E.A0s(str3);
            A0E.A0i((Long) null);
            A0E.A0v(this.A01);
            A0E.A0w(0Yt.A06(new 0eP[]{new 0eP("live_id", str), new 0eP("audience", str2)}));
            A0E.Cgf();
        }
    }

    public final void A0Y(String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        String str5;
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled() && str != null) {
            HashMap hashMap = new HashMap();
            if (z2) {
                str4 = "True";
            } else {
                str4 = "False";
            }
            hashMap.put(C66579MXk.A00(139), str4);
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("user_nux_sheet_rendered");
            A0E.A0k("tap");
            A0E.A0p(A05(str, false));
            A0E.A0q(A04(str));
            if (z) {
                str5 = "subscriber_broadcast";
            } else {
                str5 = "broadcast";
            }
            A0E.A0o(str5);
            A0E.A0s(str2);
            A0E.A0i(00y.A0n(10, str3));
            A0E.A0v(this.A01);
            A0E.A0w(hashMap);
            A0E.Cgf();
        }
    }

    public final void A0a(String str, String str2, boolean z) {
        String str3;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("leave_user_nux");
            A0E.A0k("tap");
            A0E.A0p("exit_user_nux_button");
            A0E.A0q("broadcast_chat_creator_nux");
            if (z) {
                str3 = "subscriber_broadcast";
            } else {
                str3 = "broadcast";
            }
            A0E.A0o(str3);
            A0E.A0s(str);
            A0E.A0i(00y.A0n(10, str2));
            A0E.Cgf();
        }
    }

    public static final String A00(ChannelCreationSource channelCreationSource) {
        switch (channelCreationSource.ordinal()) {
            case 0:
                return AnonymousClass000.A00(239);
            case 1:
                return "edit_profile";
            case 2:
            case 3:
                return "mimicry_upsell_banner";
            case 4:
                return "dm_creation_omnipicker";
            case 5:
                return "professional_dashboard";
            case 6:
                return "profile";
            case 7:
                return "inbox";
            case 8:
            case 9:
            case 10:
            case 11:
                return "create_channel";
            default:
                throw new RuntimeException();
        }
    }

    public static final String A02(C69318NjJ njJ) {
        if (njJ == C69318NjJ.CHAT_STICKER || njJ == C69318NjJ.MESSAGE_SHARE_STICKER || njJ == C69318NjJ.MESSAGE_SHARE_STICKER_ATTRIBUTION) {
            return "story";
        }
        if (njJ == C69318NjJ.CLIPS_CHAT_STICKER) {
            return "reel";
        }
        return "thread_view";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0171, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0179, code lost:
        return X.AnonymousClass000.A00(239);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return "pin_to_profile";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        return "invalid entrypoint";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        return "invite_link";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fd, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ff, code lost:
        return "message_in_story";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013f, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0141, code lost:
        return "story_ad";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0167, code lost:
        if (r4.equals(r0) != false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(java.lang.String r4) {
        /*
            java.lang.String r3 = "pin_to_profile"
            java.lang.String r2 = "direct_broadcast_channel_featured_event"
            java.lang.String r1 = "inbox_search"
            int r0 = r4.hashCode()
            switch(r0) {
                case -1858634218: goto L_0x016b;
                case -1711269324: goto L_0x0161;
                case -1481339854: goto L_0x0156;
                case -1362237225: goto L_0x0153;
                case -1126946350: goto L_0x0144;
                case -862848618: goto L_0x0139;
                case -854071618: goto L_0x012e;
                case -682350593: goto L_0x011f;
                case -542631291: goto L_0x011c;
                case -443204946: goto L_0x010d;
                case -260327710: goto L_0x0102;
                case -55197827: goto L_0x00f7;
                case 3182: goto L_0x00ec;
                case 3275: goto L_0x00e1;
                case 100344454: goto L_0x00d6;
                case 216169857: goto L_0x00cf;
                case 268024154: goto L_0x00c4;
                case 271635469: goto L_0x00b9;
                case 279056467: goto L_0x00aa;
                case 301517358: goto L_0x009f;
                case 756934966: goto L_0x0094;
                case 761528537: goto L_0x008d;
                case 906349059: goto L_0x008a;
                case 909585339: goto L_0x007f;
                case 917422530: goto L_0x0074;
                case 922557714: goto L_0x0069;
                case 937341257: goto L_0x005e;
                case 1113541012: goto L_0x004f;
                case 1154607742: goto L_0x004b;
                case 1282438471: goto L_0x0040;
                case 1379332476: goto L_0x0035;
                case 1438298813: goto L_0x002a;
                case 1530211841: goto L_0x0026;
                case 1657724394: goto L_0x001b;
                case 1691989976: goto L_0x0010;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r3 = "invalid entrypoint"
        L_0x000f:
            return r3
        L_0x0010:
            java.lang.String r0 = "channel_challenge_push_notification"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "challenge_notification"
            return r3
        L_0x001b:
            java.lang.String r0 = "direct_thread_details_member_cta_button"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "member_cta_button"
            return r3
        L_0x0026:
            java.lang.String r0 = "reel_viewer_message_share_sticker_tooltip"
            goto L_0x00f9
        L_0x002a:
            java.lang.String r0 = "reel_viewer_channel_challenge_sticker"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "challenge_story_sticker"
            return r3
        L_0x0035:
            java.lang.String r0 = "creator_dm"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "creator_dm_upsell"
            return r3
        L_0x0040:
            java.lang.String r0 = "clips_viewer_chat_sticker"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "reel_sticker"
            return r3
        L_0x004b:
            java.lang.String r0 = "story_ad_cta"
            goto L_0x013b
        L_0x004f:
            r0 = 269(0x10d, float:3.77E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "thread_challenge_shared_xma"
            return r3
        L_0x005e:
            java.lang.String r0 = "direct_feed_channel_cta"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "feed_post"
            return r3
        L_0x0069:
            java.lang.String r0 = "channel_challenge_link"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "challenge_3p_shared_link"
            return r3
        L_0x0074:
            java.lang.String r0 = "quick_promotions"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "inbox_quick_promotion"
            return r3
        L_0x007f:
            java.lang.String r0 = "direct_feed_netego"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "feed_netego"
            return r3
        L_0x008a:
            java.lang.String r0 = "channel_link_xma"
            goto L_0x0096
        L_0x008d:
            boolean r0 = r4.equals(r2)
            if (r0 == 0) goto L_0x000d
            return r2
        L_0x0094:
            java.lang.String r0 = "fbapp_direct_link"
        L_0x0096:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "invite_link"
            return r3
        L_0x009f:
            java.lang.String r0 = "user_detail_ad_cta"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "profile_banner_ad"
            return r3
        L_0x00aa:
            r0 = 56
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "channel_shared"
            return r3
        L_0x00b9:
            java.lang.String r0 = "feed_ad_media_tooltip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "feed_post_tooltip_ad"
            return r3
        L_0x00c4:
            java.lang.String r0 = "reels_ad_cta"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "reels_ad"
            return r3
        L_0x00cf:
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x00d6:
            java.lang.String r0 = "inbox"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "inbox_channels"
            return r3
        L_0x00e1:
            java.lang.String r0 = "fq"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "fan_qr_code_invite_link"
            return r3
        L_0x00ec:
            java.lang.String r0 = "cq"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "creator_qr_code_invite_link"
            return r3
        L_0x00f7:
            java.lang.String r0 = "reel_viewer_message_share_sticker_attribution"
        L_0x00f9:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "message_in_story"
            return r3
        L_0x0102:
            java.lang.String r0 = "direct_feed_channel_join_ad_cta"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "feed_post_banner_ad"
            return r3
        L_0x010d:
            r0 = 63
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "inbox_invitations"
            return r3
        L_0x011c:
            java.lang.String r0 = "broadcast_chat_activity_feed_notification"
            goto L_0x016d
        L_0x011f:
            r0 = 197(0xc5, float:2.76E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "notification"
            return r3
        L_0x012e:
            java.lang.String r0 = "reel_viewer_chat_sticker"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "story_sticker"
            return r3
        L_0x0139:
            java.lang.String r0 = "story_ad_media_tooltip"
        L_0x013b:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "story_ad"
            return r3
        L_0x0144:
            java.lang.String r0 = "direct_stories_netego"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            r0 = 1847(0x737, float:2.588E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            return r3
        L_0x0153:
            java.lang.String r0 = "user_profile_header"
            goto L_0x0163
        L_0x0156:
            java.lang.String r0 = "reel_viewer_message_share_button"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "message_in_story_join"
            return r3
        L_0x0161:
            java.lang.String r0 = "channel_link_bottom_sheet"
        L_0x0163:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x000f
            goto L_0x000d
        L_0x016b:
            java.lang.String r0 = "broadcast_chat_activity_feed_milestone"
        L_0x016d:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            r0 = 239(0xef, float:3.35E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313756gx.A03(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        return "inbox";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r3.equals(r0) == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        return "invite_link";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e8, code lost:
        if (r3.equals(r0) == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ea, code lost:
        return "user_device_notification";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f3, code lost:
        if (r3.equals(r0) == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f5, code lost:
        return "story";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fe, code lost:
        if (r3.equals(r0) == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0100, code lost:
        return "story_ad";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011b, code lost:
        if (r3.equals(r0) == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x011d, code lost:
        return "profile";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0126, code lost:
        if (r3.equals(r0) == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0128, code lost:
        return "notifications_activity_feed";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A04(java.lang.String r3) {
        /*
            java.lang.String r2 = "inbox_search"
            java.lang.String r1 = "inbox"
            int r0 = r3.hashCode()
            switch(r0) {
                case -1858634218: goto L_0x0120;
                case -1711269324: goto L_0x0115;
                case -1362237225: goto L_0x0112;
                case -1126946350: goto L_0x0103;
                case -862848618: goto L_0x00f8;
                case -854071618: goto L_0x00ed;
                case -682350593: goto L_0x00de;
                case -542631291: goto L_0x00db;
                case -443204946: goto L_0x00cc;
                case -260327710: goto L_0x00c1;
                case -55197827: goto L_0x00be;
                case 3182: goto L_0x00b3;
                case 3275: goto L_0x00a8;
                case 100344454: goto L_0x009f;
                case 216169857: goto L_0x012b;
                case 268024154: goto L_0x0094;
                case 271635469: goto L_0x0089;
                case 301517358: goto L_0x007e;
                case 756934966: goto L_0x0073;
                case 761528537: goto L_0x0068;
                case 906349059: goto L_0x0065;
                case 909585339: goto L_0x005a;
                case 917422530: goto L_0x004f;
                case 922557714: goto L_0x004c;
                case 937341257: goto L_0x0041;
                case 1154607742: goto L_0x003d;
                case 1282438471: goto L_0x0032;
                case 1379332476: goto L_0x0027;
                case 1438298813: goto L_0x0023;
                case 1530211841: goto L_0x001f;
                case 1657724394: goto L_0x0010;
                case 1691989976: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            return r1
        L_0x000c:
            java.lang.String r0 = "channel_challenge_push_notification"
            goto L_0x00e4
        L_0x0010:
            java.lang.String r0 = "direct_thread_details_member_cta_button"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 76
            java.lang.String r2 = X.C66579MXk.A00(r0)
            return r2
        L_0x001f:
            java.lang.String r0 = "reel_viewer_message_share_sticker_tooltip"
            goto L_0x00ef
        L_0x0023:
            java.lang.String r0 = "reel_viewer_channel_challenge_sticker"
            goto L_0x00ef
        L_0x0027:
            java.lang.String r0 = "creator_dm"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "creator_dm_thread"
            return r2
        L_0x0032:
            java.lang.String r0 = "clips_viewer_chat_sticker"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "reel"
            return r2
        L_0x003d:
            java.lang.String r0 = "story_ad_cta"
            goto L_0x00fa
        L_0x0041:
            java.lang.String r0 = "direct_feed_channel_cta"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "feed_post"
            return r2
        L_0x004c:
            java.lang.String r0 = "channel_challenge_link"
            goto L_0x0075
        L_0x004f:
            java.lang.String r0 = "quick_promotions"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "inbox_quick_promotion"
            return r2
        L_0x005a:
            java.lang.String r0 = "direct_feed_netego"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "feed_netego"
            return r2
        L_0x0065:
            java.lang.String r0 = "channel_link_xma"
            goto L_0x0075
        L_0x0068:
            java.lang.String r0 = "direct_broadcast_channel_featured_event"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "featured_event"
            return r2
        L_0x0073:
            java.lang.String r0 = "fbapp_direct_link"
        L_0x0075:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "invite_link"
            return r2
        L_0x007e:
            java.lang.String r0 = "user_detail_ad_cta"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "profile_banner_ad"
            return r2
        L_0x0089:
            java.lang.String r0 = "feed_ad_media_tooltip"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "feed_post_tooltip_ad"
            return r2
        L_0x0094:
            java.lang.String r0 = "reels_ad_cta"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "reels_ad"
            return r2
        L_0x009f:
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "inbox_channels"
            return r2
        L_0x00a8:
            java.lang.String r0 = "fq"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "fan_qr_code_invite_link"
            return r2
        L_0x00b3:
            java.lang.String r0 = "cq"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "creator_qr_code_invite_link"
            return r2
        L_0x00be:
            java.lang.String r0 = "reel_viewer_message_share_sticker_attribution"
            goto L_0x00ef
        L_0x00c1:
            java.lang.String r0 = "direct_feed_channel_join_ad_cta"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "feed_post_banner_ad"
            return r2
        L_0x00cc:
            r0 = 63
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "inbox_invitations"
            return r2
        L_0x00db:
            java.lang.String r0 = "broadcast_chat_activity_feed_notification"
            goto L_0x0122
        L_0x00de:
            r0 = 197(0xc5, float:2.76E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x00e4:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "user_device_notification"
            return r2
        L_0x00ed:
            java.lang.String r0 = "reel_viewer_chat_sticker"
        L_0x00ef:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "story"
            return r2
        L_0x00f8:
            java.lang.String r0 = "story_ad_media_tooltip"
        L_0x00fa:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "story_ad"
            return r2
        L_0x0103:
            java.lang.String r0 = "direct_stories_netego"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 1847(0x737, float:2.588E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            return r2
        L_0x0112:
            java.lang.String r0 = "user_profile_header"
            goto L_0x0117
        L_0x0115:
            java.lang.String r0 = "channel_link_bottom_sheet"
        L_0x0117:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "profile"
            return r2
        L_0x0120:
            java.lang.String r0 = "broadcast_chat_activity_feed_milestone"
        L_0x0122:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r2 = "notifications_activity_feed"
            return r2
        L_0x012b:
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x0132
            return r1
        L_0x0132:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313756gx.A04(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        return "broadcast_thread_item";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r5.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        if (r5.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (r5.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
        if (r6 == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        return "share_to_story_message";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00da, code lost:
        if (r5.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00dc, code lost:
        return "join_channel_tooltip";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f3, code lost:
        if (r5.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f5, code lost:
        return "activity_feed_item";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fe, code lost:
        if (r5.equals("reel_viewer_message_share_sticker_attribution") == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0100, code lost:
        r0 = 272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0106, code lost:
        return X.C66579MXk.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0107, code lost:
        r0 = 1112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return "broadcast_chat_invite_link";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return "join_channel_banner";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A05(java.lang.String r5, boolean r6) {
        /*
            java.lang.String r4 = "broadcast_chat_invite_link"
            java.lang.String r3 = "join_channel_banner"
            java.lang.String r2 = "user_profile_header"
            java.lang.String r1 = "channel_link_bottom_sheet"
            int r0 = r5.hashCode()
            switch(r0) {
                case -1858634218: goto L_0x00ed;
                case -1711269324: goto L_0x00e6;
                case -1362237225: goto L_0x00df;
                case -862848618: goto L_0x00d4;
                case -854071618: goto L_0x00c9;
                case -682350593: goto L_0x00ba;
                case -542631291: goto L_0x00b7;
                case -260327710: goto L_0x00a0;
                case -55197827: goto L_0x00aa;
                case 3182: goto L_0x0096;
                case 3275: goto L_0x0093;
                case 216169857: goto L_0x0088;
                case 268024154: goto L_0x0085;
                case 271635469: goto L_0x0082;
                case 279056467: goto L_0x0073;
                case 301517358: goto L_0x0070;
                case 756934966: goto L_0x006d;
                case 906349059: goto L_0x006a;
                case 917422530: goto L_0x005f;
                case 922557714: goto L_0x0054;
                case 1113541012: goto L_0x0045;
                case 1154607742: goto L_0x0042;
                case 1379332476: goto L_0x0037;
                case 1438298813: goto L_0x002c;
                case 1530211841: goto L_0x0028;
                case 1657724394: goto L_0x001d;
                case 1691989976: goto L_0x0012;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r4 = "broadcast_thread_item"
        L_0x0011:
            return r4
        L_0x0012:
            java.lang.String r0 = "channel_challenge_push_notification"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "challenge_notification"
            return r4
        L_0x001d:
            java.lang.String r0 = "direct_thread_details_member_cta_button"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "member_cta_button"
            return r4
        L_0x0028:
            java.lang.String r0 = "reel_viewer_message_share_sticker_tooltip"
            goto L_0x00ac
        L_0x002c:
            java.lang.String r0 = "reel_viewer_channel_challenge_sticker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "challenge_story_sticker"
            return r4
        L_0x0037:
            java.lang.String r0 = "creator_dm"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "upsell_button"
            return r4
        L_0x0042:
            java.lang.String r0 = "story_ad_cta"
            goto L_0x00a2
        L_0x0045:
            r0 = 269(0x10d, float:3.77E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "thread_challenge_shared_xma"
            return r4
        L_0x0054:
            java.lang.String r0 = "channel_challenge_link"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "challenge_3p_shared_link"
            return r4
        L_0x005f:
            java.lang.String r0 = "quick_promotions"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "see_example_button"
            return r4
        L_0x006a:
            java.lang.String r0 = "channel_link_xma"
            goto L_0x0098
        L_0x006d:
            java.lang.String r0 = "fbapp_direct_link"
            goto L_0x0098
        L_0x0070:
            java.lang.String r0 = "user_detail_ad_cta"
            goto L_0x00a2
        L_0x0073:
            r0 = 56
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "thread_channel_shared"
            return r4
        L_0x0082:
            java.lang.String r0 = "feed_ad_media_tooltip"
            goto L_0x00d6
        L_0x0085:
            java.lang.String r0 = "reels_ad_cta"
            goto L_0x00a2
        L_0x0088:
            java.lang.String r0 = "inbox_search"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "search_result_channel_item"
            return r4
        L_0x0093:
            java.lang.String r0 = "fq"
            goto L_0x0098
        L_0x0096:
            java.lang.String r0 = "cq"
        L_0x0098:
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0011
            goto L_0x000f
        L_0x00a0:
            java.lang.String r0 = "direct_feed_channel_join_ad_cta"
        L_0x00a2:
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00b6
            goto L_0x000f
        L_0x00aa:
            java.lang.String r0 = "reel_viewer_message_share_sticker_attribution"
        L_0x00ac:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            if (r6 == 0) goto L_0x00f8
            java.lang.String r3 = "share_to_story_message"
        L_0x00b6:
            return r3
        L_0x00b7:
            java.lang.String r0 = "broadcast_chat_activity_feed_notification"
            goto L_0x00ef
        L_0x00ba:
            r0 = 197(0xc5, float:2.76E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "broadcast_chat_notification"
            return r4
        L_0x00c9:
            java.lang.String r0 = "reel_viewer_chat_sticker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "broadcast_join_chat_sticker"
            return r4
        L_0x00d4:
            java.lang.String r0 = "story_ad_media_tooltip"
        L_0x00d6:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "join_channel_tooltip"
            return r4
        L_0x00df:
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L_0x000f
            return r2
        L_0x00e6:
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L_0x000f
            return r1
        L_0x00ed:
            java.lang.String r0 = "broadcast_chat_activity_feed_milestone"
        L_0x00ef:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r4 = "activity_feed_item"
            return r4
        L_0x00f8:
            java.lang.String r0 = "reel_viewer_message_share_sticker_attribution"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0107
            r0 = 272(0x110, float:3.81E-43)
        L_0x0102:
            java.lang.String r3 = X.C66579MXk.A00(r0)
            return r3
        L_0x0107:
            r0 = 1112(0x458, float:1.558E-42)
            goto L_0x0102
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313756gx.A05(java.lang.String, boolean):java.lang.String");
    }

    public static final void A07(C313756gx r5, String str, String str2, String str3, String str4, String str5, int i) {
        Long l;
        1Ln A0E = 1Ln.A0E(r5.A03);
        if (A0E.A00.isSampled()) {
            LinkedHashMap A06 = 0Yt.A06(new 0eP[]{new 0eP("target_user_igid", str3), new 0eP("button_type", str4), new 0eP("user_type", str5)});
            A0E.A0h(Long.valueOf(r5.A02));
            A0E.A0l("member_cta_clicked");
            A0E.A0k("tap");
            A0E.A0p("member_cta_button");
            A0E.A0q(C66579MXk.A00(76));
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.A0w(A06);
            A0E.Cgf();
        }
    }

    public final void A08(int i, String str, String str2) {
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("change_name_sheet_rendered");
            A0E.A0k("tap");
            A0E.A0p("change_name_item");
            A0E.A0q("change_name_photo_sheet");
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.A0v(this.A01);
            A0E.Cgf();
        }
    }

    public final void A09(int i, String str, String str2) {
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("change_photo_dialog_rendered");
            A0E.A0k("tap");
            A0E.A0p("change_photo_item");
            A0E.A0q("change_name_photo_sheet");
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.A0v(this.A01);
            A0E.Cgf();
        }
    }

    public final void A0A(int i, String str, String str2) {
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("custom_theme_sheet_rendered");
            A0E.A0k("tap");
            A0E.A0p("change_theme_item");
            A0E.A0q("change_theme_sheet");
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.A0v(this.A01);
            A0E.Cgf();
        }
    }

    public final void A0C(C268654dm r7, String str, String str2, int i) {
        LinkedHashMap linkedHashMap;
        String str3;
        AnonymousClass1XT r3;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            Long l = null;
            if (r7 == null || (r3 = (AnonymousClass1XT) r7.A00()) == null) {
                linkedHashMap = null;
            } else {
                linkedHashMap = 0Yt.A06(new 0eP[]{new 0eP("error_message", r3.getErrorMessage()), new 0eP(TraceFieldType.ErrorCode, r3.getErrorCode())});
            }
            A0E.A0h(Long.valueOf(this.A02));
            if (r7 != null) {
                str3 = "join_chat_collaborator_error";
            } else {
                str3 = "join_chat_collaborator_success";
            }
            A0E.A0l(str3);
            A0E.A0k("view");
            A0E.A0p("join_collaborator");
            A0E.A0q("thread_view");
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            }
            A0E.A0i(l);
            A0E.A0w(linkedHashMap);
            A0E.Cgf();
        }
    }

    public final void A0D(C268654dm r7, String str, String str2, int i) {
        LinkedHashMap linkedHashMap;
        String str3;
        AnonymousClass1XT r3;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            Long l = null;
            if (r7 == null || (r3 = (AnonymousClass1XT) r7.A00()) == null) {
                linkedHashMap = null;
            } else {
                linkedHashMap = 0Yt.A06(new 0eP[]{new 0eP("error_message", r3.getErrorMessage()), new 0eP(TraceFieldType.ErrorCode, r3.getErrorCode())});
            }
            A0E.A0h(Long.valueOf(this.A02));
            if (r7 != null) {
                str3 = "decline_chat_collaborator_error";
            } else {
                str3 = "decline_chat_collaborator_success";
            }
            A0E.A0l(str3);
            A0E.A0k("view");
            A0E.A0p("decline_collaborator");
            A0E.A0q("thread_view");
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            }
            A0E.A0i(l);
            A0E.A0w(linkedHashMap);
            A0E.Cgf();
        }
    }

    public final void A0E(ChannelCreationSource channelCreationSource, int i) {
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            this.A01 = UUID.randomUUID().toString();
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("channel_option_viewed");
            A0E.A0k("view");
            String str = "omnipicker_view";
            switch (channelCreationSource.ordinal()) {
                case 4:
                    break;
                case 5:
                    str = "next_steps_item";
                    break;
                default:
                    str = "profile_view";
                    break;
            }
            A0E.A0p(str);
            A0E.A0q(A00(channelCreationSource));
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0v(this.A01);
            A0E.Cgf();
        }
    }

    public final void A0F(C69318NjJ njJ, String str, int i) {
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("follow_join_chat");
            A0E.A0k("tap");
            A0E.A0p("follow_to_join_chat_sheet");
            A0E.A0q(A02(njJ));
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            String A012 = A01(njJ);
            if (A012 != null) {
                A0E.A0w(0se.A0M(new 0eP("entrypoint", A012)));
            }
            A0E.Cgf();
        }
    }

    public final void A0G(C69318NjJ njJ, String str, int i, boolean z) {
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled() && !z) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("not_follow_join_chat");
            A0E.A0k("tap");
            A0E.A0p("follow_to_join_chat_sheet");
            A0E.A0q(A02(njJ));
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            String A012 = A01(njJ);
            if (A012 != null) {
                A0E.A0w(0se.A0M(new 0eP("entrypoint", A012)));
            }
            A0E.Cgf();
        }
    }

    public final void A0J(Integer num, String str, String str2, int i) {
        String str3;
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("thread_delete_successful");
            A0E.A0k("view");
            A0E.A0p("delete_broadcast_chat");
            if (num.intValue() != 1) {
                str3 = "thread_view";
            } else {
                str3 = "thread_details";
            }
            A0E.A0q(str3);
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.Cgf();
        }
    }

    public final void A0K(Integer num, String str, String str2, int i) {
        Long l;
        String A002;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("remove_collaborator_dialog_rendered");
            A0E.A0k("tap");
            A0E.A0p(C66579MXk.A00(1185));
            A0E.A0q(C66579MXk.A00(76));
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            if (num.intValue() != 0) {
                A002 = "invited";
            } else {
                A002 = C66579MXk.A00(257);
            }
            A0E.A0w(0se.A0M(new 0eP(C66579MXk.A00(922), A002)));
            A0E.Cgf();
        }
    }

    public final void A0L(Integer num, String str, String str2, int i, boolean z) {
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            if (z) {
                str3 = "delete_broadcast_chat_dialog_rendered";
            } else {
                str3 = "remove_broadcast_chat_dialog_rendered";
            }
            A0E.A0l(str3);
            if (num == AnonymousClass05K.A00) {
                str4 = "swipe";
            } else {
                str4 = "tap";
            }
            A0E.A0k(str4);
            if (num == AnonymousClass05K.A01) {
                str5 = C66579MXk.A00(290);
            } else if (z) {
                str5 = "thread_swipe_options";
            } else {
                str5 = "thread_list_item";
            }
            A0E.A0p(str5);
            if (num.intValue() != 1) {
                str6 = "thread_view";
            } else {
                str6 = "thread_details";
            }
            A0E.A0q(str6);
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.Cgf();
        }
    }

    public final void A0M(Integer num, String str, String str2, int i, boolean z) {
        String str3;
        String str4;
        int i2;
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            int intValue = num.intValue();
            if (intValue == 0) {
                str3 = "invite_link_copied";
            } else if (intValue == 1) {
                str3 = "send_invite_link_instagram_sheet_rendered";
            } else if (intValue != 2) {
                str3 = "generate_qr_code_sheet_rendered";
            } else {
                str3 = "invite_link_reset";
            }
            A0E.A0l(str3);
            A0E.A0k("tap");
            if (intValue == 0) {
                str4 = "chat_link_copy_text";
            } else if (intValue == 1) {
                str4 = "send_link_instagram_text";
            } else if (intValue != 2) {
                str4 = "generate_qr_code_text";
            } else {
                str4 = "reset_text";
            }
            A0E.A0p(str4);
            if (z) {
                i2 = 117;
            } else {
                i2 = 128;
            }
            A0E.A0q(C66579MXk.A00(i2));
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.Cgf();
        }
    }

    public final void A0N(Integer num, String str, String str2, int i, boolean z, boolean z2) {
        String str3;
        String str4;
        String str5;
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            if (z) {
                if (z2) {
                    str3 = "thread_delete_attempt";
                } else {
                    str3 = "thread_delete_cancel";
                }
            } else if (z2) {
                str3 = "remove_broadcast_chat_inbox";
            } else {
                str3 = "remove_broadcast_chat_inbox_cancel";
            }
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l(str3);
            A0E.A0k("tap");
            if (z) {
                str4 = "delete_chat_dialog";
            } else {
                str4 = "remove_chat_dialog";
            }
            A0E.A0p(str4);
            if (num.intValue() != 1) {
                str5 = "thread_view";
            } else {
                str5 = "thread_details";
            }
            A0E.A0q(str5);
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.Cgf();
        }
    }

    public final void A0O(Integer num, String str, String str2, boolean z) {
        String str3;
        int i;
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            if (z) {
                str3 = "channel_controls_rendered";
            } else {
                str3 = "dismiss_comment_upsell_nux";
            }
            A0E.A0l(str3);
            A0E.A0k("tap");
            A0E.A0p("comments_upsell_banner");
            A0E.A0q("thread_view");
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.Cgf();
        }
    }

    public final void A0P(Integer num, String str, String str2, boolean z) {
        String str3;
        String str4;
        int i;
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            if (z) {
                str3 = "comments_enabled";
            } else {
                str3 = "comments_upsell_sheet_cancelled";
            }
            A0E.A0l(str3);
            A0E.A0k("tap");
            if (z) {
                str4 = "turn_on_button";
            } else {
                str4 = "not_now_button";
            }
            A0E.A0p(str4);
            A0E.A0q("comments_upsell_sheet");
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.Cgf();
        }
    }

    public final void A0Q(String str, Integer num, String str2) {
        int i;
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("comments_upsell_sheet_rendered");
            A0E.A0k("impression");
            A0E.A0p("thread_view");
            A0E.A0q("thread_view");
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.Cgf();
        }
    }

    public final void A0R(String str, String str2, int i, boolean z) {
        String str3;
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            if (z) {
                str3 = "creator_invite_link_sheet_rendered";
            } else {
                str3 = "fan_invite_link_sheet_rendered";
            }
            A0E.A0l(str3);
            A0E.A0k("tap");
            A0E.A0p("invite_link_setting");
            A0E.A0q("thread_details");
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.Cgf();
        }
    }

    public final void A0S(String str, String str2, String str3) {
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("xposting_failed");
            A0E.A0k("tap");
            A0E.A0p("composer_send_button");
            A0E.A0q("thread_view");
            A0E.A0o("broadcast");
            A0E.A0s(str);
            A0E.A0v(this.A01);
            A0E.A0w(0Yt.A06(new 0eP[]{new 0eP("error_message", str3), new 0eP("send_type", str2)}));
            A0E.Cgf();
        }
    }

    public final void A0T(String str, String str2, String str3, int i, boolean z) {
        String str4;
        String str5;
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            HashMap hashMap = new HashMap();
            if (z) {
                str4 = "True";
            } else {
                str4 = "False";
            }
            hashMap.put("is_chat_creator", str4);
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("story_camera_rendered_broadcast_jcs");
            A0E.A0k("tap");
            String A002 = C66579MXk.A00(403);
            boolean equals = str3.equals(A002);
            if (equals) {
                str5 = "share_to_story_link_button";
            } else {
                str5 = "share_to_story_cta_button";
            }
            A0E.A0p(str5);
            if (!equals) {
                A002 = "thread_view";
            }
            A0E.A0q(A002);
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.A0w(hashMap);
            A0E.Cgf();
        }
    }

    public final void A0U(String str, String str2, String str3, String str4, String str5, int i) {
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("share_sheet_rendered");
            A0E.A0k("tap");
            A0E.A0p(C66579MXk.A00(72));
            A0E.A0q("thread_view");
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.A0R("item_id", str3);
            A0E.A0R(C66579MXk.A00(111), str4);
            A0E.A0v(this.A01);
            A0E.A0w(0Yt.A06(new 0eP[]{new 0eP("user_type", str5), new 0eP(C66579MXk.A00(1132), "share_in_channel_message")}));
            A0E.Cgf();
        }
    }

    public final void A0V(String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str6;
        String str7;
        Long l;
        Boolean bool;
        String str8;
        String str9;
        String str10;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            String A032 = A03(str3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str11 = "False";
            String str12 = str11;
            linkedHashMap.put(C66579MXk.A00(343), str11);
            linkedHashMap.put(C66579MXk.A00(153), str11);
            if (z) {
                str11 = "True";
            }
            linkedHashMap.put("new_bc_user", str11);
            linkedHashMap.put("entrypoint", A032);
            if (z5) {
                str6 = "True";
            } else {
                str6 = str12;
            }
            linkedHashMap.put(C66579MXk.A00(139), str6);
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap.put("ad_id", str5);
            if (0qQ.A0K(A032, "message_in_story")) {
                if (str4 != null) {
                    linkedHashMap.put("story_poster_id", str4);
                }
                if (z2) {
                    str8 = "True";
                } else {
                    str8 = str12;
                }
                linkedHashMap.put("is_poster_chat_creator", str8);
                if (z3) {
                    str9 = "True";
                } else {
                    str9 = str12;
                }
                linkedHashMap.put("is_poster_moderator", str9);
                if (z4) {
                    str10 = "True";
                } else {
                    str10 = str12;
                }
                linkedHashMap.put("is_poster_collaborator", str10);
            }
            if (0qQ.A0K(A032, "inbox_search") && (bool = this.A00) != null) {
                if (bool.booleanValue()) {
                    str12 = "True";
                }
                linkedHashMap.put("from_search_nullstate", str12);
            }
            if (0qQ.A0K(A032, "message_in_story_join")) {
                str7 = "story";
            } else {
                str7 = "broadcast_chat_preview";
            }
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("thread_join");
            A0E.A0k("tap");
            A0E.A0p("join_chat_button");
            A0E.A0q(str7);
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.A0w(linkedHashMap);
            A0E.Cgf();
        }
    }

    public final void A0W(String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        Long l;
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l(str);
            A0E.A0k(str2);
            A0E.A0p(str3);
            A0E.A0q(str4);
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str5);
            if (str6 != null) {
                l = 00y.A0n(10, str6);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.A0w(map);
            A0E.Cgf();
        }
    }

    public final void A0Z(String str, String str2, boolean z) {
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            LinkedHashMap A07 = 0Yt.A07(new 0eP[]{new 0eP(AnonymousClass000.A00(1511), String.valueOf(z))});
            if (str2 != null) {
                A07.put("xposting_thread_fbid", str2);
            }
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("channel_controls_xposting_toggle_changed");
            A0E.A0k("toggle");
            A0E.A0p("xposting_channel_controls_toggle");
            A0E.A0q(C66579MXk.A00(1164));
            A0E.A0o("broadcast");
            A0E.A0s(str);
            A0E.A0v(this.A01);
            A0E.A0w(A07);
            A0E.Cgf();
        }
    }

    public final void onSessionWillEnd() {
        this.A04.A03(C313756gx.class);
    }

    public C313756gx(UserSession userSession) {
        long j;
        this.A04 = userSession;
        Long A0n = 00y.A0n(10, userSession.A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = -1;
        }
        this.A02 = j;
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "creator_broadcast_chat";
        this.A03 = r1.A00();
    }

    public static final String A01(C69318NjJ njJ) {
        int ordinal = njJ.ordinal();
        if (ordinal == 0) {
            return "join_chat_sticker";
        }
        if (ordinal == 1) {
            return "reels";
        }
        if (ordinal == 8 || ordinal == 9) {
            return "message_in_story";
        }
        return null;
    }

    public final void A0B(int i, String str, String str2) {
        Long l;
        this.A01 = UUID.randomUUID().toString();
        1Ln A0E = 1Ln.A0E(this.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(this.A02));
            A0E.A0l("reaction_sheet_rendered");
            A0E.A0k("tap");
            A0E.A0p("plus_button");
            A0E.A0q("thread_view");
            A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A0E.A0i(l);
            A0E.A0v(this.A01);
            A0E.Cgf();
        }
    }
}
