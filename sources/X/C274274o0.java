package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;
import com.instagram.api.schemas.TextAppTextFragmentType;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.api.schemas.TextPostAppPostUnavailableReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4o0  reason: invalid class name and case insensitive filesystem */
public abstract class C274274o0 {
    public static C274344o9 parseFromJson(16F r51) {
        String str;
        String A1P;
        String str2;
        String str3;
        16F r5 = r51;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            C15067UNk uNk = null;
            Long l = null;
            Integer num = null;
            Long l2 = null;
            AnonymousClass4q1 r9 = null;
            TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant = null;
            C53445God god = null;
            Integer num2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            C274394oF r11 = null;
            1Xj r21 = null;
            UND und = null;
            Integer num3 = null;
            C274424oI r19 = null;
            String str4 = null;
            TextPostAppPostUnavailableReason textPostAppPostUnavailableReason = null;
            User user = null;
            Integer num4 = null;
            C15063UNg uNg = null;
            ArrayList arrayList = null;
            ReplyControlStr replyControlStr = null;
            Integer num5 = null;
            ArrayList arrayList2 = null;
            Integer num6 = null;
            User user2 = null;
            Integer num7 = null;
            Integer num8 = null;
            TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl = null;
            Integer num9 = null;
            C274324o7 r22 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            String str5 = null;
            C15066UNj uNj = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("can_private_reply".equals(A0q)) {
                    bool = Boolean.valueOf(r5.A0d());
                } else if ("can_reply".equals(A0q)) {
                    bool2 = Boolean.valueOf(r5.A0d());
                } else if ("debug_info".equals(A0q)) {
                    uNk = V8Z.parseFromJson(r5);
                } else if ("delete_timestamp".equals(A0q)) {
                    l = Long.valueOf(r5.A0y());
                } else if ("direct_reply_count".equals(A0q)) {
                    num = Integer.valueOf(r5.A1D());
                } else if ("expiry_timestamp".equals(A0q)) {
                    l2 = Long.valueOf(r5.A0y());
                } else if ("fediverse_info".equals(A0q)) {
                    r9 = C275354q0.parseFromJson(r5);
                } else if ("header_follow_variant".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                    textPostAppHeaderFollowVariant = (TextPostAppHeaderFollowVariant) TextPostAppHeaderFollowVariant.A01.get(str3);
                    if (textPostAppHeaderFollowVariant == null) {
                        textPostAppHeaderFollowVariant = TextPostAppHeaderFollowVariant.UNRECOGNIZED;
                    }
                } else if ("hush_info".equals(A0q)) {
                    god = C274284o1.parseFromJson(r5);
                } else if ("impression_count".equals(A0q)) {
                    num2 = Integer.valueOf(r5.A1D());
                } else if ("is_archived".equals(A0q)) {
                    bool3 = Boolean.valueOf(r5.A0d());
                } else if ("is_first_post".equals(A0q)) {
                    bool4 = Boolean.valueOf(r5.A0d());
                } else if ("is_parent_edited".equals(A0q)) {
                    bool5 = Boolean.valueOf(r5.A0d());
                } else if ("is_post_unavailable".equals(A0q)) {
                    bool6 = Boolean.valueOf(r5.A0d());
                } else if ("is_reply".equals(A0q)) {
                    bool7 = Boolean.valueOf(r5.A0d());
                } else if ("is_share_ufi_highlight_enabled".equals(A0q)) {
                    bool8 = Boolean.valueOf(r5.A0d());
                } else if ("link_preview_attachment".equals(A0q)) {
                    r11 = C274294o2.parseFromJson(r5);
                } else if ("linked_inline_media".equals(A0q)) {
                    r21 = 1Xj.A00(r5);
                } else if ("loop_community_info".equals(A0q)) {
                    und = C16824V7f.parseFromJson(r5);
                } else if ("mention_count".equals(A0q)) {
                    num3 = Integer.valueOf(r5.A1D());
                } else if ("pinned_post_info".equals(A0q)) {
                    r19 = C16846V8b.parseFromJson(r5);
                } else if ("post_preview_caption".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                } else if ("post_unavailable_reason".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                    textPostAppPostUnavailableReason = (TextPostAppPostUnavailableReason) TextPostAppPostUnavailableReason.A01.get(str2);
                    if (textPostAppPostUnavailableReason == null) {
                        textPostAppPostUnavailableReason = TextPostAppPostUnavailableReason.UNRECOGNIZED;
                    }
                } else if ("private_reply_partner".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r5, false);
                } else if ("quote_count".equals(A0q)) {
                    num4 = Integer.valueOf(r5.A1D());
                } else if ("related_trends_info".equals(A0q)) {
                    uNg = V8S.parseFromJson(r5);
                } else if ("relevant_hashtag_labels".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            if (!(r5.A11() == 16L.A0G || (A1P = r5.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("reply_control".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    replyControlStr = (ReplyControlStr) ReplyControlStr.A01.get(str);
                    if (replyControlStr == null) {
                        replyControlStr = ReplyControlStr.UNRECOGNIZED;
                    }
                } else if ("reply_count".equals(A0q)) {
                    num5 = Integer.valueOf(r5.A1D());
                } else if ("reply_facepile_users".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            Parcelable.Creator creator2 = User.CREATOR;
                            User A00 = 1aC.A00(r5, false);
                            if (A00 != null) {
                                arrayList2.add(A00);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("reply_level".equals(A0q)) {
                    num6 = Integer.valueOf(r5.A1D());
                } else if ("reply_to_author".equals(A0q)) {
                    Parcelable.Creator creator3 = User.CREATOR;
                    user2 = 1aC.A00(r5, false);
                } else if ("repost_count".equals(A0q)) {
                    num7 = Integer.valueOf(r5.A1D());
                } else if ("reshare_count".equals(A0q)) {
                    num8 = Integer.valueOf(r5.A1D());
                } else if ("search_trend_info_from_link_preview".equals(A0q)) {
                    textAppSearchDiscussionTopicImpl = C274304o3.parseFromJson(r5);
                } else if ("self_thread_count".equals(A0q)) {
                    num9 = Integer.valueOf(r5.A1D());
                } else if ("share_info".equals(A0q)) {
                    r22 = C274314o4.parseFromJson(r5);
                } else if ("should_prefetch_permalink".equals(A0q)) {
                    bool9 = Boolean.valueOf(r5.A0d());
                } else if ("show_header_follow".equals(A0q)) {
                    bool10 = Boolean.valueOf(r5.A0d());
                } else if ("special_effects_enabled_str".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r5.A1P();
                    }
                } else if ("text_fragments".equals(A0q)) {
                    uNj = V8X.parseFromJson(r5);
                } else if ("viewer_marked_not_interested".equals(A0q)) {
                    bool11 = Boolean.valueOf(r5.A0d());
                } else if ("will_add_author_to_mentioned_users".equals(A0q)) {
                    bool12 = Boolean.valueOf(r5.A0d());
                }
                r5.A0z();
            }
            return new C274344o9(r9, god, r11, und, replyControlStr, uNg, textAppSearchDiscussionTopicImpl, uNj, uNk, textPostAppHeaderFollowVariant, r19, textPostAppPostUnavailableReason, r21, r22, user, user2, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, num, num2, num3, num4, num5, num6, num7, num8, num9, l, l2, str4, str5, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r6, C274344o9 r7) {
        r6.A0c();
        Boolean bool = r7.A0G;
        if (bool != null) {
            r6.A0S("can_private_reply", bool.booleanValue());
        }
        Boolean bool2 = r7.A0H;
        if (bool2 != null) {
            r6.A0S("can_reply", bool2.booleanValue());
        }
        C274364oB r1 = r7.A08;
        if (r1 != null) {
            r6.A0q("debug_info");
            C15067UNk FCe = r1.FCe();
            r6.A0c();
            String str = FCe.A00;
            if (str != null) {
                r6.A0R("integrity_filtering", str);
            }
            String str2 = FCe.A01;
            if (str2 != null) {
                r6.A0R("node_visibility", str2);
            }
            String str3 = FCe.A02;
            if (str3 != null) {
                r6.A0R("ranking_signal", str3);
            }
            r6.A0Z();
        }
        Long l = r7.A0b;
        if (l != null) {
            r6.A0Q("delete_timestamp", l.longValue());
        }
        Integer num = r7.A0S;
        if (num != null) {
            r6.A0P("direct_reply_count", num.intValue());
        }
        Long l2 = r7.A0c;
        if (l2 != null) {
            r6.A0Q("expiry_timestamp", l2.longValue());
        }
        C274374oC r12 = r7.A00;
        if (r12 != null) {
            r6.A0q("fediverse_info");
            AnonymousClass4q1 F31 = r12.F31();
            r6.A0c();
            Boolean bool3 = F31.A00;
            if (bool3 != null) {
                r6.A0S("enqueued_for_federation", bool3.booleanValue());
            }
            Integer num2 = F31.A02;
            if (num2 != null) {
                r6.A0P("federated_like_count", num2.intValue());
            }
            Integer num3 = F31.A03;
            if (num3 != null) {
                r6.A0P("fediverse_reply_count", num3.intValue());
            }
            Boolean bool4 = F31.A01;
            if (bool4 != null) {
                r6.A0S("is_federated", bool4.booleanValue());
            }
            Integer num4 = F31.A04;
            if (num4 != null) {
                r6.A0P("liked_instance_count", num4.intValue());
            }
            Integer num5 = F31.A05;
            if (num5 != null) {
                r6.A0P("reply_instance_count", num5.intValue());
            }
            List<String> list = F31.A06;
            if (list != null) {
                16P.A03(r6, "reply_owner_profile_pic_uris");
                for (String str4 : list) {
                    if (str4 != null) {
                        r6.A0t(str4);
                    }
                }
                r6.A0Y();
            }
            r6.A0Z();
        }
        TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant = r7.A09;
        if (textPostAppHeaderFollowVariant != null) {
            r6.A0R("header_follow_variant", textPostAppHeaderFollowVariant.A00);
        }
        C274384oE r13 = r7.A01;
        if (r13 != null) {
            r6.A0q("hush_info");
            C53445God F3k = r13.F3k();
            r6.A0c();
            r6.A0S("can_hush", F3k.A01);
            r6.A0S("can_unhush", F3k.A02);
            r6.A0P("cover_reason_category", F3k.A00);
            r6.A0S("is_post_covered", F3k.A03);
            r6.A0Z();
        }
        Integer num6 = r7.A0T;
        if (num6 != null) {
            r6.A0P("impression_count", num6.intValue());
        }
        Boolean bool5 = r7.A0I;
        if (bool5 != null) {
            r6.A0S("is_archived", bool5.booleanValue());
        }
        Boolean bool6 = r7.A0J;
        if (bool6 != null) {
            r6.A0S("is_first_post", bool6.booleanValue());
        }
        Boolean bool7 = r7.A0K;
        if (bool7 != null) {
            r6.A0S("is_parent_edited", bool7.booleanValue());
        }
        Boolean bool8 = r7.A0L;
        if (bool8 != null) {
            r6.A0S("is_post_unavailable", bool8.booleanValue());
        }
        Boolean bool9 = r7.A0M;
        if (bool9 != null) {
            r6.A0S("is_reply", bool9.booleanValue());
        }
        Boolean bool10 = r7.A0N;
        if (bool10 != null) {
            r6.A0S("is_share_ufi_highlight_enabled", bool10.booleanValue());
        }
        C274394oF r2 = r7.A02;
        if (r2 != null) {
            r6.A0q("link_preview_attachment");
            r6.A0c();
            String str5 = r2.A02;
            if (str5 != null) {
                r6.A0R("display_url", str5);
            }
            ImageUrl imageUrl = r2.A00;
            if (imageUrl != null) {
                r6.A0q("favicon_url");
                16h.A01(r6, imageUrl);
            }
            ImageUrl imageUrl2 = r2.A01;
            if (imageUrl2 != null) {
                r6.A0q("image_url");
                16h.A01(r6, imageUrl2);
            }
            String str6 = r2.A03;
            if (str6 != null) {
                r6.A0R("raw_url", str6);
            }
            String str7 = r2.A04;
            if (str7 != null) {
                r6.A0R(DialogModule.KEY_TITLE, str7);
            }
            String str8 = r2.A05;
            if (str8 != null) {
                r6.A0R("url", str8);
            }
            r6.A0Z();
        }
        1Xj r14 = r7.A0C;
        if (r14 != null) {
            r6.A0q("linked_inline_media");
            1Xv r0 = 1Xj.A0h;
            1Xv.A07(r6, r14);
        }
        C274414oH r15 = r7.A03;
        if (r15 != null) {
            r6.A0q("loop_community_info");
            UND F5e = r15.F5e();
            r6.A0c();
            String str9 = F5e.A04;
            if (str9 != null) {
                r6.A0R("community_bio", str9);
            }
            String str10 = F5e.A05;
            if (str10 != null) {
                r6.A0R("community_name", str10);
            }
            Boolean bool11 = F5e.A00;
            if (bool11 != null) {
                r6.A0S("is_loop_community_container_post", bool11.booleanValue());
            }
            Boolean bool12 = F5e.A01;
            if (bool12 != null) {
                r6.A0S("is_loop_community_reply", bool12.booleanValue());
            }
            Boolean bool13 = F5e.A02;
            if (bool13 != null) {
                r6.A0S("is_viewer_member", bool13.booleanValue());
            }
            Integer num7 = F5e.A03;
            if (num7 != null) {
                r6.A0P("num_members_in_community", num7.intValue());
            }
            r6.A0Z();
        }
        Integer num8 = r7.A0U;
        if (num8 != null) {
            r6.A0P("mention_count", num8.intValue());
        }
        C274424oI r22 = r7.A0A;
        if (r22 != null) {
            r6.A0q("pinned_post_info");
            r6.A0c();
            Boolean bool14 = r22.A00;
            if (bool14 != null) {
                r6.A0S("can_viewer_pin_to_parent_post", bool14.booleanValue());
            }
            Boolean bool15 = r22.A01;
            if (bool15 != null) {
                r6.A0S("can_viewer_pin_to_profile", bool15.booleanValue());
            }
            Boolean bool16 = r22.A02;
            if (bool16 != null) {
                r6.A0S("can_viewer_unpin_from_parent_post", bool16.booleanValue());
            }
            Boolean bool17 = r22.A03;
            if (bool17 != null) {
                r6.A0S("can_viewer_unpin_from_profile", bool17.booleanValue());
            }
            Boolean bool18 = r22.A04;
            if (bool18 != null) {
                r6.A0S("has_max_pinned_replies", bool18.booleanValue());
            }
            Boolean bool19 = r22.A05;
            if (bool19 != null) {
                r6.A0S("is_pinned_to_parent_post", bool19.booleanValue());
            }
            Boolean bool20 = r22.A06;
            if (bool20 != null) {
                r6.A0S("is_pinned_to_profile", bool20.booleanValue());
            }
            Boolean bool21 = r22.A07;
            if (bool21 != null) {
                r6.A0S("parent_post_has_max_pinned_replies", bool21.booleanValue());
            }
            String str11 = r22.A08;
            if (str11 != null) {
                r6.A0R("parent_post_id", str11);
            }
            String str12 = r22.A09;
            if (str12 != null) {
                r6.A0R("parent_post_pk", str12);
            }
            r6.A0Z();
        }
        String str13 = r7.A0d;
        if (str13 != null) {
            r6.A0R("post_preview_caption", str13);
        }
        TextPostAppPostUnavailableReason textPostAppPostUnavailableReason = r7.A0B;
        if (textPostAppPostUnavailableReason != null) {
            r6.A0R("post_unavailable_reason", textPostAppPostUnavailableReason.A00);
        }
        User user = r7.A0E;
        if (user != null) {
            r6.A0q("private_reply_partner");
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r6, user);
        }
        Integer num9 = r7.A0V;
        if (num9 != null) {
            r6.A0P("quote_count", num9.intValue());
        }
        C274444oL r16 = r7.A05;
        if (r16 != null) {
            r6.A0q("related_trends_info");
            C15063UNg FCT = r16.FCT();
            r6.A0c();
            TextAppSearchDiscussionTopic textAppSearchDiscussionTopic = FCT.A00;
            if (textAppSearchDiscussionTopic != null) {
                r6.A0q("discussion_info");
                C274304o3.A00(r6, textAppSearchDiscussionTopic.FCU());
            }
            Integer num10 = FCT.A01;
            if (num10 != null) {
                r6.A0P("related_threads_count", num10.intValue());
            }
            String str14 = FCT.A02;
            if (str14 != null) {
                r6.A0R("related_threads_count_to_display", str14);
            }
            String str15 = FCT.A03;
            if (str15 != null) {
                r6.A0R("trending_keyword", str15);
            }
            r6.A0Z();
        }
        List<String> list2 = r7.A0f;
        if (list2 != null) {
            16P.A03(r6, "relevant_hashtag_labels");
            for (String str16 : list2) {
                if (str16 != null) {
                    r6.A0t(str16);
                }
            }
            r6.A0Y();
        }
        ReplyControlStr replyControlStr = r7.A04;
        if (replyControlStr != null) {
            r6.A0R("reply_control", replyControlStr.A00);
        }
        Integer num11 = r7.A0W;
        if (num11 != null) {
            r6.A0P("reply_count", num11.intValue());
        }
        List<User> list3 = r7.A0g;
        if (list3 != null) {
            16P.A03(r6, "reply_facepile_users");
            for (User user2 : list3) {
                if (user2 != null) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    1aC.A08(r6, user2);
                }
            }
            r6.A0Y();
        }
        Integer num12 = r7.A0X;
        if (num12 != null) {
            r6.A0P("reply_level", num12.intValue());
        }
        User user3 = r7.A0F;
        if (user3 != null) {
            r6.A0q("reply_to_author");
            Parcelable.Creator creator3 = User.CREATOR;
            1aC.A08(r6, user3);
        }
        Integer num13 = r7.A0Y;
        if (num13 != null) {
            r6.A0P("repost_count", num13.intValue());
        }
        Integer num14 = r7.A0Z;
        if (num14 != null) {
            r6.A0P("reshare_count", num14.intValue());
        }
        TextAppSearchDiscussionTopic textAppSearchDiscussionTopic2 = r7.A06;
        if (textAppSearchDiscussionTopic2 != null) {
            r6.A0q("search_trend_info_from_link_preview");
            C274304o3.A00(r6, textAppSearchDiscussionTopic2.FCU());
        }
        Integer num15 = r7.A0a;
        if (num15 != null) {
            r6.A0P("self_thread_count", num15.intValue());
        }
        C274324o7 r23 = r7.A0D;
        if (r23 != null) {
            r6.A0q("share_info");
            r6.A0c();
            XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility = r23.A01;
            if (xDTTextAppQuoteAttachmentEligibility != null) {
                r6.A0R("can_quote_attachment", xDTTextAppQuoteAttachmentEligibility.A00);
            }
            Boolean bool22 = r23.A05;
            if (bool22 != null) {
                r6.A0S("can_quote_post", bool22.booleanValue());
            }
            Boolean bool23 = r23.A06;
            if (bool23 != null) {
                r6.A0S("can_repost", bool23.booleanValue());
            }
            Boolean bool24 = r23.A07;
            if (bool24 != null) {
                r6.A0S("can_unlink_quote", bool24.booleanValue());
            }
            Boolean bool25 = r23.A08;
            if (bool25 != null) {
                r6.A0S("can_unlink_quoted_attachment", bool25.booleanValue());
            }
            Boolean bool26 = r23.A09;
            if (bool26 != null) {
                r6.A0S("is_reposted_by_viewer", bool26.booleanValue());
            }
            Boolean bool27 = r23.A0A;
            if (bool27 != null) {
                r6.A0S("is_reshared_to_ig_by_viewer", bool27.booleanValue());
            }
            Boolean bool28 = r23.A0B;
            if (bool28 != null) {
                r6.A0S("quoted_attachment_author_attribution_allowed", bool28.booleanValue());
            }
            1Xj r17 = r23.A02;
            if (r17 != null) {
                r6.A0q("quoted_attachment_post");
                1Xv r02 = 1Xj.A0h;
                1Xv.A07(r6, r17);
            }
            Boolean bool29 = r23.A0C;
            if (bool29 != null) {
                r6.A0S("quoted_attachment_post_unavailable", bool29.booleanValue());
            }
            Integer num16 = r23.A0D;
            if (num16 != null) {
                r6.A0P("quoted_attachment_usage_count", num16.intValue());
            }
            1Xj r18 = r23.A03;
            if (r18 != null) {
                r6.A0q("quoted_post");
                1Xv r03 = 1Xj.A0h;
                1Xv.A07(r6, r18);
            }
            String str17 = r23.A0E;
            if (str17 != null) {
                r6.A0R("quoted_post_caption", str17);
            }
            RepostRestrictedReason repostRestrictedReason = r23.A00;
            if (repostRestrictedReason != null) {
                r6.A0R("repost_restricted_reason", repostRestrictedReason.A00);
            }
            1Xj r19 = r23.A04;
            if (r19 != null) {
                r6.A0q("reposted_post");
                1Xv r04 = 1Xj.A0h;
                1Xv.A07(r6, r19);
            }
            r6.A0Z();
        }
        Boolean bool30 = r7.A0O;
        if (bool30 != null) {
            r6.A0S("should_prefetch_permalink", bool30.booleanValue());
        }
        Boolean bool31 = r7.A0P;
        if (bool31 != null) {
            r6.A0S("show_header_follow", bool31.booleanValue());
        }
        String str18 = r7.A0e;
        if (str18 != null) {
            r6.A0R("special_effects_enabled_str", str18);
        }
        C274454oN r110 = r7.A07;
        if (r110 != null) {
            r6.A0q("text_fragments");
            C15066UNj FCZ = r110.FCZ(new 1hu((UserSession) null));
            r6.A0c();
            List<C21037XAq> list4 = FCZ.A00;
            if (list4 != null) {
                16P.A03(r6, "fragments");
                for (C21037XAq xAq : list4) {
                    if (xAq != null) {
                        C15065UNi FCX = xAq.FCX(new 1hu((UserSession) null));
                        r6.A0c();
                        XAJ xaj = FCX.A00;
                        if (xaj != null) {
                            r6.A0q("fediverse_user_mention_fragment");
                            C15061UNe FCP = xaj.FCP();
                            r6.A0c();
                            String str19 = FCP.A00;
                            if (str19 != null) {
                                r6.A0R("fully_qualified_username", str19);
                            }
                            r6.A0Z();
                        }
                        TextAppTextFragmentType textAppTextFragmentType = FCX.A04;
                        if (textAppTextFragmentType != null) {
                            r6.A0R("fragment_type", textAppTextFragmentType.A00);
                        }
                        XAR xar = FCX.A01;
                        if (xar != null) {
                            r6.A0q("link_fragment");
                            C15062UNf FCQ = xar.FCQ();
                            r6.A0c();
                            String str20 = FCQ.A00;
                            if (str20 != null) {
                                r6.A0R("display_text", str20);
                            }
                            String str21 = FCQ.A01;
                            if (str21 != null) {
                                r6.A0R("uri", str21);
                            }
                            r6.A0Z();
                        }
                        C51955G8y g8y = FCX.A02;
                        if (g8y != null) {
                            r6.A0q("mention_fragment");
                            C47218Dt5 FCS = g8y.FCS(new 1hu((UserSession) null));
                            r6.A0c();
                            TextAppMentionType textAppMentionType = FCS.A00;
                            if (textAppMentionType != null) {
                                r6.A0R("mention_type", textAppMentionType.A00);
                            }
                            User user4 = FCS.A01;
                            if (user4 != null) {
                                r6.A0q(C66579MXk.A00(142));
                                Parcelable.Creator creator4 = User.CREATOR;
                                1aC.A08(r6, user4);
                            }
                            r6.A0Z();
                        }
                        String str22 = FCX.A05;
                        if (str22 != null) {
                            r6.A0R("plaintext", str22);
                        }
                        XAK xak = FCX.A03;
                        if (xak != null) {
                            r6.A0q("tag_fragment");
                            C15064UNh FCV = xak.FCV();
                            r6.A0c();
                            String str23 = FCV.A00;
                            if (str23 != null) {
                                r6.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str23);
                            }
                            r6.A0Z();
                        }
                        r6.A0Z();
                    }
                }
                r6.A0Y();
            }
            r6.A0Z();
        }
        Boolean bool32 = r7.A0Q;
        if (bool32 != null) {
            r6.A0S("viewer_marked_not_interested", bool32.booleanValue());
        }
        Boolean bool33 = r7.A0R;
        if (bool33 != null) {
            r6.A0S("will_add_author_to_mentioned_users", bool33.booleanValue());
        }
        r6.A0Z();
    }
}
