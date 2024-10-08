package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Gh  reason: invalid class name and case insensitive filesystem */
public abstract class C283145Gh {
    public static C283155Gi parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C283155Gi r0 = new C283155Gi();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("pk".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A09 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    r0.A05 = (C283195Gm) AnonymousClass01t.A00(C283195Gm.A01, r4.A0i());
                } else if ("story_type".equals(A0q)) {
                    r0.A00 = r4.A1D();
                } else if ("notif_name".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A0C = str;
                } else if ("is_pinned_row".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A0A = str;
                } else if ("args".equals(A0q)) {
                    r0.A04 = C283205Gn.parseFromJson(r4);
                } else if ("survey".equals(A0q)) {
                    r0.A01 = C48780Ek3.parseFromJson(r4);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C283155Gi r10) {
        StringWriter stringWriter = new StringWriter();
        15p r4 = AnonymousClass15o.A00;
        17W A0A = r4.A0A(stringWriter);
        A0A.A0c();
        String str = r10.A09;
        if (str != null) {
            A0A.A0R("pk", str);
        }
        C283195Gm r1 = r10.A05;
        if (r1 != null) {
            C283195Gm[] r0 = C283195Gm.A02;
            A0A.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r1.A00);
        }
        A0A.A0P("story_type", r10.A00);
        String str2 = r10.A0C;
        if (str2 != null) {
            A0A.A0R("notif_name", str2);
        }
        String str3 = r10.A0A;
        if (str3 != null) {
            A0A.A0R("is_pinned_row", str3);
        }
        if (r10.A04 != null) {
            A0A.A0q("args");
            C283165Gj r2 = r10.A04;
            A0A.A0c();
            String str4 = r2.A0i;
            if (str4 != null) {
                A0A.A0R("reel_pk", str4);
            }
            String str5 = r2.A0W;
            if (str5 != null) {
                A0A.A0R("annotation_title", str5);
            }
            String str6 = r2.A0r;
            if (str6 != null) {
                A0A.A0R(DialogModule.KEY_TITLE, str6);
            }
            String str7 = r2.A0o;
            if (str7 != null) {
                A0A.A0R("text", str7);
            }
            String str8 = r2.A0j;
            if (str8 != null) {
                A0A.A0R("rich_text", str8);
            }
            String str9 = r2.A0n;
            if (str9 != null) {
                A0A.A0R("sub_text", str9);
            }
            String str10 = r2.A0U;
            if (str10 != null) {
                A0A.A0R("action_url", str10);
            }
            Boolean bool = r2.A0M;
            if (bool != null) {
                A0A.A0S("icon_should_apply_filter", bool.booleanValue());
            }
            ImageUrl imageUrl = r2.A0F;
            if (imageUrl != null) {
                A0A.A0q("second_icon_url");
                16h.A01(A0A, imageUrl);
            }
            Boolean bool2 = r2.A0P;
            if (bool2 != null) {
                A0A.A0S("second_icon_should_apply_filter", bool2.booleanValue());
            }
            Long l = r2.A0Q;
            if (l != null) {
                A0A.A0Q("af_candidate_id", l.longValue());
            }
            String str11 = r2.A0d;
            if (str11 != null) {
                A0A.A0R("content_version_id", str11);
            }
            String str12 = r2.A0V;
            if (str12 != null) {
                A0A.A0R("aggregation_type", str12);
            }
            String str13 = r2.A0f;
            if (str13 != null) {
                A0A.A0R("profile_id", str13);
            }
            String str14 = r2.A0l;
            if (str14 != null) {
                A0A.A0R("second_profile_id", str14);
            }
            ImageUrl imageUrl2 = r2.A0E;
            if (imageUrl2 != null) {
                A0A.A0q("profile_image");
                16h.A01(A0A, imageUrl2);
            }
            String str15 = r2.A0g;
            if (str15 != null) {
                A0A.A0R("profile_image_destination", str15);
            }
            String str16 = r2.A0h;
            if (str16 != null) {
                A0A.A0R("profile_name", str16);
            }
            ImageUrl imageUrl3 = r2.A0G;
            if (imageUrl3 != null) {
                A0A.A0q("second_profile_image");
                16h.A01(A0A, imageUrl3);
            }
            List<Number> list = r2.A0y;
            if (list != null) {
                16P.A03(A0A, "mentioned_users");
                for (Number number : list) {
                    if (number != null) {
                        A0A.A0h(number.longValue());
                    }
                }
                A0A.A0Y();
            }
            String str17 = r2.A0m;
            if (str17 != null) {
                A0A.A0R("profile_context", str17);
            }
            List<C376649Iu> list2 = r2.A0x;
            if (list2 != null) {
                16P.A03(A0A, "media");
                for (C376649Iu r6 : list2) {
                    if (r6 != null) {
                        A0A.A0c();
                        String str18 = r6.A01;
                        if (str18 != null) {
                            A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str18);
                        }
                        ImageUrl imageUrl4 = (ImageUrl) r6.A00;
                        if (imageUrl4 != null) {
                            A0A.A0q("image");
                            16h.A01(A0A, imageUrl4);
                        }
                        A0A.A0Z();
                    }
                }
                A0A.A0Y();
            }
            List<C376649Iu> list3 = r2.A0u;
            if (list3 != null) {
                16P.A03(A0A, "images");
                for (C376649Iu r62 : list3) {
                    if (r62 != null) {
                        A0A.A0c();
                        String str19 = r62.A01;
                        if (str19 != null) {
                            A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str19);
                        }
                        ImageUrl imageUrl5 = (ImageUrl) r62.A00;
                        if (imageUrl5 != null) {
                            A0A.A0q("image");
                            16h.A01(A0A, imageUrl5);
                        }
                        A0A.A0Z();
                    }
                }
                A0A.A0Y();
            }
            String str20 = r2.A0q;
            if (str20 != null) {
                A0A.A0R("timestamp", str20);
            }
            Long l2 = r2.A0T;
            if (l2 != null) {
                A0A.A0Q("latest_reel_media", l2.longValue());
            }
            List<String> list4 = r2.A10;
            if (list4 != null) {
                16P.A03(A0A, "story_reel_media_ids");
                for (String str21 : list4) {
                    if (str21 != null) {
                        A0A.A0t(str21);
                    }
                }
                A0A.A0Y();
            }
            C376529Ii r63 = r2.A08;
            if (r63 != null) {
                A0A.A0q("inline_follow");
                A0A.A0c();
                User user = (User) r63.A02;
                if (user != null) {
                    A0A.A0q("user_info");
                    Parcelable.Creator creator = User.CREATOR;
                    1aC.A08(A0A, user);
                }
                Boolean bool3 = (Boolean) r63.A03;
                if (bool3 != null) {
                    A0A.A0S("following", bool3.booleanValue());
                }
                Boolean bool4 = (Boolean) r63.A05;
                if (bool4 != null) {
                    A0A.A0S("outgoing_request", bool4.booleanValue());
                }
                Boolean bool5 = (Boolean) r63.A04;
                if (bool5 != null) {
                    A0A.A0S("incoming_request", bool5.booleanValue());
                }
                Boolean bool6 = (Boolean) r63.A01;
                if (bool6 != null) {
                    A0A.A0S("follow_back_enabled", bool6.booleanValue());
                }
                A0A.A0Z();
            }
            List<C47156DrX> list5 = r2.A0w;
            if (list5 != null) {
                16P.A03(A0A, "links");
                for (C47156DrX drX : list5) {
                    if (drX != null) {
                        A0A.A0c();
                        String str22 = drX.A03;
                        if (str22 != null) {
                            A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str22);
                        }
                        String str23 = drX.A02;
                        if (str23 != null) {
                            A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str23);
                        }
                        A0A.A0P("start", drX.A01);
                        A0A.A0P("end", drX.A00);
                        A0A.A0Z();
                    }
                }
                A0A.A0Y();
            }
            String str24 = r2.A0p;
            if (str24 != null) {
                A0A.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str24);
            }
            String str25 = r2.A0k;
            if (str25 != null) {
                A0A.A0R("destination", str25);
            }
            C61078JwG jwG = r2.A0A;
            if (jwG != null) {
                A0A.A0q("friendship_status");
                A0A.A0c();
                Boolean bool7 = (Boolean) jwG.A00;
                if (bool7 != null) {
                    A0A.A0S("is_restricted", bool7.booleanValue());
                }
                A0A.A0Z();
            }
            String str26 = r2.A0e;
            if (str26 != null) {
                A0A.A0R("media_destination", str26);
            }
            C2801950r r02 = r2.A0H;
            if (r02 != null) {
                A0A.A0R("media_clips_creation_type", r02.A00);
            }
            String str27 = r2.A0b;
            if (str27 != null) {
                A0A.A0R("comment_id", str27);
            }
            Boolean bool8 = r2.A0J;
            if (bool8 != null) {
                A0A.A0S("comments_disabled", bool8.booleanValue());
            }
            List<String> list6 = r2.A0t;
            if (list6 != null) {
                16P.A03(A0A, "actions");
                for (String str28 : list6) {
                    if (str28 != null) {
                        A0A.A0t(str28);
                    }
                }
                A0A.A0Y();
            }
            List<AnonymousClass9JH> list7 = r2.A0v;
            if (list7 != null) {
                16P.A03(A0A, "inline_controls");
                for (AnonymousClass9JH r64 : list7) {
                    if (r64 != null) {
                        A0A.A0c();
                        String str29 = r64.A02;
                        if (str29 != null) {
                            A0A.A0R("action_type", str29);
                        }
                        String str30 = r64.A01;
                        if (str30 != null) {
                            A0A.A0R("action_text", str30);
                        }
                        String str31 = r64.A03;
                        if (str31 != null) {
                            A0A.A0R("confirmation_text", str31);
                        }
                        if (r64.A00 != null) {
                            A0A.A0q("controls");
                            A0A.A0c();
                            for (Map.Entry entry : ((AbstractMap) r64.A00).entrySet()) {
                                if (!16P.A04(A0A, entry)) {
                                    A0A.A0t((String) entry.getValue());
                                }
                            }
                            A0A.A0Z();
                        }
                        A0A.A0Z();
                    }
                }
                A0A.A0Y();
            }
            String str32 = r2.A0s;
            if (str32 != null) {
                A0A.A0R("tuuid", str32);
            }
            String str33 = r2.A0a;
            if (str33 != null) {
                A0A.A0R("canvas_id", str33);
            }
            Boolean bool9 = r2.A0O;
            if (bool9 != null) {
                A0A.A0S("is_story", bool9.booleanValue());
            }
            List<N4G> list8 = r2.A0z;
            if (list8 != null) {
                16P.A03(A0A, "poll_options");
                for (N4G n4g : list8) {
                    if (n4g != null) {
                        A0A.A0c();
                        String str34 = n4g.A01;
                        if (str34 != null) {
                            A0A.A0R("option", str34);
                        }
                        A0A.A0P("count", n4g.A00);
                        A0A.A0Z();
                    }
                }
                A0A.A0Y();
            }
            JV7 jv7 = r2.A0D;
            if (jv7 != null) {
                A0A.A0q("action_button");
                A0A.A0c();
                String str35 = jv7.A02;
                if (str35 != null) {
                    A0A.A0R("text", str35);
                }
                String str36 = jv7.A01;
                if (str36 != null) {
                    A0A.A0R("dest", str36);
                }
                A0A.A0Z();
            }
            String str37 = r2.A0c;
            if (str37 != null) {
                A0A.A0R("comment_text", str37);
            }
            Boolean bool10 = r2.A0N;
            if (bool10 != null) {
                A0A.A0S("is_comment_eligible_for_vcr", bool10.booleanValue());
            }
            List<User> list9 = r2.A11;
            if (list9 != null) {
                16P.A03(A0A, "users");
                for (User user2 : list9) {
                    if (user2 != null) {
                        Parcelable.Creator creator2 = User.CREATOR;
                        1aC.A08(A0A, user2);
                    }
                }
                A0A.A0Y();
            }
            Boolean bool11 = r2.A0K;
            if (bool11 != null) {
                A0A.A0S("display_ufi", bool11.booleanValue());
            }
            Long l3 = r2.A0S;
            if (l3 != null) {
                A0A.A0Q("aymt_notif_id", l3.longValue());
            }
            Long l4 = r2.A0R;
            if (l4 != null) {
                A0A.A0Q("aymt_channel_id", l4.longValue());
            }
            String str38 = r2.A0X;
            if (str38 != null) {
                A0A.A0R("aymt_notif_type", str38);
            }
            String str39 = r2.A0Z;
            if (str39 != null) {
                A0A.A0R("req_fbid", str39);
            }
            String str40 = r2.A0Y;
            if (str40 != null) {
                A0A.A0R("preview_url", str40);
            }
            C283175Gk r7 = r2.A0I;
            if (r7 != null) {
                A0A.A0q("extra");
                A0A.A0c();
                String str41 = r7.A0A;
                if (str41 != null) {
                    A0A.A0R("lat", str41);
                }
                String str42 = r7.A0C;
                if (str42 != null) {
                    A0A.A0R("long", str42);
                }
                String str43 = r7.A07;
                if (str43 != null) {
                    A0A.A0R(Dbj.A01(), str43);
                }
                String str44 = r7.A08;
                if (str44 != null) {
                    A0A.A0R("device_name", str44);
                }
                String str45 = r7.A0H;
                if (str45 != null) {
                    A0A.A0R("tf_id", str45);
                }
                String str46 = r7.A0B;
                if (str46 != null) {
                    A0A.A0R("loc", str46);
                }
                String str47 = r7.A0E;
                if (str47 != null) {
                    A0A.A0R("time", str47);
                }
                String str48 = r7.A0F;
                if (str48 != null) {
                    A0A.A0R("tip_id", str48);
                }
                String str49 = r7.A04;
                if (str49 != null) {
                    A0A.A0R("channel_id", str49);
                }
                String str50 = r7.A0I;
                if (str50 != null) {
                    A0A.A0R("upcoming_event_id", str50);
                }
                String str51 = r7.A0G;
                if (str51 != null) {
                    A0A.A0R(DialogModule.KEY_TITLE, str51);
                }
                List<ImageUrl> list10 = r7.A0K;
                if (list10 != null) {
                    16P.A03(A0A, "facepiles");
                    for (ImageUrl imageUrl6 : list10) {
                        if (imageUrl6 != null) {
                            16h.A01(A0A, imageUrl6);
                        }
                    }
                    A0A.A0Y();
                }
                Boolean bool12 = r7.A02;
                if (bool12 != null) {
                    A0A.A0S("is_aggregated", bool12.booleanValue());
                }
                Boolean bool13 = r7.A03;
                if (bool13 != null) {
                    A0A.A0S("disable_truncation", bool13.booleanValue());
                }
                String str52 = r7.A05;
                if (str52 != null) {
                    A0A.A0R("content", str52);
                }
                String str53 = r7.A06;
                if (str53 != null) {
                    A0A.A0R("context", str53);
                }
                String str54 = r7.A09;
                if (str54 != null) {
                    A0A.A0R(Pxd.A00(224), str54);
                }
                String str55 = r7.A0J;
                if (str55 != null) {
                    A0A.A0R("upcoming_event_reminder_type", str55);
                }
                C61076JwE jwE = r7.A00;
                if (jwE != null) {
                    A0A.A0q("social_context");
                    A0A.A0c();
                    String str56 = jwE.A01;
                    if (str56 != null) {
                        A0A.A0R("caption", str56);
                    }
                    List<User> list11 = (List) jwE.A00;
                    if (list11 != null) {
                        16P.A03(A0A, "facepile_users");
                        for (User user3 : list11) {
                            if (user3 != null) {
                                Parcelable.Creator creator3 = User.CREATOR;
                                1aC.A08(A0A, user3);
                            }
                        }
                        A0A.A0Y();
                    }
                    A0A.A0Z();
                }
                String str57 = r7.A0D;
                if (str57 != null) {
                    A0A.A0R("override_profile_pic_icon_type", str57);
                }
                1Xj r12 = r7.A01;
                if (r12 != null) {
                    A0A.A0q("media_dict");
                    1Xv r03 = 1Xj.A0h;
                    1Xv.A07(A0A, r12);
                }
                A0A.A0Z();
            }
            ImageUrl imageUrl7 = r2.A01;
            if (imageUrl7 != null) {
                A0A.A0q("icon_url");
                16h.A01(A0A, imageUrl7);
            }
            PrivateReplyStatus privateReplyStatus = r2.A00;
            if (privateReplyStatus != null) {
                A0A.A0R("private_reply_status", privateReplyStatus.A00);
            }
            if (r2.A02 != null) {
                A0A.A0q("hashtag_follow");
                C279594yt.A00(A0A, r2.A02);
            }
            Integer num = r2.A05;
            if (num != null) {
                A0A.A0P("request_count", num.intValue());
            }
            Boolean bool14 = r2.A04;
            if (bool14 != null) {
                A0A.A0S("has_liked_comment", bool14.booleanValue());
            }
            String str58 = r2.A06;
            if (str58 != null) {
                A0A.A0R("reply_comment_id", str58);
            }
            Boolean bool15 = r2.A03;
            if (bool15 != null) {
                A0A.A0S("clicked", bool15.booleanValue());
            }
            C376509Ig r72 = r2.A07;
            if (r72 != null) {
                A0A.A0q("logging_context");
                A0A.A0c();
                Number number2 = (Number) r72.A02;
                if (number2 != null) {
                    A0A.A0Q("content_id", number2.longValue());
                }
                List<Number> list12 = (List) r72.A04;
                if (list12 != null) {
                    16P.A03(A0A, "mentioned_user_ids");
                    for (Number number3 : list12) {
                        if (number3 != null) {
                            A0A.A0h(number3.longValue());
                        }
                    }
                    A0A.A0Y();
                }
                List<Number> list13 = (List) r72.A03;
                if (list13 != null) {
                    16P.A03(A0A, "mentioned_content_ids");
                    for (Number number4 : list13) {
                        if (number4 != null) {
                            A0A.A0h(number4.longValue());
                        }
                    }
                    A0A.A0Y();
                }
                Number number5 = (Number) r72.A01;
                if (number5 != null) {
                    A0A.A0Q("ad_id", number5.longValue());
                }
                A0A.A0Z();
            }
            BBV bbv = r2.A0B;
            if (bbv != null) {
                A0A.A0q("highlight_config");
                A0A.A0c();
                String str59 = bbv.A00;
                if (str59 != null) {
                    A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str59);
                }
                A0A.A0Z();
            }
            Boolean bool16 = r2.A0L;
            if (bool16 != null) {
                A0A.A0S("eligible_for_text_app_quality_control", bool16.booleanValue());
            }
            BBV bbv2 = r2.A0C;
            if (bbv2 != null) {
                A0A.A0q("indicator_config");
                A0A.A0c();
                String str60 = bbv2.A00;
                if (str60 != null) {
                    A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str60);
                }
                A0A.A0Z();
            }
            AnonymousClass9J6 r22 = r2.A09;
            if (r22 != null) {
                A0A.A0q("thumbnail_icon_config");
                A0A.A0c();
                String str61 = r22.A01;
                if (str61 != null) {
                    A0A.A0R("tint", str61);
                }
                String str62 = r22.A00;
                if (str62 != null) {
                    A0A.A0R(AppStateModule.APP_STATE_BACKGROUND, str62);
                }
                A0A.A0Z();
            }
            A0A.A0Z();
        }
        if (r10.A01 != null) {
            A0A.A0q("survey");
            C49876FBa fBa = r10.A01;
            StringWriter stringWriter2 = new StringWriter();
            17W A0A2 = r4.A0A(stringWriter2);
            A0A2.A0c();
            A0A2.A0S("is_answered", fBa.A05);
            String str63 = fBa.A01;
            if (str63 != null) {
                A0A2.A0R("module_type", str63);
            }
            String str64 = fBa.A02;
            if (str64 != null) {
                A0A2.A0R("qp_id", str64);
            }
            if (fBa.A04 != null) {
                16P.A03(A0A2, "questions");
                for (F3R f3r : fBa.A04) {
                    if (f3r != null) {
                        A0A2.A0c();
                        String str65 = f3r.A02;
                        if (str65 != null) {
                            A0A2.A0R("module_type", str65);
                        }
                        String str66 = f3r.A01;
                        if (str66 != null) {
                            A0A2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str66);
                        }
                        String str67 = f3r.A03;
                        if (str67 != null) {
                            A0A2.A0R(DialogModule.KEY_TITLE, str67);
                        }
                        String str68 = f3r.A04;
                        if (str68 != null) {
                            A0A2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str68);
                        }
                        if (f3r.A05 != null) {
                            16P.A03(A0A2, "answers");
                            for (F36 f36 : f3r.A05) {
                                if (f36 != null) {
                                    A0A2.A0c();
                                    String str69 = f36.A01;
                                    if (str69 != null) {
                                        A0A2.A0R("text", str69);
                                    }
                                    String str70 = f36.A00;
                                    if (str70 != null) {
                                        A0A2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str70);
                                    }
                                    A0A2.A0Z();
                                }
                            }
                            A0A2.A0Y();
                        }
                        Boolean bool17 = f3r.A00;
                        if (bool17 != null) {
                            A0A2.A0S("isHidden", bool17.booleanValue());
                        }
                        A0A2.A0Z();
                    }
                }
                A0A2.A0Y();
            }
            String str71 = fBa.A03;
            if (str71 != null) {
                A0A2.A0R("tessa_survey_config_id", str71);
            }
            String str72 = fBa.A00;
            if (str72 != null) {
                A0A2.A0R("extra_data_token", str72);
            }
            A0A2.A0Z();
            A0A2.close();
            A0A.A0t(stringWriter2.toString());
        }
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }
}
