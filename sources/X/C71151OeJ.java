package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OeJ  reason: case insensitive filesystem */
public abstract class C71151OeJ {
    public static 1NY A00(AnonymousClass9JH r18, QP5 qp5, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, C70621ODs oDs, C254933tI r23, DirectThreadKey directThreadKey, 1iA r25, Boolean bool, Boolean bool2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str12;
        String str13;
        String obj;
        String A00;
        String str14;
        UserSession userSession2 = userSession;
        1NY A0N = DbU.A0N(userSession2);
        MediaUploadMetadata mediaUploadMetadata2 = mediaUploadMetadata;
        String str15 = mediaUploadMetadata2.A03;
        if (str15 != null && !str15.isEmpty()) {
            A0N.A9m("wearables_app_attribution_namespace", str15);
            String str16 = mediaUploadMetadata2.A05;
            if (str16 != null) {
                A0N.A9m(AnonymousClass000.A00(256), str16);
            }
            String str17 = mediaUploadMetadata2.A03;
            if (str17 != null && !00l.A0W(str17) && (str14 = mediaUploadMetadata2.A0A) != null && !00l.A0W(str14)) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(mediaUploadMetadata2.A0A);
                A0N.A9m("wearable_shared_media_global_ids", jSONArray.toString());
            }
            HashMap A1E = AnonymousClass7TE.A1E();
            String valueOf = String.valueOf(mediaUploadMetadata2.A05);
            C62948Kp0 A01 = C59737JVv.A01(userSession2, valueOf, 0sn.A00);
            if (A01 != null && A01.A03()) {
                C66581MXm.A1S(valueOf, A1E, 1);
            }
            JSONArray jSONArray2 = new JSONArray();
            for (Object next : A1E.keySet()) {
                JSONObject A11 = DbS.A11();
                A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, next);
                A11.put("count", AnonymousClass7TG.A0A(JTO.A0z(next, A1E)));
                jSONArray2.put(A11);
            }
            A0N.A9m("attributed_devices", jSONArray2.toString());
        }
        String str18 = mediaUploadMetadata2.A08;
        if ((str18 != null && !00l.A0W(str18)) || AnonymousClass7TE.A1b(C71146Oe3.A02(AnonymousClass7TE.A1I(mediaUploadMetadata2.A07)))) {
            C71146Oe3.A07(A0N, AnonymousClass7TE.A1I(mediaUploadMetadata2.A08));
            List A1I = AnonymousClass7TE.A1I(mediaUploadMetadata2.A07);
            0qQ.A0B(A1I, 1);
            List A02 = C71146Oe3.A02(A1I);
            if (AnonymousClass7TE.A1b(A02)) {
                A0N.A9m("horizon_world_ids", C71146Oe3.A01(A02));
            }
        }
        C71146Oe3.A08(A0N, AnonymousClass7TE.A1I(mediaUploadMetadata2));
        String str19 = "";
        String str20 = str5;
        boolean z6 = z;
        String str21 = str4;
        C71146Oe3.A04(A0N, oDs, directThreadKey, str3, str21, str20, str19, z6, z2, z4);
        String str22 = str10;
        if (!str22.isEmpty()) {
            A0N.A9m("attributed_devices", str22);
        }
        1iA r3 = r25;
        if (l != null) {
            A0N.A9m(AnonymousClass000.A00(1116), l.toString());
            str13 = "direct_v2/threads/broadcast/photo_attachment/";
            if (r3 == 1iA.A0a) {
                A0N.A0E = "direct_v2/threads/broadcast/video_attachment/";
                if (str2 != null) {
                    str19 = str2;
                }
                A0N.A9m(AnonymousClass000.A00(1924), str19);
                if (str5 != null && !str20.isEmpty()) {
                    A0N.A9m("send_attribution", str20);
                }
                QP5 qp52 = qp5;
                if (qp5 != null) {
                    String str23 = qp52.A00;
                    if (str23 != null) {
                        A0N.A9m("clips_metadata_draft_id", str23);
                    }
                    String str24 = qp52.A01;
                    if (str24 != null) {
                        A0N.A9m("clips_metadata_preview_type", str24);
                    }
                    obj = qp52.A03;
                    if (obj != null) {
                        A00 = "clips_metadata_audio_cluster_id";
                    }
                } else {
                    String str25 = str8;
                    if (str8 != null) {
                        String str26 = str9;
                        if (str9 != null) {
                            JSONObject A112 = DbS.A11();
                            try {
                                A112.put(AnonymousClass000.A00(5103), str25);
                                A112.put(AnonymousClass000.A00(1569), str26);
                                A112.put("should_render_full_xma", z3);
                            } catch (JSONException unused) {
                                0wb.A03("DirectMessageApi", "Error creating pass it on json for direct message");
                            }
                            obj = A112.toString();
                            A00 = AnonymousClass000.A00(3545);
                        }
                    }
                }
                A0N.A9m(A00, obj);
            } else {
                str12 = "allow_full_aspect_ratio";
                if (r3 == 1iA.A06) {
                    A0N.A0E = "direct_v2/threads/broadcast/animated_image_attachment/";
                    A0N.A9m(str12, "true");
                }
                A0N.A0E = str13;
                A0N.A9m(str12, "true");
            }
        } else {
            A0N.A9m("upload_id", str);
            str13 = "direct_v2/threads/broadcast/configure_photo/";
            if (r3 == 1iA.A0a) {
                A0N.A0E = "direct_v2/threads/broadcast/configure_video/";
                if (str2 != null) {
                    str19 = str2;
                }
                A0N.A9m(AnonymousClass000.A00(1924), str19);
                if (str5 != null && !str20.isEmpty()) {
                    A0N.A9m("send_attribution", str20);
                }
            } else {
                str12 = "allow_full_aspect_ratio";
                A0N.A0E = str13;
                A0N.A9m(str12, "true");
            }
        }
        A0C(A0N, r23);
        A0B(A0N, str6, str7);
        if (bool != null) {
            A0N.A0H("is_x_transport_forward", bool.booleanValue());
        }
        if (bool2 != null) {
            A0N.A0H("should_xpost", bool2.booleanValue());
        }
        if (z5) {
            A0N.A9m("should_skip_genai_eval", "true");
        }
        AnonymousClass9JH r4 = r18;
        if (r18 != null) {
            A0N.A9m("imagine_type", r4.A03);
            if (182.A06(0Tu.A05, userSession2, 36327159807752402L)) {
                A0N.A9m("imagine_prompt", r4.A01);
            }
            A0N.A9m("result_id", r4.A02);
        }
        String str27 = str11;
        if (str11 != null) {
            A0N.A9m("ai_assistant_extras", str27);
        }
        if (list != null) {
            A0N.A9m("ai_generated_attachment_fbids", C51970G9q.A0k(list));
        }
        return A0N;
    }

    public static void A0A(1NY r7, C70621ODs oDs, DirectThreadKey directThreadKey, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C71146Oe3.A04(r7, oDs, directThreadKey, str, str2, str3, "", z, z2, z3);
    }

    public static void A0B(1NY r1, String str, String str2) {
        if (str != null && str2 != null) {
            r1.A0G("private_reply_post_link", str);
            r1.A0G("private_reply_comment_id", str2);
        }
    }

    public static void A0C(1Fa r2, C254933tI r3) {
        if (r3 != null) {
            r2.A9m("replied_to_action_source", r3.A0Q);
            r2.A9m(AnonymousClass000.A00(1762), r3.A0R);
            r2.A9m(AnonymousClass000.A00(1763), r3.A0T);
            r2.A9m("replied_to_target_type", r3.A0F.A00);
            r2.A9m("replied_to_user_id", r3.A0U);
        }
    }

    public static 1NY A01(UserSession userSession, C70621ODs oDs, 1Xj r8, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        1NY A0N = DbU.A0N(userSession);
        2FW r0 = 2FW.A0G;
        A0N.A0A("direct_v2/threads/broadcast/clip_share/");
        A0N.A0R(NHZ.class, OQJ.class);
        0qQ.A0B(directThreadKey, 1);
        C71146Oe3.A09(A0N, directThreadKey);
        A0N.A9m("offline_threading_id", str);
        A0N.A9m("client_context", str);
        A0N.A9m("action", "send_item");
        A0N.A9m("text", str2);
        String A00 = 0qv.A00(C60960kU.A00);
        0qQ.A07(A00);
        A0N.A9m(C66955Mfo.A01(), A00);
        A0N.A9m("mutation_token", str4);
        if (str5 != null) {
            A0N.A9m("send_attribution", str5);
        }
        if (z) {
            A0N.A9m("sampled", "true");
        }
        if (z3) {
            A0N.A9m("send_silently", "true");
        }
        1QJ r02 = AnonymousClass1QI.A00;
        0qQ.A07(r02);
        String str8 = r02.A02.A02;
        if (str8 != null) {
            A0N.A9m("nav_chain", str8);
        }
        if ("".length() > 0) {
            A0N.A9m("ad_id", "");
        }
        C71146Oe3.A03(A0N, oDs);
        A0N.A0I("is_shh_mode", z2);
        if (r8.A0C.Bmy() != null) {
            A0N.A9m("repost_id", r8.A0C.Bmy().Bmx());
        }
        if (z5) {
            A0N.A9m("should_skip_genai_eval", "true");
        }
        if (str6 != null) {
            String[] split = str6.split("_");
            if (split.length > 0) {
                A0N.A9m("spin_id", split[0]);
                if (0mp.A0G(str5, "spins_reply")) {
                    str3 = "CLIPS_SPIN_REPLY";
                } else {
                    str3 = "CLIPS_SPIN_SHARE";
                }
            }
        }
        A0N.A9m("media_id", r8.A30());
        A0N.A9m("ranking_info_token", r8.A0C.getLoggingInfoToken());
        A0N.A0G("text", str2);
        A0N.A0G(AnonymousClass000.A00(787), str3);
        A0N.A0G("inventory_source", r8.A0C.BIl());
        A0N.A0G("blend_recommender_igids", str7);
        if (r8.CcK()) {
            A0N.A0G("tracking_token", r8.A2v());
        }
        1i5 r5 = r8.A0d;
        if (!r5.A05.A00.isEmpty() && 182.A06(0Tu.A05, userSession, 36321842637580083L)) {
            A0N.A9m("comment_id", ((C247733gp) r5.A05.A00.get(0)).A0G);
        }
        A0N.A0H("is_x_transport_forward", z4);
        return A0N;
    }

    public static 1NY A02(UserSession userSession, C45398Cve cve, DirectThreadKey directThreadKey, Integer num, String str) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("direct_v2/threads/broadcast/status_reply/");
        A0N.A9m("status_id", cve.A02);
        A0N.A9m("status_key", cve.A03);
        A0N.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        A0N.A9m("reply_type", C70081Nwx.A00(num));
        A0N.A9m(AnonymousClass000.A00(4038), str);
        A0N.A0R(1XP.class, 1XY.class);
        return A0N;
    }

    public static 1NY A03(UserSession userSession, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, Integer num, String str, List list) {
        String str2;
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("direct_v2/shared_album/modify_media/");
        A0N.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        A0N.A9m("album_id", messageIdentifier.A01);
        if (num.intValue() != 0) {
            str2 = "DELETE";
        } else {
            str2 = "ADD";
        }
        A0N.A9m("modification_type", str2);
        A0N.A9m("media_ids", C51970G9q.A0k(list));
        if (str != null) {
            A0N.A9m("client_context", str);
        }
        return A0N;
    }

    public static 1NY A04(UserSession userSession, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, String str, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l = JTO.A0m(it).A2I;
            if (l != null) {
                DbU.A1X(l, A1C);
            }
        }
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("direct_v2/shared_album/initialize/");
        A0N.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        A0N.A9m("seed_message_id", messageIdentifier.A01);
        A0N.A9m("client_context", str);
        A0N.A9m("media_ids", C51970G9q.A0k(A1C));
        A0N.A9m("seed_message_client_context", messageIdentifier.A00());
        return A0N;
    }

    public static 1OC A05(UserSession userSession, C70621ODs oDs, DirectForwardingParams directForwardingParams, DirectThreadKey directThreadKey, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("direct_v2/threads/broadcast/forward/");
        A0N.A0R(NHZ.class, OQJ.class);
        A0A(A0N, oDs, directThreadKey, str, str2, str3, z, z2, z3);
        if (directForwardingParams != null) {
            A0N.A9m("forwarded_from_thread_id", directForwardingParams.A07);
            A0N.A9m("forwarded_from_thread_item_id", directForwardingParams.A06);
            Integer num = directForwardingParams.A01;
            if (num != null) {
                A0N.A0C(C273654mx.A00(290), num.intValue());
            }
        }
        return A0N.A0M();
    }

    public static 1OC A06(UserSession userSession, C70621ODs oDs, C70816OMl oMl, DirectThreadKey directThreadKey, Boolean bool, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        String str6;
        try {
            str6 = C70065Nwh.A00(oMl);
        } catch (IOException e) {
            0wb.A06("DirectMessageApi", "Error while parsing DirectPollMessage", e);
            str6 = null;
        }
        1NY A0N = DbU.A0N(userSession);
        A0N.A0E = str3;
        A0N.A9m("poll", str6);
        DirectThreadKey directThreadKey2 = directThreadKey;
        A0N.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        A0N.A0R(NHZ.class, OQJ.class);
        if (str != null) {
            A0N.A9m("poll_question_id", str);
        }
        if (bool != null) {
            A0N.A0H("should_xpost", bool.booleanValue());
        }
        A0A(A0N, oDs, directThreadKey2, str2, str4, str5, z, false, z2);
        A0N.A0R = true;
        return A0N.A0M();
    }

    public static 1OC A07(UserSession userSession, C70621ODs oDs, C254933tI r4, DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("direct_v2/threads/broadcast/animated_media/");
        A0N.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_ID, directAnimatedMedia.A05);
        A0N.A9m("offline_threading_id", str);
        A0N.A9m("client_context", str);
        A0N.A9m(C66955Mfo.A01(), 0qv.A00(C60960kU.A00));
        A0N.A0R(1XP.class, 1XY.class);
        C71146Oe3.A09(A0N, directThreadKey);
        A0N.A9m("mutation_token", str2);
        if (z) {
            A0N.A9m("sampled", "true");
        }
        if (str3 != null) {
            A0N.A9m("send_attribution", str3);
        }
        Boolean bool = directAnimatedMedia.A04;
        if (bool != null && bool.booleanValue()) {
            A0N.A9m("is_random", "true");
        }
        if (directAnimatedMedia.A06) {
            A0N.A9m("is_sticker", "true");
        }
        if (z3) {
            A0N.A9m("send_silently", "true");
        }
        String str4 = directAnimatedMedia.A00;
        if (str4 != null) {
            A0N.A9m("gif_category_position", str4);
        }
        A0N.A0I("is_shh_mode", z2);
        C71146Oe3.A03(A0N, oDs);
        A0C(A0N, r4);
        return A0N.A0M();
    }

    public static 1OC A08(UserSession userSession, N2J n2j, DirectThreadKey directThreadKey, Long l, String str, String str2, boolean z) {
        String str3;
        O5M o5m;
        JSONObject A11 = DbS.A11();
        if (z) {
            str3 = "media_note_id";
        } else {
            str3 = "note_igid";
        }
        try {
            A11.put(str3, String.valueOf(l));
            if (str2 != null) {
                A11.put("audio_cluster_id", str2);
            }
        } catch (JSONException unused) {
            0wb.A03("DirectMessageApi", "Error forming json for note reply");
        }
        if (z) {
            o5m = O5M.A04;
        } else {
            o5m = O5M.A0M;
        }
        1NY A00 = C71146Oe3.A00(userSession, o5m, n2j, directThreadKey, A11);
        A00.A9m("text", str);
        return DbT.A0S(A00, 1XP.class, 1XY.class);
    }

    public static 1OC A09(UserSession userSession, String str, String str2, String str3) {
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A("direct_v2/get_group_link_preview_info/");
        A0O.A9m("group_link_hash", str);
        A0O.A0R(CGG.class, D19.class);
        if (str2 != null) {
            A0O.A9m("group_link_source", str2);
        }
        if (str3 != null) {
            A0O.A9m("shared_content_hash", str3);
        }
        return A0O.A0M();
    }

    public static void A0D(1P0 r13, UserSession userSession, AnonymousClass4D6 r15, C68137N2b n2b) {
        String str;
        String A0b = AnonymousClass7TF.A0b();
        DirectAnimatedMedia directAnimatedMedia = n2b.A00;
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, A0b, "client_mutation_id");
        2IV r3 = new 2IV();
        r3.A09(directAnimatedMedia.A05, "giphy_id");
        DirectAnimatedMediaUser directAnimatedMediaUser = directAnimatedMedia.A01;
        if (directAnimatedMediaUser != null) {
            str = directAnimatedMediaUser.A00;
        } else {
            str = null;
        }
        r3.A09(str, "author_username");
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        r3.A07(C66581MXm.A0p(gifUrlImpl.A02), IgReactMediaPickerNativeModule.HEIGHT);
        r3.A07(C66581MXm.A0p(gifUrlImpl.A03), IgReactMediaPickerNativeModule.WIDTH);
        r3.A09(gifUrlImpl.A09, "url");
        r3.A09(gifUrlImpl.A0A, "webp");
        r3.A07(Integer.valueOf(AnonymousClass7TG.A0A(gifUrlImpl.A05)), "size");
        r3.A07(Integer.valueOf(AnonymousClass7TG.A0A(gifUrlImpl.A06)), "webp_size");
        r3.A05("tags", AnonymousClass7TE.A1C());
        r3.A09(gifUrlImpl.A08, "mp4");
        r3.A07(Integer.valueOf(C51967G9n.A04(gifUrlImpl.A04, 0)), "mp4_size");
        C66580MXl.A1M(A03, r3, "giphy_data");
        2IS A04 = C41845B3m.A04();
        1OC A00 = AnonymousClass9D0.A00(1vm.A01(userSession).A03(new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "input"), "IGSaveGifMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42738BhZ.class, true, (PandoRealtimeInfoJNI) null, 8, "input", "xfb_save_gif_for_eimu", AnonymousClass7TE.A1C())));
        A00.A00 = r13;
        r15.schedule(A00);
    }

    public static void A0E(1P0 r13, UserSession userSession, AnonymousClass4D6 r15, C68137N2b n2b) {
        String str;
        String A0b = AnonymousClass7TF.A0b();
        DirectAnimatedMedia directAnimatedMedia = n2b.A00;
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, A0b, "client_mutation_id");
        2IV r3 = new 2IV();
        r3.A09(directAnimatedMedia.A05, "giphy_id");
        DirectAnimatedMediaUser directAnimatedMediaUser = directAnimatedMedia.A01;
        if (directAnimatedMediaUser != null) {
            str = directAnimatedMediaUser.A00;
        } else {
            str = null;
        }
        r3.A09(str, "author_username");
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        r3.A07(C66581MXm.A0p(gifUrlImpl.A02), IgReactMediaPickerNativeModule.HEIGHT);
        r3.A07(C66581MXm.A0p(gifUrlImpl.A03), IgReactMediaPickerNativeModule.WIDTH);
        r3.A09(gifUrlImpl.A09, "url");
        r3.A09(gifUrlImpl.A0A, "webp");
        r3.A07(Integer.valueOf(AnonymousClass7TG.A0A(gifUrlImpl.A05)), "size");
        r3.A07(Integer.valueOf(AnonymousClass7TG.A0A(gifUrlImpl.A06)), "webp_size");
        r3.A05("tags", AnonymousClass7TE.A1C());
        r3.A09(gifUrlImpl.A08, "mp4");
        r3.A07(Integer.valueOf(C51967G9n.A04(gifUrlImpl.A04, 0)), "mp4_size");
        C66580MXl.A1M(A03, r3, "giphy_data");
        2IS A04 = C41845B3m.A04();
        1OC A00 = AnonymousClass9D0.A00(1vm.A01(userSession).A03(new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "input"), "IGUnsaveGifMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42763Bhy.class, true, (PandoRealtimeInfoJNI) null, 8, "input", "xfb_unsave_gif_for_eimu", AnonymousClass7TE.A1C())));
        A00.A00 = r13;
        r15.schedule(A00);
    }

    public static void A0F(UserSession userSession, String str) {
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, AnonymousClass7TF.A0b(), "client_mutation_id");
        2IS A0D = JTQ.A0D(A03, str, "sticker_id");
        1vm.A01(userSession).A06(new PandoGraphQLRequest(C41847B3o.A04(A03, A0D, "input"), "IGSaveStickerMutation", A0D.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42739Bha.class, true, (PandoRealtimeInfoJNI) null, 8, "input", "xfb_save_sticker_for_eimu", AnonymousClass7TE.A1C()), new C68514NLl(2));
    }

    public static void A0G(UserSession userSession, String str) {
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, AnonymousClass7TF.A0b(), "client_mutation_id");
        2IS A0D = JTQ.A0D(A03, str, "sticker_id");
        1vm.A01(userSession).A06(new PandoGraphQLRequest(C41847B3o.A04(A03, A0D, "input"), "IGUnsaveStickerMutation", A0D.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42764Bhz.class, true, (PandoRealtimeInfoJNI) null, 8, "input", "xfb_unsave_sticker_for_eimu", AnonymousClass7TE.A1C()), new C68514NLl(3));
    }
}
