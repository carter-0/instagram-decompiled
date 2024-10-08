package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.IGLiveGameStatus;
import com.instagram.api.schemas.IGLiveGames;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4v9  reason: invalid class name and case insensitive filesystem */
public abstract class C277424v9 {
    public static C239653Hl parseFromJson(16F r74) {
        String A1P;
        String str;
        String str2;
        16F r5 = r74;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C278044w9 r14 = null;
            C277954w0 r17 = null;
            Long l = null;
            String str3 = null;
            User user = null;
            String str4 = null;
            String str5 = null;
            C278054wA r15 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            Boolean bool = null;
            String str6 = null;
            IGLiveGames iGLiveGames = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            C277444vB r20 = null;
            String str10 = null;
            Integer num = null;
            Boolean bool2 = null;
            IGLiveGameStatus iGLiveGameStatus = null;
            C278074wE r16 = null;
            Boolean bool3 = null;
            Long l2 = null;
            Long l3 = null;
            Integer num2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Integer num3 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Long l4 = null;
            String str11 = null;
            C277984w3 r22 = null;
            Boolean bool12 = null;
            Integer num4 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            Integer num5 = null;
            String str16 = null;
            Integer num6 = null;
            Long l5 = null;
            Integer num7 = null;
            Boolean bool13 = null;
            Long l6 = null;
            ArrayList arrayList3 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Integer num8 = null;
            ArrayList arrayList4 = null;
            C278094wG r21 = null;
            Float f = null;
            Float f2 = null;
            ArrayList arrayList5 = null;
            Integer num9 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("affiliate_info".equals(A0q)) {
                    r14 = C45506Cxg.parseFromJson(r5);
                } else if ("broadcast_experiments".equals(A0q)) {
                    r17 = C277464vD.parseFromJson(r5);
                } else if (TraceFieldType.BroadcastId.equals(A0q)) {
                    l = Long.valueOf(r5.A0y());
                } else if ("broadcast_message".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                } else if ("broadcast_owner".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r5, false);
                } else if ("broadcast_prompt".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                } else if ("broadcast_status".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r5.A1P();
                    }
                } else if ("charity_info".equals(A0q)) {
                    r15 = C45561CyZ.parseFromJson(r5);
                } else if ("chat_info".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            BFL parseFromJson = C45587Cyz.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("cobroadcasters".equals(A0q)) {
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
                } else if ("copyright_violation".equals(A0q)) {
                    bool = Boolean.valueOf(r5.A0d());
                } else if ("cover_frame_url".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r5.A1P();
                    }
                } else if ("current_game".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                    iGLiveGames = (IGLiveGames) IGLiveGames.A01.get(str2);
                    if (iGLiveGames == null) {
                        iGLiveGames = IGLiveGames.UNRECOGNIZED;
                    }
                } else if ("dash_abr_playback_url".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r5.A1P();
                    }
                } else if ("dash_manifest".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r5.A1P();
                    }
                } else if ("dash_playback_url".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r5.A1P();
                    }
                } else if ("dimensions_typed".equals(A0q)) {
                    r20 = C277434vA.parseFromJson(r5);
                } else if ("encoding_tag".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r5.A1P();
                    }
                } else if ("expire_at".equals(A0q)) {
                    num = Integer.valueOf(r5.A1D());
                } else if ("fan_club_subscribe_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(r5.A0d());
                } else if ("game_status".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    iGLiveGameStatus = (IGLiveGameStatus) IGLiveGameStatus.A01.get(str);
                    if (iGLiveGameStatus == null) {
                        iGLiveGameStatus = IGLiveGameStatus.UNRECOGNIZED;
                    }
                } else if ("gating".equals(A0q)) {
                    r16 = C45563Cyb.parseFromJson(r5);
                } else if ("hide_from_feed_unit".equals(A0q)) {
                    bool3 = Boolean.valueOf(r5.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    l2 = Long.valueOf(r5.A0y());
                } else if ("igtv_post_id".equals(A0q)) {
                    l3 = Long.valueOf(r5.A0y());
                } else if ("index_position_in_response".equals(A0q)) {
                    num2 = Integer.valueOf(r5.A1D());
                } else if ("internal_only".equals(A0q)) {
                    bool4 = Boolean.valueOf(r5.A0d());
                } else if ("is_exclusive_live".equals(A0q)) {
                    bool5 = Boolean.valueOf(r5.A0d());
                } else if ("is_fit_green".equals(A0q)) {
                    bool6 = Boolean.valueOf(r5.A0d());
                } else if ("is_live_comment_mention_enabled".equals(A0q)) {
                    bool7 = Boolean.valueOf(r5.A0d());
                } else if ("is_live_comment_replies_enabled".equals(A0q)) {
                    bool8 = Boolean.valueOf(r5.A0d());
                } else if ("is_ongoing_trivia".equals(A0q)) {
                    bool9 = Boolean.valueOf(r5.A0d());
                } else if ("is_player_live_trace_enabled".equals(A0q)) {
                    num3 = Integer.valueOf(r5.A1D());
                } else if ("is_scheduled_live".equals(A0q)) {
                    bool10 = Boolean.valueOf(r5.A0d());
                } else if ("is_viewer_comment_allowed".equals(A0q)) {
                    bool11 = Boolean.valueOf(r5.A0d());
                } else if ("live_post_id".equals(A0q)) {
                    l4 = Long.valueOf(r5.A0y());
                } else if ("media_id".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r5.A1P();
                    }
                } else if ("media_overlay_info".equals(A0q)) {
                    r22 = C277974w2.parseFromJson(r5);
                } else if ("muted".equals(A0q)) {
                    bool12 = Boolean.valueOf(r5.A0d());
                } else if ("number_of_qualities".equals(A0q)) {
                    num4 = Integer.valueOf(r5.A1D());
                } else if ("organic_tracking_token".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r5.A1P();
                    }
                } else if ("playlist".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r5.A1P();
                    }
                } else if ("preview".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r5.A1P();
                    }
                } else if ("progressive_playback_url".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r5.A1P();
                    }
                } else if ("published_time".equals(A0q)) {
                    num5 = Integer.valueOf(r5.A1D());
                } else if ("question_pk".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r5.A1P();
                    }
                } else if ("ranked_position".equals(A0q)) {
                    num6 = Integer.valueOf(r5.A1D());
                } else if ("response_timestamp".equals(A0q)) {
                    l5 = Long.valueOf(r5.A0y());
                } else if ("seen_ranked_position".equals(A0q)) {
                    num7 = Integer.valueOf(r5.A1D());
                } else if ("show_bff_upsell".equals(A0q)) {
                    bool13 = Boolean.valueOf(r5.A0d());
                } else if ("simulcast_fb_broadcast_id".equals(A0q)) {
                    l6 = Long.valueOf(r5.A0y());
                } else if ("sponsor_tags".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass535 parseFromJson2 = AnonymousClass534.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("streaming_from_wearable".equals(A0q)) {
                    bool14 = Boolean.valueOf(r5.A0d());
                } else if ("sup_active".equals(A0q)) {
                    bool15 = Boolean.valueOf(r5.A0d());
                } else if ("total_unique_viewer_count".equals(A0q)) {
                    num8 = Integer.valueOf(r5.A1D());
                } else if ("unseen_media_ids".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            if (!(r5.A11() == 16L.A0G || (A1P = r5.A1P()) == null)) {
                                arrayList4.add(A1P);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("user_pay_viewer_config".equals(A0q)) {
                    r21 = C2815458k.parseFromJson(r5);
                } else if ("video_duration".equals(A0q)) {
                    f = new Float(r5.A0U());
                } else if ("viewer_count".equals(A0q)) {
                    f2 = new Float(r5.A0U());
                } else if ("viewer_count_avatars".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList5 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            Parcelable.Creator creator3 = User.CREATOR;
                            User A002 = 1aC.A00(r5, false);
                            if (A002 != null) {
                                arrayList5.add(A002);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("visibility".equals(A0q)) {
                    num9 = Integer.valueOf(r5.A1D());
                }
                r5.A0z();
            }
            return new C239653Hl(r14, r15, r16, r17, iGLiveGameStatus, iGLiveGames, r20, r21, r22, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, f, f2, num, num2, num3, num4, num5, num6, num7, num8, num9, l, l2, l3, l4, l5, l6, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C239653Hl r4) {
        r3.A0c();
        C278044w9 r1 = r4.A00;
        if (r1 != null) {
            r3.A0q("affiliate_info");
            C45506Cxg.A00(r3, r1);
        }
        C277954w0 r12 = r4.A03;
        if (r12 != null) {
            r3.A0q("broadcast_experiments");
            C277464vD.A00(r3, r12);
        }
        Long l = r4.A0a;
        if (l != null) {
            r3.A0Q(TraceFieldType.BroadcastId, l.longValue());
        }
        String str = r4.A0g;
        if (str != null) {
            r3.A0R("broadcast_message", str);
        }
        User user = r4.A09;
        if (user != null) {
            r3.A0q("broadcast_owner");
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r3, user);
        }
        String str2 = r4.A0h;
        if (str2 != null) {
            r3.A0R("broadcast_prompt", str2);
        }
        String str3 = r4.A0i;
        if (str3 != null) {
            r3.A0R("broadcast_status", str3);
        }
        C278054wA r13 = r4.A01;
        if (r13 != null) {
            r3.A0q("charity_info");
            C45561CyZ.A00(r3, r13);
        }
        List<BFL> list = r4.A0u;
        if (list != null) {
            16P.A03(r3, "chat_info");
            for (BFL bfl : list) {
                if (bfl != null) {
                    C45587Cyz.A00(r3, bfl);
                }
            }
            r3.A0Y();
        }
        List<User> list2 = r4.A0v;
        if (list2 != null) {
            16P.A03(r3, "cobroadcasters");
            for (User user2 : list2) {
                if (user2 != null) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    1aC.A08(r3, user2);
                }
            }
            r3.A0Y();
        }
        Boolean bool = r4.A0A;
        if (bool != null) {
            r3.A0S("copyright_violation", bool.booleanValue());
        }
        String str4 = r4.A0j;
        if (str4 != null) {
            r3.A0R("cover_frame_url", str4);
        }
        IGLiveGames iGLiveGames = r4.A05;
        if (iGLiveGames != null) {
            r3.A0R("current_game", iGLiveGames.A00);
        }
        String str5 = r4.A0k;
        if (str5 != null) {
            r3.A0R("dash_abr_playback_url", str5);
        }
        String str6 = r4.A0l;
        if (str6 != null) {
            r3.A0R("dash_manifest", str6);
        }
        String str7 = r4.A0m;
        if (str7 != null) {
            r3.A0R("dash_playback_url", str7);
        }
        C277444vB r2 = r4.A06;
        if (r2 != null) {
            r3.A0q("dimensions_typed");
            r3.A0c();
            r3.A0P(IgReactMediaPickerNativeModule.HEIGHT, r2.A00);
            r3.A0P(IgReactMediaPickerNativeModule.WIDTH, r2.A01);
            r3.A0Z();
        }
        String str8 = r4.A0n;
        if (str8 != null) {
            r3.A0R("encoding_tag", str8);
        }
        Integer num = r4.A0R;
        if (num != null) {
            r3.A0P("expire_at", num.intValue());
        }
        Boolean bool2 = r4.A0B;
        if (bool2 != null) {
            r3.A0S("fan_club_subscribe_enabled", bool2.booleanValue());
        }
        IGLiveGameStatus iGLiveGameStatus = r4.A04;
        if (iGLiveGameStatus != null) {
            r3.A0R("game_status", iGLiveGameStatus.A00);
        }
        C278074wE r14 = r4.A02;
        if (r14 != null) {
            r3.A0q("gating");
            C45563Cyb.A00(r3, r14);
        }
        Boolean bool3 = r4.A0C;
        if (bool3 != null) {
            r3.A0S("hide_from_feed_unit", bool3.booleanValue());
        }
        Long l2 = r4.A0b;
        if (l2 != null) {
            r3.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l2.longValue());
        }
        Long l3 = r4.A0c;
        if (l3 != null) {
            r3.A0Q("igtv_post_id", l3.longValue());
        }
        Integer num2 = r4.A0S;
        if (num2 != null) {
            r3.A0P("index_position_in_response", num2.intValue());
        }
        Boolean bool4 = r4.A0D;
        if (bool4 != null) {
            r3.A0S("internal_only", bool4.booleanValue());
        }
        Boolean bool5 = r4.A0E;
        if (bool5 != null) {
            r3.A0S("is_exclusive_live", bool5.booleanValue());
        }
        Boolean bool6 = r4.A0F;
        if (bool6 != null) {
            r3.A0S("is_fit_green", bool6.booleanValue());
        }
        Boolean bool7 = r4.A0G;
        if (bool7 != null) {
            r3.A0S("is_live_comment_mention_enabled", bool7.booleanValue());
        }
        Boolean bool8 = r4.A0H;
        if (bool8 != null) {
            r3.A0S("is_live_comment_replies_enabled", bool8.booleanValue());
        }
        Boolean bool9 = r4.A0I;
        if (bool9 != null) {
            r3.A0S("is_ongoing_trivia", bool9.booleanValue());
        }
        Integer num3 = r4.A0T;
        if (num3 != null) {
            r3.A0P("is_player_live_trace_enabled", num3.intValue());
        }
        Boolean bool10 = r4.A0J;
        if (bool10 != null) {
            r3.A0S("is_scheduled_live", bool10.booleanValue());
        }
        Boolean bool11 = r4.A0K;
        if (bool11 != null) {
            r3.A0S("is_viewer_comment_allowed", bool11.booleanValue());
        }
        Long l4 = r4.A0d;
        if (l4 != null) {
            r3.A0Q("live_post_id", l4.longValue());
        }
        String str9 = r4.A0o;
        if (str9 != null) {
            r3.A0R("media_id", str9);
        }
        C277984w3 r15 = r4.A08;
        if (r15 != null) {
            r3.A0q("media_overlay_info");
            C277974w2.A00(r3, r15);
        }
        Boolean bool12 = r4.A0L;
        if (bool12 != null) {
            r3.A0S("muted", bool12.booleanValue());
        }
        Integer num4 = r4.A0U;
        if (num4 != null) {
            r3.A0P("number_of_qualities", num4.intValue());
        }
        String str10 = r4.A0p;
        if (str10 != null) {
            r3.A0R("organic_tracking_token", str10);
        }
        String str11 = r4.A0q;
        if (str11 != null) {
            r3.A0R("playlist", str11);
        }
        String str12 = r4.A0r;
        if (str12 != null) {
            r3.A0R("preview", str12);
        }
        String str13 = r4.A0s;
        if (str13 != null) {
            r3.A0R("progressive_playback_url", str13);
        }
        Integer num5 = r4.A0V;
        if (num5 != null) {
            r3.A0P("published_time", num5.intValue());
        }
        String str14 = r4.A0t;
        if (str14 != null) {
            r3.A0R("question_pk", str14);
        }
        Integer num6 = r4.A0W;
        if (num6 != null) {
            r3.A0P("ranked_position", num6.intValue());
        }
        Long l5 = r4.A0e;
        if (l5 != null) {
            r3.A0Q("response_timestamp", l5.longValue());
        }
        Integer num7 = r4.A0X;
        if (num7 != null) {
            r3.A0P("seen_ranked_position", num7.intValue());
        }
        Boolean bool13 = r4.A0M;
        if (bool13 != null) {
            r3.A0S("show_bff_upsell", bool13.booleanValue());
        }
        Long l6 = r4.A0f;
        if (l6 != null) {
            r3.A0Q("simulcast_fb_broadcast_id", l6.longValue());
        }
        List<AnonymousClass535> list3 = r4.A0w;
        if (list3 != null) {
            16P.A03(r3, "sponsor_tags");
            for (AnonymousClass535 r0 : list3) {
                if (r0 != null) {
                    AnonymousClass534.A00(r3, r0);
                }
            }
            r3.A0Y();
        }
        Boolean bool14 = r4.A0N;
        if (bool14 != null) {
            r3.A0S("streaming_from_wearable", bool14.booleanValue());
        }
        Boolean bool15 = r4.A0O;
        if (bool15 != null) {
            r3.A0S("sup_active", bool15.booleanValue());
        }
        Integer num8 = r4.A0Y;
        if (num8 != null) {
            r3.A0P("total_unique_viewer_count", num8.intValue());
        }
        List<String> list4 = r4.A0x;
        if (list4 != null) {
            16P.A03(r3, "unseen_media_ids");
            for (String str15 : list4) {
                if (str15 != null) {
                    r3.A0t(str15);
                }
            }
            r3.A0Y();
        }
        C278094wG r16 = r4.A07;
        if (r16 != null) {
            r3.A0q("user_pay_viewer_config");
            C2815458k.A00(r3, r16);
        }
        Float f = r4.A0P;
        if (f != null) {
            r3.A0O("video_duration", f.floatValue());
        }
        Float f2 = r4.A0Q;
        if (f2 != null) {
            r3.A0O("viewer_count", f2.floatValue());
        }
        List<User> list5 = r4.A0y;
        if (list5 != null) {
            16P.A03(r3, "viewer_count_avatars");
            for (User user3 : list5) {
                if (user3 != null) {
                    Parcelable.Creator creator3 = User.CREATOR;
                    1aC.A08(r3, user3);
                }
            }
            r3.A0Y();
        }
        Integer num9 = r4.A0Z;
        if (num9 != null) {
            r3.A0P("visibility", num9.intValue());
        }
        r3.A0Z();
    }
}
