package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3uX  reason: invalid class name and case insensitive filesystem */
public abstract class C255673uX {
    public static void A00(17Z r2, MusicOverlayStickerModel musicOverlayStickerModel, boolean z) {
        if (z) {
            r2.A0c();
        }
        String str = musicOverlayStickerModel.A0Q;
        if (str != null) {
            r2.A0R("alacorn_session_id", str);
        }
        Boolean bool = musicOverlayStickerModel.A06;
        if (bool != null) {
            r2.A0S("allow_media_creation_with_music", bool.booleanValue());
        }
        r2.A0S("allows_saving", musicOverlayStickerModel.A0r);
        String str2 = musicOverlayStickerModel.A0R;
        if (str2 != null) {
            r2.A0R("artist_id", str2);
        }
        String str3 = musicOverlayStickerModel.A0S;
        if (str3 != null) {
            r2.A0R("audio_asset_id", str3);
        }
        Integer num = musicOverlayStickerModel.A0K;
        if (num != null) {
            r2.A0P("audio_asset_start_time_in_ms", num.intValue());
        }
        Integer num2 = musicOverlayStickerModel.A0L;
        if (num2 != null) {
            r2.A0P("audio_asset_suggested_start_time_in_ms", num2.intValue());
        }
        String str4 = musicOverlayStickerModel.A0T;
        if (str4 != null) {
            r2.A0R("audio_cluster_id", str4);
        }
        List<AudioFilterInfo> list = musicOverlayStickerModel.A0o;
        if (list != null) {
            16P.A03(r2, "audio_filter_infos");
            for (AudioFilterInfo audioFilterInfo : list) {
                if (audioFilterInfo != null) {
                    AAM.A00(r2, audioFilterInfo);
                }
            }
            r2.A0Y();
        }
        AudioMutingInfo audioMutingInfo = musicOverlayStickerModel.A00;
        if (audioMutingInfo != null) {
            r2.A0q("audio_muting_info");
            AnonymousClass3UT.A00(r2, audioMutingInfo);
        }
        String str5 = musicOverlayStickerModel.A0U;
        if (str5 != null) {
            r2.A0R("browse_session_id", str5);
        }
        Boolean bool2 = musicOverlayStickerModel.A07;
        if (bool2 != null) {
            r2.A0S("contains_lyrics", bool2.booleanValue());
        }
        ImageUrl imageUrl = musicOverlayStickerModel.A03;
        if (imageUrl != null) {
            r2.A0q("cover_artwork_thumbnail_uri");
            16h.A01(r2, imageUrl);
        }
        ImageUrl imageUrl2 = musicOverlayStickerModel.A04;
        if (imageUrl2 != null) {
            r2.A0q("cover_artwork_uri");
            16h.A01(r2, imageUrl2);
        }
        String str6 = musicOverlayStickerModel.A0V;
        if (str6 != null) {
            r2.A0R("dark_message", str6);
        }
        String str7 = musicOverlayStickerModel.A0W;
        if (str7 != null) {
            r2.A0R("dash_manifest", str7);
        }
        String str8 = musicOverlayStickerModel.A0X;
        if (str8 != null) {
            r2.A0R("derived_content_id", str8);
        }
        Integer num3 = musicOverlayStickerModel.A0M;
        if (num3 != null) {
            r2.A0P("derived_content_start_time_in_ms", num3.intValue());
        }
        String str9 = musicOverlayStickerModel.A0Y;
        if (str9 != null) {
            r2.A0R("display_artist", str9);
        }
        List<AudioMetadataLabels> list2 = musicOverlayStickerModel.A0p;
        if (list2 != null) {
            16P.A03(r2, "display_labels");
            for (AudioMetadataLabels audioMetadataLabels : list2) {
                if (audioMetadataLabels != null) {
                    r2.A0t(audioMetadataLabels.A00);
                }
            }
            r2.A0Y();
        }
        Integer num4 = musicOverlayStickerModel.A0N;
        if (num4 != null) {
            r2.A0P("duration_in_ms", num4.intValue());
        }
        String str10 = musicOverlayStickerModel.A0Z;
        if (str10 != null) {
            r2.A0R("fast_start_progressive_download_url", str10);
        }
        String str11 = musicOverlayStickerModel.A0a;
        if (str11 != null) {
            r2.A0R("formatted_clips_media_count", str11);
        }
        Boolean bool3 = musicOverlayStickerModel.A08;
        if (bool3 != null) {
            r2.A0S("has_lyrics", bool3.booleanValue());
        }
        Boolean bool4 = musicOverlayStickerModel.A09;
        if (bool4 != null) {
            r2.A0S("hide_remixing", bool4.booleanValue());
        }
        List<Number> list3 = musicOverlayStickerModel.A0q;
        if (list3 != null) {
            16P.A03(r2, "highlight_start_times_in_ms");
            for (Number number : list3) {
                if (number != null) {
                    r2.A0g(number.intValue());
                }
            }
            r2.A0Y();
        }
        String str12 = musicOverlayStickerModel.A0b;
        if (str12 != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str12);
        }
        User user = musicOverlayStickerModel.A05;
        if (user != null) {
            r2.A0q("ig_artist");
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r2, user);
        }
        String str13 = musicOverlayStickerModel.A0c;
        if (str13 != null) {
            r2.A0R("ig_username", str13);
        }
        Boolean bool5 = musicOverlayStickerModel.A0A;
        if (bool5 != null) {
            r2.A0S("is_bookmarked", bool5.booleanValue());
        }
        Boolean bool6 = musicOverlayStickerModel.A0B;
        if (bool6 != null) {
            r2.A0S("is_eligible_for_audio_effects", bool6.booleanValue());
        }
        Boolean bool7 = musicOverlayStickerModel.A0C;
        if (bool7 != null) {
            r2.A0S("is_eligible_for_vinyl_sticker", bool7.booleanValue());
        }
        r2.A0S("is_explicit", musicOverlayStickerModel.A0s);
        Boolean bool8 = musicOverlayStickerModel.A0D;
        if (bool8 != null) {
            r2.A0S("is_local_audio", bool8.booleanValue());
        }
        Boolean bool9 = musicOverlayStickerModel.A0E;
        if (bool9 != null) {
            r2.A0S("is_original_sound", bool9.booleanValue());
        }
        Boolean bool10 = musicOverlayStickerModel.A0F;
        if (bool10 != null) {
            r2.A0S("is_trending_in_clips", bool10.booleanValue());
        }
        String str14 = musicOverlayStickerModel.A0d;
        if (str14 != null) {
            r2.A0R("local_audio_file_path", str14);
        }
        MusicProduct musicProduct = musicOverlayStickerModel.A02;
        if (musicProduct != null) {
            r2.A0R("music_product", musicProduct.A00);
        }
        String str15 = musicOverlayStickerModel.A0e;
        if (str15 != null) {
            r2.A0R("original_media_id", str15);
        }
        Integer num5 = musicOverlayStickerModel.A0O;
        if (num5 != null) {
            r2.A0P("overlap_duration_in_ms", num5.intValue());
        }
        Boolean bool11 = musicOverlayStickerModel.A0G;
        if (bool11 != null) {
            r2.A0S("picked_in_post_capture", bool11.booleanValue());
        }
        String str16 = musicOverlayStickerModel.A0f;
        if (str16 != null) {
            r2.A0R("placeholder_profile_pic_url", str16);
        }
        String str17 = musicOverlayStickerModel.A0g;
        if (str17 != null) {
            r2.A0R("progressive_download_url", str17);
        }
        String str18 = musicOverlayStickerModel.A0h;
        if (str18 != null) {
            r2.A0R("reactive_audio_download_url", str18);
        }
        String str19 = musicOverlayStickerModel.A0i;
        if (str19 != null) {
            r2.A0R("sanitized_title", str19);
        }
        Boolean bool12 = musicOverlayStickerModel.A0H;
        if (bool12 != null) {
            r2.A0S("should_allow_music_editing", bool12.booleanValue());
        }
        r2.A0S("should_mute_audio", musicOverlayStickerModel.A0t);
        String str20 = musicOverlayStickerModel.A0j;
        if (str20 != null) {
            r2.A0R("should_mute_audio_reason", str20);
        }
        MusicMuteAudioReason musicMuteAudioReason = musicOverlayStickerModel.A01;
        if (musicMuteAudioReason != null) {
            r2.A0R("should_mute_audio_reason_type", musicMuteAudioReason.A00);
        }
        Boolean bool13 = musicOverlayStickerModel.A0I;
        if (bool13 != null) {
            r2.A0S("should_render_soundwave", bool13.booleanValue());
        }
        Boolean bool14 = musicOverlayStickerModel.A0J;
        if (bool14 != null) {
            r2.A0S("should_skip_attribution", bool14.booleanValue());
        }
        String str21 = musicOverlayStickerModel.A0k;
        if (str21 != null) {
            r2.A0R("subtitle", str21);
        }
        String str22 = musicOverlayStickerModel.A0l;
        if (str22 != null) {
            r2.A0R("tag", str22);
        }
        String str23 = musicOverlayStickerModel.A0m;
        if (str23 != null) {
            r2.A0R(DialogModule.KEY_TITLE, str23);
        }
        Integer num6 = musicOverlayStickerModel.A0P;
        if (num6 != null) {
            r2.A0P("trend_rank", num6.intValue());
        }
        String str24 = musicOverlayStickerModel.A0n;
        if (str24 != null) {
            r2.A0R("web_30s_preview_download_url", str24);
        }
        if (z) {
            r2.A0Z();
        }
    }

    public static MusicOverlayStickerModel parseFromJson(16F r74) {
        String str;
        String str2;
        String str3;
        16F r1 = r74;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str4 = null;
            Boolean bool3 = null;
            String str5 = null;
            String str6 = null;
            Integer num = null;
            Integer num2 = null;
            String str7 = null;
            ArrayList arrayList = null;
            AudioMutingInfo audioMutingInfo = null;
            String str8 = null;
            Boolean bool4 = null;
            SimpleImageUrl simpleImageUrl = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            Integer num3 = null;
            String str12 = null;
            ArrayList arrayList2 = null;
            Integer num4 = null;
            String str13 = null;
            String str14 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            ArrayList arrayList3 = null;
            String str15 = null;
            User user = null;
            String str16 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            String str17 = null;
            MusicProduct musicProduct = null;
            String str18 = null;
            Integer num5 = null;
            Boolean bool13 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            String str23 = null;
            MusicMuteAudioReason musicMuteAudioReason = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            Integer num6 = null;
            String str27 = null;
            while (r1.A1J() != 16L.A09) {
                String A0q = r1.A0q();
                r1.A1J();
                if ("alacorn_session_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("allow_media_creation_with_music".equals(A0q)) {
                    bool3 = Boolean.valueOf(r1.A0d());
                } else if ("allows_saving".equals(A0q)) {
                    bool = Boolean.valueOf(r1.A0d());
                } else if ("artist_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("audio_asset_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("audio_asset_start_time_in_ms".equals(A0q)) {
                    num = Integer.valueOf(r1.A1D());
                } else if ("audio_asset_suggested_start_time_in_ms".equals(A0q)) {
                    num2 = Integer.valueOf(r1.A1D());
                } else if ("audio_cluster_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if ("audio_filter_infos".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            AudioFilterInfo parseFromJson = AAM.parseFromJson(r1);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("audio_muting_info".equals(A0q)) {
                    audioMutingInfo = AnonymousClass3UT.parseFromJson(r1);
                } else if ("browse_session_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if ("contains_lyrics".equals(A0q)) {
                    bool4 = Boolean.valueOf(r1.A0d());
                } else if ("cover_artwork_thumbnail_uri".equals(A0q)) {
                    simpleImageUrl = 16h.A00(r1);
                } else if ("cover_artwork_uri".equals(A0q)) {
                    simpleImageUrl2 = 16h.A00(r1);
                } else if ("dark_message".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if ("dash_manifest".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                } else if ("derived_content_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r1.A1P();
                    }
                } else if ("derived_content_start_time_in_ms".equals(A0q)) {
                    num3 = Integer.valueOf(r1.A1D());
                } else if ("display_artist".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r1.A1P();
                    }
                } else if ("display_labels".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            if (r1.A11() == 16L.A0G) {
                                str3 = null;
                            } else {
                                str3 = r1.A1P();
                            }
                            arrayList2.add(C272264kP.A00(str3));
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("duration_in_ms".equals(A0q)) {
                    num4 = Integer.valueOf(r1.A1D());
                } else if ("fast_start_progressive_download_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r1.A1P();
                    }
                } else if ("formatted_clips_media_count".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r1.A1P();
                    }
                } else if ("has_lyrics".equals(A0q)) {
                    bool5 = Boolean.valueOf(r1.A0d());
                } else if ("hide_remixing".equals(A0q)) {
                    bool6 = Boolean.valueOf(r1.A0d());
                } else if ("highlight_start_times_in_ms".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            Integer valueOf = Integer.valueOf(r1.A1D());
                            if (valueOf != null) {
                                arrayList3.add(valueOf);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r1.A1P();
                    }
                } else if ("ig_artist".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r1, false);
                } else if ("ig_username".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r1.A1P();
                    }
                } else if ("is_bookmarked".equals(A0q)) {
                    bool7 = Boolean.valueOf(r1.A0d());
                } else if ("is_eligible_for_audio_effects".equals(A0q)) {
                    bool8 = Boolean.valueOf(r1.A0d());
                } else if ("is_eligible_for_vinyl_sticker".equals(A0q)) {
                    bool9 = Boolean.valueOf(r1.A0d());
                } else if ("is_explicit".equals(A0q)) {
                    bool2 = Boolean.valueOf(r1.A0d());
                } else if ("is_local_audio".equals(A0q)) {
                    bool10 = Boolean.valueOf(r1.A0d());
                } else if ("is_original_sound".equals(A0q)) {
                    bool11 = Boolean.valueOf(r1.A0d());
                } else if ("is_trending_in_clips".equals(A0q)) {
                    bool12 = Boolean.valueOf(r1.A0d());
                } else if ("local_audio_file_path".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str17 = null;
                    } else {
                        str17 = r1.A1P();
                    }
                } else if ("music_product".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                    musicProduct = (MusicProduct) MusicProduct.A01.get(str2);
                    if (musicProduct == null) {
                        musicProduct = MusicProduct.UNRECOGNIZED;
                    }
                } else if ("original_media_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str18 = null;
                    } else {
                        str18 = r1.A1P();
                    }
                } else if ("overlap_duration_in_ms".equals(A0q)) {
                    num5 = Integer.valueOf(r1.A1D());
                } else if ("picked_in_post_capture".equals(A0q)) {
                    bool13 = Boolean.valueOf(r1.A0d());
                } else if ("placeholder_profile_pic_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str19 = null;
                    } else {
                        str19 = r1.A1P();
                    }
                } else if ("progressive_download_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str20 = null;
                    } else {
                        str20 = r1.A1P();
                    }
                } else if ("reactive_audio_download_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str21 = null;
                    } else {
                        str21 = r1.A1P();
                    }
                } else if ("sanitized_title".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str22 = null;
                    } else {
                        str22 = r1.A1P();
                    }
                } else if ("should_allow_music_editing".equals(A0q)) {
                    bool14 = Boolean.valueOf(r1.A0d());
                } else if ("should_mute_audio".equals(A0q)) {
                    bool15 = Boolean.valueOf(r1.A0d());
                } else if ("should_mute_audio_reason".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str23 = null;
                    } else {
                        str23 = r1.A1P();
                    }
                } else if ("should_mute_audio_reason_type".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                    musicMuteAudioReason = 1sE.A00(str);
                } else if ("should_render_soundwave".equals(A0q)) {
                    bool16 = Boolean.valueOf(r1.A0d());
                } else if ("should_skip_attribution".equals(A0q)) {
                    bool17 = Boolean.valueOf(r1.A0d());
                } else if ("subtitle".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str24 = null;
                    } else {
                        str24 = r1.A1P();
                    }
                } else if ("tag".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str25 = null;
                    } else {
                        str25 = r1.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str26 = null;
                    } else {
                        str26 = r1.A1P();
                    }
                } else if ("trend_rank".equals(A0q)) {
                    num6 = Integer.valueOf(r1.A1D());
                } else if ("web_30s_preview_download_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str27 = null;
                    } else {
                        str27 = r1.A1P();
                    }
                }
                r1.A0z();
            }
            if (bool == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("allows_saving", "MusicOverlayStickerModel");
            } else if (simpleImageUrl2 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("cover_artwork_uri", "MusicOverlayStickerModel");
            } else if (str15 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "MusicOverlayStickerModel");
            } else if (bool2 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("is_explicit", "MusicOverlayStickerModel");
            } else if (str19 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("placeholder_profile_pic_url", "MusicOverlayStickerModel");
            } else if (bool15 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("should_mute_audio", "MusicOverlayStickerModel");
            } else if (str23 != null || !(r1 instanceof 0c9)) {
                return new MusicOverlayStickerModel(audioMutingInfo, musicMuteAudioReason, musicProduct, simpleImageUrl, simpleImageUrl2, user, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool16, bool17, num, num2, num3, num4, num5, num6, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, arrayList, arrayList2, arrayList3, bool.booleanValue(), bool2.booleanValue(), bool15.booleanValue());
            } else {
                ((0c9) r1).A03.A00("should_mute_audio_reason", "MusicOverlayStickerModel");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
