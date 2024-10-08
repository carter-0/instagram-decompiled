package X;

import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5Gn  reason: invalid class name and case insensitive filesystem */
public abstract class C283205Gn {
    public static C283165Gj parseFromJson(16F r79) {
        String str;
        String A1P;
        String str2;
        String A1P2;
        16F r14 = r79;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            Boolean bool = null;
            SimpleImageUrl simpleImageUrl = null;
            Boolean bool2 = null;
            Long l = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str14 = null;
            String str15 = null;
            SimpleImageUrl simpleImageUrl3 = null;
            ArrayList arrayList = null;
            String str16 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str17 = null;
            Long l2 = null;
            ArrayList arrayList4 = null;
            C376529Ii r17 = null;
            ArrayList arrayList5 = null;
            String str18 = null;
            String str19 = null;
            C61078JwG jwG = null;
            String str20 = null;
            C2801950r r3 = null;
            String str21 = null;
            Boolean bool3 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            String str22 = null;
            String str23 = null;
            Boolean bool4 = null;
            ArrayList arrayList8 = null;
            JV7 jv7 = null;
            String str24 = null;
            Boolean bool5 = null;
            ArrayList arrayList9 = null;
            Boolean bool6 = null;
            Long l3 = null;
            Long l4 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            C283175Gk r30 = null;
            SimpleImageUrl simpleImageUrl4 = null;
            PrivateReplyStatus privateReplyStatus = null;
            HashtagImpl hashtagImpl = null;
            Integer num = null;
            Boolean bool7 = null;
            String str28 = null;
            Boolean bool8 = null;
            C376509Ig r16 = null;
            BBV bbv = null;
            Boolean bool9 = null;
            BBV bbv2 = null;
            AnonymousClass9J6 r18 = null;
            while (r14.A1J() != 16L.A09) {
                String A0q = r14.A0q();
                r14.A1J();
                if ("reel_pk".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("annotation_title".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r14.A1P();
                    }
                } else if ("rich_text".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r14.A1P();
                    }
                } else if ("sub_text".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r14.A1P();
                    }
                } else if ("action_url".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r14.A1P();
                    }
                } else if ("icon_should_apply_filter".equals(A0q)) {
                    bool = Boolean.valueOf(r14.A0d());
                } else if ("second_icon_url".equals(A0q)) {
                    simpleImageUrl = 16h.A00(r14);
                } else if ("second_icon_should_apply_filter".equals(A0q)) {
                    bool2 = Boolean.valueOf(r14.A0d());
                } else if ("af_candidate_id".equals(A0q)) {
                    l = Long.valueOf(r14.A0y());
                } else if ("content_version_id".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r14.A1P();
                    }
                } else if ("aggregation_type".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r14.A1P();
                    }
                } else if ("profile_id".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r14.A1P();
                    }
                } else if ("second_profile_id".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r14.A1P();
                    }
                } else if ("profile_image".equals(A0q)) {
                    simpleImageUrl2 = 16h.A00(r14);
                } else if ("profile_image_destination".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r14.A1P();
                    }
                } else if ("profile_name".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r14.A1P();
                    }
                } else if ("second_profile_image".equals(A0q)) {
                    simpleImageUrl3 = 16h.A00(r14);
                } else if ("mentioned_users".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            Long valueOf = Long.valueOf(r14.A0y());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("profile_context".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r14.A1P();
                    }
                } else if ("media".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            C376649Iu parseFromJson = C290015ec.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("images".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            C376649Iu parseFromJson2 = C290025ed.parseFromJson(r14);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("timestamp".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str17 = null;
                    } else {
                        str17 = r14.A1P();
                    }
                } else if ("latest_reel_media".equals(A0q)) {
                    l2 = Long.valueOf(r14.A0y());
                } else if ("story_reel_media_ids".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            if (!(r14.A11() == 16L.A0G || (A1P2 = r14.A1P()) == null)) {
                                arrayList4.add(A1P2);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("inline_follow".equals(A0q)) {
                    r17 = C290005eb.parseFromJson(r14);
                } else if ("links".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList5 = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            C47156DrX parseFromJson3 = C48998Ena.parseFromJson(r14);
                            if (parseFromJson3 != null) {
                                arrayList5.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str18 = null;
                    } else {
                        str18 = r14.A1P();
                    }
                } else if ("destination".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str19 = null;
                    } else {
                        str19 = r14.A1P();
                    }
                } else if ("friendship_status".equals(A0q)) {
                    jwG = B7I.parseFromJson(r14);
                } else if ("media_destination".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str20 = null;
                    } else {
                        str20 = r14.A1P();
                    }
                } else if ("media_clips_creation_type".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                    r3 = (C2801950r) C2801950r.A01.get(str2);
                    if (r3 == null) {
                        r3 = C2801950r.CLIPS;
                    }
                } else if ("comment_id".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str21 = null;
                    } else {
                        str21 = r14.A1P();
                    }
                } else if ("comments_disabled".equals(A0q)) {
                    bool3 = Boolean.valueOf(r14.A0d());
                } else if ("actions".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList6 = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            if (!(r14.A11() == 16L.A0G || (A1P = r14.A1P()) == null)) {
                                arrayList6.add(A1P);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                } else if ("inline_controls".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList7 = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            AnonymousClass9JH parseFromJson4 = C283215Go.parseFromJson(r14);
                            if (parseFromJson4 != null) {
                                arrayList7.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                } else if ("tuuid".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str22 = null;
                    } else {
                        str22 = r14.A1P();
                    }
                } else if ("canvas_id".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str23 = null;
                    } else {
                        str23 = r14.A1P();
                    }
                } else if ("is_story".equals(A0q)) {
                    bool4 = Boolean.valueOf(r14.A0d());
                } else if ("poll_options".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList8 = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            N4G parseFromJson5 = O1L.parseFromJson(r14);
                            if (parseFromJson5 != null) {
                                arrayList8.add(parseFromJson5);
                            }
                        }
                    } else {
                        arrayList8 = null;
                    }
                } else if ("action_button".equals(A0q)) {
                    jv7 = C49016Ens.parseFromJson(r14);
                } else if ("comment_text".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str24 = null;
                    } else {
                        str24 = r14.A1P();
                    }
                } else if ("is_comment_eligible_for_vcr".equals(A0q)) {
                    bool5 = Boolean.valueOf(r14.A0d());
                } else if ("users".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList9 = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = 1aC.A00(r14, false);
                            if (A00 != null) {
                                arrayList9.add(A00);
                            }
                        }
                    } else {
                        arrayList9 = null;
                    }
                } else if ("display_ufi".equals(A0q)) {
                    bool6 = Boolean.valueOf(r14.A0d());
                } else if ("aymt_notif_id".equals(A0q)) {
                    l3 = Long.valueOf(r14.A0y());
                } else if ("aymt_channel_id".equals(A0q)) {
                    l4 = Long.valueOf(r14.A0y());
                } else if ("aymt_notif_type".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str25 = null;
                    } else {
                        str25 = r14.A1P();
                    }
                } else if ("req_fbid".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str26 = null;
                    } else {
                        str26 = r14.A1P();
                    }
                } else if ("preview_url".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str27 = null;
                    } else {
                        str27 = r14.A1P();
                    }
                } else if ("extra".equals(A0q)) {
                    r30 = C46541Dgi.parseFromJson(r14);
                } else if ("icon_url".equals(A0q)) {
                    simpleImageUrl4 = 16h.A00(r14);
                } else if ("private_reply_status".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    privateReplyStatus = (PrivateReplyStatus) PrivateReplyStatus.A01.get(str);
                    if (privateReplyStatus == null) {
                        privateReplyStatus = PrivateReplyStatus.A07;
                    }
                } else if ("hashtag_follow".equals(A0q)) {
                    hashtagImpl = C279594yt.parseFromJson(r14);
                } else if ("request_count".equals(A0q)) {
                    num = Integer.valueOf(r14.A1D());
                } else if ("has_liked_comment".equals(A0q)) {
                    bool7 = Boolean.valueOf(r14.A0d());
                } else if ("reply_comment_id".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str28 = null;
                    } else {
                        str28 = r14.A1P();
                    }
                } else if ("clicked".equals(A0q)) {
                    bool8 = Boolean.valueOf(r14.A0d());
                } else if ("logging_context".equals(A0q)) {
                    r16 = C289995ea.parseFromJson(r14);
                } else if ("highlight_config".equals(A0q)) {
                    bbv = C67358Mma.parseFromJson(r14);
                } else if ("eligible_for_text_app_quality_control".equals(A0q)) {
                    bool9 = Boolean.valueOf(r14.A0d());
                } else if ("indicator_config".equals(A0q)) {
                    bbv2 = O1K.parseFromJson(r14);
                } else if ("thumbnail_icon_config".equals(A0q)) {
                    r18 = C3019060n.parseFromJson(r14);
                }
                r14.A0z();
            }
            return new C283165Gj(r16, r17, r18, jwG, bbv, bbv2, jv7, privateReplyStatus, simpleImageUrl, simpleImageUrl2, simpleImageUrl3, simpleImageUrl4, r3, hashtagImpl, r30, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, l, l2, l3, l4, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
