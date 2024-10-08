package X;

import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.model.DirectMessageEditHistory;
import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.direct.model.mentions.MentionedEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5kO  reason: invalid class name and case insensitive filesystem */
public abstract class C293235kO {
    public static void A00(17Z r5, C254703su r6) {
        int i;
        r5.A0c();
        r5.A0R(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, AnonymousClass48R.A00(r6.A1F));
        2FW r0 = r6.A10;
        if (r0 != null) {
            r5.A0R("item_type", r0.toString());
        }
        String str = r6.A1c;
        if (str != null) {
            r5.A0R("item_id", str);
        }
        String str2 = r6.A1W;
        if (str2 != null) {
            r5.A0R("client_context", str2);
        }
        String str3 = r6.A1r;
        if (str3 != null) {
            r5.A0R("timestamp", str3);
        }
        Long l = r6.A1S;
        if (l != null) {
            r5.A0Q("timestamp_in_micro", l.longValue());
        }
        String str4 = r6.A1u;
        if (str4 != null) {
            r5.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4);
        }
        String str5 = r6.A1V;
        if (str5 != null) {
            r5.A0R("auxiliary_text", str5);
        }
        r5.A0P("auxiliary_text_source_type", r6.A00);
        if (r6.A0n != null) {
            r5.A0q("placeholder");
            C2814857z r2 = r6.A0n;
            r5.A0c();
            String str6 = r2.A02;
            if (str6 != null) {
                r5.A0R("message_static", str6);
            }
            String str7 = r2.A00;
            if (str7 != null) {
                r5.A0R("details", str7);
            }
            String str8 = r2.A03;
            if (str8 != null) {
                r5.A0R(DialogModule.KEY_TITLE, str8);
            }
            String str9 = r2.A01;
            if (str9 != null) {
                r5.A0R(DialogModule.KEY_MESSAGE, str9);
            }
            r5.A0S("is_linked", r2.A04);
            r5.A0Z();
        }
        if (r6.A08 != null) {
            r5.A0q("expired_placeholder");
            AnonymousClass9J6 r22 = r6.A08;
            r5.A0c();
            String str10 = r22.A01;
            if (str10 != null) {
                r5.A0R(DialogModule.KEY_TITLE, str10);
            }
            String str11 = r22.A00;
            if (str11 != null) {
                r5.A0R(DialogModule.KEY_MESSAGE, str11);
            }
            r5.A0Z();
        }
        String str12 = r6.A1q;
        if (str12 != null) {
            r5.A0R("text", str12);
        }
        String str13 = r6.A1g;
        if (str13 != null) {
            r5.A0R("message_dialect", str13);
        }
        String str14 = r6.A1t;
        if (str14 != null) {
            r5.A0R("translated_message", str14);
        }
        String str15 = r6.A1s;
        if (str15 != null) {
            r5.A0R("translated_locale", str15);
        }
        if (r6.A07 != null) {
            r5.A0q("link");
            C278334wi.A00(r6.A07, r5);
        }
        if (r6.A0N != null) {
            r5.A0q("action_log");
            C2606446m.A00(r5, r6.A0N);
        }
        if (r6.A0C != null) {
            r5.A0q("instamadillo_action_log");
            C61072JwA jwA = r6.A0C;
            r5.A0c();
            r5.A0P("action_log_type", jwA.A01);
            N49 n49 = (N49) jwA.A02;
            if (n49 != null) {
                r5.A0q("context");
                r5.A0c();
                String str16 = n49.A01;
                if (str16 != null) {
                    r5.A0R("theme_title", str16);
                }
                String str17 = n49.A00;
                if (str17 != null) {
                    r5.A0R("screenshot_subtype", str17);
                }
                r5.A0Z();
            }
            r5.A0Z();
        }
        if (r6.A0c != null) {
            r5.A0q("video_call_event");
            AnonymousClass55K.A00(r5, r6.A0c);
        }
        if (r6.A17 != null) {
            r5.A0q("profile");
            User user = r6.A17;
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r5, user);
        }
        if (r6.A0B != null) {
            r5.A0q(AnonymousClass000.A00(1709));
            C61078JwG jwG = r6.A0B;
            r5.A0c();
            ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) jwG.A00;
            if (productDetailsProductItemDict != null) {
                r5.A0q("product");
                C275404q6.A00(r5, productDetailsProductItemDict);
            }
            r5.A0Z();
        }
        if (r6.A2A != null) {
            16P.A03(r5, AnonymousClass000.A00(740));
            for (AnonymousClass3I3 r02 : r6.A2A) {
                if (r02 != null) {
                    C45592Cz4.A00(r5, r02);
                }
            }
            r5.A0Y();
        }
        if (r6.A0s != null) {
            r5.A0q("media");
            1Xj r1 = r6.A0s;
            1Xv r03 = 1Xj.A0h;
            1Xv.A07(r5, r1);
        }
        if (r6.A0t != null) {
            r5.A0q(AnonymousClass000.A00(702));
            1Xj r12 = r6.A0t;
            1Xv r04 = 1Xj.A0h;
            1Xv.A07(r5, r12);
        }
        if (r6.A0A != null) {
            r5.A0q("direct_media_share");
            C45673D0y.A00(r6.A0A, r5);
        }
        if (r6.A0u != null) {
            r5.A0q(AnonymousClass000.A00(3832));
            1Xj r13 = r6.A0u;
            1Xv r05 = 1Xj.A0h;
            1Xv.A07(r5, r13);
        }
        if (r6.A0e != null) {
            r5.A0q("visual_media");
            C271364ij.A00(r5, r6.A0e);
        }
        if (r6.A0d != null) {
            r5.A0q("message_item_dict");
            C271364ij.A00(r5, r6.A0d);
        }
        if (r6.A0g != null) {
            r5.A0q("voice_media");
            C2609847u.A00(r5, r6.A0g);
        }
        if (r6.A23 != null) {
            16P.A03(r5, "seen_user_ids");
            for (String str18 : r6.A23) {
                if (str18 != null) {
                    r5.A0t(str18);
                }
            }
            r5.A0Y();
        }
        if (r6.A0Z != null) {
            r5.A0q("reel_share");
            C70879OPt.A00(r5, r6.A0Z);
        }
        if (r6.A0b != null) {
            r5.A0q("story_share");
            C70880OPu.A00(r5, r6.A0b);
        }
        if (r6.A0F != null) {
            r5.A0q(AnonymousClass000.A00(3515));
            C70878OPs.A00(r6.A0F, r5);
        }
        if (r6.A0U != null) {
            r5.A0q(AnonymousClass000.A00(1557));
            C45672D0x.A00(r5, r6.A0U);
        }
        if (r6.A0T != null) {
            r5.A0q(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
            C70873OPm.A00(r5, r6.A0T);
        }
        if (r6.A06 != null) {
            r5.A0q("felix_share");
            OPq.A00(r6.A06, r5);
        }
        if (r6.A0S != null) {
            r5.A0q("clip");
            C45671D0w.A00(r5, r6.A0S);
        }
        if (r6.A0h != null) {
            r5.A0q("voting_info_center");
            r5.A0c();
            r5.A0Z();
        }
        if (r6.A0P != null) {
            r5.A0q("ar_effect");
            C70871OPk.A00(r5, r6.A0P);
        }
        String str19 = r6.A1d;
        if (str19 != null) {
            r5.A0R("like", str19);
        }
        if (r6.A0j != null) {
            r5.A0q("xma");
            C254863tB.A00(r5, r6.A0j);
        }
        if (r6.A20 != null) {
            16P.A03(r5, "clip_watched_action_logs");
            for (C45278Cth cth : r6.A20) {
                if (cth != null) {
                    r5.A0c();
                    r5.A0R("user_igid", cth.A01);
                    r5.A0Q("watched_at_ms", cth.A00);
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        if (r6.A0i != null) {
            r5.A0q("avatar_note_reply");
            C254863tB.A00(r5, r6.A0i);
        }
        if (r6.A26 != null) {
            16P.A03(r5, "hscroll_share");
            for (C254873tC r06 : r6.A26) {
                if (r06 != null) {
                    C254863tB.A00(r5, r06);
                }
            }
            r5.A0Y();
        }
        2FW r07 = r6.A0z;
        if (r07 != null) {
            r5.A0R("message_item_type", r07.toString());
        }
        if (r6.A0X != null) {
            r5.A0q("reactions");
            C2607046s r23 = r6.A0X;
            r5.A0c();
            if (r23.A01 != null) {
                16P.A03(r5, "likes");
                for (C2607246u r08 : r23.A01) {
                    if (r08 != null) {
                        C2607146t.A00(r5, r08);
                    }
                }
                r5.A0Y();
            }
            if (r23.A00 != null) {
                16P.A03(r5, "emojis");
                for (C2607246u r09 : r23.A00) {
                    if (r09 != null) {
                        C2607146t.A00(r5, r09);
                    }
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
        if (r6.A1y != null) {
            r5.A0q("user_based_emoji_reactions");
            r5.A0c();
            for (Map.Entry entry : r6.A1y.entrySet()) {
                if (!16P.A04(r5, entry)) {
                    C277304ur r010 = (C277304ur) entry.getValue();
                    0qQ.A0B(r010, 1);
                    r5.A0b();
                    for (C2607246u A00 : r010.A00) {
                        C2607146t.A00(r5, A00);
                    }
                    r5.A0Y();
                }
            }
            r5.A0Z();
        }
        if (r6.A1z != null) {
            r5.A0q("media_interventions");
            r5.A0c();
            for (Map.Entry entry2 : r6.A1z.entrySet()) {
                if (!16P.A04(r5, entry2)) {
                    r5.A0g(((Number) entry2.getValue()).intValue());
                }
            }
            r5.A0Z();
        }
        if (r6.A22 != null) {
            16P.A03(r5, "count_based_emoji_reactions");
            for (DirectCountBasedReaction directCountBasedReaction : r6.A22) {
                if (directCountBasedReaction != null) {
                    r5.A0c();
                    r5.A0R("emoji", directCountBasedReaction.A01);
                    r5.A0P("count", directCountBasedReaction.A00);
                    r5.A0S("is_viewer_reacted", directCountBasedReaction.A02);
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        if (r6.A24 != null) {
            16P.A03(r5, "edit_history");
            for (DirectMessageEditHistory directMessageEditHistory : r6.A24) {
                if (directMessageEditHistory != null) {
                    r5.A0c();
                    String str20 = directMessageEditHistory.A01;
                    if (str20 != null) {
                        r5.A0R("body", str20);
                    }
                    r5.A0Q("timestamp", directMessageEditHistory.A00);
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        r5.A0S("hide_in_thread", r6.A2D);
        if (r6.A0y != null) {
            r5.A0q("thread_key");
            C254733sx.A00(r5, r6.A0y);
        }
        if (r6.A0x != null) {
            r5.A0q("direct_thread_id");
            C254763t0 r011 = r6.A0x;
            r5.A0c();
            String str21 = r011.A00;
            if (str21 != null) {
                r5.A0R("threadId", str21);
            }
            r5.A0Z();
        }
        Integer num = r6.A1I;
        if (num != null) {
            r5.A0P("expiring_media_client_seen_count", num.intValue());
        }
        r5.A0P("seen_count", r6.A02);
        if (r6.A0f != null) {
            r5.A0q("expiring_media_action_summary");
            C272064k2.A00(r5, r6.A0f);
        }
        String str22 = r6.A1x;
        if (str22 != null) {
            r5.A0R("reply_type", str22);
        }
        String str23 = r6.A1v;
        if (str23 != null) {
            r5.A0R("view_mode", str23);
        }
        r5.A0Q("replay_expiring_at_us", r6.A03);
        if (r6.A0R != null) {
            r5.A0q(AnonymousClass000.A00(2964));
            C45279Cti cti = r6.A0R;
            r5.A0c();
            String str24 = cti.A01;
            if (str24 != null) {
                r5.A0R(AnonymousClass000.A00(2965), str24);
            }
            String str25 = cti.A00;
            if (str25 != null) {
                r5.A0R(AnonymousClass000.A00(3005), str25);
            }
            r5.A0Z();
        }
        if (r6.A12 != null) {
            r5.A0q("animated_media");
            AnonymousClass53A.A00(r5, r6.A12);
        }
        if (r6.A15 != null) {
            r5.A0q("store_sticker");
            D1V.A00(r5, r6.A15);
        }
        if (r6.A0I != null) {
            r5.A0q("static_sticker");
            C369248u6.A00(r5, r6.A0I);
        }
        if (r6.A0p != null) {
            r5.A0q(AnonymousClass000.A00(1839));
            C45674D0z.A00(r5, r6.A0p);
        }
        if (r6.A0J != null) {
            r5.A0q("note_text_reply");
            C39825AAw.A00(r5, r6.A0J);
        }
        if (r6.A0a != null) {
            r5.A0q("replied_to_message");
            C292605jE.A01(r5, r6.A0a);
        }
        r5.A0S("show_forward_attribution", r6.A2F);
        Integer num2 = r6.A1E;
        if (num2 != null) {
            r5.A0P("forward_score", num2.intValue());
        }
        String str26 = r6.A1Z;
        if (str26 != null) {
            r5.A0R("forward_source_invite_link", str26);
        }
        String str27 = r6.A1a;
        if (str27 != null) {
            r5.A0R("forward_source_item_id", str27);
        }
        String str28 = r6.A1b;
        if (str28 != null) {
            r5.A0R("forward_source_name", str28);
        }
        r5.A0S("highly_forwarded_message", r6.A2S);
        r5.A0S("send_silently", r6.A2O);
        if (r6.A0W != null) {
            r5.A0q("policy_violation");
            C370628wm.A00(r5, r6.A0W);
        }
        r5.A0S("is_shh_mode", r6.A2P);
        if (r6.A0K != null) {
            r5.A0q("instant_reply_info");
            O7Y o7y = r6.A0K;
            r5.A0c();
            if (o7y.A00 != null) {
                16P.A03(r5, "instant_replies");
                for (C274694ou r012 : o7y.A00) {
                    if (r012 != null) {
                        C274684ot.A00(r5, r012);
                    }
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
        Boolean bool = r6.A1B;
        if (bool != null) {
            r5.A0S("is_visual_item_seen", bool.booleanValue());
        }
        if (r6.A0V != null) {
            r5.A0q("message_power_up");
            AnonymousClass5FY r24 = r6.A0V;
            r5.A0c();
            AnonymousClass5FV r013 = r24.A00;
            if (r013 != null) {
                r5.A0P("style", r013.A00);
            }
            String str29 = r24.A01;
            if (str29 != null) {
                r5.A0R("attachment_url", str29);
            }
            r5.A0Z();
        }
        if (r6.A28 != null) {
            16P.A03(r5, "mentioned_entities");
            for (MentionedEntity mentionedEntity : r6.A28) {
                if (mentionedEntity != null) {
                    C277314us.A00(r5, mentionedEntity);
                }
            }
            r5.A0Y();
        }
        if (r6.A16 != null) {
            r5.A0q("reaction_image_url_info");
            16W.A00(r5, r6.A16);
        }
        Integer num3 = r6.A1G;
        if (num3 != null) {
            r5.A0P("save_icon_state", num3.intValue());
        }
        r5.A0S("processed_business_suggestion", r6.A2I);
        if (r6.A21 != null) {
            16P.A03(r5, "commands");
            for (AnonymousClass9IY r014 : r6.A21) {
                if (r014 != null) {
                    OPw.A00(r014, r5);
                }
            }
            r5.A0Y();
        }
        String str30 = r6.A1o;
        if (str30 != null) {
            r5.A0R("serialized_receiver_fetch_params", str30);
        }
        r5.A0S("is_sent_by_viewer", r6.A2N);
        Long l2 = r6.A1R;
        if (l2 != null) {
            r5.A0Q("tq_seq_id", l2.longValue());
        }
        Boolean bool2 = r6.A18;
        if (bool2 != null) {
            r5.A0S("is_ae", bool2.booleanValue());
        }
        if (r6.A0D != null) {
            r5.A0q("armadillo_express_data");
            N4L n4l = r6.A0D;
            r5.A0c();
            r5.A0S("is_from_xplat_reverb", n4l.A05);
            r5.A0S("is_open_eb", n4l.A06);
            r5.A0S("is_from_eb_server", n4l.A04);
            Boolean bool3 = (Boolean) n4l.A03;
            if (bool3 != null) {
                r5.A0S("is_e2ee_attributed", bool3.booleanValue());
            }
            Boolean bool4 = (Boolean) n4l.A02;
            if (bool4 != null) {
                r5.A0S("is_created_directly_from_server_response", bool4.booleanValue());
            }
            r5.A0Z();
        }
        Boolean bool5 = r6.A19;
        if (bool5 != null) {
            r5.A0S("is_ae_dual_send", bool5.booleanValue());
        }
        if (r6.A0q != null) {
            r5.A0q("comments_info");
            DirectMessageComments directMessageComments = r6.A0q;
            r5.A0c();
            r5.A0P("comment_count", directMessageComments.A00);
            String str31 = directMessageComments.A01;
            if (str31 != null) {
                r5.A0R("facade_media_id", str31);
            }
            r5.A0Z();
        }
        r5.A0S("is_replyable_in_bc", r6.A2L);
        Integer num4 = r6.A1D;
        if (num4 != null) {
            r5.A0P("channel_message_seen_count", num4.intValue());
        }
        String str32 = r6.A1p;
        if (str32 != null) {
            r5.A0R("send_attribution", str32);
        }
        r5.A0S("is_saved_sticker", r6.A2M);
        r5.A0S("is_from_msys", r6.A2G);
        Long l3 = r6.A1L;
        if (l3 != null) {
            r5.A0Q("message_expiration_timestamp_ms", l3.longValue());
        }
        Long l4 = r6.A1K;
        if (l4 != null) {
            r5.A0Q("message_ephemeral_lifetime_ms", l4.longValue());
        }
        Long l5 = r6.A1J;
        if (l5 != null) {
            r5.A0Q(AnonymousClass000.A00(3065), l5.longValue());
        }
        Long l6 = r6.A1O;
        if (l6 != null) {
            r5.A0Q("ephemeral_view_timestamp_ms", l6.longValue());
        }
        Long l7 = r6.A1M;
        if (l7 != null) {
            r5.A0Q(C66579MXk.A00(313), l7.longValue());
        }
        Long l8 = r6.A1N;
        if (l8 != null) {
            r5.A0Q("ephemeral_after_view_expiration_timestamp_ms", l8.longValue());
        }
        r5.A0S("is_ephemeral_exception", r6.A2E);
        if (r6.A2B != null) {
            16P.A03(r5, "receiver_fetch_preview_data");
            for (C254873tC r015 : r6.A2B) {
                if (r015 != null) {
                    C254863tB.A00(r5, r015);
                }
            }
            r5.A0Y();
        }
        r5.A0S("is_receiver_fetch_pending", r6.A2K);
        r5.A0S("is_receiver_fetch_copy_message", r6.A2J);
        String str33 = r6.A1l;
        if (str33 != null) {
            r5.A0R("receiver_fetch_action_type", str33);
        }
        String str34 = r6.A1n;
        if (str34 != null) {
            r5.A0R("receiver_fetch_content_type", str34);
        }
        String str35 = r6.A1m;
        if (str35 != null) {
            r5.A0R("receiver_fetch_content_owner", str35);
        }
        if (r6.A0Q != null) {
            r5.A0q("bot_metadata");
            AnonymousClass7AG r25 = r6.A0Q;
            r5.A0c();
            String str36 = r25.A05;
            if (str36 != null) {
                r5.A0R("response_id", str36);
            }
            Integer num5 = r25.A02;
            if (num5 != null) {
                if (1 - num5.intValue() != 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                r5.A0P("streaming_state", i);
            }
            C61065Jw3 jw3 = r25.A00;
            if (jw3 != null) {
                r5.A0q("sentiment");
                r5.A0c();
                r5.A0P("sentiment_type", jw3.A01);
                r5.A0P("sentiment_intensity", jw3.A00);
                Number number = (Number) jw3.A02;
                if (number != null) {
                    r5.A0P("reaction", number.intValue());
                }
                r5.A0Z();
            }
            String str37 = r25.A04;
            if (str37 != null) {
                r5.A0R("bot_invocation_otid", str37);
            }
            String str38 = r25.A09;
            if (str38 != null) {
                r5.A0R("thread_subscription_action", str38);
            }
            String str39 = r25.A06;
            if (str39 != null) {
                r5.A0R("message_image_source", str39);
            }
            String str40 = r25.A08;
            if (str40 != null) {
                r5.A0R("prompt", str40);
            }
            List<String> list = r25.A0C;
            if (list != null) {
                16P.A03(r5, "bot_response_additional_message_otids");
                for (String str41 : list) {
                    if (str41 != null) {
                        r5.A0t(str41);
                    }
                }
                r5.A0Y();
            }
            String str42 = r25.A0B;
            if (str42 != null) {
                r5.A0R("thread_subscription_product_type", str42);
            }
            String str43 = r25.A0A;
            if (str43 != null) {
                r5.A0R("bot_subscription_id", str43);
            }
            String str44 = r25.A03;
            if (str44 != null) {
                r5.A0R("bot_invocation_message_id", str44);
            }
            Integer num6 = r25.A01;
            if (num6 != null) {
                r5.A0P("bot_proactive_message_type", num6.intValue());
            }
            String str45 = r25.A07;
            if (str45 != null) {
                r5.A0R("messaging_source", str45);
            }
            r5.A0Z();
        }
        if (r6.A04 != null) {
            r5.A0q("paid_partnership_info");
            AnonymousClass9I4 r016 = r6.A04;
            r5.A0c();
            r5.A0S("is_paid_partnership", r016.A00);
            r5.A0Z();
        }
        if (r6.A09 != null) {
            r5.A0q("genai_params");
            C254813t5.A00(r6.A09, r5);
        }
        if (r6.A0M != null) {
            r5.A0q("ai_consumption_params");
            BB8 bb8 = r6.A0M;
            r5.A0c();
            String str46 = bb8.A02;
            if (str46 != null) {
                r5.A0R("prompt", str46);
            }
            String str47 = bb8.A00;
            if (str47 != null) {
                r5.A0R(TraceFieldType.ContentType, str47);
            }
            String str48 = bb8.A01;
            if (str48 != null) {
                r5.A0R("mimicry_caption", str48);
            }
            r5.A0Z();
        }
        if (r6.A0l != null) {
            r5.A0q("image_glyphs");
            C18193VnB.A00(r5, r6.A0l);
        }
        if (r6.A29 != null) {
            16P.A03(r5, "mustache_ctas");
            for (AnonymousClass9JN r017 : r6.A29) {
                if (r017 != null) {
                    C263354Lf.A00(r017, r5);
                }
            }
            r5.A0Y();
        }
        String str49 = r6.A1h;
        if (str49 != null) {
            r5.A0R("message_trace_id", str49);
        }
        r5.A0P("edit_count", r6.A01);
        if (r6.A0k != null) {
            r5.A0q("ctx_ad_conversation_starter_info");
            C282225Cg r26 = r6.A0k;
            r5.A0c();
            String str50 = r26.A00;
            if (str50 != null) {
                r5.A0R("welcome_message", str50);
            }
            if (r26.A01 != null) {
                16P.A03(r5, "ice_breakers");
                for (C282245Ci r018 : r26.A01) {
                    if (r018 != null) {
                        r5.A0c();
                        String str51 = r018.A00;
                        if (str51 != null) {
                            r5.A0R("text", str51);
                        }
                        r5.A0Z();
                    }
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
        String str52 = r6.A1Y;
        if (str52 != null) {
            r5.A0R(AnonymousClass000.A00(3057), str52);
        }
        String str53 = r6.A1i;
        if (str53 != null) {
            r5.A0R(AnonymousClass000.A00(1652), str53);
        }
        String str54 = r6.A1X;
        if (str54 != null) {
            r5.A0R("decryption_merge_error", str54);
        }
        if (r6.A0O != null) {
            r5.A0q("bloks_xma");
            C10488Rt3 rt3 = r6.A0O;
            r5.A0c();
            String str55 = rt3.A01;
            if (str55 != null) {
                r5.A0R("bloks_payload", str55);
            }
            r5.A0Z();
        }
        if (r6.A0E != null) {
            r5.A0q("in_app_notification_info");
            C61081JwJ jwJ = r6.A0E;
            r5.A0c();
            Boolean bool6 = (Boolean) jwJ.A00;
            if (bool6 != null) {
                r5.A0S("should_in_app_notify", bool6.booleanValue());
            }
            String str56 = jwJ.A01;
            if (str56 != null) {
                r5.A0R("notification_message", str56);
            }
            r5.A0Z();
        }
        r5.A0S("is_taken_down", r6.A2Q);
        String str57 = r6.A1j;
        if (str57 != null) {
            r5.A0R("otid", str57);
        }
        Integer num7 = r6.A1H;
        if (num7 != null) {
            r5.A0P("thread_locked_status", num7.intValue());
        }
        Long l9 = r6.A1Q;
        if (l9 != null) {
            r5.A0Q(AnonymousClass000.A00(1779), l9.longValue());
        }
        r5.A0S("is_pinned", r6.A2H);
        if (r6.A05 != null) {
            r5.A0q(C66579MXk.A00(1023));
            C300605xU.A00(r6.A05, r5);
        }
        if (r6.A0m != null) {
            r5.A0q("media_reaction_group");
            C254723sw r14 = r6.A0m;
            r5.A0c();
            if (r14.A00 != null) {
                16P.A03(r5, "media_reaction_group_reactions");
                Iterator it = r14.A00.iterator();
                while (it.hasNext()) {
                    N2T n2t = (N2T) it.next();
                    if (n2t != null) {
                        r5.A0c();
                        String str58 = n2t.A00;
                        if (str58 != null) {
                            r5.A0R("media_reaction_media_id", str58);
                        }
                        if (n2t.A01 != null) {
                            16P.A03(r5, "media_reaction_reaction_per_media");
                            Iterator it2 = n2t.A01.iterator();
                            while (it2.hasNext()) {
                                N49 n492 = (N49) it2.next();
                                if (n492 != null) {
                                    r5.A0c();
                                    String str59 = n492.A01;
                                    if (str59 != null) {
                                        r5.A0R("sender_emoji_sender", str59);
                                    }
                                    String str60 = n492.A00;
                                    if (str60 != null) {
                                        r5.A0R("sender_emoji_emoji", str60);
                                    }
                                    r5.A0Z();
                                }
                            }
                            r5.A0Y();
                        }
                        r5.A0Z();
                    }
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
        r5.A0Z();
    }
}
